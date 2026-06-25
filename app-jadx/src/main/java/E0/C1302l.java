package E0;

import android.view.MotionEvent;
import r0.C6224f;

/* JADX INFO: renamed from: E0.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1302l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1302l f4161a = new C1302l();

    private C1302l() {
    }

    public final long a(MotionEvent motionEvent, int i10) {
        float rawX = motionEvent.getRawX(i10);
        return C6224f.e((((long) Float.floatToRawIntBits(motionEvent.getRawY(i10))) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32));
    }
}
