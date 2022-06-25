import java.security.*;

public class ListProviders {
        public static void main(String args[]) {
                Provider []prod = Security.getProviders();
                for(Provider p:prod) {
                        System.out.println(p);
                }
        }
}
