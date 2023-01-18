package lec2_intro2;

/**
 * Created by hug.
 */
public class DogProblem {
    public static Dog[] largerThanFourNeighbors(Dog[] dogs) {
        return dogs;
    }

    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{
                new Dog(10),
                new Dog(15),
                new Dog(20),
                new Dog(15),
                new Dog(10),
                new Dog(5),
                new Dog(10),
                new Dog(15),
                new Dog(22),
                new Dog(15),
                new Dog(20)
        };
        Dog[] bigDogs1 = largerThanFourNeighbors(dogs);

        /** When you run this program you should get "20 22" */
        for (int k = 0; k < bigDogs1.length; k += 1) {
            System.out.print(bigDogs1[k].weightInPounds + " ");
        }

        System.out.println();

    }
}
