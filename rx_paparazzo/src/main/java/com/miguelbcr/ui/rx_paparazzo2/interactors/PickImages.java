/*
 * Copyright 2016 Miguel Garcia
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

package com.miguelbcr.ui.rx_paparazzo2.interactors;

import com.miguelbcr.ui.rx_paparazzo2.entities.Config;

public final class PickImages extends PickFiles {

  public static final String IMAGE_MIME_TYPE = "image/*";

  public PickImages(Config config, StartIntent startIntent) {
    super(config, startIntent);
  }

  public String getDefaultMimeType() {
    return IMAGE_MIME_TYPE;
  }

}
