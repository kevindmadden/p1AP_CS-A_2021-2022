package u02_UsingObjects;

public class s03_WritingVoidMethods {
    public static void main(String[] args){
        drawTriangle(0.1,0.4);
        drawTriangle(.7, 0.2);
        drawTriangle(.8, 0.3);
        drawTriangle(.6, 0.2);
    }

    //                                        0.1             0.4
    public static void drawTriangle(double xShift, double yShift){
        StdDraw.line(0+xShift, 0+yShift,0.1+xShift,0.2+yShift);
        StdDraw.line(0.1+xShift,0.2+yShift, 0.2+xShift,0+yShift);
        StdDraw.line(0.2+xShift, 0+yShift, 0+xShift, 0+yShift);
    }

}
