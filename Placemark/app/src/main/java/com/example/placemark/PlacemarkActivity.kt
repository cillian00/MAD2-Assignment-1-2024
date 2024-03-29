package org.wit.placemark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.placemark.R
import timber.log.Timber
import timber.log.Timber.Forest.i


class PlacemarkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placemark)

        Timber.plant(Timber.DebugTree())

        i("Placemark Activity started..")
    }
}