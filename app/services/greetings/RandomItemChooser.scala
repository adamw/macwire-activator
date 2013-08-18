package services.greetings

import java.util.Random

class RandomItemChooser {
  private val random = new Random()

  def chooseFrom[T](items: List[T]): Option[T] = {
    val length = items.length
    if (length == 0) {
      None
    } else {
      val index = random.nextInt(length)
      Some(items(index))
    }
  }
}
