package com.example.mad_311work;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText edt_name,edt_email,edt_pass;
    Button btn_sub,btn_change;

    ImageView imgv;

    static String TAG = "My Info";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagelayout);

    /*    edt_name = findViewById(R.id.edt_name);
        edt_email = findViewById(R.id.edt_email);
        edt_pass = findViewById(R.id.edt_pass);

        btn_sub = findViewById(R.id.btn_submit);


        final Toast toast = Toast.makeText(getApplicationContext(),"First Message",Toast.LENGTH_SHORT);

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = edt_name.getText().toString();
                String email = edt_email.getText().toString();

               Log.i(TAG,name);
               Log.i(TAG,email);
               Log.i(TAG,edt_pass.getText().toString());

               toast.setText("Second Message!");
               toast.setDuration(Toast.LENGTH_LONG);

               toast.show();

                Toast.makeText(getApplicationContext(),"Registration Done!",Toast.LENGTH_SHORT).show();
            }
        });

*/

    //Test Code 
    btn_change = findViewById(R.id.btn_change);
    imgv = findViewById(R.id.imageView);


    btn_change.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            imgv.setImageResource(R.drawable.mylogo);
        }
    });


    }
}
