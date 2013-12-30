/**
 * Created by jensbaby on 12/30/13.
 */
public class OfficeSpace extends Building implements NumFloors {
    int NumBusiness;
    int NumVisit;
    double TurnOverCost;
    int NumFloors;

    OfficeSpace(){
        Name="Name";
        NumBusiness=0;
        NumVisit=0;
        TurnOverCost=0.0;
        int NumFloors=0;
        SqFt=0.0;
        Pur="String";
    }
    OfficeSpace(String Name, double SqFt, String Pur, int NumBusiness, int NumVisit, double TurnOverCost, int NumFloors){
        this.Name=Name;
        this.SqFt=SqFt;
        this.Pur=Pur;
        this.NumBusiness=NumBusiness;
        this.NumVisit=NumVisit;
        this.TurnOverCost=TurnOverCost;
        this.NumFloors=NumFloors;
    }
    public int getNumBusiness(){
        return NumBusiness;
    }

    public void setNumVisit(int NumVisit){
        this.NumVisit=NumVisit;
    }

    public int getNumVisit(){
        return NumVisit;
    }

    public double getTurnOverCost(){
        return TurnOverCost;
    }

    public void setNumBusiness(int NumBusiness){
        this.NumBusiness=NumBusiness; }

    public void setTurnOverCost(double TurnOverCost){


        this.TurnOverCost=TurnOverCost;
    }

    @ Override
    public void setFloors(int NumFloors){
       this.NumFloors=NumFloors;
    }
    public int getFloors(){

        return NumFloors;
    }
}
