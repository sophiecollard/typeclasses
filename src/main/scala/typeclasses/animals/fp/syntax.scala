package typeclasses.animals.fp

object syntax {

  implicit class JsonEncoderOps[A](val value: A) {
    def toJson(implicit encoder: JsonEncoder[A]): String =
      encoder.toJson(value)
  }

}
