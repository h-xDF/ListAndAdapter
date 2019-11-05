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

    public ActorListAdapter(Context context, List<Actor> actors) {
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
        ViewHolder holder;
        if (convertView == null) {

            holder = onCreateViewHolder(parent);
            convertView = holder.itemView;
            convertView.setTag(holder); //view tag
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        onBindViewHolder(holder, position);
        return convertView;
    }

    private ViewHolder onCreateViewHolder(ViewGroup parent) {
        View convertView = inflater.inflate(R.layout.list_item_actor, parent, false);
        ViewHolder holder = new ViewHolder(convertView);

        return holder;
    }

    private void onBindViewHolder(ViewHolder holder, int position) {
        Actor actor = actors.get(position);

        //Glider
        Glide.with(context)
                .load(actor.getAvatar())
                .into(holder.avatarView);

        holder.nameView.setText(actor.getName());
        holder.oscarView.setVisibility(actor.isHasOscar() ? View.VISIBLE : View.GONE);
    }

    static class ViewHolder {
        final View itemView;

        final ImageView avatarView;
        final TextView nameView;
        final ImageView oscarView;

        ViewHolder(View itemView) {
            this.itemView = itemView;
            this.avatarView = itemView.findViewById(R.id.avatar);
            this.nameView = itemView.findViewById(R.id.name);
            this.oscarView = itemView.findViewById(R.id.oscar);
        }
    }
}
