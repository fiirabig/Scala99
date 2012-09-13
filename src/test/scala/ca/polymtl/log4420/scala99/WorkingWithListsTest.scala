package ca.polymtl.log4420.scala99

import ca.polymtl.log4420.scala99.WorkingWithLists._
import org.scalatest._
import matchers.ShouldMatchers
import scala._
import collection.mutable
import scala.Some

class WorkingWithListsTest
  extends FlatSpec
  with ShouldMatchers
{

  "P01(*) last" should "Find the last element of a list." in
  {
    last( List( 1, 1, 2, 3, 5, 8 ) ) should be ( Some( 8 ) )
  }

  it should "None if the list is empty" in
  {
    last( List() ) should be ( None )
  }

  "P02(*) penultimate" should "Find the last but one element of a list." in
  {
    penultimate( List( 1, 1, 2, 3, 5, 8 ) ) should  be ( Some( 5 ) )
  }

  it should "be None if the list does not contain at least two elements" in
  {
    penultimate( List() ) should be ( None )
    penultimate( List(1) ) should be ( None )
  }

  "P03(*) nth" should "Find the Kth element of a list." in
  {
    info( "By convention, the first element in the list is element 0" )

    nth( 0, List( 1, 1, 2, 3, 5, 8 ) ) should be ( Some( 1 ) )
    nth( 1, List( 1, 1, 2, 3, 5, 8 ) ) should be ( Some( 1 ) )
    nth( 2, List( 1, 1, 2, 3, 5, 8 ) ) should be ( Some( 2 ) )
  }

  it should "be None if the index is out of the bounds of the list" in
  {
    nth( -1, List( 1, 2 ) ) should be ( None )
    nth( 2, List( 1, 2 ) ) should be ( None )
  }

  "P04(*) length" should "Find the number of elements of a list." in
  {
    WorkingWithLists.size( List( 1, 1, 2, 3, 5, 8 ) ) should be ( 6 )
  }

  it should "be 0 for an empty list" in
  {
    WorkingWithLists.size( Nil ) should be ( 0 )
  }

  "P05(*) reverse" should "Reverse a list." in
  {
    reverse( List( 1, 1, 2, 3, 5, 8 ) ) should be (
      List( 8, 5, 3, 2, 1, 1 )
    )
  }

  "P06(*) isPalindrome" should "Find out whether a list is a palindrome." in
  {
    /*
        A palindrome is a word, phrase, number, or other sequence of units that
        may be read the same way in either direction[1]

        [1]: http://en.wikipedia.org/wiki/Palindrome

        we don't allow word divider and punctuation
     */

    assert( isPalindrome( Nil ) )
    assert( isPalindrome( List( 1 ) ) )
    assert( isPalindrome( List( 1, 1 ) ) )
    assert( isPalindrome( List( 1, 1, 1 ) ) )
    assert( isPalindrome( List( 1, 2, 1 ) ) )
    assert( isPalindrome( List( 1, 2, 2, 1 ) ) )
    assert( isPalindrome( List( 1, 2, 1, 2, 1 ) ) )
    assert( isPalindrome( List( 1, 2, 1, 1, 2, 1 ) ) )

    assert( ! isPalindrome( List( 0, 1 ) ) )
    assert( ! isPalindrome( List( 1, 0 ) ) )
    assert( ! isPalindrome( List( 1, 0, 0 ) ) )
  }

  "P07(**) flatten" should "Flatten a nested list structure." in
  {
    flatten(List(List(1), List(2))) should be ( List( 1, 2 ) )
    flatten(List(List(1), List(2), 3)) should be ( List( 1, 2, 3 ) )
    flatten(List(List(1, List(2, List(3))))) should be ( List( 1, 2, 3 ) )
    flatten(List(List(1, 1), 2, List(3, List(5, 8)))) should be {
      List(1, 1, 2, 3, 5, 8)
    }
  }

  "P08 (**) compress" should "Eliminate consecutive duplicates of list elements." +
    "by Replacing repeated elements with a single copy of the element" in
  {
    compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e) ) should be {
      List('a, 'b, 'c, 'a, 'd, 'e)
    }

    compress(List("foo", "foo")) should be  {
      List("foo")
    }
  }

  it should "not change the order of the elements" in
  {
    compress(List(1, 1, 1, 2, 2, 3, 3, 3, 3)) should be {
      List(1, 2, 3)
    }
  }

  "P09 (**) pack" should "Pack consecutive duplicates of list elements into sublists." in
  {

    pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be {
      List(
        List( 'a, 'a, 'a, 'a ),
        List( 'b ),
        List( 'c, 'c ),
        List( 'a, 'a ),
        List( 'd ),
        List( 'e, 'e, 'e, 'e )
      )
    }
  }

  "P10 (*) encode" should "encode consecutive duplicates of elements as tuples (N, E)" in
  {

    info( "where N is the number of duplicates of the element E." )
    /*
      Use the result of problem P09 to implement the so-called run-length encoding data compression method.
      Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
    */

    encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be {
      List( (4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e) )
    }

    encode( List( 1 ) ) should  be ( List( ( 1, 1 ) ) )

    encode( List( 1, 1, 1 ) ) should be ( List( ( 3, 1 ) ) )

    encode(List(1, 1, 1, 2, 2)) should be ( List( ( 3, 1 ), ( 2, 2 ) ) )

    encode( List( "foo", "bar", "bar", "bar", "baz", "baz" ) ) should be {
      List( ( 1, "foo" ), ( 3, "bar" ), ( 2, "baz" ) )
    }
  }

  it should "return Nil if the list is empty" in {
    encode( Nil ) should be ( Nil )
  }

  "P11 (*) encodeModified" should "encode like P10" in
  {
    val code = List( 1, 1, 1 )
    encodeModified( code ) should be {
      List( ( 3, 1 ) )
    }

    encodeModified( List( 'a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e ) ) should be {
      List( ( 4, 'a ), 'b, ( 2, 'c ), ( 2, 'a ), 'd, ( 4, 'e ) )
    }
  }

  it should "copy single elements into the result list" in
  {
    encodeModified( List( 1 ) ) should be ( List( 1 ) )
  }

  it should "only transfer elements with duplicates as (N, E) terms" in
  {
    encodeModified( List( 1, 1, 1 ) ) should be {
      List( (3, 1) )
    }

    encodeModified( List( 'a, 'a, 'a, 'a, 'c, 'c, 'a, 'a, 'e, 'e, 'e, 'e ) ) should be {
      List( ( 4, 'a ), ( 2, 'c ), ( 2, 'a ), ( 4, 'e ) )
    }
  }

  it should "return Nil if the list is empty" in {
    encodeModified( Nil ) should be ( Nil )
  }

  "P12 (**) decode" should "decode a list encoded in P10" in
  {
    decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) should be {
      List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    }

    val code = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    decode( encode( code ) ) should be {
      code
    }
  }

  it should "return Nil if the list is empty" in {
    decode( Nil ) should be ( Nil )
  }

  "P13 (**) encodeDirect" should "encode a list like in P10 without using P09" in
  {
    /*
     Implement the so-called run-length encoding data compression method directly.
    */

    encodeDirect( List( 'a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e ) ) should be {
      List( ( 4, 'a ), ( 1, 'b ), ( 2, 'c ), ( 2, 'a ), ( 1, 'd ), ( 4, 'e ) )
    }
  }

  it should "return Nil if the list is empty" in {
    encodeDirect( Nil ) should be ( Nil )
  }

  "P14 (*) duplicate" should "Duplicate all elements of a list." in
  {
    duplicate( List( 'a, 'b, 'c, 'c, 'd ) ) should be {
      List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    }
  }

  it should "return Nil if the list is empty" in {
    duplicate( Nil ) should be ( Nil )
  }

  "P15 (**) duplicateN" should "Duplicate the elements of a list a given number of times." in
  {
    duplicateN( 3, List('a, 'b, 'c, 'c, 'd) ) should be {
      List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    }
  }

  it should "return Nil if the list is empty" in {
    duplicateN( 1, Nil ) should be ( Nil )
  }

  "P16 (**) drop" should "Drop every Nth element from a list." in
  {
    drop( 3, List( 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k ) ) should be {
      List( 'a, 'b, 'd, 'e, 'g, 'h, 'j, 'k )
    }
  }

  it should "return Nil if the list is empty" in {
    drop( 1, Nil ) should be ( Nil )
  }

  "P17 (*) split" should "Split a list into two parts." in
  {
    split( 3, List( 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k ) ) should be {
      ( List( 'a, 'b, 'c ),List( 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k ) )
    }
  }

  it should "return a tuple of Nil if the list is empty" in {
    split( 1, Nil ) should be ( ( Nil, Nil ) )
  }

  "P18 (**) slice" should "Extract a slice from i, to k from a list." in
  {
    info( "start counting the elements with 0" )

    slice( 3, 7, List( 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k ) ) should be {
      List( 'd, 'e, 'f, 'g )
    }
  }

  it should "be including the ith element" in
  {
    slice( 0, 1, List( 1 ) ) should be {
      List( 1 )
    }
  }

  it should "be exluding the kth element" in
  {
    slice( 0, 1, List( 1, 2 ) ) should be {
      List( 1 )
    }
  }

  "P19 (**) rotate" should "Rotate a list N places to the left." in
  {
    rotate (3, List( 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k ) ) should be {
      List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
    }
  }

  it should "Rotate to the right if the parameter is negative." in
  {
    rotate( -2, List( 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k ) ) should be {
      List( 'j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i )
    }
  }

  "P20 (*) removeAt" should "Remove the Kth element from a list." in
  {
    info( "start counting the elements with 0" )

    removeAt( 1, List( 'a, 'b, 'c, 'd ) ) should be {
      ( List( 'a, 'c, 'd ), 'b )
    }
  }

  it should "return the remaining of the list on the first part of the tuple" in
  {
    removeAt( 0, List( 'a, 'b, 'c, 'd ) ) should be {
      ( List( 'b, 'c, 'd ), 'a )
    }
  }

  it should "return the removed element in the last part of the tuple" in
  {
    removeAt( 3, List( 'a, 'b, 'c, 'd ) ) should be {
      ( List( 'a, 'b, 'c ), 'd )
    }
  }

  "P21 (*) insertAt" should "Insert an element at a given position into a list." in
  {

    insertAt('new, 1, List('a, 'b, 'c, 'd)) should be {
      List('a, 'new, 'b, 'c, 'd)
    }

    insertAt('new, 0, Nil) should be {
      List('new)
    }

    insertAt('new, 1, List('a, 'b, 'c, 'd)) should be {
      List('a, 'new, 'b, 'c, 'd)
    }
  }

  "P22 (*) range" should "Create a list containing all integers within a given range." in
  {
    range(4, 9) should  be {
      List( 4, 5, 6, 7, 8, 9 )
    }
  }

  "P23 (**) randomSelect" should "Extract a given number of elements from a list." in
  {
    val l = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
    val r = randomSelect(3, l )

    assertExtract( l, r )
  }

  def assertExtract[A]( in: List[A], res: List[A] ) =
  {
    ( ( List.empty[A], in ) /: res ) {
      case ( ( pop, rest ), x ) => {

        assert( rest.contains( x ), "we can only extract an element once" )

        val ( l, r ) = rest.partition( _ == x )

        ( x :: pop, l.tail ::: r  )
      }
    }._2
  }

  "P24 (*) lotto" should "Draw N different numbers from the set 1..M." in
  {
    val M = 49
    assertExtract( (1 to M).toList, lotto( 6, M ) )
  }

  "P25 (*) randomPermute" should "Generate a permutation of the elements of a list." in
  {
    val li = List( 'a, 'b, 'c, 'd, 'e, 'f )
    assertExtract( li, randomPermute( li ) ) should be( Nil )

    /* Hint: Use the solution of problem P23. */
  }

  "P26 (**) combinations" should "Generate the combinations of K distinct objects chosen from the N elements of a list." in
  {
    /*
      In how many ways can a committee of 3 be chosen from a group of 12 people? We all know that there are C(12,3)=
      220 possibilities (C(N,K) denotes the well-known binomial coefficient). For pure mathematicians, this result
      may be great. But we want to really generate all the possibilities.
    */

    val k = 3
    val s = List( 'a, 'b, 'c, 'd, 'e, 'f )
    val result = combinations( k, s )

    assert( result.contains( List('a, 'b, 'c) ) )
    assert( result.contains( List('a, 'b, 'd) ) )
    assert( result.contains( List('a, 'b, 'e) ) )

    def binomialCoefficient( k: Int, n: Int ): Int = {

      def fact(n:Int):Int = if( n == 0 ) 1 else n * fact( n - 1 )

      fact( n ) / ( fact( k ) * fact( n - k) )
    }

    result.size should be ( binomialCoefficient( k, s.size ) )
  }
}