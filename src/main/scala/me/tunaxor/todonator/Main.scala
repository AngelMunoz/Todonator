package me.tunaxor.todonator

import me.tunaxor.todonator.frames.TodonatorFrame

import scala.swing.SwingApplication

object Main extends SwingApplication {

  val frame: TodonatorFrame = new TodonatorFrame()

  override def startup(args: Array[String]): Unit = {
    frame.open()
  }
}
