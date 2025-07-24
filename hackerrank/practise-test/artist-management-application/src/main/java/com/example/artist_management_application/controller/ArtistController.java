package com.example.artist_management_application.controller;

import com.example.artist_management_application.model.Artist;
import com.example.artist_management_application.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/artists")
public class ArtistController {

    @Autowired
    ArtistService artistService;

    @PostMapping
    public ResponseEntity<Artist> addArtist(@RequestBody Artist artist) {
        Artist addedArtists = artistService.addArtist(artist);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedArtists);
    }

    @GetMapping
    public ResponseEntity<List<Artist>> getAllArtist() {
        List<Artist> artist = artistService.getAllArtist();
        return ResponseEntity.ok(artist);
    }

    @GetMapping("/{artistId}")
    public ResponseEntity<Artist> getArtistById(@PathVariable Long artistId) {
        Artist artist = artistService.getArtistById(artistId);
        return ResponseEntity.ok(artist);
    }

    @DeleteMapping("/{artistId}")
    public ResponseEntity<String> deleteArtistById(@PathVariable Long artistId) {
        artistService.deleteArtistById(artistId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Artist deleted");
    }
}
