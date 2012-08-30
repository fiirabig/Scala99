package ca.polymtl.log4420.scala99

import ca.polymtl.log4420.scala99.WorkingWithLists._
import org.scalatest._
import matchers.ShouldMatchers

class WorkingWithListsTest
  extends FlatSpec
  with ShouldMatchers
{
  "P01(*) last" should "Find the last element of a list." in
  {
    pending

    /*
    scala> last(List(1, 1, 2, 3, 5, 8))
    res0: Int = 8
    */
  }

  "P02(*) penultimate" should "Find the last but one element of a list." in
  {
    pending

    /*
    scala> penultimate(List(1, 1, 2, 3, 5, 8))
    res0: Int = 5
    */
  }

  "P03(*) nth" should "Find the Kth element of a list." in
  {
    info("By convention, the first element in the list is element 0")

    pending

    /*
    scala> nth(2, List(1, 1, 2, 3, 5, 8))
    res0: Int = 2
    */
  }

  "P04(*) length" should "Find the number of elements of a list." in
  {
    pending

    /*
    scala> length(List(1, 1, 2, 3, 5, 8))
    res0: Int = 6
    */
  }

  "P05(*) reverse" should "Reverse a list." in
  {
    pending

    /*
    scala> reverse(List(1, 1, 2, 3, 5, 8))
    res0: List[Int] = List(8, 5, 3, 2, 1, 1)
    */
  }

  "P06(*) isPalindrome" should "Find out whether a list is a palindrome." in
  {
    /*
        A palindrome is a word, phrase, number, or other sequence of units that
        may be read the same way in either direction, with general allowances
        for adjustments to punctuation and word dividers.[1]

        [1]: http://en.wikipedia.org/wiki/Palindrome
     */

    pending

    /*
    scala> isPalindrome(List(1, 2, 3, 2, 1))
    res0: Boolean = true
    */
  }

  "P07(**) flatten" should "Flatten a nested list structure." in
  {
    pending

    /*
    scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    res0: List[Any] = List(1, 1, 2, 3, 5, 8)
    */
  }

  "P08 (**) compress" should "Eliminate consecutive duplicates of list elements." in
  {

    /*
    scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
    */

    pending
  }

  it should "Replace repeated elements with a single copy of the element" in
  {

  }

  it should "not change the order of the elements" in
  {

  }

  "P09 (**) pack" should "Pack consecutive duplicates of list elements into sublists." in
  {
    /*
    scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[List[Symbol]] = List( List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    */

    pending
  }

  it should "place repeated elements in separate sublists" in
  {

  }

  "P10 (*) encode" should "encode consecutive duplicates of elements as tuples (N, E)" in
  {

    info( "where N is the number of duplicates of the element E." )
    /*
      Use the result of problem P09 to implement the so-called run-length encoding data compression method.
      Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
    */

    /*
    scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    */

    pending
  }

  "P11 (*) encodeModified" should "encode like P10" in
  {
    /*
    scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
    */

    pending
  }

  it should "copy single elements into the result lift" in
  {

  }

  it should "only transfer elements with duplicates as (N, E) terms" in
  {

  }

  "P12 (**) decode" should "decode a list encoded in P10" in
  {
    /*
      scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
      res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
     */

    pending
  }

  "P13 (**) encodeDirect" should "encode a list like in P10 without using P09" in
  {
    /*
     Implement the so-called run-length encoding data compression method directly.
    */

    /*
    scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    */

    pending
  }

  "P14 (*) duplicate" should "Duplicate all elements of a list." in
  {
    /*
    scala> duplicate(List('a, 'b, 'c, 'c, 'd))
    res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
     */

    pending
  }

  "P15 (**) duplicateN" should "Duplicate the elements of a list a given number of times." in
  {
    /*
    scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
    res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
     */

    pending
  }

  "P16 (**) drop" should "Drop every Nth element from a list." in
  {
    /*
    scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
     */

    pending
  }

  "P17 (*) split" should "Split a list into two parts." in
  {
    info("The length of the first part is given.")

    /*
    scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    */

    pending
  }

  "P18 (**) slice" should "Extract a slice from i, to k from a list." in
  {
    /*
    scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res0: List[Symbol] = List('d, 'e, 'f, 'g)
    */

    pending
  }

  it should "be including the ith element" in
  {

  }

  it should "be exluding the kth element" in
  {

  }

  it should "start counting the elements with 0" in
  {

  }

  "P19 (**) rotate" should "Rotate a list N places to the left." in
  {
    /*
      scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
    */
    pending
  }

  it should "rotate to the right if the parameter is negative" in
  {
    /*
    scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
    */
  }

  "P20 (*) removeAt" should "Remove the Kth element from a list." in
  {
    /*
    scala> removeAt(1, List('a, 'b, 'c, 'd))
    res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
    */

    pending
  }

  it should "return the remaining of the list on the first part of the tuple" in
  {

  }

  it should "return the removed element in the last part of the tuple" in
  {

  }

  it should "start counting the elements with 0" in
  {

  }

  "P21 (*) insertAt" should "Insert an element at a given position into a list." in
  {
    /*
    scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
    res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
    */
    pending
  }

  "P22 (*) range" should "Create a list containing all integers within a given range." in
  {
    /*
    scala> range(4, 9)
    res0: List[Int] = List(4, 5, 6, 7, 8, 9)
    */
    pending
  }

  "P23 (**) randomSelect" should "Extract a given number of randomly selected elements from a list." in
  {
    /*
    scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
    res0: List[Symbol] = List('e, 'd, 'a)
    */

    /* "Hint: Use the solution to problem P20" ) */

    pending
  }

  "P24 (*) lotto" should "Draw N different random numbers from the set 1..M." in
  {
    /*
    scala> lotto(6, 49)
    res0: List[Int] = List(23, 1, 17, 33, 21, 37)
    */
    pending
  }

  "P25 (*) randomPermute" should "Generate a random permutation of the elements of a list." in
  {
    /* Hint: Use the solution of problem P23. */

    /*
    scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
    res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
    */

    pending
  }

  "P26 (**) combinations" should "Generate the combinations of K distinct objects chosen from the N elements of a list." in
  {
    /*
      In how many ways can a committee of 3 be chosen from a group of 12 people? We all know that there are C(12,3)=
      220 possibilities (C(N,K) denotes the well-known binomial coefficient). For pure mathematicians, this result
      may be great. But we want to really generate all the possibilities.
    */

    /*
    scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
    res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...
    */

    pending
  }

  "P27a (**) group3a" should "Group the elements of a set into disjoint subsets." in
  {
    /*
     In how many ways can a group of 9 people work in 3 disjoint subgroups of 2, 3 and 4 persons? Write a function
     that generates all the possibilities.
    */

    /*
    scala> group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
    res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David, Evi), List(Flip, Gary, Hugo, Ida)), ...
    */

    pending
  }

  "P27b (**) group3b" should "Group the elements of a set into disjoint subsets." in
  {
    /*
       |Generalize the above predicate in a way that we can specify a list of group sizes and the predicate will return
       |a list of groups.Note that we do not want permutations of the group members; i.e. ((Aldo, Beat), ...) is the
       |same solution as ((Beat, Aldo), ...). However, we make a difference between ((Aldo, Beat), (Carla, David), ...)
       |and ((Carla, David), (Aldo, Beat), ...).
       |
       |You may find more about this combinatorial problem in a good book on discrete mathematics
       |under the term "multinomial coefficients".
    */

    /*
    scala> group(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
    res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David), List(Evi, Flip, Gary, Hugo,
    Ida)), ...
    */

    pending
  }

  "P28a (**) lsort" should "Sorting a list of lists according to length of sublists." in
  {
    /*
       We suppose that a list contains elements that are lists themselves. The objective is to sort the elements of
       the list according to their length. E.g. that generates all the possibilities.
    */

    /*
    scala> lsort(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
    res0: List[List[Symbol]] = List(List('o), List('d, 'e), List('d, 'e), List('m, 'n), List('a, 'b, 'c), List('f, 'g, 'h), List('i, 'j, 'k, 'l))
    */

    pending
  }

  "P28b (**) lsort" should "Sorting a list of lists according to length of sublists." in
  {
    /*
       |Again, we suppose that a list contains elements that are lists themselves. But this time the objective is to
       |sort the elements according to their length frequency; i.e. in the default, sorting is done ascendingly,
       |lists with rare lengths are placed, others with a more frequent length come later.
       |
       |Note that in the above example, the first two lists in the result have length 4 and 1 and both lengths
       |appear just once. The third and fourth lists have length 3 and there are two list of this length.
       |Finally, the last three lists have length 2. This is the most frequent length.
    */

    /*
    scala> lsortFreq(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
    res1: List[List[Symbol]] = List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n))
    */

    pending
  }
}
