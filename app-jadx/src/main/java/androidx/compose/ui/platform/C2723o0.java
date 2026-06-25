package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C6356g1;

/* JADX INFO: renamed from: androidx.compose.ui.platform.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2723o0 implements InterfaceC2720n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f27486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f27487b;

    public /* synthetic */ C2723o0(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    private final void b(float[] fArr, Matrix matrix) {
        s0.P.b(this.f27486a, matrix);
        N.i(fArr, this.f27486a);
    }

    private final void c(float[] fArr, float f10, float f11) {
        N.j(fArr, f10, f11, this.f27486a);
    }

    private final void d(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            d((View) parent, fArr);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.f27487b);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, r0[0], r0[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        b(fArr, matrix);
    }

    @Override // androidx.compose.ui.platform.InterfaceC2720n0
    public void a(View view, float[] fArr) {
        C6356g1.h(fArr);
        d(view, fArr);
    }

    private C2723o0(float[] fArr) {
        this.f27486a = fArr;
        this.f27487b = new int[2];
    }
}
