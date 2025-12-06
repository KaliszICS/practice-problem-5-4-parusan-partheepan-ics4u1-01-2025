public class MusicPlayer implements Player {
    private boolean onOff;
    private String[] musicList;
    private String currentSong;
    private int volume;
    
    public MusicPlayer(String[] musicList) {
        this.musicList = musicList;
        this.volume = 0;
        this.onOff = false;
        this.currentSong = "";
    }
    
    @Override
    public void start() {
        if (!onOff) {
            onOff = true;
            if (musicList.length > 0) {
                currentSong = musicList[0];
            }
        }
    }
    
    @Override
    public void stop() {
        if (onOff) {
            onOff = false;
            currentSong = "";
        }
    }
    
    @Override
    public void volumeUp() {
        volume++;
    }
    
    @Override
    public void volumeDown() {
        volume--;
    }
    
    @Override
    public int getVolume() {
        return volume;
    }
    
    public boolean getOnOff() {
        return onOff;
    }
    
    public void next() {
        if (onOff && musicList.length > 0) {
            for (int i = 0; i < musicList.length; i++) {
                if (musicList[i].equals(currentSong) && i < musicList.length - 1) {
                    currentSong = musicList[i + 1];
                    break;
                }
            }
        }
    }
    
    public void previous() {
        if (onOff && musicList.length > 0) {
            for (int i = 0; i < musicList.length; i++) {
                if (musicList[i].equals(currentSong) && i > 0) {
                    currentSong = musicList[i - 1];
                    break;
                }
            }
        }
    }
    
    public String getCurrentSong() {
        return currentSong;
    }
}