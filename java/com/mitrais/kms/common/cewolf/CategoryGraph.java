package com.mitrais.kms.common.cewolf;

import java.awt.Graphics2D;

import org.jfree.chart.axis.CategoryAxis;
import org.jfree.text.G2TextMeasurer;
import org.jfree.text.TextBlock;
import org.jfree.text.TextUtilities;
import org.jfree.ui.RectangleEdge;

import com.mitrais.kms.util.DateUtil;

public class CategoryGraph extends CategoryAxis {
	
	public CategoryGraph(){
		
	}
	
	@Override
	protected TextBlock createLabel(Comparable category, float width,
            RectangleEdge edge, Graphics2D g2) {
		String categoryLabel = "";
		categoryLabel = DateUtil.formatStringDateWithoutTimeToStrDateSearchFormat(category.toString());
		
        TextBlock label = TextUtilities.createTextBlock(categoryLabel, getTickLabelFont(category),
                getTickLabelPaint(category), width,
                this.getMaximumCategoryLabelLines(), new G2TextMeasurer(g2));
        return label;
    }
}
