/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    // Put your own methods here    
    
    method setupBowling() {
  turn(LEFT);
  turn(LEFT);
  turn(LEFT);
  turn(LEFT);
}
method hopPlant_Space4() {
  plant();
  hop();
  hop();
  plant();
  hop();
  hop();
  plant();
  hop();
  hop();
  plant();
  hop();
}
method hopPlant_Space3() {
  plant();
  hop();
  hop();
  plant();
  hop();
  hop();
  plant();
  hop();
}
method hopPlant_Space2() {
  plant();
  hop();
  hop();
  plant();
  hop();
}
method diagonal() {
  hop();
  turn(RIGHT);
  hop();
  turn(LEFT);
}
method anti_diagonal() {
  turn(LEFT);
  turn(LEFT);
  hop();
  turn(LEFT);
  hop();
  turn(RIGHT);
  hop();
}
method turnRound() {
  turn(LEFT);
  hop();
  turn(LEFT);
  hop();
  hop();
}


    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int y, int x) { super(y, x); }

    public Jeroo(int y, int x, CompassDirection direction) { super (y, x, direction);}

    public Jeroo(int y, int x, int flowers) { super (y, x, flowers);}

    public Jeroo(int y, int x, CompassDirection direction, int flowers) { super(y, x, direction, flowers);}

}
