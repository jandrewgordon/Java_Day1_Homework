public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;

    }

    public int getPaper() {
        return paper;
    }

    public void setPaper(int paper) {
        this.paper = paper;
    }

    public int getToner() {
        return toner;
    }

    public void setToner(int toner) {
        this.toner = toner;
    }

    public String print(int copies, int pages) {
        int amountToPrint = copies * pages;
        if(amountToPrint <= getPaper()){
            setPaper(getPaper() - amountToPrint);
            setToner(getToner() - amountToPrint);
            return "Printed";
        } else {
            return "Can't Print";
        }
    }

}
