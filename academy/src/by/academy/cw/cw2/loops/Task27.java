package by.academy.cw.cw2.loops;

public class Task27 {
    //    У первокласника пети m рублей.Мороженое стоит k рублей. Петя решил наесться досыта мороженого,
//    для этого он покупал по одному мороженому и съедал его до тех пор, пока ему хватало денег.
//    Как пете узнать, сколько денег останется у него в конце концов? учтите,
//    что петя делить еще не умеет, а умеет только вычитать и складывать. сколько мороженых он может съесть?

    public static void main(String[] args) {
        double m = 200;
        double k = 21;
        int counter = 0;

        for (int i = 0; m >= k; i++) {
            m = m - k;
            counter++;
        }
        System.out.println("Петя съест " + counter + " мороженого");
        System.out.println("У него останется " + m + " рублей");
    }
}