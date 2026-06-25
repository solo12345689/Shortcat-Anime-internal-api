package androidx.compose.ui.platform;

import android.view.MotionEvent;

/* JADX INFO: renamed from: androidx.compose.ui.platform.b1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2685b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2685b1 f27416a = new C2685b1();

    private C2685b1() {
    }

    public final boolean a(MotionEvent motionEvent, int i10) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i10)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i10)) & Integer.MAX_VALUE) < 2139095040;
    }
}
