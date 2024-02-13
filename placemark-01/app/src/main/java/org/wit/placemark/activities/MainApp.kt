package org.wit.placemark.activities

import android.app.Application
import timber.log.Timber.Forest.i
import org.wit.placemark.models.PlacemarkModel
import timber.log.Timber

class MainApp : Application() {

    val placemarks = ArrayList<PlacemarkModel>()

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        i("Placemark started")
    }
}