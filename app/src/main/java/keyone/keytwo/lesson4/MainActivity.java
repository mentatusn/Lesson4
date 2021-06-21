package keyone.keytwo.lesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String myString = getResources().getString(R.string.hello_text);

        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/19659.ttf");
        TextView textView = findViewById(R.id.textView);
        textView.setTypeface(tf);

        textView.setText(myString);


    }
}