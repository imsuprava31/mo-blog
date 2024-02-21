package org.jt.blog.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogDetails {

    private String heading;
    private String description;
    private String details;
    
}
