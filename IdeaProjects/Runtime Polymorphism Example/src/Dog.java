/**
 * This is a derived concrete class which inherits from the abstract parent class "Animal"
 * @author Jodi A DeGave
 * @version 1.0.0
 *
 * <p>
 *     This Dog class provides the polymorphic implementation of the MakeNoise method
 *     from the abstract class "Animal" and prints out the Dog sound.
 * </p>
 *
 * @param () Nothing
 * @return Nothing - void is specified
 */
class Dog extends Mammal {

    public void makeNoise()
    {
        System.out.println("Bark");
    }

}
