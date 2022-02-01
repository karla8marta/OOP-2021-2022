package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet {

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);
		background(0);
	}

	public void draw() {
		stroke(255, 255, 46);
		background(255, 0, 0); // Greyscale
		stroke(255, 255, 46);
		fill(255, 255, 46);
		circle(260, 323, 350); // cx, cy, r

		// stroke(0);
		// noFill();
		// NoStroke();
		// rectMode(CENTER);
		// rect(300, 20, 100, 20); // tlx, tly, w, h

		// rectMode(CORNER);
		// rect(200, 20, 100, 20); // tlx, tly, w, h

		// point(20, 300);
		stroke(66, 214, 255);
		fill(66, 214, 255);
		triangle(20, 450, 480, 450, 260, 80); // x1, y1, x2, y2, x3, y3
		stroke(113, 124, 128);
		fill(113, 124, 128);
		ellipse(255, 250, 200, 100); // cx, cy, w, h
		stroke(0, 0, 0);
		fill(0, 0, 0);
		circle(250, 250, 70); // cx, cy, r
	}
}
