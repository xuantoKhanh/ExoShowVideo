package com.example.exoshowvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.browse.MediaBrowser;
import android.os.Bundle;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;

public class MainActivity extends AppCompatActivity {

    String url1 = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4";
    String url2 = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerFun.mp4";
    String url3 = " http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4";

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ExoPlayer player = new ExoPlayer.Builder(this).build();
        PlayerView playerControlView = findViewById(R.id.exoPlayer);
        // Bind the player to the view.
        playerControlView.setPlayer(player);

        // Build the media item.
        MediaItem mediaItem1 = MediaItem.fromUri(url1);
        MediaItem mediaItem2 = MediaItem.fromUri(url2);
        MediaItem mediaItem3 = MediaItem.fromUri(url3);
// Set the media item to be played.
        player.addMediaItem(mediaItem1);
        player.addMediaItem(mediaItem2);
        player.addMediaItem(mediaItem3);
// Prepare the player.
        player.prepare(); //add list of media sources
// Start the playback.
        player.play();
    }

}