/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constantaccelleration;

/**
 *
 * @author Michael
 */
public class Accel implements ITravelCalc {
    
    double accel = 7.4;
    double time = 0;
    double totalTime = 0;
    double distance = 0;
    double totalDistance = 0;
    double speed = 0;
    
    public Accel(double totalDistance, double totalTime){
        this.totalDistance = totalDistance;
        this.totalTime = totalTime;
        this.accel = calcAccel();
    }
    
    @Override
    public String increment() {
        time += 1;
        update();
        return this.toString();
    }
    
    @Override
    public double poll(double currentTime) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    private void update(){
        if(time<=totalTime/2){
            accellerate();
        }
        else{
            decellerate();
        }
        distance += speed;
    }

    
    
    private void accellerate(){
        speed += accel;
    }
    
    
    
    private void decellerate(){
        speed -= accel;
    }
    
    private double calcAccel(){
        
        double halfTime = totalTime/2;
        double halfDistance = totalDistance/2;
        double halfWayAverage = halfDistance/halfTime;
        double maxSpeed = halfWayAverage * 2;
        double res = maxSpeed / halfTime;
        return res;
    }

    @Override
    public String toString() {
        return "Accel{" + "accel=" + accel + ", time=" + time + ", totalTime=" + totalTime + ", distance=" + distance + ", totalDistance=" + totalDistance + ", speed=" + speed + '}';
    }
    
    
}
