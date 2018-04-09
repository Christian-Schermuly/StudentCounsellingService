package fra.studentcounsellingservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class fachfinderActivity extends Activity {

    WebView view;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fachfinder);

        view = (WebView) findViewById(R.id.webView);
        url = "http://fach-finder.fh-frankfurt.de/";

        //WebViewStart(url);
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl(url);

        // BACK-KEY HANDLING
        view.setOnKeyListener(new View.OnKeyListener() {
                                  @Override
                                  public boolean onKey(View v, int keyCode, KeyEvent event) {
                                      if ((keyCode == KeyEvent.KEYCODE_BACK) && view.canGoBack()) {
                                          view.goBack();
                                          view.clearHistory();
                                          return true;
                                      }
                                      return false;
                                  }
                              }
        );

        Button back = (Button)findViewById(R.id.back_button);

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(fachfinderActivity.this, MainActivity.class);
                fachfinderActivity.this.startActivity(myIntent);
            }
        });
    }


}
