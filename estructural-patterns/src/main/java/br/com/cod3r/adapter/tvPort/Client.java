package br.com.cod3r.adapter.tvPort;

import br.com.cod3r.adapter.tvPort.adapters.HDMIToOldMonitorAdapter;
import br.com.cod3r.adapter.tvPort.adapters.HDMIToVGAAdapter;
import br.com.cod3r.adapter.tvPort.devices.Computer;
import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.devices.TV;

public class Client {

    public static void main(String[] args) {
        Computer pc = new Computer();
        TV tv = new TV();
        pc.connectPort(tv);
        pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");

        System.out.println("\n------ Monitor ----------");
        OldMonitor oldMonitor = new OldMonitor();
        // pc.connectPort(oldMonitor); // Not possible since oldMonitor doesn't implement HDMI
        HDMIToVGAAdapter adapter = new HDMIToVGAAdapter(oldMonitor);
        pc.connectPort(adapter);
        pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");

        System.out.println("\n------ Monitor Class Adapter ----------");
        Computer NASApC = new Computer();
        HDMIToOldMonitorAdapter oldMonitorAdapter = new HDMIToOldMonitorAdapter();
        NASApC.connectPort(oldMonitorAdapter);
        NASApC.sendImageAndSound("Cat and rainbow", "Nyan cat song");

    }
}
