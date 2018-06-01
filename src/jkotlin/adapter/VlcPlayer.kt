package jkotlin.adapter

class VlcPlayer : AdvanceMediaPlayer {
    override fun playVlc(fileName: String) {
        println("Playing vlc file. Name: $fileName")
    }

    override fun playMp4(fileName: String) {

    }
}