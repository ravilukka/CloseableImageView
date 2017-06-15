package rblukka.closeableimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bumptech.glide.Glide;

import rblukka.library.CloseableImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CloseableImageView imageView = (CloseableImageView) findViewById(R.id.image);

        Glide.with(this).load(R.drawable.happy).into(imageView);

    }
}
