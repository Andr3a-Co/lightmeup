package au.edu.swin.sdmd.lightmeup

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.content.res.AppCompatResources

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val androidImage = findViewById<ImageView>(R.id.androidImage)

        androidImage.setOnClickListener {

            if (androidImage.isClickable) {

            androidImage.setImageDrawable(AppCompatResources.getDrawable(this, R.drawable.ic_favorite_black_24dp))

            } else {

                androidImage.setImageDrawable(AppCompatResources.getDrawable(this, R.drawable.ic_android_black_24dp))
            }
        }






    }
}