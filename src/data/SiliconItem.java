package data;

import logic.Overclock;

abstract class SiliconItem extends ComputerItem implements Overclock {
    private int baseClockFrequency;
    private int overclockFrequency;
    private double idleTemperature;
    private double maxSafeTemperature;

    public SiliconItem(String name, String manufacturer, String serialNumber, int baseClockFrequency, int overclockFrequency, double idleTemperature, double maxSafeTemperature) {
        super(name, manufacturer, serialNumber);
        this.baseClockFrequency = baseClockFrequency;
        this.overclockFrequency = overclockFrequency;
        this.idleTemperature = idleTemperature;
        this.maxSafeTemperature = maxSafeTemperature;
    }

    public int getBaseClockFrequency() {
        return baseClockFrequency;
    }

    public int getOverclockFrequency() {
        return overclockFrequency;
    }

    public double getIdleTemperature() {
        return idleTemperature;
    }

    public double getMaxSafeTemperature() {
        return maxSafeTemperature;
    }

    public void setOverclockFrequency(int overclockFrequency) {
        this.overclockFrequency = overclockFrequency;
    }

    public void tryChangeFrequency(int frequencyInMhz, int riseOfTemperature, String itemName){
        int additionalTemperature = ((frequencyInMhz + getOverclockFrequency())/100) *  riseOfTemperature;
        if((getIdleTemperature() + additionalTemperature) > getMaxSafeTemperature()){
            System.out.println(itemName + " nie może zostać podkręcona/y do " + (getBaseClockFrequency() + getOverclockFrequency() + frequencyInMhz)
                    + " MHz, przekroczono maksymalną temperaturę! " + (getIdleTemperature() + additionalTemperature)
                    + "/" + getMaxSafeTemperature());
        }else
        {
            setOverclockFrequency((frequencyInMhz + getOverclockFrequency()));
            System.out.println(itemName + " podkręcona/y do " + (getBaseClockFrequency() + getOverclockFrequency()));
        }
    }

    @Override
    public void eraseOverclock() {
        setOverclockFrequency(0);
    }
}
