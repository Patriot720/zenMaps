package example.cerki.zenmaps.Database.POJO

import org.junit.Before
import org.junit.Test

/**
 * Created by cerki on 18.01.2018.
 */
class CarMarkerTest{
    lateinit var carMarker:CarMarker
    @Before
    fun setUp() {
        carMarker = CarMarker(1,"Solaris","solaris.png")
    }

    @Test
    fun getIconTest() {
        val icon = carMarker.getIcon()
    }
}