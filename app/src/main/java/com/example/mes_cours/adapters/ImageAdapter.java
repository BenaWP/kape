package com.example.mes_cours.adapters;
import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mes_cours.R;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    String[] fruitNames = {"Maths","Phys","Sciences","Malag","Francais","Angais",  "Histo-geo"};
    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.ic_folder, R.drawable.ic_folder,
            R.drawable.ic_folder, R.drawable.ic_folder,
            R.drawable.ic_folder, R.drawable.ic_folder,
            R.drawable.ic_folder
    };

    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context;

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View view1 = inflater.inflate(R.layout.listes_matieres_premiere_fragment,null);
        //getting view in row_data
        TextView name = view1.findViewById(R.id.folder_cours_p_title);
        ImageView image = view1.findViewById(R.id.folder_cours_p_item);

        name.setText(fruitNames[position]);
        image.setImageResource(mThumbIds[position]);
        return view1;
    }


}
