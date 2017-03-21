package com.example.cice.carddemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by cice on 21/3/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CustomViewHolder>{
    private String[] titles = {"Capitulo 1",
            "Capitulo 2",
            "Capitulo 3",
            "Capitulo 4",
            "Capitulo 5",
            "Capitulo 6",
            "Capitulo 7",
            "Capitulo 8",
            "Capitulo 9"};

    private String[] details = {"Item 1 subtítulo",
            "Item 2 subtítulo",
            "Item 3 subtítulo",
            "Item 4 subtítulo",
            "Item 5 subtítulo",
            "Item 6 subtítulo",
            "Item 7 subtítulo",
            "Item 8 subtítulo",
            "Item 9 subtítulo"};

    private int[] images = {
            R.drawable.ic_action_name,
            R.drawable.ic_action_name,
            R.drawable.ic_action_name,
            R.drawable.ic_action_name,
            R.drawable.ic_action_name,
            R.drawable.ic_action_name,
            R.drawable.ic_action_name,
            R.drawable.ic_action_name,
            R.drawable.ic_action_name

    };

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        CustomViewHolder viewHolder = new CustomViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.CustomViewHolder holder, int position) {
        holder.itemTitle.setText(titles[position]);
        holder.itemDetail.setText(details[position]);
        holder.itemImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;

        public CustomViewHolder( View itemView){
            super(itemView);

            itemImage = (ImageView) itemView.findViewById(R.id.item_image);
            itemTitle = (TextView) itemView.findViewById(R.id.item_title);
            itemDetail = (TextView) itemView.findViewById(R.id.item_detail);



        }
    }

}
