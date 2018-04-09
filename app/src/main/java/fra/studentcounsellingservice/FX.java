package fra.studentcounsellingservice;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class FX {

    public static void slide_down(Context ctx, View view){

        Animation a = AnimationUtils.loadAnimation(ctx, R.anim.slide_down);
        if(a != null){
            a.reset();
            if(view != null){
                view.clearAnimation();
                view.startAnimation(a);
            }
        }
    }

    public  static void slide_up(Context ctx, View view){

        Animation a = AnimationUtils.loadAnimation(ctx, R.anim.slide_up);
        if (a!=null) {
            a.reset();
            if (view!=null){
                view.clearAnimation();
                view.startAnimation(a);
            }
        }
    }
}

