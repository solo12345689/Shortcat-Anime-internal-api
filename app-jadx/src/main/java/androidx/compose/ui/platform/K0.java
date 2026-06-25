package androidx.compose.ui.platform;

import Ud.AbstractC2273n;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC5504s;
import t.C6546L;
import t.C6550P;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class K0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f27248c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K0 f27246a = new K0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C6546L f27247b = new C6546L(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f27249d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C6550P f27250e = t.d0.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Comparator f27251f = new Comparator() { // from class: androidx.compose.ui.platform.I0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return K0.e((View) obj, (View) obj2);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Comparator f27252g = new Comparator() { // from class: androidx.compose.ui.platform.J0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return K0.c((View) obj, (View) obj2);
        }
    };

    private K0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(View view, View view2) {
        if (view == view2) {
            return 0;
        }
        C6550P c6550p = f27250e;
        Object objE = c6550p.e(view);
        AbstractC5504s.e(objE);
        Rect rect = (Rect) objE;
        Object objE2 = c6550p.e(view2);
        AbstractC5504s.e(objE2);
        Rect rect2 = (Rect) objE2;
        int i10 = rect.left - rect2.left;
        return i10 == 0 ? (rect.right - rect2.right) * f27249d : i10 * f27249d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(View view, View view2) {
        if (view == view2) {
            return 0;
        }
        C6550P c6550p = f27250e;
        Object objE = c6550p.e(view);
        AbstractC5504s.e(objE);
        Rect rect = (Rect) objE;
        Object objE2 = c6550p.e(view2);
        AbstractC5504s.e(objE2);
        Rect rect2 = (Rect) objE2;
        int i10 = rect.top - rect2.top;
        return i10 == 0 ? rect.bottom - rect2.bottom : i10;
    }

    public final void d(View[] viewArr, ViewGroup viewGroup, boolean z10) {
        int length = viewArr.length;
        if (length < 2) {
            return;
        }
        int iD = length - f27247b.d();
        for (int i10 = 0; i10 < iD; i10++) {
            f27247b.k(new Rect());
        }
        for (View view : viewArr) {
            C6546L c6546l = f27247b;
            int i11 = f27248c;
            f27248c = i11 + 1;
            Rect rect = (Rect) c6546l.c(i11);
            view.getDrawingRect(rect);
            viewGroup.offsetDescendantRectToMyCoords(view, rect);
            f27250e.x(view, rect);
        }
        AbstractC2273n.I(viewArr, f27251f);
        Object objE = f27250e.e(viewArr[0]);
        AbstractC5504s.e(objE);
        int iMax = ((Rect) objE).bottom;
        f27249d = z10 ? -1 : 1;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            Object objE2 = f27250e.e(viewArr[i13]);
            AbstractC5504s.e(objE2);
            Rect rect2 = (Rect) objE2;
            if (rect2.top >= iMax) {
                if (i13 - i12 > 1) {
                    AbstractC2273n.J(viewArr, f27252g, i12, i13);
                }
                iMax = rect2.bottom;
                i12 = i13;
            } else {
                iMax = Math.max(iMax, rect2.bottom);
            }
        }
        if (length - i12 > 1) {
            AbstractC2273n.J(viewArr, f27252g, i12, length);
        }
        f27248c = 0;
        f27250e.k();
    }
}
