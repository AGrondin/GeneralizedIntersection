package GeneralIntersect

object Intersect {

  def main(args: Array[String]): Unit = {

//    val france = new PostingList(List(1,2,3,4,5,7,8,9,11,27,12,13,14,15,16))
//    val paris = new PostingList(List(2,10,27,12,14))
//    val lear = new PostingList(List(12,17,45))

    val france = new PostingList(List(1,2,10,4,5,7,8,9,11,27,12,13,14,15,16))
    val paris = new PostingList(List(2,10,12,14))
    val lear = new PostingList(List(12,17,45))

    !paris

    //val inter = GeneralIntersect.union(List(lear,GeneralIntersect.intersect(List(france,paris))))

    val inter = GeneralIntersect.intersect(List(france,paris))


    print(inter.indices.mkString(","))

  }

}
