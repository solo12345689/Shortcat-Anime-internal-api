package androidx.transition;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class M extends K {

    /* JADX INFO: renamed from: g */
    private static boolean f32331g = true;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static void a(View view, int i10) {
            view.setTransitionVisibility(i10);
        }
    }

    M() {
    }

    @Override // androidx.transition.F
    public void f(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i10);
        } else if (f32331g) {
            try {
                a.a(view, i10);
            } catch (NoSuchMethodError unused) {
                f32331g = false;
            }
        }
    }
}
