public class empresa {
    private int autobus;
    private int passatgers;

    public empresa(int autobus, int passatgers) {
        this.autobus = autobus;
        this.passatgers = passatgers;
    }
    public int seientsFlota() {
        return this.autobus*this.passatgers;
    }
}
