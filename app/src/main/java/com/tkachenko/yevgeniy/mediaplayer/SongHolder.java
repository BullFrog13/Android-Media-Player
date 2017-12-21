package com.tkachenko.yevgeniy.mediaplayer;

import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by admin on 07.11.2017.
 */

public class SongHolder extends RecyclerView.ViewHolder {
    public TextView nameTextView;
    public TextView artistTextView;
    public Button playButton;

    public SongHolder(LinearLayout v) {
        super(v);

        this.nameTextView = (TextView)v.findViewById(R.id.song_name);
        this.artistTextView = (TextView)v.findViewById(R.id.song_artist);
        this.playButton = (Button)v.findViewById(R.id.song_play);
    }
}
