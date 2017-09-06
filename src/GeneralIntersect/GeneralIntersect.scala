package GeneralIntersect

object GeneralIntersect {



  def intersect(postingLists: List[PostingList] ): PostingList = {

    val postingIters = {
      postingLists.map(x => x.iterBool())
    }

    new PostingList(intersectIters(postingIters))

  }

  def union(postingLists: List[PostingList]): PostingList = {

    val allIndices = postingLists.flatMap(x => x.indices)

    new PostingList(allIndices)

  }

  def getMatches(lst: List[IterBool]): List[Int] = {

    val max = lst.filter(x => x.include).map(x => x.head).max

    val filteredLst = lst.map(it => it.dropWhile(_ < max))

    filteredLst.filter(x => x.hasNext()).forall(x => x match {
      case it if it.include => it.next() ==max
      case it if !it.include => it.head !=max//could not find inherited objects or case classes
    }) match {
      case true => max::intersectIters(lst)
      case false => intersectIters(lst)
    }
  }


  def intersectIters(postIter: List[IterBool]): List[Int] = {

    postIter.filter(x => x.hasNext) match {
      case Nil => List()
      case x::Nil => List()
      case lst => getMatches(lst)
    }

  }


}
