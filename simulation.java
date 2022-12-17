public class simulation {
    public static void main(String[] args){

        boolean end = false;//kill loop kept outside to keep it more applicable in the future

        matter me = new matter();
        matter you = new matter();
        you.force = -me.force;//Newton's third law

        while(!end){
            me.updateAcceleration();
            me.updatePosition();
            me.updateVelocity();
            System.out.println("Me ::  " + me);

            you.updateAcceleration();
            you.updatePosition();
            you.updateVelocity();
            System.out.println("You ::  " + you);

            if(me.myPosition > 10){
                end = true;
            }
        }
    }
}
