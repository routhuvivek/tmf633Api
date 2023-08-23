package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CharacteristicValueSpecification;
import io.swagger.model.FeatureSpecificationCharacteristicRelationship;
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
 * Configuration feature characteristic specification.
 */
@ApiModel(description = "Configuration feature characteristic specification.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-07T05:22:45.795Z")

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FeatureSpecChar")
public class FeatureSpecificationCharacteristic   {
  @Id
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("configurable")
  private Boolean configurable = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("extensible")
  private Boolean extensible = null;

  @JsonProperty("isUnique")
  private Boolean isUnique = null;

  @JsonProperty("maxCardinality")
  private Integer maxCardinality = null;

  @JsonProperty("minCardinality")
  private Integer minCardinality = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("regex")
  private String regex = null;

  @JsonProperty("valueType")
  private String valueType = null;

  @JsonProperty("featureSpecCharRelationship")
  @Valid
  @OneToMany(targetEntity = FeatureSpecificationCharacteristicRelationship.class, cascade = CascadeType.ALL)
  private List<FeatureSpecificationCharacteristicRelationship> featureSpecCharRelationship = null;

  @JsonProperty("featureSpecCharVal")
  @Valid
  @OneToMany(targetEntity = CharacteristicValueSpecification.class, cascade = CascadeType.ALL)
  private List<CharacteristicValueSpecification> featureSpecCharVal = null;

  @JsonProperty("validFor")
  @OneToOne(targetEntity = TimePeriod.class, cascade = CascadeType.ALL)
  private TimePeriod validFor = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@valueSchemaLocation")
  private String valueSchemaLocation = null;

  public FeatureSpecificationCharacteristic id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique ID for the characteristic
   * @return id
  **/
  @ApiModelProperty(value = "Unique ID for the characteristic")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FeatureSpecificationCharacteristic configurable(Boolean configurable) {
    this.configurable = configurable;
    return this;
  }

  /**
   * If true, the Boolean indicates that the target Characteristic is configurable
   * @return configurable
  **/
  @ApiModelProperty(value = "If true, the Boolean indicates that the target Characteristic is configurable")


  public Boolean isConfigurable() {
    return configurable;
  }

  public void setConfigurable(Boolean configurable) {
    this.configurable = configurable;
  }

  public FeatureSpecificationCharacteristic description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A narrative that explains the CharacteristicSpecification.
   * @return description
  **/
  @ApiModelProperty(value = "A narrative that explains the CharacteristicSpecification.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FeatureSpecificationCharacteristic extensible(Boolean extensible) {
    this.extensible = extensible;
    return this;
  }

  /**
   * An indicator that specifies that the values for the characteristic can be extended by adding new values when instantiating a characteristic for a resource.
   * @return extensible
  **/
  @ApiModelProperty(value = "An indicator that specifies that the values for the characteristic can be extended by adding new values when instantiating a characteristic for a resource.")


  public Boolean isExtensible() {
    return extensible;
  }

  public void setExtensible(Boolean extensible) {
    this.extensible = extensible;
  }

  public FeatureSpecificationCharacteristic isUnique(Boolean isUnique) {
    this.isUnique = isUnique;
    return this;
  }

  /**
   * An indicator that specifies if a value is unique for the specification. Possible values are; \"unique while value is in effect\" and \"unique whether value is in effect or not\"
   * @return isUnique
  **/
  @ApiModelProperty(value = "An indicator that specifies if a value is unique for the specification. Possible values are; \"unique while value is in effect\" and \"unique whether value is in effect or not\"")


  public Boolean isIsUnique() {
    return isUnique;
  }

  public void setIsUnique(Boolean isUnique) {
    this.isUnique = isUnique;
  }

  public FeatureSpecificationCharacteristic maxCardinality(Integer maxCardinality) {
    this.maxCardinality = maxCardinality;
    return this;
  }

  /**
   * The maximum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where five is the value for the maxCardinality.
   * @return maxCardinality
  **/
  @ApiModelProperty(value = "The maximum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where five is the value for the maxCardinality.")


  public Integer getMaxCardinality() {
    return maxCardinality;
  }

  public void setMaxCardinality(Integer maxCardinality) {
    this.maxCardinality = maxCardinality;
  }

  public FeatureSpecificationCharacteristic minCardinality(Integer minCardinality) {
    this.minCardinality = minCardinality;
    return this;
  }

  /**
   * The minimum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where zero is the value for the minCardinality.
   * @return minCardinality
  **/
  @ApiModelProperty(value = "The minimum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where zero is the value for the minCardinality.")


  public Integer getMinCardinality() {
    return minCardinality;
  }

  public void setMinCardinality(Integer minCardinality) {
    this.minCardinality = minCardinality;
  }

  public FeatureSpecificationCharacteristic name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A word, term, or phrase by which this characteristic specification is known and distinguished from other characteristic specifications.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A word, term, or phrase by which this characteristic specification is known and distinguished from other characteristic specifications.")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeatureSpecificationCharacteristic regex(String regex) {
    this.regex = regex;
    return this;
  }

  /**
   * A rule or principle represented in regular expression used to derive the value of a characteristic value.
   * @return regex
  **/
  @ApiModelProperty(value = "A rule or principle represented in regular expression used to derive the value of a characteristic value.")


  public String getRegex() {
    return regex;
  }

  public void setRegex(String regex) {
    this.regex = regex;
  }

  public FeatureSpecificationCharacteristic valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * A kind of value that the characteristic can take on, such as numeric, text and so forth
   * @return valueType
  **/
  @ApiModelProperty(value = "A kind of value that the characteristic can take on, such as numeric, text and so forth")


  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  public FeatureSpecificationCharacteristic featureSpecCharRelationship(List<FeatureSpecificationCharacteristicRelationship> featureSpecCharRelationship) {
    this.featureSpecCharRelationship = featureSpecCharRelationship;
    return this;
  }

  public FeatureSpecificationCharacteristic addFeatureSpecCharRelationshipItem(FeatureSpecificationCharacteristicRelationship featureSpecCharRelationshipItem) {
    if (this.featureSpecCharRelationship == null) {
      this.featureSpecCharRelationship = new ArrayList<FeatureSpecificationCharacteristicRelationship>();
    }
    this.featureSpecCharRelationship.add(featureSpecCharRelationshipItem);
    return this;
  }

  /**
   * An aggregation, migration, substitution, dependency or exclusivity relationship between/among feature characteristics.
   * @return featureSpecCharRelationship
  **/
  @ApiModelProperty(value = "An aggregation, migration, substitution, dependency or exclusivity relationship between/among feature characteristics.")

  @Valid

  public List<FeatureSpecificationCharacteristicRelationship> getFeatureSpecCharRelationship() {
    return featureSpecCharRelationship;
  }

  public void setFeatureSpecCharRelationship(List<FeatureSpecificationCharacteristicRelationship> featureSpecCharRelationship) {
    this.featureSpecCharRelationship = featureSpecCharRelationship;
  }

  public FeatureSpecificationCharacteristic featureSpecCharVal(List<CharacteristicValueSpecification> featureSpecCharVal) {
    this.featureSpecCharVal = featureSpecCharVal;
    return this;
  }

  public FeatureSpecificationCharacteristic addfeatureSpecCharValItem(CharacteristicValueSpecification featureSpecCharValItem) {
    if (this.featureSpecCharVal == null) {
      this.featureSpecCharVal = new ArrayList<CharacteristicValueSpecification>();
    }
    this.featureSpecCharVal.add(featureSpecCharValItem);
    return this;
  }

  /**
   * Used to define a set of attributes, each of which can be assigned to a corresponding set of attributes in a FeatureCharacteristic object.
   * @return featureSpecCharVal
  **/
  @ApiModelProperty(value = "Used to define a set of attributes, each of which can be assigned to a corresponding set of attributes in a FeatureCharacteristic object.")

  @Valid

  public List<CharacteristicValueSpecification> getfeatureSpecCharVal() {
    return featureSpecCharVal;
  }

  public void setfeatureSpecCharVal(List<CharacteristicValueSpecification> featureSpecCharVal) {
    this.featureSpecCharVal = featureSpecCharVal;
  }

  public FeatureSpecificationCharacteristic validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The period of time for which a characteristic is applicable.
   * @return validFor
  **/
  @ApiModelProperty(value = "The period of time for which a characteristic is applicable.")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public FeatureSpecificationCharacteristic baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public FeatureSpecificationCharacteristic schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public FeatureSpecificationCharacteristic type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return type
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class Extensible name")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FeatureSpecificationCharacteristic valueSchemaLocation(String valueSchemaLocation) {
    this.valueSchemaLocation = valueSchemaLocation;
    return this;
  }

  /**
   * This (optional) field provides a link to the schema describing the value type.
   * @return valueSchemaLocation
  **/
  @ApiModelProperty(value = "This (optional) field provides a link to the schema describing the value type.")


  public String getValueSchemaLocation() {
    return valueSchemaLocation;
  }

  public void setValueSchemaLocation(String valueSchemaLocation) {
    this.valueSchemaLocation = valueSchemaLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureSpecificationCharacteristic featureSpecificationCharacteristic = (FeatureSpecificationCharacteristic) o;
    return Objects.equals(this.id, featureSpecificationCharacteristic.id) &&
        Objects.equals(this.configurable, featureSpecificationCharacteristic.configurable) &&
        Objects.equals(this.description, featureSpecificationCharacteristic.description) &&
        Objects.equals(this.extensible, featureSpecificationCharacteristic.extensible) &&
        Objects.equals(this.isUnique, featureSpecificationCharacteristic.isUnique) &&
        Objects.equals(this.maxCardinality, featureSpecificationCharacteristic.maxCardinality) &&
        Objects.equals(this.minCardinality, featureSpecificationCharacteristic.minCardinality) &&
        Objects.equals(this.name, featureSpecificationCharacteristic.name) &&
        Objects.equals(this.regex, featureSpecificationCharacteristic.regex) &&
        Objects.equals(this.valueType, featureSpecificationCharacteristic.valueType) &&
        Objects.equals(this.featureSpecCharRelationship, featureSpecificationCharacteristic.featureSpecCharRelationship) &&
        Objects.equals(this.featureSpecCharVal, featureSpecificationCharacteristic.featureSpecCharVal) &&
        Objects.equals(this.validFor, featureSpecificationCharacteristic.validFor) &&
        Objects.equals(this.baseType, featureSpecificationCharacteristic.baseType) &&
        Objects.equals(this.schemaLocation, featureSpecificationCharacteristic.schemaLocation) &&
        Objects.equals(this.type, featureSpecificationCharacteristic.type) &&
        Objects.equals(this.valueSchemaLocation, featureSpecificationCharacteristic.valueSchemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, configurable, description, extensible, isUnique, maxCardinality, minCardinality, name, regex, valueType, featureSpecCharRelationship, featureSpecCharVal, validFor, baseType, schemaLocation, type, valueSchemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureSpecificationCharacteristic {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    configurable: ").append(toIndentedString(configurable)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extensible: ").append(toIndentedString(extensible)).append("\n");
    sb.append("    isUnique: ").append(toIndentedString(isUnique)).append("\n");
    sb.append("    maxCardinality: ").append(toIndentedString(maxCardinality)).append("\n");
    sb.append("    minCardinality: ").append(toIndentedString(minCardinality)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    featureSpecCharRelationship: ").append(toIndentedString(featureSpecCharRelationship)).append("\n");
    sb.append("    featureSpecCharVal: ").append(toIndentedString(featureSpecCharVal)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueSchemaLocation: ").append(toIndentedString(valueSchemaLocation)).append("\n");
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

