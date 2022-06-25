import java.security.*;

public class ListServices {
        public static void main(String args[]) {
                String providerName = null;
                try {
                        providerName = args[0];
                } catch(ArrayIndexOutOfBoundsException aio) {
                        System.out.println("Usage :-");
                        System.out.println("java ListServices <Provider_Name>");
                        System.exit(1);
                }

                Provider prod = Security.getProvider(args[0]);

                if(prod==null) {
                        System.out.println("Provider not found.");
                        System.exit(1);
                }

                for(Provider.Service srv:prod.getServices()) {
                        System.out.println(srv);
                }
        }
}
