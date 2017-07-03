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

    public class Clock {
    int hr;
    int min;
    int sec;
    private String room;
    
    Clock(){
        this.hr=0;
        this.min=0;
        this.sec=0;   
        this.room=room;
    }
    Clock(int hr, int min, int sec){
        this.hr=hr;
        this.min=min;
        this.sec=sec;
     //   this.room=room;
    }
    void setTime(int hr, int min, int sec){
        this.hr=hr;
        this.min=min;
        this.sec=sec;
    }
    int getHours(){
        return this.hr;
    }
    int getMinutes(){
        return this.min;
    }    
    int getSeconds(){
        return this.sec;
    }
    void printTime(){
        System.out.println(this.hr+"hr:"+this.min+"min:"+this.sec+"sec");
    }
    @Override
    public String toString(){
    String result= "";
    result +="In room: "+ room()+"\n";
    return result;
  }
    
    public  void setRoom(String x_room)
  {
    room=x_room;
  }
  
  public String room()
  {
    return "Living Room";
  }
    
    
    
    
    int incrementSeconds(){
        this.sec++;
        if(sec > 59){
            sec = 0;
            incrementMinutes();
        }
        return this.sec;
        
        
        
      //  return this.sec+1;
    }
    int incrementMinutes(){
        this.min++;
        if(min > 59){
            min = 0;
            incrementHours();
        }
        return this.min;        
        
        
       // return this.min+1;
    }
    int incrementHours(){
        this.hr++;
        if(hr > 59){
            hr = 0;
            incrementHours();
        }
        return this.hr;




        //return this.hr+1;
    }    
    public boolean equals(Clock c){ 
        return (this.hr == c.hr && this.min == c.min && this.sec == c.sec);
    } 
    
    public void makeCopy(Clock c){
        this.hr = c.hr;
        this.min = c.min;
        this.sec = c.sec;
    }
    public Clock getCopy(){
        Clock temp = new Clock();
        
        temp.hr = hr;
        temp.min = min;
        temp.sec = sec;
        
        return temp;
    }
    
    int decrementSeconds(){
        this.sec--;
        if(sec < 0){
            sec = 59;
            decrementMinutes();
        }
        return this.sec;    

//    return this.sec-1;
    }
    int decrementMinutes(){
        this.min--;
        if(min < 0){
            min = 59;
            decrementHours();
        }
        return this.min;        
        
        
        
        
     //   return this.min-1;
    }
    int decrementHours(){
        this.hr--;
        if(hr < 0){
            hr = 0;
        }
        return this.hr;
        
        
     //   return this.hr-1;
    }   
     
}

    
    
    
    
    
    
    
   
