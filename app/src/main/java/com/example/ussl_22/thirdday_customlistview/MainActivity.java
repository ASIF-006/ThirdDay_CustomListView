package com.example.ussl_22.thirdday_customlistview;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    public static String[] itemname = {"Dhaka", "Delhi", "Kualalampur", "New York"};
    public static String[] itemloc = {"Bangladesh", "India", "Malaysia", "Usa"};
    Integer[] imgid = {
            R.drawable.a,R.drawable.marsh,R.drawable.minions,R.drawable.p_go_2
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter customListAdapter = new CustomListAdapter(this,itemname,imgid,itemloc) ;
        list = (ListView) findViewById(R.id.list_item);
        list.setAdapter(customListAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String contactId = ((TextView) view.findViewById(R.id.text_view_1)).getText().toString();

                    Toast.makeText(getApplicationContext(),contactId,Toast.LENGTH_SHORT).show();

            }
        });
    }
}
