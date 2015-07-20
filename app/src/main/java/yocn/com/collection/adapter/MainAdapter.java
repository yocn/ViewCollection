package yocn.com.collection.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import yocn.com.collection.R;
import yocn.com.collection.utils.ListBean;

/**
 * Created by JD on 2015/7/17.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private ArrayList<ListBean> mListBeanList = new ArrayList<>();
    private Context mContext;

    public MainAdapter(Context context) {
        mContext = context;
    }

    public MainAdapter(Context context, ArrayList<ListBean> mListBeanList) {
        this.mListBeanList = mListBeanList;
        mContext = context;
    }

    public void setData(ArrayList<ListBean> mListBeanList) {
        this.mListBeanList = mListBeanList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_main, viewGroup, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int i) {
        viewHolder.mTextView.setText(mListBeanList.get(i).getName());
        final ListBean listBean = mListBeanList.get(i);
        viewHolder.mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, listBean.getActivity());
                mContext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mListBeanList.size();
    }

    public static class ViewHolder
            extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ImageView mImageView;

        public ViewHolder(View v) {
            super(v);
            mTextView = (TextView) v.findViewById(R.id.name);
            mImageView = (ImageView) v.findViewById(R.id.pic);
        }

    }

}
