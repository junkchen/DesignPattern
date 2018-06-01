package jkotlin.adapter

class MediaAdapter(val audioType: String) : MediaPlayer {
    private lateinit var advanceMediaPlayer: AdvanceMediaPlayer

    init {
        if (audioType.equals("vlc", true)) {
            advanceMediaPlayer = VlcPlayer()
        } else if (audioType.equals("mp4", true)) {
            advanceMediaPlayer = Mp4Player()
        }
    }

    override fun play(audioType: String, fileName: String) {
        if (audioType.equals("vlc", true)) {
            advanceMediaPlayer.playVlc(fileName)
        } else if (audioType.equals("mp4", true)) {
            advanceMediaPlayer.playMp4(fileName)
        }
    }

}
