package com.taboret.checkbox_25102022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var owoce_cb = arrayOf(
            findViewById<CheckBox>(R.id.cb1),
            findViewById<CheckBox>(R.id.cb2),
            findViewById<CheckBox>(R.id.cb3),
            findViewById<CheckBox>(R.id.cb4),
            findViewById<CheckBox>(R.id.cb5),
            findViewById<CheckBox>(R.id.cb6),
            findViewById<CheckBox>(R.id.cb7),
            findViewById<CheckBox>(R.id.cb8),
            findViewById<CheckBox>(R.id.cb9),
            findViewById<CheckBox>(R.id.cb10)
        )
        var owoce_img = arrayOf(
            findViewById<ImageView>(R.id.imageView1),
            findViewById<ImageView>(R.id.imageView2),
            findViewById<ImageView>(R.id.imageView3),
            findViewById<ImageView>(R.id.imageView4),
            findViewById<ImageView>(R.id.imageView5),
            findViewById<ImageView>(R.id.imageView6),
            findViewById<ImageView>(R.id.imageView7),
            findViewById<ImageView>(R.id.imageView8),
            findViewById<ImageView>(R.id.imageView9),
            findViewById<ImageView>(R.id.imageView10)
        )

        owoce_img.zip(owoce_cb).forEach { pair ->
            var owoc = pair.component1()
            var checkBox = pair.component2()

            owoc.setVisibility(View.INVISIBLE)
            checkBox.setOnClickListener()
            {
                if (checkBox.isChecked) {
                    owoc.setVisibility(View.VISIBLE)
                } else {
                    owoc.setVisibility(View.INVISIBLE)
                }
            }

        }
    }
}