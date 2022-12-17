public class matter {

    public double myPosition = 0;
    public double myVelocity = 0;
    public double myAcceleration;
    public double force = 1;
    public double mass = 2;

    public void matter(){}

    //allternate constructor that fills in values;
    public void matter(double myPos, double myVel, double myAcc, double _mass){
        myPosition = myPos;
        myVelocity = myVel;
        myAcceleration = myAcc;
        mass = _mass;
    }
    
    //changes position based on velocity
    public void updatePosition(){
        myPosition += myVelocity;
    }

    //changes velocity based on acceleration
    public void updateVelocity(){
        myVelocity += myAcceleration;
    }

    //changes acceleration based on Newton's 2nd law
    public void updateAcceleration(){
        myAcceleration = force/mass;
    }

    public String toString(){
        return "position is: " + myPosition + ", velocity is: " + myVelocity + ", and acceleration is: " + myAcceleration;
    }
}
