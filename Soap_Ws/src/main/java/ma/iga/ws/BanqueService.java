package ma.iga.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;



//POJO : Plain Old Java Object : C'est le nom technique d'une simple classe java

@WebService(serviceName = "BanqueWS") //:to have webservice annotaions you need to add a dependency jaxws impl maven dependency because after jdk 8 jaxws don't exist by default
public class BanqueService {
    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "montant") double mt ) {
        return mt*11.3;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, Math.random()*8000, new Date());
    }

    @WebMethod
    public List<Compte> compteList() {
        return List.of(
                new Compte(1, Math.random()*9000, new Date()),
                new Compte(2, Math.random()*9000, new Date()),
                new Compte(3, Math.random()*9000, new Date())
        );
    }
}
