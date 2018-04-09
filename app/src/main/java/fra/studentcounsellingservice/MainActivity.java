package fra.studentcounsellingservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton interessentest = (ImageButton)findViewById(R.id.interessenstestButton);
        ImageButton beratung = (ImageButton)findViewById(R.id.beratungButton);
        ImageButton schritte = (ImageButton)findViewById(R.id.schritteButton);
        ImageButton studiengaenge = (ImageButton)findViewById(R.id.studiengaengeButton);

        interessentest.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent interessentestIntent = new Intent(MainActivity.this, fachfinderStartActivity.class);
                MainActivity.this.startActivity(interessentestIntent);
            }
        });

        beratung.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent beratungIntent = new Intent(MainActivity.this, beratungActivity.class);
                MainActivity.this.startActivity(beratungIntent);
            }
        });

        schritte.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent schritteIntent = new Intent(MainActivity.this, schritteActivity.class);
                MainActivity.this.startActivity(schritteIntent);
            }
        });

        studiengaenge.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent studiengangIntent = new Intent(MainActivity.this, studiengangActivity.class);
                MainActivity.this.startActivity(studiengangIntent);
            }
        });


    }
}
