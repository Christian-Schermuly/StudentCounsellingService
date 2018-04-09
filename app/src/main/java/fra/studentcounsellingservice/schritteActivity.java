package fra.studentcounsellingservice;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class schritteActivity extends AppCompatActivity {

    TextView textView, textView2, textView3, textView4, textView5, textView6;
    TextView sTextView, sTextView2, sTextView3, sTextView4, sTextView5, sTextView6;
    Button btn2, btn3, btn4, btn5, btn6, btn7;
    Button sBtn1, sBtn2, sBtn3, sBtn4, sBtn5, sBtn6;
    Drawable imgPlus, imgMinus;
    boolean firstImage=true, firstImage1=true, firstImage2=true, firstImage3=true, firstImage4=true,
            firstImage5=true;
    boolean secondImage1=true, secondImage2=true, secondImage3=true, secondImage4=true, secondImage5=true,
            secondImage6=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schritte);

        Button back = (Button)findViewById(R.id.backButton);

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(schritteActivity.this, MainActivity.class);
                schritteActivity.this.startActivity(myIntent);
            }
        });

        textView = (TextView) findViewById(R.id.textView);
        textView.setVisibility(View.GONE);
        textView2 = (TextView) findViewById(R.id.textView4);
        textView2.setVisibility(View.GONE);
        textView3 = (TextView) findViewById(R.id.textView5);
        textView3.setVisibility(View.GONE);
        textView4 = (TextView) findViewById(R.id.textView6);
        textView4.setVisibility(View.GONE);
        textView5 = (TextView) findViewById(R.id.textView7);
        textView5.setVisibility(View.GONE);
        textView6 = (TextView)findViewById(R.id.textView13);
        textView6.setVisibility(View.GONE);

        sTextView = (TextView) findViewById(R.id.textView8);
        sTextView.setVisibility(View.GONE);
        sTextView2 = (TextView)findViewById(R.id.textView9);
        sTextView2.setVisibility(View.GONE);
        sTextView3 = (TextView)findViewById(R.id.textView10);
        sTextView3.setVisibility(View.GONE);
        sTextView4 = (TextView)findViewById(R.id.textView11);
        sTextView4.setVisibility(View.GONE);
        sTextView5 = (TextView)findViewById(R.id.textView12);
        sTextView5.setVisibility(View.GONE);
        sTextView6 = (TextView)findViewById(R.id.textView14);
        sTextView6.setVisibility(View.GONE);

        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.button4);
        btn5 = (Button)findViewById(R.id.button5);
        btn6 = (Button)findViewById(R.id.button6);
        btn7 = (Button)findViewById(R.id.button12);

        sBtn1 = (Button)findViewById(R.id.button7);
        sBtn1.setVisibility(View.GONE);
        sBtn2 = (Button)findViewById(R.id.button8);
        sBtn2.setVisibility(View.GONE);
        sBtn3 = (Button)findViewById(R.id.button9);
        sBtn3.setVisibility(View.GONE);
        sBtn4 = (Button)findViewById(R.id.button10);
        sBtn4.setVisibility(View.GONE);
        sBtn5 = (Button)findViewById(R.id.button11);
        sBtn5.setVisibility(View.GONE);
        sBtn6 = (Button)findViewById(R.id.button13);
        sBtn6.setVisibility(View.GONE);

        imgPlus = getResources().getDrawable(R.drawable.plus);
        imgMinus = getResources().getDrawable(R.drawable.minus);

        imgMinus.setBounds(0,0,50,50);
        imgPlus.setBounds(0,0,50,50); //setBounds(int x,int y,int width,int height)

        btn2.setCompoundDrawables(imgPlus,null,null,null);
        btn3.setCompoundDrawables(imgPlus,null,null,null);
        btn4.setCompoundDrawables(imgPlus,null,null,null);
        btn5.setCompoundDrawables(imgPlus,null,null,null);
        btn6.setCompoundDrawables(imgPlus,null,null,null);
        btn7.setCompoundDrawables(imgPlus,null,null,null);

        sBtn1.setCompoundDrawables(imgPlus,null,null,null);
        sBtn2.setCompoundDrawables(imgPlus,null,null,null);
        sBtn3.setCompoundDrawables(imgPlus,null,null,null);
        sBtn4.setCompoundDrawables(imgPlus,null,null,null);
        sBtn5.setCompoundDrawables(imgPlus,null,null,null);
        sBtn6.setCompoundDrawables(imgPlus,null,null,null);


        TextView link1Text = (TextView)findViewById(R.id.textView13);
        link1Text.setText(Html.fromHtml(getString(R.string.twentysecondText)));
        link1Text.setMovementMethod(LinkMovementMethod.getInstance());
        TextView link2Text = (TextView)findViewById(R.id.textView14);
        link2Text.setText(Html.fromHtml(getString(R.string.twentyfourthText)));
        link2Text.setMovementMethod(LinkMovementMethod.getInstance());
        TextView link3Text = (TextView)findViewById(R.id.textView);
        link3Text.setText(Html.fromHtml(getString(R.string.firstText)));
        link3Text.setMovementMethod(LinkMovementMethod.getInstance());
        TextView link4Text = (TextView)findViewById(R.id.textView4);
        link4Text.setText(Html.fromHtml(getString(R.string.fourthText)));
        link4Text.setMovementMethod(LinkMovementMethod.getInstance());
        TextView link5Text = (TextView)findViewById(R.id.textView8);
        link5Text.setText(Html.fromHtml(getString(R.string.fourteenthText)));
        link5Text.setMovementMethod(LinkMovementMethod.getInstance());
        TextView link6Text = (TextView)findViewById(R.id.textView9);
        link6Text.setText(Html.fromHtml(getString(R.string.sixteenthText)));
        link6Text.setMovementMethod(LinkMovementMethod.getInstance());
        TextView link7Text = (TextView)findViewById(R.id.textView5);
        link7Text.setText(Html.fromHtml(getString(R.string.eightText)));
        link7Text.setMovementMethod(LinkMovementMethod.getInstance());
        TextView link8Text = (TextView)findViewById(R.id.textView10);
        link8Text.setText(Html.fromHtml(getString(R.string.eighteenthText)));
        link8Text.setMovementMethod(LinkMovementMethod.getInstance());
        TextView link9Text = (TextView)findViewById(R.id.textView6);
        link9Text.setText(Html.fromHtml(getString(R.string.tenthText)));
        link9Text.setMovementMethod(LinkMovementMethod.getInstance());
        TextView link10Text = (TextView)findViewById(R.id.textView11);
        link10Text.setText(Html.fromHtml(getString(R.string.twentythText)));
        link10Text.setMovementMethod(LinkMovementMethod.getInstance());
        TextView link11Text = (TextView)findViewById(R.id.textView7);
        link11Text.setText(Html.fromHtml(getString(R.string.twelvethText)));
        link11Text.setMovementMethod(LinkMovementMethod.getInstance());
        TextView link12Text = (TextView)findViewById(R.id.textView12);
        link12Text.setText(Html.fromHtml(getString(R.string.twentysixthText)));
        link12Text.setMovementMethod(LinkMovementMethod.getInstance());

        //btn2.setOnClickListener(doSomething);
        //btn3.setOnClickListener(doSomething);
        //btn4.setOnClickListener(doSomething);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstImage==true) {
                    //btn2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.plus,0,0,0);
                    //imgPlus.setBounds(0,0,50,50); //setBounds(int x,int y,int width,int height)
                    //btn2.setCompoundDrawables(imgPlus,null,null,null);
                    //final Drawable imgMinus = getResources().getDrawable(R.drawable.minus);
                    //imgMinus.setBounds(0,0,50,50);
                    btn2.setCompoundDrawables(imgMinus,null,null,null);
                    toggle_contents(v);
                    firstImage = false; }
                else {
                    //btn2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.minus,0,0,0);
                    //imgPlus.setBounds(0,0,50,50); //setBounds(int x,int y,int width,int height)
                    btn2.setCompoundDrawables(imgPlus,null,null,null);
                    sBtn1.setCompoundDrawables(imgPlus,null,null,null);
                    toggle_contents(v);
                    sTextView.setVisibility(View.GONE);
                    secondImage1=true;
                    firstImage = true;
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstImage1==true) {
                    btn3.setCompoundDrawables(imgMinus,null,null,null);
                    toggle_contents2(v);
                    firstImage1 = false; }
                else {
                    btn3.setCompoundDrawables(imgPlus,null,null,null);
                    sBtn2.setCompoundDrawables(imgPlus,null,null,null);
                    toggle_contents2(v);
                    sTextView2.setVisibility(View.GONE);
                    secondImage2=true;
                    firstImage1 = true;
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstImage2==true) {
                    btn4.setCompoundDrawables(imgMinus,null,null,null);
                    toggle_contents3(v);
                    firstImage2 = false; }
                else {
                    btn4.setCompoundDrawables(imgPlus,null,null,null);
                    sBtn3.setCompoundDrawables(imgPlus,null,null,null);
                    toggle_contents3(v);
                    sTextView3.setVisibility(View.GONE);
                    secondImage3=true;
                    firstImage2 = true;
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstImage3==true) {
                    btn5.setCompoundDrawables(imgMinus,null,null,null);
                    toggle_contents4(v);
                    firstImage3 = false; }
                else {
                    btn5.setCompoundDrawables(imgPlus,null,null,null);
                    sBtn4.setCompoundDrawables(imgPlus,null,null,null);
                    toggle_contents4(v);
                    sTextView4.setVisibility(View.GONE);
                    secondImage4=true;
                    firstImage3 = true;
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstImage4==true) {
                    btn6.setCompoundDrawables(imgMinus,null,null,null);
                    toggle_contents5(v);
                    firstImage4 = false; }
                else {
                    btn6.setCompoundDrawables(imgPlus,null,null,null);
                    sBtn5.setCompoundDrawables(imgPlus,null,null,null);
                    toggle_contents5(v);
                    sTextView5.setVisibility(View.GONE);
                    secondImage5=true;
                    firstImage4 = true;
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstImage5==true) {
                    btn7.setCompoundDrawables(imgMinus,null,null,null);
                    toggle_contents6(v);
                    firstImage5 = false; }
                else {
                    btn7.setCompoundDrawables(imgPlus,null,null,null);
                    sBtn6.setCompoundDrawables(imgPlus,null,null,null);
                    toggle_contents6(v);
                    sTextView6.setVisibility(View.GONE);
                    secondImage6=true;
                    firstImage5 = true;
                }
            }
        });

        sBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (secondImage1==true) {
                    //btn2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.plus,0,0,0);
                    //imgPlus.setBounds(0,0,50,50); //setBounds(int x,int y,int width,int height)
                    //btn2.setCompoundDrawables(imgPlus,null,null,null);
                    //final Drawable imgMinus = getResources().getDrawable(R.drawable.minus);
                    //imgMinus.setBounds(0,0,50,50);
                    sBtn1.setCompoundDrawables(imgMinus,null,null,null);
                    sToggle_contents(v);
                    secondImage1 = false; }
                else {
                    //btn2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.minus,0,0,0);
                    //imgPlus.setBounds(0,0,50,50); //setBounds(int x,int y,int width,int height)
                    sBtn1.setCompoundDrawables(imgPlus,null,null,null);
                    sToggle_contents(v);
                    secondImage1 = true;
                }
            }
        });

        sBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (secondImage2==true) {
                    sBtn2.setCompoundDrawables(imgMinus,null,null,null);
                    sToggle_contents2(v);
                    secondImage2 = false; }
                else {
                    sBtn2.setCompoundDrawables(imgPlus,null,null,null);
                    sToggle_contents2(v);
                    secondImage2 = true;
                }
            }
        });

        sBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (secondImage3==true) {
                    sBtn3.setCompoundDrawables(imgMinus,null,null,null);
                    sToggle_contents3(v);
                    secondImage3 = false; }
                else {
                    sBtn3.setCompoundDrawables(imgPlus,null,null,null);
                    sToggle_contents3(v);
                    secondImage3 = true;
                }
            }
        });

        sBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (secondImage4==true) {
                    sBtn4.setCompoundDrawables(imgMinus,null,null,null);
                    sToggle_contents4(v);
                    secondImage4 = false; }
                else {
                    sBtn4.setCompoundDrawables(imgPlus,null,null,null);
                    sToggle_contents4(v);
                    secondImage4 = true;
                }
            }
        });

        sBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (secondImage5==true) {
                    sBtn5.setCompoundDrawables(imgMinus,null,null,null);
                    sToggle_contents5(v);
                    secondImage5 = false; }
                else {
                    sBtn5.setCompoundDrawables(imgPlus,null,null,null);
                    sToggle_contents5(v);
                    secondImage5 = true;
                }
            }
        });

        sBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (secondImage6==true) {
                    sBtn6.setCompoundDrawables(imgMinus,null,null,null);
                    sToggle_contents6(v);
                    secondImage6 = false; }
                else {
                    sBtn6.setCompoundDrawables(imgPlus,null,null,null);
                    sToggle_contents6(v);
                    secondImage6 = true;
                }
            }
        });


    };

    //onClick TextViews
    public void toggle_contents(View view){

        if(textView.isShown()){
            FX.slide_up(this, textView);
            FX.slide_up(this, sBtn1);
            textView.setVisibility(View.GONE);
            sBtn1.setVisibility(View.GONE);
        }
        else{
            textView.setVisibility(View.VISIBLE);
            sBtn1.setVisibility(View.VISIBLE);
            FX.slide_down(this, textView);
            FX.slide_down(this, sBtn1);
        }
    }

    public void sToggle_contents(View view){

        if(sTextView.isShown()){
            FX.slide_up(this, textView);
            sTextView.setVisibility(View.GONE);
        }
        else{
            sTextView.setVisibility(View.VISIBLE);
            FX.slide_down(this, textView);
        }
    }

    public void toggle_contents2(View view){

        if(textView2.isShown()){
            FX.slide_up(this, textView2);
            FX.slide_up(this, sBtn2);
            textView2.setVisibility(View.GONE);
            sBtn2.setVisibility(View.GONE);
        }
        else{
            textView2.setVisibility(View.VISIBLE);
            sBtn2.setVisibility(View.VISIBLE);
            FX.slide_down(this, textView2);
            FX.slide_down(this, sBtn2);
        }
    }

    public void sToggle_contents2(View view){

        if(sTextView2.isShown()){
            FX.slide_up(this, textView2);
            sTextView2.setVisibility(View.GONE);
        }
        else{
            sTextView2.setVisibility(View.VISIBLE);
            FX.slide_down(this, textView2);
        }
    }

    public void toggle_contents3(View view){

        if(textView3.isShown()){
            FX.slide_up(this, textView3);
            FX.slide_up(this, sBtn3);
            textView3.setVisibility(View.GONE);
            sBtn3.setVisibility(View.GONE);
        }
        else{
            textView3.setVisibility(View.VISIBLE);
            sBtn3.setVisibility(View.VISIBLE);
            FX.slide_down(this, textView3);
            FX.slide_down(this, sBtn3);
        }
    }

    public void sToggle_contents3(View view){

        if(sTextView3.isShown()){
            FX.slide_up(this, textView3);
            sTextView3.setVisibility(View.GONE);
        }
        else{
            sTextView3.setVisibility(View.VISIBLE);
            FX.slide_down(this, textView3);
        }
    }

    public void toggle_contents4(View view){

        if(textView4.isShown()){
            FX.slide_up(this, textView4);
            FX.slide_up(this, sBtn4);
            textView4.setVisibility(View.GONE);
            sBtn4.setVisibility(View.GONE);
        }
        else{
            textView4.setVisibility(View.VISIBLE);
            sBtn4.setVisibility(View.VISIBLE);
            FX.slide_down(this, textView4);
            FX.slide_down(this, sBtn4);
        }
    }

    public void sToggle_contents4(View view){

        if(sTextView4.isShown()){
            FX.slide_up(this, textView4);
            sTextView4.setVisibility(View.GONE);
        }
        else{
            sTextView4.setVisibility(View.VISIBLE);
            FX.slide_down(this, textView4);
        }
    }

    public void toggle_contents5(View view){

        if(textView5.isShown()){
            FX.slide_up(this, textView5);
            FX.slide_up(this, sBtn5);
            textView5.setVisibility(View.GONE);
            sBtn5.setVisibility(View.GONE);
        }
        else{
            textView5.setVisibility(View.VISIBLE);
            sBtn5.setVisibility(View.VISIBLE);
            FX.slide_down(this, textView5);
            FX.slide_down(this, sBtn5);
        }
    }

    public void sToggle_contents5(View view){

        if(sTextView5.isShown()){
            FX.slide_up(this, textView5);
            sTextView5.setVisibility(View.GONE);
        }
        else{
            sTextView5.setVisibility(View.VISIBLE);
            FX.slide_down(this, textView5);
        }
    }

    public void toggle_contents6(View view){

        if(textView6.isShown()){
            FX.slide_up(this, textView6);
            FX.slide_up(this, sBtn6);
            textView6.setVisibility(View.GONE);
            sBtn6.setVisibility(View.GONE);
        }
        else{
            textView6.setVisibility(View.VISIBLE);
            sBtn6.setVisibility(View.VISIBLE);
            FX.slide_down(this, textView6);
            FX.slide_down(this, sBtn6);
        }
    }

    public void sToggle_contents6(View view){

        if(sTextView6.isShown()){
            FX.slide_up(this, textView6);
            sTextView6.setVisibility(View.GONE);
        }
        else{
            sTextView6.setVisibility(View.VISIBLE);
            FX.slide_down(this, textView6);
        }
    }

}


