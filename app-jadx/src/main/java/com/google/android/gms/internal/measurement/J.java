package com.google.android.gms.internal.measurement;

import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class J extends AbstractC3614x {
    protected J() {
        this.f40020a.add(N.FOR_IN);
        this.f40020a.add(N.FOR_IN_CONST);
        this.f40020a.add(N.FOR_IN_LET);
        this.f40020a.add(N.FOR_LET);
        this.f40020a.add(N.FOR_OF);
        this.f40020a.add(N.FOR_OF_CONST);
        this.f40020a.add(N.FOR_OF_LET);
        this.f40020a.add(N.WHILE);
    }

    private static InterfaceC3553q c(H h10, InterfaceC3553q interfaceC3553q, InterfaceC3553q interfaceC3553q2) {
        return e(h10, interfaceC3553q.n(), interfaceC3553q2);
    }

    private static InterfaceC3553q d(H h10, InterfaceC3553q interfaceC3553q, InterfaceC3553q interfaceC3553q2) {
        if (interfaceC3553q instanceof Iterable) {
            return e(h10, ((Iterable) interfaceC3553q).iterator(), interfaceC3553q2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    private static InterfaceC3553q e(H h10, Iterator it, InterfaceC3553q interfaceC3553q) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC3553q interfaceC3553qB = h10.a((InterfaceC3553q) it.next()).b((C3454f) interfaceC3553q);
                if (interfaceC3553qB instanceof C3472h) {
                    C3472h c3472h = (C3472h) interfaceC3553qB;
                    if ("break".equals(c3472h.b())) {
                        return InterfaceC3553q.f39929W;
                    }
                    if ("return".equals(c3472h.b())) {
                        return c3472h;
                    }
                }
            }
        }
        return InterfaceC3553q.f39929W;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3614x
    public final InterfaceC3553q a(String str, Y1 y12, List list) {
        N n10 = N.ADD;
        int iOrdinal = AbstractC3633z2.e(str).ordinal();
        if (iOrdinal == 65) {
            AbstractC3633z2.a(N.WHILE.name(), 4, list);
            InterfaceC3553q interfaceC3553q = (InterfaceC3553q) list.get(0);
            InterfaceC3553q interfaceC3553q2 = (InterfaceC3553q) list.get(1);
            InterfaceC3553q interfaceC3553q3 = (InterfaceC3553q) list.get(2);
            InterfaceC3553q interfaceC3553qA = y12.a((InterfaceC3553q) list.get(3));
            if (y12.a(interfaceC3553q3).m().booleanValue()) {
                InterfaceC3553q interfaceC3553qB = y12.b((C3454f) interfaceC3553qA);
                if (interfaceC3553qB instanceof C3472h) {
                    C3472h c3472h = (C3472h) interfaceC3553qB;
                    if ("break".equals(c3472h.b())) {
                        return InterfaceC3553q.f39929W;
                    }
                    if ("return".equals(c3472h.b())) {
                        return c3472h;
                    }
                }
            }
            while (y12.a(interfaceC3553q).m().booleanValue()) {
                InterfaceC3553q interfaceC3553qB2 = y12.b((C3454f) interfaceC3553qA);
                if (interfaceC3553qB2 instanceof C3472h) {
                    C3472h c3472h2 = (C3472h) interfaceC3553qB2;
                    if ("break".equals(c3472h2.b())) {
                        return InterfaceC3553q.f39929W;
                    }
                    if ("return".equals(c3472h2.b())) {
                        return c3472h2;
                    }
                }
                y12.a(interfaceC3553q2);
            }
            return InterfaceC3553q.f39929W;
        }
        switch (iOrdinal) {
            case 26:
                AbstractC3633z2.a(N.FOR_IN.name(), 3, list);
                if (!(list.get(0) instanceof C3588u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return c(new I(y12, ((InterfaceC3553q) list.get(0)).k()), y12.a((InterfaceC3553q) list.get(1)), y12.a((InterfaceC3553q) list.get(2)));
            case 27:
                AbstractC3633z2.a(N.FOR_IN_CONST.name(), 3, list);
                if (!(list.get(0) instanceof C3588u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return c(new F(y12, ((InterfaceC3553q) list.get(0)).k()), y12.a((InterfaceC3553q) list.get(1)), y12.a((InterfaceC3553q) list.get(2)));
            case 28:
                AbstractC3633z2.a(N.FOR_IN_LET.name(), 3, list);
                if (!(list.get(0) instanceof C3588u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return c(new G(y12, ((InterfaceC3553q) list.get(0)).k()), y12.a((InterfaceC3553q) list.get(1)), y12.a((InterfaceC3553q) list.get(2)));
            case 29:
                AbstractC3633z2.a(N.FOR_LET.name(), 4, list);
                InterfaceC3553q interfaceC3553qA2 = y12.a((InterfaceC3553q) list.get(0));
                if (!(interfaceC3553qA2 instanceof C3454f)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                C3454f c3454f = (C3454f) interfaceC3553qA2;
                InterfaceC3553q interfaceC3553q4 = (InterfaceC3553q) list.get(1);
                InterfaceC3553q interfaceC3553q5 = (InterfaceC3553q) list.get(2);
                InterfaceC3553q interfaceC3553qA3 = y12.a((InterfaceC3553q) list.get(3));
                Y1 y1C = y12.c();
                for (int i10 = 0; i10 < c3454f.t(); i10++) {
                    String strK = c3454f.v(i10).k();
                    y1C.e(strK, y12.h(strK));
                }
                while (y12.a(interfaceC3553q4).m().booleanValue()) {
                    InterfaceC3553q interfaceC3553qB3 = y12.b((C3454f) interfaceC3553qA3);
                    if (interfaceC3553qB3 instanceof C3472h) {
                        C3472h c3472h3 = (C3472h) interfaceC3553qB3;
                        if ("break".equals(c3472h3.b())) {
                            return InterfaceC3553q.f39929W;
                        }
                        if ("return".equals(c3472h3.b())) {
                            return c3472h3;
                        }
                    }
                    Y1 y1C2 = y12.c();
                    for (int i11 = 0; i11 < c3454f.t(); i11++) {
                        String strK2 = c3454f.v(i11).k();
                        y1C2.e(strK2, y1C.h(strK2));
                    }
                    y1C2.a(interfaceC3553q5);
                    y1C = y1C2;
                }
                return InterfaceC3553q.f39929W;
            case 30:
                AbstractC3633z2.a(N.FOR_OF.name(), 3, list);
                if (!(list.get(0) instanceof C3588u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return d(new I(y12, ((InterfaceC3553q) list.get(0)).k()), y12.a((InterfaceC3553q) list.get(1)), y12.a((InterfaceC3553q) list.get(2)));
            case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                AbstractC3633z2.a(N.FOR_OF_CONST.name(), 3, list);
                if (!(list.get(0) instanceof C3588u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return d(new F(y12, ((InterfaceC3553q) list.get(0)).k()), y12.a((InterfaceC3553q) list.get(1)), y12.a((InterfaceC3553q) list.get(2)));
            case 32:
                AbstractC3633z2.a(N.FOR_OF_LET.name(), 3, list);
                if (!(list.get(0) instanceof C3588u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return d(new G(y12, ((InterfaceC3553q) list.get(0)).k()), y12.a((InterfaceC3553q) list.get(1)), y12.a((InterfaceC3553q) list.get(2)));
            default:
                return super.b(str);
        }
    }
}
