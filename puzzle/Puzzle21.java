/*
 * Challenge Name - Disemvowel Trolls 
 * Trolls are attacking your comment section! A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat. Your task is to write a function that takes a string and return a new string with all vowels removed. For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
*/


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Puzzle21 {
    public static void main(String[] args){
        System.out.println(disemvowel("This website is for losers LOL!"));
        System.out.println(disemvowel("No offense but,\nYour writing is among the worst I've ever read"));
        System.out.println(disemvowel("What are you, a communist?"));
    }

    public static String disemvowel(String str) {
        String regex = "[aeiouAEIOU]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.replaceAll("");
    }
}