package u02_UsingObjects;
public class s02_IntroToDrawing {
    public static void main(String[] args){

        //StdDraw.setXscale(0, 100);
        //StdDraw.setYscale(0, 100);
        StdDraw.setScale(0, 100);
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(76, 81, 166);
        StdDraw.point(500, 500);
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.setPenRadius(0.05);
        StdDraw.line(0.2, 0.2, 0.8, 0.2);
    }

}
