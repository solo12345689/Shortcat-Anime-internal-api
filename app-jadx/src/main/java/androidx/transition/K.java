package androidx.transition;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class K extends I {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f32330f = true;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static void a(View view, int i10, int i11, int i12, int i13) {
            view.setLeftTopRightBottom(i10, i11, i12, i13);
        }
    }

    K() {
    }

    @Override // androidx.transition.F
    public void d(View view, int i10, int i11, int i12, int i13) {
        if (f32330f) {
            try {
                a.a(view, i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f32330f = false;
            }
        }
    }
}
