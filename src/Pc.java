public class Pc {
    private Case thecase;
    private Monitor monitor;
    private Motherboard motherboard;

    public Pc(Case thecase, Monitor monitor, Motherboard motherboard) {
        this.thecase = thecase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp(){
        thecase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixleAt(1200,50,"yellow");
    }


}
