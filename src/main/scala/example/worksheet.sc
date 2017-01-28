val f: String => String = {
  case "ping" => "pong"
  case default => "olo"
}

f("ping")
f("abc")


val a = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
a map (p => List(p, p))
a.flatMap(p => List(p, p))

Stream.empty
Stream.cons(1, Stream.cons(2, Stream.empty))
val xs = Stream(1, 2, 3)
4 #:: xs



xs(1)


def from(nat: Int): Stream[Int] = nat #:: from(nat+3)
from(0)
from(5)
from(4).map(_ * 3)
from(4).map(_ * 3).take(10).toList








