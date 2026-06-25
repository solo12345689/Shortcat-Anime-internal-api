package c0;

import Ud.AbstractC2267h;
import Ud.AbstractC2273n;
import Y.V0;
import b0.e;
import f0.AbstractC4747a;
import f0.C4750d;
import f0.C4751e;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5489c;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC2267h implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b0.e f33395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f33396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f33397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C4751e f33399e = new C4751e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object[] f33400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object[] f33401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f33402h;

    public h(b0.e eVar, Object[] objArr, Object[] objArr2, int i10) {
        this.f33395a = eVar;
        this.f33396b = objArr;
        this.f33397c = objArr2;
        this.f33398d = i10;
        this.f33400f = this.f33396b;
        this.f33401g = this.f33397c;
        this.f33402h = this.f33395a.size();
    }

    private final ListIterator A(int i10) {
        Object[] objArr = this.f33400f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iC0 = c0() >> 5;
        C4750d.b(i10, iC0);
        int i11 = this.f33398d;
        return i11 == 0 ? new k(objArr, i10) : new m(objArr, i10, iC0, i11 / 5);
    }

    private final Object[] B(Object[] objArr) {
        return objArr == null ? F() : z(objArr) ? objArr : AbstractC2273n.r(objArr, F(), 0, 0, AbstractC5874j.i(objArr.length, 32), 6, null);
    }

    private final Object[] D(Object[] objArr, int i10) {
        return z(objArr) ? AbstractC2273n.m(objArr, objArr, i10, 0, 32 - i10) : AbstractC2273n.m(objArr, F(), i10, 0, 32 - i10);
    }

    private final Object[] F() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f33399e;
        return objArr;
    }

    private final Object[] G(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f33399e;
        return objArr;
    }

    private final Object[] I(Object[] objArr, int i10, int i11) {
        if (!(i11 >= 0)) {
            V0.a("shift should be positive");
        }
        if (i11 == 0) {
            return objArr;
        }
        int iA = n.a(i10, i11);
        Object obj = objArr[iA];
        AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objI = I((Object[]) obj, i10, i11 - 5);
        if (iA < 31) {
            int i12 = iA + 1;
            if (objArr[i12] != null) {
                if (z(objArr)) {
                    AbstractC2273n.w(objArr, null, i12, 32);
                }
                objArr = AbstractC2273n.m(objArr, F(), 0, 0, i12);
            }
        }
        if (objI == objArr[iA]) {
            return objArr;
        }
        Object[] objArrB = B(objArr);
        objArrB[iA] = objI;
        return objArrB;
    }

    private final Object[] K(Object[] objArr, int i10, int i11, C3060e c3060e) {
        Object[] objArrK;
        int iA = n.a(i11 - 1, i10);
        if (i10 == 5) {
            c3060e.b(objArr[iA]);
            objArrK = null;
        } else {
            Object obj = objArr[iA];
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrK = K((Object[]) obj, i10 - 5, i11, c3060e);
        }
        if (objArrK == null && iA == 0) {
            return null;
        }
        Object[] objArrB = B(objArr);
        objArrB[iA] = objArrK;
        return objArrB;
    }

    private final void L(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            this.f33400f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f33401g = objArr;
            this.f33402h = i10;
            this.f33398d = i11;
            return;
        }
        C3060e c3060e = new C3060e(null);
        AbstractC5504s.e(objArr);
        Object[] objArrK = K(objArr, i11, i10, c3060e);
        AbstractC5504s.e(objArrK);
        Object objA = c3060e.a();
        AbstractC5504s.f(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f33401g = (Object[]) objA;
        this.f33402h = i10;
        if (objArrK[1] == null) {
            this.f33400f = (Object[]) objArrK[0];
            this.f33398d = i11 - 5;
        } else {
            this.f33400f = objArrK;
            this.f33398d = i11;
        }
    }

    private final Object[] M(Object[] objArr, int i10, int i11, Iterator it) {
        if (!it.hasNext()) {
            V0.a("invalid buffersIterator");
        }
        if (!(i11 >= 0)) {
            V0.a("negative shift");
        }
        if (i11 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrB = B(objArr);
        int iA = n.a(i10, i11);
        int i12 = i11 - 5;
        objArrB[iA] = M((Object[]) objArrB[iA], i10, i12, it);
        while (true) {
            iA++;
            if (iA >= 32 || !it.hasNext()) {
                break;
            }
            objArrB[iA] = M((Object[]) objArrB[iA], 0, i12, it);
        }
        return objArrB;
    }

    private final Object[] N(Object[] objArr, int i10, Object[][] objArr2) {
        Iterator itA = AbstractC5489c.a(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f33398d;
        Object[] objArrM = i11 < (1 << i12) ? M(objArr, i10, i12, itA) : B(objArr);
        while (itA.hasNext()) {
            this.f33398d += 5;
            objArrM = G(objArrM);
            int i13 = this.f33398d;
            M(objArrM, 1 << i13, i13, itA);
        }
        return objArrM;
    }

    private final void P(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f33398d;
        if (size > (1 << i10)) {
            this.f33400f = Q(G(objArr), objArr2, this.f33398d + 5);
            this.f33401g = objArr3;
            this.f33398d += 5;
            this.f33402h = size() + 1;
            return;
        }
        if (objArr == null) {
            this.f33400f = objArr2;
            this.f33401g = objArr3;
            this.f33402h = size() + 1;
        } else {
            this.f33400f = Q(objArr, objArr2, i10);
            this.f33401g = objArr3;
            this.f33402h = size() + 1;
        }
    }

    private final Object[] Q(Object[] objArr, Object[] objArr2, int i10) {
        int iA = n.a(size() - 1, i10);
        Object[] objArrB = B(objArr);
        if (i10 == 5) {
            objArrB[iA] = objArr2;
            return objArrB;
        }
        objArrB[iA] = Q((Object[]) objArrB[iA], objArr2, i10 - 5);
        return objArrB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int R(Function1 function1, Object[] objArr, int i10, int i11, C3060e c3060e, List list, List list2) {
        if (z(objArr)) {
            list.add(objArr);
        }
        Object objA = c3060e.a();
        AbstractC5504s.f(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) objA;
        Object[] objArrF = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                if (i11 == 32) {
                    objArrF = !list.isEmpty() ? (Object[]) list.remove(list.size() - 1) : F();
                    i11 = 0;
                }
                objArrF[i11] = obj;
                i11++;
            }
        }
        c3060e.b(objArrF);
        if (objArr2 != c3060e.a()) {
            list2.add(objArr2);
        }
        return i11;
    }

    private final int T(Function1 function1, Object[] objArr, int i10, C3060e c3060e) {
        Object[] objArrB = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArrB = B(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArrB[i11] = obj;
                i11++;
            }
        }
        c3060e.b(objArrB);
        return i11;
    }

    private final boolean U(Function1 function1) {
        Object[] objArrM;
        int iG0 = g0();
        C3060e c3060e = new C3060e(null);
        if (this.f33400f == null) {
            return W(function1, iG0, c3060e) != iG0;
        }
        ListIterator listIteratorA = A(0);
        int iT = 32;
        while (iT == 32 && listIteratorA.hasNext()) {
            iT = T(function1, (Object[]) listIteratorA.next(), 32, c3060e);
        }
        if (iT == 32) {
            AbstractC4747a.a(!listIteratorA.hasNext());
            int iW = W(function1, iG0, c3060e);
            if (iW == 0) {
                L(this.f33400f, size(), this.f33398d);
            }
            return iW != iG0;
        }
        int iPreviousIndex = listIteratorA.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iR = iT;
        while (listIteratorA.hasNext()) {
            iR = R(function1, (Object[]) listIteratorA.next(), 32, iR, c3060e, arrayList2, arrayList);
        }
        int iR2 = R(function1, this.f33401g, iG0, iR, c3060e, arrayList2, arrayList);
        Object objA = c3060e.a();
        AbstractC5504s.f(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) objA;
        AbstractC2273n.w(objArr, null, iR2, 32);
        if (arrayList.isEmpty()) {
            objArrM = this.f33400f;
            AbstractC5504s.e(objArrM);
        } else {
            objArrM = M(this.f33400f, iPreviousIndex, this.f33398d, arrayList.iterator());
        }
        int size = iPreviousIndex + (arrayList.size() << 5);
        this.f33400f = b0(objArrM, size);
        this.f33401g = objArr;
        this.f33402h = size + iR2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean V(Collection collection, Object obj) {
        return collection.contains(obj);
    }

    private final int W(Function1 function1, int i10, C3060e c3060e) {
        int iT = T(function1, this.f33401g, i10, c3060e);
        if (iT == i10) {
            AbstractC4747a.a(c3060e.a() == this.f33401g);
            return i10;
        }
        Object objA = c3060e.a();
        AbstractC5504s.f(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) objA;
        AbstractC2273n.w(objArr, null, iT, i10);
        this.f33401g = objArr;
        this.f33402h = size() - (i10 - iT);
        return iT;
    }

    private final Object[] Z(Object[] objArr, int i10, int i11, C3060e c3060e) {
        int iA = n.a(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[iA];
            Object[] objArrM = AbstractC2273n.m(objArr, B(objArr), iA, iA + 1, 32);
            objArrM[31] = c3060e.a();
            c3060e.b(obj);
            return objArrM;
        }
        int iA2 = objArr[31] == null ? n.a(c0() - 1, i10) : 31;
        Object[] objArrB = B(objArr);
        int i12 = i10 - 5;
        int i13 = iA + 1;
        if (i13 <= iA2) {
            while (true) {
                Object obj2 = objArrB[iA2];
                AbstractC5504s.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrB[iA2] = Z((Object[]) obj2, i12, 0, c3060e);
                if (iA2 == i13) {
                    break;
                }
                iA2--;
            }
        }
        Object obj3 = objArrB[iA];
        AbstractC5504s.f(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrB[iA] = Z((Object[]) obj3, i12, i11, c3060e);
        return objArrB;
    }

    private final Object a0(Object[] objArr, int i10, int i11, int i12) {
        int size = size() - i10;
        AbstractC4747a.a(i12 < size);
        if (size == 1) {
            Object obj = this.f33401g[0];
            L(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.f33401g;
        Object obj2 = objArr2[i12];
        Object[] objArrM = AbstractC2273n.m(objArr2, B(objArr2), i12, i12 + 1, size);
        objArrM[size - 1] = null;
        this.f33400f = objArr;
        this.f33401g = objArrM;
        this.f33402h = (i10 + size) - 1;
        this.f33398d = i11;
        return obj2;
    }

    private final Object[] b0(Object[] objArr, int i10) {
        if (!((i10 & 31) == 0)) {
            V0.a("invalid size");
        }
        if (i10 == 0) {
            this.f33398d = 0;
            return null;
        }
        int i11 = i10 - 1;
        while (true) {
            int i12 = this.f33398d;
            if ((i11 >> i12) != 0) {
                return I(objArr, i11, i12);
            }
            this.f33398d = i12 - 5;
            Object[] objArr2 = objArr[0];
            AbstractC5504s.f(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
    }

    private final int c0() {
        if (size() <= 32) {
            return 0;
        }
        return n.d(size());
    }

    private final Object[] d0(Object[] objArr, int i10, int i11, Object obj, C3060e c3060e) {
        int iA = n.a(i11, i10);
        Object[] objArrB = B(objArr);
        if (i10 != 0) {
            Object obj2 = objArrB[iA];
            AbstractC5504s.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrB[iA] = d0((Object[]) obj2, i10 - 5, i11, obj, c3060e);
            return objArrB;
        }
        if (objArrB != objArr) {
            ((AbstractList) this).modCount++;
        }
        c3060e.b(objArrB[iA]);
        objArrB[iA] = obj;
        return objArrB;
    }

    private final Object[] e0(int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f33400f == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator listIteratorA = A(c0() >> 5);
        while (listIteratorA.previousIndex() != i10) {
            Object[] objArr3 = (Object[]) listIteratorA.previous();
            AbstractC2273n.m(objArr3, objArr2, 0, 32 - i11, 32);
            objArr2 = D(objArr3, i11);
            i12--;
            objArr[i12] = objArr2;
        }
        return (Object[]) listIteratorA.previous();
    }

    private final Object[] f(int i10) {
        if (c0() <= i10) {
            return this.f33401g;
        }
        Object[] objArr = this.f33400f;
        AbstractC5504s.e(objArr);
        for (int i11 = this.f33398d; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[n.a(i10, i11)];
            AbstractC5504s.f(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final void f0(Collection collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrF;
        if (!(i12 >= 1)) {
            V0.a("requires at least one nullBuffer");
        }
        Object[] objArrB = B(objArr);
        objArr2[0] = objArrB;
        int i13 = i10 & 31;
        int size = ((i10 + collection.size()) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            AbstractC2273n.m(objArrB, objArr3, size + 1, i13, i11);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArrF = objArrB;
            } else {
                objArrF = F();
                i12--;
                objArr2[i12] = objArrF;
            }
            int i16 = i11 - i15;
            AbstractC2273n.m(objArrB, objArr3, 0, i16, i11);
            AbstractC2273n.m(objArrB, objArrF, size + 1, i13, i16);
            objArr3 = objArrF;
        }
        Iterator it = collection.iterator();
        i(objArrB, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            objArr2[i17] = i(F(), 0, it);
        }
        i(objArr3, 0, it);
    }

    private final int g0() {
        return i0(size());
    }

    private final Object[] i(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    private final int i0(int i10) {
        return i10 <= 32 ? i10 : i10 - n.d(i10);
    }

    private final void v(Collection collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        Object[] objArr3;
        if (this.f33400f == null) {
            throw new IllegalStateException("root is null");
        }
        int i13 = i10 >> 5;
        Object[] objArrE0 = e0(i13, i11, objArr, i12, objArr2);
        int iC0 = i12 - (((c0() >> 5) - 1) - i13);
        if (iC0 < i12) {
            Object[] objArr4 = objArr[iC0];
            AbstractC5504s.e(objArr4);
            objArr3 = objArr4;
        } else {
            objArr3 = objArr2;
        }
        f0(collection, i10, objArrE0, 32, objArr, iC0, objArr3);
    }

    private final Object[] w(Object[] objArr, int i10, int i11, Object obj, C3060e c3060e) {
        Object obj2;
        int iA = n.a(i11, i10);
        if (i10 == 0) {
            c3060e.b(objArr[31]);
            Object[] objArrM = AbstractC2273n.m(objArr, B(objArr), iA + 1, iA, 31);
            objArrM[iA] = obj;
            return objArrM;
        }
        Object[] objArrB = B(objArr);
        int i12 = i10 - 5;
        Object obj3 = objArrB[iA];
        AbstractC5504s.f(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrB[iA] = w((Object[]) obj3, i12, i11, obj, c3060e);
        while (true) {
            iA++;
            if (iA >= 32 || (obj2 = objArrB[iA]) == null) {
                break;
            }
            AbstractC5504s.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrB[iA] = w((Object[]) obj2, i12, 0, c3060e.a(), c3060e);
        }
        return objArrB;
    }

    private final void y(Object[] objArr, int i10, Object obj) {
        int iG0 = g0();
        Object[] objArrB = B(this.f33401g);
        if (iG0 < 32) {
            AbstractC2273n.m(this.f33401g, objArrB, i10 + 1, i10, iG0);
            objArrB[i10] = obj;
            this.f33400f = objArr;
            this.f33401g = objArrB;
            this.f33402h = size() + 1;
            return;
        }
        Object[] objArr2 = this.f33401g;
        Object obj2 = objArr2[31];
        AbstractC2273n.m(objArr2, objArrB, i10 + 1, i10, 31);
        objArrB[i10] = obj;
        P(objArr, objArrB, G(obj2));
    }

    private final boolean z(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f33399e;
    }

    public final boolean X(Function1 function1) {
        boolean zU = U(function1);
        if (zU) {
            ((AbstractList) this).modCount++;
        }
        return zU;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iG0 = g0();
        if (iG0 < 32) {
            Object[] objArrB = B(this.f33401g);
            objArrB[iG0] = obj;
            this.f33401g = objArrB;
            this.f33402h = size() + 1;
        } else {
            P(this.f33400f, this.f33401g, G(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iG0 = g0();
        Iterator it = collection.iterator();
        if (32 - iG0 >= collection.size()) {
            this.f33401g = i(B(this.f33401g), iG0, it);
            this.f33402h = size() + collection.size();
        } else {
            int size = ((collection.size() + iG0) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = i(B(this.f33401g), iG0, it);
            for (int i10 = 1; i10 < size; i10++) {
                objArr[i10] = i(F(), 0, it);
            }
            this.f33400f = N(this.f33400f, c0(), objArr);
            this.f33401g = i(F(), 0, it);
            this.f33402h = size() + collection.size();
        }
        return true;
    }

    @Override // Ud.AbstractC2267h
    public int b() {
        return this.f33402h;
    }

    @Override // b0.e.a
    public b0.e build() {
        b0.e c3061f;
        if (this.f33400f == this.f33396b && this.f33401g == this.f33397c) {
            c3061f = this.f33395a;
        } else {
            this.f33399e = new C4751e();
            Object[] objArr = this.f33400f;
            this.f33396b = objArr;
            Object[] objArr2 = this.f33401g;
            this.f33397c = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.f33400f;
                AbstractC5504s.e(objArr3);
                c3061f = new C3061f(objArr3, this.f33401g, size(), this.f33398d);
            } else if (objArr2.length == 0) {
                c3061f = n.b();
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.f33401g, size());
                AbstractC5504s.g(objArrCopyOf, "copyOf(...)");
                c3061f = new l(objArrCopyOf);
            }
        }
        this.f33395a = c3061f;
        return c3061f;
    }

    @Override // Ud.AbstractC2267h
    public Object d(int i10) {
        C4750d.a(i10, size());
        ((AbstractList) this).modCount++;
        int iC0 = c0();
        if (i10 >= iC0) {
            return a0(this.f33400f, iC0, this.f33398d, i10 - iC0);
        }
        C3060e c3060e = new C3060e(this.f33401g[0]);
        Object[] objArr = this.f33400f;
        AbstractC5504s.e(objArr);
        a0(Z(objArr, this.f33398d, i10, c3060e), iC0, this.f33398d, 0);
        return c3060e.a();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        C4750d.a(i10, size());
        return f(i10)[i10 & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    public final int l() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    public final Object[] p() {
        return this.f33400f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(final Collection collection) {
        return X(new Function1() { // from class: c0.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(h.V(collection, obj));
            }
        });
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        C4750d.a(i10, size());
        if (c0() > i10) {
            C3060e c3060e = new C3060e(null);
            Object[] objArr = this.f33400f;
            AbstractC5504s.e(objArr);
            this.f33400f = d0(objArr, this.f33398d, i10, obj, c3060e);
            return c3060e.a();
        }
        Object[] objArrB = B(this.f33401g);
        if (objArrB != this.f33401g) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        Object obj2 = objArrB[i11];
        objArrB[i11] = obj;
        this.f33401g = objArrB;
        return obj2;
    }

    public final int t() {
        return this.f33398d;
    }

    public final Object[] u() {
        return this.f33401g;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        C4750d.b(i10, size());
        return new j(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        C4750d.b(i10, size());
        if (i10 == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iC0 = c0();
        if (i10 >= iC0) {
            y(this.f33400f, i10 - iC0, obj);
            return;
        }
        C3060e c3060e = new C3060e(null);
        Object[] objArr = this.f33400f;
        AbstractC5504s.e(objArr);
        y(w(objArr, this.f33398d, i10, obj, c3060e), 0, c3060e.a());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        h hVar;
        Collection collection2;
        Object[] objArrM;
        Object[][] objArr;
        C4750d.b(i10, size());
        if (i10 == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = (((size() - i11) + collection.size()) - 1) / 32;
        if (size == 0) {
            AbstractC4747a.a(i10 >= c0());
            int i12 = i10 & 31;
            int size2 = ((i10 + collection.size()) - 1) & 31;
            Object[] objArr2 = this.f33401g;
            Object[] objArrM2 = AbstractC2273n.m(objArr2, B(objArr2), size2 + 1, i12, g0());
            i(objArrM2, i12, collection.iterator());
            this.f33401g = objArrM2;
            this.f33402h = size() + collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int iG0 = g0();
        int iI0 = i0(size() + collection.size());
        if (i10 >= c0()) {
            objArrM = F();
            objArr = objArr3;
            hVar = this;
            collection2 = collection;
            hVar.f0(collection2, i10, this.f33401g, iG0, objArr, size, objArrM);
        } else {
            hVar = this;
            collection2 = collection;
            if (iI0 > iG0) {
                int i13 = iI0 - iG0;
                Object[] objArrD = D(hVar.f33401g, i13);
                hVar.v(collection2, i10, i13, objArr3, size, objArrD);
                objArr = objArr3;
                objArrM = objArrD;
            } else {
                int i14 = iG0 - iI0;
                objArrM = AbstractC2273n.m(hVar.f33401g, F(), 0, i14, iG0);
                int i15 = 32 - i14;
                Object[] objArrD2 = D(hVar.f33401g, i15);
                int i16 = size - 1;
                objArr3[i16] = objArrD2;
                hVar.v(collection2, i10, i15, objArr3, i16, objArrD2);
                collection2 = collection2;
                objArr = objArr3;
                hVar = hVar;
            }
        }
        hVar.f33400f = N(hVar.f33400f, i11, objArr);
        hVar.f33401g = objArrM;
        hVar.f33402h = size() + collection2.size();
        return true;
    }
}
