package Y;

import kotlin.jvm.internal.DefaultConstructorMarker;
import t.C6539E;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Y0 {
    public static final void a(C6539E c6539e, int i10) {
        if (c6539e.f60103b == 0 || !(c6539e.b(0) == i10 || c6539e.b(c6539e.f60103b - 1) == i10)) {
            int i11 = c6539e.f60103b;
            c6539e.h(i10);
            while (i11 > 0) {
                int i12 = ((i11 + 1) >>> 1) - 1;
                int iB = c6539e.b(i12);
                if (i10 <= iB) {
                    break;
                }
                c6539e.n(i11, iB);
                i11 = i12;
            }
            c6539e.n(i11, i10);
        }
    }

    public static /* synthetic */ C6539E c(C6539E c6539e, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            c6539e = new C6539E(0, 1, null);
        }
        return b(c6539e);
    }

    public static final boolean d(C6539E c6539e) {
        return c6539e.f60103b != 0;
    }

    public static final int e(C6539E c6539e) {
        return c6539e.a();
    }

    public static final int f(C6539E c6539e) {
        int iB;
        int i10 = c6539e.f60103b;
        int iB2 = c6539e.b(0);
        while (c6539e.f60103b != 0 && c6539e.b(0) == iB2) {
            c6539e.n(0, c6539e.f());
            c6539e.l(c6539e.f60103b - 1);
            int i11 = c6539e.f60103b;
            int i12 = i11 >>> 1;
            int i13 = 0;
            while (i13 < i12) {
                int iB3 = c6539e.b(i13);
                int i14 = (i13 + 1) * 2;
                int i15 = i14 - 1;
                int iB4 = c6539e.b(i15);
                if (i14 >= i11 || (iB = c6539e.b(i14)) <= iB4) {
                    if (iB4 > iB3) {
                        c6539e.n(i13, iB4);
                        c6539e.n(i15, iB3);
                        i13 = i15;
                    }
                } else if (iB > iB3) {
                    c6539e.n(i13, iB);
                    c6539e.n(i14, iB3);
                    i13 = i14;
                }
            }
        }
        return iB2;
    }

    public static C6539E b(C6539E c6539e) {
        return c6539e;
    }
}
