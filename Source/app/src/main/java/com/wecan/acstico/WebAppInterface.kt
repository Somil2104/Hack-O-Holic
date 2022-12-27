package com.wecan.acstico

import android.content.Context
import android.media.AudioManager
import android.media.MediaPlayer
import android.webkit.JavascriptInterface
import android.widget.Toast
import java.io.IOException


class WebAppInterface internal constructor(c: Context) {
    var mContext: Context
    lateinit var mediaPlayer: MediaPlayer

    /** Show a toast from the web page  */
    fun playAudio(toast: String?){
        val audioUrl =
            "http://www.jplayer.org/audio/mp3/Miaow-02-Hidden.mp3"

        mediaPlayer = MediaPlayer()

        // below line is use to set the audio
        // stream type for our media player.

        // below line is use to set the audio
        // stream type for our media player.
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC)

        // below line is use to set our
        // url to our media player.

        // below line is use to set our
        // url to our media player.
        try {
            mediaPlayer.setDataSource(audioUrl)
            // below line is use to prepare
            // and start our media player.
            mediaPlayer.prepare()
            mediaPlayer.start()
        } catch (e: IOException) {
            e.printStackTrace()
        }
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show()

    }
    @JavascriptInterface
    fun showToast(toast: String?) {
        val audioUrl =
            "http://www.jplayer.org/audio/mp3/Miaow-02-Hidden.mp3"
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC)
        mediaPlayer = MediaPlayer()
        mediaPlayer.setDataSource(audioUrl)
        mediaPlayer.start()
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show()
    }
    /** Instantiate the interface and set the context  */
    init {
        mContext = c
    }
}