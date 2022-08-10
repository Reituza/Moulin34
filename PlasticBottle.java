/**
 * Write a description of class AluminiumBottle here.
 *
 * @author (30812283 R Mathibela)
 * @version (a version number or a date)
 */
public class PlasticBottle extends JuiceBottle
{
   private int durability = 4;
   private int warranty_span = 3; 
   private String durabilityUnits = "years";
   
   public PlasticBottle(int Measurement,String Measurement_Units,int Cost, String Name)
   {
       super(Measurement,Measurement_Units,Cost,Name);
       setdurability(durability);
       setwarrantyspan(warranty_span);
       setdurabilityUnits(durabilityUnits);
   }
   
   public int getdurability()
   {
       return durability;
   }
   
   public void setdurability(int durability)
   {
       this.durability = durability;
   }
   
   public int getwarrantyspan()
   {
       return warranty_span;
   }
   
   public void setwarrantyspan(int warranty_span)
   {
       this.warranty_span = warranty_span;
   }
   
   
   public String getdurabilityUnits()
   {
       return durabilityUnits;
   }
   
   public void setdurabilityUnits (String durabilityUnits)
   {
       this.durabilityUnits = durabilityUnits;
   }
   
   
   public double PurchaseCost()
   {
           if (durability <= 5)
           {
               return getCost() + (getCost() * 11/100);
           }
           
            else
            {
                return getCost() + (getCost() * 12/100);
            }
       
  }
       
  
  public String toString()
      {
         return ("Plastic Bottle durability strength of" + getdurability() + getdurabilityUnits() + "with a warranty span of" + getwarrantyspan() + " months"); 
      }
  
  
  
  
}