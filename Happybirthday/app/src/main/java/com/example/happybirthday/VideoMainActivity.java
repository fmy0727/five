package com.example.happybirthday;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoMainActivity extends Activity implements OnClickListener {

    private Button btn_start, btn_pause, btn_stop;
    VideoView videoView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_start = (Button) findViewById(R.id.btn_start);
        Button btn_pause = (Button) findViewById(R.id.btn_pause);
        Button btn_repetition = (Button) findViewById(R.id.btn_repetition);
        btn_start.setOnClickListener(this);
        btn_pause.setOnClickListener(this);
        btn_repetition.setOnClickListener(this);

        videoView = (VideoView) findViewById(R.id.mVideoView);
        videoView.setVideoURI(Uri.parse("http://vfx.mtime.cn/Video/2019/03/19/mp4/190319222227698228.mp4"));
        videoView.start();

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(VideoMainActivity.this, "播放完成了", Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.btn_start:
                videoView.start();
                break;
            case R.id.btn_pause:
                videoView.pause();
                break;
            case R.id.btn_repetition:

                break;

            default:
                break;
        }

    }

}