package io.gps.migration.topic.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Topic {
    private String id;
    private String name;
    private String description;
}
