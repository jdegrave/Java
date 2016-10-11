/** This Demo program seeks to provide insight and learning opportunities into the concept of polymorphism,
 * inheritance, and encapsulation - the founding principles of OO design.
 * +The Demo program creates two Animal objects instantiated in the form of a Cat object and a Dog object, and
 * then prints out the results of "MakeNoise" a polymorphic method.
 *
 * @author Jodi A De Grave
 * @version 1.0.0
 *
 *  <p>
 *  The Demo program contains the Main method. It uses the following classes from which it instantiates objects exhibiting
 *   polymorphism, inheritance, and encapsulation :
 *   -- Animal.cs  - This file is the superclass/parent class/base class from which the derived class inherit.
 *  -- Dog.cs - This file is a child/sub class of the Animal class. It inherits a method from the parent class "Animal"
 *   -- Cat.cs - This file is a child/sub class of the Animal class. It inherits a method from the parent class "Animal"
 *   </p>
 *   @param args Is a string argument that takes command line arguments
 *  @return Nothing since void is specified
 */

public class Demo{
    public static void main(String[] args) {
        Animal al = new Cat();
        al.makeNoise(); //Prints Meowoo

        Animal a2 = new Dog();
        a2.makeNoise();  //Prints Bark
    }
}
