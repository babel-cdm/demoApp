package es.babel.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText input = (EditText) findViewById(R.id.input);
        final Switch swt = (Switch) findViewById(R.id.swt);
        Button btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String textoIntroducido = input.getText().toString();
                boolean checked = swt.isChecked();

                if (textoIntroducido.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Debes introducir algo", Toast.LENGTH_SHORT).show();
                } else {

                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                    intent.putExtra("SWT", checked);
                    intent.putExtra("TXT", textoIntroducido);

                    startActivity(intent);

                    finish();

                }

            }
        });
    }
}
