package u10_Inheritance.AnimatedExample;

public class GrowShrinkCreature extends InescapableCreature {
    public GrowShrinkCreature(double xPos, double yPos, double xVel, double yVel, double radius){
        super(xPos, yPos, xVel, yVel, radius);
    }

    @Override
    public void calculate(double timeElapsed) {
        /*
        Write code here to grow/shrink radius.
        Don't repeat code to do with bouncing or moving;
        those are both handled by the call to super.calculate below.
         */

        super.calculate(timeElapsed);
    }
}
