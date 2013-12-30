/**
 * Created by jensbaby on 12/30/13.
 */
public abstract class Building {
    double SqFt;
    String Name;
    String Pur;

    Building(){
        SqFt=0.0;
        Pur="PurString";
        Name="Name";
    }
    Building(double SqFt, String Pur, String Name){
    }

    public void setSqFt(double SqFt) {
        this.SqFt = SqFt;
    }
    public double getSqFt(){ return SqFt;}

    public void setPur(String Pur) {
        this.Pur = Pur;
    }
    public String getPur(){ return Pur;}
    public String getName(){return Name;}
    public void setName(String Name){
        this.Name=Name;
    }
}
