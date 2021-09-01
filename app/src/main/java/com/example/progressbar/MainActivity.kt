package com.example.progressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressBar = findViewById<ProgressBar>(R.id.progressBar_id)

        val boton = findViewById<Button>(R.id.boton)

        boton.setOnClickListener {
            var status = 0
            Thread(Runnable{
                while(status < 100){
                    status += 1
                    try{
                        Thread.sleep(20)
                        progressBar.setProgress(status)
                    }catch(e:InterruptedException){
                        e.printStackTrace()
                    }
                }
            }).start()
        }
    }
}