package androidx.compose.ui.viewinterop;

import I0.AbstractC1691q;
import K0.J;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f27717a = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements D0.a {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(View view, J j10) {
        long jE = AbstractC1691q.e(j10.x());
        int iRound = Math.round(Float.intBitsToFloat((int) (jE >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jE & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(int i10) {
        return i10 * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(float f10) {
        return f10 * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(int i10) {
        return i10 == 0 ? D0.e.f3532a.b() : D0.e.f3532a.a();
    }
}
