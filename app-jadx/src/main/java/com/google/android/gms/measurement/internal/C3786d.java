package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C3601v3;
import com.google.android.gms.internal.measurement.N6;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3786d extends AbstractC3778c {

    /* JADX INFO: renamed from: g */
    private final com.google.android.gms.internal.measurement.L1 f41137g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ C3794e f41138h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3786d(C3794e c3794e, String str, int i10, com.google.android.gms.internal.measurement.L1 l12) {
        super(str, i10);
        Objects.requireNonNull(c3794e);
        this.f41138h = c3794e;
        this.f41137g = l12;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3778c
    final int a() {
        return this.f41137g.D();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3778c
    final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3778c
    final boolean c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean k(Long l10, Long l11, C3601v3 c3601v3, boolean z10) {
        N6.a();
        X2 x22 = this.f41138h.f40611a;
        boolean zH = x22.w().H(this.f41111a, AbstractC3789d2.f41150E0);
        com.google.android.gms.internal.measurement.L1 l12 = this.f41137g;
        boolean zG = l12.G();
        boolean zH2 = l12.H();
        boolean zJ = l12.J();
        byte b10 = zG || zH2 || zJ;
        Boolean boolE = null;
        boolE = null;
        boolE = null;
        boolE = null;
        boolE = null;
        if (z10 && b10 != true) {
            x22.a().w().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f41112b), l12.C() ? Integer.valueOf(l12.D()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.F1 f1F = l12.F();
        boolean zH3 = f1F.H();
        if (c3601v3.H()) {
            if (f1F.E()) {
                boolE = AbstractC3778c.e(AbstractC3778c.g(c3601v3.I(), f1F.F()), zH3);
            } else {
                x22.a().r().b("No number filter for long property. property", x22.D().c(c3601v3.E()));
            }
        } else if (c3601v3.L()) {
            if (f1F.E()) {
                boolE = AbstractC3778c.e(AbstractC3778c.h(c3601v3.M(), f1F.F()), zH3);
            } else {
                x22.a().r().b("No number filter for double property. property", x22.D().c(c3601v3.E()));
            }
        } else if (!c3601v3.F()) {
            x22.a().r().b("User property has no value, property", x22.D().c(c3601v3.E()));
        } else if (f1F.C()) {
            boolE = AbstractC3778c.e(AbstractC3778c.f(c3601v3.G(), f1F.D(), x22.a()), zH3);
        } else if (!f1F.E()) {
            x22.a().r().b("No string or number filter defined. property", x22.D().c(c3601v3.E()));
        } else if (u6.O(c3601v3.G())) {
            boolE = AbstractC3778c.e(AbstractC3778c.i(c3601v3.G(), f1F.F()), zH3);
        } else {
            x22.a().r().c("Invalid user property value for Numeric number filter. property, value", x22.D().c(c3601v3.E()), c3601v3.G());
        }
        x22.a().w().b("Property filter result", boolE == null ? "null" : boolE);
        if (boolE == null) {
            return false;
        }
        this.f41113c = Boolean.TRUE;
        if (zJ && !boolE.booleanValue()) {
            return true;
        }
        if (!z10 || l12.G()) {
            this.f41114d = boolE;
        }
        if (boolE.booleanValue() && b10 != false && c3601v3.C()) {
            long jD = c3601v3.D();
            if (l10 != null) {
                jD = l10.longValue();
            }
            if (zH && l12.G() && !l12.H() && l11 != null) {
                jD = l11.longValue();
            }
            if (l12.H()) {
                this.f41116f = Long.valueOf(jD);
            } else {
                this.f41115e = Long.valueOf(jD);
            }
        }
        return true;
    }
}
