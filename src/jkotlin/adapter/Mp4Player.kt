package jkotlin.adapter

class Mp4Player : AdvanceMediaPlayer {
    override fun playVlc(fileName: String) {

    }

    override fun playMp4(fileName: String) {
        println("Playing mp4 file. Name: $fileName")
    }

}