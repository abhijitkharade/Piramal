package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    int userId;
}
