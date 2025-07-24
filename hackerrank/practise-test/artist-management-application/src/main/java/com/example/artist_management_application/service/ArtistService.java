package com.example.artist_management_application.service;

import com.example.artist_management_application.model.Artist;
import com.example.artist_management_application.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistService {

    @Autowired
    ArtistRepository artistRepository;

    public Artist addArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    public List<Artist> getAllArtist() {
        return artistRepository.findAll();
    }

    public Artist getArtistById(Long id) {
        Optional<Artist> artist = artistRepository.findById(id);
        if (artist.isEmpty()) {
            throw new RuntimeException("Artist not found");
        }
        Artist artist_found = artist.get();
        return artist_found;
    }

    public void deleteArtistById(Long id) {
//        Optional<Artist> artist = artistRepository.findById(id);
//        if (artist.isEmpty()) {
//            throw new RuntimeException("Artist not found");
//        }
//        Artist artist_found = artist.get();
        artistRepository.deleteById(id);
    }
}
