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

package com.instructure.canvasapi2.builders

import android.os.Parcelable
import com.instructure.canvasapi2.models.CanvasContext
import kotlinx.android.parcel.Parcelize


@Parcelize
data class RestParams(
    val canvasContext: CanvasContext? = null,
    val domain: String? = null,
    val apiVersion: String? = "/api/v1/",
    val usePerPageQueryParam: Boolean = false,
    val shouldIgnoreToken: Boolean = false,
    val isForceReadFromCache: Boolean = false,
    val isForceReadFromNetwork: Boolean = false,
    val acceptLanguageOverride: String? = null,
    // TODO For testing purposes, we won't need this
    val perPageCount: Int = 100
) : Parcelable
