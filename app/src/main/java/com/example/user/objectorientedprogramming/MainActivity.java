package com.example.user.objectorientedprogramming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import carGame.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView carTextView=(TextView)findViewById(R.id.textView);
        Car mycar=new Car();
        carTextView.append(mycar.toString());
        Car hiscar = new Car("Honda","Black",3.5,400);
        Car hercar = new Car ("Ford","pink",2.5,300);
        carTextView.append(mycar+"\n"+"\n");
        carTextView.append(hiscar+"\n"+"\n");
        carTextView.append(hercar+"\n"+"\n");
        carTextView.append(hercar.equals(mycar)+"\n");
        carTextView.append(hiscar.equals(hercar)+"\n");
        mycar.setColor("Black");
        hiscar.setColor("Black");
        hercar.setColor("Black");

        mycar.setMake("Buick");
        hiscar.setMake("Buick");
        hercar.setMake("Buick");

        mycar.setEngineSize(6.5);
        hiscar.setEngineSize(6.5);
        hercar.setEngineSize(6.5);

        mycar.setHorsePower(650);
        hiscar.setHorsePower(650);
        hercar.setHorsePower(650);

        carTextView.append(mycar.getMake()+" " + mycar.getColor()+
                " "+mycar.getEngineSize()+" "+mycar.getHorsePower());
        carTextView.append(hiscar.getMake()+" " + hiscar.getColor()+
                " "+hiscar.getEngineSize()+" "+hiscar.getHorsePower());
        carTextView.append(hercar.getMake()+" " + hercar.getColor()+
                " "+hercar.getEngineSize()+" "+hercar.getHorsePower());
        carTextView.append(hercar.equals(mycar)+"\n");
        carTextView.append(hiscar.equals(hercar)+"\n");
        carTextView.append("\n"+ Car.getCount());

           }


    }

