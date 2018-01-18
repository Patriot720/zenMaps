package example.cerki.zenmaps.Database.POJO

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.drawable.BitmapDrawable
import android.support.v4.content.ContextCompat
import example.cerki.zenmaps.R

/**
 * Created by cerki on 18.01.2018.
 */
@Suppress("CanBeVal")
@Entity
data class CarMarker(@PrimaryKey val markerTag: Int,
                     val model: String,
                     val imageReference: String){
    fun getIcon(context: Context): Bitmap? {
        var carIcon = context.assets.open("cars/" + imageReference)
        var defaultIcon = ContextCompat.getDrawable(context,R.drawable.zenna) as BitmapDrawable
        var topImage = Bitmap.createScaledBitmap(BitmapFactory.decodeStream(carIcon),320,180,false)
        val bottomImage = defaultIcon.bitmap
        var copy = bottomImage.copy(Bitmap.Config.ARGB_8888,true) // todo change top and bottom add middleLayer

        var comboImage = Canvas(copy)

        comboImage.drawBitmap(topImage, 0f, 0f, null)

        return  copy
    }

}