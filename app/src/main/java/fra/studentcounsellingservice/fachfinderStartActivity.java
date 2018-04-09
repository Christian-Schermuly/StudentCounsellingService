package fra.studentcounsellingservice;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class fachfinderStartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fachfinder_start);

        Button back = (Button)findViewById(R.id.backButton);
        Button test = (Button)findViewById(R.id.button);

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentBack = new Intent(fachfinderStartActivity.this, MainActivity.class);
                fachfinderStartActivity.this.startActivity(intentBack);
            }
        });

        test.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentFachfinder = new Intent(fachfinderStartActivity.this, fachfinderActivity.class);
                fachfinderStartActivity.this.startActivity(intentFachfinder);
            }
        });

    }

}
