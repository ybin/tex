/*
 * Copyright (C) 2009 The Android Open Source Project
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

package zte.com.cn.camera;

import com.intel.camera.extensions.IntelCamera;

import zte.com.cn.camera.adapter.AdapterFeatures;
import zte.com.cn.camera.ui.PopupManager;
import zte.com.cn.camera.util.CameraLog;
import zte.com.cn.camera.util.Util;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.KeyEvent;

/**
 * Superclass of Camera and VideoCamera activities.
 */
abstract public class ActivityBase extends Activity {
    private static final String TAG = "ActivityBase";
    private int mResultCodeForTesting;
    private boolean mOnResumePending;
    private Intent mResultDataForTesting;
    protected IntelCamera mCameraDevice;
  
    @Override
    public void onCreate(Bundle icicle) {
        if (Util.isTabletUI()) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        } else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
        super.onCreate(icicle);
    }
}