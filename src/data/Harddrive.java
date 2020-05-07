package data;

public class Harddrive extends ComputerItem{
    private int memoryInGb;

    public Harddrive(String name, String manufacturer, String serialNumber, int memoryInGb) {
        super(name, manufacturer, serialNumber);
        this.memoryInGb = memoryInGb;
    }
}
