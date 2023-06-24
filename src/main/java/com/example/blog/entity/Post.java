package com.example.blog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   //adiciona getter, setter, toString e hashcode
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(
//        name = "posts", uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}
//) A tag @Entity gera a tabela com o nome da class automaticamente
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String title;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String content;
}
