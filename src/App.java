import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
    }

public void settings() {
        size(400, 400);
    }
    
    public void setup() {
        background(260, 150, 250);
    }

    public void draw() {
        fill(240, 130, 300);
        strokeWeight(9);
        stroke(140, 130, 200);
        rect(20, 50, 100, 100);
        fill(240, 130, 200);
        strokeWeight(3);
        stroke(230, 120, 250);
        ellipse(300, 200, 100, 100);
        strokeWeight(7);
        line(20, 50, 300, 200);
    }
}