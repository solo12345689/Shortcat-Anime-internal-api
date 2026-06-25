package com.google.android.gms.internal.measurement;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class M extends AbstractC3614x {
    protected M() {
        this.f40020a.add(N.ASSIGN);
        this.f40020a.add(N.CONST);
        this.f40020a.add(N.CREATE_ARRAY);
        this.f40020a.add(N.CREATE_OBJECT);
        this.f40020a.add(N.EXPRESSION_LIST);
        this.f40020a.add(N.GET);
        this.f40020a.add(N.GET_INDEX);
        this.f40020a.add(N.GET_PROPERTY);
        this.f40020a.add(N.NULL);
        this.f40020a.add(N.SET_PROPERTY);
        this.f40020a.add(N.TYPEOF);
        this.f40020a.add(N.UNDEFINED);
        this.f40020a.add(N.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3614x
    public final InterfaceC3553q a(String str, Y1 y12, List list) {
        String str2;
        N n10 = N.ADD;
        int iOrdinal = AbstractC3633z2.e(str).ordinal();
        int i10 = 0;
        if (iOrdinal == 3) {
            AbstractC3633z2.a(N.ASSIGN.name(), 2, list);
            InterfaceC3553q interfaceC3553qA = y12.a((InterfaceC3553q) list.get(0));
            if (!(interfaceC3553qA instanceof C3588u)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", interfaceC3553qA.getClass().getCanonicalName()));
            }
            if (!y12.d(interfaceC3553qA.k())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", interfaceC3553qA.k()));
            }
            InterfaceC3553q interfaceC3553qA2 = y12.a((InterfaceC3553q) list.get(1));
            y12.e(interfaceC3553qA.k(), interfaceC3553qA2);
            return interfaceC3553qA2;
        }
        if (iOrdinal == 14) {
            AbstractC3633z2.b(N.CONST.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            while (i10 < list.size() - 1) {
                InterfaceC3553q interfaceC3553qA3 = y12.a((InterfaceC3553q) list.get(i10));
                if (!(interfaceC3553qA3 instanceof C3588u)) {
                    throw new IllegalArgumentException(String.format("Expected string for const name. got %s", interfaceC3553qA3.getClass().getCanonicalName()));
                }
                y12.g(interfaceC3553qA3.k(), y12.a((InterfaceC3553q) list.get(i10 + 1)));
                i10 += 2;
            }
            return InterfaceC3553q.f39929W;
        }
        if (iOrdinal == 24) {
            AbstractC3633z2.b(N.EXPRESSION_LIST.name(), 1, list);
            InterfaceC3553q interfaceC3553qA4 = InterfaceC3553q.f39929W;
            while (i10 < list.size()) {
                interfaceC3553qA4 = y12.a((InterfaceC3553q) list.get(i10));
                if (interfaceC3553qA4 instanceof C3472h) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i10++;
            }
            return interfaceC3553qA4;
        }
        if (iOrdinal == 33) {
            AbstractC3633z2.a(N.GET.name(), 1, list);
            InterfaceC3553q interfaceC3553qA5 = y12.a((InterfaceC3553q) list.get(0));
            if (interfaceC3553qA5 instanceof C3588u) {
                return y12.h(interfaceC3553qA5.k());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", interfaceC3553qA5.getClass().getCanonicalName()));
        }
        if (iOrdinal == 49) {
            AbstractC3633z2.a(N.NULL.name(), 0, list);
            return InterfaceC3553q.f39930a0;
        }
        if (iOrdinal == 58) {
            AbstractC3633z2.a(N.SET_PROPERTY.name(), 3, list);
            InterfaceC3553q interfaceC3553qA6 = y12.a((InterfaceC3553q) list.get(0));
            InterfaceC3553q interfaceC3553qA7 = y12.a((InterfaceC3553q) list.get(1));
            InterfaceC3553q interfaceC3553qA8 = y12.a((InterfaceC3553q) list.get(2));
            if (interfaceC3553qA6 == InterfaceC3553q.f39929W || interfaceC3553qA6 == InterfaceC3553q.f39930a0) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", interfaceC3553qA7.k(), interfaceC3553qA6.k()));
            }
            if ((interfaceC3553qA6 instanceof C3454f) && (interfaceC3553qA7 instanceof C3490j)) {
                ((C3454f) interfaceC3553qA6).w(interfaceC3553qA7.l().intValue(), interfaceC3553qA8);
                return interfaceC3553qA8;
            }
            if (!(interfaceC3553qA6 instanceof InterfaceC3517m)) {
                return interfaceC3553qA8;
            }
            ((InterfaceC3517m) interfaceC3553qA6).d(interfaceC3553qA7.k(), interfaceC3553qA8);
            return interfaceC3553qA8;
        }
        if (iOrdinal == 17) {
            if (list.isEmpty()) {
                return new C3454f();
            }
            C3454f c3454f = new C3454f();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC3553q interfaceC3553qA9 = y12.a((InterfaceC3553q) it.next());
                if (interfaceC3553qA9 instanceof C3472h) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                c3454f.w(i10, interfaceC3553qA9);
                i10++;
            }
            return c3454f;
        }
        if (iOrdinal == 18) {
            if (list.isEmpty()) {
                return new C3526n();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            C3526n c3526n = new C3526n();
            while (i10 < list.size() - 1) {
                InterfaceC3553q interfaceC3553qA10 = y12.a((InterfaceC3553q) list.get(i10));
                InterfaceC3553q interfaceC3553qA11 = y12.a((InterfaceC3553q) list.get(i10 + 1));
                if ((interfaceC3553qA10 instanceof C3472h) || (interfaceC3553qA11 instanceof C3472h)) {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
                c3526n.d(interfaceC3553qA10.k(), interfaceC3553qA11);
                i10 += 2;
            }
            return c3526n;
        }
        if (iOrdinal == 35 || iOrdinal == 36) {
            AbstractC3633z2.a(N.GET_PROPERTY.name(), 2, list);
            InterfaceC3553q interfaceC3553qA12 = y12.a((InterfaceC3553q) list.get(0));
            InterfaceC3553q interfaceC3553qA13 = y12.a((InterfaceC3553q) list.get(1));
            if ((interfaceC3553qA12 instanceof C3454f) && AbstractC3633z2.d(interfaceC3553qA13)) {
                return ((C3454f) interfaceC3553qA12).v(interfaceC3553qA13.l().intValue());
            }
            if (interfaceC3553qA12 instanceof InterfaceC3517m) {
                return ((InterfaceC3517m) interfaceC3553qA12).c(interfaceC3553qA13.k());
            }
            if (interfaceC3553qA12 instanceof C3588u) {
                if ("length".equals(interfaceC3553qA13.k())) {
                    return new C3490j(Double.valueOf(interfaceC3553qA12.k().length()));
                }
                if (AbstractC3633z2.d(interfaceC3553qA13) && interfaceC3553qA13.l().doubleValue() < interfaceC3553qA12.k().length()) {
                    return new C3588u(String.valueOf(interfaceC3553qA12.k().charAt(interfaceC3553qA13.l().intValue())));
                }
            }
            return InterfaceC3553q.f39929W;
        }
        switch (iOrdinal) {
            case 62:
                AbstractC3633z2.a(N.TYPEOF.name(), 1, list);
                InterfaceC3553q interfaceC3553qA14 = y12.a((InterfaceC3553q) list.get(0));
                if (interfaceC3553qA14 instanceof C3597v) {
                    str2 = "undefined";
                } else if (interfaceC3553qA14 instanceof C3463g) {
                    str2 = "boolean";
                } else if (interfaceC3553qA14 instanceof C3490j) {
                    str2 = "number";
                } else if (interfaceC3553qA14 instanceof C3588u) {
                    str2 = "string";
                } else if (interfaceC3553qA14 instanceof C3544p) {
                    str2 = "function";
                } else {
                    if ((interfaceC3553qA14 instanceof r) || (interfaceC3553qA14 instanceof C3472h)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", interfaceC3553qA14));
                    }
                    str2 = "object";
                }
                return new C3588u(str2);
            case 63:
                AbstractC3633z2.a(N.UNDEFINED.name(), 0, list);
                return InterfaceC3553q.f39929W;
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                AbstractC3633z2.b(N.VAR.name(), 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC3553q interfaceC3553qA15 = y12.a((InterfaceC3553q) it2.next());
                    if (!(interfaceC3553qA15 instanceof C3588u)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", interfaceC3553qA15.getClass().getCanonicalName()));
                    }
                    y12.f(interfaceC3553qA15.k(), InterfaceC3553q.f39929W);
                }
                return InterfaceC3553q.f39929W;
            default:
                return super.b(str);
        }
    }
}
