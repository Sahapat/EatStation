package com.inspiretail.anint.eatstation;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class MarketLocation {

    public static class Location {
        public Location(float x, float y) {
            latitude = x;
            longtitude = y;
        }

        private float latitude;
        private float longtitude;

        public float getLatitude() {
            return latitude;
        }

        public float getLongtitude() {
            return longtitude;
        }
    }

    private static final MarketLocation instance = new MarketLocation();
    public static Location[] m_Location = {
            new Location(13.792962f, 100.550005f),
            new Location(13.790456f, 100.545220f),
            new Location(13.794764f, 100.550516f),
            new Location(13.738962f, 100.548352f),
            new Location(13.802524f, 100.553715f),
            new Location(13.813154f, 100.548626f),
            new Location(13.780633f, 100.544163f),
            new Location(13.780772f, 100.544810f),
            new Location(13.780333f, 100.543940f),
            new Location(13.722227f, 100.527706f),
            new Location(13.722773f, 100.525912f),
            new Location(13.723516f, 100.529741f),
            new Location(13.725802f, 100.539195f),
            new Location(13.728736f, 100.535204f),
            new Location(13.727597f, 100.536396f),
            new Location(13.743330f, 100.524932f),
            new Location(13.743375f, 100.524440f),
            new Location(13.743379f, 100.524721f),
            new Location(13.891584f, 100.406059f),
            new Location(13.889373f, 100.407415f),
            new Location(13.889164f, 100.407847f),
            new Location(13.879382f, 100.407552f),
            new Location(13.878590f, 100.407544f),
            new Location(13.879474f, 100.406078f),
            new Location(13.869848f, 100.481520f),
            new Location(13.869507f, 100.486648f),
            new Location(13.870399f, 100.481821f),
            new Location(13.748609f, 100.563128f),
            new Location(13.748613f, 100.563133f),
            new Location(13.748823f, 100.562526f),
            new Location(13.811869f, 100.619237f),
            new Location(13.806071f, 100.573405f),
            new Location(13.806198f, 100.573952f),
            new Location(13.803435f, 100.539365f),
            new Location(13.801849f, 100.535266f),
            new Location(13.790738f, 100.542660f),
    };

    private MarketLocation() {
    }

    public static MarketLocation getInstance() {
        return instance;
    }
}