package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3630z extends AbstractC3614x {
    public C3630z() {
        this.f40020a.add(N.EQUALS);
        this.f40020a.add(N.GREATER_THAN);
        this.f40020a.add(N.GREATER_THAN_EQUALS);
        this.f40020a.add(N.IDENTITY_EQUALS);
        this.f40020a.add(N.IDENTITY_NOT_EQUALS);
        this.f40020a.add(N.LESS_THAN);
        this.f40020a.add(N.LESS_THAN_EQUALS);
        this.f40020a.add(N.NOT_EQUALS);
    }

    private static boolean c(InterfaceC3553q interfaceC3553q, InterfaceC3553q interfaceC3553q2) {
        if (interfaceC3553q instanceof InterfaceC3517m) {
            interfaceC3553q = new C3588u(interfaceC3553q.k());
        }
        if (interfaceC3553q2 instanceof InterfaceC3517m) {
            interfaceC3553q2 = new C3588u(interfaceC3553q2.k());
        }
        if ((interfaceC3553q instanceof C3588u) && (interfaceC3553q2 instanceof C3588u)) {
            return interfaceC3553q.k().compareTo(interfaceC3553q2.k()) < 0;
        }
        double dDoubleValue = interfaceC3553q.l().doubleValue();
        double dDoubleValue2 = interfaceC3553q2.l().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    private static boolean d(InterfaceC3553q interfaceC3553q, InterfaceC3553q interfaceC3553q2) {
        if (interfaceC3553q.getClass().equals(interfaceC3553q2.getClass())) {
            if ((interfaceC3553q instanceof C3597v) || (interfaceC3553q instanceof C3535o)) {
                return true;
            }
            return interfaceC3553q instanceof C3490j ? (Double.isNaN(interfaceC3553q.l().doubleValue()) || Double.isNaN(interfaceC3553q2.l().doubleValue()) || interfaceC3553q.l().doubleValue() != interfaceC3553q2.l().doubleValue()) ? false : true : interfaceC3553q instanceof C3588u ? interfaceC3553q.k().equals(interfaceC3553q2.k()) : interfaceC3553q instanceof C3463g ? interfaceC3553q.m().equals(interfaceC3553q2.m()) : interfaceC3553q == interfaceC3553q2;
        }
        if (((interfaceC3553q instanceof C3597v) || (interfaceC3553q instanceof C3535o)) && ((interfaceC3553q2 instanceof C3597v) || (interfaceC3553q2 instanceof C3535o))) {
            return true;
        }
        boolean z10 = interfaceC3553q instanceof C3490j;
        if (z10 && (interfaceC3553q2 instanceof C3588u)) {
            return d(interfaceC3553q, new C3490j(interfaceC3553q2.l()));
        }
        boolean z11 = interfaceC3553q instanceof C3588u;
        if (z11 && (interfaceC3553q2 instanceof C3490j)) {
            return d(new C3490j(interfaceC3553q.l()), interfaceC3553q2);
        }
        if (interfaceC3553q instanceof C3463g) {
            return d(new C3490j(interfaceC3553q.l()), interfaceC3553q2);
        }
        if (interfaceC3553q2 instanceof C3463g) {
            return d(interfaceC3553q, new C3490j(interfaceC3553q2.l()));
        }
        if ((z11 || z10) && (interfaceC3553q2 instanceof InterfaceC3517m)) {
            return d(interfaceC3553q, new C3588u(interfaceC3553q2.k()));
        }
        if ((interfaceC3553q instanceof InterfaceC3517m) && ((interfaceC3553q2 instanceof C3588u) || (interfaceC3553q2 instanceof C3490j))) {
            return d(new C3588u(interfaceC3553q.k()), interfaceC3553q2);
        }
        return false;
    }

    private static boolean e(InterfaceC3553q interfaceC3553q, InterfaceC3553q interfaceC3553q2) {
        if (interfaceC3553q instanceof InterfaceC3517m) {
            interfaceC3553q = new C3588u(interfaceC3553q.k());
        }
        if (interfaceC3553q2 instanceof InterfaceC3517m) {
            interfaceC3553q2 = new C3588u(interfaceC3553q2.k());
        }
        return (((interfaceC3553q instanceof C3588u) && (interfaceC3553q2 instanceof C3588u)) || !(Double.isNaN(interfaceC3553q.l().doubleValue()) || Double.isNaN(interfaceC3553q2.l().doubleValue()))) && !c(interfaceC3553q2, interfaceC3553q);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3614x
    public final InterfaceC3553q a(String str, Y1 y12, List list) {
        boolean zD;
        boolean zD2;
        AbstractC3633z2.a(AbstractC3633z2.e(str).name(), 2, list);
        InterfaceC3553q interfaceC3553qA = y12.a((InterfaceC3553q) list.get(0));
        InterfaceC3553q interfaceC3553qA2 = y12.a((InterfaceC3553q) list.get(1));
        int iOrdinal = AbstractC3633z2.e(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal == 48) {
                zD2 = d(interfaceC3553qA, interfaceC3553qA2);
            } else if (iOrdinal == 42) {
                zD = c(interfaceC3553qA, interfaceC3553qA2);
            } else if (iOrdinal != 43) {
                switch (iOrdinal) {
                    case 37:
                        zD = c(interfaceC3553qA2, interfaceC3553qA);
                        break;
                    case 38:
                        zD = e(interfaceC3553qA2, interfaceC3553qA);
                        break;
                    case 39:
                        zD = AbstractC3633z2.f(interfaceC3553qA, interfaceC3553qA2);
                        break;
                    case 40:
                        zD2 = AbstractC3633z2.f(interfaceC3553qA, interfaceC3553qA2);
                        break;
                    default:
                        return super.b(str);
                }
            } else {
                zD = e(interfaceC3553qA, interfaceC3553qA2);
            }
            zD = !zD2;
        } else {
            zD = d(interfaceC3553qA, interfaceC3553qA2);
        }
        return zD ? InterfaceC3553q.f39934e0 : InterfaceC3553q.f39935f0;
    }
}
