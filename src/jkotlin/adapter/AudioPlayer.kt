package jkotlin.adapter

class AudioPlayer : MediaPlayer {
    private lateinit var mediaAdapter: MediaAdapter

    override fun play(audioType: String, fileName: String) {
        // 播放 mp3 音乐文件的内置支持
        if (audioType.equals("mp3", true)) {
            println("Playing mp3 file. Name: $fileName")
        }
        // mediaAdapter 提供了播放其他文件格式的支持
        else if (audioType.equals("vlc", true)
                || audioType.equals("mp4", true)) {
            mediaAdapter = MediaAdapter(audioType)
            mediaAdapter.play(audioType, fileName)
        } else {
            println("Invalid media. $audioType format not supported.")
        }
    }
}