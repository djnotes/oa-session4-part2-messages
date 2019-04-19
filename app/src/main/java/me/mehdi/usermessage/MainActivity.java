package me.mehdi.usermessage;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    ImageView mImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImage = findViewById(R.id.myImage);

        mImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View img) {
//                Toast.makeText(getApplicationContext(), "You clicked the image", Toast.LENGTH_LONG).show();
//                Snackbar.make(img, "You clicked the image", Snackbar.LENGTH_INDEFINITE).show();
             new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Hello")
                        .setMessage("You clicked the image")
                        .setPositiveButton("OK", null)
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "You clicked the image", Toast.LENGTH_LONG).show();

                            }
                        })
                        .show();


            }
        });
    }
}
