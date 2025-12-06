public class VideoPlayer implements Player {
    private boolean onOff;
    private String video;
    private int currentTime;
    private int volume;
    
    public VideoPlayer(String video) {
        this.video = video;
        this.volume = 0;
        this.onOff = false;
        this.currentTime = 0;
    }
    
    @Override
    public void start() {
        if (!onOff) {
            onOff = true;
        }
    }
    
    @Override
    public void stop() {
        if (onOff) {
            onOff = false;
        }
    }
    
    @Override
    public void volumeUp() {
        volume += 5;
    }
    
    @Override
    public void volumeDown() {
        volume -= 5;
    }
    
    @Override
    public int getVolume() {
        return volume;
    }
    
    public boolean getOnOff() {
        return onOff;
    }
    
    public void fastForward() {
        currentTime += 5;
    }
    
    public void rewind() {
        if (currentTime >= 5) {
            currentTime -= 5;
        } else {
            currentTime = 0;
        }
    }
    
    public int getCurrentTime() {
        return currentTime;
    }
    
    public String getVideo() {
        return video;
    }
    
    public void setVideo(String video) {
        this.video = video;
    }
}