import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class TeaTotal{
    public static void main(String[] args){
        List<product>products= new ArrayList<>();
        products.add(new product("Green Tea",2022,10.0));
         products.add(new product("Black Tea",2022,5.0));
          products.add(new product("Herbal Tea",2021,8.0));
           products.add(new product("Iced Tea",2021,12.0));
            products.add(new product("Chai Tea",2023,15.0));
            Map<Integer,Double>teaTotalsByYear = products.stream().filter(p ->p.getName().contains("Tea"))
            .collect(Collectors.groupingBy(product::getYear,Collectors.summingDouble(product::getPrice)));
            System.out.println("Tea totals by year:");
            teaTotalsByYear.forEach((year,total)-> System.out.println(year+":"+total));
    }
}
 class product{
    private String name;
    private int year;
    private double price;
    public product(String name,int year,double price){
        this.name = name;
         this.year = year;
          this.price = price;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public double getPrice(){
        return price;
    }
}
