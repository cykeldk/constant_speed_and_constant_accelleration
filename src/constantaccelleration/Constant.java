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
public class Constant implements ITravelCalc{
    double time = 0;
    double totalTime = 0;
    double distance = 0;
    double totalDistance = 0;
    double speed = 0;
    double accel = 0;
    
    
    public Constant(double totalDistance, double totalTime){
        this.totalDistance = totalDistance;
        this.totalTime = totalTime;
        speed = totalDistance/totalTime;
    }

    @Override
    public String increment() {
        time += 1;
        update();
        return toString();
    }
    
    private void update(){
        distance += speed;
    }

    @Override
    public double poll(double currentTime) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return "Const{" + "accel=" + accel + ", time=" + time + ", totalTime=" + totalTime + ", distance=" + distance + ", totalDistance=" + totalDistance + ", speed=" + speed + '}';
    }
}
