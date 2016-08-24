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
 * Model definition for ApiConfigs.
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
public final class ApiConfigs extends com.google.api.client.json.GenericJson {

  /**
   * The list of API configs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> configs;

  /**
   * The list of API configs.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getConfigs() {
    return configs;
  }

  /**
   * The list of API configs.
   * @param configs configs or {@code null} for none
   */
  public ApiConfigs setConfigs(java.util.List<java.lang.String> configs) {
    this.configs = configs;
    return this;
  }

  @Override
  public ApiConfigs set(String fieldName, Object value) {
    return (ApiConfigs) super.set(fieldName, value);
  }

  @Override
  public ApiConfigs clone() {
    return (ApiConfigs) super.clone();
  }

}
