package abrar_jgill_sbadola.fillitup;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class GraphsActivity extends AppCompatActivity {

    Spinner spinner; ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphs);

        Intent intent = getIntent();

        spinner = (Spinner) findViewById(R.id.spinner);

        // Defined Array values to show in spinner
        String[] values = new String[] {
                "Mid-size Car", "Small SUV", "Large Suv", "Midsize Diesel Car",
                "Large Diesel SUV", "Insight HEV", "Prius HEV", "All"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        // Assign adapter to ListView
        spinner.setAdapter(adapter);
        img = (ImageView)findViewById(R.id.img);
        Button btnDone = (Button)findViewById(R.id.btn_done);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String selection = spinner.getSelectedItem().toString();
                img.setImageResource(android.R.color.transparent);
                if(selection.contains("Mid-size")){
                    img.setImageResource(R.drawable.midsizecar);
                }
                else if(selection.contains("Small")){
                    img.setImageResource(R.drawable.smallsuv);
                }
                else if(selection.contains("Large S")){
                    img.setImageResource(R.drawable.largesuv);
                }
                else if(selection.contains("Midsize")){
                    img.setImageResource(R.drawable.midsizedieselcar);
                }
                else if(selection.contains("Large D")){
                    img.setImageResource(R.drawable.largedieselsuv);
                }
                else if(selection.contains("Insight")){
                    img.setImageResource(R.drawable.insighthev);
                }
                else if(selection.contains("Prius")){
                    img.setImageResource(R.drawable.priushev);
                }
                else {
                    img.setImageResource(R.drawable.all);
                }
            }
        });

  /*      final Button btnHome = (Button)findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHome = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentHome);
            }
        });
*/
    }

}
