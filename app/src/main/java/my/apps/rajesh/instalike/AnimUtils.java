package my.apps.rajesh.instalike;

import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by Rajesh on 19-Mar-18.
 */

public class AnimUtils {

    public static void instaLikeeffect(View view)
    {
        // Make the object width 50%
        ObjectAnimator anim = ObjectAnimator.ofFloat(view,"scaleX",0.5f);
        anim.setDuration(1000); // duration 3 seconds
        anim.start();

        // Make the object height 50%
        ObjectAnimator anim2 = ObjectAnimator.ofFloat(view,"scaleY",0.5f);
        anim2.setDuration(1000); // duration 3 seconds
        anim2.start();
    }
}
