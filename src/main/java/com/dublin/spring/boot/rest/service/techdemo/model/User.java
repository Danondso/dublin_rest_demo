package com.dublin.spring.boot.rest.service.techdemo.model;


import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.ZonedDateTime;
import java.util.Set;

@Data
public class User {

    @Id
    public String id;

    public String firstName;
    public String lastName;
    public String displayName;
    public String description;
    public ZonedDateTime birthday;
    public Set<String> tags;
}
