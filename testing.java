
/**
 * Write a description of class testing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testing
{
  public static void main(String[]args)
        {

        Circle c1= new Circle (3, "red",false);
        Rectangle r1 = new Rectangle (3,4, "black",true);
        Circle c2= new Circle (5, "red",false);
        Rectangle r2 = new Rectangle (4,5, "black",true);
        
        GeometricObject shapes[] = new GeometricObject[3];
            shapes[0] = c1;
            shapes[1] = r1;
            shapes[2] = c2;
            shapes[3] = r2;
        
         r2.setWidth(2); 
         
         System.out.println(shapes);
        }
}
