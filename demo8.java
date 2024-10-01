class demo8
{
public static void main(String ar[])
{
String s1="ramji";
String s2="sitaji";
String s3="abc";
String s4="ABC";

System.out.println(s1.length());
System.out.println(s1.charAt(2));
System.out.println(s1.concat(s2));
System.out.println(s1.toUpperCase());
System.out.println(s1.toLowerCase());
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s1.compareTo(s2));
System.out.println(s3.compareToIgnoreCase(s4));
}
}