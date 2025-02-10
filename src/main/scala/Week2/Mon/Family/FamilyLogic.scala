package Week2.Mon.Family

object FamilyLogic extends App {

  // Everytime we make a new instance of a class using the keyword new, we are making an object
  new Child("Tom") // this is a one use and cant be called else where
  val child1 = new Child("Tom") // I can reuse this because i can call it with the val
  val child2 = new Child("Tom") // I can reuse this because i can call it with the val
  println("is child2 and 2 the same? " + (child1 == child2))

  println(child1.forename)
  println(child1.under18)
//  println(child1.idPlease) // can not access because the method is private in the child class


  //ADULT - typesafe adult
  val adult1: Adult = Adult.apply(new Forename("april"), new Surname("Garlington")) // with apply method

  val adult2: Adult = new Adult (new Forename("april"), new Surname("Garlington")) // without apply method - need to use keyword new

  println(adult1.forename.name)


//  DOG -

  val dog1: Dog = new Dog(new Name("Lola"), new Breed("Bulldog"))
  println(dog1.name.name)
  println(dog1.breedType.breedType)




}

