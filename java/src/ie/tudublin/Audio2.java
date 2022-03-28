package ie.tudublin;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import ddf.minim.analysis.FFT;
import processing.core.PApplet;

/*

The infinite number of waves make up the mind, and all minds are made up of these waves which then interact with one another to form reality via Fourier transformations
Science is not supposed to give meaning to ones life or the reason behind their existence; science only explains the testable and provable mechanisms that run the universe

*/

public class Audio2 extends PApplet {
    Minim minim;
    AudioPlayer ap;
    AudioInput ai;
    AudioBuffer ab;

    int mode = 0;

    float[] lerpedBuffer;
    float y = 0;
    float smoothedY = 0;
    float smoothedAmplitude = 0;

    FFT fft;

    public void keyPressed() {
        if (key >= '0' && key <= '9') {
            mode = key - '0';
        }
        if (keyCode == ' ') {
            if (ap.isPlaying()) {
                ap.pause();
            } else {
                ap.rewind();
                ap.play();
            }
        }
    }

    public void settings() {
        size(1024, 1000, P3D);
        // fullScreen(P3D, SPAN);
    }

    public void setup() {
        minim = new Minim(this);
        // Uncomment this to use the microphone
<<<<<<< HEAD
        // ai = minim.getLineIn(Minim.MONO, width, 44100, 16);
        // ab = ai.mix;
        ap = minim.loadFile("heroplanet.mp3", 1024);
        ap.play();
        ab = ap.mix;
        colorMode(HSB);
=======
        ai = minim.getLineIn(Minim.MONO, width, 44100, 16);
        ab = ai.mix; 
        //ap = minim.loadFile("heroplanet.mp3", 1024);
        //ap.play();
        //ab = ap.mix;
        colorMode(RGB);

        fft = new FFT(1024, 44100);
>>>>>>> abc424ce02eee2a397500d9d3ece2974332eb505

        y = height / 2;
        smoothedY = y;

        lerpedBuffer = new float[width];
    }

    float off = 0;

    <<<<<<<HEAD

    // Other examples we made in the class
    /*
     * stroke(255);
     * fill(100, 255, 255);
     * 
     * circle(width / 2, halfH, lerpedA * 100);
     * 
     * circle(100, y, 50);
     * y += random(-10, 10);
     * smoothedY = lerp(smoothedY, y, 0.1f);
     * circle(200, smoothedY, 50);
     */

    }=======

    public void draw() {
        background(0);
        stroke(255);
        float halfH = height / 2;
        for (int i = 0; i < ab.size(); i++) {
            line(i, halfH, i, halfH + ab.get(i) * halfH);
        }

        fft.window(FFT.HAMMING);
        fft.forward(ab);

        stroke(0, 255, 0);
        for (int i = 0; i < fft.specSize(); i++) {
            line(i, 0, i, fft.getBand(i) * 10);
        }

        int maxIndex = 0;

        for (int i = 0; i < fft.specSize(); i++) {
            if (fft.getBand(i) > fft.getBand(maxIndex)) {
                maxIndex = i;
            }
        }

        // Fill out missing code!!

        float freq = fft.indexToFreq(maxIndex);

        textSize(20);
        fill(255);
        text("Freq: " + freq, 100, 200);

    }>>>>>>>abc424ce02eee2a397500d9d3ece2974332eb505
}
