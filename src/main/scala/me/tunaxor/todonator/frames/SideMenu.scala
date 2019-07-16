package me.tunaxor.todonator.frames

import me.tunaxor.todonator.enums.PageNavigation._
import me.tunaxor.todonator.events.NavigateCalled

import scala.swing.event.ButtonClicked
import scala.swing.{BoxPanel, Button, Orientation, Publisher}

class SideMenu extends Publisher {
  val panel: BoxPanel = new BoxPanel(Orientation.Vertical) {
    contents += _quickNotes
    contents += _myLists
    contents += _settings
    visible = true
  }
  private val _quickNotes = new Button("Quick Notes") {
    reactions += {
      case ButtonClicked(_) =>
        publish(NavigateCalled(QUICK_NOTES))
    }
  }
  private val _myLists = new Button("My Lists") {
    reactions += {
      case ButtonClicked(_) =>
        publish(NavigateCalled(MY_LISTS))
    }
  }

  listenTo(_quickNotes)
  listenTo(_myLists)
  listenTo(_settings)
  reactions += {
    case e: NavigateCalled =>
      publish(e)
  }
  deafTo(this)
  private val _settings = new Button("Settings") {
    reactions += {
      case ButtonClicked(_) =>
        publish(NavigateCalled(SETTINGS))
    }
  }
}
