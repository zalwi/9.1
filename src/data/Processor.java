package data;

public class Processor extends SiliconItem{

    private static final int RISE_OF_TEMPERATURE = 10;

    public Processor(String name, String manufacturer, String serialNumber, int baseClockFrequency, int overclockFrequency, double idleTemperature, double maxSafeTemperature) {
        super(name, manufacturer, serialNumber, baseClockFrequency, overclockFrequency, idleTemperature, maxSafeTemperature);
    }

    @Override
    public void overclock(int frequencyInMhz) {
        int additionalTemperature = ((frequencyInMhz + getOverclockFrequency())/100) *  RISE_OF_TEMPERATURE;
        if((getIdleTemperature() + additionalTemperature) > getMaxSafeTemperature()){
            System.out.println("Procesor nie może zostać podkręcony do " + (getBaseClockFrequency() + getOverclockFrequency() + frequencyInMhz)
                                + " MHz, przekroczono maksymalną temperaturę! " + (getIdleTemperature() + additionalTemperature)
                                + "/" + getMaxSafeTemperature());
        }else
        {
            setOverclockFrequency((frequencyInMhz + getOverclockFrequency()));
            System.out.println("Procesor podkręcony do " + (getBaseClockFrequency() + getOverclockFrequency()));
        }
    }
}
