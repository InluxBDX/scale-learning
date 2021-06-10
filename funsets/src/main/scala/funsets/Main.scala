package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  val divideBy5:FunSet = (x:Int) => x%5==0
  val divideBy2:FunSet = (x:Int) => x%2==0
  val lessThan5:FunSet = (x:Int) => x<5
  val sub1:FunSet = (x:Int) => x-1==true
  println(contains(divideBy5, 15))


  val s1 = singletonSet(1)
  val s7 = singletonSet(55)
  val s5 = singletonSet(25)
  val s2 = singletonSet(2)
  val s = union(s1, s2)
  val f = filter(s5,divideBy2)
  val a = forall(s7,lessThan5)
  val b = exists(s5,divideBy5)
  val t = map(s2,(x:Int) => x-1)
  println("Result forall: " + a)
  println("Result forall: " + b)
  println("Result Map: " + t)
  println("Filter Function" + contains(f, 25))
  val s3 = intersect(divideBy5,s5)
  println(contains(s3, 25))
  println(contains(s, 5))
  println(contains(s, 3))


}
