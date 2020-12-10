import java.math.BigInteger;
import java.security.MessageDigest;
class SHA
{
  public static void main(String[] args) throws java.lang.Exception
  {
    try
    {
      String s= "Hello World";
      MessageDigest md = MessageDigest.getInstance("SHA-1");
      byte[] digestInfo = md.digest(s.getBytes());
      BigInteger n = new BigInteger(1,digestInfo);
      String hashtxt = n.toString(16);
      System.out.println(hashtxt);
    }
    catch(NoSuchAlgorithmException e)
    {
      System.out.println(e);
    }
  }
}
