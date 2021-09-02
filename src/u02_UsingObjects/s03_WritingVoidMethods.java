package u02_UsingObjects;

public class s03_WritingVoidMethods {
    public static void main(String[] args){
        StdDraw.setScale(100, 100);

        drawTriangle(0.1,0.4,2);
        drawTriangle(.7, 0.2, 1.5);
        drawTriangle(.2, 0.3, 1.75);
        drawTriangle(.1, 0.2, 0.2);
    }

    //                                        0.1             0.4
    public static void drawTriangle(double xShift, double yShift, double scale){
        StdDraw.line((0+xShift)*scale, (0+yShift)*scale,(0.1+xShift)*scale,(0.2+yShift)*scale);
        StdDraw.line((0.1+xShift)*scale,(0.2+yShift)*scale, (0.2+xShift)*scale,(0+yShift)*scale);
        StdDraw.line((0.2+xShift)*scale,(0+yShift)*scale, (0+xShift)*scale,(0+yShift)*scale);

    }

}
