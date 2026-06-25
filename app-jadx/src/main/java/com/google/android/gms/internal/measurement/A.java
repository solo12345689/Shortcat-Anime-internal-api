package com.google.android.gms.internal.measurement;

import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class A extends AbstractC3614x {
    protected A() {
        this.f40020a.add(N.APPLY);
        this.f40020a.add(N.BLOCK);
        this.f40020a.add(N.BREAK);
        this.f40020a.add(N.CASE);
        this.f40020a.add(N.DEFAULT);
        this.f40020a.add(N.CONTINUE);
        this.f40020a.add(N.DEFINE_FUNCTION);
        this.f40020a.add(N.FN);
        this.f40020a.add(N.IF);
        this.f40020a.add(N.QUOTE);
        this.f40020a.add(N.RETURN);
        this.f40020a.add(N.SWITCH);
        this.f40020a.add(N.TERNARY);
    }

    private static InterfaceC3553q c(Y1 y12, List list) {
        AbstractC3633z2.b(N.FN.name(), 2, list);
        InterfaceC3553q interfaceC3553qA = y12.a((InterfaceC3553q) list.get(0));
        InterfaceC3553q interfaceC3553qA2 = y12.a((InterfaceC3553q) list.get(1));
        if (!(interfaceC3553qA2 instanceof C3454f)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", interfaceC3553qA2.getClass().getCanonicalName()));
        }
        List listI = ((C3454f) interfaceC3553qA2).i();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C3544p(interfaceC3553qA.k(), listI, arrayList, y12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3614x
    public final InterfaceC3553q a(String str, Y1 y12, List list) {
        N n10 = N.ADD;
        int iOrdinal = AbstractC3633z2.e(str).ordinal();
        if (iOrdinal == 2) {
            AbstractC3633z2.a(N.APPLY.name(), 3, list);
            InterfaceC3553q interfaceC3553qA = y12.a((InterfaceC3553q) list.get(0));
            String strK = y12.a((InterfaceC3553q) list.get(1)).k();
            InterfaceC3553q interfaceC3553qA2 = y12.a((InterfaceC3553q) list.get(2));
            if (!(interfaceC3553qA2 instanceof C3454f)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", interfaceC3553qA2.getClass().getCanonicalName()));
            }
            if (strK.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return interfaceC3553qA.r(strK, y12, ((C3454f) interfaceC3553qA2).i());
        }
        if (iOrdinal == 15) {
            AbstractC3633z2.a(N.BREAK.name(), 0, list);
            return InterfaceC3553q.f39931b0;
        }
        if (iOrdinal == 25) {
            return c(y12, list);
        }
        if (iOrdinal == 41) {
            AbstractC3633z2.b(N.IF.name(), 2, list);
            InterfaceC3553q interfaceC3553qA3 = y12.a((InterfaceC3553q) list.get(0));
            InterfaceC3553q interfaceC3553qA4 = y12.a((InterfaceC3553q) list.get(1));
            InterfaceC3553q interfaceC3553qA5 = list.size() > 2 ? y12.a((InterfaceC3553q) list.get(2)) : null;
            InterfaceC3553q interfaceC3553q = InterfaceC3553q.f39929W;
            InterfaceC3553q interfaceC3553qB = interfaceC3553qA3.m().booleanValue() ? y12.b((C3454f) interfaceC3553qA4) : interfaceC3553qA5 != null ? y12.b((C3454f) interfaceC3553qA5) : interfaceC3553q;
            return true != (interfaceC3553qB instanceof C3472h) ? interfaceC3553q : interfaceC3553qB;
        }
        if (iOrdinal == 54) {
            return new C3454f(list);
        }
        if (iOrdinal == 57) {
            if (list.isEmpty()) {
                return InterfaceC3553q.f39933d0;
            }
            AbstractC3633z2.a(N.RETURN.name(), 1, list);
            return new C3472h("return", y12.a((InterfaceC3553q) list.get(0)));
        }
        if (iOrdinal != 19) {
            if (iOrdinal == 20) {
                AbstractC3633z2.b(N.DEFINE_FUNCTION.name(), 2, list);
                C3544p c3544p = (C3544p) c(y12, list);
                if (c3544p.g() == null) {
                    y12.e("", c3544p);
                    return c3544p;
                }
                y12.e(c3544p.g(), c3544p);
                return c3544p;
            }
            if (iOrdinal == 60) {
                AbstractC3633z2.a(N.SWITCH.name(), 3, list);
                InterfaceC3553q interfaceC3553qA6 = y12.a((InterfaceC3553q) list.get(0));
                InterfaceC3553q interfaceC3553qA7 = y12.a((InterfaceC3553q) list.get(1));
                InterfaceC3553q interfaceC3553qA8 = y12.a((InterfaceC3553q) list.get(2));
                if (!(interfaceC3553qA7 instanceof C3454f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(interfaceC3553qA8 instanceof C3454f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                C3454f c3454f = (C3454f) interfaceC3553qA7;
                C3454f c3454f2 = (C3454f) interfaceC3553qA8;
                boolean z10 = false;
                for (int i10 = 0; i10 < c3454f.t(); i10++) {
                    if (z10 || interfaceC3553qA6.equals(y12.a(c3454f.v(i10)))) {
                        InterfaceC3553q interfaceC3553qA9 = y12.a(c3454f2.v(i10));
                        if (interfaceC3553qA9 instanceof C3472h) {
                            return ((C3472h) interfaceC3553qA9).b().equals("break") ? InterfaceC3553q.f39929W : interfaceC3553qA9;
                        }
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (c3454f.t() + 1 == c3454f2.t()) {
                    InterfaceC3553q interfaceC3553qA10 = y12.a(c3454f2.v(c3454f.t()));
                    if (interfaceC3553qA10 instanceof C3472h) {
                        String strB = ((C3472h) interfaceC3553qA10).b();
                        if (strB.equals("return") || strB.equals("continue")) {
                            return interfaceC3553qA10;
                        }
                    }
                }
                return InterfaceC3553q.f39929W;
            }
            if (iOrdinal == 61) {
                AbstractC3633z2.a(N.TERNARY.name(), 3, list);
                return y12.a((InterfaceC3553q) list.get(0)).m().booleanValue() ? y12.a((InterfaceC3553q) list.get(1)) : y12.a((InterfaceC3553q) list.get(2));
            }
            switch (iOrdinal) {
                case 11:
                    return y12.c().b(new C3454f(list));
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    AbstractC3633z2.a(N.BREAK.name(), 0, list);
                    return InterfaceC3553q.f39932c0;
                case 13:
                    break;
                default:
                    return super.b(str);
            }
        }
        if (list.isEmpty()) {
            return InterfaceC3553q.f39929W;
        }
        InterfaceC3553q interfaceC3553qA11 = y12.a((InterfaceC3553q) list.get(0));
        return interfaceC3553qA11 instanceof C3454f ? y12.b((C3454f) interfaceC3553qA11) : InterfaceC3553q.f39929W;
    }
}
