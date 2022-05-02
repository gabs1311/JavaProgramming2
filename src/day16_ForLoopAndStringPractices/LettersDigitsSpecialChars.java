package day16_ForLoopAndStringPractices;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {
    String str = "  12357kvvnflvj#$^%&%$@#) (mahdbdjweybew";
        String digits = "";//12345
        String letters = "";  //CydeoSchoolWoodenSpoon
        String specialChars = "";// String specialChars = "";//!@#$%

        for (int i = 0; i <str.length() ; i++) {//i: index numbers of str (0~last index)
            char ch = str.charAt(i);// ch: represents each character that we have in the string
if (ch>='0'&& ch<='9'){// if the character is between '0' to '9' then it is digit
    digits +=ch;
}else if (ch>='A'&&ch<='Z'){// if the character is between 'A' to 'Z' then it is a letter
    letters+=ch;
}else if (ch>='a'&&ch<='z') {// if the character is between 'a' to 'z' then it is a letter
    letters += ch;
}else{// the character is neither digit nor letter, then it is special character
    if (ch!=' ' ){// if the special character is not a space

        specialChars+=ch;}}

        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }
}
