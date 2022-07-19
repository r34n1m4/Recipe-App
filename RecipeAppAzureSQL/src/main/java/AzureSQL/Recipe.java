package AzureSQL;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Recipe {

    @Id
    @GeneratedValue
    private int id;
    private String recipe_name;
    private String recipe_desc;
    private String recipe_prep;
    private String cousine_type;
    private String dish_type;

}
