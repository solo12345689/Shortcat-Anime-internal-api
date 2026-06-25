package Lf;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class N {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f11557b = AtomicIntegerFieldUpdater.newUpdater(N.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private O[] f11558a;

    private final O[] g() {
        O[] oArr = this.f11558a;
        if (oArr == null) {
            O[] oArr2 = new O[4];
            this.f11558a = oArr2;
            return oArr2;
        }
        if (c() < oArr.length) {
            return oArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(oArr, c() * 2);
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        O[] oArr3 = (O[]) objArrCopyOf;
        this.f11558a = oArr3;
        return oArr3;
    }

    private final void k(int i10) {
        f11557b.set(this, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.c()
            if (r1 < r2) goto Lb
            goto L3e
        Lb:
            Lf.O[] r2 = r5.f11558a
            kotlin.jvm.internal.AbstractC5504s.e(r2)
            int r0 = r0 + 2
            int r3 = r5.c()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.AbstractC5504s.e(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.AbstractC5504s.e(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.AbstractC5504s.e(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.AbstractC5504s.e(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
        L3e:
            return
        L3f:
            r5.n(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: Lf.N.l(int):void");
    }

    private final void m(int i10) {
        while (i10 > 0) {
            O[] oArr = this.f11558a;
            AbstractC5504s.e(oArr);
            int i11 = (i10 - 1) / 2;
            O o10 = oArr[i11];
            AbstractC5504s.e(o10);
            O o11 = oArr[i10];
            AbstractC5504s.e(o11);
            if (((Comparable) o10).compareTo(o11) <= 0) {
                return;
            }
            n(i10, i11);
            i10 = i11;
        }
    }

    private final void n(int i10, int i11) {
        O[] oArr = this.f11558a;
        AbstractC5504s.e(oArr);
        O o10 = oArr[i11];
        AbstractC5504s.e(o10);
        O o11 = oArr[i10];
        AbstractC5504s.e(o11);
        oArr[i10] = o10;
        oArr[i11] = o11;
        o10.setIndex(i10);
        o11.setIndex(i11);
    }

    public final void a(O o10) {
        o10.c(this);
        O[] oArrG = g();
        int iC = c();
        k(iC + 1);
        oArrG[iC] = o10;
        o10.setIndex(iC);
        m(iC);
    }

    public final O b() {
        O[] oArr = this.f11558a;
        if (oArr != null) {
            return oArr[0];
        }
        return null;
    }

    public final int c() {
        return f11557b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    public final O f() {
        O oB;
        synchronized (this) {
            oB = b();
        }
        return oB;
    }

    public final boolean h(O o10) {
        boolean z10;
        synchronized (this) {
            if (o10.b() == null) {
                z10 = false;
            } else {
                i(o10.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Lf.O i(int r6) {
        /*
            r5 = this;
            Lf.O[] r0 = r5.f11558a
            kotlin.jvm.internal.AbstractC5504s.e(r0)
            int r1 = r5.c()
            r2 = -1
            int r1 = r1 + r2
            r5.k(r1)
            int r1 = r5.c()
            if (r6 >= r1) goto L3d
            int r1 = r5.c()
            r5.n(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            kotlin.jvm.internal.AbstractC5504s.e(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            kotlin.jvm.internal.AbstractC5504s.e(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.n(r6, r1)
            r5.m(r1)
            goto L3d
        L3a:
            r5.l(r6)
        L3d:
            int r6 = r5.c()
            r6 = r0[r6]
            kotlin.jvm.internal.AbstractC5504s.e(r6)
            r1 = 0
            r6.c(r1)
            r6.setIndex(r2)
            int r2 = r5.c()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Lf.N.i(int):Lf.O");
    }

    public final O j() {
        O oI;
        synchronized (this) {
            oI = c() > 0 ? i(0) : null;
        }
        return oI;
    }
}
