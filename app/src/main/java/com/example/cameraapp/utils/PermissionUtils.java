package com.example.cameraapp.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;

public class PermissionUtils {

    public static boolean hasPermissionsGranted(Context context, String[] permissions) {
        for (String permission : permissions) {
            if (ActivityCompat.checkSelfPermission(context, permission)
                    != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

    /**
     * Requests permissions needed for recording video.
     */
    public static void requestVideoPermissions(Activity activity, int requestCode, String... permissions) {
        ActivityCompat.requestPermissions(activity, permissions, requestCode);
    }

    /**
     * Requests permissions needed for recording video.
     */
    public static void requestVideoPermissions(Fragment fragment, int requestCode, String... permissions) {
        fragment.requestPermissions(permissions, requestCode);
    }
}
