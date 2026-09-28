import java.awt.*;
import java.util.ArrayList;

public class BigRectLister
{
    public static void main(String[] args)
    {
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(1, 1));
        rectangles.add(new Rectangle(2, 2));
        rectangles.add(new Rectangle(4, 1));
        rectangles.add(new Rectangle(3, 2));
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(4, 3));
        rectangles.add(new Rectangle(7, 5));
        rectangles.add(new Rectangle(5, 4));
        rectangles.add(new Rectangle(6, 3));
        rectangles.add(new Rectangle(10, 2));

        BigRectangleFilter filter = new BigRectangleFilter();

        System.out.println("Rectangles with perimeter greater than 10:");

        for (Rectangle rectangle : rectangles)
        {
            if (filter.accept(rectangle))
            {
                System.out.println(rectangle);
            }
        }
    }
}
