package t;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.AbstractC5504s;
import u.AbstractC6702a;

/* JADX INFO: renamed from: t.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6554d {
    public static final void a(C6552b c6552b, int i10) {
        AbstractC5504s.h(c6552b, "<this>");
        c6552b.p(new int[i10]);
        c6552b.n(new Object[i10]);
    }

    public static final int b(C6552b c6552b, int i10) {
        AbstractC5504s.h(c6552b, "<this>");
        try {
            return AbstractC6702a.a(c6552b.e(), c6552b.i(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int c(C6552b c6552b, Object obj, int i10) {
        AbstractC5504s.h(c6552b, "<this>");
        int i11 = c6552b.i();
        if (i11 == 0) {
            return -1;
        }
        int iB = b(c6552b, i10);
        if (iB < 0 || AbstractC5504s.c(obj, c6552b.d()[iB])) {
            return iB;
        }
        int i12 = iB + 1;
        while (i12 < i11 && c6552b.e()[i12] == i10) {
            if (AbstractC5504s.c(obj, c6552b.d()[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iB - 1; i13 >= 0 && c6552b.e()[i13] == i10; i13--) {
            if (AbstractC5504s.c(obj, c6552b.d()[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    public static final int d(C6552b c6552b) {
        AbstractC5504s.h(c6552b, "<this>");
        return c(c6552b, null, 0);
    }
}
