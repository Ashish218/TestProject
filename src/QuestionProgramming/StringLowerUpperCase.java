package QuestionProgramming;

public class StringLowerUpperCase {

    static String convert(String str){

        char[] exp = str.toCharArray();
        for (int i = 0; i < str.length(); i++){

            if (str.charAt(i) == 0 && str.charAt(i) != ' ' ||
                    str.charAt(i) != ' ' && str.charAt(i - 1)== ' ') {

              str.charAt(i) = str.toLowerCase();
            }


        }
        return "";
    }
}
