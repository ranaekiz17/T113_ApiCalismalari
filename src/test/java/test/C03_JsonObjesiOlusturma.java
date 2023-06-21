package test;

import org.json.JSONObject;
import org.junit.Test;

public class C03_JsonObjesiOlusturma {

    @Test
    public void jsonObje01(){

        JSONObject ilkJsonObje = new JSONObject();

        ilkJsonObje.put("title","Ahmet");                 // key , value
        ilkJsonObje.put("body","Merhaba");
        ilkJsonObje.put("userId",1);

        System.out.println("Ilk Json Objemiz : " + ilkJsonObje);

    }


    @Test
    public void jsonObje02(){

        /*
                {
                 "firstname":"Jim",
                 "additionalneeds":"Breakfast",
                 "bookingdates":{
                         "checkin":"2018-01-01",
                         "checkout":"2019-01-01"
                    },
                  "totalprice":111,
                  "depositpaid":true,
                  "lastname":"Brown"
                  }
         */

        JSONObject bookingDates = new JSONObject();

        bookingDates.put("checkin","2018-01-01");
        bookingDates.put("checkout","2019-01-01");

        JSONObject outerJson = new JSONObject();

        outerJson.put("firstname","Jim");
        outerJson.put("additionalneeds","Breakfast");
        outerJson.put("totalprice",111);
        outerJson.put("depositpaid",true);
        outerJson.put("lastname","Brown");
        outerJson.put("bookingdates",bookingDates);    //bookingDates in degeri baska bir Jason objesi

        System.out.println("Booking Json Objemiz :" +outerJson);
    }
}
