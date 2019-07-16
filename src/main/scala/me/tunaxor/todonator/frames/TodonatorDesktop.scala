package me.tunaxor.todonator.frames

import javax.swing.JDesktopPane

import scala.swing.{Component, Dimension, FlowPanel, Label}

object TodonatorDesktop {
  val mainDesktop: Component = Component.wrap(new JDesktopPane())
  private val _quickNotes = Component.wrap(new QuickNotesFrame(new FlowPanel {
    contents += new Label("Hello Quick Notes!")
  }))
  private val _myLists = Component.wrap(new MyListsFrame(new FlowPanel {
    contents += new Label("Hello Lists!")
  }))
  private val _settings = Component.wrap(new SettingsFrame(new FlowPanel {
    contents += new Label("Hello Settings!")
  }))
  addFrameToMainDesktop("quickNotes", _quickNotes)
  addFrameToMainDesktop("myLists", _myLists)
  addFrameToMainDesktop("settings", _settings)
  mainDesktop.visible = true

  def newDesktop(preferredSize: Dimension): Component = {
    val dsk = new JDesktopPane()
    dsk.setPreferredSize(preferredSize)
    Component.wrap(dsk)
  }

  def addInternalFrameToDesktop(desktop: Component, frame: Component): Unit = {
    desktop.peer.add(frame.peer)
  }

  def addFrameToMainDesktop(key: String, frame: Component) {
    mainDesktop.peer.add(frame.peer)
  }

}
