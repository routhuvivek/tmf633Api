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

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An aggregation, migration, substitution, dependency or exclusivity relationship between/among FeatureSpecificationCharacteristics.
 */
@ApiModel(description = "An aggregation, migration, substitution, dependency or exclusivity relationship between/among FeatureSpecificationCharacteristics.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-07T05:22:45.795Z")

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeatureSpecificationCharacteristicRelationship   {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @JsonProperty("characteristicId")
  private String characteristicId = null;

  @JsonProperty("featureId")
  private String featureId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("relationshipType")
  private String relationshipType = null;

  @JsonProperty("resourceSpecificationHref")
  private String resourceSpecificationHref = null;

  @JsonProperty("resourceSpecificationId")
  private String resourceSpecificationId = null;

  @JsonProperty("validFor")
  @OneToOne(targetEntity = TimePeriod.class, cascade = CascadeType.ALL)
  private TimePeriod validFor = null;

  public FeatureSpecificationCharacteristicRelationship characteristicId(String characteristicId) {
    this.characteristicId = characteristicId;
    return this;
  }

  /**
   * Unique identifier of the characteristic within the the target feature specification
   * @return characteristicId
  **/
  @ApiModelProperty(value = "Unique identifier of the characteristic within the the target feature specification")


  public String getCharacteristicId() {
    return characteristicId;
  }

  public void setCharacteristicId(String characteristicId) {
    this.characteristicId = characteristicId;
  }

  public FeatureSpecificationCharacteristicRelationship featureId(String featureId) {
    this.featureId = featureId;
    return this;
  }

  /**
   * Unique identifier of the target feature specification within the resource specification.
   * @return featureId
  **/
  @ApiModelProperty(value = "Unique identifier of the target feature specification within the resource specification.")


  public String getFeatureId() {
    return featureId;
  }

  public void setFeatureId(String featureId) {
    this.featureId = featureId;
  }

  public FeatureSpecificationCharacteristicRelationship name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the target characteristic
   * @return name
  **/
  @ApiModelProperty(value = "Name of the target characteristic")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeatureSpecificationCharacteristicRelationship relationshipType(String relationshipType) {
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

  public FeatureSpecificationCharacteristicRelationship resourceSpecificationHref(String resourceSpecificationHref) {
    this.resourceSpecificationHref = resourceSpecificationHref;
    return this;
  }

  /**
   * Hyperlink reference to the resource specification containing the target feature and feature characteristic
   * @return resourceSpecificationHref
  **/
  @ApiModelProperty(value = "Hyperlink reference to the resource specification containing the target feature and feature characteristic")


  public String getResourceSpecificationHref() {
    return resourceSpecificationHref;
  }

  public void setResourceSpecificationHref(String resourceSpecificationHref) {
    this.resourceSpecificationHref = resourceSpecificationHref;
  }

  public FeatureSpecificationCharacteristicRelationship resourceSpecificationId(String resourceSpecificationId) {
    this.resourceSpecificationId = resourceSpecificationId;
    return this;
  }

  /**
   * Unique identifier of the resource specification containing the target feature and feature characteristic
   * @return resourceSpecificationId
  **/
  @ApiModelProperty(value = "Unique identifier of the resource specification containing the target feature and feature characteristic")


  public String getResourceSpecificationId() {
    return resourceSpecificationId;
  }

  public void setResourceSpecificationId(String resourceSpecificationId) {
    this.resourceSpecificationId = resourceSpecificationId;
  }

  public FeatureSpecificationCharacteristicRelationship validFor(TimePeriod validFor) {
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
    FeatureSpecificationCharacteristicRelationship featureSpecificationCharacteristicRelationship = (FeatureSpecificationCharacteristicRelationship) o;
    return Objects.equals(this.characteristicId, featureSpecificationCharacteristicRelationship.characteristicId) &&
        Objects.equals(this.featureId, featureSpecificationCharacteristicRelationship.featureId) &&
        Objects.equals(this.name, featureSpecificationCharacteristicRelationship.name) &&
        Objects.equals(this.relationshipType, featureSpecificationCharacteristicRelationship.relationshipType) &&
        Objects.equals(this.resourceSpecificationHref, featureSpecificationCharacteristicRelationship.resourceSpecificationHref) &&
        Objects.equals(this.resourceSpecificationId, featureSpecificationCharacteristicRelationship.resourceSpecificationId) &&
        Objects.equals(this.validFor, featureSpecificationCharacteristicRelationship.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characteristicId, featureId, name, relationshipType, resourceSpecificationHref, resourceSpecificationId, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureSpecificationCharacteristicRelationship {\n");
    
    sb.append("    characteristicId: ").append(toIndentedString(characteristicId)).append("\n");
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    resourceSpecificationHref: ").append(toIndentedString(resourceSpecificationHref)).append("\n");
    sb.append("    resourceSpecificationId: ").append(toIndentedString(resourceSpecificationId)).append("\n");
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

