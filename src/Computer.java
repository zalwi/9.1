import data.Harddrive;
import data.Processor;
import data.RamMemory;
import logic.Overclock;

public class Computer {
    public static void main(String[] args) {
        Harddrive harddrive = new Harddrive("Blue", "Seagate", "2334/2384-21", 128);
        Processor processor = new Processor("Ryzen", "AMD", "12395903-123-123",
                                            2000, 0, 50, 95);
        RamMemory ramMemory = new RamMemory("Black", "GOODRAM", "57838/3425/21",
                                            1066,0, 60, 120, 2048);

        Overclock[] overclocks = {processor,ramMemory};

        // zwieksz czestotliwość w podzespołach krzemowych o 100MHz
        for(Overclock o: overclocks){
            o.overclock(100);
        }
        // zwieksz o kolejne 200 MHz
        for(Overclock o: overclocks){
            o.overclock(200);
        }
        // Symulacja przekroczenia temperatury w podzespołach
        for(Overclock o: overclocks){
            o.overclock(1000);
        }

        processor.eraseOverclock();
        ramMemory.eraseOverclock();
    }
}
