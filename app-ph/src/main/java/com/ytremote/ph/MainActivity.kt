package com.ytremote.ph

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(24, 24, 24, 24)
        }
        val title = TextView(this).apply {
            text = "YTRemote"
            textSize = 28f
            gravity = Gravity.CENTER
        }
        val status = TextView(this).apply {
            text = "غير متصل بالشاشة"
            textSize = 16f
            gravity = Gravity.CENTER
            setPadding(0, 16, 0, 24)
        }
        val pair = Button(this).apply { text = "ربط بالشاشة" }
        val remote = Button(this).apply { text = "فتح لوحة التحكم" }

        root.addView(title)
        root.addView(status)
        root.addView(pair)
        root.addView(remote)
        setContentView(root)
    }
}
