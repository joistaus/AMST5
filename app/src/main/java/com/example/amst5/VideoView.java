package com.example.amst5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class VideoView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        final android.widget.VideoView videoView;
        videoView = (android.widget.VideoView) findViewById(R.id.videoView);
        videoView.setVideoPath("https://sample-videos.com/video123/mp4/720/big_buck_bunny_720p_1mb.mp4");
        videoView.start();
    }
}