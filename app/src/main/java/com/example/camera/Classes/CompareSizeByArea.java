package com.example.camera.Classes;

import android.util.Size;

import java.util.Comparator;

/// Compares the sizes from left hand side and right side hand
public class CompareSizeByArea implements Comparator<Size> {

    @Override
    public int compare(Size lhs, Size rhs) {
        return Long.signum((long) lhs.getWidth() * lhs.getHeight() /
                (long) rhs.getWidth() * rhs.getHeight());
    }
}