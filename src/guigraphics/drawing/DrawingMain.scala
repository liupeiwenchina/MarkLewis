package guigraphics.drawing

import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.control.Button
import scalafx.scene.shape.Rectangle
import scalafx.scene.paint.Color
import scalafx.scene.control.MenuBar
import scalafx.scene.control.Menu
import scalafx.scene.control.MenuItem
import scalafx.scene.layout.BorderPane
import scalafx.scene.control.TabPane

object DrawingMain extends JFXApp {
  stage = new JFXApp.PrimaryStage {
    title = "Drawing Program"
    scene = new Scene(800, 600) {
      val menuBar = new MenuBar
      val fileMenu = new Menu("File")
      val newItem = new MenuItem("New")
      val openItem = new MenuItem("Open")
      val saveItem = new MenuItem("Save")
      val exitItem = new MenuItem("Exit")
      fileMenu.items = List(newItem, openItem, saveItem, exitItem)
      val editMenu = new Menu("Edit")
      val addItem = new MenuItem("Add Drawable")
      val copyItem = new MenuItem("Copy")
      val cutItem = new MenuItem("Cut")
      val pasteItem = new MenuItem("Paste")
      editMenu.items = List(addItem, copyItem, cutItem, pasteItem)
      menuBar.menus = List(fileMenu, editMenu)
      
      val tabPane = new TabPane
      
      
      val rootPane = new BorderPane
      rootPane.top = menuBar
      rootPane.center = tabPane
      root = rootPane
      
      
      
    }
  }
}