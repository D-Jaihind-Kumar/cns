import java.security.*; 
public class SHA1 { 
public static void main(String[] a) { 
try { 
MessageDigest md = MessageDigest.getInstance("SHA1"); 
System.out.println("Message digest object info: "); 
System.out.println(" Algorithm = " +md.getAlgorithm()); 
System.out.println(" Provider = " +md.getProvider()); 
System.out.println(" ToString = " +md.toString()); 
String input = ""; 
md.update(input.getBytes()); 
byte[] output = md.digest(); 
System.out.println(); 
System.out.println("SHA1(\""+input+"\") = " +bytesToHex(output)); 
input = "abc"; 
md.update(input.getBytes()); 
output = md.digest(); 
System.out.println(); 
System.out.println("SHA1(\""+input+"\") = " +bytesToHex(output)); 
input = "abcdefghijklmnopqrstuvwxyz"; 
md.update(input.getBytes()); 
output = md.digest(); 
System.out.println(); 
System.out.println("SHA1(\"" +input+"\") = " +bytesToHex(output)); 
System.out.println(""); } 
catch (Exception e) { 
System.out.println("Exception: " +e); 
} 
} 
