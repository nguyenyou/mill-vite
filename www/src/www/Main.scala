package www

object Main {
  @main
  def run(): Unit = {
    // render(dom.document.getElementById("app"), App()())
    MainReactApp()
  }

  def hello(): String = "Hello World"
}
