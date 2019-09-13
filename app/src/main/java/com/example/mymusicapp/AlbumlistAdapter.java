package com.example.mymusicapp;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;


public class AlbumlistAdapter extends RecyclerView.Adapter<AlbumlistAdapter.AlbumListViewHolder> {
    private Context mCtx;
    private List<Album> albumList;
    private TextView textViewTitle;
    private TextView textViewshortDesc;
    private TextView text_songs;
    private TextView textViewtext;
    private ImageView imageView;
    private MediaPlayer mediaPlayer;
    private Button mButton;

    class AlbumListViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle, textViewshortDesc, textViewtext, textViewnumofsongs;
        ImageView imageViewimage;
        Button mButton;

        public AlbumListViewHolder(final View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewshortDesc = itemView.findViewById(R.id.textViewShortDesc);
            imageViewimage = itemView.findViewById(R.id.imageView);
            textViewnumofsongs = itemView.findViewById(R.id.textViewnumofsongs);
            mButton=itemView.findViewById(R.id.textViewText);
         // final MediaPlayer mediaPlayer=MediaPlayer.create(mCtx.getApplicationContext(),R.raw.dhivara);
//            mButton.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    onNoteClickListener.onNoteClick();
//                }
//            });
        //{
            //    @Override
              //  public void onClick(View v) {
                //   Toast.makeText(mCtx,"Song is playing increase the volume and enjoy it,have a good day!",Toast.LENGTH_LONG).show();
                  // Intent intent=new Intent(mCtx,MainActivity.class);
                   //intent.putExtra("hi",1);
                   //mediaPlayer.start();
                  // if (imageViewimage==albumList.R.id.imageView)
                //}

            //});

        }

    }

    OnNoteClickListener onNoteClickListener;

    public AlbumlistAdapter(Context mCtx, List<Album> albumList, OnNoteClickListener onNoteClickListener) {
        this.mCtx = mCtx;
        this.albumList = albumList;
        this.onNoteClickListener = onNoteClickListener;
    }

    @Override
    public AlbumListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.adapter, null);
        return new AlbumListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AlbumListViewHolder holder, final int position) {
        Album album = albumList.get(position);

        holder.textViewTitle.setText(album.getTitle());
        holder.textViewshortDesc.setText(album.getShortDesc());
        holder.textViewnumofsongs.setText(""+album.getNumofsongs());
        holder.mButton.setText(album.getText());

      //  final MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.jeva);
        holder.mButton.setOnClickListener(new View.OnClickListener() {
          @Override
            public void onClick(View v) {
              onNoteClickListener.onNoteClick(position);

            }
       });
        holder.imageViewimage.setImageDrawable(mCtx.getResources().getDrawable(album.getImage()));
        }

    @Override
    public int getItemCount() {
        return albumList.size();
    }


}



