package com.example.cgraphicscmyk;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.BlendMode;
import javafx.scene.paint.Color;

public class Circlies {

    private GraphicsContext gc;
    Canvas canvas;

    Circlies(Canvas canvas) {
        gc = canvas.getGraphicsContext2D();
    }

    int r = 10, rad = 20, x1 = r, y1 = r;
    double a = 0;
    int tick = 0;

    public void draw() {
        rad = r;
        gc.beginPath();
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, 600, 600);
        gc.closePath();
        gc.setGlobalBlendMode(BlendMode.DARKEN);
        //желтый

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                gc.beginPath();
                gc.setFill(Color.YELLOW);
                gc.fillOval(-800+ (100 * i) -a+50,  -200+(200 * j)-100, 40, 40);
                gc.fill();
                gc.closePath();
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                gc.beginPath();
                gc.setFill(Color.YELLOW);
                gc.fillOval( -800+ (100 * i) + a, -200+ (200 * j), 40, 40);
                gc.fill();
                gc.closePath();
            }
        }



        //циан
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                gc.beginPath();
                gc.setFill(Color.CYAN);
                gc.fillOval(-400+25+(50*j)+(200*i)+0.5*a,-400+50+100+(100*j)+a, 40, 40);
                gc.fill();
                gc.closePath();
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                gc.beginPath();
                gc.setFill(Color.CYAN);
                gc.fillOval(-400+75+(50*j)+(200*i)+0.5*a,-400+50+(100*j)+a, 40, 40);
                gc.fill();
                gc.closePath();
            }
        }



        //мадж
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                gc.beginPath();
                gc.setFill(Color.MAGENTA);
                gc.fillOval(-400+75-(50*j)+(200*i)-(0.5*a)+50,  -400+50+(100*j)+a, 40, 40);
                gc.fill();
                gc.closePath();
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                gc.beginPath();
                gc.setFill(Color.MAGENTA);
                gc.fillOval(-425-(50*j)+(200*i)+(0.5*a)+50,  -400+50+(100*j)-a, 40, 40);
                gc.fill();
                gc.closePath();
            }
        }
        a+=0.5;
        if (a>20*r)
            a=0;
        gc.setGlobalBlendMode(BlendMode.SRC_OVER);

    }
}

