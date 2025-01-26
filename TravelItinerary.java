import java.util.Scanner;
class Travelplan{
    String [] destination;
    String [] date;
    String [] activity;
    Travelplan(String[] des,String[] da,String[] act){
        this.destination=des;
        this.date=da;
        this.activity=act;
    }
    public void display(){
      for(int i=0;i<destination.length;i++){
    System.out.println("Place: "+destination[i]+"\tDate: "+date[i]+"\tActivity: "+activity[i]);
    System.out.println();
      }
    }   
}
public class TravelItinerary{
 public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
  System.out.println("Enter start point of your tarvel : ");
  String start=s.nextLine();
  System.out.println("Enter final destination : ");
  String des=s.nextLine();
  double budget;

  System.out.println("Enter number of Destination you want to travel : ");
  int n=s.nextInt();
  String destination[]=new String[n];
  String date[]=new String[n];
  String activity[]=new String[n];
  s.nextLine();
  for(int i=0;i<n;i++){
    System.out.print("Enter destination "+(i+1));
    destination[i]=s.nextLine();
    System.out.print("Enter date : ");
    date[i]=s.nextLine();
    System.out.print("Enter palnned Activity or simply to enjoy : ");
    activity[i]=s.nextLine();
  }
    
    Travelplan tp=new Travelplan(destination,date,activity);
    tp.display();
  
  System.out.println("Enter budget: ");
  budget=s.nextDouble();
  System.out.println("Budget palnned for trip: "+budget);
  s.close();
 }
}