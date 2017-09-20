package com.example.peitaoye.dagger2injectiontest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.Optional;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
 //   @Named("1")
 //   @Inject
   // public Sneaker sneaker1;
   /* @Named("1")
    @Inject
    public Sneaker sneaker1dian1;
    @Named("1")
    @Inject
    public Lazy<Sneaker> sneaker1dian2;
    @Named("2")
    @Inject
    public Sneaker sneaker2;
    @Named("2")
    @Inject
    public Sneaker sneaker2dian2;*/

 /*  @Inject
   Sneaker sneaker1;

    @Inject
    Sneaker sneaker2;

    @Inject
    Sneaker sneaker3;
    @Inject
    Boots boots;*/

    Optional<Slipper> slipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.e("ObjectAddress",sneaker.toString()+"\n");
        //SneakerComponent sneakerComponent=DaggerSneakerComponent.create();
       // BootsComponents bootsComponents=DaggerBootsComponents.builder().sneakerComponent(sneakerComponent).build();
       // bootsComponents.inject(this);
        //sneaker3=sneakerComponent.sneaker();
       // Log.e("ObjectAddress",sneaker1.toString()+"\n"+sneaker2.toString()+sneaker3.toString()+"\n"+boots.toString());
                // DaggerSneakerComponent.create().inject(this);
       // Log.e("ObjectAddress", sneaker1.toString()+"\n"+sneaker2.toString()+"\n"+sneaker1dian1.toString()+"\n"+sneaker2dian2.toString());

    }
}
