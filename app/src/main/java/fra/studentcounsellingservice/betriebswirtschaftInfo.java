//Architektur Content-Activity
//Author: Bagrat Pavolotskyi

package fra.studentcounsellingservice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class betriebswirtschaftInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wirtschaft_info);

        //Initialization of the Activity Layout
        Button back = (Button)findViewById(R.id.buttonBack);
        TextView studiengangText = (TextView)findViewById(R.id.studiengang);
        TextView abschlussText = (TextView)findViewById(R.id.abschluss);
        TextView profilText = (TextView)findViewById(R.id.profiltext);
        TextView passtText = (TextView)findViewById(R.id.passttext);
        TextView nachdemstudiumText = (TextView)findViewById(R.id.nachdemstudiumtext);
        TextView mehrinfosText = (TextView)findViewById(R.id.mehrinfostext);

        //Back Button
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        //Set Text-Content
        studiengangText.setText(getString(R.string.betriebswirtschaft));
        abschlussText.setText(getString(R.string.bachelorOA));
        profilText.setText(getString(R.string.profilBetriebswirtschaft));
        passtText.setText(getString(R.string.passtBetriebswirtschaft));
        nachdemstudiumText.setText(R.string.nachdemstudiumBetriebswirtschaft);
        mehrinfosText.setText(R.string.mehrinfosBetriebswirtschaft);

        //linkable Text
        mehrinfosText.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
