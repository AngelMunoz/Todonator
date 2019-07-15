package me.tunaxor.todonator.frames

import javax.swing.JDesktopPane

import scala.swing.{Component, Dimension}

object TodonatorDesktop {
  val mainDesktop: Component = Component.wrap(new JDesktopPane())
  mainDesktop.visible = true

  def newDesktop(preferredSize: Dimension): Component = {
    val dsk = new JDesktopPane()
    dsk.setPreferredSize(preferredSize)
    Component.wrap(dsk)
  }

  def addInternalFrameToDesktop(desktop: Component, frame: Component): Unit = {
    desktop.peer.add(frame.peer)
  }

  def addFrameToMainDesktop(frame: Component) {
    mainDesktop.peer.add(frame.peer)
  }
}
