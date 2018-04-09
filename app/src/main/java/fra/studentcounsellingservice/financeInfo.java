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

public class financeInfo extends YouTubeBaseActivity  implements YouTubePlayer.OnInitializedListener{

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
        studiengangText.setText(getString(R.string.intFinance));
        abschlussText.setText(getString(R.string.bachelorOS));
        profilText.setText(getString(R.string.profilFinance));
        passtText.setText(getString(R.string.passtFinance));
        nachdemstudiumText.setText(R.string.nachdemstudiumFinance);
        mehrinfosText.setText(R.string.mehrinfosFinance);

        //linkable Text
        mehrinfosText.setMovementMethod(LinkMovementMethod.getInstance());
    }
    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider,
                                        YouTubePlayer player, boolean wasRestored) {
        if (!wasRestored) player.cueVideo("bRHv8rgLLdg"); // your video to play
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
