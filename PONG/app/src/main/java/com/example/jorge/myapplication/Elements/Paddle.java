package com.example.jorge.myapplication.Elements;

import android.widget.ImageView;

/**
 * Created by Jorge on 29/10/2017.
 */

public class Paddle extends Element {
    public Paddle(ImageView element) {
        super(element);
        this.setSpeed(5);
    }


}
