public class simulation {

    public static void main(String[] args){

        matter me = new matter(10);
        matter you = new matter();
        matter him = new matter(20);

        me.setName("Me");
        you.setName("You");
        him.setName("Him");

        double dt = 0.1;

        while(!me.end){
            //newtons third law
            me.force = computeForce(me, you);
            you.force = computeForce(you,me);
            him.force = computeForce(him,me);
            him.force += computeForce(him,you);
            me.force += computeForce(me, him);
            you.force += computeForce(you,him);

            me.update(dt);
            you.update(dt);
            him.update(dt);
        }
    }

    public static double computeForce(matter a, matter b){
        return b.myPosition - a.myPosition;
    }
}
