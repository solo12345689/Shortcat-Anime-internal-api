package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class O4 implements InterfaceC3533n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N4 f39529a;

    private O4(N4 n42) {
        byte[] bArr = AbstractC3505k5.f39813b;
        this.f39529a = n42;
        n42.f39513a = this;
    }

    public static O4 L(N4 n42) {
        O4 o42 = n42.f39513a;
        return o42 != null ? o42 : new O4(n42);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void A(int i10, long j10) {
        this.f39529a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void B(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3451e5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f39529a.k(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            N4 n42 = this.f39529a;
            n42.i(i10, 2);
            int iE = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iE += N4.E(((Integer) list.get(i12)).intValue());
            }
            n42.x(iE);
            while (i11 < list.size()) {
                n42.x(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C3451e5 c3451e5 = (C3451e5) list;
        if (!z10) {
            while (i11 < c3451e5.size()) {
                this.f39529a.k(i10, c3451e5.d(i11));
                i11++;
            }
            return;
        }
        N4 n43 = this.f39529a;
        n43.i(i10, 2);
        int iE2 = 0;
        for (int i13 = 0; i13 < c3451e5.size(); i13++) {
            iE2 += N4.E(c3451e5.d(i13));
        }
        n43.x(iE2);
        while (i11 < c3451e5.size()) {
            n43.x(c3451e5.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void C(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f39529a.q(i10, (I4) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void D(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f39529a.l(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        N4 n42 = this.f39529a;
        n42.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        n42.x(i12);
        while (i11 < list.size()) {
            n42.y(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void E(int i10, int i11) {
        this.f39529a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void F(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f39529a.p(i10, (String) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void G(int i10, int i11) {
        this.f39529a.k(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void H(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3451e5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f39529a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            N4 n42 = this.f39529a;
            n42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            n42.x(i12);
            while (i11 < list.size()) {
                n42.y(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C3451e5 c3451e5 = (C3451e5) list;
        if (!z10) {
            while (i11 < c3451e5.size()) {
                this.f39529a.l(i10, c3451e5.d(i11));
                i11++;
            }
            return;
        }
        N4 n43 = this.f39529a;
        n43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c3451e5.size(); i15++) {
            c3451e5.d(i15);
            i14 += 4;
        }
        n43.x(i14);
        while (i11 < c3451e5.size()) {
            n43.y(c3451e5.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void I(int i10, boolean z10) {
        this.f39529a.o(i10, z10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void J(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3451e5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f39529a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            N4 n42 = this.f39529a;
            n42.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += N4.a(((Integer) list.get(i12)).intValue());
            }
            n42.x(iA);
            while (i11 < list.size()) {
                n42.w(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C3451e5 c3451e5 = (C3451e5) list;
        if (!z10) {
            while (i11 < c3451e5.size()) {
                this.f39529a.j(i10, c3451e5.d(i11));
                i11++;
            }
            return;
        }
        N4 n43 = this.f39529a;
        n43.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c3451e5.size(); i13++) {
            iA2 += N4.a(c3451e5.d(i13));
        }
        n43.x(iA2);
        while (i11 < c3451e5.size()) {
            n43.w(c3451e5.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void K(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3451e5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f39529a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            N4 n42 = this.f39529a;
            n42.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += N4.a(((Integer) list.get(i12)).intValue());
            }
            n42.x(iA);
            while (i11 < list.size()) {
                n42.w(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C3451e5 c3451e5 = (C3451e5) list;
        if (!z10) {
            while (i11 < c3451e5.size()) {
                this.f39529a.j(i10, c3451e5.d(i11));
                i11++;
            }
            return;
        }
        N4 n43 = this.f39529a;
        n43.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c3451e5.size(); i13++) {
            iA2 += N4.a(c3451e5.d(i13));
        }
        n43.x(iA2);
        while (i11 < c3451e5.size()) {
            n43.w(c3451e5.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void a(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3576s5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f39529a.n(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            N4 n42 = this.f39529a;
            n42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            n42.x(i12);
            while (i11 < list.size()) {
                n42.A(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C3576s5 c3576s5 = (C3576s5) list;
        if (!z10) {
            while (i11 < c3576s5.size()) {
                this.f39529a.n(i10, c3576s5.p0(i11));
                i11++;
            }
            return;
        }
        N4 n43 = this.f39529a;
        n43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c3576s5.size(); i15++) {
            c3576s5.p0(i15);
            i14 += 8;
        }
        n43.x(i14);
        while (i11 < c3576s5.size()) {
            n43.A(c3576s5.p0(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void b(int i10, double d10) {
        this.f39529a.n(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void c(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3576s5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    N4 n42 = this.f39529a;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    n42.m(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            N4 n43 = this.f39529a;
            n43.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iA += N4.a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            n43.x(iA);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                n43.z((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        C3576s5 c3576s5 = (C3576s5) list;
        if (!z10) {
            while (i11 < c3576s5.size()) {
                N4 n44 = this.f39529a;
                long jP0 = c3576s5.p0(i11);
                n44.m(i10, (jP0 >> 63) ^ (jP0 + jP0));
                i11++;
            }
            return;
        }
        N4 n45 = this.f39529a;
        n45.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c3576s5.size(); i13++) {
            long jP02 = c3576s5.p0(i13);
            iA2 += N4.a((jP02 >> 63) ^ (jP02 + jP02));
        }
        n45.x(iA2);
        while (i11 < c3576s5.size()) {
            long jP03 = c3576s5.p0(i11);
            n45.z((jP03 >> 63) ^ (jP03 + jP03));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void d(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3576s5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f39529a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            N4 n42 = this.f39529a;
            n42.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += N4.a(((Long) list.get(i12)).longValue());
            }
            n42.x(iA);
            while (i11 < list.size()) {
                n42.z(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C3576s5 c3576s5 = (C3576s5) list;
        if (!z10) {
            while (i11 < c3576s5.size()) {
                this.f39529a.m(i10, c3576s5.p0(i11));
                i11++;
            }
            return;
        }
        N4 n43 = this.f39529a;
        n43.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c3576s5.size(); i13++) {
            iA2 += N4.a(c3576s5.p0(i13));
        }
        n43.x(iA2);
        while (i11 < c3576s5.size()) {
            n43.z(c3576s5.p0(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void e(int i10, int i11) {
        this.f39529a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void f(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3576s5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f39529a.n(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            N4 n42 = this.f39529a;
            n42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            n42.x(i12);
            while (i11 < list.size()) {
                n42.A(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C3576s5 c3576s5 = (C3576s5) list;
        if (!z10) {
            while (i11 < c3576s5.size()) {
                this.f39529a.n(i10, c3576s5.p0(i11));
                i11++;
            }
            return;
        }
        N4 n43 = this.f39529a;
        n43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c3576s5.size(); i15++) {
            c3576s5.p0(i15);
            i14 += 8;
        }
        n43.x(i14);
        while (i11 < c3576s5.size()) {
            n43.A(c3576s5.p0(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void g(int i10, int i11) {
        this.f39529a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void h(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f39529a.n(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        N4 n42 = this.f39529a;
        n42.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        n42.x(i12);
        while (i11 < list.size()) {
            n42.A(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void i(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f39529a.o(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        N4 n42 = this.f39529a;
        n42.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        n42.x(i12);
        while (i11 < list.size()) {
            n42.v(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void j(int i10, int i11) {
        this.f39529a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void k(int i10, C3612w5 c3612w5, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            N4 n42 = this.f39529a;
            n42.i(i10, 2);
            n42.x(C3620x5.c(c3612w5, entry.getKey(), entry.getValue()));
            C3620x5.b(n42, c3612w5, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void l(int i10, Object obj, P5 p52) {
        this.f39529a.t(i10, (E5) obj, p52);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void m(int i10, long j10) {
        this.f39529a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void n(int i10, long j10) {
        this.f39529a.m(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void o(int i10) {
        this.f39529a.i(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void p(int i10) {
        this.f39529a.i(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void q(int i10, String str) {
        this.f39529a.p(i10, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void r(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3451e5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    N4 n42 = this.f39529a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    n42.k(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            N4 n43 = this.f39529a;
            n43.i(i10, 2);
            int iE = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iE += N4.E((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            n43.x(iE);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                n43.x((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        C3451e5 c3451e5 = (C3451e5) list;
        if (!z10) {
            while (i11 < c3451e5.size()) {
                N4 n44 = this.f39529a;
                int iD = c3451e5.d(i11);
                n44.k(i10, (iD >> 31) ^ (iD + iD));
                i11++;
            }
            return;
        }
        N4 n45 = this.f39529a;
        n45.i(i10, 2);
        int iE2 = 0;
        for (int i13 = 0; i13 < c3451e5.size(); i13++) {
            int iD2 = c3451e5.d(i13);
            iE2 += N4.E((iD2 >> 31) ^ (iD2 + iD2));
        }
        n45.x(iE2);
        while (i11 < c3451e5.size()) {
            int iD3 = c3451e5.d(i11);
            n45.x((iD3 >> 31) ^ (iD3 + iD3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void s(int i10, int i11) {
        this.f39529a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void t(int i10, Object obj, P5 p52) {
        N4 n42 = this.f39529a;
        n42.i(i10, 3);
        p52.h((E5) obj, n42.f39513a);
        n42.i(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void u(int i10, long j10) {
        this.f39529a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void v(int i10, float f10) {
        this.f39529a.l(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void w(int i10, I4 i42) {
        this.f39529a.q(i10, i42);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void x(int i10, long j10) {
        this.f39529a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3576s5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f39529a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            N4 n42 = this.f39529a;
            n42.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += N4.a(((Long) list.get(i12)).longValue());
            }
            n42.x(iA);
            while (i11 < list.size()) {
                n42.z(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C3576s5 c3576s5 = (C3576s5) list;
        if (!z10) {
            while (i11 < c3576s5.size()) {
                this.f39529a.m(i10, c3576s5.p0(i11));
                i11++;
            }
            return;
        }
        N4 n43 = this.f39529a;
        n43.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c3576s5.size(); i13++) {
            iA2 += N4.a(c3576s5.p0(i13));
        }
        n43.x(iA2);
        while (i11 < c3576s5.size()) {
            n43.z(c3576s5.p0(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3533n6
    public final void z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3451e5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f39529a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            N4 n42 = this.f39529a;
            n42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            n42.x(i12);
            while (i11 < list.size()) {
                n42.y(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C3451e5 c3451e5 = (C3451e5) list;
        if (!z10) {
            while (i11 < c3451e5.size()) {
                this.f39529a.l(i10, c3451e5.d(i11));
                i11++;
            }
            return;
        }
        N4 n43 = this.f39529a;
        n43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c3451e5.size(); i15++) {
            c3451e5.d(i15);
            i14 += 4;
        }
        n43.x(i14);
        while (i11 < c3451e5.size()) {
            n43.y(c3451e5.d(i11));
            i11++;
        }
    }
}
