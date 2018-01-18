package example.cerki.zenmaps.Database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import example.cerki.zenmaps.Database.POJO.CarMarker
import android.arch.persistence.room.Room
import android.content.Context
import android.provider.ContactsContract
import example.cerki.zenmaps.Database.Dao.CarMarkerDao


/**
 * Created by cerki on 18.01.2018.
 */
@Database(entities = [(CarMarker::class)],version=1,exportSchema = false)
abstract class CarDatabase : RoomDatabase() {

    abstract fun carMarkerDao():CarMarkerDao

 companion object {
  private val DATABASE_NAME = "car-db"
  private var db: CarDatabase? = null
  fun createInstance(context: Context): CarDatabase? {
   db = Room.databaseBuilder(context, CarDatabase::class.java, DATABASE_NAME).allowMainThreadQueries().fallbackToDestructiveMigration().build()
   return db
  }

  fun getInstance(): CarDatabase? {
   return db
  }

 }
}