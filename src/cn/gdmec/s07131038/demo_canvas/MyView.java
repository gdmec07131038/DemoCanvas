package cn.gdmec.s07131038.demo_canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View{

	public MyView(Context context) {
		super(context);
	}
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
		canvas.drawColor(Color.GRAY);
		
		Paint paint=new Paint();
		paint.setColor(Color.BLUE);
		
		canvas.drawCircle(100, 100, 50, paint);
		
		paint.setColor(Color.RED);
		paint.setStrokeWidth(10);
		canvas.drawRect(200,200,300,300, paint);
		
		paint.setTextSize(40);
		paint.setColor(Color.GREEN);
		canvas.drawText("hello world", 200, 350, paint);
		
	}

}
