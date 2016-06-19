package abrar_jgill_sbadola.fillitup;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final Button btnLocation = (Button)findViewById(R.id.btn_geolocation);
        btnLocation.setOnClickListener(new View.OnClickListener() {
         @Override
            public void onClick(View v) {
             Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
             startActivity(intent);
         }
        });

        final Button btnPrice = (Button)findViewById(R.id.btn_price);
        btnPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPrice = new Intent(getApplicationContext(), PricesActivity.class);
                startActivity(intentPrice);
            }
        });

        final Button btnCalc = (Button)findViewById(R.id.btnCalc);
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCalc = new Intent(getApplicationContext(), CalulatorActivity.class);
                startActivity(intentCalc);
            }
        });

        final Button btnGraph = (Button)findViewById(R.id.btn_graphs);
        btnGraph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGraph = new Intent(getApplicationContext(), GraphsActivity.class);
                startActivity(intentGraph);
            }
        });
    }


}
