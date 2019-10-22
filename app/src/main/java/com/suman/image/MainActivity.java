package com.suman.image;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioButton rdohm, rdotm, rdodm;
    ImageView imgHero;
  AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        rdohm = findViewById(R.id.txthm);
        rdotm = findViewById(R.id.txttm);
        rdodm = findViewById(R.id.txtdm);

        imgHero = findViewById(R.id.imga);
        builder = new AlertDialog.Builder(this);

        rdohm.setOnClickListener(this);
        rdotm.setOnClickListener(this);
        rdodm.setOnClickListener(this);
    }

    public void dialogbox(final int imagepar){
        builder.setMessage("Do you want to view photo?")
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        imgHero.setImageResource(imagepar);
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });
        AlertDialog alert = builder.create();
        alert.show();





    }

    @Override
    public void onClick(View v) {


        switch (v.getId())
        {
            case R.id.txthm:

                dialogbox(R.drawable.index2);
                break;
            case R.id.txttm:
              dialogbox(R.drawable.index);
                break;
            case R.id.txtdm:
               dialogbox(R.drawable.index1);
        }
    }
}
