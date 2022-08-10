
public abstract class WaterBottle 
{
    private int Measurement = 500;
    private String Measurement_Units = "ML";
    private int Cost = 25;
    private String Name = "Aqualife";
    
    
    protected WaterBottle() { }

    protected WaterBottle(int Measurement, String Measurement_Units,int Cost,String Name)
    {
        setMeasurement(Measurement);
        setMeasurementUnits(Measurement_Units);
        setCost(Cost);
        setName(Name);
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