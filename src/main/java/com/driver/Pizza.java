package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private Boolean cheeze=false;
    private Boolean topping=false;
    private int takeAway = 0 ;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price = 300;
        }else{
            this.price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!cheeze){
            this.price+=80;
            cheeze=true;
        }

    }

    public void addExtraToppings(){
        if(!topping){
            if(isVeg){
                this.price += 70;
            }
            else{
                this.price+=120;
            }
            topping = true;
        }

    }

    public void addTakeaway(){

        price +=20;
        takeAway+= 20;

    }

    public String getBill(){
        if(isVeg){
            this.bill = "Base Price Of The Pizza: 300"+"\n";

        }else{
            this.bill ="Base Price Of The Pizza: 400"+"\n";
        }
        if(cheeze){
            this.bill += "Extra Cheese Added: 80" +"\n";
        }
        if(topping){
            if(isVeg){
            this.bill += "Extra Toppings Added: 70"+"\n" ; }
            else{
                this.bill += "Extra Toppings Added: 120" + "\n";
            }
        }
        if(takeAway>0){
            this.bill += "Paperbag Added: "+ Integer.toString(takeAway)+"\n";
        }
        this.bill += "Total Price: " + Integer.toString(price) + "\n";
        return this.bill;
    }
}
