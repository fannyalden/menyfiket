package com.example.fnny.testapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class KaffeKort extends Activity {

        Button imageButton1, imageButton2, imageButton3,
               imageButton4, imageButton5, imageButton6,
               imageButton7, imageButton8, imageButton9,
               imageButton10, imageButton11;

        final Context context = this;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_coffee);

            View.OnClickListener buttonListener =  new View.OnClickListener(){

                public void onClick(View v)
                {
                    if(v.getId() == R.id.imageButton1)
                    {

                        //Dialogruta
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        //alertDialogBuilder.setTitle("Är du helt hundra på detta?");

                        alertDialogBuilder
                                .setMessage("Vill du köpa kaffe?")
                                .setCancelable(false)
                                .setPositiveButton("Nej",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        // if this button is clicked, close
                                        // MainCoffee.this.finish();
                                        dialog.cancel();
                                    }
                                })
                                .setNegativeButton("Ja",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        // if this button is clicked, just close
                                        // the dialog box and do nothing
                                        imageButton1.setOnClickListener(null);
                                        imageButton1.setBackgroundResource(R.drawable.kaffenej);
                                        dialog.cancel();
                                    }
                                });

                        // create alert dialog
                        AlertDialog alertDialog = alertDialogBuilder.create();

                        // show it
                        alertDialog.show();

                        Toast.makeText(KaffeKort.this,
                                "ImageButton is clicked!",
                                Toast.LENGTH_SHORT).show();


                    }

                    if(v.getId() == R.id.imageButton2)
                    {

                        //Dialogruta
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        //alertDialogBuilder.setTitle("Är du helt hundra på detta?");

                        alertDialogBuilder
                                .setMessage("Vill du köpa kaffe?")
                                .setCancelable(false)
                                .setPositiveButton("Nej",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        // if this button is clicked, close
                                        // MainCoffee.this.finish();
                                        dialog.cancel();
                                    }
                                })
                                .setNegativeButton("Ja",new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog,int id) {
                                                // if this button is clicked, just close
                                                // the dialog box and do nothing
                                                imageButton2.setOnClickListener(null);
                                                imageButton2.setBackgroundResource(R.drawable.kaffenej);
                                                dialog.cancel();
                                            }
                                        }

                                );

                        // create alert dialog
                        AlertDialog alertDialog = alertDialogBuilder.create();

                        // show it
                        alertDialog.show();

                        Toast.makeText(KaffeKort.this,
                                "ImageButton is clicked!",
                                Toast.LENGTH_SHORT).show();
                    }
                    if(v.getId() == R.id.imageButton3)
                    {
                        //Dialogruta
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        //alertDialogBuilder.setTitle("Är du helt hundra på detta?");

                        alertDialogBuilder
                                .setMessage("Vill du köpa kaffe?")
                                .setCancelable(false)
                                .setPositiveButton("Nej",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        // if this button is clicked, close
                                        // MainCoffee.this.finish();
                                        dialog.cancel();
                                    }
                                })
                                .setNegativeButton("Ja",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        // if this button is clicked, just close
                                        // the dialog box and do nothing
                                        imageButton3.setOnClickListener(null);
                                        imageButton3.setBackgroundResource(R.drawable.kaffenej);
                                        dialog.cancel();
                                    }
                                });

                        // create alert dialog
                        AlertDialog alertDialog = alertDialogBuilder.create();

                        // show it
                        alertDialog.show();

                        Toast.makeText(KaffeKort.this,
                                "ImageButton is clicked!",
                                Toast.LENGTH_SHORT).show();
                    }

                }
            };

            imageButton1 = (Button) findViewById(R.id.imageButton1);
            imageButton2 = (Button) findViewById(R.id.imageButton2);
            imageButton3 = (Button) findViewById(R.id.imageButton3);
           /* imageButton4 = (Button) findViewById(R.id.imageButton4);
            imageButton5 = (Button) findViewById(R.id.imageButton5);
            imageButton6 = (Button) findViewById(R.id.imageButton6);*/

            imageButton1.setOnClickListener(buttonListener);
            imageButton2.setOnClickListener(buttonListener);
            imageButton3.setOnClickListener(buttonListener);
        //    imageButton4.setOnClickListener(buttonListener);
        //    imageButton5.setOnClickListener(buttonListener);
         //   imageButton6.setOnClickListener(buttonListener);



        }



    }

