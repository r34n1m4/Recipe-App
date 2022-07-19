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

public class Ingredients {

    @Id
    @GeneratedValue
    private int id;
    private String ingr_name;
    private String ingr_desc;
    private float calories;
    private float carbohydrates;
    private float fat;
    private float protein;
    private float water;
    private float cholesterol;
    private String ingr_type;

}
