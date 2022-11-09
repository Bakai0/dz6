public class Skeleton extends Boss {
    private int arrows;


    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }



    public String printInfo(){
        return  super.print() +  " " + getArrows() ;
    }

    public void setNumberOfArrows(int i) {
    }

    public void setBow(Weapon weapon) {
    }
}
