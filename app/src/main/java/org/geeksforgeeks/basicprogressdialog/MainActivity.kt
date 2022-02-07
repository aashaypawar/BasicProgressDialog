package org.geeksforgeeks.basicprogressdialog

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mButton = findViewById<Button>(R.id.button_1)

        mButton.setOnClickListener {
            val mProgressDialog = ProgressDialog(this)
            mProgressDialog.setTitle("This is TITLE")
            mProgressDialog.setMessage("This is MESSAGE")
            mProgressDialog.show()
        }
    }
}