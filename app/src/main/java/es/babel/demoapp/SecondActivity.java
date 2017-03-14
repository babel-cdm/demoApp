package es.babel.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView img = (ImageView) findViewById(R.id.img);
        TextView tView = (TextView) findViewById(R.id.txt_result);

        boolean swt = getIntent().getBooleanExtra("SWT", false);
        String txt = getIntent().getStringExtra("TXT");

        if (swt) {
            img.setVisibility(View.VISIBLE);
        } else {
            img.setVisibility(View.GONE);
        }

        tView.setText(txt);
    }
}
