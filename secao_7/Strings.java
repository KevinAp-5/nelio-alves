package secao_7;

public class Strings {

    public static void main(String[] args) {
        String minhaString = "abcde FGHIJ ABC abc DEFG    ";

        String s1 = minhaString.toLowerCase();
        System.out.println(s1 + '-');
        System.out.println(minhaString.toUpperCase() + '-');
        System.out.println(minhaString.trim() + '-');
        System.out.println(minhaString.substring(3) + '-');
        System.out.println(minhaString.substring(3, 10) + '-');
        System.out.println(minhaString.replace('a', 'K') + '-');

        int indexOf = minhaString.indexOf("bc");
        System.out.println(indexOf);

        String[] vect = minhaString.split(" ");
        System.out.println(vect[0]);

    }
}
