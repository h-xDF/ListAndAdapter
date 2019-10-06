package com.example.listandadapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.listandadapter.R;
import com.example.listandadapter.model.Actor;


import java.util.List;

public class ActorListAdapter extends BaseAdapter {
    private final List<Actor> actors;
    private final Context context;
    private final LayoutInflater inflater;

    public ActorListAdapter(List<Actor> actors, Context context) {
        this.actors = actors;
        this.context = context;
        //this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return actors.size();
    }

    @Override
    public Actor getItem(int position) {
        return actors.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowItem = inflater.inflate(R.layout.list_item_actor, parent, false);

        ImageView avatarView = rowItem.findViewById(R.id.avatar);
        TextView nameView = rowItem.findViewById(R.id.name);
        ImageView oscarView = rowItem.findViewById(R.id.oscar);

        Actor actor = actors.get(position);

        Glide.with(context).load(actor.getAvatar()).into(avatarView); //Glide
        nameView.setText(actor.getName());
        if (actor.isHasOscar()) {
            oscarView.setVisibility(View.VISIBLE);
        }
        return rowItem;
    }
}
