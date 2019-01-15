package com.yuyang.listviewDemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.yuyang.listview.R;

import java.util.LinkedList;

/**
 * Author: yuyang
 * Date:2019/1/13 15:19
 */

public class AnimalAdapter extends BaseAdapter {
    private LinkedList<Animal> mData;
    private Context mContext;

    public AnimalAdapter(LinkedList<Animal> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;   //定义一个内部类
        if(convertView == null){    //当convertView为空的时候
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_list_animal,parent,false);
            holder = new ViewHolder();   //创建一个ViewHolder实例
            holder.img_icon = (ImageView) convertView.findViewById(R.id.img_icon);
            holder.txt_aName = (TextView) convertView.findViewById(R.id.txt_aName);
            holder.txt_aSpeak = (TextView) convertView.findViewById(R.id.txt_aSpeak);
            convertView.setTag(holder);   //将Holder存储到convertView中
        }else{
            holder = (ViewHolder) convertView.getTag();  //从convertView中获取holder
        }

        holder.img_icon.setBackgroundResource(mData.get(position).getaIcon());
        holder.txt_aName.setText(mData.get(position).getaName());
        holder.txt_aSpeak.setText(mData.get(position).getaSpeak());
        return convertView;
    }

      class ViewHolder{
        ImageView img_icon;
        TextView txt_aName;
        TextView txt_aSpeak;
    }
}
