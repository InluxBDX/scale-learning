
//import scala.annotation.tailrec
    /*def sum(f: Int=> Int, a:Int, b:Int) = {
      @tailrec def loop(a:Int, acc:Int): Int = {
          if(a>b) acc
          else loop(a+1, f(a)+acc)
        }
      loop(a,0)
    }*/

def mapReduce(f:Int=>Int, combine:(Int,Int)=> Int, zero:Int)(a:Int, b: Int):Int =
  if(a>b) zero
  else combine(f(a), mapReduce(f, combine,zero)(a+1,b))


def product(f:Int => Int)(a:Int, b: Int): Int = mapReduce(f,(x,y)=> x*y,1)(a,b)
    product(x=>x*x)(1,3)

  def fact(n:Int) = product(x=> x)(1,n)
  fact(5)


  val tolerance= 0.0001
  def isCloseEnough(x:Double, y: Double)=
    abs(())


/*

  def fibonacci(n: Int): Int = {
    @tailrec def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int =
          {
            println("Current value of i: " + i)
            println("Current value of last Fib number: " + last)
            println("Current value of next to last Fib Number: " + nextToLast)
            if(i >= n) last else fiboTailrec(i + 1, last + nextToLast, last)
          }
          if (n <= 2) 1
          else fiboTailrec(2, 1, 1)
        }
      println(fibonacci(7))
*/


//
