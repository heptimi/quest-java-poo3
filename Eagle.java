public class Eagle extends Bird implements fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff(){
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s take off in the sky.%n", this.getName());
        }

    }

    @Override
    public void ascend(int meters){

        if (this.flying) {

            this.altitude = this.altitude + meters;

            System.out.printf("%s flies upward, HIGHER HIGHER HIGHER HIGHER, altitude : %d%n", this.getName(), this.altitude);
        }
    }

    @Override
    public void descend(int meters){

        if (this.flying) {
            if (this.altitude < meters) {
                this.flying= false;
                System.out.printf("%s dies. Killed by floor... Pathetic");
            }
            else {
                this.altitude = this.altitude - meters;
                System.out.printf(" %s flies downward, LOWER LOWER LOWER, altitude : %d %n", this.getName(), this.altitude);
            }
        }
    }

    @Override
    public void land(){
        if (this.flying) {
            if (altitude <=1)
                System.out.printf("LANDING IN 3 2 1 ...  PSHHIOUU  ... %s lands on the ground. ", this.getName());
            else{
                System.out.printf("LANDING IN 3 2 1 ...  PSHHIOUU  ... FATAL ERROR  too high, fatal error too high,  %s can't land. ", this.getName());
            }
        }
    }




}
