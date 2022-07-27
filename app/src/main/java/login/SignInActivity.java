package login;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.design.R;

public class SignInActivity extends AppCompatActivity {
ImageView imageView;
Drawable drawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        imageView=findViewById(R.id.img);
        imageView.setImageResource(R.drawable.imv);
        getSupportActionBar().hide();
    }
}