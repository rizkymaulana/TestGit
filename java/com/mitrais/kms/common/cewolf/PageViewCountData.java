/*
 * @(#) $Header: /cvsrepos/mmsv50/mmsv50/src/java/com/mitrais/kms/common/cewolf/PageViewCountData.java,v 1.2 2011/11/11 06:55:40 rizky_n Exp $
 *
 * PageViewCoundData.java
 *
 * Copyright (c) 2004, PT. Mitrais, Kuta, Bali, Indonesia
 * All rights reserved.
 *
 */
package com.mitrais.kms.common.cewolf;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;


import de.laures.cewolf.links.CategoryItemLinkGenerator;
import de.laures.cewolf.DatasetProduceException;
import de.laures.cewolf.DatasetProducer;
import de.laures.cewolf.tooltips.CategoryToolTipGenerator;

public class PageViewCountData implements DatasetProducer, CategoryItemLinkGenerator,
        CategoryToolTipGenerator, Serializable {

	private Log logger = LogFactory.getLog(getClass());
	
    // These values would normally not be hard coded but produced by
    // some kind of data source like a database or a file
    private DefaultCategoryDataset data = null;
    private ArrayList arrCategories = null;
    private ArrayList arrSeriesNames = null;
    private ArrayList arrValues = null;
    private ArrayList arrLinks = null;
    private DecimalFormat df = new DecimalFormat("#.#");
    private String xlabel;    
    private String ylabel;
    private String title;
    private String signType;
    private BoundaryMaker boundary;

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public PageViewCountData() {
    }

    public synchronized Object produceDataset(Map params) throws DatasetProduceException {
        try{
            if(arrCategories==null || arrCategories.size()==0){
                throw new DatasetProduceException("No dates/times is provided");
            }
            if(arrSeriesNames==null || arrSeriesNames.size()==0){
                throw new DatasetProduceException("No chart identifier is provided");
            }
            if(arrValues==null || arrValues.size()==0){
                throw new DatasetProduceException("No value is provided");
            }
            if(arrValues.size()!=arrSeriesNames.size()){
                throw new DatasetProduceException("Unmatch amount of chart identifier");
            }
            ArrayList arrTemp = null;
            for(Iterator it = arrValues.iterator();it.hasNext();){
                arrTemp = (ArrayList)it.next();
                if(arrTemp.size()!=arrCategories.size()){
                    throw new DatasetProduceException("Unmatch amount of values");
                }
            }

            String[] categories = new String[arrCategories.size()];
            String[] seriesNames = new String[arrSeriesNames.size()];
            Double[] [] values = new Double[seriesNames.length] [categories.length];
            String strTemp = "";

            for(int i=0;i<arrCategories.size();i++){
                strTemp = (String)arrCategories.get(i);
                categories[i] = strTemp;
            }
            for(int i=0;i<arrSeriesNames.size();i++){
                strTemp = (String)arrSeriesNames.get(i);
                seriesNames[i] = strTemp;
            }
            for(int i=0;i<arrSeriesNames.size();i++){
                for(int j=0;j<arrCategories.size();j++){
                    strTemp = (String)(((ArrayList)arrValues.get(i)).get(j));
                    logger.info("strTemp == " + strTemp);
                    values[i][j] = new Double(strTemp);
                }
            }

            //data = new DefaultCategoryDataset(seriesNames, categories, values);
            data = new DefaultCategoryDataset();
                        
            for(int i=0; i<seriesNames.length; i++) {
            	for(int j=0; j<categories.length; j++) {              
            		data.addValue(((Double) values[i][j]).doubleValue(), seriesNames[i], categories[j]);
            	}
            }      

            return data;
        }
        catch(DatasetProduceException e){
            e.printStackTrace();
            throw e;
        }
        catch(Exception e){
            e.printStackTrace();
            throw new DatasetProduceException(e.getMessage());
        }
    }

    public String generateLink(Object data, int series, Object category) {
        int index = this.arrCategories.indexOf(category);
        if(index!=-1){
            return (String)arrLinks.get(index);
        }
        else{
            return "#";
        }
    }

    public String generateToolTip(CategoryDataset data, int series, Object category) {
        try{
            return (String)arrSeriesNames.get(series) + " " + (String)category +
                    " = ";// + df.format(data.getValue(series,category));
        }
        catch(Exception e){
            return "";
        }
    }

    public void setCategories(ArrayList arr) {
        this.arrCategories = arr;
    }

    public void setSeriesNames(ArrayList arr) {
        this.arrSeriesNames = arr;
    }

    public void setValues(ArrayList arr) {
        this.arrValues = arr;
    }

    public void setLinks(ArrayList arr) {
        this.arrLinks = arr;
    }

    public void clearData() {
        this.data = null;
        this.arrCategories = null;
        this.arrSeriesNames = null;
        this.arrValues = null;
    }

	/* (non-Javadoc)
	 * @see org.jfree.chart.tooltips.CategoryToolTipGenerator#generateToolTip(org.jfree.data.CategoryDataset, int, int)
	 */
	public String generateToolTip(CategoryDataset arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		StringBuffer bf = new StringBuffer();
		bf.append(arrCategories.get(arg2));
		bf.append("\n");
		bf.append(arrSeriesNames.get(arg1));
		bf.append(" : ");
		bf.append(((ArrayList) arrValues.get(arg1)).get(arg2));
		bf.append(" ");
		bf.append(ylabel);
		return  bf.toString();
	}

	/* (non-Javadoc)
	 * @see de.laures.cewolf.DatasetProducer#hasExpired(java.util.Map, java.util.Date)
	 */
	public boolean hasExpired(Map arg0, Date arg1) {
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see de.laures.cewolf.DatasetProducer#getProducerId()
	 */
	public String getProducerId() {
		// TODO Auto-generated method stub
		return null;
	}
    public String getYlabel() {
        return ylabel;
    }

    public void setYlabel(String ylabel) {
        this.ylabel = ylabel;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getXlabel() {
        return xlabel;
    }

    public void setXlabel(String xlabel) {
        this.xlabel = xlabel;
    }

	public BoundaryMaker getBoundary() {
		return boundary;
	}

	public void setBoundary(BoundaryMaker boundary) {
		this.boundary = boundary;
	}
}