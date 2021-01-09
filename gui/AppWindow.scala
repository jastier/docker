import java.awt.Frame
import javax.swing.JFrame

class AppWindow extends JFrame("Docker Demo") {

  // define location and size of this frame
  val BOUNDS_X = 100
  val BOUNDS_Y = 100
  val BOUNDS_WIDTH = 900
  val BOUNDS_HEIGHT = 700

  setBounds(BOUNDS_X, BOUNDS_Y, BOUNDS_WIDTH, BOUNDS_HEIGHT)

  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)

  setExtendedState(Frame.NORMAL)

}


