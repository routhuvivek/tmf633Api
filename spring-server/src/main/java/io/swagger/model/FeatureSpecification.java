package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ConstraintRef;
import io.swagger.model.FeatureSpecificationCharacteristic;
import io.swagger.model.FeatureSpecificationRelationship;
import io.swagger.model.TimePeriod;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Specification for resource, service or product features
 */
@ApiModel(description = "Specification for resource, service or product features")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-07T05:22:45.795Z")

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeatureSpecification   {
  @Id
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isBundle")
  private Boolean isBundle = null;

  @JsonProperty("isEnabled")
  private Boolean isEnabled = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("constraint")
  @Valid
  @OneToMany(targetEntity = ConstraintRef.class, cascade = CascadeType.ALL)
  private List<ConstraintRef> constraint = null;

  @JsonProperty("featureSpecCharacteristic")
  @Valid
  @OneToMany(targetEntity = FeatureSpecificationCharacteristic.class, cascade = CascadeType.ALL)
  private List<FeatureSpecificationCharacteristic> featureSpecCharacteristic = null;

  @JsonProperty("featureSpecRelationship")
  @Valid
  @OneToMany(targetEntity = FeatureSpecificationRelationship.class, cascade = CascadeType.ALL)
  private List<FeatureSpecificationRelationship> featureSpecRelationship = null;

  @JsonProperty("validFor")
  @OneToOne(targetEntity = TimePeriod.class,cascade = CascadeType.ALL)
  private TimePeriod validFor = null;

  public FeatureSpecification id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the feature specification. Must be locally unique within the containing specification, thus allowing direct access to the feature spec.
   * @return id
  **/
  @ApiModelProperty(value = "Identifier of the feature specification. Must be locally unique within the containing specification, thus allowing direct access to the feature spec.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FeatureSpecification isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  /**
   * A flag indicating if this is a feature group (true) or not (false)
   * @return isBundle
  **/
  @ApiModelProperty(value = "A flag indicating if this is a feature group (true) or not (false)")


  public Boolean isIsBundle() {
    return isBundle;
  }

  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  public FeatureSpecification isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * A flag indicating if the feature is enabled (true) or not (false)
   * @return isEnabled
  **/
  @ApiModelProperty(value = "A flag indicating if the feature is enabled (true) or not (false)")


  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public FeatureSpecification name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique name given to the feature specification
   * @return name
  **/
  @ApiModelProperty(value = "Unique name given to the feature specification")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeatureSpecification version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the feature specification
   * @return version
  **/
  @ApiModelProperty(value = "Version of the feature specification")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public FeatureSpecification constraint(List<ConstraintRef> constraint) {
    this.constraint = constraint;
    return this;
  }

  public FeatureSpecification addConstraintItem(ConstraintRef constraintItem) {
    if (this.constraint == null) {
      this.constraint = new ArrayList<ConstraintRef>();
    }
    this.constraint.add(constraintItem);
    return this;
  }

  /**
   * This is a list of feature constraints
   * @return constraint
  **/
  @ApiModelProperty(value = "This is a list of feature constraints")

  @Valid

  public List<ConstraintRef> getConstraint() {
    return constraint;
  }

  public void setConstraint(List<ConstraintRef> constraint) {
    this.constraint = constraint;
  }

  public FeatureSpecification featureSpecCharacteristic(List<FeatureSpecificationCharacteristic> featureSpecCharacteristic) {
    this.featureSpecCharacteristic = featureSpecCharacteristic;
    return this;
  }

  public FeatureSpecification addFeatureSpecCharacteristicItem(FeatureSpecificationCharacteristic featureSpecCharacteristicItem) {
    if (this.featureSpecCharacteristic == null) {
      this.featureSpecCharacteristic = new ArrayList<FeatureSpecificationCharacteristic>();
    }
    this.featureSpecCharacteristic.add(featureSpecCharacteristicItem);
    return this;
  }

  /**
   * This is a list of characteristics for a particular feature
   * @return featureSpecCharacteristic
  **/
  @ApiModelProperty(value = "This is a list of characteristics for a particular feature")

  @Valid

  public List<FeatureSpecificationCharacteristic> getFeatureSpecCharacteristic() {
    return featureSpecCharacteristic;
  }

  public void setFeatureSpecCharacteristic(List<FeatureSpecificationCharacteristic> featureSpecCharacteristic) {
    this.featureSpecCharacteristic = featureSpecCharacteristic;
  }

  public FeatureSpecification featureSpecRelationship(List<FeatureSpecificationRelationship> featureSpecRelationship) {
    this.featureSpecRelationship = featureSpecRelationship;
    return this;
  }

  public FeatureSpecification addFeatureSpecRelationshipItem(FeatureSpecificationRelationship featureSpecRelationshipItem) {
    if (this.featureSpecRelationship == null) {
      this.featureSpecRelationship = new ArrayList<FeatureSpecificationRelationship>();
    }
    this.featureSpecRelationship.add(featureSpecRelationshipItem);
    return this;
  }

  /**
   * A dependency, exclusivity or aggratation relationship between/among feature specifications.
   * @return featureSpecRelationship
  **/
  @ApiModelProperty(value = "A dependency, exclusivity or aggratation relationship between/among feature specifications.")

  @Valid

  public List<FeatureSpecificationRelationship> getFeatureSpecRelationship() {
    return featureSpecRelationship;
  }

  public void setFeatureSpecRelationship(List<FeatureSpecificationRelationship> featureSpecRelationship) {
    this.featureSpecRelationship = featureSpecRelationship;
  }

  public FeatureSpecification validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The period for which this feature specification is valid
   * @return validFor
  **/
  @ApiModelProperty(value = "The period for which this feature specification is valid")

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
    FeatureSpecification featureSpecification = (FeatureSpecification) o;
    return Objects.equals(this.id, featureSpecification.id) &&
        Objects.equals(this.isBundle, featureSpecification.isBundle) &&
        Objects.equals(this.isEnabled, featureSpecification.isEnabled) &&
        Objects.equals(this.name, featureSpecification.name) &&
        Objects.equals(this.version, featureSpecification.version) &&
        Objects.equals(this.constraint, featureSpecification.constraint) &&
        Objects.equals(this.featureSpecCharacteristic, featureSpecification.featureSpecCharacteristic) &&
        Objects.equals(this.featureSpecRelationship, featureSpecification.featureSpecRelationship) &&
        Objects.equals(this.validFor, featureSpecification.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isBundle, isEnabled, name, version, constraint, featureSpecCharacteristic, featureSpecRelationship, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureSpecification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
    sb.append("    featureSpecCharacteristic: ").append(toIndentedString(featureSpecCharacteristic)).append("\n");
    sb.append("    featureSpecRelationship: ").append(toIndentedString(featureSpecRelationship)).append("\n");
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

