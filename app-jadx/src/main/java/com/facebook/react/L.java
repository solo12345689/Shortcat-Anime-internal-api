package com.facebook.react;

import android.content.Context;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import com.facebook.react.soloader.OpenSourceMergedSoMapping;
import com.facebook.react.views.view.WindowUtilKt;
import com.facebook.soloader.SoLoader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class L {
    public static void a(Context context) {
        try {
            SoLoader.l(context, OpenSourceMergedSoMapping.f37352a);
            DefaultNewArchitectureEntryPoint.load();
            WindowUtilKt.setEdgeToEdgeFeatureFlagOn();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
