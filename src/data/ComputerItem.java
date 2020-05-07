package data;

abstract class ComputerItem {
    private String name;
    private String manufacturer;
    private String serialNumber;

    public ComputerItem(String name, String manufacturer, String serialNumber) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
    }
}
