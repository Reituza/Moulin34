/**
 * Write a description of class AluminiumBottle here.
 *
 * @author (30812283 R Mathibela)
 * @version (a version number or a date)
 */

public abstract class JuiceBottle
{
    private int Measurement = 400;
    private String Measurement_Units = "ML";
    private int Cost = 30;
    private String Name = "Berry";
    
    
    protected JuiceBottle() { }

    protected JuiceBottle(int Measurement, String Measurement_Units,int Cost,String Name)
    {
        setCost(Cost);
        setName(Name);
        setMeasurement(Measurement);
        setMeasurementUnits(Measurement_Units);
        
    }
    
    public int getMeasurement()
    {
        return Measurement;
    }
    
    public void setMeasurement(int Measurement)
    {
		this.Measurement = Measurement;
    }
    
     public String getMeasurement_Units()
    {
        return Measurement_Units;
    }
    
    public void setMeasurementUnits(String Measurement_Units)
    {
		this.Measurement_Units = Measurement_Units;
    }
    
    
    public int getCost()
    {
        return Cost;
    }
    
    public void setCost(int Cost)
    {
		this.Cost = Cost;
    }
    
       public String getName()
    {
        return Name;
    }
    
    public void setName(String Name)
    {
		this.Name = Name;
    }
    
    public abstract double PurchaseCost();
}