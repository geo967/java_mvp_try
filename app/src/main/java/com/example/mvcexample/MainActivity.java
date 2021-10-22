package com.example.mvcexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    Model myModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        textView=findViewById(R.id.text);

       myModel= new Model("android app",1000,4);
    }

    public void clickedButton(View view){

        displayText();
    }

    public void displayText(){
        textView=findViewById(R.id.text);

        textView.setText(myModel.getAppName()+"   "+myModel.getAppDownloads()+"   "+myModel.getAppRating());
    }
}

   // : View is TextView
   // : Model is model class
   //  : Controller is the MainActivity