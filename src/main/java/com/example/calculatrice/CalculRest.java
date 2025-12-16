package com.example.calculatrice;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;


@Path("/calcul")
@Produces(MediaType.APPLICATION_JSON)
public class CalculRest {


    private Calculatrice calculatrice = new Calculatrice();


    @GET
    @Path("/addition")
    public Operation addition(@QueryParam("a") double a,
                              @QueryParam("b") double b) {
        double res = calculatrice.addition(a, b);
        return new Operation("addition", a, b, res);
    }


    @GET
    @Path("/soustraction")
    public Operation soustraction(@QueryParam("a") double a,
                                  @QueryParam("b") double b) {
        double res = calculatrice.soustraction(a, b);
        return new Operation("soustraction", a, b, res);
    }


    @GET
    @Path("/multiplication")
    public Operation multiplication(@QueryParam("a") double a,
                                    @QueryParam("b") double b) {
        double res = calculatrice.multiplication(a, b);
        return new Operation("multiplication", a, b, res);
    }


    @GET
    @Path("/division")
    public Operation division(@QueryParam("a") double a,
                              @QueryParam("b") double b) {
        double res = calculatrice.division(a, b);
        return new Operation("division", a, b, res);
    }
}