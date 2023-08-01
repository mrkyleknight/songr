package com.java401d18.songr.Controllers;

import com.java401d18.songr.Repo.AlbumStorage;
import com.java401d18.songr.models.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class MyControllers {
    @Autowired
    AlbumStorage albumStorage;

    public MyControllers(AlbumStorage albumStorage) {
        this.albumStorage = albumStorage;
    }
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "hello"; // this refers to hello.html template under templates directory
    }

    @GetMapping("/capitalize/{text}")
    public String capitalizeText(@PathVariable String text, Model model) {
        model.addAttribute("text", text.toUpperCase());
        return "capitalize"; // this refers to capitalize.html template under templates directory
    }

    @PostMapping("/song/add")
    public String addSong(@RequestParam String albumName,
                          @RequestParam String title,
                          @RequestParam int length,
                          @RequestParam int trackNumber,
                          Model model) {

        return "redirect:/albums";
    }
    @GetMapping("/albums")
    public String getAlbums(Model model) {
        List<Album> albums = albumStorage.findAll();
        model.addAttribute("banana", albums);
        return "albums.html";
    }


    @PostMapping("/albums/add")
    public RedirectView addAlbum( String title,
                                  String artist,
                                 int songCount, int length,
                                 String imageUrl) {
        Album album = new Album(title, artist, songCount, length, imageUrl);
        albumStorage.save(album);
        return new RedirectView("/albums");
    }



//    @GetMapping("/albums")
//    public String showAlbums(Model model) {
//        model.addAttribute("albums", albumStorage.findAll());
//        Album[] albums = {
//                new Album("Backstreet Boys", "\t\n" +
//                        "AJ McLean\n" +
//                        ",Howie Dorough\n" +
//                        ",Nick Carter\n" +
//                        ",Kevin Richardson\n" +
//                        ",Brian Littrell", 10, 3600, "https://upload.wikimedia.org/wikipedia/en/5/56/Bryan_Adams_-_Reckless.jpg"),
//                new Album("Reckless", "bryan adams", 8, 3000, "https://upload.wikimedia.org/wikipedia/en/5/56/Bryan_Adams_-_Reckless.jpg"),
//                new Album("Lover", "Taylor Swift ", 12, 4000, "https://upload.wikimedia.org/wikipedia/en/5/56/Bryan_Adams_-_Reckless.jpg"),
//        };
//        model.addAttribute("albums", albums);
//        return "albums"; // this refers to albums.html template under templates directory
//    }
}

