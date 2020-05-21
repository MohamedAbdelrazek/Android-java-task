package com.zoomapps.acs.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.zoomapps.acs.R;
import com.zoomapps.acs.data.model.ArtistModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ArtistAdapter extends RecyclerView.Adapter<ArtistAdapter.ArtistViewHolder> {

   private List<ArtistModel> data;

    public ArtistAdapter(List<ArtistModel> dataa) {
        this.data = dataa;
    }

    @NonNull
    @Override
    public ArtistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.artist_list_item, parent, false);
        return new ArtistViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull ArtistViewHolder holder, int position) {
        ArtistModel model = data.get(position);
        holder.name.setText(model.getName());
        Glide.with(holder.itemView.getContext()).load(model.getImage()).into(holder.profileImage);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ArtistViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.personImage)
        ImageView profileImage;
        @BindView(R.id.personName)
        TextView name;

        ArtistViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
