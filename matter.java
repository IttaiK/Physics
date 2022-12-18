public class matter {

    boolean end = false;//kill loop kept outside to keep it more applicable in the future

    public double myPosition = 0;
    public double myVelocity = 0;
    public double myAcceleration = 1;
    public double force = 1;
    public double mass = 2;
    public String name = "";

    public matter(){}

    //allternate constructor that fills in values;
    public matter(double _pos){
        myPosition = _pos;
    }
    
    //changes position based on velocity
    public void updatePosition(double dt){
        myPosition += myVelocity*dt;
    }

    public void setName(String _name){
        name = _name;
    }

    //changes velocity based on acceleration
    public void updateVelocity(double dt){
        myVelocity += myAcceleration*dt;
    }

    //changes acceleration based on Newton's 2nd law
    public void updateAcceleration(){
        myAcceleration = force/mass;
    }

    public void update(double dt){
        updateAcceleration();
        updateVelocity(dt);
        updatePosition(dt);
        System.out.println(this);

        if(myPosition > 10){
            end = true;
        }
    }

    public String toString(){
        return name + "'s position is: " + myPosition + ".";
    }
}
