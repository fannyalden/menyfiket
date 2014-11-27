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

                    }

                    if(v.getId() == R.id.imageButton4)
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
                                        imageButton4.setOnClickListener(null);
                                        imageButton4.setBackgroundResource(R.drawable.kaffenej);
                                        dialog.cancel();
                                    }
                                });
                        // create alert dialog
                        AlertDialog alertDialog = alertDialogBuilder.create();

                        // show it
                        alertDialog.show();

                    }

                    if(v.getId() == R.id.imageButton5)
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
                                        imageButton5.setOnClickListener(null);
                                        imageButton5.setBackgroundResource(R.drawable.kaffenej);
                                        dialog.cancel();
                                    }
                                });
                        // create alert dialog
                        AlertDialog alertDialog = alertDialogBuilder.create();

                        // show it
                        alertDialog.show();

                    }

                    if(v.getId() == R.id.imageButton6)
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
                                        imageButton6.setOnClickListener(null);
                                        imageButton6.setBackgroundResource(R.drawable.kaffenej);
                                        dialog.cancel();
                                    }
                                });
                        // create alert dialog
                        AlertDialog alertDialog = alertDialogBuilder.create();

                        // show it
                        alertDialog.show();

                    }

                    if(v.getId() == R.id.imageButton7)
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
                                        imageButton7.setOnClickListener(null);
                                        imageButton7.setBackgroundResource(R.drawable.kaffenej);
                                        dialog.cancel();
                                    }
                                });
                        // create alert dialog
                        AlertDialog alertDialog = alertDialogBuilder.create();

                        // show it
                        alertDialog.show();

                    }

                    if(v.getId() == R.id.imageButton8)
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
                                        imageButton8.setOnClickListener(null);
                                        imageButton8.setBackgroundResource(R.drawable.kaffenej);
                                        dialog.cancel();
                                    }
                                });
                        // create alert dialog
                        AlertDialog alertDialog = alertDialogBuilder.create();

                        // show it
                        alertDialog.show();

                    }

                    if(v.getId() == R.id.imageButton9)
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
                                        imageButton9.setOnClickListener(null);
                                        imageButton9.setBackgroundResource(R.drawable.kaffenej);
                                        dialog.cancel();
                                    }
                                });
                        // create alert dialog
                        AlertDialog alertDialog = alertDialogBuilder.create();

                        // show it
                        alertDialog.show();

                    }

                    if(v.getId() == R.id.imageButton10)
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
                                        imageButton10.setOnClickListener(null);
                                        imageButton10.setBackgroundResource(R.drawable.kaffenej);
                                        dialog.cancel();
                                    }
                                });
                        // create alert dialog
                        AlertDialog alertDialog = alertDialogBuilder.create();

                        // show it
                        alertDialog.show();

                    }

                    if(v.getId() == R.id.imageButton11)
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
                                        imageButton11.setOnClickListener(null);
                                        imageButton11.setBackgroundResource(R.drawable.kaffenej);
                                        dialog.cancel();
                                    }
                                });
                        // create alert dialog
                        AlertDialog alertDialog = alertDialogBuilder.create();

                        // show it
                        alertDialog.show();

                    }
                }
            };

            imageButton1 = (Button) findViewById(R.id.imageButton1);
            imageButton2 = (Button) findViewById(R.id.imageButton2);
            imageButton3 = (Button) findViewById(R.id.imageButton3);
            imageButton4 = (Button) findViewById(R.id.imageButton4);
            imageButton5 = (Button) findViewById(R.id.imageButton5);
            imageButton6 = (Button) findViewById(R.id.imageButton6);

            imageButton7 = (Button) findViewById(R.id.imageButton7);
            imageButton8 = (Button) findViewById(R.id.imageButton8);
            imageButton9 = (Button) findViewById(R.id.imageButton9);
            imageButton10 = (Button) findViewById(R.id.imageButton10);
            imageButton11 = (Button) findViewById(R.id.imageButton11);


            imageButton1.setOnClickListener(buttonListener);
            imageButton2.setOnClickListener(buttonListener);
            imageButton3.setOnClickListener(buttonListener);
            imageButton4.setOnClickListener(buttonListener);
            imageButton5.setOnClickListener(buttonListener);
            imageButton6.setOnClickListener(buttonListener);

            imageButton7.setOnClickListener(buttonListener);
            imageButton8.setOnClickListener(buttonListener);
            imageButton9.setOnClickListener(buttonListener);
            imageButton10.setOnClickListener(buttonListener);
            imageButton11.setOnClickListener(buttonListener);



        }



    }

