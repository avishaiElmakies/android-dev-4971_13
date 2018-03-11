package haifa.jb.countrymanager;

import org.json.JSONException;
import org.json.JSONObject;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView txt1, txt2;
    BasicCountryInfo basicCountryInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1=(TextView)(findViewById(R.id.nameJson));
        txt2=(TextView)(findViewById(R.id.flagJson));
        //JSONObject gets a string and converts it to a json object
        //we must to wrap the "jsonObject" with try and catch
        try {
            JSONObject jsonObject=new JSONObject("{flag:'Israel.jpg'; name:'Israel'}");


            String flagVal=jsonObject.getString("flag");
            String nameVal=jsonObject.getString("name");

            basicCountryInfo=new BasicCountryInfo(flagVal,nameVal);

            txt1.setText("name: "+basicCountryInfo.getName());
            txt2.setText("flag: "+basicCountryInfo.getFlag());

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
