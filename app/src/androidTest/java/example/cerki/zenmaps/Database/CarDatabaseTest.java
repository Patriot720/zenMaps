package example.cerki.zenmaps.Database;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import example.cerki.zenmaps.Database.POJO.CarMarker;

import static android.support.test.InstrumentationRegistry.getTargetContext;
import static org.junit.Assert.assertEquals;

/**
 * Created by cerki on 18.01.2018.
 */

@RunWith(AndroidJUnit4.class)
public class CarDatabaseTest {

    private CarDatabase carDatabase;

    @Before
    public void setUp() throws Exception {
        carDatabase = CarDatabase.Companion.createInstance(getTargetContext());
    }

    @Test
    public void insertionTest() throws Exception {
        CarMarker solaris = new CarMarker(1, "Solaris", "solaris.png");
        carDatabase.carMarkerDao().insert(solaris);
        CarMarker marker = carDatabase.carMarkerDao().getByTag(1);
        assertEquals(marker.getMarkerTag(),solaris.getMarkerTag());
    }
}
