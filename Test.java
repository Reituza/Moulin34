
/**
 * Write a description of class Test here.
 *
 * @author (30812283 R Mathibela)
 * @version (a version number or a date)
 */
public class Test
{
        public static void main(String[]args)
        {
           PlasticBottle l1  = new PlasticBottle (400,"ML",31,"Orange");
           PlasticBottle l2  = new PlasticBottle (400,"ML",20,"Blackberry");
           PlasticBottle l3  = new PlasticBottle (400,"ML",22,"Waterberry");
            
           AluminiumBottle l4  = new AluminiumBottle (500,"ML",25,"AquaMinium");
           AluminiumBottle  l5  = new AluminiumBottle (500,"ML",35,"AquaSteel");
           AluminiumBottle  l6  = new AluminiumBottle (500,"ML",20,"AluLife");
        
        
        WaterBottle Water[] = new WaterBottle[3];
        Water[0] = l4;
        Water[1] = l5;
        Water[2] = l6;
        
        PlasticBottle Juice[] = new PlasticBottle[3];
        Juice[0] = l1;
        Juice[1] = l2;
        Juice[2] = l3;

        
         for(int i =0 ; i< Water.length;i++)
        { 
            System.out.println(Water[i] + "would cost you around" + "R" + Water[i].PurchaseCost());
            
        }
        
         for(int i =0 ; i< Juice.length;i++)
        { 
            System.out.println(Juice[i] + "would cost you around" + "R" + Juice[i].PurchaseCost());
        }
        
        
        
    }
}