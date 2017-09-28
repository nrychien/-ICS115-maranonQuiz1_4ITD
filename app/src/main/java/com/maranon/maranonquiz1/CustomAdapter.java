package com.maranon.maranonquiz1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.maranon.maranonquiz1.Versions;

import java.util.List;
public class CustomAdapter extends BaseAdapter{
    Context context;
    List<Versions> versions;
    ImageView androidLogo;
    TextView androidName, androidEst;

    public CustomAdapter(Context context, List<Versions> versions) {
        this.context = context;
        this.versions = versions;
    }

    @Override
    public int getCount() {
        return versions.size();
    }

    @Override
    public Object getItem(int i) {
        return versions.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(context, R.layout.row_layout, null);
        androidLogo = (ImageView) v.findViewById(R.id.androidLogo);
        androidName = (TextView) v.findViewById(R.id.androidName);
        androidEst = (TextView) v.findViewById(R.id.androidEst);

        androidName.setText(versions.get(i).getAndroidName());
        androidLogo.setImageResource(versions.get(i).getLogo());
        androidEst.setText(versions.get(i).getAndroidEst());

        return v;
    }
}
