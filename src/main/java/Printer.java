public class Printer {
    private int paperLeft;

    public Printer(){
        this.paperLeft = 100;
    }


    public int getPaperLeft() {
        return this.paperLeft;
    }

    public void print(int pages, int copies){
        if(this.paperLeft >= (pages * copies)){
            this.paperLeft = this.paperLeft - (pages * copies);
        }

    }
}
