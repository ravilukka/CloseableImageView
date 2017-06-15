package rblukka.library;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by r.lukka on 15-06-2017.
 */

public class CloseableImageView extends AppCompatImageView implements View.OnClickListener {
    private static final String FRAGMENT_TAG = "TAG";

    public CloseableImageView(Context context) {
        this(context, null);
    }

    public CloseableImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CloseableImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOnClickListener(this);
        setDrawingCacheEnabled(true);
        setAdjustViewBounds(true);
    }

    @Override
    public void onClick(View view) {
        if (getContext() instanceof AppCompatActivity) {
            final FullScreenImageFragment fragment = FullScreenImageFragment.newInstance(getDrawingCache());
            fragment.show(((AppCompatActivity) getContext()).getSupportFragmentManager(), FRAGMENT_TAG);
        }
    }

}
