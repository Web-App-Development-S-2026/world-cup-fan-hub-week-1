package com.cpan228.World.Cup.Event.Hub.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team {

    private Long id;
    private String name;
    private String group;
    private String confederation;
    private int rank;
    private String flagUrl;

}
