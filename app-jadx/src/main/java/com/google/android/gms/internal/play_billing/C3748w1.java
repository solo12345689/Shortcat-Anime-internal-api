package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3748w1 implements G2 {

    /* JADX INFO: renamed from: a */
    private final AbstractC3744v1 f40583a;

    private C3748w1(AbstractC3744v1 abstractC3744v1) {
        byte[] bArr = P1.f40250b;
        this.f40583a = abstractC3744v1;
        abstractC3744v1.f40577a = this;
    }

    public static C3748w1 K(AbstractC3744v1 abstractC3744v1) {
        C3748w1 c3748w1 = abstractC3744v1.f40577a;
        return c3748w1 != null ? c3748w1 : new C3748w1(abstractC3744v1);
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void A(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof K1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f40583a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            AbstractC3744v1 abstractC3744v1 = this.f40583a;
            abstractC3744v1.u(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            abstractC3744v1.w(i12);
            while (i11 < list.size()) {
                abstractC3744v1.m(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        K1 k12 = (K1) list;
        if (!z10) {
            while (i11 < k12.size()) {
                this.f40583a.l(i10, k12.c(i11));
                i11++;
            }
            return;
        }
        AbstractC3744v1 abstractC3744v12 = this.f40583a;
        abstractC3744v12.u(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < k12.size(); i15++) {
            k12.c(i15);
            i14 += 4;
        }
        abstractC3744v12.w(i14);
        while (i11 < k12.size()) {
            abstractC3744v12.m(k12.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void B(int i10, long j10) {
        this.f40583a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void C(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof K1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f40583a.p(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            AbstractC3744v1 abstractC3744v1 = this.f40583a;
            abstractC3744v1.u(i10, 2);
            int iD = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iD += AbstractC3744v1.d(((Integer) list.get(i12)).intValue());
            }
            abstractC3744v1.w(iD);
            while (i11 < list.size()) {
                abstractC3744v1.q(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        K1 k12 = (K1) list;
        if (!z10) {
            while (i11 < k12.size()) {
                this.f40583a.p(i10, k12.c(i11));
                i11++;
            }
            return;
        }
        AbstractC3744v1 abstractC3744v12 = this.f40583a;
        abstractC3744v12.u(i10, 2);
        int iD2 = 0;
        for (int i13 = 0; i13 < k12.size(); i13++) {
            iD2 += AbstractC3744v1.d(k12.c(i13));
        }
        abstractC3744v12.w(iD2);
        while (i11 < k12.size()) {
            abstractC3744v12.q(k12.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void D(int i10, Object obj, InterfaceC3716p2 interfaceC3716p2) {
        this.f40583a.s(i10, (InterfaceC3666f2) obj, interfaceC3716p2);
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void E(int i10, float f10) {
        this.f40583a.l(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void F(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f40583a.x(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        AbstractC3744v1 abstractC3744v1 = this.f40583a;
        abstractC3744v1.u(i10, 2);
        int iD = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iD += AbstractC3744v1.d(((Long) list.get(i12)).longValue());
        }
        abstractC3744v1.w(iD);
        while (i11 < list.size()) {
            abstractC3744v1.y(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void G(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f40583a.n(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        AbstractC3744v1 abstractC3744v1 = this.f40583a;
        abstractC3744v1.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        abstractC3744v1.w(i12);
        while (i11 < list.size()) {
            abstractC3744v1.o(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void H(int i10, long j10) {
        this.f40583a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void I(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f40583a.t(i10, (String) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void J(int i10, long j10) {
        this.f40583a.x(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void a(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f40583a.n(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        AbstractC3744v1 abstractC3744v1 = this.f40583a;
        abstractC3744v1.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        abstractC3744v1.w(i12);
        while (i11 < list.size()) {
            abstractC3744v1.o(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void b(int i10, double d10) {
        this.f40583a.n(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void c(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f40583a.x(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        AbstractC3744v1 abstractC3744v1 = this.f40583a;
        abstractC3744v1.u(i10, 2);
        int iD = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iD += AbstractC3744v1.d(((Long) list.get(i12)).longValue());
        }
        abstractC3744v1.w(iD);
        while (i11 < list.size()) {
            abstractC3744v1.y(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void d(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof K1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f40583a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            AbstractC3744v1 abstractC3744v1 = this.f40583a;
            abstractC3744v1.u(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            abstractC3744v1.w(i12);
            while (i11 < list.size()) {
                abstractC3744v1.m(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        K1 k12 = (K1) list;
        if (!z10) {
            while (i11 < k12.size()) {
                this.f40583a.l(i10, k12.c(i11));
                i11++;
            }
            return;
        }
        AbstractC3744v1 abstractC3744v12 = this.f40583a;
        abstractC3744v12.u(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < k12.size(); i15++) {
            k12.c(i15);
            i14 += 4;
        }
        abstractC3744v12.w(i14);
        while (i11 < k12.size()) {
            abstractC3744v12.m(k12.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void e(int i10, int i11) {
        this.f40583a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void f(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof K1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f40583a.v(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            AbstractC3744v1 abstractC3744v1 = this.f40583a;
            abstractC3744v1.u(i10, 2);
            int iC = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iC += AbstractC3744v1.c(((Integer) list.get(i12)).intValue());
            }
            abstractC3744v1.w(iC);
            while (i11 < list.size()) {
                abstractC3744v1.w(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        K1 k12 = (K1) list;
        if (!z10) {
            while (i11 < k12.size()) {
                this.f40583a.v(i10, k12.c(i11));
                i11++;
            }
            return;
        }
        AbstractC3744v1 abstractC3744v12 = this.f40583a;
        abstractC3744v12.u(i10, 2);
        int iC2 = 0;
        for (int i13 = 0; i13 < k12.size(); i13++) {
            iC2 += AbstractC3744v1.c(k12.c(i13));
        }
        abstractC3744v12.w(iC2);
        while (i11 < k12.size()) {
            abstractC3744v12.w(k12.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void g(int i10, int i11) {
        this.f40583a.p(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void h(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof K1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    AbstractC3744v1 abstractC3744v1 = this.f40583a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    abstractC3744v1.v(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            AbstractC3744v1 abstractC3744v12 = this.f40583a;
            abstractC3744v12.u(i10, 2);
            int iC = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iC += AbstractC3744v1.c((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            abstractC3744v12.w(iC);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                abstractC3744v12.w((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        K1 k12 = (K1) list;
        if (!z10) {
            while (i11 < k12.size()) {
                AbstractC3744v1 abstractC3744v13 = this.f40583a;
                int iC2 = k12.c(i11);
                abstractC3744v13.v(i10, (iC2 >> 31) ^ (iC2 + iC2));
                i11++;
            }
            return;
        }
        AbstractC3744v1 abstractC3744v14 = this.f40583a;
        abstractC3744v14.u(i10, 2);
        int iC3 = 0;
        for (int i13 = 0; i13 < k12.size(); i13++) {
            int iC4 = k12.c(i13);
            iC3 += AbstractC3744v1.c((iC4 >> 31) ^ (iC4 + iC4));
        }
        abstractC3744v14.w(iC3);
        while (i11 < k12.size()) {
            int iC5 = k12.c(i11);
            abstractC3744v14.w((iC5 >> 31) ^ (iC5 + iC5));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void i(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                AbstractC3744v1 abstractC3744v1 = this.f40583a;
                long jLongValue = ((Long) list.get(i11)).longValue();
                abstractC3744v1.x(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return;
        }
        AbstractC3744v1 abstractC3744v12 = this.f40583a;
        abstractC3744v12.u(i10, 2);
        int iD = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iD += AbstractC3744v1.d((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        abstractC3744v12.w(iD);
        while (i11 < list.size()) {
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            abstractC3744v12.y((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void j(int i10, Object obj, InterfaceC3716p2 interfaceC3716p2) {
        AbstractC3744v1 abstractC3744v1 = this.f40583a;
        abstractC3744v1.u(i10, 3);
        interfaceC3716p2.d((InterfaceC3666f2) obj, abstractC3744v1.f40577a);
        abstractC3744v1.u(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void k(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f40583a.k(i10, (AbstractC3710o1) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void l(int i10, String str) {
        this.f40583a.t(i10, str);
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void m(int i10, boolean z10) {
        this.f40583a.j(i10, z10);
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void n(int i10, AbstractC3710o1 abstractC3710o1) {
        this.f40583a.k(i10, abstractC3710o1);
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void o(int i10, long j10) {
        this.f40583a.x(i10, j10);
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
    @Override // com.google.android.gms.internal.play_billing.G2
    public final void p(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f40583a.j(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        AbstractC3744v1 abstractC3744v1 = this.f40583a;
        abstractC3744v1.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        abstractC3744v1.w(i12);
        while (i11 < list.size()) {
            abstractC3744v1.i(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void q(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof K1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f40583a.p(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            AbstractC3744v1 abstractC3744v1 = this.f40583a;
            abstractC3744v1.u(i10, 2);
            int iD = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iD += AbstractC3744v1.d(((Integer) list.get(i12)).intValue());
            }
            abstractC3744v1.w(iD);
            while (i11 < list.size()) {
                abstractC3744v1.q(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        K1 k12 = (K1) list;
        if (!z10) {
            while (i11 < k12.size()) {
                this.f40583a.p(i10, k12.c(i11));
                i11++;
            }
            return;
        }
        AbstractC3744v1 abstractC3744v12 = this.f40583a;
        abstractC3744v12.u(i10, 2);
        int iD2 = 0;
        for (int i13 = 0; i13 < k12.size(); i13++) {
            iD2 += AbstractC3744v1.d(k12.c(i13));
        }
        abstractC3744v12.w(iD2);
        while (i11 < k12.size()) {
            abstractC3744v12.q(k12.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void r(int i10, int i11) {
        this.f40583a.p(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void s(int i10, long j10) {
        this.f40583a.x(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void t(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f40583a.n(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        AbstractC3744v1 abstractC3744v1 = this.f40583a;
        abstractC3744v1.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        abstractC3744v1.w(i12);
        while (i11 < list.size()) {
            abstractC3744v1.o(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void u(int i10, int i11) {
        this.f40583a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void v(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f40583a.l(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        AbstractC3744v1 abstractC3744v1 = this.f40583a;
        abstractC3744v1.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        abstractC3744v1.w(i12);
        while (i11 < list.size()) {
            abstractC3744v1.m(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void w(int i10, int i11) {
        this.f40583a.v(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void x(int i10) {
        this.f40583a.u(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void y(int i10) {
        this.f40583a.u(i10, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.G2
    public final void z(int i10, int i11) {
        this.f40583a.v(i10, i11);
    }
}
