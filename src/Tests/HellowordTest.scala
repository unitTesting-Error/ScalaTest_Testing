package Tests
import org.scalatest._
import Code.HelloWord
class HellowordTest extends FunSuite{
  assert(HelloWord.retur_Helloworld() == "Hello world")
}
