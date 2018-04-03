package com.nova.samplecanvasdraw;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_animation_canvas_test);
        setContentView(new MyView(this));
    }

    public class MyView extends View {
        private Bitmap image1, image2, image3;

        public MyView(Context context) {
            super(context);
            setBackgroundColor(Color.LTGRAY);

            Resources r = context.getResources();
            image1 = BitmapFactory.decodeResource(r, R.drawable.life);
            image2 = BitmapFactory.decodeResource(r, R.drawable.load);
            image3 = BitmapFactory.decodeResource(r, R.drawable.modoru);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawBitmap(image1, 0, 0, null);

            int w = image2.getWidth();
            int h = image2.getHeight();
            //Rect src = new Rect(0, 0, w, h);
            Rect dst = new Rect(400, 800, 400 + w / 2, 800 + h / 2);
            canvas.drawBitmap(image2, null, dst, null);

            w = image3.getWidth();
            h = image3.getHeight();
            //src = new Rect(0, 0, w, h);
            dst = new Rect(400, 1200, 400 + w / 2, 1200 + h / 2);
            canvas.drawBitmap(image3, null, dst, null);

            super.onDraw(canvas);
        }
    }
/*
 @Override
 public boolean onCreateOptionsMenu(Menu menu) {
  // Inflate the menu; this adds items to the action bar if it is present.
  getMenuInflater().inflate(R.menu.animation_canvas_test, menu);
  return true;
 }

 @Override
 public boolean onOptionsItemSelected(MenuItem item) {
  // Handle action bar item clicks here. The action bar will
  // automatically handle clicks on the Home/Up button, so long
  // as you specify a parent activity in AndroidManifest.xml.
  int id = item.getItemId();
  if (id == R.id.action_settings) {
   return true;
  }
  return super.onOptionsItemSelected(item);
 }
*/
}


