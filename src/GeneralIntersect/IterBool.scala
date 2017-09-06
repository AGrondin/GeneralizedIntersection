package GeneralIntersect


class IterBool(iterc: BufferedIterator[Int], includec: Boolean){

  var iter = iterc
  val include = includec

  def next():Int = iter.next

  def hasNext():Boolean = iter.hasNext

  def dropWhile(p: (Int)=>Boolean) = new IterBool(iter.dropWhile(p).buffered, include)

  def filter(p: (Int) => Boolean) = new IterBool(iter.filter(p).buffered, include)

  def head():Int = iter.head
}
