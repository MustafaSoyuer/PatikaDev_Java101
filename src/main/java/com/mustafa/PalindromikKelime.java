package com.mustafa;

public class PalindromikKelime {

    static boolean isPalindrome(String str)
    {
        int i = 0;
        int j = str.length() - 1;
        while(i < j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str)
    {
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse += str.charAt(i);
        }

        if(str.equals(reverse))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {

		/*Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.
		Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".
		Örnek : abba , asa , kavak, kayak*/

        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("asa"));
        System.out.println(isPalindrome2("kavak"));
        System.out.println(isPalindrome2("kayak"));
    }
}
