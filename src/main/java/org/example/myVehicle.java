package org.example;

public class myVehicle {
    private Car myCar;
    private AutoWiring wired;
    //setter injection
    public AutoWiring getWired() {
        return wired;
    }

    public void setWired(AutoWiring wired) {
        this.wired = wired;
    }


    public Car getMyCar() {
        return myCar;
    }

    public void setMyCar(Car myCar) {
        this.myCar = myCar;
    }




    public void build(){
        myCar.compile();
        wired.call();
        System.out.println("This is constructor injection, where object is invoked with construcotr");
    }






}
