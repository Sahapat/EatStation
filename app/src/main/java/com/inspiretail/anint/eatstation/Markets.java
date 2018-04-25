package com.inspiretail.anint.eatstation;

import android.content.Intent;

public class Markets {

    /*public static class Location {
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
    }*/
    public static class Detail {
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

        private float rate;
        private boolean isComment;
        private boolean isLike;
        private String name;
        private String train;
        private String txt_location;
        private String time;
        private String money;
        private String comment;
        private Location location;
        private Integer image;

        public Detail(String name, String train, String txt_location, String time, String money,Integer image, Location location) {
            this.name = name;
            this.train = train;
            this.txt_location = txt_location;
            this.time = time;
            this.money = money;
            this.location = location;
            this.image = image;
            comment = "";
            rate = 0;
            isComment = false;
            isLike = false;
        }

        public void setRate(int rate) {
            this.rate = rate;
        }

        public void setComment(String txt) {
            this.comment = txt;
        }

        public void setLike(boolean status) {
            this.isLike = status;
        }

        public void setIsComment(boolean status) {
            this.isComment = status;
        }

        public float getRate() {
            return rate;
        }

        public boolean isComment() {
            return isComment;
        }

        public boolean isLike() {
            return isLike;
        }

        public Location getLocation() {
            return location;
        }

        public String getComment() {
            return comment;
        }

        public String getMoney() {
            return money;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }

        public Integer getImage() {
            return image;
        }

        public String getTrain() {
            return train;
        }

        public String getTxt_location() {
            return txt_location;
        }
    }

    private static Markets instance = new Markets();
    private static Detail[] m_details = {
            new Detail("ร้าน ข้าวมันไก่มงคลวัฒนา","BTS สะพานควาย","670/6 หน้าโรงหนังมงคาลรามา (รพ.เปาโล) ถนนพหลโยธิน พญาไทย กรุงเทพฯ","ทุกวัน 8:30 - 20:00","ต่ำกว่า 100 บาท",
                    R.drawable.img_view1,new Detail.Location(13.792962f, 100.550005f)),
                    new Detail("ร้าน นม-หนม สะพานควาย","BTS สะพานควาย","ปากซอย","ทุกวัน 8:30 - 20:00","ต่ำกว่า 100 บาท",
                    R.drawable.img_view2,new Detail.Location(13.792962f, 100.550005f))
    };
    /*private static Location[] m_Location = {
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
    };*/

    private Markets() {
    }

    public static Markets getInstance() {
        return instance;
    }
    public static Detail getDetail(int index)
    {
        return m_details[index];
    }
}