package jkotlin.adapter

/**
 * 适配器模式（Adapter Pattern）
 *
 * 适配器模式是作为两个不兼容的接口之间的桥梁。属于结构型模式，它结合了两个独立接口的功能。
 * 这种模式涉及到一个单一的类，该类负责加入独立的或不兼容的接口功能。
 *
 * 意图：将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 *
 * 主要解决：主要解决在软件系统中，常常要将一些"现存的对象"放到新的环境中，而新环境要求的接口是现对象不能满足的。
 *
 * 关键代码：适配器继承或依赖已有的对象，实现想要的目标接口。
 *
 * 应用实例： 1、美国电器 110V，中国 220V，就要有一个适配器将 110V 转化为 220V。 2、JAVA JDK 1.1 提供了 Enumeration 接
 * 口，而在 1.2 中提供了 Iterator 接口，想要使用 1.2 的 JDK，则要将以前系统的 Enumeration 接口转化为 Iterator 接口，
 * 这时就需要适配器模式。
 *
 * 使用场景：有动机地修改一个正常运行的系统的接口，这时应该考虑使用适配器模式。
 */
fun main(args: Array<String>) {
    val audioPlayer = AudioPlayer()

    audioPlayer.play("mp3", "beyond the horizon.mp3")
    audioPlayer.play("mp4", "alone.mp4")
    audioPlayer.play("vlc", "far far away.vlc")
    audioPlayer.play("avi", "mind me.avi")
}