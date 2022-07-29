package UiDesignActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.design.R;

public class UiDesignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uidesign);
        getSupportActionBar().hide();
    }

}