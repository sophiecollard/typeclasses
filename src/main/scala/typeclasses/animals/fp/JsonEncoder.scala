package typeclasses.animals.fp

trait JsonEncoder[A] {
  def toJson(a: A): String
}

object JsonEncoder {

  def instance[A](f: A => String): JsonEncoder[A] =
    new JsonEncoder[A] {
      override def toJson(a: A): String =
        f(a)
    }

  implicit val forInt: JsonEncoder[Int] =
    instance(_.toString)

  implicit val forString: JsonEncoder[String] =
    instance(value => s"\"$value\"")

}
