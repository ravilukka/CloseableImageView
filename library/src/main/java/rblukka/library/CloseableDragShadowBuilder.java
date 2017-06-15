package rblukka.library;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by r.lukka on 15-06-2017.
 */

public class CloseableDragShadowBuilder extends View.DragShadowBuilder {

    private final Drawable shadow;
    private final Point offset;

    CloseableDragShadowBuilder(ImageView imageView, Point offset) {
        super(imageView);

        this.offset = offset;
        this.shadow = new ColorDrawable(Color.LTGRAY);
    }

    @Override
    public void onProvideShadowMetrics (Point size, Point touch) {
        final int width, height;

        width = (int) (getView().getWidth());
        height = (int) (getView().getHeight());

        shadow.setBounds(0, 0, width, height);
        size.set(width, height);
        touch.set(offset.x, offset.y);
    }

    @Override
    public void onDrawShadow(Canvas canvas) {
        shadow.draw(canvas);
        getView().draw(canvas);
    }
}
