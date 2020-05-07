package data;

public class RamMemory extends SiliconItem{

    private int memoryInMB;
    private static final int RISE_OF_TEMPERATURE = 15;

    public RamMemory(String name, String manufacturer, String serialNumber, int baseClockFrequency, int overclockFrequency, double idleTemperature, double maxSafeTemperature, int memoryInMB) {
        super(name, manufacturer, serialNumber, baseClockFrequency, overclockFrequency, idleTemperature, maxSafeTemperature);
        this.memoryInMB = memoryInMB;
    }

    @Override
    public void overclock(int frequencyInMhz) {
        int additionalTemperature = ((frequencyInMhz + getOverclockFrequency())/100) *  RISE_OF_TEMPERATURE;
        if((getIdleTemperature() + additionalTemperature) > getMaxSafeTemperature()){
            System.out.println("Pamieć nie może zostać podkręcona do " + (getBaseClockFrequency() + getOverclockFrequency() + frequencyInMhz)
                    + " MHz, przekroczono maksymalną temperaturę! " + (getIdleTemperature() + additionalTemperature)
                    + "/" + getMaxSafeTemperature());
        }else
        {
            setOverclockFrequency((frequencyInMhz + getOverclockFrequency()));
            System.out.println("Pamieć podkręcona do " + (getBaseClockFrequency() + getOverclockFrequency()));
        }
    }
}
