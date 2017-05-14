package com.example.ussl_22.thirdday_customlistview;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ussl-22 on 5/11/2017.
 */

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;
    private final String[] itemloc;

    public CustomListAdapter(Activity context, String[] itemname,Integer[] imgid,String[] itemloc) {
        super(context, R.layout.my_layout,itemname);
        this.context = context;
        this.itemname = itemname;
        this.imgid = imgid;
        this.itemloc = itemloc;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.my_layout, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.text_view_1);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon_imageView);
        TextView extratxt = (TextView) rowView.findViewById(R.id.TextView2);

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        extratxt.setText(itemloc[position]);
        return rowView;
    }
}
