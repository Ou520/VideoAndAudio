package com.example.textthread.util;

import android.view.View;
import android.view.ViewGroup;

/**
 * Author： fanyafeng
 * Data： 16/8/18 15:28
 * Email: fanyafeng@live.cn
 */
public class FitScreenUtil {
    /**
     * 通过长宽比去适应不同尺寸的手机
     *
     * @param view
     * @param width
     * @param height
     */
    public static void FixScreenXY(View view, int width, int height) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = width;
                layoutParams.height = height;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public static void FixScreenX(View view, int width) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = width;
                view.setLayoutParams(layoutParams);
            }
        }
    }
}
