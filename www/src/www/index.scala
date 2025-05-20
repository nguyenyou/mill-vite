package www

import org.scalajs.dom
import com.raquo.laminar.api.L.*

@main 
def main(): Unit = {
    render(dom.document.getElementById("app"), div("Hi! Welcome to Scala.js world!"))
}