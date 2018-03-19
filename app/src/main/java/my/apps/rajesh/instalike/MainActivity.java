package my.apps.rajesh.instalike;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv_like;
    boolean isLiked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_like = findViewById(R.id.iv_like);
        iv_like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isLiked) {

                    isLiked = false;
                    iv_like.setBackgroundResource(R.drawable.love_empty);
                    instaLikeeffect(v);

                } else {

                    isLiked = true;
                    iv_like.setBackgroundResource(R.drawable.love_fill);
                    instaLikeeffect(v);
                }
            }
        });
    }

    public void instaLikeeffect(final View view) {
        ObjectAnimator anim = ObjectAnimator.ofFloat(view, "scaleX", 0.8f, 1.2f, 1.0f);
        ObjectAnimator anim2 = ObjectAnimator.ofFloat(view, "scaleY", 0.8f, 1.2f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(anim, anim2);
        animatorSet.setDuration(2000);
        animatorSet.setInterpolator(new BounceInterpolator(0.1, 20));
        animatorSet.start();

    }
}
