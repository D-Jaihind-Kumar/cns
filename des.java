import java.util.*;
import javax.crypto.*;
class Des{
        public static void main(String args[])
        {
                try{
                        KeyGenerator kg=KeyGenerator.getInstance("DES");
                        SecretKey skey = kg.generateKey();
                        Cipher c=Cipher.getInstance("DES");
                        c.init(Cipher.ENCRYPT_MODE,skey);
                        byte[] txt = "hi".getBytes();
                        byte[] ntxt = c.doFinal(txt);
                        System.out.println(new String(ntxt));
                        c.init(Cipher.DECRYPT_MODE, skey);
                }
                catch(Exception e)
                {
                  System.out.println("Error "+e+" occured");
                }
        }
}
