package example.cerki.zenmaps

import android.app.Application
import com.beardedhen.androidbootstrap.TypefaceProvider
import example.cerki.zenmaps.Database.CarDatabase

/**
 * Created by cerki on 18.01.2018.
 */
class ZenMaps : Application() {
    override fun onCreate() {
        super.onCreate()
        TypefaceProvider.registerDefaultIconSets()
        CarDatabase.createInstance(this)
    }
}