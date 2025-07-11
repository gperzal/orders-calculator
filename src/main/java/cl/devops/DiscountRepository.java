package cl.devops;

public class DiscountRepository{
    public double getRate(String code){
        if (code.equals("SALES10")) return 0.10;
        return 0.0;
    }
}