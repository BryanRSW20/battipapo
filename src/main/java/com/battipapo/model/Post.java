package com.battipapo.model;



import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "texto")
    @NotNull
    private String texto;

    @Column(name = "likes")
    private int likes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }



    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", texto='" + texto + '\'' +
                ", likes=" + likes +
                '}';
    }
}
