package sample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Todo {

    private String _id;
    private String createdAt;
    private String updatedAt;
    private String task;
    private Integer __v;
    private String status;

}
