/**
 * Created by jensbaby on 12/30/13.
 */
public class Grocery extends Building implements NumFloors{
    int NumEmploy;
    int NumCust;
    double HeatCoolCost;
    int NumFloors;

    Grocery(){
        Name="Name";
        NumEmploy=0;
        NumCust=0;
        HeatCoolCost=0.0;
        NumFloors=0;
    }
    Grocery (String Name, double SqFt, String Pur, int NumEmploy, int NumCust, double HeatCoolCost, int NumFloors){
        this.Name=Name;
        this.SqFt=SqFt;
        this.Pur=Pur;
        this.NumEmploy=NumEmploy;
        this.NumCust=NumCust;
        this.HeatCoolCost=HeatCoolCost;
        this.NumFloors=NumFloors;
    }

    public void setNumEmploy(int NumEmploy) {
        this.NumEmploy = NumEmploy;
    }
    public int getNumEmploy() {
        return NumEmploy;
    }
    public void setNumCust(int NumCust) {
        this.NumCust = NumCust;
    }
    public int getNumCust() {
        return NumCust;
    }
    public void setHeatCoolCost(double HeatCoolCost) {
        this.HeatCoolCost = HeatCoolCost;
    }
    public double getHeatCoolCost(){
        return HeatCoolCost;
    }

    @Override
    public void setFloors(int NumFloors) {
        this.NumFloors=NumFloors;
    }
    public int getFloors(){
        return NumFloors;
    }
}
