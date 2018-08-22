/*
 * Copyright 2018 Google LLC. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.cloud.tools.jib.ncache.json;

import com.google.cloud.tools.jib.json.JsonTemplate;
import java.util.List;
import javax.annotation.Nullable;

/** Represents a pair of source files and extraction path. */
public class LayerEntryTemplate implements JsonTemplate {

  /** The paths to the source files that the layer was constructed from. */
  @Nullable private List<String> sourceFiles;

  /** The intended path to extract the source files to in the container. */
  @Nullable private String extractionPath;

  @Nullable
  public List<String> getSourceFiles() {
    return sourceFiles;
  }

  @Nullable
  public String getExtractionPath() {
    return extractionPath;
  }

  public LayerEntryTemplate(List<String> sourceFiles, String extractionPath) {
    this.sourceFiles = sourceFiles;
    this.extractionPath = extractionPath;
  }

  public LayerEntryTemplate() {}
}
