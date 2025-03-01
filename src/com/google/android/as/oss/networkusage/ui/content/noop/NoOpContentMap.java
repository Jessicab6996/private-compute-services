/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.as.oss.networkusage.ui.content.noop;

import com.google.android.as.oss.networkusage.db.ConnectionDetails;
import com.google.android.as.oss.networkusage.ui.content.NetworkUsageLogContentMap;
import java.util.Optional;
import javax.inject.Inject;
import javax.inject.Singleton;

/** No-op implementation of the {@link NetworkUsageLogContentMap}. */
@Singleton
public class NoOpContentMap implements NetworkUsageLogContentMap {

  @Inject
  NoOpContentMap() {}

  @Override
  public Optional<ConnectionDetails> getHttpConnectionDetails(String url) {
    return Optional.empty();
  }

  @Override
  public Optional<ConnectionDetails> getAttestationConnectionDetails(String featureName) {
    return Optional.empty();
  }

  @Override
  public Optional<ConnectionDetails> getSurveyConnectionDetails(String url) {
    return Optional.empty();
  }

  @Override
  public Optional<ConnectionDetails> getPirConnectionDetails(String url) {
    return Optional.empty();
  }

  @Override
  public Optional<ConnectionDetails> getPdConnectionDetails(String clientId) {
    return Optional.empty();
  }

  @Override
  public Optional<ConnectionDetails> getFcStartQueryConnectionDetails(String featureName) {
    return Optional.empty();
  }

  @Override
  public Optional<String> getFeatureName(ConnectionDetails connectionDetails) {
    return Optional.empty();
  }

  @Override
  public Optional<String> getDescription(ConnectionDetails connectionDetails) {
    return Optional.empty();
  }

  @Override
  public String getMechanismName(ConnectionDetails connectionDetails) {
    return "";
  }
}
