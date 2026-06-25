package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: androidx.compose.ui.platform.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2728q0 implements InterfaceC2720n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matrix f27490a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f27491b = new int[2];

    @Override // androidx.compose.ui.platform.InterfaceC2720n0
    public void a(View view, float[] fArr) {
        this.f27490a.reset();
        view.transformMatrixToGlobal(this.f27490a);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.f27491b);
        int[] iArr = this.f27491b;
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f27491b;
        this.f27490a.postTranslate(iArr2[0] - i10, iArr2[1] - i11);
        s0.P.b(fArr, this.f27490a);
    }
}
