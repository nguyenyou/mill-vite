package www

import japgolly.scalajs.react.*
import japgolly.scalajs.react.vdom.html_<^.*
import org.scalajs.dom.document

case class ReactApp() {
  def apply(): VdomElement = {
    ReactApp.component()
  }
}

object ReactApp {
  type Props = ReactApp

  case class Backend(scope: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      <.div("React Appppp")
    }
  }

  val component = ScalaFnComponent[Unit](props =>
    for {
      count <- useState(0)
      _ <- useEffect(Callback {
        document.title = s"You clicked ${count.value} times"
      })
      fruit <- useState("banana")
    } yield <.div(
      <.p(s"You clicked ${count.value} times"),
      <.button(
        ^.onClick --> count.modState(_ + 1),
        "Click me"
      ),
      <.p(s"Your favourite fruit is a ${fruit.value}!")
    )
  )
}
