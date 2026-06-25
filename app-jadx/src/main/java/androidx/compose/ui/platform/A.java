package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewStructure;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f27024a = new A();

    private A() {
    }

    public final void a(ViewStructure viewStructure, View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
