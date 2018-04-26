package com.inspiretail.anint.eatstation;

import android.content.Intent;

public class Markets {
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

        public void setRate(float rate) {
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
        public String getResultName()
        {
            return "ร้าน "+name;
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
                    new Detail("ข้าวมันไก่มงคลวัฒนา","BTS สะพานควาย","670/6 หน้าโรงหนังมงคาลรามา (รพ.เปาโล) ถนนพหลโยธิน พญาไทย กรุงเทพฯ","ทุกวัน 8:30 - 20:00","ต่ำกว่า 100 บาท",
                    R.drawable.img_view1,new Detail.Location(13.792962f, 100.550005f)),

                    new Detail("นม-หนม สะพานควาย","BTS สะพานควาย","ปากซอยประดิพัทร์ 19 ถนนประดิพัท์ พญาไท กรุงเทพฯ","ทุกวัน 15:00 - 00:00","ต่ำกว่า 100 บาท",
                    R.drawable.img_view2,new Detail.Location(13.790456f, 100.545220f)),

                    new Detail("Brown Sugar Bistro & Clean Food","BTS สะพานควาบ","698/10 อาคาร ideomix ชั้น2 ถนนพหลโยธิน แขวงสามเสนไท เขตพญาไท กรุงเทพฯ 10400","ทุกวัน 10:00 - 22:00","100 - 350 บาท",
                    R.drawable.img_view3,new Detail.Location(13.794764f, 100.550516f)),

                    new Detail("Naeki Sushi","BTS หมอชิต","แขวงจตุจักร เขตจตุจักร กรุงเทพฯ 10900","ทุกวัน 10:00 - 20:00","101 - 250 บาท",
                    R.drawable.img_view4,new Detail.Location(13.738962f, 100.548352f)),

                    new Detail("ชาตรามือ","BTS หมอชิต","แขวงจตุจักร เขตจตุจักร กรุงเทพฯ 10900","ทุกวัน 08:00 - 20:00","ต่ำกว่า 100 บาท",
                    R.drawable.img_view5,new Detail.Location(13.802524f, 100.553715f)),

                    new Detail("Dunkin' Donuts","BTS หมอชิต","แขวงจตุจักร เขตจตุจักร กรุงเทพฯ 10900","ทุกวัน 10:00 - 20:30","ต่ำกว่า 100 บาท",
                    R.drawable.img_view6,new Detail.Location(13.813154f, 100.548626f)),

                    new Detail("มะลิวัลย์ ขนมไทย","BTS สถานีอารีย์","2/9 ถนนพหลโยธิน7 ซอยอารีย์ 1 แขวงสามเสนใน เขตพญาไท กรุงเทพฯ 10400","ทุกวัน 08:00 - 18:00","ต่ำกว่า 100 บาท",
                    R.drawable.img_view7,new Detail.Location(13.780633f, 100.544163f)),

                    new Detail("1000 เส้น ซ.อารีย์ 8","BTS สถานีอารีย์","ชั้น 2 ปากซอยอารีย์1 ถนนพหลโยธิน กรุงเทพฯ 10400","ทุกวัน 10:30 - 22:00","55 - 250 บาท",
                    R.drawable.img_view8,new Detail.Location(13.780772f, 100.544810f)),

                    new Detail("Frank Cake Bar","BTS สถานีอารีย์","ซอยอารีย์ 1 ถนนพหลโยธิน กรุงเทพฯ\n(ตรงข้ามวินมอไซค์ หลังตึกปิยวรรณ โครงการเอวันอารีย์)","จันทร์ - ศุกร์ 08:30 - 19:30\nเสาร์, อาทิตย์ 09:30 - 19:30","70 - 200 บาท",
                    R.drawable.img_view9,new Detail.Location(13.722227f, 100.527706f)),

                    new Detail("Not Just Another Cup","BTS ช่องนนทรี","ถนนสาทรเหนือ - ซอยสาทร 10 แขวง สีลม เขตบางรัก กรุงเทพฯ 10500","ทุกวัน 07:00 - 19:00","เริ่มต้น 80 บาท",
                    R.drawable.img_view10,new Detail.Location(13.794764f, 100.550516f)),

                    new Detail("Rocket Coffeebar","BTS ช่องนนทรี","46 21/13 ซอยสุขุมวิท 49 แขวงคลองตันเหนือ เขตวัฒนา กรุงเทพฯ 10110","วันอังคาร - อาทิตย์  07:00 - 19:00","251 - 500 บาท",
                    R.drawable.img_view11,new Detail.Location(13.722773f, 100.525912f)),

                    new Detail("Beef&Shake","BTS ช่องนนทรี","93 ถนนราธิวาสราชครินทร์ แขวงสีลม เขตบางรัก กรุงเทพฯ","ทุกวัน 08:00 - 22:30","170 - 450 บาท",
                    R.drawable.img_view12,new Detail.Location(13.723516f, 100.529741f)),

                    new Detail("มู๋มู๋ อีทเทอรี Moo Moo Eatery","BTS ศาลาแดง","13-14, 23 ซอยศาลาแดง 1 แขวงสีลม เขตบางรัก กรุงเทพฯ 10500","ทุกวัน 11:00 - 21:00","ต่ำกว่า 100 บาท",
                    R.drawable.img_view13,new Detail.Location(13.725802f, 100.539195f)),

                    new Detail("นายเม้ง บะหมี่ปู เกี๊ยวกุ้งยักษ์","BTS ศาลาแดง","183 สีลม เขตบางรัก กรุงเทพฯ","ทุกวัน 09:00 - 21:00","60 - 220 บาท",
                    R.drawable.img_view14,new Detail.Location(13.728736f, 100.535204f)),

                    new Detail("ส้มตำเด้อ","BTS ศาลาแดง","5/5 ถนนศาลาแดง สีลม กรุงเทพฯ","ทุกวัน 11:00 - 14:30, 16:30 - 22:00","101 - 250 บาท",
                    R.drawable.img_view15,new Detail.Location(13.727597f, 100.536396f)),

                    new Detail("บินหลา ขนมจีนโบราณ น้ำยาปู ฮาลาล","BTS สถานีสนามกีฬาแห่งชาติ","สวนหลวงสแควร์ ซอยจุฬาลงกรณ์ 7 แขวงวังใหม่ เขตปทุมวัน กรุงเทพฯ 10330","ทุกวัน 10:00 - 20:00","เริ่มต้น 40 บาท",
                    R.drawable.img_view16,new Detail.Location(13.743330f, 100.524932f)),

                    new Detail("ศรีขมิ้น Original Southern Cuisine","BTS สถานีสนามกีฬาแห่งชาติ","โครงการสวนหลวงสแควร์ จุฬาฯซอย 5 เขตปทุมวัน กรุงเทพฯ","ทุกวัน 11:00 - 22:00","80 - 350 บาท",
                    R.drawable.img_view17,new Detail.Location(13.743375f, 100.524440f)),

                    new Detail("Kit kitchen ครัวคุณกิจ","BTS สถานีสนามกีฬาแห่งชาติ","53-55 ซอยจุฬาลงกรณ์ 12 แขวงวังใหม่ เขตปทุมวัน กรุงเทพฯ","ทุกวัน 08:00 - 21:00","100 - 200 บาท",
                    R.drawable.img_view18,new Detail.Location(13.743379f, 100.524721f)),

                    new Detail("ก๋วยจั๊บน้ำข้มเจ้าเก่าโคลิเซี่ยม","MRT คลองบางไผ่","ถนนหมู่บ้านบ้านบัวทอง นนทบุรี(หมู่บ้านบัวทอง)","-","ต่ำกว่า 100 บาท",
                    R.drawable.img_view19,new Detail.Location(13.891584f, 100.406059f)),

                    new Detail("Cafe' De Fin","MRT คลองบางไผ่","ถ.กาญจนภิเษก ซอยหมู่บ้านบ้านบัวทอง1 นนทบุรี(หน้าหมู่บ้านบ้านบัวทอง แถบริมคลองถนน)","จันทร์ - ศุกร์ 07:00 - 18:00\nเสาร์ - อาทิตย์ 08:00 - 19:00","ต่ำกว่า 100 บาท",
                    R.drawable.img_view20,new Detail.Location(13.889373f, 100.407415f)),

                    new Detail("ก๋วยเตี๋ยวต้มยำตำลึงนายเอก","MRT คลองบางไผ่","ถนนกาญจนาภิเษก นนทบุรี(เลยศูนย์โตโยต้ามาประมาณ 50 เมตร)","-","ต่ำกว่า 100 บาท",
                    R.drawable.img_view21,new Detail.Location(13.889164f, 100.407847f)),

                    new Detail("The Waffle","MRT เพชรบุรี","ถนนเพชรยุรี แขวงบางกะปิ เขตห้วยขวาง(ร้านอยู่บริเวณโซน Metro Mall) กรุงเทพฯ 10310","จันทร์ - ศุกร์ 07:00 - 20:00\nเสาร์ - อาทิตย์ 09:00 - 20:00","เริ่มต้น 80 บาท",
                    R.drawable.img_view22,new Detail.Location(13.748609f, 100.563128f)),

                    new Detail("Sushi Ichiba","MRT เพชรบุรี","ถนนเพชรยุรี แขวงบางกะปิ เขตห้วยขวาง(อยู่ใน Metro Mall) กรุงเทพฯ 10310","จันทร์ - ศุกร์ 07:00 - 21:00\nเสาร์ - อาทิตย์ 07:00 - 20:00","ต่ำกว่า 100 บาท",
                    R.drawable.img_view23,new Detail.Location(13.748613f, 100.563133f)),

                    new Detail("Eden Rooftop Bar","MRT เพชรบุรี","1638/1 ถนนเพชรบุรี แขวงมักกะสัน เขตราชเทวี กรุงเทพฯ 10400","อังคาร - อาทิตย์ 18:00 - 01:00","101 - 250 บาท",
                    R.drawable.img_view24,new Detail.Location(13.748823f, 100.562526f)),

                    new Detail("ฮองอะจิ ราเมน","MRT ลาดพร้าว","Lat Phrao 1, ลาดพร้าว แขวงจอมพล เขตจตุจักร กรุงเทพฯ 10900","ทุกวัน 10:00 - 20:00","101 - 250 บาท",
                    R.drawable.img_view25,new Detail.Location(13.811869f, 100.619237f)),

                    new Detail("The Cooking Crab","MRT ลาดพร้าว","ถนนลาดพร้าว แขวงจอมพล เขตจตุจักร กรุงเทพฯ 10900","จันทร์ - พฤหัสบดี 16:00 - 23:00\nศุกร์ - อาทิตย์ 11:00 - 23:00","101 - 250 บาท",
                    R.drawable.img_view26,new Detail.Location(13.806071f, 100.573405f)),

                    new Detail("Coffee Road","MRT ลาดพร้าว","ถนนลาดพร้าว แขวงจอมพล เขตจตุจักร กรุงเทพฯ 10900","ทุกวัน 07:00 - 21:00","ต่ำกว่า 100 บาท",
                    R.drawable.img_view27,new Detail.Location(13.806198f, 100.573952f)),

                    new Detail("Pamm Cafe","MRT บางซื่อ","ถนนเทอดดำริห์ แขวงจตุจักร เขตจตุจักร กรุงเทพฯ 10900","จันทร์ - ศุกร์ 07:00 - 18:30\nเสาร์ 09:30 - 15:30","ต่ำกว่า 100 บาท",
                    R.drawable.img_view28,new Detail.Location(13.803435f, 100.539365f)),

                    new Detail("กระเพาไข่ระเบิด","MRT บางซื่อ","616/58 ถนนเตชะวณิช เขตบางซื่อ กรุงเทพฯ 10800","ทุกวัน 10:00 - 14:30\n17:00 - 21:00","ต่ำกว่า 100 บาท",
                    R.drawable.img_view29,new Detail.Location(13.801849f, 100.835266f)),

                    new Detail("ชำมะเลียง โรงแรมมิโด","MRT บางซื่อ","โรงแรมมิโด แขวงสามเสนใน เขตพญาไท กรุงเทพฯ 10400","จันทร์ - เสาร์ 06:00 - 23:59\nอาทิตย์ 06:00 - 23:00","251 - 500 บาท",
                    R.drawable.img_view30,new Detail.Location(13.790738f, 100.542660f)),
    };
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