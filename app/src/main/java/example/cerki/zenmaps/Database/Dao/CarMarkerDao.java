package example.cerki.zenmaps.Database.Dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import example.cerki.zenmaps.Database.POJO.CarMarker;

/**
 * Created by cerki on 18.01.2018.
 */

@Dao
public interface CarMarkerDao {
    @Query("SELECT * FROM carmarker WHERE markerTag=:markerTag")
    CarMarker getByTag(int markerTag);
    @Insert
    void insert(CarMarker carMarker);
}
