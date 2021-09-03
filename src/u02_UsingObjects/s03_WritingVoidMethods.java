package u02_UsingObjects;

public class s03_WritingVoidMethods {
    public static void main(String[] args){
        StdDraw.setScale(0, 1);

        drawTriangleDilateBefore(0.1,0.4,2);
        drawTriangleDilateAfter(0.1,0.4,2);
    }

    //                                        0.1             0.4
    public static void drawTriangleDilateAfter(double xShift, double yShift, double scale){
        StdDraw.line((0+xShift)*scale,(0+yShift)*scale,(0.1+xShift)*scale,(0.2+yShift)*scale);
        StdDraw.line((0.1+xShift)*scale,(0.2+yShift)*scale, (0.2+xShift)*scale,(0+yShift)*scale);
        StdDraw.line((0.2+xShift)*scale,(0+yShift)*scale, (0+xShift)*scale,(0+yShift)*scale);

    }

    public static void drawTriangleDilateBefore(double xShift, double yShift, double scale){
        StdDraw.line(0*scale+xShift, 0*scale+yShift,0.1*scale+xShift,0.2*scale+yShift);
        StdDraw.line(0.1*scale+xShift,0.2*scale+yShift, 0.2*scale+xShift,0*scale+yShift);
        StdDraw.line(0.2*scale+xShift,0*scale+yShift, 0*scale+xShift,0*scale+yShift);

    }

}
