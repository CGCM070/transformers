package org.iesvdm.ejercicios;

public class Ejercicio3 {
    public static void main(String[] args) {


        /**
         *
         *Three lists of type LispList<Integer> are declared:
         *
         * LispList<integer> ls1, ls2, ls3;</integer>
         *
         * The  user  enter two lists of integers
         *
         * System.out.print("nter a list (of integers): ");
         * String str = in.nextLine();
         * ls1 = parseIntLispList(str);
         * System.out.print("nter another list (of integers): ");
         * str = in.nextLine();
         * ls2 = parseIntLispList(str);
         *
         * The entered lists are converted into LispList<Integer> objects using the parseIntLispList method.
         *
         * Then  Joiner<Integer> object named adder is created and initialized with an instance of JoinByAdding:
         *
         * Joiner<integer> adder = new JoinByAdding();
         *
         * The two lists are combined using the zipLists method of the Joiners class,
         * which takes the Joiner and the two lists as arguments:
         *
         * ls3 = Joiners.zipLists(adder, ls1, ls2);
         *
         * Finally, the result of the combination is printed to the console
         *
         * System.out.println("Adding corresponding integers in the lists gives:\n" + ls3);
         *

            The parseIntLispList method converts a string representing a list of integers into a LispList<Integer> object.
            First, it trims the string and removes the brackets
         * String line = str.trim();
         * String contents = line.substring(1, line.length() - 1).trim();
         *
         * If the list is empty, it returns an empty list
         *
         * if (contents.length() == 0) {
         * return LispList.empty();
         * }
         *
         * Otherwise, it splits the string into individual elements, converts them to integers, and adds them to the list:
         *
         * String[] nums = contents.split(",");
         * LispList<integer> list = LispList.empty();</integer>
         * for (int i = nums.length - 1; i >= 0; i--) {
         * String num = nums[i].trim();
         * list = list.cons(Integer.parseInt(num));
         * }
         *
         * Finally, it returns the constructed list:
         *
         * return list;
         *
         */


    }
}
