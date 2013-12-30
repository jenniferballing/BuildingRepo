/**
 * Created by jensbaby on 12/30/13.
 */
import java.util.ArrayList;

public class Main {

    public static void main (String [] args)
    {
        ArrayList<Building> buildings= new ArrayList<Building>();

        //Grocery Store info, Kmart real constructor,
        //Walmart default constructor
        Building Kmart = new Grocery("K-Mart", 10000, " To Ship Your Pants.", 14, 2, 5002, 1);

        Building Walmart = new Grocery();
        Walmart.setName("Walmart");
        Walmart.setPur("Grocery SuperMarket");
        Walmart.setSqFt(10900);
        ((Grocery)Walmart).setNumEmploy(1500);
        ((Grocery) Walmart).setFloors(2);
        ((Grocery) Walmart).setNumCust(9000);
        Walmart.setSqFt(15000);
        Walmart.setPur(" Hold Way Too Many People.");
        ((Grocery) Walmart).setHeatCoolCost(4800);
        //System.out.println("Walmart Info: " + Walmart);
        //System.out.println("Kmart Info: " + Kmart);

        //OfficeSpace info, StripMall real constructor
        //LawOffice default constructor
        Building StripMall=new OfficeSpace("Generic Strip Mall",4400, " Jump Off Space for Weird Small Businesses That Won't Last.", 12, 1700, 800, 1);

        Building LawOffice=new OfficeSpace();
        LawOffice.setName("Law Firm");
        LawOffice.setPur(" Place for People to Make $500/hr.");
        LawOffice.setSqFt(6500);
        ((OfficeSpace)LawOffice).setFloors(4);
        ((OfficeSpace) LawOffice).setNumBusiness(3);
        ((OfficeSpace) LawOffice).setTurnOverCost(1000);
        ((OfficeSpace) LawOffice).setNumVisit(65);
        //System.out.println("StripMall Info: " + StripMall);
        //System.out.println("LawOffice Info: " + LawOffice);

        buildings.add(Walmart);
        buildings.add(Kmart);
        buildings.add(StripMall);
        buildings.add(LawOffice);

        //Array of info:
        System.out.println("Base Class Info from ArrayList:\n");
        for (int i=0; i<buildings.size(); i++ )
        {
            System.out.println(buildings.get(i).getName()+": ");
            System.out.println("Square Footage:" + buildings.get(i).getSqFt());
            System.out.println("Purpose of Building:" + buildings.get(i).getPur()+"\n");
        }

    }
}
