package factory;

public class HouseHoldAppliance
{
    protected String brand;
    protected double price;
    protected double voltage;

   public  HouseHoldAppliance(String b,double p,double v)
   {
   this.brand = b;
   this.price = p;
   this.voltage = v;
   }

   public void getDiscount(HouseHoldAppliance hhp) //recebe eletrodomestico
   {
   		
   }
  
}
