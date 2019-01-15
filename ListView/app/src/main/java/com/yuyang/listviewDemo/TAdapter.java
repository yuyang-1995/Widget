package com.yuyang.listviewDemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Author: yuyang
 * Date:2019/1/13 15:21
 */
public class TAdapter extends ArrayAdapter <Animal>{
    public TAdapter( Context context, int resource, List<Animal> objects) {
        super(context, resource, objects);
    }
}
