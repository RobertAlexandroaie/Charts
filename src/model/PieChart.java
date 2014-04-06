/**
 * 
 */
package model;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint.Style;
import android.graphics.RectF;

/**
 * @author Robert
 * 
 */
public class PieChart extends Chart {

    public PieChart(Context context, ArrayList<Integer> data) {
	super(context, data);
	// TODO Auto-generated constructor stub
    }

    @Override
    public void draw(Canvas canvas) {
	int x = getWidth();
	int y = getHeight();

	paint.setColor(Color.parseColor("#123456"));
	paint.setStyle(Style.STROKE);
	paint.setStyle(Style.FILL);

	int valuesCount = values.size();
	float total = getTotal();
	float curPos = 0;

	canvas.drawRect(0, 140, x - 1, y - 1, paint);
	RectF rectangle = new RectF(20, 180, x - 20, y - 20);
	for (int i = 0; i < valuesCount; i++) {
	    paint.setColor(colors[i]);
	    float thita = (total == 0) ? 0 : 360 * values.get(i) / total;
	    canvas.drawArc(rectangle, curPos, thita, true, paint);
	    curPos = curPos + thita;
	}
    }

    protected float getTotal() {
	int total = 0;
	for (int i = 0; i < values.size(); i++) {
	    total = total + values.get(i);
	}
	return total;
    }
}
