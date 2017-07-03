/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

/**
 *
 * @author Acer
 */


public class AlarmClock extends Clock
{
  private int h,m,s;
  
  public AlarmClock(int hr, int min, int sec, int h,int m, int s)
  {
    super(hr, min, sec);
    this.h=h;
    this.m=m;
    this.s=s;
  }

    AlarmClock() {
        System.out.println("\nAlarmClock");
        //To change body of generated methods, choose Tools | Templates.
    }
  
  @Override
  public int getHours(){
    return super.getHours();
  }
  public void setalarm(int h,int m, int s){
    this.h=h;
    this.m=m;
    this.s=s;
  }
  @Override
  public String room()
  {
    return "Bedroom";
  }
  @Override
  public String toString(){
    String result= super.toString();
    result+="\n"+"Alarm Time: "+"\n"+h+"hr:"+m+"min:"+s+"sec"+      "\n";

      System.out.println(result);
    return result;

  }
}