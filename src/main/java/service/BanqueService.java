package service;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/banque")
public class BanqueService {
    @GET
    @Path("/conversion/{montant}")
    @Produces(MediaType.APPLICATION_JSON)
    public double conversion(@PathParam(value="montant") double mt){
        return mt*11;
    }
    @GET
    @Path("/comptes/{code}")
    @Produces(MediaType.APPLICATION_JSON)
    public Compte getCompte(@PathParam(value="code")  Long code){
        return new Compte(code,Math.random()*10,new Date());
    }
    @GET
    @Path("/comptes")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Compte> getComptes(){
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1L,Math.random()*10,new Date()));
        comptes.add(new Compte(2L,Math.random()*10,new Date()));
        return comptes;
    }
}
