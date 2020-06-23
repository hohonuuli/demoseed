package demoseed

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class SomeSpec extends AnyFunSpec with Matchers {

  describe("Something") {
    describe("else") {
      it("should run a test") {
        val a = true
        a should be(true)
      }
    }

  }

}
