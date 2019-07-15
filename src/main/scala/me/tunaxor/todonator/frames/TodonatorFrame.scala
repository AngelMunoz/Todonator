package me.tunaxor.todonator.frames

import scala.swing.BorderPanel.Position.West
import scala.swing.{BorderPanel, Dimension, MainFrame}

class TodonatorFrame extends MainFrame {
  contents = new BorderPanel {
    layout(SideMenu.panel) = West
  }
  pack()
  size = new Dimension(800, 600)
}
