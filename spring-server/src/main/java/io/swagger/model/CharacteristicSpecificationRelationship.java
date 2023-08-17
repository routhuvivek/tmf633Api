package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TimePeriod;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An aggregation, migration, substitution, dependency or exclusivity relationship between/among Characteristic specifications. The specification characteristic is embedded within the specification whose ID and href are in this entity, and identified by its ID.
 */
@ApiModel(description = "An aggregation, migration, substitution, dependency or exclusivity relationship between/among Characteristic specifications. The specification characteristic is embedded within the specification whose ID and href are in this entity, and identified by its ID.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-07T05:22:45.795Z")

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CharacteristicSpecificationRelationship   {
  @Id
  @JsonProperty("characteristicSpecificationId")
  private String characteristicSpecificationId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parentSpecificationHref")
  private String parentSpecificationHref = null;

  @JsonProperty("parentSpecificationId")
  private String parentSpecificationId = null;

  @JsonProperty("relationshipType")
  private String relationshipType = null;

  @JsonProperty("validFor")
  @OneToOne(targetEntity = TimePeriod.class,cascade = CascadeType.ALL)
  private TimePeriod validFor = null;

  public CharacteristicSpecificationRelationship characteristicSpecificationId(String characteristicSpecificationId) {
    this.characteristicSpecificationId = characteristicSpecificationId;
    return this;
  }

  /**
   * Unique identifier of the characteristic within the specification
   * @return characteristicSpecificationId
  **/
  @ApiModelProperty(value = "Unique identifier of the characteristic within the specification")


  public String getCharacteristicSpecificationId() {
    return characteristicSpecificationId;
  }

  public void setCharacteristicSpecificationId(String characteristicSpecificationId) {
    this.characteristicSpecificationId = characteristicSpecificationId;
  }

  public CharacteristicSpecificationRelationship name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the target characteristic within the specification
   * @return name
  **/
  @ApiModelProperty(value = "Name of the target characteristic within the specification")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CharacteristicSpecificationRelationship parentSpecificationHref(String parentSpecificationHref) {
    this.parentSpecificationHref = parentSpecificationHref;
    return this;
  }

  /**
   * Hyperlink reference to the parent specification containing the target characteristic
   * @return parentSpecificationHref
  **/
  @ApiModelProperty(value = "Hyperlink reference to the parent specification containing the target characteristic")


  public String getParentSpecificationHref() {
    return parentSpecificationHref;
  }

  public void setParentSpecificationHref(String parentSpecificationHref) {
    this.parentSpecificationHref = parentSpecificationHref;
  }

  public CharacteristicSpecificationRelationship parentSpecificationId(String parentSpecificationId) {
    this.parentSpecificationId = parentSpecificationId;
    return this;
  }

  /**
   * Unique identifier of the parent specification containing the target characteristic
   * @return parentSpecificationId
  **/
  @ApiModelProperty(value = "Unique identifier of the parent specification containing the target characteristic")


  public String getParentSpecificationId() {
    return parentSpecificationId;
  }

  public void setParentSpecificationId(String parentSpecificationId) {
    this.parentSpecificationId = parentSpecificationId;
  }

  public CharacteristicSpecificationRelationship relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * Type of relationship such as aggregation, migration, substitution, dependency, exclusivity
   * @return relationshipType
  **/
  @ApiModelProperty(value = "Type of relationship such as aggregation, migration, substitution, dependency, exclusivity")


  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public CharacteristicSpecificationRelationship validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The period for which the object is valid
   * @return validFor
  **/
  @ApiModelProperty(value = "The period for which the object is valid")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacteristicSpecificationRelationship characteristicSpecificationRelationship = (CharacteristicSpecificationRelationship) o;
    return Objects.equals(this.characteristicSpecificationId, characteristicSpecificationRelationship.characteristicSpecificationId) &&
        Objects.equals(this.name, characteristicSpecificationRelationship.name) &&
        Objects.equals(this.parentSpecificationHref, characteristicSpecificationRelationship.parentSpecificationHref) &&
        Objects.equals(this.parentSpecificationId, characteristicSpecificationRelationship.parentSpecificationId) &&
        Objects.equals(this.relationshipType, characteristicSpecificationRelationship.relationshipType) &&
        Objects.equals(this.validFor, characteristicSpecificationRelationship.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characteristicSpecificationId, name, parentSpecificationHref, parentSpecificationId, relationshipType, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacteristicSpecificationRelationship {\n");
    
    sb.append("    characteristicSpecificationId: ").append(toIndentedString(characteristicSpecificationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentSpecificationHref: ").append(toIndentedString(parentSpecificationHref)).append("\n");
    sb.append("    parentSpecificationId: ").append(toIndentedString(parentSpecificationId)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

