/*
 * Copyright (C) 2017 - present Instructure, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.instructure.canvasapi2.models

import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Author(
    override val id: Long = 0,
    @SerializedName("display_name")
    var displayName: String? = null,
    @SerializedName("avatar_image_url")
    var avatarImageUrl: String? = null,
    @SerializedName("html_url")
    var htmlUrl: String? = null,
    val pronouns: String? = null
) : CanvasModel<Author>() {

    override val comparisonString get() = displayName
}
