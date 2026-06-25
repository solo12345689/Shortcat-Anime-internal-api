package a0;

import Ud.AbstractC2273n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import oe.AbstractC5874j;
import oe.C5870f;
import t.C6546L;
import t.C6550P;
import t.W;

/* JADX INFO: renamed from: a0.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2506b {

    /* JADX INFO: renamed from: a */
    private final C6550P f23494a;

    private /* synthetic */ C2506b(C6550P c6550p) {
        this.f23494a = c6550p;
    }

    public static final void a(C6550P c6550p, Object obj, Object obj2) {
        int iN = c6550p.n(obj);
        boolean z10 = iN < 0;
        Object obj3 = z10 ? null : c6550p.f60045c[iN];
        V.l(obj3);
        if (obj3 != null) {
            if (obj3 instanceof C6546L) {
                AbstractC5504s.f(obj3, "null cannot be cast to non-null type androidx.collection.MutableObjectList<kotlin.Any>");
                C6546L c6546l = (C6546L) obj3;
                c6546l.k(obj2);
                obj2 = c6546l;
            } else {
                obj2 = W.d(obj3, obj2);
            }
        }
        if (!z10) {
            c6550p.f60045c[iN] = obj2;
            return;
        }
        int i10 = ~iN;
        c6550p.f60044b[i10] = obj;
        c6550p.f60045c[i10] = obj2;
    }

    public static final /* synthetic */ C2506b b(C6550P c6550p) {
        return new C2506b(c6550p);
    }

    public static final void c(C6550P c6550p) {
        c6550p.k();
    }

    public static /* synthetic */ C6550P e(C6550P c6550p, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            c6550p = new C6550P(0, 1, null);
        }
        return d(c6550p);
    }

    public static final boolean f(C6550P c6550p, Object obj) {
        return c6550p.b(obj);
    }

    public static boolean g(C6550P c6550p, Object obj) {
        return (obj instanceof C2506b) && AbstractC5504s.c(c6550p, ((C2506b) obj).o());
    }

    public static int h(C6550P c6550p) {
        return c6550p.hashCode();
    }

    public static final boolean i(C6550P c6550p) {
        return c6550p.h();
    }

    public static final boolean j(C6550P c6550p) {
        return c6550p.i();
    }

    public static final Object k(C6550P c6550p, Object obj) {
        Object objE = c6550p.e(obj);
        if (objE == null) {
            return null;
        }
        if (!(objE instanceof C6546L)) {
            c6550p.u(obj);
            return objE;
        }
        C6546L c6546l = (C6546L) objE;
        Object objR = c6546l.r(0);
        if (c6546l.f()) {
            c6550p.u(obj);
        }
        if (c6546l.d() == 1) {
            c6550p.x(obj, c6546l.b());
        }
        return objR;
    }

    public static final Object l(C6550P c6550p, Object obj) {
        Object objE = c6550p.e(obj);
        if (objE == null) {
            return null;
        }
        if (!(objE instanceof C6546L)) {
            c6550p.u(obj);
            return objE;
        }
        C6546L c6546l = (C6546L) objE;
        Object objA = AbstractC2505a.a(c6546l);
        AbstractC5504s.f(objA, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (c6546l.f()) {
            c6550p.u(obj);
        }
        if (c6546l.d() == 1) {
            c6550p.x(obj, c6546l.b());
        }
        return objA;
    }

    public static final void m(C6550P c6550p, Object obj, Function1 function1) {
        Object objE = c6550p.e(obj);
        if (objE != null) {
            if (!(objE instanceof C6546L)) {
                if (((Boolean) function1.invoke(objE)).booleanValue()) {
                    c6550p.u(obj);
                    return;
                }
                return;
            }
            C6546L c6546l = (C6546L) objE;
            int i10 = c6546l.f60007b;
            Object[] objArr = c6546l.f60006a;
            int i11 = 0;
            C5870f c5870fX = AbstractC5874j.x(0, i10);
            int iF = c5870fX.f();
            int i12 = c5870fX.i();
            if (iF <= i12) {
                while (true) {
                    objArr[iF - i11] = objArr[iF];
                    if (((Boolean) function1.invoke(objArr[iF])).booleanValue()) {
                        i11++;
                    }
                    if (iF == i12) {
                        break;
                    } else {
                        iF++;
                    }
                }
            }
            AbstractC2273n.w(objArr, null, i10 - i11, i10);
            c6546l.f60007b -= i11;
            if (c6546l.f()) {
                c6550p.u(obj);
            }
            if (c6546l.d() == 0) {
                c6550p.x(obj, c6546l.b());
            }
        }
    }

    public static String n(C6550P c6550p) {
        return "MultiValueMap(map=" + c6550p + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final t.V p(t.C6550P r14) {
        /*
            boolean r0 = r14.h()
            if (r0 == 0) goto Lb
            t.V r14 = t.W.b()
            return r14
        Lb:
            t.L r0 = new t.L
            r1 = 0
            r2 = 0
            r3 = 1
            r0.<init>(r2, r3, r1)
            java.lang.Object[] r1 = r14.f60045c
            long[] r14 = r14.f60043a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L69
            r4 = r2
        L1d:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L64
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L37:
            if (r9 >= r7) goto L62
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L5e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof t.C6546L
            if (r11 == 0) goto L56
            java.lang.String r11 = "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>"
            kotlin.jvm.internal.AbstractC5504s.f(r10, r11)
            t.L r10 = (t.C6546L) r10
            r0.m(r10)
            goto L5e
        L56:
            java.lang.String r11 = "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap"
            kotlin.jvm.internal.AbstractC5504s.f(r10, r11)
            r0.k(r10)
        L5e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L37
        L62:
            if (r7 != r8) goto L69
        L64:
            if (r4 == r3) goto L69
            int r4 = r4 + 1
            goto L1d
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C2506b.p(t.P):t.V");
    }

    public boolean equals(Object obj) {
        return g(this.f23494a, obj);
    }

    public int hashCode() {
        return h(this.f23494a);
    }

    public final /* synthetic */ C6550P o() {
        return this.f23494a;
    }

    public String toString() {
        return n(this.f23494a);
    }

    public static C6550P d(C6550P c6550p) {
        return c6550p;
    }
}
