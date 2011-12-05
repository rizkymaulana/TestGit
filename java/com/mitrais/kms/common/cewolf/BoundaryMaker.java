/*
 * @(#) $Header: /cvsrepos/mmsv50/mmsv50/src/java/com/mitrais/kms/common/cewolf/BoundaryMaker.java,v 1.2 2011/11/11 06:55:40 rizky_n Exp $
 *
 * BoundaryMaker.java
 *
 * Copyright (c) 2004, PT. Mitrais, Kuta, Bali, Indonesia
 * All rights reserved.
 *
 */
package com.mitrais.kms.common.cewolf;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;

import de.laures.cewolf.ChartPostProcessor;

public class BoundaryMaker implements ChartPostProcessor, Serializable
{
	private Map parameter;
	
    public void processChart(java.lang.Object chart, java.util.Map params) {
        JFreeChart jchart = (JFreeChart)chart;
        CategoryPlot plot = jchart.getCategoryPlot();
        CategoryAxis xAxis = (CategoryAxis)plot.getDomainAxis();        
        CategoryGraph xGraph = new CategoryGraph();
        try {
			BeanUtils.copyProperties(xGraph, xAxis);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
        plot.setDomainAxis(xGraph);
        ValueAxis axis = plot.getRangeAxis();
        
        xGraph.setCategoryLabelPositions(CategoryLabelPositions.UP_45);        

        double lowerBound = Double.parseDouble((String)params.get("lowerBound"));
        double upperBound = Double.parseDouble((String)params.get("upperBound"));

        axis.setRange(lowerBound, upperBound);
    }
    
	public Map getParameter() {
		return parameter;
	}
	public void setParameter(Map parameter) {
		this.parameter = parameter;
	}
}