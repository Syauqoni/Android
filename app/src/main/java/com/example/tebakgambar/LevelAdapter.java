package com.example.tebakgambar;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LevelAdapter extends RecyclerView.Adapter<LevelAdapter.LevelViewHolder> {
    private Context context;
    private List<Level> levelList;

    public LevelAdapter(Context context, List<Level> levelList) {
        this.context = context;
        this.levelList = levelList;
    }

    @NonNull
    @Override
    public LevelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_level, parent, false);
        return new LevelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LevelViewHolder holder, int position) {
        Level level = levelList.get(position);
        holder.tvLevel.setText(level.getName());

        if (level.isLocked()) {
            holder.iconLock.setVisibility(View.VISIBLE);
        } else {
            holder.iconLock.setVisibility(View.GONE);
        }

        holder.itemView.setOnClickListener(v -> {
            if (level.isLocked()) {
                Toast.makeText(context, level.getName() + " masih terkunci", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(context, SoalActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return levelList.size();
    }

    public static class LevelViewHolder extends RecyclerView.ViewHolder {
        TextView tvLevel;
        ImageView iconLock;

        public LevelViewHolder(@NonNull View itemView) {
            super(itemView);
            tvLevel = itemView.findViewById(R.id.tvLevel);
            iconLock = itemView.findViewById(R.id.iconLock);
        }
    }
}

