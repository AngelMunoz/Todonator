package me.tunaxor.todonator.events

import me.tunaxor.todonator.enums.PageNavigation.PageNavitagion

import scala.swing.event.Event

case class NavigateCalled(whereTo: PageNavitagion) extends Event
