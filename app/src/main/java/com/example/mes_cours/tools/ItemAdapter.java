package com.example.mes_cours.tools;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.mes_cours.R;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<ItemBean> {
    ArrayList<ItemBean> Items;
    private final Context context;
    private final int resourceID;

    public ItemAdapter(Context context2, int i, ArrayList<ItemBean> arrayList) {
        super(context2, i, arrayList);
        this.context = context2;
        this.resourceID = i;
        this.Items = arrayList;
    }

    static class ViewHolder {
        protected ImageView img;
        protected TextView itemdecsp;
        protected TextView itemname;
        protected String url;

        ViewHolder() {
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = ((LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.layout_ieam_listview, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.itemname = (TextView) view.findViewById(R.id.ItemTitle);
            viewHolder.itemdecsp = (TextView) view.findViewById(R.id.ItemDecs);
            viewHolder.img = (ImageView) view.findViewById(R.id.ItemImg);
            view.setTag(viewHolder);
            view.setTag(R.id.ItemTitle, viewHolder.itemname);
            view.setTag(R.id.ItemDecs, viewHolder.itemdecsp);
            view.setTag(R.id.ItemImg, viewHolder.img);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        ItemBean itemBean = this.Items.get(i);
        viewHolder.img.setImageResource(itemBean.getImg());
        TextView textView = viewHolder.itemname;
        textView.setText("" + itemBean.getItemname());
        TextView textView2 = viewHolder.itemdecsp;
        textView2.setText("" + itemBean.getItemdesc());
        return view;
    }
}
