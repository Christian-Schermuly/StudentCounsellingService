//Architektur Content-Activity
//Author: Bagrat Pavolotskyi

package fra.studentcounsellingservice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;



public class bauingenieurInfo extends YouTubeBaseActivity  implements YouTubePlayer.OnInitializedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_architektur_info);

        //Initialization of the Activity Layout
        Button back = (Button) findViewById(R.id.buttonBack);
        TextView studiengangText = (TextView) findViewById(R.id.studiengang);
        TextView abschlussText = (TextView) findViewById(R.id.abschluss);
        TextView profilText = (TextView) findViewById(R.id.profiltext);
        TextView passtText = (TextView) findViewById(R.id.passttext);
        TextView nachdemstudiumText = (TextView) findViewById(R.id.nachdemstudiumtext);
        TextView mehrinfosText = (TextView) findViewById(R.id.mehrinfostext);

        YouTubePlayerView youTubeView = (YouTubePlayerView)
                findViewById(R.id.youtube_view);
        youTubeView.initialize(DeveloperKey.DEVELOPER_KEY, this);

        //Back Button
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        //Set Text-Content
        studiengangText.setText(getString(R.string.bauingenieurwesen));
        abschlussText.setText(getString(R.string.bachelorOE));
        profilText.setText(getString(R.string.profilBauingenieur));
        passtText.setText(getString(R.string.passtBauingenieur));
        nachdemstudiumText.setText(R.string.nachdemstudiumBauningenieur);
        mehrinfosText.setText(R.string.mehrinfosBauingenieur);

        //linkable Text
        mehrinfosText.setMovementMethod(LinkMovementMethod.getInstance());

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider,
                                        YouTubePlayer player, boolean wasRestored) {
        if (!wasRestored) player.cueVideo("zBum9GGU1d4"); // your video to play
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
