package androidx.media3.ui;

import android.graphics.Color;
import t2.a0;

/* JADX INFO: renamed from: androidx.media3.ui.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2925c {
    public static String a(String str) {
        return "." + str + ",." + str + " *";
    }

    public static String b(int i10) {
        return a0.I("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(((double) Color.alpha(i10)) / 255.0d));
    }
}
