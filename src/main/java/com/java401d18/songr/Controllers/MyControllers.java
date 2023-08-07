//package com.java401d18.songr.Controllers;
//
//import com.java401d18.songr.Repo.AlbumStorage;
//import com.java401d18.songr.Repo.SongStorage;
//import com.java401d18.songr.models.Album;
//import com.java401d18.songr.models.Song;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.view.RedirectView;
//
//import java.util.List;
//import java.util.Optional;
//
//@Controller
//public class MyControllers {
//    @Autowired
//    AlbumStorage albumStorage;
//    @Autowired
//    SongStorage SongStorage;
//
//    public MyControllers(AlbumStorage albumStorage, SongStorage songStorage) {
//        this.albumStorage = albumStorage;
//        this.SongStorage = songStorage;
//    }
//
//    @GetMapping("/")
//    public String index() {
//        return "index";
//    }
//
//    @GetMapping("/hello")
//    public String helloWorld() {
//        return "hello"; // this refers to hello.html template under templates directory
//    }
//
//    @GetMapping("/capitalize/{text}")
//    public String capitalizeText(@PathVariable String text, Model model) {
//        model.addAttribute("text", text.toUpperCase());
//        return "capitalize"; // this refers to capitalize.html template under templates directory
//    }
//
//    @PostMapping("/albums/{id}/songs")
//    public RedirectView addSongToAlbum(@PathVariable Long id,
//                                       @RequestParam String songTitle,
//                                       @RequestParam int length,
//                                       @RequestParam int trackNumber){
//        Optional<Album> albumOptional = albumStorage.findById(id);
//
//        if (!albumOptional.isPresent()) {
//            throw new IllegalArgumentException("No Album Found");
//        }
//
//        Album album = albumOptional.get();
//
//        Song song = new Song(songTitle, length, trackNumber, album);
//        SongStorage.save(song);
//        return new RedirectView("/albums");
//    }
//
//
//
//
//
//    @GetMapping("/error")
//    public String errorPage(Model model) {
//        model.addAttribute("errorMessage", "Album not found.");
//        return "error";
//    }
//
//    @GetMapping("/songs")
//    public String showSongs(Model model) {
//        List<Song> getSongs = SongStorage.findAll();
//        model.addAttribute("getSongs", getSongs);
//        return "allSongs.html";
//
//    }
//    @GetMapping("/albums")
//    public String getAlbums(Model model) {
//        List<Album> albums = albumStorage.findAll();
//        model.addAttribute("banana", albums);
//        return "albums.html";
//    }
//
//    @PostMapping("/albums/add")
//    public RedirectView addAlbum( String title,
//                                  String artist,
//                                  int songCount, int length,
//                                  String imageUrl) {
//        Album album = new Album(title, artist, songCount, length, imageUrl);
//        albumStorage.save(album);
//        return new RedirectView("/albums");
//    }
//}
//



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


