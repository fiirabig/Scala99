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
    info("""
        |A palindrome is a word, phrase, number, or other sequence of units that
        |may be read the same way in either direction, with general allowances
        |for adjustments to punctuation and word dividers.[1]
        |[1]: http://en.wikipedia.org/wiki/Palindrome
     """.stripMargin)

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
    info("""
        |If a list contains repeated elements they should be replaced with
        |a single copy of the element. The order of the elements should not be changed.
    """.stripMargin)

    /*
    scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
    */

    pending
  }

  "P09 (**) pack" should "Pack consecutive duplicates of list elements into sublists." in
  {
    info("If a list contains repeated elements they should be placed in separate sublists.")

    /*
    scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[List[Symbol]] = List( List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    */

    pending
  }

  "P10 (*) encode" should "Run-length encoding of a list." in
  {
    info("""
     |Use the result of problem P09 to implement the so-called run-length encoding data compression method. Given
     |a run-length code list generated as specified in problem P10, construct its uncompressed version.Consecutive
     |duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
    """.stripMargin)

    /*
    scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    */

    pending
  }

  "P11 (*) encodeModified" should "Modified run-length encoding." in
  {
    info("""
       |Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into
       |the result list. Only elements with duplicates are transferred as (N, E) terms.
     """.stripMargin)

    /*
    scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
    */

    pending
  }

  "P12 (**) decode" should "Decode a run-length encoded list." in
  {
    pending
  }

  "P13 (**) encodeDirect" should "Run-length encoding of a list (direct solution)." in
  {
    pending
  }

  "P14 (*) duplicate" should "Duplicate the elements of a list." in
  {
    pending
  }

  "P15 (**) duplicateN" should "Duplicate the elements of a list a given number of times." in
  {
    pending
  }

  "P16 (**) drop" should "Drop every Nth element from a list." in
  {
    pending
  }

  "P17 (*) split" should "Split a list into two parts." in
  {
    pending
  }

  "P18 (**) slice" should "Extract a slice from a list." in
  {
    pending
  }

  "P19 (**) rotate" should "Rotate a list N places to the left." in
  {
    pending
  }

  "P20 (*) removeAt" should "Remove the Kth element from a list." in
  {
    pending
  }

  "P21 (*) insertAt" should "Insert an element at a given position into a list." in
  {
    pending
  }

  "P22 (*) range" should "Create a list containing all integers within a given range." in
  {
    pending
  }

  "P23 (**) randomSelect" should "Extract a given number of randomly selected elements from a list." in
  {
    pending
  }

  "P24 (*) lotto" should "Draw N different random numbers from the set 1..M." in
  {
    pending
  }

  "P25 (*) randomPermute" should "Generate a random permutation of the elements of a list." in
  {
    pending
  }

  "P26 (**) combinations" should "Generate the combinations of K distinct objects chosen from the N elements of a list." in
  {
    pending
  }

  "P27a (**) group3a" should "Group the elements of a set into disjoint subsets." in
  {
    pending
  }

  "P27b (**) group3b" should "b" in
  {
    pending
  }

  "P28 (**) lsort" should "Sorting a list of lists according to length of sublists." in
    {
      pending
    }
}
