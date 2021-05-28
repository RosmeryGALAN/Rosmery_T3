package com.example.t3_rosmery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.AnimeViewHolder>{
    ArrayList<Anime> mData;
    private boolean favorito = true;
    private View.OnClickListener mlistener;
    public Adapter(ArrayList<Anime> anime) {
        mData = anime;
    }

    public interface  OnClick{
        void onClick(int position);
    }

    @NonNull
    @Override
    public AnimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.anime_item, parent, false);
        Adapter.AnimeViewHolder vh = new Adapter.AnimeViewHolder(v,context);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeViewHolder holder, int position) {
        Context context = holder.context;
        TextView nombre = holder.itemView.findViewById(R.id.nombreAnime);
        TextView descri = holder.itemView.findViewById(R.id.descAnime);
        ImageView image = holder.itemView.findViewById(R.id.imageAnime);
        ImageButton boton = holder.itemView.findViewById(R.id.favorito);

        int pos = boton.getTop();

        boton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(favorito){
                    favorito = false;
                    boton.setImageResource(R.drawable.favorito);
                }else
                {
                    favorito = true;
                    boton.setImageResource(R.drawable.no_favorito);
                }
            }
        });

        String nomb = mData.get(position).getTitulo();
        String desc = mData.get(position).getDescripcion();
        String imag = mData.get(position).getImage();

        Picasso.get().load(imag).into(image);
        nombre.setText(nomb);
        descri.setText(desc);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class AnimeViewHolder extends RecyclerView.ViewHolder{
        public Context context;
        public AnimeViewHolder(@NonNull View itemView, Context context) {
            super(itemView);
            this.context = context;
        }
    }
}
