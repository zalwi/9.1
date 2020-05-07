package data;

public class RamMemory extends SiliconItem{

    private int memoryInMB;
    private static final String ITEM_NAME_IN_POLISH = "Pamieć";
    private static final int RISE_OF_TEMPERATURE = 15;

    public RamMemory(String name, String manufacturer, String serialNumber, int baseClockFrequency, int overclockFrequency, double idleTemperature, double maxSafeTemperature, int memoryInMB) {
        super(name, manufacturer, serialNumber, baseClockFrequency, overclockFrequency, idleTemperature, maxSafeTemperature);
        this.memoryInMB = memoryInMB;
    }

    @Override
    public void overclock(int frequencyInMhz) {
        tryChangeFrequency(frequencyInMhz,RISE_OF_TEMPERATURE,ITEM_NAME_IN_POLISH);
    }
}
