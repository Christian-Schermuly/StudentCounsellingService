package fra.studentcounsellingservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;

public class studiengangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studiengang);

        Button back = (Button)findViewById(R.id.backButton);
        Spinner fbchooser = (Spinner)findViewById(R.id.spinnerFB);
        final LinearLayout secondtext = (LinearLayout) findViewById(R.id.auswahl1);
        final RelativeLayout architektur = (RelativeLayout) findViewById(R.id.archiauswahl);
        final RelativeLayout informatik = (RelativeLayout)findViewById(R.id.informatikauswahl);
        final RelativeLayout wirtschaft = (RelativeLayout)findViewById(R.id.wirtschaftauswahl);
        final RelativeLayout sozialearbeit = (RelativeLayout)findViewById(R.id.sozialauswahl);

        //Back Button
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(studiengangActivity.this, MainActivity.class);
                studiengangActivity.this.startActivity(myIntent);
            }
        });

        //FB Chooser (Spinner)
        fbchooser.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    secondtext.setVisibility(View.INVISIBLE);
                    architektur.setVisibility(View.INVISIBLE);
                    informatik.setVisibility(View.INVISIBLE);
                    wirtschaft.setVisibility(View.INVISIBLE);
                    sozialearbeit.setVisibility(View.INVISIBLE);
                }
                if (position == 1) {
                    secondtext.setVisibility(View.VISIBLE);
                    architektur.setVisibility(View.VISIBLE);
                    informatik.setVisibility(View.INVISIBLE);
                    wirtschaft.setVisibility(View.INVISIBLE);
                    sozialearbeit.setVisibility(View.INVISIBLE);
                }
                if (position == 2) {
                    secondtext.setVisibility(View.VISIBLE);
                    architektur.setVisibility(View.INVISIBLE);
                    informatik.setVisibility(View.VISIBLE);
                    wirtschaft.setVisibility(View.INVISIBLE);
                    sozialearbeit.setVisibility(View.INVISIBLE);
                }
                if (position == 3) {
                    secondtext.setVisibility(View.VISIBLE);
                    architektur.setVisibility(View.INVISIBLE);
                    informatik.setVisibility(View.INVISIBLE);
                    wirtschaft.setVisibility(View.VISIBLE);
                    sozialearbeit.setVisibility(View.INVISIBLE);

                }
                if (position == 4) {
                    secondtext.setVisibility(View.VISIBLE);
                    architektur.setVisibility(View.INVISIBLE);
                    informatik.setVisibility(View.INVISIBLE);
                    wirtschaft.setVisibility(View.INVISIBLE);
                    sozialearbeit.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        String spinnerValue = fbchooser.getSelectedItem().toString();


        //FB1 Buttons
        Button architekturButton = (Button)findViewById(R.id.archbutton1);
        Button bauingenieurButton = (Button)findViewById(R.id.archbutton2);
        Button bauingenieurDualButton = (Button)findViewById(R.id.archbutton3);
        Button geoButton = (Button)findViewById(R.id.archbutton4);

        architekturButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentArchitektur = new Intent(studiengangActivity.this, architectureInfo.class);
                studiengangActivity.this.startActivity(intentArchitektur);
            }
        });

        bauingenieurButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentBauingenieur = new Intent(studiengangActivity.this, bauingenieurInfo.class);
                studiengangActivity.this.startActivity(intentBauingenieur);
            }
        });

        bauingenieurDualButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentBauingenieurDual = new Intent(studiengangActivity.this, bauingenieurDualInfo.class);
                studiengangActivity.this.startActivity(intentBauingenieurDual);
            }
        });

        geoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentGeo = new Intent(studiengangActivity.this, geoInfo.class);
                studiengangActivity.this.startActivity(intentGeo);
            }
        });

        //FB2 Buttons
        Button bioButton = (Button)findViewById(R.id.infobutton1);
        Button wirtschaftsinfoIntButton = (Button)findViewById(R.id.infobutton2);
        Button wirtschaftsinfoTransButton = (Button)findViewById(R.id.infobutton3);
        Button elektrotechnikButton = (Button)findViewById(R.id.infobutton4);
        Button energieButton = (Button)findViewById(R.id.infobutton5);
        Button informatikMobButton = (Button)findViewById(R.id.infobutton6);
        Button informatikButton = (Button)findViewById(R.id.infobutton7);
        Button informationssystemtechnikButton = (Button)findViewById(R.id.infobutton8);
        Button maschinenbauButton = (Button)findViewById(R.id.infobutton9);
        Button maschinenbauDoppelButton = (Button)findViewById(R.id.infobutton10);
        Button mechatronikButton = (Button)findViewById(R.id.infobutton11);
        Button produktentwicklungButton = (Button)findViewById(R.id.infobutton12);
        Button serviceengineeringButton = (Button)findViewById(R.id.infobutton13);
        Button wirtschaftsingenieurwesenButton = (Button)findViewById(R.id.infobutton14);

        bioButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentBio = new Intent(studiengangActivity.this, bioInfo.class);
                studiengangActivity.this.startActivity(intentBio);
            }
        });

        wirtschaftsinfoIntButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentWirtschaftsinfoInt = new Intent(studiengangActivity.this, wirtschaftsinformatikIntInfo.class);
                studiengangActivity.this.startActivity(intentWirtschaftsinfoInt);
            }
        });

        wirtschaftsinfoTransButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentWirtschaftsinfoTrans = new Intent(studiengangActivity.this, wirtschaftsinformatikTransInfo.class);
                studiengangActivity.this.startActivity(intentWirtschaftsinfoTrans);
            }
        });

        elektrotechnikButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentElektrotechnik = new Intent(studiengangActivity.this, elektrotechnikInfo.class);
                studiengangActivity.this.startActivity(intentElektrotechnik);
            }
        });

        energieButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentEnergie = new Intent(studiengangActivity.this, energieInfo.class);
                studiengangActivity.this.startActivity(intentEnergie);
            }
        });

        informatikMobButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentInformatikMob = new Intent(studiengangActivity.this, informatikMobInfo.class);
                studiengangActivity.this.startActivity(intentInformatikMob);
            }
        });

        informatikButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentInformatik = new Intent(studiengangActivity.this, informatikInfo.class);
                studiengangActivity.this.startActivity(intentInformatik);
            }
        });

        informationssystemtechnikButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentInformationssystemtechnik = new Intent(studiengangActivity.this, informationssystemtechnikInfo.class);
                studiengangActivity.this.startActivity(intentInformationssystemtechnik);
            }
        });

        maschinenbauButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentMaschinenbau = new Intent(studiengangActivity.this, maschinenbauInfo.class);
                studiengangActivity.this.startActivity(intentMaschinenbau);
            }
        });

        maschinenbauDoppelButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentMaschinenbauDoppel = new Intent(studiengangActivity.this, mschinenbauDoppelInfo.class);
                studiengangActivity.this.startActivity(intentMaschinenbauDoppel);
            }
        });

        mechatronikButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentMechatronik = new Intent(studiengangActivity.this, machatronikInfo.class);
                studiengangActivity.this.startActivity(intentMechatronik);
            }
        });

        produktentwicklungButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentProduktentwicklung = new Intent(studiengangActivity.this, produktentwicklungInfo.class);
                studiengangActivity.this.startActivity(intentProduktentwicklung);
            }
        });

        serviceengineeringButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentServiceengineering = new Intent(studiengangActivity.this, serviceengineeringInfo.class);
                studiengangActivity.this.startActivity(intentServiceengineering);
            }
        });

        wirtschaftsingenieurwesenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentWirtschaftsingenieurswesen = new Intent(studiengangActivity.this, wirtschaftsingenieurswesenInfo.class);
                studiengangActivity.this.startActivity(intentWirtschaftsingenieurswesen);
            }
        });

        //FB3 Buttons
        Button betriebswirtschaftButton = (Button)findViewById(R.id.wirtschaftbutton1);
        Button betriebswirtschaftDoppelButton = (Button)findViewById(R.id.wirtschaftbutton2);
        Button businessAdminButton = (Button)findViewById(R.id.wirtschaftbutton3);
        Button intFinanceButton = (Button)findViewById(R.id.wirtschaftbutton4);
        Button luftverkehrsmanagementButton = (Button)findViewById(R.id.wirtschaftbutton5);
        Button publicAdminButton = (Button)findViewById(R.id.wirtschaftbutton6);
        Button nonProfitButton = (Button)findViewById(R.id.wirtschaftbutton7);
        Button tourismusmanagementButton = (Button)findViewById(R.id.wirtschaftbutton8);
        Button wirtschaftsrechtButton = (Button)findViewById(R.id.wirtschaftbutton9);

        betriebswirtschaftButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentBetriebswirtschaft = new Intent(studiengangActivity.this, betriebswirtschaftInfo.class);
                studiengangActivity.this.startActivity(intentBetriebswirtschaft);
            }
        });

        betriebswirtschaftDoppelButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentBetriebswirtschaftDoppel = new Intent(studiengangActivity.this, betriebswirtschaftDoppelInfo.class);
                studiengangActivity.this.startActivity(intentBetriebswirtschaftDoppel);
            }
        });

        businessAdminButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentBusinessAdmin = new Intent(studiengangActivity.this, businessAdminInfo.class);
                studiengangActivity.this.startActivity(intentBusinessAdmin);
            }
        });

        intFinanceButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentFinance = new Intent(studiengangActivity.this, financeInfo.class);
                studiengangActivity.this.startActivity(intentFinance);
            }
        });

        luftverkehrsmanagementButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentLufverkehr = new Intent(studiengangActivity.this, luftverkehrsmanagementInfo.class);
                studiengangActivity.this.startActivity(intentLufverkehr);
            }
        });

        publicAdminButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentPublicAdmin = new Intent(studiengangActivity.this, publicAdminInfo.class);
                studiengangActivity.this.startActivity(intentPublicAdmin);
            }
        });

        nonProfitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentNonProfit = new Intent(studiengangActivity.this, nonProfitInfo.class);
                studiengangActivity.this.startActivity(intentNonProfit);
            }
        });

        tourismusmanagementButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentTourismus = new Intent(studiengangActivity.this, tourismusmanagementInfo.class);
                studiengangActivity.this.startActivity(intentTourismus);
            }
        });

        wirtschaftsrechtButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentWirtschaftsrecht = new Intent(studiengangActivity.this, wirtschaftsrechtInfo.class);
                studiengangActivity.this.startActivity(intentWirtschaftsrecht);
            }
        });

        //FB4 Buttons
        Button pflegeButton = (Button)findViewById(R.id.sozialbutton1);
        Button pflegeCaseButton = (Button)findViewById(R.id.sozialbutton2);
        Button sozialeArbeitButton = (Button)findViewById(R.id.sozialbutton3);
        Button sozialeArbeitTransButton = (Button)findViewById(R.id.sozialbutton4);

        pflegeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentPflege = new Intent(studiengangActivity.this, pflegeInfo.class);
                studiengangActivity.this.startActivity(intentPflege);
            }
        });

        pflegeCaseButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentPflegeCase = new Intent(studiengangActivity.this, pflegeCaseManagementInfo.class);
                studiengangActivity.this.startActivity(intentPflegeCase);
            }
        });

        sozialeArbeitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentSozialeArbeit = new Intent(studiengangActivity.this, sozialeArbeitInfo.class);
                studiengangActivity.this.startActivity(intentSozialeArbeit);
            }
        });

        sozialeArbeitTransButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentSozialeArbeitTrans = new Intent(studiengangActivity.this, sozialeArbeitTransInfo.class);
                studiengangActivity.this.startActivity(intentSozialeArbeitTrans);
            }
        });
    }
}
