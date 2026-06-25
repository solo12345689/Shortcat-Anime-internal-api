package androidx.activity;

import android.view.Window;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class A extends z {
    @Override // androidx.activity.w, androidx.activity.B, androidx.activity.C
    public void a(Window window) {
        AbstractC5504s.h(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 3;
    }
}
