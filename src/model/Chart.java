/**
 * 
 */
package model;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * @author Robert
 * 
 */
public abstract class Chart extends View {
    protected Paint paint;
    protected ArrayList<Integer> values = new ArrayList<Integer>();
    protected int width;
    protected int height;
    protected int colors[] = { Color.RED, Color.BLUE, Color.CYAN, Color.GREEN, Color.MAGENTA, Color.YELLOW,
	    Color.LTGRAY };

    public Chart(Context context, ArrayList<Integer> values) {
	super(context);
	paint = new Paint();
	this.values = values;
    }

    public abstract void draw(Canvas canvas);

    protected abstract float getTotal();
}
