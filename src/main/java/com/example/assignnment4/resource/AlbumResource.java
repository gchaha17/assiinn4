package com.example.assignnment4.resource;

import com.example.assignnment4.model.Album;
import com.example.assignnment4.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumResource {
    @Autowired
    private AlbumService als;
    @PostMapping("/album")
    public Album saveAlbum(@RequestBody @Valid Album al)
    {
        return als.saveAlbum(al);

    }
    @GetMapping("/album")
    public List<Album> getAlbum()
    {
        return als.getAlbum();

    }
    @PutMapping("/album")
    public Album updateAlbum(@RequestBody Album al)
    {

        return als.updateAlbum(al);
    }
    @DeleteMapping("/album")
    public void deleteAlbum(@RequestParam(name="albumId")String albumId)
    {
        als.deleteAlbum(albumId);

    }
}