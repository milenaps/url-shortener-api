package com.mps.urlshortener.api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/v1/shortenurl")
public class UrlShortenerResource {

    @GET
    @Path("/{url}")
    public String shortenUrl(@PathParam("url") String url) {
        //TODO Implement service to return the shortened URL as result
        return url;
    }
}