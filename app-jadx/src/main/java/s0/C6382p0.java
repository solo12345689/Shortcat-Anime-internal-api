package s0;

import android.graphics.Canvas;

/* JADX INFO: renamed from: s0.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C6382p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6382p0 f58975a = new C6382p0();

    private C6382p0() {
    }

    public final void a(Canvas canvas, boolean z10) {
        if (z10) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
