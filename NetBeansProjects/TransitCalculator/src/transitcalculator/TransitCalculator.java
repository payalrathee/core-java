/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transitcalculator;

public class TransitCalculator
{
  int noOfDays;
  int noOfRides;
  double[] prices={2.75,33.00,127.00};
  String[] options={"Pay-per-ride","7-day Unlimited Rides","30-day Unlimited Rides"};
 //constructor
  public TransitCalculator(int days,int rides)
  {
    if(days>0&&days<=30)  
          noOfDays=days;
    else
          System.out.println("please enter upto 30 days.");
    noOfRides=rides;
  }

  //unlimited price method
  public double unlimited7Price()
  {
    int n;
       if(noOfDays%7!=0)
    n=(noOfDays/7)+1;
    else
       n=noOfDays/7; 
    double totalPrice=n*prices[1];
    double pricePerRide=totalPrice/noOfDays; 
    return Double.parseDouble(String.format("%.0f",pricePerRide));
  }
  
  //get ride prices method
  public double[] getRidePrices()
  {
      double[] pricePerRide=new double[3];
      pricePerRide[0]=prices[0];
      pricePerRide[1]=unlimited7Price();
      pricePerRide[2]=Double.parseDouble(String.format("%.0f",prices[2]/noOfRides));
      return pricePerRide;
  }
  
  //get best fare method
  public String getBestFare()
  {
     String bestFare="";
     double[] pricePerRide=getRidePrices();
     if(pricePerRide[0]<pricePerRide[1]&&pricePerRide[0]<pricePerRide[2])
     {
        bestFare="You should get the "+options[0]+" option at $"+pricePerRide[0]+" per ride.";
     }
     else if(pricePerRide[1]<pricePerRide[2])
     {
         bestFare="You should get the "+options[1]+" option at $"+pricePerRide[1]+" per ride.";
     }
     else
     {
         bestFare="You should get the "+options[2]+" option at $"+pricePerRide[2]+" per ride.";
     }
     return bestFare;
  }
  public static void main(String[] args)
  {
     TransitCalculator t=new TransitCalculator(26,54);
      System.out.println(t.getBestFare());
  }
}