package zones.east_zone.bihar.gaya;
import zones.*;
import java.io.*;
public class SAGAR implements call_cmpny
{
    public void prdcts() throws IOException
    {
        try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\f");
        System.out.print("\n_________________________________________________________________");
        System.out.print("\n                              SAGAR                              ");
        System.out.print("\n_________________________________________________________________");
        System.out.println("\n\nWelcome to SAGAR. Select your choice.");
        System.out.println("\n\n[1]--> MILK");
        System.out.print("\n[2]--> CURD");
        System.out.print("\n[3]--> BUTTER");
        System.out.print("\n[4]--> PANEER");
        System.out.print("\n[5]--> CHEESE");
        String s=br.readLine();
        int k=Integer.parseInt(s);
        switch(k)
        {
            case 1:
            try{
            System.out.println("\n\n[1]--> DOUBLE TOND");
            System.out.println("\n[2]--> TOND");
            System.out.println("\n[3]--> FULL CREAM\n");
            String c=br.readLine();
            int j=Integer.parseInt(s);
            switch(j)
            {
                case 1:
                System.out.println("\f");
                System.out.println("\n>>>>>>>>>>>>>>>>>>>> DOUBLE  TOND  MILK <<<<<<<<<<<<<<<<<<<<");
                System.out.println("\n\n\n\n# PRODUCTION PER DAY = 12 lakh liters");
                System.out.println("\n\n# FAT = 1.5%");
                System.out.println("\n\n# PHONE NUMBER = 02827627127/22/23");
                double n;
                try{
                    System.out.println("\n\n# COST PER LITER = Rs.28/-");
                    System.out.println("\n\n# DISCOUNT = 10%");
                    System.out.println("\n\nPRESS 0 TO PROCEED\n    OR\nPRESS * TO GO BACK");
                    String sc=br.readLine();
                    if(sc.equals("0"))
                    {
                        System.out.println("\f");
                        try{Thread.sleep(200);}catch (Exception r){}
                        System.out.print("\n\t\t\t\t\t\t\t\tTERMS AND CONDITIONS");
                        try{Thread.sleep(200);}catch (Exception r){}
                        System.out.print("\n-->The percentage discount you get goes on to become your points.");
                        try{Thread.sleep(200);}catch (Exception r){}
                        System.out.print("\n-->On signing in as a new user,you get 50 points as default.");
                        try{Thread.sleep(200);}catch (Exception r){}
                        System.out.print("\n-->The points you have in your account can be used as discount percent in your order.");
                        try{Thread.sleep(200);}catch (Exception r){}
                        System.out.print("\n-->The points to be used as discount percent cannot exceed 25.");
                        try{Thread.sleep(200);}catch (Exception r){}
                        System.out.print("\n-->The mode of redeeming of points is not valid during a sale.");
                        try{Thread.sleep(200);}catch (Exception r){}
                        System.out.print("\n-->But we are sorry to inform you that you cannot redeem your points now because your placed order has already got discount.");
                        try{Thread.sleep(200);}catch (Exception r){}
                        System.out.print("\n-->To redeem the points,you will have to come again.");
                        try{Thread.sleep(200);}catch (Exception r){}
                        System.out.println("\n\n\nYOU HAVE 60 POINTS");
                        System.out.println("\n\nQUANTITY (In Liter):");
                        n=Double.parseDouble(br.readLine());
                        double ttl=n*28*0.90;
                        System.out.println("\nTOTAL PRICE = Rs."+ttl);
                    }
       
       else if(sc.equals("*"))
       {
           shop ao= new shop();
           ao.states();
        }
    }
    catch (Exception e)
{
    System.out.print("\n\nWrong input");
    try{Thread.sleep(500);}catch (Exception e1){}
    SAGAR a=new SAGAR();
    a.prdcts();
}

                break;
                case 2:
                System.out.println("\f");
                System.out.println("\n>>>>>>>>>>>>>>>>>>>> TOND  MILK <<<<<<<<<<<<<<<<<<<<");
                System.out.println("\n\n\n\n# PRODUCTION PER DAY = 6 lakh liters");
                System.out.println("\n\n# FAT = 3.5%");
                System.out.println("\n\n# PHONE NUMBER = 016486253827/22/23");
        double n1;
        try{
        System.out.println("\n\n# COST PER LITER = Rs.32/-");
        System.out.println("\n\n# DISCOUNT = 15%");
        System.out.println("\n\nPRESS 0 TO PROCEED\n    OR\nPRESS * TO GO BACK");
        String sc=br.readLine();
        if(sc.equals("0"))
        {
            System.out.println("\f");
             try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n\t\t\t\t\t\t\t\tTERMS AND CONDITIONS");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The percentage discount you get goes on to become your points.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->On signing in as a new user,you get 50 points as default.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The points you have in your account can be used as discount percent in your order.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The points to be used as discount percent cannot exceed 25.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The mode of redeeming of points is not valid during a sale.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->But we are sorry to inform you that you cannot redeem your points now because your placed order has already got discount.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->To redeem the points,you will have to come again.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.println("\n\n\nYOU HAVE 65 POINTS");
       System.out.println("\n\nQUANTITY (In Liter):");
       n1=Double.parseDouble(br.readLine());
       double ttl1=n1*32*0.85;
       System.out.println("\nTOTAL PRICE = Rs."+ttl1);
    }
       else if(sc.equals("*"))
       {
           shop ao= new shop();
           ao.states();
        }
    }
    catch (Exception e)
{
    System.out.print("\n\nWrong input");
    try{Thread.sleep(500);}catch (Exception e1){}
    SAGAR a=new SAGAR();
    a.prdcts();
}
                break;
                case 3:
                System.out.println("\f");
                System.out.println("\n>>>>>>>>>>>>>>>>>>>> FULL CREAM  MILK <<<<<<<<<<<<<<<<<<<<");
                System.out.println("\n\n\n\n# PRODUCTION PER DAY = 10 lakh liters");
                System.out.println("\n\n# FAT = 6%");
                System.out.println("\n\n# PHONE NUMBER = 02110827627/22/23");
        double n2;
        try{
        System.out.println("\n\n# COST PER LITER = Rs.36/-");
        System.out.println("\n\n# DISCOUNT = 20%");
        System.out.println("\n\nPRESS 0 TO PROCEED\n    OR\nPRESS * TO GO BACK");
        String sc=br.readLine();
        if(sc.equals("0"))
        {
            System.out.println("\f");
             try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n\t\t\t\t\t\t\t\tTERMS AND CONDITIONS");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The percentage discount you get goes on to become your points.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->On signing in as a new user,you get 50 points as default.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The points you have in your account can be used as discount percent in your order.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The points to be used as discount percent cannot exceed 25.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The mode of redeeming of points is not valid during a sale.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->But we are sorry to inform you that you cannot redeem your points now because your placed order has already got discount.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->To redeem the points,you will have to come again.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.println("\n\n\nYOU HAVE 70 POINTS");
       System.out.println("\n\nQUANTITY (In Liter):");
       n2=Double.parseDouble(br.readLine());
       double ttl2=n2*36*0.80;
       System.out.println("\nTOTAL PRICE = Rs."+ttl2);
    }
       else if(sc.equals("*"))
       {
           shop ao= new shop();
           ao.states();
        }
    }
    catch (Exception e)
{
    System.out.print("\n\nWrong input");
    try{Thread.sleep(500);}catch (Exception e1){}
    SAGAR a=new SAGAR();
    a.prdcts();
}
                break;
                default:System.out.println("Wrong input");
                try{Thread.sleep(1000);}catch(Exception e){};
                SAGAR oi=new SAGAR();
                oi.prdcts();
            }
        } catch (Exception e1)
        {
            System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e){};
            SAGAR oi=new SAGAR();
            oi.prdcts();
        }
        break;
        case 2:
        try{
            System.out.println("\n\n[1]--> PLAIN DAHI");
            System.out.println("\n[2]--> MISTI DAHI\n");
            String c=br.readLine();
            int l=Integer.parseInt(s);
            switch(l)
            {
                case 1:
                System.out.println("\f");
                System.out.println("\n>>>>>>>>>>>>>>>>>>>> PLAIN DAHI <<<<<<<<<<<<<<<<<<<<");
                System.out.println("\n\n\n\n# PRODUCTION PER DAY = 800Kg");
                System.out.println("\n\n# FAT = 4.5%");
                System.out.println("\n\n# PHONE NUMBER = 021156286827/22/23");
        double n3;
        try{
        System.out.println("\n\n# COST PER 500g = Rs.70/-");
        System.out.println("\n\n# DISCOUNT = 15%");
        System.out.println("\n\nPRESS 0 TO PROCEED\n    OR\nPRESS * TO GO BACK");
        String sc=br.readLine();
        if(sc.equals("0"))
        {
            System.out.println("\f");
             try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n\t\t\t\t\t\t\t\tTERMS AND CONDITIONS");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The percentage discount you get goes on to become your points.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->On signing in as a new user,you get 50 points as default.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The points you have in your account can be used as discount percent in your order.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The points to be used as discount percent cannot exceed 25.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The mode of redeeming of points is not valid during a sale.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->But we are sorry to inform you that you cannot redeem your points now because your placed order has already got discount.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->To redeem the points,you will have to come again.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.println("\n\n\nYOU HAVE 65 POINTS");
       System.out.println("\n\nQUANTITY (In Kg) :");
       n3=Double.parseDouble(br.readLine());
       double ttl3=2*n3*70*0.85;
       System.out.println("\nTOTAL PRICE = Rs."+ttl3);
    }
       else if(sc.equals("*"))
       {
           shop ao= new shop();
           ao.states();
        }
    }
    catch (Exception e)
{
    System.out.print("\n\nWrong input");
    try{Thread.sleep(500);}catch (Exception e1){}
    SAGAR a=new SAGAR();
    a.prdcts();
}
                break;
                case 2:
                System.out.println("\f");
                System.out.println("\n>>>>>>>>>>>>>>>>>>>> MISTI DAHI <<<<<<<<<<<<<<<<<<<<");
                System.out.println("\n\n\n\n# PRODUCTION PER DAY = 1000Kg");
                System.out.println("\n\n# FAT = 7%%");
                System.out.println("\n\n# PHONE NUMBER = 0211043782367/22/23");
        double n4;
        try{
        System.out.println("\n\n# COST PER 500g = Rs.95/-");
        System.out.println("\n\n# DISCOUNT = 20%");
        System.out.println("\n\nPRESS 0 TO PROCEED\n    OR\nPRESS * TO GO BACK");
        String sc=br.readLine();
        if(sc.equals("0"))
        {
            System.out.println("\f");
             try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n\t\t\t\t\t\t\t\tTERMS AND CONDITIONS");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The percentage discount you get goes on to become your points.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->On signing in as a new user,you get 50 points as default.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The points you have in your account can be used as discount percent in your order.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The points to be used as discount percent cannot exceed 25.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The mode of redeeming of points is not valid during a sale.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->But we are sorry to inform you that you cannot redeem your points now because your placed order has already got discount.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->To redeem the points,you will have to come again.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.println("\n\n\nYOU HAVE 70 POINTS");
       System.out.println("\n\nQUANTITY (In Kg) :");
       n4=Double.parseDouble(br.readLine());
       double ttl4=2*n4*95*0.80;
       System.out.println("\nTOTAL PRICE = Rs."+ttl4);
    }
       else if(sc.equals("*"))
       {
           shop ao= new shop();
           ao.states();
        }
    }
    catch (Exception e)
{
    System.out.print("\n\nWrong input");
    try{Thread.sleep(500);}catch (Exception e1){}
    SAGAR a=new SAGAR();
    a.prdcts();
}
                break;
                default:System.out.println("Wrong input");
                try{Thread.sleep(1000);}catch(Exception e){};
                SAGAR oi=new SAGAR();
                oi.prdcts();
            }
        }
        catch (Exception e1)
        {
            System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e){};
            SAGAR oi=new SAGAR();
            oi.prdcts();
        }
        break;
        case 3:
        try{
            System.out.println("\n\n[1]--> SWEET BUTTER");
            System.out.println("\n[2]--> SALTED BUTTER");
            System.out.println("\n[3]--> GHEE\n");
            String c=br.readLine();
            int m=Integer.parseInt(s);
            switch(m)
            {
                case 1:
                System.out.println("\f");
                System.out.println("\n>>>>>>>>>>>>>>>>>>>> SWEET BUTTER <<<<<<<<<<<<<<<<<<<<");
                System.out.println("\n\n\n\n# PRODUCTION PER DAY = 550Kg");
                System.out.println("\n\n# FAT = 80%");
                System.out.println("\n\n# PHONE NUMBER = 021128762827/22/23");
        double n5;
        try{
        System.out.println("\n\n# COST PER 500g = Rs.145/-");
        System.out.println("\n\n# DISCOUNT = 20%");
        System.out.println("\n\nPRESS 0 TO PROCEED\n    OR\nPRESS * TO GO BACK");
        String sc=br.readLine();
        if(sc.equals("0"))
        {
            System.out.println("\f");
             try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n\t\t\t\t\t\t\t\tTERMS AND CONDITIONS");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The percentage discount you get goes on to become your points.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->On signing in as a new user,you get 50 points as default.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The points you have in your account can be used as discount percent in your order.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The points to be used as discount percent cannot exceed 25.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The mode of redeeming of points is not valid during a sale.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->But we are sorry to inform you that you cannot redeem your points now because your placed order has already got discount.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->To redeem the points,you will have to come again.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.println("\n\n\nYOU HAVE 70 POINTS");
       System.out.println("\n\nQUANTITY (in kg) :");
       n5=Double.parseDouble(br.readLine());
       double ttl5=2*n5*145*0.80;;
       System.out.println("\nTOTAL PRICE = Rs."+ttl5);
    }
       else if(sc.equals("*"))
       {
           shop ao= new shop();
           ao.states();
        }
    }
    catch (Exception e)
{
    System.out.print("\n\nWrong input");
    try{Thread.sleep(500);}catch (Exception e1){}
    SAGAR a=new SAGAR();
    a.prdcts();
}
                break;
                case 2:
                System.out.println("\f");
                System.out.println("\n>>>>>>>>>>>>>>>>>>>> SALTED BUTTER <<<<<<<<<<<<<<<<<<<<");
                System.out.println("\n\n\n\n# PRODUCTION PER DAY = 650Kg");
                System.out.println("\n\n# FAT = 80%");
                System.out.println("\n\n# PHONE NUMBER = 02110243827/22/23");
        double n6;
        try{
        System.out.println("\n\n# COST PER 500g = Rs.160/-");
        System.out.println("\n\n# DISCOUNT = 20%");
        System.out.println("\n\nPRESS 0 TO PROCEED\n    OR\nPRESS * TO GO BACK");
        String sc=br.readLine();
        if(sc.equals("0"))
        {
            System.out.println("\f");
             try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n\t\t\t\t\t\t\t\tTERMS AND CONDITIONS");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The percentage discount you get goes on to become your points.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->On signing in as a new user,you get 50 points as default.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The points you have in your account can be used as discount percent in your order.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The points to be used as discount percent cannot exceed 25.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The mode of redeeming of points is not valid during a sale.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->But we are sorry to inform you that you cannot redeem your points now because your placed order has already got discount.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->To redeem the points,you will have to come again.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.println("\n\n\nYOU HAVE 70 POINTS");
       System.out.println("\n\nQUANTITY (in kg) :");
       n6=Double.parseDouble(br.readLine());
       double ttl6=2*n6*160*0.80;
       System.out.println("\nTOTAL PRICE = Rs."+ttl6);
    }
       else if(sc.equals("*"))
       {
           shop ao= new shop();
           ao.states();
        }
    }
    catch (Exception e)
{
    System.out.print("\n\nWrong input");
    try{Thread.sleep(500);}catch (Exception e1){}
    SAGAR a=new SAGAR();
    a.prdcts();
}
                break;
                case 3:
                System.out.println("\f");
                System.out.println("\n>>>>>>>>>>>>>>>>>>>> GHEE <<<<<<<<<<<<<<<<<<<<");
                System.out.println("\n\n\n\n# PRODUCTION PER DAY = 250KG");
                System.out.println("\n\n# FAT = 80%");
                System.out.println("\n\n# PHONE NUMBER = 0211356788243/32/42");
        double n7;
        try{
        System.out.println("\n\n# COST PER 500g = Rs.210/-");
        System.out.println("\n\n# DISCOUNT = 20%");
        System.out.println("\n\nPRESS 0 TO PROCEED\n    OR\nPRESS * TO GO BACK");
        String sc=br.readLine();
        if(sc.equals("0"))
        {
            System.out.println("\f");
             try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n\t\t\t\t\t\t\t\tTERMS AND CONDITIONS");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The percentage discount you get goes on to become your points.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->On signing in as a new user,you get 50 points as default.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The points you have in your account can be used as discount percent in your order.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The points to be used as discount percent cannot exceed 25.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The mode of redeeming of points is not valid during a sale.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->But we are sorry to inform you that you cannot redeem your points now because your placed order has already got discount.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->To redeem the points,you will have to come again.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.println("\n\n\nYOU HAVE 70 POINTS");
       System.out.println("\n\nQUANTITY (in kg) :");
       n7=Double.parseDouble(br.readLine());
       double ttl7=2*n7*210*0.80;
       System.out.println("\nTOTAL PRICE = Rs."+ttl7);
    }
       else if(sc.equals("*"))
       {
           shop ao= new shop();
           ao.states();
        }
    }
    catch (Exception e)
{
    System.out.print("\n\nWrong input");
    try{Thread.sleep(500);}catch (Exception e1){}
    SAGAR a=new SAGAR();
    a.prdcts();
}
                break;
                default:System.out.println("Wrong input");
                try{Thread.sleep(1000);}catch(Exception e){};
                SAGAR oi=new SAGAR();
                oi.prdcts();
            }
        }catch (Exception e1)
        {
            System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e){};
            SAGAR oi=new SAGAR();
            oi.prdcts();
        }
        break;
        case 4:
        System.out.println("\f");
        System.out.println("\n>>>>>>>>>>>>>>>>>>>> PANEER <<<<<<<<<<<<<<<<<<<<");
        System.out.println("\n\n\n\n# PRODUCTION PER DAY = 200Kg");
        System.out.println("\n\n# FAT = 1%");
        System.out.println("\n\n# CARBOHYDRATES = 5%");
        System.out.println("\n\n# PHONE NUMBER = 0211024501/02/03");
        double n8;
        try{
        System.out.println("\n\n# COST PER 500g = Rs.160/-");
        System.out.println("\n\n# DISCOUNT = 25%");
        System.out.println("\n\nPRESS 0 TO PROCEED\n    OR\nPRESS * TO GO BACK");
        String sc=br.readLine();
        if(sc.equals("0"))
        {
            System.out.println("\f");
             try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n\t\t\t\t\t\t\t\tTERMS AND CONDITIONS");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The percentage discount you get goes on to become your points.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->On signing in as a new user,you get 50 points as default.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The points you have in your account can be used as discount percent in your order.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The points to be used as discount percent cannot exceed 25.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The mode of redeeming of points is not valid during a sale.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->But we are sorry to inform you that you cannot redeem your points now because your placed order has already got discount.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->To redeem the points,you will have to come again.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.println("\n\n\nYOU HAVE 75 POINTS");
       System.out.println("\n\nQUANTITY (in kg) :");
       n8=Double.parseDouble(br.readLine());
       double ttl8=2*n8*160*0.75;
       System.out.println("\nTOTAL PRICE = Rs."+ttl8);
    }
       else if(sc.equals("*"))
       {
           shop ao= new shop();
           ao.states();
        }
    }
    catch (Exception e)
{
    System.out.print("\n\nWrong input");
    try{Thread.sleep(500);}catch (Exception e1){}
    SAGAR a=new SAGAR();
    a.prdcts();
}
        break;
        case 5:
        try{
            System.out.println("\n\n[1]--> MOZZARELLA");
            System.out.println("\n[2]--> CHEDDAR");
            System.out.println("\n[3]--> GOUDA\n");
            String c=br.readLine();
            int j=Integer.parseInt(s);
            switch(j)
            {
                case 1:
                System.out.println("\f");
                System.out.println("\n>>>>>>>>>>>>>>>>>>>> MOZZARELLA <<<<<<<<<<<<<<<<<<<<");
                System.out.println("\n\n\n\n# PRODUCTION PER DAY = 800Kg");
                System.out.println("\n\n# FAT = 38%");
                System.out.println("\n\n# PHONE NUMBER = 021102472127/23/24");
                double n9;
                try{
                    System.out.println("\n\n# COST FOR 500g = Rs.250/-");
                    System.out.println("\n\n# DISCOUNT = 10%");
                    System.out.println("\n\nPRESS 0 TO PROCEED\n    OR\nPRESS * TO GO BACK");
                    String sc=br.readLine();
                    if(sc.equals("0"))
                    {
                        System.out.println("\f");
                        try{Thread.sleep(200);}catch (Exception r){}
                        System.out.print("\n\t\t\t\t\t\t\t\tTERMS AND CONDITIONS");
                        try{Thread.sleep(200);}catch (Exception r){}
                        System.out.print("\n-->The percentage discount you get goes on to become your points.");
                        try{Thread.sleep(200);}catch (Exception r){}
                        System.out.print("\n-->On signing in as a new user,you get 50 points as default.");
                        try{Thread.sleep(200);}catch (Exception r){}
                        System.out.print("\n-->The points you have in your account can be used as discount percent in your order.");
                        try{Thread.sleep(200);}catch (Exception r){}
                        System.out.print("\n-->The points to be used as discount percent cannot exceed 25.");
                        try{Thread.sleep(200);}catch (Exception r){}
                        System.out.print("\n-->The mode of redeeming of points is not valid during a sale.");
                        try{Thread.sleep(200);}catch (Exception r){}
                        System.out.print("\n-->But we are sorry to inform you that you cannot redeem your points now because your placed order has already got discount.");
                        try{Thread.sleep(200);}catch (Exception r){}
                        System.out.print("\n-->To redeem the points,you will have to come again.");
                        try{Thread.sleep(200);}catch (Exception r){}
                        System.out.println("\n\n\nYOU HAVE 60 POINTS");
                        System.out.println("\n\nQUANTITY (In Liter):");
                        n9=Double.parseDouble(br.readLine());
                        double ttl9=2*n9*250*0.90;
                        System.out.println("\nTOTAL PRICE = Rs."+ttl9);
                    }
       
       else if(sc.equals("*"))
       {
           shop ao= new shop();
           ao.states();
        }
    }
    catch (Exception e)
{
    System.out.print("\n\nWrong input");
    try{Thread.sleep(500);}catch (Exception e1){}
    SAGAR a=new SAGAR();
    a.prdcts();
}

                break;
                case 2:
                System.out.println("\f");
                System.out.println("\n>>>>>>>>>>>>>>>>>>>> CHEDDAR <<<<<<<<<<<<<<<<<<<<");
                System.out.println("\n\n\n\n# PRODUCTION PER DAY = 850Kg");
                System.out.println("\n\n# FAT = 40%");
                System.out.println("\n\n# PHONE NUMBER = 03218217287/22/23");
        double n10;
        try{
        System.out.println("\n\n# COST FOR 500g= Rs.270/-");
        System.out.println("\n\n# DISCOUNT = 15%");
        System.out.println("\n\nPRESS 0 TO PROCEED\n    OR\nPRESS * TO GO BACK");
        String sc=br.readLine();
        if(sc.equals("0"))
        {
            System.out.println("\f");
             try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n\t\t\t\t\t\t\t\tTERMS AND CONDITIONS");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The percentage discount you get goes on to become your points.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->On signing in as a new user,you get 50 points as default.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The points you have in your account can be used as discount percent in your order.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The points to be used as discount percent cannot exceed 25.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The mode of redeeming of points is not valid during a sale.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->But we are sorry to inform you that you cannot redeem your points now because your placed order has already got discount.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->To redeem the points,you will have to come again.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.println("\n\n\nYOU HAVE 65 POINTS");
       System.out.println("\n\nQUANTITY (In Liter):");
       n10=Double.parseDouble(br.readLine());
       double ttl10=2*n10*270*0.85;
       System.out.println("\nTOTAL PRICE = Rs."+ttl10);
    }
       else if(sc.equals("*"))
       {
           shop ao= new shop();
           ao.states();
        }
    }
    catch (Exception e)
{
    System.out.print("\n\nWrong input");
    try{Thread.sleep(500);}catch (Exception e1){}
    SAGAR a=new SAGAR();
    a.prdcts();
}
                break;
                case 3:
                System.out.println("\f");
                System.out.println("\n>>>>>>>>>>>>>>>>>>>> GOUDA <<<<<<<<<<<<<<<<<<<<");
                System.out.println("\n\n\n\n# PRODUCTION PER DAY = 1000Kg");
                System.out.println("\n\n# FAT = 40%");
                System.out.println("\n\n# PHONE NUMBER = 1425273827/22/23");
        double n11;
        try{
        System.out.println("\n\n# COST FOR 500g = Rs.260/-");
        System.out.println("\n\n# DISCOUNT = 20%");
        System.out.println("\n\nPRESS 0 TO PROCEED\n    OR\nPRESS * TO GO BACK");
        String sc=br.readLine();
        if(sc.equals("0"))
        {
            System.out.println("\f");
             try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n\t\t\t\t\t\t\t\tTERMS AND CONDITIONS");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The percentage discount you get goes on to become your points.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->On signing in as a new user,you get 50 points as default.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The points you have in your account can be used as discount percent in your order.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The points to be used as discount percent cannot exceed 25.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->The mode of redeeming of points is not valid during a sale.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->But we are sorry to inform you that you cannot redeem your points now because your placed order has already got discount.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.print("\n-->To redeem the points,you will have to come again.");
       try{Thread.sleep(200);}catch (Exception r){}
       System.out.println("\n\n\nYOU HAVE 70 POINTS");
       System.out.println("\n\nQUANTITY (In Liter):");
       n11=Double.parseDouble(br.readLine());
       double ttl11=n11*260*0.80;
       System.out.println("\nTOTAL PRICE = Rs."+ttl11);
    }
       else if(sc.equals("*"))
       {
           shop ao= new shop();
           ao.states();
        }
    }
    catch (Exception e)
{
    System.out.print("\n\nWrong input");
    try{Thread.sleep(500);}catch (Exception e1){}
    SAGAR a=new SAGAR();
    a.prdcts();
}
                break;
                default:System.out.println("Wrong input");
                try{Thread.sleep(1000);}catch(Exception e){};
                SAGAR oi=new SAGAR();
                oi.prdcts();
            }
        } catch (Exception e1)
        {
            System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e){};
            SAGAR oi=new SAGAR();
            oi.prdcts();
        }
        break;
        default:System.out.println("Wrong input");
                try{Thread.sleep(1000);}catch(Exception e){};
                SAGAR oi=new SAGAR();
                oi.prdcts();
            }
        }
            catch (Exception e1)
        {
            System.out.println("Wrong input");
            try{Thread.sleep(1000);}catch(Exception e){};
            SAGAR oi=new SAGAR();
            oi.prdcts();
        }
    }
}
    