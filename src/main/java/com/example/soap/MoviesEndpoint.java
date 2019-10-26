package com.example.soap;

import models.GetMovieRequest;
import models.GetMovieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;



@Endpoint
public class MoviesEndpoint {
    private static final String NAMESPACE_URI = "http://localhost/movies";


    private final MovieRepository movieRepository;


    @Autowired
    public MoviesEndpoint(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }



    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMovieRequest")
    @ResponsePayload
    public GetMovieResponse getMovie(@RequestPayload GetMovieRequest request) {
        GetMovieResponse response = new GetMovieResponse();
        response.setMovie(movieRepository.getMovie(request.getName()));

        return response;
    }
}
