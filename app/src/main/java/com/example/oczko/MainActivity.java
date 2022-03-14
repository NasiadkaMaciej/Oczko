package com.example.oczko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    Random rand = new Random();
    ImageView card;
    Integer points;
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

    int[][] naRodzaje = {
            {
                    R.drawable.karo2,
                    R.drawable.kier2,
                    R.drawable.trefl2,
                    R.drawable.pik2
            },
            {       R.drawable.karo3,
                    R.drawable.kier3,
                    R.drawable.trefl3,
                    R.drawable.pik3,
            },
            {       R.drawable.karo4,
                    R.drawable.kier4,
                    R.drawable.trefl4,
                    R.drawable.pik4,
            },
            {       R.drawable.karo5,
                    R.drawable.kier5,
                    R.drawable.trefl5,
                    R.drawable.pik5,
            },
            {       R.drawable.karo6,
                    R.drawable.kier6,
                    R.drawable.trefl6,
                    R.drawable.pik6,
            },
            {       R.drawable.karo7,
                    R.drawable.kier7,
                    R.drawable.trefl7,
                    R.drawable.pik7,
            },
            {       R.drawable.karo8,
                    R.drawable.kier8,
                    R.drawable.trefl8,
                    R.drawable.pik8,
            },
            {       R.drawable.karo9,
                    R.drawable.kier9,
                    R.drawable.trefl9,
                    R.drawable.pik9,
            },
            {       R.drawable.karo10,
                    R.drawable.kier10,
                    R.drawable.trefl10,
                    R.drawable.pik10,
            },
            {       R.drawable.karowalet,
                    R.drawable.kierwalet,
                    R.drawable.treflwalet,
                    R.drawable.pikwalet
            },
            {       R.drawable.karokrolowa,
                    R.drawable.kierkrolowa,
                    R.drawable.treflkrolowa,
                    R.drawable.pikkrolowa,
            },
            {       R.drawable.karokrol,
                    R.drawable.kierkrol,
                    R.drawable.treflkrol,
                    R.drawable.pikkrol,
            },
            {       R.drawable.karoas,
                    R.drawable.kieras,
                    R.drawable.treflas,
                    R.drawable.pikas,
            }
    };
    ArrayList<Integer> set = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        card = findViewById(R.id.imageView);
        set.clear();
        for(int i=0; i<cardsId.length;i++) {
            set.add(cardsId[i]);
        }
    }

    public void koniec(View view) {
    }

    public void dobierz(View view) {
        int x = (rand.nextInt(set.size()-1));

        card.setImageResource(set.get(x));
        set.remove(set.get(x));
    }
}