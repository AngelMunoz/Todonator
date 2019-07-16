package me.tunaxor.todonator.frames

import javax.swing.JInternalFrame

import scala.swing.{Component, Dimension}

class SettingsFrame(
    contents: Component,
    name: String = "Settings",
    size: Dimension = new Dimension(300, 300)
) extends JInternalFrame {
  this.title = name
  this.resizable = true
  this.closable = false
  this.maximizable = true
  this.iconable = true
  this.desktopIcon = new JInternalFrame.JDesktopIcon(this)
  this.setSize(size)
  this.setContentPane(contents.peer)
  this.setVisible(true)
  this.updateUI()
}
