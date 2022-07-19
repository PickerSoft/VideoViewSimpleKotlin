package com.pickersoft.myvideoview

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    var video:VideoView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        video = findViewById(R.id.videoView)
        video?.setVideoURI(Uri.parse("https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"))
    }

    fun onPlay(view: View) {
        // Play button click!
        video?.start()
    }
    fun onStop(view: View) {
        // Stop button click!
        video?.pause()
    }
}