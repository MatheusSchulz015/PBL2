package factory;

public class FoodMixer extends HouseHoldAppliance {
    protected int amountOfPropeller; //quantidade de helicies
	HouseHoldAppliance hha = new HouseHoldAppliance("cor",1,1); 
    public void setAmountOfPropeller(int aop)
    {
    	this.amountOfPropeller = aop;
    }

}
