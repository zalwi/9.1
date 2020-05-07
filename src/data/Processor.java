package data;

public class Processor extends SiliconItem{

    private static final String ITEM_NAME_IN_POLISH = "Procesor";
    private static final int RISE_OF_TEMPERATURE = 10;

    public Processor(String name, String manufacturer, String serialNumber, int baseClockFrequency, int overclockFrequency, double idleTemperature, double maxSafeTemperature) {
        super(name, manufacturer, serialNumber, baseClockFrequency, overclockFrequency, idleTemperature, maxSafeTemperature);
    }

    @Override
    public void overclock(int frequencyInMhz) {
        tryChangeFrequency(frequencyInMhz,RISE_OF_TEMPERATURE,ITEM_NAME_IN_POLISH);
    }
}
