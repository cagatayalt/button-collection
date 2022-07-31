package com.example.buttoncollection

import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val tv2 = findViewById<TextView>(R.id.feedBtnTv2)
        val paint = tv2.paint

        val width = paint.measureText(tv2.text.toString())
        val textShader: Shader = LinearGradient(
            0f, 0f, width, tv2.textSize, intArrayOf(
                Color.parseColor("#641AF5"),
                Color.parseColor("#296EFF"),
            ), null, Shader.TileMode.REPEAT
        )

        tv2.paint.shader = textShader



    }
}