package com.example.listandadapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.example.listandadapter.R;
import com.example.listandadapter.model.Actor;

import java.util.List;

public class ActorRecyclerAdapter
        extends RecyclerView.Adapter<ActorRecyclerAdapter.ViewHolder> {

    private final List<Actor> actors;
    private final Context context;
    private final LayoutInflater inflater;

    private final RequestManager imageLoader;

    public ActorRecyclerAdapter(Context context, List<Actor> actors) {
        this.actors = actors;
        this.context = context;
        this.inflater = LayoutInflater.from(context);

        RequestOptions imageOption = new RequestOptions()
                .placeholder(R.drawable.avatar_placeholder)
                .fallback(R.drawable.avatar_placeholder)
                .centerCrop();
        this.imageLoader = Glide.with(context).applyDefaultRequestOptions(imageOption);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate(R.layout.list_item_actor, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(actors.get(position));
//        Actor actor = actors.get(position);
//
//        //Glider
//        Glide.with(context)
//                .load(actor.getAvatar())
//                .into(holder.avatarView);
//
//        holder.nameView.setText(actor.getName());
//        holder.oscarView.setVisibility(actor.isHasOscar() ? View.VISIBLE : View.GONE);

    }

    @Override
    public int getItemCount() {
        return actors.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public final ImageView avatarView;
        public final TextView nameView;
        public final ImageView oscarView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.avatarView = itemView.findViewById(R.id.avatar);
            this.nameView = itemView.findViewById(R.id.name);
            this.oscarView = itemView.findViewById(R.id.oscar);
        }

        void bind(Actor actor) {
            imageLoader.load(actor.getAvatar()).into(avatarView);
            nameView.setText(actor.getName());
            oscarView.setVisibility(actor.isHasOscar() ? View.VISIBLE : View.GONE);
        }
    }
}
