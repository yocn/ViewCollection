package yocn.com.collection;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity implements OnClickListener {

    private Button bt_cv;
    private Button bt_ripple;
    private Button bt_bcv;
    private Button bt_parabola;
    private Button bt_path;
    private Button bt_recycle_view;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new ArrayList<String>();
        new ArrayList<String>(0);
        bt_ripple = (Button) findViewById(R.id.bt_ripple);
        bt_cv = (Button) findViewById(R.id.bt_cv);
        bt_bcv = (Button) findViewById(R.id.bt_bcv);
        bt_parabola = (Button) findViewById(R.id.bt_parabola);
        bt_path = (Button) findViewById(R.id.bt_path);
        bt_recycle_view = (Button) findViewById(R.id.bt_recycle_view);
        bt_ripple.setOnClickListener(this);
        bt_cv.setOnClickListener(this);
        bt_bcv.setOnClickListener(this);
        bt_parabola.setOnClickListener(this);
        bt_path.setOnClickListener(this);
        bt_recycle_view.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
        case R.id.bt_ripple:
            Intent i0 = new Intent(MainActivity.this, RippleViewActivity.class);
            startActivity(i0);
            break;
        case R.id.bt_cv:
            Intent i1 = new Intent(MainActivity.this, ChartViewAct.class);
            startActivity(i1);
            break;
        case R.id.bt_bcv:
            Intent i2 = new Intent(MainActivity.this, BarChartViewAct.class);
            startActivity(i2);
            break;
        case R.id.bt_parabola:
            Intent i3 = new Intent(MainActivity.this, ParabolaViewAct.class);
            startActivity(i3);
            break;
        case R.id.bt_path:
            Intent i4 = new Intent(MainActivity.this, PathActivity.class);
            startActivity(i4);
            break;
        case R.id.bt_recycle_view:
            Intent i5 = new Intent(MainActivity.this, RecycleViewAct.class);
            startActivity(i5);
            break;
        }
    }

}
