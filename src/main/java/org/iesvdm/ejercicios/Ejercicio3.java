package org.iesvdm.ejercicios;

public class Ejercicio3 {
    public static void main(String[] args) {


        /**
         *
         * Tres listas de tipo LispList<Integer> son declaradas:
         *
         * LispList<Integer> ls1, ls2, ls3;
         *
         * El usuario ingresa dos listas de enteros
         *
         * System.out.print("Ingrese una lista (de enteros): ");
         * String str = in.nextLine();
         * ls1 = parseIntLispList(str);
         * System.out.print("Ingrese otra lista (de enteros): ");
         * str = in.nextLine();
         * ls2 = parseIntLispList(str);
         *
         * Las listas ingresadas se convierten en objetos LispList<Integer> usando el método parseIntLispList.
         *
         * Luego, un objeto Joiner<Integer> llamado adder es creado e inicializado con una instancia de JoinByAdding:
         *
         * Joiner<Integer> adder = new JoinByAdding();
         *
         * Las dos listas se combinan usando el método zipLists de la clase Joiners,
         * que toma el Joiner y las dos listas como argumentos:
         *
         * ls3 = Joiners.zipLists(adder, ls1, ls2);
         *
         * Finalmente, el resultado de la combinación se imprime en la consola
         *
         * System.out.println("Sumar los enteros correspondientes en las listas da:\n" + ls3);
         *
         * El método parseIntLispList convierte una cadena que representa una lista de enteros en un objeto LispList<Integer>.
         * Primero, recorta la cadena y elimina los corchetes
         * String line = str.trim();
         * String contents = line.substring(1, line.length() - 1).trim();
         *
         * Si la lista está vacía, retorna una lista vacía
         *
         * if (contents.length() == 0) {
         * return LispList.empty();
         * }
         *
         * De lo contrario, divide la cadena en elementos individuales, los convierte en enteros y los agrega a la lista:
         *
         * String[] nums = contents.split(",");
         * LispList<Integer> list = LispList.empty();
         * for (int i = nums.length - 1; i >= 0; i--) {
         * String num = nums[i].trim();
         * list = list.cons(Integer.parseInt(num));
         * }
         *
         * Finalmente, retorna la lista construida:
         *
         * return list;
         *
         */


    }
}
