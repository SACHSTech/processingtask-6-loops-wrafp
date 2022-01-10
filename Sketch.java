import processing.core.PApplet;

public class Sketch extends PApplet {
  // Decalring global variable for greyscale
	public int shade = 0;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255);
  }

 
  public void draw() {
    
    // Quadrant 1
    for (int x = width / 20; x < width / 2; x+=(width/20)) {
      stroke(0);
      line(x, 0, x, width / 2);
      for (int y = height / 20; y < height / 2; y+=(height/20)) {
        line(0, y, height / 2, y);
      }
    }

    // Quadrant 2
    for (int x2 = width / 2 + 20; x2 < width; x2+=(width/10)) {
      for (int y2 = height / 20; y2 < height / 2; y2+=(height/10)) {
        stroke(0);
        fill(135, 10, 220);
        ellipse(x2, y2, width / 20, height / 20);
      }
    }

    // Quadrant 3
    for (int i = 0; i < width / 2; i++) {
      stroke(shade + i);
      line(i, height / 2, i, height);
    }
  
    // Quadrant 4
    translate(width / 1.3333f, height / 1.3333f);
    fill(255, 174, 0);
    stroke(0);

    for (int m = 0; m < 8; m++) {
      ellipse(0, -30, 15, 50);
      rotate(radians(45));
    }

    fill(255, 98, 0);
    stroke(255, 98, 0);
    ellipse(0, 0, width / 12, height / 12);

    } 
}  

