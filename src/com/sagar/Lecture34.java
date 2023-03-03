package com.sagar;

public class Lecture34  {
    public static void main(String[] args) {
        //encapsulation - implementation level
        //abstraction - design level
        RaceCar raceCar=new RaceCar();
        raceCar.setKey("xyz");
        //
        //



        raceCar.setEngine("Engineeeee","xyza");
        System.out.println(raceCar.getEngine());

    }
}
class RaceCar{
    private String engine;
    private String key;

    public void setKey(String key){
        if(this.key==null)this.key=key;
    }
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine,String key) {
        if(this.engine==null &&
                this.key!=null &&
                this.key.equals(key)){
            this.engine = engine;
        }else{
            System.out.println("Wrong input");
        }
    }
}
