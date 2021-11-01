package com.example.android.earthquakeretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView txtData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtData = (TextView) findViewById(R.id.txtData);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://pixabay.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //https://pixabay.com/api/?key=11778875-bd18dbcb72c8cc6ad02f06b46&q=animal+love&image_type=photo
        JasonPlaceHolderApi jasonPlaceHolderApi =retrofit.create(JasonPlaceHolderApi.class);
        //Call<List<Properties>> call =jasonPlaceHolderApi.getProperties("geojson","2019-01-01","2019-01-02");

            //Call<Root> call = jasonPlaceHolderApi.getProperties("http://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2019-01-01&endtime=2019-01-02");
            //Call<Root> call = jasonPlaceHolderApi.getData();
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            String startDate = year+"-"+ (month+1) +"-"+day;
            String endDate = year+"-"+ (month+1) +"-"+(day+1);
            //Toast.makeText(this,startDate,Toast.LENGTH_SHORT).show();
            //Toast.makeText(this,endDate,Toast.LENGTH_SHORT).show();
            Call<Root> call = jasonPlaceHolderApi.getProperties("https://pixabay.com/api/?key=11778875-bd18dbcb72c8cc6ad02f06b46&q=animal+love&image_type=photo");
            //Call<Root> call = jasonPlaceHolderApi.getProperties();
        call.enqueue(new Callback<Root>() {
            @Override
            public void onResponse(Call<Root> call, Response<Root> response) {
                if(response.isSuccessful())
                {
                    Root root =response.body();
                    List<FeaturesItem> features = root.getFeatures();
                        for(FeaturesItem featuresItem:features)
                        {
                            String content = "";
                            content += "id: " + featuresItem.getId() + "\n";
                            content += "user: " + featuresItem.getuser() + "\n";
                            content += "likes: " + featuresItem.getlikes() + "\n\n";
                            txtData.append(content);
                        }
                }
                else
                    txtData.setText("Code: "+response.code());
            }
            @Override
            public void onFailure(Call<Root> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_LONG);
            }
        });
    }
}
