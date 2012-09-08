package ca.polymtl.log4420.scala99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

import ca.polymtl.log4420.scala99.Bonus._

class BonusTest
  extends FlatSpec
  with ShouldMatchers
{
  // Credit to nick at bioware: http://ca.linkedin.com/in/ndesjardins0

  "BONUS(**) nickInterview" should "split elements in two parts" +
    "the first part contains should contain characters of the word we can find in the key" +
    "the second part contains everything else" in
  {
    info("algorithm should be O(n) in computationnal space")

    nickInterview( "helloworld", "oe" ) should be ( ( "eoo", "dhlllrw" ) )
  }

  it should "return sorted string in both parts" in
  {
    nickInterview( "zzzyyyxxxaaa", "zy") should be ( ( "yyyzzz" , "aaaxxx" ) )
  }
}