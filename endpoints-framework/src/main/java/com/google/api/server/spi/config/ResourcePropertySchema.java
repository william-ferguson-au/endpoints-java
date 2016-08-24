/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.api.server.spi.config;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

import java.lang.reflect.Type;
import java.util.Objects;

/**
 * A schema definition for an individual property on a resource.
 *
 * @see ResourceSchema
 */
public class ResourcePropertySchema {

  private final Type javaType;

  private ResourcePropertySchema(Type javaType) {
    this.javaType = javaType;
  }

  /**
   * Gets the type of the property. This is used to determine how it should be serialized, as well
   * as what it's type and format should be in the schema.
   *
   * @return the property's type
   */
  public Type getJavaType() {
    return javaType;
  }

  /**
   * Returns a default resource property schema for a given type.
   *
   * @param javaType the property type
   * @return a default schema for this type
   */
  public static ResourcePropertySchema of(Type javaType) {
    return new ResourcePropertySchema(Preconditions.checkNotNull(javaType));
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof ResourcePropertySchema)) {
      return false;
    }
    ResourcePropertySchema that = (ResourcePropertySchema) obj;
    return Objects.equals(this.javaType, that.javaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(javaType);
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this.getClass())
        .add("type", javaType)
        .toString();
  }
}
