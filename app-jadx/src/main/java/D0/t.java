package d0;

import Y.V0;
import f0.AbstractC4747a;
import f0.C4748b;
import f0.C4751e;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import oe.C5868d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: e */
    public static final a f44926e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final int f44927f = 8;

    /* JADX INFO: renamed from: g */
    private static final t f44928g = new t(0, 0, new Object[0]);

    /* JADX INFO: renamed from: a */
    private int f44929a;

    /* JADX INFO: renamed from: b */
    private int f44930b;

    /* JADX INFO: renamed from: c */
    private final C4751e f44931c;

    /* JADX INFO: renamed from: d */
    private Object[] f44932d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a() {
            return t.f44928g;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private t f44933a;

        /* JADX INFO: renamed from: b */
        private final int f44934b;

        public b(t tVar, int i10) {
            this.f44933a = tVar;
            this.f44934b = i10;
        }

        public final t a() {
            return this.f44933a;
        }

        public final int b() {
            return this.f44934b;
        }

        public final void c(t tVar) {
            this.f44933a = tVar;
        }
    }

    public t(int i10, int i11, Object[] objArr, C4751e c4751e) {
        this.f44929a = i10;
        this.f44930b = i11;
        this.f44931c = c4751e;
        this.f44932d = objArr;
    }

    private final t A(int i10, f fVar) {
        fVar.n(fVar.size() - 1);
        fVar.l(W(i10));
        if (this.f44932d.length == 2) {
            return null;
        }
        if (this.f44931c != fVar.j()) {
            return new t(0, 0, x.h(this.f44932d, i10), fVar.j());
        }
        this.f44932d = x.h(this.f44932d, i10);
        return this;
    }

    private final t B(int i10, Object obj, Object obj2, C4751e c4751e) {
        int iN = n(i10);
        if (this.f44931c != c4751e) {
            return new t(i10 | this.f44929a, this.f44930b, x.g(this.f44932d, iN, obj, obj2), c4751e);
        }
        this.f44932d = x.g(this.f44932d, iN, obj, obj2);
        this.f44929a = i10 | this.f44929a;
        return this;
    }

    private final t C(int i10, int i11, int i12, Object obj, Object obj2, int i13, C4751e c4751e) {
        if (this.f44931c != c4751e) {
            return new t(this.f44929a ^ i11, i11 | this.f44930b, d(i10, i11, i12, obj, obj2, i13, c4751e), c4751e);
        }
        this.f44932d = d(i10, i11, i12, obj, obj2, i13, c4751e);
        this.f44929a ^= i11;
        this.f44930b |= i11;
        return this;
    }

    private final t F(t tVar, int i10, int i11, C4748b c4748b, f fVar) {
        if (r(i10)) {
            t tVarN = N(O(i10));
            if (tVar.r(i10)) {
                return tVarN.E(tVar.N(tVar.O(i10)), i11 + 5, c4748b, fVar);
            }
            if (!tVar.q(i10)) {
                return tVarN;
            }
            int iN = tVar.n(i10);
            Object objT = tVar.t(iN);
            Object objW = tVar.W(iN);
            int size = fVar.size();
            t tVarD = tVarN.D(objT != null ? objT.hashCode() : 0, objT, objW, i11 + 5, fVar);
            if (fVar.size() == size) {
                c4748b.c(c4748b.a() + 1);
            }
            return tVarD;
        }
        if (!tVar.r(i10)) {
            int iN2 = n(i10);
            Object objT2 = t(iN2);
            Object objW2 = W(iN2);
            int iN3 = tVar.n(i10);
            Object objT3 = tVar.t(iN3);
            return u(objT2 != null ? objT2.hashCode() : 0, objT2, objW2, objT3 != null ? objT3.hashCode() : 0, objT3, tVar.W(iN3), i11 + 5, fVar.j());
        }
        t tVarN2 = tVar.N(tVar.O(i10));
        if (!q(i10)) {
            return tVarN2;
        }
        int iN4 = n(i10);
        Object objT4 = t(iN4);
        int i12 = i11 + 5;
        if (!tVarN2.k(objT4 != null ? objT4.hashCode() : 0, objT4, i12)) {
            return tVarN2.D(objT4 != null ? objT4.hashCode() : 0, objT4, W(iN4), i12, fVar);
        }
        c4748b.c(c4748b.a() + 1);
        return tVarN2;
    }

    private final t I(int i10, int i11, f fVar) {
        fVar.n(fVar.size() - 1);
        fVar.l(W(i10));
        if (this.f44932d.length == 2) {
            return null;
        }
        if (this.f44931c != fVar.j()) {
            return new t(i11 ^ this.f44929a, this.f44930b, x.h(this.f44932d, i10), fVar.j());
        }
        this.f44932d = x.h(this.f44932d, i10);
        this.f44929a ^= i11;
        return this;
    }

    private final t J(int i10, int i11, C4751e c4751e) {
        Object[] objArr = this.f44932d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f44931c != c4751e) {
            return new t(this.f44929a, i11 ^ this.f44930b, x.i(objArr, i10), c4751e);
        }
        this.f44932d = x.i(objArr, i10);
        this.f44930b ^= i11;
        return this;
    }

    private final t K(t tVar, t tVar2, int i10, int i11, C4751e c4751e) {
        return tVar2 == null ? J(i10, i11, c4751e) : (this.f44931c == c4751e || tVar != tVar2) ? L(i10, tVar2, c4751e) : this;
    }

    private final t L(int i10, t tVar, C4751e c4751e) {
        Object[] objArr = this.f44932d;
        if (objArr.length == 1 && tVar.f44932d.length == 2 && tVar.f44930b == 0) {
            tVar.f44929a = this.f44930b;
            return tVar;
        }
        if (this.f44931c == c4751e) {
            objArr[i10] = tVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = tVar;
        return new t(this.f44929a, this.f44930b, objArrCopyOf, c4751e);
    }

    private final t M(int i10, Object obj, f fVar) {
        if (this.f44931c == fVar.j()) {
            this.f44932d[i10 + 1] = obj;
            return this;
        }
        fVar.k(fVar.g() + 1);
        Object[] objArr = this.f44932d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 + 1] = obj;
        return new t(this.f44929a, this.f44930b, objArrCopyOf, fVar.j());
    }

    private final t R(int i10, int i11) {
        Object[] objArr = this.f44932d;
        if (objArr.length == 2) {
            return null;
        }
        return new t(i11 ^ this.f44929a, this.f44930b, x.h(objArr, i10));
    }

    private final t S(int i10, int i11) {
        Object[] objArr = this.f44932d;
        if (objArr.length == 1) {
            return null;
        }
        return new t(this.f44929a, i11 ^ this.f44930b, x.i(objArr, i10));
    }

    private final t T(t tVar, t tVar2, int i10, int i11) {
        return tVar2 == null ? S(i10, i11) : tVar != tVar2 ? U(i10, i11, tVar2) : this;
    }

    private final t U(int i10, int i11, t tVar) {
        Object[] objArr = tVar.f44932d;
        if (objArr.length != 2 || tVar.f44930b != 0) {
            Object[] objArr2 = this.f44932d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i10] = tVar;
            return new t(this.f44929a, this.f44930b, objArrCopyOf);
        }
        if (this.f44932d.length == 1) {
            tVar.f44929a = this.f44930b;
            return tVar;
        }
        return new t(this.f44929a ^ i11, i11 ^ this.f44930b, x.k(this.f44932d, i10, n(i11), objArr[0], objArr[1]));
    }

    private final t V(int i10, Object obj) {
        Object[] objArr = this.f44932d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 + 1] = obj;
        return new t(this.f44929a, this.f44930b, objArrCopyOf);
    }

    private final Object W(int i10) {
        return this.f44932d[i10 + 1];
    }

    private final b b() {
        return new b(this, 1);
    }

    private final b c() {
        return new b(this, 0);
    }

    private final Object[] d(int i10, int i11, int i12, Object obj, Object obj2, int i13, C4751e c4751e) {
        Object objT = t(i10);
        return x.j(this.f44932d, i10, O(i11) + 1, u(objT != null ? objT.hashCode() : 0, objT, W(i10), i12, obj, obj2, i13 + 5, c4751e));
    }

    private final int e() {
        if (this.f44930b == 0) {
            return this.f44932d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f44929a);
        int length = this.f44932d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += N(i10).e();
        }
        return iBitCount;
    }

    private final boolean f(Object obj) {
        C5868d c5868dV = AbstractC5874j.v(AbstractC5874j.x(0, this.f44932d.length), 2);
        int iF = c5868dV.f();
        int i10 = c5868dV.i();
        int iL = c5868dV.l();
        if ((iL > 0 && iF <= i10) || (iL < 0 && i10 <= iF)) {
            while (!AbstractC5504s.c(obj, this.f44932d[iF])) {
                if (iF != i10) {
                    iF += iL;
                }
            }
            return true;
        }
        return false;
    }

    private final Object g(Object obj) {
        C5868d c5868dV = AbstractC5874j.v(AbstractC5874j.x(0, this.f44932d.length), 2);
        int iF = c5868dV.f();
        int i10 = c5868dV.i();
        int iL = c5868dV.l();
        if ((iL <= 0 || iF > i10) && (iL >= 0 || i10 > iF)) {
            return null;
        }
        while (!AbstractC5504s.c(obj, t(iF))) {
            if (iF == i10) {
                return null;
            }
            iF += iL;
        }
        return W(iF);
    }

    private final b h(Object obj, Object obj2) {
        C5868d c5868dV = AbstractC5874j.v(AbstractC5874j.x(0, this.f44932d.length), 2);
        int iF = c5868dV.f();
        int i10 = c5868dV.i();
        int iL = c5868dV.l();
        if ((iL > 0 && iF <= i10) || (iL < 0 && i10 <= iF)) {
            while (!AbstractC5504s.c(obj, t(iF))) {
                if (iF != i10) {
                    iF += iL;
                }
            }
            if (obj2 == W(iF)) {
                return null;
            }
            Object[] objArr = this.f44932d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF + 1] = obj2;
            return new t(0, 0, objArrCopyOf).c();
        }
        return new t(0, 0, x.g(this.f44932d, 0, obj, obj2)).b();
    }

    private final t i(Object obj) {
        C5868d c5868dV = AbstractC5874j.v(AbstractC5874j.x(0, this.f44932d.length), 2);
        int iF = c5868dV.f();
        int i10 = c5868dV.i();
        int iL = c5868dV.l();
        if ((iL > 0 && iF <= i10) || (iL < 0 && i10 <= iF)) {
            while (!AbstractC5504s.c(obj, t(iF))) {
                if (iF != i10) {
                    iF += iL;
                }
            }
            return j(iF);
        }
        return this;
    }

    private final t j(int i10) {
        Object[] objArr = this.f44932d;
        if (objArr.length == 2) {
            return null;
        }
        return new t(0, 0, x.h(objArr, i10));
    }

    private final boolean l(t tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f44930b != tVar.f44930b || this.f44929a != tVar.f44929a) {
            return false;
        }
        int length = this.f44932d.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f44932d[i10] != tVar.f44932d[i10]) {
                return false;
            }
        }
        return true;
    }

    private final boolean r(int i10) {
        return (i10 & this.f44930b) != 0;
    }

    private final t s(int i10, Object obj, Object obj2) {
        return new t(i10 | this.f44929a, this.f44930b, x.g(this.f44932d, n(i10), obj, obj2));
    }

    private final Object t(int i10) {
        return this.f44932d[i10];
    }

    private final t u(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, C4751e c4751e) {
        if (i12 > 30) {
            return new t(0, 0, new Object[]{obj, obj2, obj3, obj4}, c4751e);
        }
        int iF = x.f(i10, i12);
        int iF2 = x.f(i11, i12);
        if (iF != iF2) {
            return new t((1 << iF) | (1 << iF2), 0, iF < iF2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c4751e);
        }
        return new t(0, 1 << iF, new Object[]{u(i10, obj, obj2, i11, obj3, obj4, i12 + 5, c4751e)}, c4751e);
    }

    private final t v(int i10, int i11, int i12, Object obj, Object obj2, int i13) {
        return new t(this.f44929a ^ i11, this.f44930b | i11, d(i10, i11, i12, obj, obj2, i13, null));
    }

    private final t w(Object obj, Object obj2, f fVar) {
        C5868d c5868dV = AbstractC5874j.v(AbstractC5874j.x(0, this.f44932d.length), 2);
        int iF = c5868dV.f();
        int i10 = c5868dV.i();
        int iL = c5868dV.l();
        if ((iL > 0 && iF <= i10) || (iL < 0 && i10 <= iF)) {
            while (!AbstractC5504s.c(obj, t(iF))) {
                if (iF != i10) {
                    iF += iL;
                }
            }
            fVar.l(W(iF));
            if (this.f44931c == fVar.j()) {
                this.f44932d[iF + 1] = obj2;
                return this;
            }
            fVar.k(fVar.g() + 1);
            Object[] objArr = this.f44932d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF + 1] = obj2;
            return new t(0, 0, objArrCopyOf, fVar.j());
        }
        fVar.n(fVar.size() + 1);
        return new t(0, 0, x.g(this.f44932d, 0, obj, obj2), fVar.j());
    }

    private final t x(t tVar, C4748b c4748b, C4751e c4751e) {
        AbstractC4747a.a(this.f44930b == 0);
        AbstractC4747a.a(this.f44929a == 0);
        AbstractC4747a.a(tVar.f44930b == 0);
        AbstractC4747a.a(tVar.f44929a == 0);
        Object[] objArr = this.f44932d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + tVar.f44932d.length);
        AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
        int length = this.f44932d.length;
        C5868d c5868dV = AbstractC5874j.v(AbstractC5874j.x(0, tVar.f44932d.length), 2);
        int iF = c5868dV.f();
        int i10 = c5868dV.i();
        int iL = c5868dV.l();
        if ((iL > 0 && iF <= i10) || (iL < 0 && i10 <= iF)) {
            while (true) {
                if (f(tVar.f44932d[iF])) {
                    c4748b.c(c4748b.a() + 1);
                } else {
                    Object[] objArr2 = tVar.f44932d;
                    objArrCopyOf[length] = objArr2[iF];
                    objArrCopyOf[length + 1] = objArr2[iF + 1];
                    length += 2;
                }
                if (iF == i10) {
                    break;
                }
                iF += iL;
            }
        }
        if (length == this.f44932d.length) {
            return this;
        }
        if (length == tVar.f44932d.length) {
            return tVar;
        }
        if (length == objArrCopyOf.length) {
            return new t(0, 0, objArrCopyOf, c4751e);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        AbstractC5504s.g(objArrCopyOf2, "copyOf(...)");
        return new t(0, 0, objArrCopyOf2, c4751e);
    }

    private final t y(Object obj, f fVar) {
        C5868d c5868dV = AbstractC5874j.v(AbstractC5874j.x(0, this.f44932d.length), 2);
        int iF = c5868dV.f();
        int i10 = c5868dV.i();
        int iL = c5868dV.l();
        if ((iL > 0 && iF <= i10) || (iL < 0 && i10 <= iF)) {
            while (!AbstractC5504s.c(obj, t(iF))) {
                if (iF != i10) {
                    iF += iL;
                }
            }
            return A(iF, fVar);
        }
        return this;
    }

    private final t z(Object obj, Object obj2, f fVar) {
        C5868d c5868dV = AbstractC5874j.v(AbstractC5874j.x(0, this.f44932d.length), 2);
        int iF = c5868dV.f();
        int i10 = c5868dV.i();
        int iL = c5868dV.l();
        if ((iL > 0 && iF <= i10) || (iL < 0 && i10 <= iF)) {
            while (true) {
                if (!AbstractC5504s.c(obj, t(iF)) || !AbstractC5504s.c(obj2, W(iF))) {
                    if (iF == i10) {
                        break;
                    }
                    iF += iL;
                } else {
                    return A(iF, fVar);
                }
            }
        }
        return this;
    }

    public final t D(int i10, Object obj, Object obj2, int i11, f fVar) {
        f fVar2;
        t tVarD;
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            if (AbstractC5504s.c(obj, t(iN))) {
                fVar.l(W(iN));
                return W(iN) == obj2 ? this : M(iN, obj2, fVar);
            }
            fVar.n(fVar.size() + 1);
            return C(iN, iF, i10, obj, obj2, i11, fVar.j());
        }
        if (!r(iF)) {
            fVar.n(fVar.size() + 1);
            return B(iF, obj, obj2, fVar.j());
        }
        int iO = O(iF);
        t tVarN = N(iO);
        if (i11 == 30) {
            tVarD = tVarN.w(obj, obj2, fVar);
            fVar2 = fVar;
        } else {
            fVar2 = fVar;
            tVarD = tVarN.D(i10, obj, obj2, i11 + 5, fVar2);
        }
        return tVarN == tVarD ? this : L(iO, tVarD, fVar2.j());
    }

    public final t E(t tVar, int i10, C4748b c4748b, f fVar) {
        if (this == tVar) {
            c4748b.b(e());
            return this;
        }
        int i11 = i10;
        if (i11 > 30) {
            return x(tVar, c4748b, fVar.j());
        }
        int i12 = this.f44930b | tVar.f44930b;
        int i13 = this.f44929a;
        int i14 = tVar.f44929a;
        int i15 = (i13 ^ i14) & (~i12);
        int i16 = i13 & i14;
        while (i16 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i16);
            if (AbstractC5504s.c(t(n(iLowestOneBit)), tVar.t(tVar.n(iLowestOneBit)))) {
                i15 |= iLowestOneBit;
            } else {
                i12 |= iLowestOneBit;
            }
            i16 ^= iLowestOneBit;
        }
        int i17 = 0;
        if (!((i12 & i15) == 0)) {
            V0.b("Check failed.");
        }
        t tVar2 = (AbstractC5504s.c(this.f44931c, fVar.j()) && this.f44929a == i15 && this.f44930b == i12) ? this : new t(i15, i12, new Object[(Integer.bitCount(i15) * 2) + Integer.bitCount(i12)]);
        int i18 = i12;
        int i19 = 0;
        while (i18 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i18);
            Object[] objArr = tVar2.f44932d;
            objArr[(objArr.length - 1) - i19] = F(tVar, iLowestOneBit2, i11, c4748b, fVar);
            i19++;
            i18 ^= iLowestOneBit2;
            i11 = i10;
        }
        while (i15 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i15);
            int i20 = i17 * 2;
            if (tVar.q(iLowestOneBit3)) {
                int iN = tVar.n(iLowestOneBit3);
                tVar2.f44932d[i20] = tVar.t(iN);
                tVar2.f44932d[i20 + 1] = tVar.W(iN);
                if (q(iLowestOneBit3)) {
                    c4748b.c(c4748b.a() + 1);
                }
            } else {
                int iN2 = n(iLowestOneBit3);
                tVar2.f44932d[i20] = t(iN2);
                tVar2.f44932d[i20 + 1] = W(iN2);
            }
            i17++;
            i15 ^= iLowestOneBit3;
        }
        return l(tVar2) ? this : tVar.l(tVar2) ? tVar : tVar2;
    }

    public final t G(int i10, Object obj, int i11, f fVar) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            if (AbstractC5504s.c(obj, t(iN))) {
                return I(iN, iF, fVar);
            }
        } else if (r(iF)) {
            int iO = O(iF);
            t tVarN = N(iO);
            return K(tVarN, i11 == 30 ? tVarN.y(obj, fVar) : tVarN.G(i10, obj, i11 + 5, fVar), iO, iF, fVar.j());
        }
        return this;
    }

    public final t H(int i10, Object obj, Object obj2, int i11, f fVar) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            if (AbstractC5504s.c(obj, t(iN)) && AbstractC5504s.c(obj2, W(iN))) {
                return I(iN, iF, fVar);
            }
        } else if (r(iF)) {
            int iO = O(iF);
            t tVarN = N(iO);
            return K(tVarN, i11 == 30 ? tVarN.z(obj, obj2, fVar) : tVarN.H(i10, obj, obj2, i11 + 5, fVar), iO, iF, fVar.j());
        }
        return this;
    }

    public final t N(int i10) {
        Object obj = this.f44932d[i10];
        AbstractC5504s.f(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (t) obj;
    }

    public final int O(int i10) {
        return (this.f44932d.length - 1) - Integer.bitCount((i10 - 1) & this.f44930b);
    }

    public final b P(int i10, Object obj, Object obj2, int i11) {
        b bVarP;
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            if (!AbstractC5504s.c(obj, t(iN))) {
                return v(iN, iF, i10, obj, obj2, i11).b();
            }
            if (W(iN) == obj2) {
                return null;
            }
            return V(iN, obj2).c();
        }
        if (!r(iF)) {
            return s(iF, obj, obj2).b();
        }
        int iO = O(iF);
        t tVarN = N(iO);
        if (i11 == 30) {
            bVarP = tVarN.h(obj, obj2);
            if (bVarP == null) {
                return null;
            }
        } else {
            bVarP = tVarN.P(i10, obj, obj2, i11 + 5);
            if (bVarP == null) {
                return null;
            }
        }
        bVarP.c(U(iO, iF, bVarP.a()));
        return bVarP;
    }

    public final t Q(int i10, Object obj, int i11) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            if (AbstractC5504s.c(obj, t(iN))) {
                return R(iN, iF);
            }
        } else if (r(iF)) {
            int iO = O(iF);
            t tVarN = N(iO);
            return T(tVarN, i11 == 30 ? tVarN.i(obj) : tVarN.Q(i10, obj, i11 + 5), iO, iF);
        }
        return this;
    }

    public final boolean k(int i10, Object obj, int i11) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            return AbstractC5504s.c(obj, t(n(iF)));
        }
        if (!r(iF)) {
            return false;
        }
        t tVarN = N(O(iF));
        return i11 == 30 ? tVarN.f(obj) : tVarN.k(i10, obj, i11 + 5);
    }

    public final int m() {
        return Integer.bitCount(this.f44929a);
    }

    public final int n(int i10) {
        return Integer.bitCount((i10 - 1) & this.f44929a) * 2;
    }

    public final Object o(int i10, Object obj, int i11) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            if (AbstractC5504s.c(obj, t(iN))) {
                return W(iN);
            }
            return null;
        }
        if (!r(iF)) {
            return null;
        }
        t tVarN = N(O(iF));
        return i11 == 30 ? tVarN.g(obj) : tVarN.o(i10, obj, i11 + 5);
    }

    public final Object[] p() {
        return this.f44932d;
    }

    public final boolean q(int i10) {
        return (i10 & this.f44929a) != 0;
    }

    public t(int i10, int i11, Object[] objArr) {
        this(i10, i11, objArr, null);
    }
}
