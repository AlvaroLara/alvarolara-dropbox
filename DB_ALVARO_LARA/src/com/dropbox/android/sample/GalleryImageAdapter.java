package com.dropbox.android.sample;
import android.widget.BaseAdapter;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Gallery;
import android.graphics.drawable.Drawable;

public class GalleryImageAdapter extends BaseAdapter
{
    private Context mContext;

    public GalleryImageAdapter(Context context)
    {
        mContext = context;
    }

    public int getCount() {
        return DBRoulette.n_ebooks;
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }


    // Override this method according to your need
    public View getView(int index, View view, ViewGroup viewGroup)
    {
        ImageView i = new ImageView(mContext);
        if (index<DBRoulette.n_ebooks){
        	Drawable mDrawab=Drawable.createFromPath(DBRoulette.books_sorted_files[index]);
        	i.setImageDrawable(mDrawab);
	        i.setLayoutParams(new Gallery.LayoutParams(30, 50));
	        i.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        return i;
    }
}