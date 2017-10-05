/*
 * Copyright 2017-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.android;

import com.facebook.buck.android.apkmodule.APKModule;
import com.facebook.buck.rules.AddToRuleKey;
import com.facebook.buck.rules.AddsToRuleKey;
import com.facebook.buck.rules.SourcePath;
import com.google.common.collect.ImmutableSortedMap;
import java.util.Optional;

public class NativeFilesInfo implements AddsToRuleKey {
  @AddToRuleKey Optional<ImmutableSortedMap<APKModule, SourcePath>> nativeLibsDirs;
  @AddToRuleKey Optional<ImmutableSortedMap<APKModule, SourcePath>> nativeLibsAssetsDirs;

  public NativeFilesInfo(
      Optional<ImmutableSortedMap<APKModule, SourcePath>> nativeLibsDirs,
      Optional<ImmutableSortedMap<APKModule, SourcePath>> nativeLibsAssetsDirs) {
    this.nativeLibsDirs = nativeLibsDirs;
    this.nativeLibsAssetsDirs = nativeLibsAssetsDirs;
  }
}