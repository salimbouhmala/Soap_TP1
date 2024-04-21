import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        // stub == le proxy coté client
        // skeleton == le proxy coté serveur
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(1000));
        Compte cpt = stub.getCompte(5);
        System.out.println(cpt.getCode());
        System.out.println(cpt.getSolde());
    }
}
