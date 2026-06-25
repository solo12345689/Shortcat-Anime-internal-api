package c0;

import Ud.AbstractC2273n;
import Y.V0;
import f0.AbstractC4747a;
import f0.C4750d;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: renamed from: c0.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C3061f extends AbstractC3058c implements b0.e {

    /* JADX INFO: renamed from: b */
    private final Object[] f33390b;

    /* JADX INFO: renamed from: c */
    private final Object[] f33391c;

    /* JADX INFO: renamed from: d */
    private final int f33392d;

    /* JADX INFO: renamed from: e */
    private final int f33393e;

    public C3061f(Object[] objArr, Object[] objArr2, int i10, int i11) {
        this.f33390b = objArr;
        this.f33391c = objArr2;
        this.f33392d = i10;
        this.f33393e = i11;
        if (!(size() > 32)) {
            V0.a("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        AbstractC4747a.a(size() - n.d(size()) <= AbstractC5874j.i(objArr2.length, 32));
    }

    private final Object[] A(Object[] objArr, int i10, int i11, C3060e c3060e) {
        Object[] objArrCopyOf;
        int iA = n.a(i11, i10);
        if (i10 == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
            }
            AbstractC2273n.m(objArr, objArrCopyOf, iA, iA + 1, 32);
            objArrCopyOf[31] = c3060e.a();
            c3060e.b(objArr[iA]);
            return objArrCopyOf;
        }
        int iA2 = objArr[31] == null ? n.a(D() - 1, i10) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC5504s.g(objArrCopyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        int i13 = iA + 1;
        if (i13 <= iA2) {
            while (true) {
                Object obj = objArrCopyOf2[iA2];
                AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iA2] = A((Object[]) obj, i12, 0, c3060e);
                if (iA2 == i13) {
                    break;
                }
                iA2--;
            }
        }
        Object obj2 = objArrCopyOf2[iA];
        AbstractC5504s.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = A((Object[]) obj2, i12, i11, c3060e);
        return objArrCopyOf2;
    }

    private final b0.e B(Object[] objArr, int i10, int i11, int i12) {
        int size = size() - i10;
        AbstractC4747a.a(i12 < size);
        if (size == 1) {
            return w(objArr, i10, i11);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f33391c, 32);
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        int i13 = size - 1;
        if (i12 < i13) {
            AbstractC2273n.m(this.f33391c, objArrCopyOf, i12, i12 + 1, size);
        }
        objArrCopyOf[i13] = null;
        return new C3061f(objArr, objArrCopyOf, (i10 + size) - 1, i11);
    }

    private final int D() {
        return n.d(size());
    }

    private final Object[] F(Object[] objArr, int i10, int i11, Object obj) {
        int iA = n.a(i11, i10);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        if (i10 == 0) {
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iA];
        AbstractC5504s.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iA] = F((Object[]) obj2, i10 - 5, i11, obj);
        return objArrCopyOf;
    }

    private final Object[] l(int i10) {
        if (D() <= i10) {
            return this.f33391c;
        }
        Object[] objArr = this.f33390b;
        for (int i11 = this.f33393e; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[n.a(i10, i11)];
            AbstractC5504s.f(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] t(Object[] objArr, int i10, int i11, Object obj, C3060e c3060e) {
        Object[] objArrCopyOf;
        int iA = n.a(i11, i10);
        if (i10 == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
            }
            AbstractC2273n.m(objArr, objArrCopyOf, iA + 1, iA, 31);
            c3060e.b(objArr[31]);
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC5504s.g(objArrCopyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        Object obj2 = objArr[iA];
        AbstractC5504s.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = t((Object[]) obj2, i12, i11, obj, c3060e);
        while (true) {
            iA++;
            if (iA >= 32 || objArrCopyOf2[iA] == null) {
                break;
            }
            Object obj3 = objArr[iA];
            AbstractC5504s.f(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iA] = t((Object[]) obj3, i12, 0, c3060e.a(), c3060e);
        }
        return objArrCopyOf2;
    }

    private final C3061f u(Object[] objArr, int i10, Object obj) {
        int size = size() - D();
        Object[] objArrCopyOf = Arrays.copyOf(this.f33391c, 32);
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        if (size < 32) {
            AbstractC2273n.m(this.f33391c, objArrCopyOf, i10 + 1, i10, size);
            objArrCopyOf[i10] = obj;
            return new C3061f(objArr, objArrCopyOf, size() + 1, this.f33393e);
        }
        Object[] objArr2 = this.f33391c;
        Object obj2 = objArr2[31];
        AbstractC2273n.m(objArr2, objArrCopyOf, i10 + 1, i10, size - 1);
        objArrCopyOf[i10] = obj;
        return y(objArr, objArrCopyOf, n.c(obj2));
    }

    private final Object[] v(Object[] objArr, int i10, int i11, C3060e c3060e) {
        Object[] objArrV;
        int iA = n.a(i11, i10);
        if (i10 == 5) {
            c3060e.b(objArr[iA]);
            objArrV = null;
        } else {
            Object obj = objArr[iA];
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrV = v((Object[]) obj, i10 - 5, i11, c3060e);
        }
        if (objArrV == null && iA == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iA] = objArrV;
        return objArrCopyOf;
    }

    private final b0.e w(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                AbstractC5504s.g(objArr, "copyOf(...)");
            }
            return new l(objArr);
        }
        C3060e c3060e = new C3060e(null);
        Object[] objArrV = v(objArr, i11, i10 - 1, c3060e);
        AbstractC5504s.e(objArrV);
        Object objA = c3060e.a();
        AbstractC5504s.f(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) objA;
        if (objArrV[1] != null) {
            return new C3061f(objArrV, objArr2, i10, i11);
        }
        Object obj = objArrV[0];
        AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new C3061f((Object[]) obj, objArr2, i10, i11 - 5);
    }

    private final C3061f y(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f33393e;
        if (size <= (1 << i10)) {
            return new C3061f(z(objArr, i10, objArr2), objArr3, size() + 1, this.f33393e);
        }
        Object[] objArrC = n.c(objArr);
        int i11 = this.f33393e + 5;
        return new C3061f(z(objArrC, i11, objArr2), objArr3, size() + 1, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object[] z(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
            int r0 = c0.n.a(r0, r5)
            r1 = 32
            if (r4 == 0) goto L19
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.AbstractC5504s.g(r4, r2)
            if (r4 != 0) goto L1b
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L1b:
            r1 = 5
            if (r5 != r1) goto L21
            r4[r0] = r6
            return r4
        L21:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r5 = r3.z(r2, r5, r6)
            r4[r0] = r5
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.C3061f.z(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    @Override // java.util.Collection, java.util.List, b0.e
    public b0.e add(Object obj) {
        int size = size() - D();
        if (size >= 32) {
            return y(this.f33390b, this.f33391c, n.c(obj));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f33391c, 32);
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[size] = obj;
        return new C3061f(this.f33390b, objArrCopyOf, size() + 1, this.f33393e);
    }

    @Override // Ud.AbstractC2261b
    public int d() {
        return this.f33392d;
    }

    @Override // Ud.AbstractC2263d, java.util.List
    public Object get(int i10) {
        C4750d.a(i10, size());
        return l(i10)[i10 & 31];
    }

    @Override // b0.e
    public b0.e h0(int i10) {
        C4750d.a(i10, size());
        int iD = D();
        return i10 >= iD ? B(this.f33390b, iD, this.f33393e, i10 - iD) : B(A(this.f33390b, this.f33393e, i10, new C3060e(this.f33391c[0])), iD, this.f33393e, 0);
    }

    @Override // Ud.AbstractC2263d, java.util.List
    public ListIterator listIterator(int i10) {
        C4750d.b(i10, size());
        return new i(this.f33390b, this.f33391c, i10, size(), (this.f33393e / 5) + 1);
    }

    @Override // b0.e
    /* JADX INFO: renamed from: p */
    public h builder() {
        return new h(this, this.f33390b, this.f33391c, this.f33393e);
    }

    @Override // Ud.AbstractC2263d, java.util.List
    public b0.e set(int i10, Object obj) {
        C4750d.a(i10, size());
        if (D() > i10) {
            return new C3061f(F(this.f33390b, this.f33393e, i10, obj), this.f33391c, size(), this.f33393e);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f33391c, 32);
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 & 31] = obj;
        return new C3061f(this.f33390b, objArrCopyOf, size(), this.f33393e);
    }

    @Override // b0.e
    public b0.e t1(Function1 function1) {
        h hVarBuilder = builder();
        hVarBuilder.X(function1);
        return hVarBuilder.build();
    }

    @Override // java.util.List, b0.e
    public b0.e add(int i10, Object obj) {
        C4750d.b(i10, size());
        if (i10 == size()) {
            return add(obj);
        }
        int iD = D();
        if (i10 >= iD) {
            return u(this.f33390b, i10 - iD, obj);
        }
        C3060e c3060e = new C3060e(null);
        return u(t(this.f33390b, this.f33393e, i10, obj, c3060e), 0, c3060e.a());
    }
}
