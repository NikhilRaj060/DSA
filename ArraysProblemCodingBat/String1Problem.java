// 1st 
/*
 * 
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
 */


 public String helloName(String name) {
    return "Hello " +  name + "!";
  }

//2nd

/*
 * Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".


makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
 */

 public String makeAbba(String a, String b) {
    return a+b+b+a;
  }
  

  
// 3nd 

/*
 * 
The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".


makeTags("i", "Yay") → "<i>Yay</i>"
makeTags("i", "Hello") → "<i>Hello</i>"
makeTags("cite", "Yay") → "<cite>Yay</cite>"
Go...Save, Compile, R
 */

 public String makeTags(String tag, String word) {
    return "<" + tag + ">" + word + "</" + tag + ">";
  }
  
// 4th

/*
 * 
Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.


makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
 */

 public String makeOutWord(String out, String word) {
    return out.substring(0,2) + word + out.substring(2);
  }


  //5th

/*
 * 
Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.


extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
 */

 public String extraEnd(String str) {
    return str.substring(str.length()-2)+str.substring(str.length()-2)+str.substring(str.length()-2);
  }


//6th

/*
 * 
Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.


firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"
 */

 public String firstTwo(String str) {
    return str.length() < 2 ? str : str.substring(0,2);
  }

//7th

/*
 * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
 */

 public String firstHalf(String str) {
    return str.substring(0,str.length()/2);
  }
  

//8th

/*
 * 
Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.


withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
 */

 public String withoutEnd(String str) {
    return str.substring(1,str.length()-1);
  }
  

//9th

/*
 * 
Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).


comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
 */

 public String comboString(String a, String b) {
    return a.length() < b.length() ? a+b+a : b+a+b;
  }
  

//10th

/*
 * 
Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.


nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
 */

 //11th

/*
 * 
 */


//12th

/*
 * 
 */

//13th

/*
 * 
 */

//14th

/*
 * 
 */

//15th

/*
 * 
 */

 //16th

/*
 * 
 */


//17th

/*
 * 
 */

//18th

/*
 * 
 */

//19th

/*
 * 
 */