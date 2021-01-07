package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class PosterItem {
    private int id;
    private String movieName;
    private String pictireUrl;
    private String genre;

    public PosterItem(int id, String movieName, String pictireUrl, String genre) {
        this.id = id;
        this.movieName = movieName;
        this.pictireUrl = pictireUrl;
        this.genre = genre;
    }

}
