
package com.example.mymusicapp;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class ScrollingActivity extends AppCompatActivity implements OnNoteClickListener {
    private RecyclerView recyclerView;
    private List<Album> albumList;
    private Button mButton;
    private Toolbar toolbar;
    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        //Toolbar toolbar=(Toolbar) findViewById(R.id.Toolbar);
        // getSupportActionBar(Toolbar);
        //initCollapsingToolbar();

        recyclerView = findViewById(R.id.recycle_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        albumList = new ArrayList<>();

        albumList.add(new Album(1, "Dheevara", R.drawable.secondalbum, "Singers:Ramya behara,Deepu", 1, "Play", R.raw.dhivara));
        albumList.add(new Album(2, "Mamathala thalli", R.drawable.thirdalbum, "Singers:yamini", 2, "Play", R.raw.jeva));
        albumList.add(new Album(3, "Sivuni aana", R.drawable.sixthalbum, "M.M.Keeravani", 3, "Play", R.raw.manohari));
        albumList.add(new Album(4, "Nippulaa Swaasa Ga", R.drawable.seventhalbum, "Geetha Madhuri", 4, "Play", R.raw.pachabottasi));
        albumList.add(new Album(5, "Pacha Bottasi", R.drawable.fifthalbum, "Damini,Karthik", 5, "Play", R.raw.jeva));

        AlbumlistAdapter adapter = new AlbumlistAdapter(this, albumList, this);
        recyclerView.setAdapter(adapter);

    }

//        startActivity(intent);


//        mediaPlayer.start();
//       }
    //   mButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//Yes declare it as a Global variable. And create a function called getCurrentVolumePercentage() and write the code from int currentVolume and return the percentage
    @Override
    public void onNoteClick(int position) {
//        AudioManager am = (AudioManager) getSystemService(AUDIO_SERVICE);
//        int currentVolume = am.getStreamVolume(AudioManager.STREAM_MUSIC);
//        int maxVolume = am.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
//        int volumePercentage= currentVolume/maxVolume*100;
//        if(volumePercentage > 75) {
//
//            Toast.makeText(this, "increase the volume up and enjoy", Toast.LENGTH_LONG).show();
//        }

        Toast.makeText(this, "increase the volume up and enjoy", Toast.LENGTH_LONG).show();



            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.reset();
                mediaPlayer.release();

        mediaPlayer = MediaPlayer.create(this, albumList.get(position).getSongid());
            Album album = albumList.get(position);
            album.getSongid();
            mediaPlayer.start();

        }

}
}




    //  private void initCollapsingToolbar() {
    //    final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.tool_bar);
      //  collapsingToolbarLayout.setTitle(" ");
        //AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.app_bar);
        //appBarLayout.setExpanded(true);
        //appBarLayout.addOnOffsetChangedListener(new AppBarLayout.BaseOnOffsetChangedListener() {
          //  boolean isShow = false;
            //int scrollRange = -1;

            //@Override
            //public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
              //  if (scrollRange == -1) {
                //    scrollRange = appBarLayout.getTotalScrollRange();
                //}
                //if (scrollRange + verticalOffset == 0) {
                  //  collapsingToolbarLayout.setTitle("MyMusicApp");
                    //isShow = true;
                //} else if (isShow) {
                  //  collapsingToolbarLayout.setTitle(" ");
                //}
            //}
        //});

    //}


