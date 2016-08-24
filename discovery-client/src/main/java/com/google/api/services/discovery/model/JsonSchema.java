/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-11-16 19:10:01 UTC)
 * on 2015-11-19 at 17:34:48 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.discovery.model;

/**
 * Model definition for JsonSchema.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the APIs Discovery Service. For a detailed explanation
 * see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JsonSchema extends com.google.api.client.json.GenericJson {

  /**
   * A reference to another schema. The value of this property is the "id" of another schema.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String $ref;

  /**
   * If this is a schema for an object, this property is the schema for any additional properties
   * with dynamic keys on this object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JsonSchema additionalProperties;

  /**
   * Additional information about this property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Annotations annotations;

  /**
   * The default value of this property (if one exists).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("default")
  private java.lang.String default__;

  /**
   * A description of this object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Values this parameter may take (if it is an enum).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("enum")
  private java.util.List<java.lang.String> enum__;

  /**
   * The descriptions for the enums. Each position maps to the corresponding value in the "enum"
   * array.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> enumDescriptions;

  /**
   * The name of the protobuf that maps to this template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalTypeName;

  /**
   * An additional regular expression or key that helps constrain the value. For more details see:
   * http://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.23
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String format;

  /**
   * Unique identifier for this schema.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * If this is a schema for an array, this property is the schema for each element in the array.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JsonSchema items;

  /**
   * Whether this parameter goes in the query or the path for REST requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * The maximum value of this parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String maximum;

  /**
   * The minimum value of this parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minimum;

  /**
   * The regular expression this parameter must conform to. Uses Java 6 regex format:
   * http://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pattern;

  /**
   * If this is a schema for an object, list the schema for each property of this object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, JsonSchema> properties;

  /**
   * The value is read-only, generated by the service. The value cannot be modified by the client.
   * If the value is included in a POST, PUT, or PATCH request, it is ignored by the service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean readOnly;

  /**
   * Whether this parameter may appear multiple times.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean repeated;

  /**
   * Whether the parameter is required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean required;

  /**
   * The value type for this schema. A list of values can be found here: http://tools.ietf.org/html
   * /draft-zyp-json-schema-03#section-5.1
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * In a variant data type, the value of one property is used to determine how to interpret the
   * entire entity. Its value must exist in a map of descriminant values to schema names.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Variant variant;

  /**
   * A reference to another schema. The value of this property is the "id" of another schema.
   * @return value or {@code null} for none
   */
  public java.lang.String get$ref() {
    return $ref;
  }

  /**
   * A reference to another schema. The value of this property is the "id" of another schema.
   * @param $ref $ref or {@code null} for none
   */
  public JsonSchema set$ref(java.lang.String $ref) {
    this.$ref = $ref;
    return this;
  }

  /**
   * If this is a schema for an object, this property is the schema for any additional properties
   * with dynamic keys on this object.
   * @return value or {@code null} for none
   */
  public JsonSchema getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * If this is a schema for an object, this property is the schema for any additional properties
   * with dynamic keys on this object.
   * @param additionalProperties additionalProperties or {@code null} for none
   */
  public JsonSchema setAdditionalProperties(JsonSchema additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  /**
   * Additional information about this property.
   * @return value or {@code null} for none
   */
  public Annotations getAnnotations() {
    return annotations;
  }

  /**
   * Additional information about this property.
   * @param annotations annotations or {@code null} for none
   */
  public JsonSchema setAnnotations(Annotations annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * The default value of this property (if one exists).
   * @return value or {@code null} for none
   */
  public java.lang.String getDefault() {
    return default__;
  }

  /**
   * The default value of this property (if one exists).
   * @param default__ default__ or {@code null} for none
   */
  public JsonSchema setDefault(java.lang.String default__) {
    this.default__ = default__;
    return this;
  }

  /**
   * A description of this object.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A description of this object.
   * @param description description or {@code null} for none
   */
  public JsonSchema setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Values this parameter may take (if it is an enum).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEnum() {
    return enum__;
  }

  /**
   * Values this parameter may take (if it is an enum).
   * @param enum__ enum__ or {@code null} for none
   */
  public JsonSchema setEnum(java.util.List<java.lang.String> enum__) {
    this.enum__ = enum__;
    return this;
  }

  /**
   * The descriptions for the enums. Each position maps to the corresponding value in the "enum"
   * array.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEnumDescriptions() {
    return enumDescriptions;
  }

  /**
   * The descriptions for the enums. Each position maps to the corresponding value in the "enum"
   * array.
   * @param enumDescriptions enumDescriptions or {@code null} for none
   */
  public JsonSchema setEnumDescriptions(java.util.List<java.lang.String> enumDescriptions) {
    this.enumDescriptions = enumDescriptions;
    return this;
  }

  /**
   * The name of the protobuf that maps to this template.
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalTypeName() {
    return externalTypeName;
  }

  /**
   * The name of the protobuf that maps to this template.
   * @param externalTypeName externalTypeName or {@code null} for none
   */
  public JsonSchema setExternalTypeName(java.lang.String externalTypeName) {
    this.externalTypeName = externalTypeName;
    return this;
  }

  /**
   * An additional regular expression or key that helps constrain the value. For more details see:
   * http://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.23
   * @return value or {@code null} for none
   */
  public java.lang.String getFormat() {
    return format;
  }

  /**
   * An additional regular expression or key that helps constrain the value. For more details see:
   * http://tools.ietf.org/html/draft-zyp-json-schema-03#section-5.23
   * @param format format or {@code null} for none
   */
  public JsonSchema setFormat(java.lang.String format) {
    this.format = format;
    return this;
  }

  /**
   * Unique identifier for this schema.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Unique identifier for this schema.
   * @param id id or {@code null} for none
   */
  public JsonSchema setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * If this is a schema for an array, this property is the schema for each element in the array.
   * @return value or {@code null} for none
   */
  public JsonSchema getItems() {
    return items;
  }

  /**
   * If this is a schema for an array, this property is the schema for each element in the array.
   * @param items items or {@code null} for none
   */
  public JsonSchema setItems(JsonSchema items) {
    this.items = items;
    return this;
  }

  /**
   * Whether this parameter goes in the query or the path for REST requests.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Whether this parameter goes in the query or the path for REST requests.
   * @param location location or {@code null} for none
   */
  public JsonSchema setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * The maximum value of this parameter.
   * @return value or {@code null} for none
   */
  public java.lang.String getMaximum() {
    return maximum;
  }

  /**
   * The maximum value of this parameter.
   * @param maximum maximum or {@code null} for none
   */
  public JsonSchema setMaximum(java.lang.String maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * The minimum value of this parameter.
   * @return value or {@code null} for none
   */
  public java.lang.String getMinimum() {
    return minimum;
  }

  /**
   * The minimum value of this parameter.
   * @param minimum minimum or {@code null} for none
   */
  public JsonSchema setMinimum(java.lang.String minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * The regular expression this parameter must conform to. Uses Java 6 regex format:
   * http://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html
   * @return value or {@code null} for none
   */
  public java.lang.String getPattern() {
    return pattern;
  }

  /**
   * The regular expression this parameter must conform to. Uses Java 6 regex format:
   * http://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html
   * @param pattern pattern or {@code null} for none
   */
  public JsonSchema setPattern(java.lang.String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * If this is a schema for an object, list the schema for each property of this object.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, JsonSchema> getProperties() {
    return properties;
  }

  /**
   * If this is a schema for an object, list the schema for each property of this object.
   * @param properties properties or {@code null} for none
   */
  public JsonSchema setProperties(java.util.Map<String, JsonSchema> properties) {
    this.properties = properties;
    return this;
  }

  /**
   * The value is read-only, generated by the service. The value cannot be modified by the client.
   * If the value is included in a POST, PUT, or PATCH request, it is ignored by the service.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReadOnly() {
    return readOnly;
  }

  /**
   * The value is read-only, generated by the service. The value cannot be modified by the client.
   * If the value is included in a POST, PUT, or PATCH request, it is ignored by the service.
   * @param readOnly readOnly or {@code null} for none
   */
  public JsonSchema setReadOnly(java.lang.Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * Whether this parameter may appear multiple times.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRepeated() {
    return repeated;
  }

  /**
   * Whether this parameter may appear multiple times.
   * @param repeated repeated or {@code null} for none
   */
  public JsonSchema setRepeated(java.lang.Boolean repeated) {
    this.repeated = repeated;
    return this;
  }

  /**
   * Whether the parameter is required.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRequired() {
    return required;
  }

  /**
   * Whether the parameter is required.
   * @param required required or {@code null} for none
   */
  public JsonSchema setRequired(java.lang.Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * The value type for this schema. A list of values can be found here: http://tools.ietf.org/html
   * /draft-zyp-json-schema-03#section-5.1
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The value type for this schema. A list of values can be found here: http://tools.ietf.org/html
   * /draft-zyp-json-schema-03#section-5.1
   * @param type type or {@code null} for none
   */
  public JsonSchema setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * In a variant data type, the value of one property is used to determine how to interpret the
   * entire entity. Its value must exist in a map of descriminant values to schema names.
   * @return value or {@code null} for none
   */
  public Variant getVariant() {
    return variant;
  }

  /**
   * In a variant data type, the value of one property is used to determine how to interpret the
   * entire entity. Its value must exist in a map of descriminant values to schema names.
   * @param variant variant or {@code null} for none
   */
  public JsonSchema setVariant(Variant variant) {
    this.variant = variant;
    return this;
  }

  @Override
  public JsonSchema set(String fieldName, Object value) {
    return (JsonSchema) super.set(fieldName, value);
  }

  @Override
  public JsonSchema clone() {
    return (JsonSchema) super.clone();
  }

  /**
   * Additional information about this property.
   */
  public static final class Annotations extends com.google.api.client.json.GenericJson {

    /**
     * A list of methods for which this property is required on requests.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> required;

    /**
     * A list of methods for which this property is required on requests.
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getRequired() {
      return required;
    }

    /**
     * A list of methods for which this property is required on requests.
     * @param required required or {@code null} for none
     */
    public Annotations setRequired(java.util.List<java.lang.String> required) {
      this.required = required;
      return this;
    }

    @Override
    public Annotations set(String fieldName, Object value) {
      return (Annotations) super.set(fieldName, value);
    }

    @Override
    public Annotations clone() {
      return (Annotations) super.clone();
    }

  }

  /**
   * In a variant data type, the value of one property is used to determine how to interpret the
   * entire entity. Its value must exist in a map of descriminant values to schema names.
   */
  public static final class Variant extends com.google.api.client.json.GenericJson {

    /**
     * The name of the type discriminant property.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String discriminant;

    /**
     * The map of discriminant value to schema to use for parsing..
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Map> map;

    static {
      // hack to force ProGuard to consider Map used, since otherwise it would be stripped out
      // see http://code.google.com/p/google-api-java-client/issues/detail?id=528
      com.google.api.client.util.Data.nullOf(Map.class);
    }

    /**
     * The name of the type discriminant property.
     * @return value or {@code null} for none
     */
    public java.lang.String getDiscriminant() {
      return discriminant;
    }

    /**
     * The name of the type discriminant property.
     * @param discriminant discriminant or {@code null} for none
     */
    public Variant setDiscriminant(java.lang.String discriminant) {
      this.discriminant = discriminant;
      return this;
    }

    /**
     * The map of discriminant value to schema to use for parsing..
     * @return value or {@code null} for none
     */
    public java.util.List<Map> getMap() {
      return map;
    }

    /**
     * The map of discriminant value to schema to use for parsing..
     * @param map map or {@code null} for none
     */
    public Variant setMap(java.util.List<Map> map) {
      this.map = map;
      return this;
    }

    @Override
    public Variant set(String fieldName, Object value) {
      return (Variant) super.set(fieldName, value);
    }

    @Override
    public Variant clone() {
      return (Variant) super.clone();
    }

    /**
     * Model definition for JsonSchemaVariantMap.
     */
    public static final class Map extends com.google.api.client.json.GenericJson {

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String $ref;

      /**
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key("type_value")
      private java.lang.String typeValue;

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String get$ref() {
        return $ref;
      }

      /**
       * @param $ref $ref or {@code null} for none
       */
      public Map set$ref(java.lang.String $ref) {
        this.$ref = $ref;
        return this;
      }

      /**
       * @return value or {@code null} for none
       */
      public java.lang.String getTypeValue() {
        return typeValue;
      }

      /**
       * @param typeValue typeValue or {@code null} for none
       */
      public Map setTypeValue(java.lang.String typeValue) {
        this.typeValue = typeValue;
        return this;
      }

      @Override
      public Map set(String fieldName, Object value) {
        return (Map) super.set(fieldName, value);
      }

      @Override
      public Map clone() {
        return (Map) super.clone();
      }

    }
  }
}
