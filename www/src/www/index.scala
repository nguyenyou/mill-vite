package www

import org.scalajs.dom
import com.raquo.laminar.api.L.*

@main 
def main(): Unit = {
    render(dom.document.getElementById("app"), div("Mill + Vite + Scala.js"))
}