package com.lyricgan.winky.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tv_content).text = stringFromJNI()
    }

    private external fun stringFromJNI(): String?

    companion object {
        init {
            System.loadLibrary("hello-jni")
        }
    }
}