package zones.east_zone.west_bengal;
import zones.east_zone.west_bengal.asansol.*;
import zones.east_zone.west_bengal.bardhaman.*;
import zones.east_zone.west_bengal.durgapur.*;
import zones.east_zone.west_bengal.kolkata.*;
import java.io.*;
public class call_west_bengal 
{
    public void state()throws IOException
    {
        try{
        BufferedReader c_wb=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nMake a choice of your city");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[1]-->ASANSOL");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[2]-->BARDHAMAN");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[3]-->DURGAPUR");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n[4]-->KOLKATA");
         try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n");
        System.out.print("\n*************************************************_________________________________________**************************************************");
        try{Thread.sleep(300);}catch (Exception e){}
        System.out.print("\n");
        String i_wb=c_wb.readLine();
        int I_wb=Integer.parseInt(i_wb);
        
        switch(I_wb)
        {
            case 1:
            asansol ob=new asansol();
            ob.cmpny();
            break;
            case 2:
            bardhaman ob1=new bardhaman();
            ob1.cmpny();
            break;
            case 3:
            durgapur ob2=new durgapur();
            ob2.cmpny();
            break;
            case 4:
            kolkata ob3=new kolkata();
            ob3.cmpny();
            break;
            default:System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e){};
            call_west_bengal oi=new call_west_bengal();
            oi.state();
        }
    }
    catch(Exception e) 
    {
    System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e1){};
            call_west_bengal oi=new call_west_bengal();
            oi.state();
        }
        }
    }    