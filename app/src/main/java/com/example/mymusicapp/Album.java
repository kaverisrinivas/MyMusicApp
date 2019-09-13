package com.example.mymusicapp;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.widget.Button;

public class Album {
    private int id;
    private String title;
    private int image;
    private String shortDesc;
    private int numofsongs;
    private String text;
    private int songid;


    public Album(int id,String title,int image,String shortDesc,int numofsongs,String text,int songid)
    {
        this.id=id;
        this.title=title;
        this.image=image;
        this.shortDesc=shortDesc;
        this.numofsongs=numofsongs;
        this.text=text;
        this.songid=songid;
        //this.mp=mp;
    }
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public int getImage(){
        return image;
    }
    public String getShortDesc(){
        return shortDesc;
    }
    public int getNumofsongs(){
        return numofsongs;
    }
    public String getText(){
        return text;
    }
    public int getSongid(){
        return songid;
    }

    //public MediaPlayer getMp() {
        //return mp;
    //}
}
