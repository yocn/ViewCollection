package yocn.com.collection;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.util.ArrayList;

import yocn.com.collection.adapter.MainAdapter;
import yocn.com.collection.utils.CustomItemAnimator;
import yocn.com.collection.utils.ListBean;

public class MainActivity extends ActionBarActivity implements OnClickListener {

    private RecyclerView rv_item;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<ListBean> mListBeanList;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_item = (RecyclerView) findViewById(R.id.rv_item);
        mLayoutManager = new LinearLayoutManager(this);
        rv_item.setLayoutManager(mLayoutManager);
        rv_item.setItemAnimator(new CustomItemAnimator());

        mListBeanList = new ArrayList<>();
        mListBeanList.add(new ListBean("RippleView", RippleViewActivity.class));
        mListBeanList.add(new ListBean("ChartView", ChartViewAct.class));
        mListBeanList.add(new ListBean("BarChartView", BarChartViewAct.class));
        mListBeanList.add(new ListBean("ParabolaView", ParabolaViewAct.class));
        mListBeanList.add(new ListBean("Path", PathActivity.class));
        mListBeanList.add(new ListBean("RecycleView", RecycleViewAct.class));

        MainAdapter adapter = new MainAdapter(this, mListBeanList);
        adapter.setData(mListBeanList);
        rv_item.setAdapter(adapter);
        init();
    }

    private void init() {
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
//        mToolbar.setLogo(R.drawable.ic_launcher);
        mToolbar.setTitle("Simple");// 标题的文字需在setSupportActionBar之前，不然会无效
// toolbar.setSubtitle("副标题");
        setSupportActionBar(mToolbar);
/* 这些通过ActionBar来设置也是一样的，注意要在setSupportActionBar(toolbar);之后，不然就报错了 */
        getSupportActionBar().setTitle("Simple");
        getSupportActionBar().setSubtitle("Simple");
//        getSupportActionBar().setLogo(R.drawable.ic_launcher);

/* 菜单的监听可以在toolbar里设置，也可以像ActionBar那样，通过Activity的onOptionsItemSelected回调方法来处理 */
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_settings:
                        Toast.makeText(MainActivity.this, "action_settings", Toast.LENGTH_SHORT).show();
                        break;
//                    case R.id.action_share:
//                        Toast.makeText(ParabolaViewAct.this, "action_share", Toast.LENGTH_SHORT).show();
//                        break;
                    default:
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
        }

    }

}
