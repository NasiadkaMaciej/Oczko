package com.example.oczko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    Random rand = new Random();
    ImageView card;
    TextView pointTV, krupierPointsTV;
    Integer points = 0, krupierPoints=0;
    Integer[] cardsId = {
            R.drawable.karo2,
            R.drawable.kier2,
            R.drawable.trefl2,
            R.drawable.pik2,
            R.drawable.karo3,
            R.drawable.kier3,
            R.drawable.trefl3,
            R.drawable.pik3,
            R.drawable.karo4,
            R.drawable.kier4,
            R.drawable.trefl4,
            R.drawable.pik4,
            R.drawable.karo5,
            R.drawable.kier5,
            R.drawable.trefl5,
            R.drawable.pik5,
            R.drawable.karo6,
            R.drawable.kier6,
            R.drawable.trefl6,
            R.drawable.pik6,
            R.drawable.karo7,
            R.drawable.kier7,
            R.drawable.trefl7,
            R.drawable.pik7,
            R.drawable.karo8,
            R.drawable.kier8,
            R.drawable.trefl8,
            R.drawable.pik8,
            R.drawable.karo9,
            R.drawable.kier9,
            R.drawable.trefl9,
            R.drawable.pik9,
            R.drawable.karo10,
            R.drawable.kier10,
            R.drawable.trefl10,
            R.drawable.pik10,
            R.drawable.karowalet,
            R.drawable.kierwalet,
            R.drawable.treflwalet,
            R.drawable.pikwalet,
            R.drawable.karokrolowa,
            R.drawable.kierkrolowa,
            R.drawable.treflkrolowa,
            R.drawable.pikkrolowa,
            R.drawable.karokrol,
            R.drawable.kierkrol,
            R.drawable.treflkrol,
            R.drawable.pikkrol,
            R.drawable.karoas,
            R.drawable.kieras,
            R.drawable.treflas,
            R.drawable.pikas};
    Integer[] cardsPoints = {
            2,
            2,
            2,
            2,
            3,
            3,
            3,
            3,
            4,
            4,
            4,
            4,
            5,
            5,
            5,
            5,
            6,
            6,
            6,
            6,
            7,
            7,
            7,
            7,
            8,
            8,
            8,
            8,
            9,
            9,
            9,
            9,
            10,
            10,
            10,
            10,
            2,
            2,
            2,
            2,
            3,
            3,
            3,
            3,
            4,
            4,
            4,
            4,
            11,
            11,
            11,
            11};

    ArrayList<Integer> set = new ArrayList<Integer>();
    ArrayList<Integer> asList = new ArrayList<Integer>();
    ArrayList<Integer> asKrupierList = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        card = findViewById(R.id.imageView);
        pointTV = findViewById(R.id.pointsTV);
        krupierPointsTV = findViewById(R.id.krupierPointsTV);
        set.clear();
        for(int i=0; i<cardsId.length;i++)
            set.add(cardsId[i]);
    }

    public void koniec(View view) {
        set.clear();
        for(int i=0; i<cardsId.length;i++)
            set.add(cardsId[i]);
        asList.clear();
        asKrupierList.clear();
        card.setImageResource(R.drawable.joker1);
        points=0;
        krupierPoints=0;
        pointTV.setText(String.valueOf(points));
        krupierPointsTV.setText(String.valueOf(krupierPoints));

    }

    public void dobierz(View view) {
        if(points<21 && asList.size()<2) {
            int x = (rand.nextInt(set.size() - 1));
            for (int i = 0; i < cardsId.length; i++) {
                if (cardsId[i] == set.get(x)) {
                    points = points + cardsPoints[i];
                }
            }
            if( set.get(x)==cardsId[48] ||
                    set.get(x)==cardsId[49] ||
                    set.get(x)==cardsId[50] ||
                    set.get(x)==cardsId[51]){
                asList.add(set.get(x));
            }
            pointTV.setText("Twoje punkty: " + points);
            card.setImageResource(set.get(x));

            set.remove(set.get(x));
        }else if(points==21 || asList.size()==2){
            String message = "";
            if(points==21) message="Wygrałeś, masz 21 punktów";
            else if(asList.size()==2) message="Wygrałeś, wyciągnąłeś 2 asy";
            pointTV.setText(message);
        }
    }

    public void dobierzKrupiera(View view) {
        if(krupierPoints<21 && asKrupierList.size()<2) {
            int x = (rand.nextInt(set.size() - 1));
            for (int i = 0; i < cardsId.length; i++) {
                if (cardsId[i] == set.get(x)) {
                    krupierPoints = krupierPoints + cardsPoints[i];
                }
            }
            if( set.get(x)==cardsId[48] ||
                    set.get(x)==cardsId[49] ||
                    set.get(x)==cardsId[50] ||
                    set.get(x)==cardsId[51]){
                asKrupierList.add(set.get(x));
            }
            krupierPointsTV.setText("Punkty krupiera: " + krupierPoints);

            set.remove(set.get(x));
        }else if(krupierPoints==21 || asKrupierList.size()==2){
            String message = "";
            if(points==21) message="Krupier wygrał, ma 21 punktów";
            else if(asList.size()==2) message="Krupier wygrał, wyciągnął 2 asy";
            pointTV.setText(message);
        }
    }
}

