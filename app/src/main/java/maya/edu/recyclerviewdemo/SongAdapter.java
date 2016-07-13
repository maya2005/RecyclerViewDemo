package maya.edu.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import maya.edu.recyclerviewdemo.models.Song;

/**
 * Created by מאיה מסיקה on 13/07/16.
 */
public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder> {

    private LayoutInflater inflater;
    private ArrayList <Song> data;

    public SongAdapter(LayoutInflater inflater, ArrayList<Song> data) {
        this.inflater = inflater;
        this.data = data;
    }


    @Override
    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.song_itme, parent, false);
        return new SongViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SongViewHolder holder, int position) {
        Song item = data.get(position);
        holder.tvTitle.setText(item.getTitle());
        holder.tcDescription.setText(item.getDescription());
        holder.ivSong.setImageResource(item.getImageResID());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class SongViewHolder extends RecyclerView.ViewHolder{

        TextView tvTitle,tcDescription;
        ImageView ivSong;

        public SongViewHolder(View itemView) {
            super(itemView);
            tcDescription = (TextView) itemView.findViewById(R.id.tcDescription);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            ivSong = (ImageView) itemView.findViewById(R.id.ivSong);


        }
    }
}
