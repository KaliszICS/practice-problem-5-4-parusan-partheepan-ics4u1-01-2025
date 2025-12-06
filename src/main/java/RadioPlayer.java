public class RadioPlayer implements Player {
    private boolean onOff;
    private double[] stationList;
    private int volume;
    private double station;
    
    public RadioPlayer(double[] stationList) {
        this.stationList = stationList;
        this.volume = 0;
        this.onOff = false;
        this.station = 0.0;
    }
    
    @Override
    public void start() {
        if (!onOff) {
            onOff = true;
            if (stationList.length > 0) {
                station = stationList[0];
            }
        }
    }
    
    @Override
    public void stop() {
        if (onOff) {
            onOff = false;
            station = 0.0;
        }
    }
    
    @Override
    public void volumeUp() {
        volume += 2;
    }
    
    @Override
    public void volumeDown() {
        volume -= 2;
    }
    
    @Override
    public int getVolume() {
        return volume;
    }
    
    public boolean getOnOff() {
        return onOff;
    }
    
    public void next() {
        if (onOff && stationList.length > 0) {
            for (int i = 0; i < stationList.length; i++) {
                if (stationList[i] == station && i < stationList.length - 1) {
                    station = stationList[i + 1];
                    break;
                }
            }
        }
    }
    
    public void previous() {
        if (onOff && stationList.length > 0) {
            for (int i = 0; i < stationList.length; i++) {
                if (stationList[i] == station && i > 0) {
                    station = stationList[i - 1];
                    break;
                }
            }
        }
    }
    
    public double getStation() {
        return station;
    }
}