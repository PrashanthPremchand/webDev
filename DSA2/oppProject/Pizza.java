public class Pizza
{
    private int price = 0;
    private String bill = "";
    boolean isVeg = true;
    boolean isCheeseAdded = false;
    boolean isToppingAdded = false;
    boolean isTakeawayAdded = false;
    public Pizza(boolean isVeg)
    {
        this.isVeg = isVeg;
        if(isVeg)
        {
            this.price += 300;
        }
        else
        {
            this.price += 400;    
        }
    }
    //getter
    public int getPrice()
    {
        return this.price;
    }
    public void addExtraCheese()
    {
        this.isCheeseAdded = true;
        
    }
    public void addExtraTopping()
    {
        this.isToppingAdded = true;
    }
    public void addTakeaway()
    {
        this.isTakeawayAdded = true;
    }
    public String getBill()
    {
        if(this.isVeg)
        {
            this.bill +="Base Price Of The Pizza: 300\n";
        }
        else
        {
            this.bill +="Base Price of The Pizza: 400\n";
        }
        if(this.isCheeseAdded)
        {
            this.bill += "Extra Cheese Added: 80\n";
            this.price += 80;
        }
        if(this.isToppingAdded)
        {
            if(this.isVeg)
            {
                this.bill += "Extra Topping Added: 70\n";
                this.price += 70;
            }
            else
            {
                this.bill += "Extra Topping Added: 120\n";
                this.price += 120;
            }
        }
        if(this.isTakeawayAdded)
        {
            this.bill += "Paper Bag Added: 20\n";
            this.price += 20;
        }
        this.bill +="Total Price:" + " " + this.price;
        return this.bill;
    }
}