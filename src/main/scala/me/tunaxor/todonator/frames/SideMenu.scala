package me.tunaxor.todonator.frames

import me.tunaxor.todonator.enums.PageNavigation
import me.tunaxor.todonator.enums.PageNavigation.PageNavitagion

import scala.swing.{BoxPanel, Button, Orientation, event}

object SideMenu {
  val panel: BoxPanel = new BoxPanel(Orientation.Vertical) {
    visible = true
    contents += new Button("Quick Notes") {
      reactions += {
        case event.ButtonClicked(_) =>
          openFrame(PageNavigation.QUICK_NOTES)
      }
    }
    contents += new Button("My Lists") {
      reactions += {
        case event.ButtonClicked(_) =>
          openFrame(PageNavigation.MY_LISTS)
      }
    }
    contents += new Button("Settings") {
      reactions += {
        case event.ButtonClicked(_) =>
          openFrame(PageNavigation.SETTINGS)
      }
    }
  }

  def openFrame(name: PageNavitagion): Unit = {
    println(name)
  }

}
