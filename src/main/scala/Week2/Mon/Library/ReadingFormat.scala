package Week2.Mon.Library

class ReadingFormat

trait AudioBook extends ReadingFormat // extending a class using the keyword extends. we can only extend 1 class per 'thing' (object, trail, class)

trait DigitalBook extends ReadingFormat

trait PhysicalBook extends ReadingFormat

// By having each format extending the superclass/parent 'ReadingFormat' we are grouping these together and giving each trail access to any methods in the parent class