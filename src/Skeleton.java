public class Skeleton extends Boss {
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public String Info(){
        return super.Info() + " количество стрел " + arrows;
    }

}
