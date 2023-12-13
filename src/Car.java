public class Car {
    private long id;
    private long numberAuto;

    public Car(long id, long numberAuto) {
        this.id = id;
        this.numberAuto = numberAuto;
    }

    public Car() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumberAuto() {
        return numberAuto;
    }

    public void setNumberAuto(long numberAuto) {
        this.numberAuto = numberAuto;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", numberAuto=" + numberAuto +
                '}';
    }
}
