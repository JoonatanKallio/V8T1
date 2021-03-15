
package mainclass1;

public class Bottle {
    private String name;
    private String manufacturer;
    private double total_energy;
    private double price;
    private double size;
    
    protected Bottle(){
        name = "Pepsi Max";
        manufacturer = "Pepsi";
        total_energy = 0.3;
        price = 1.80;
        size = 0.5;
    }
    
    public Bottle(String name1, String manuf, double totE, double size1, double price1){
        name = name1;
        manufacturer = manuf;
        total_energy = totE;
        price = price1;
        size = size1;
    }
    

    
    public double getPrice(){
        return price;
    }
    
    public double getSize(){
        return size;
    }
    
    public String getName(){
        return name;
    }
    
    public String getManufacturer(){
        return manufacturer;
    }
    
    public double getEnergy(){
        return total_energy;
    }
}