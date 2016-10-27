package me.xudaojie.frescozoomable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;

import me.xudaojie.frecozoomable.ZoomableDraweeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ZoomableDraweeView draweeView = (ZoomableDraweeView) findViewById(R.id.zoomable_view);
        draweeView.setAllowTouchInterceptionWhileZoomed(true);
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri("http://ww2.sinaimg.cn/mw690/8f1fe6aajw1f5gtp60m71j216o1kwq7p.jpg")
                .build();
        draweeView.setController(controller);
    }
}
