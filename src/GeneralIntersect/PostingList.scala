package GeneralIntersect

class PostingList(indicesc: List[Int], includec: Boolean = true){

    val indices = indicesc.sorted
    val include = includec

    def unary_! = new PostingList(indices, !include)

    def iterBool() = new IterBool(indices.iterator.buffered, include)

}
