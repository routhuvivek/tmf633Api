package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TimePeriod;
import lombok.Data;
import lombok.Generated;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Relationship between feature specifications
 */
@ApiModel(description = "Relationship between feature specifications")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-07T05:22:45.795Z")

@Entity
@Data
public class FeatureSpecificationRelationship   {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @JsonProperty("featureId")
  private String featureId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parentSpecificationHref")
  private String parentSpecificationHref = null;

  @JsonProperty("parentSpecificationId")
  private String parentSpecificationId = null;

  @JsonProperty("relationshipType")
  private String relationshipType = null;

  @JsonProperty("validFor")
  @OneToOne(targetEntity = TimePeriod.class, cascade = CascadeType.ALL)
  private TimePeriod validFor = null;

  public FeatureSpecificationRelationship featureId(String featureId) {
    this.featureId = featureId;
    return this;
  }

  /**
   * Unique identifier of the target feature specification.
   * @return featureId
  **/
  @ApiModelProperty(value = "Unique identifier of the target feature specification.")


  public String getFeatureId() {
    return featureId;
  }

  public void setFeatureId(String featureId) {
    this.featureId = featureId;
  }

  public FeatureSpecificationRelationship name(String name) {
    this.name = name;
    return this;
  }

  /**
   * This is the name of the target feature specification.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "This is the name of the target feature specification.")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeatureSpecificationRelationship parentSpecificationHref(String parentSpecificationHref) {
    this.parentSpecificationHref = parentSpecificationHref;
    return this;
  }

  /**
   * Hyperlink reference to the parent specification containing the target feature
   * @return parentSpecificationHref
  **/
  @ApiModelProperty(value = "Hyperlink reference to the parent specification containing the target feature")


  public String getParentSpecificationHref() {
    return parentSpecificationHref;
  }

  public void setParentSpecificationHref(String parentSpecificationHref) {
    this.parentSpecificationHref = parentSpecificationHref;
  }

  public FeatureSpecificationRelationship parentSpecificationId(String parentSpecificationId) {
    this.parentSpecificationId = parentSpecificationId;
    return this;
  }

  /**
   * Unique identifier of the parent specification containing the target feature
   * @return parentSpecificationId
  **/
  @ApiModelProperty(value = "Unique identifier of the parent specification containing the target feature")


  public String getParentSpecificationId() {
    return parentSpecificationId;
  }

  public void setParentSpecificationId(String parentSpecificationId) {
    this.parentSpecificationId = parentSpecificationId;
  }

  public FeatureSpecificationRelationship relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * This is the type of the feature specification relationship.
   * @return relationshipType
  **/
  @ApiModelProperty(required = true, value = "This is the type of the feature specification relationship.")
  @NotNull


  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public FeatureSpecificationRelationship validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The period for which this feature spoecification relationship is valid.
   * @return validFor
  **/
  @ApiModelProperty(value = "The period for which this feature spoecification relationship is valid.")

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
    FeatureSpecificationRelationship featureSpecificationRelationship = (FeatureSpecificationRelationship) o;
    return Objects.equals(this.featureId, featureSpecificationRelationship.featureId) &&
        Objects.equals(this.name, featureSpecificationRelationship.name) &&
        Objects.equals(this.parentSpecificationHref, featureSpecificationRelationship.parentSpecificationHref) &&
        Objects.equals(this.parentSpecificationId, featureSpecificationRelationship.parentSpecificationId) &&
        Objects.equals(this.relationshipType, featureSpecificationRelationship.relationshipType) &&
        Objects.equals(this.validFor, featureSpecificationRelationship.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureId, name, parentSpecificationHref, parentSpecificationId, relationshipType, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureSpecificationRelationship {\n");
    
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
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

