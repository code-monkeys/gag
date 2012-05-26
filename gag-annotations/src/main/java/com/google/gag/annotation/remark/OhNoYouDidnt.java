/**
 * Copyright 2010 Google Inc.
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

package com.google.gag.annotation.remark;

import com.google.gag.annotation.team.Visionary;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Indicates that the individual implementing the annotated code shouldn't
 * have. For example:
 * <p/>
 * <pre>
 *   &#064;OhNoYouDidnt(fingerSnapCount = 2)
 *   public void sortInLinearTime(List&lt;?&gt; list) {
 * </pre>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Visionary("billrobertson42")
public @interface OhNoYouDidnt {
    int fingerSnapCount() default 3;
}
