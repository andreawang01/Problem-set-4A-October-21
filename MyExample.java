
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 **/
public class MyExample {
    public static void main(String[] args) {
        drawGridPattern();
        drawCurvePattern();
    }

    public static void drawGridPattern() {
        StdDraw.setScale(0, 500);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);

        // Draw horizontal and vertical lines spaced by 20 units
        for (int i = 0; i <= 500; i += 20) {
            StdDraw.line(i, 0, i, 500); // Vertical lines
            StdDraw.line(0, i, 500, i); // Horizontal lines
        }
    }

    public static void drawCurvePattern() {
        StdDraw.setScale(0, 500);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);

        // Draw curves made of straight lines
        for (int i = 0; i <= 500; i += 20) {
            StdDraw.line(0, i, i, 500); // From left to top
            StdDraw.line(i, 0, 500, i); // From bottom to right
        }
    }
}