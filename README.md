# Type classes

Ideas for exercises:
  * Define a new `XmlEncoder` type class with a single `toXml` method.
  * In the companion object, provide a constructor method with the following signature: `def instance[A](f: A => String): XmlEncoder[A]`
  * In the `syntax` object, provide an implicit class which will let us call a `toXml` method on any instance of a class which has an XmlEncoder instance.
