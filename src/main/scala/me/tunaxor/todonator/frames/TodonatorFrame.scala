package me.tunaxor.todonator.frames

import me.tunaxor.todonator.events.NavigateCalled

import scala.swing.BorderPanel.Position.{Center, West}
import scala.swing.{BorderPanel, Dimension, MainFrame}

class TodonatorFrame extends MainFrame {
  private val _sideMenu = new SideMenu
  listenTo(_sideMenu)
  reactions += {
    case e: NavigateCalled =>
      println(s"${e.whereTo}")
  }
  contents = new BorderPanel {
    layout(_sideMenu.panel) = West
    layout(TodonatorDesktop.mainDesktop) = Center
  }
  pack()
  size = new Dimension(800, 600)
}
