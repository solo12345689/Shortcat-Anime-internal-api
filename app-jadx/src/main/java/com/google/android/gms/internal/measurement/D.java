package com.google.android.gms.internal.measurement;

import com.adjust.sdk.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class D {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static InterfaceC3553q a(String str, C3454f c3454f, Y1 y12, List list) {
        double dT;
        Double dValueOf = Double.valueOf(-1.0d);
        int iHashCode = str.hashCode();
        String strK = com.amazon.a.a.o.b.f.f34694a;
        double dT2 = 0.0d;
        AbstractC3499k abstractC3499k = null;
        int i10 = 0;
        switch (iHashCode) {
            case -1776922004:
                if (str.equals("toString")) {
                    AbstractC3633z2.a("toString", 0, list);
                    return new C3588u(c3454f.B(com.amazon.a.a.o.b.f.f34694a));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                if (str.equals("concat")) {
                    C3454f c3454f2 = (C3454f) c3454f.p();
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            InterfaceC3553q interfaceC3553qA = y12.a((InterfaceC3553q) it.next());
                            if (interfaceC3553qA instanceof C3472h) {
                                throw new IllegalStateException("Failed evaluation of arguments");
                            }
                            int iT = c3454f2.t();
                            if (interfaceC3553qA instanceof C3454f) {
                                C3454f c3454f3 = (C3454f) interfaceC3553qA;
                                Iterator itS = c3454f3.s();
                                while (itS.hasNext()) {
                                    Integer num = (Integer) itS.next();
                                    c3454f2.w(num.intValue() + iT, c3454f3.v(num.intValue()));
                                }
                            } else {
                                c3454f2.w(iT, interfaceC3553qA);
                            }
                        }
                    }
                    return c3454f2;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1274492040:
                if (str.equals("filter")) {
                    AbstractC3633z2.a("filter", 1, list);
                    InterfaceC3553q interfaceC3553qA2 = y12.a((InterfaceC3553q) list.get(0));
                    if (!(interfaceC3553qA2 instanceof C3544p)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (c3454f.u() == 0) {
                        return new C3454f();
                    }
                    C3454f c3454f4 = (C3454f) c3454f.p();
                    C3454f c3454fC = c(c3454f, y12, (C3544p) interfaceC3553qA2, null, Boolean.TRUE);
                    C3454f c3454f5 = new C3454f();
                    Iterator itS2 = c3454fC.s();
                    while (itS2.hasNext()) {
                        c3454f5.w(c3454f5.t(), c3454f4.v(((Integer) itS2.next()).intValue()));
                    }
                    return c3454f5;
                }
                throw new IllegalArgumentException("Command not supported");
            case -934873754:
                if (str.equals("reduce")) {
                    return b(c3454f, y12, list, true);
                }
                throw new IllegalArgumentException("Command not supported");
            case -895859076:
                if (str.equals("splice")) {
                    if (list.isEmpty()) {
                        return new C3454f();
                    }
                    int i11 = (int) AbstractC3633z2.i(y12.a((InterfaceC3553q) list.get(0)).l().doubleValue());
                    if (i11 < 0) {
                        i11 = Math.max(0, i11 + c3454f.t());
                    } else if (i11 > c3454f.t()) {
                        i11 = c3454f.t();
                    }
                    int iT2 = c3454f.t();
                    C3454f c3454f6 = new C3454f();
                    if (list.size() > 1) {
                        int iMax = Math.max(0, (int) AbstractC3633z2.i(y12.a((InterfaceC3553q) list.get(1)).l().doubleValue()));
                        if (iMax > 0) {
                            for (int i12 = i11; i12 < Math.min(iT2, i11 + iMax); i12++) {
                                c3454f6.w(c3454f6.t(), c3454f.v(i11));
                                c3454f.A(i11);
                            }
                        }
                        if (list.size() > 2) {
                            for (int i13 = 2; i13 < list.size(); i13++) {
                                InterfaceC3553q interfaceC3553qA3 = y12.a((InterfaceC3553q) list.get(i13));
                                if (interfaceC3553qA3 instanceof C3472h) {
                                    throw new IllegalArgumentException("Failed to parse elements to add");
                                }
                                c3454f.z((i11 + i13) - 2, interfaceC3553qA3);
                            }
                        }
                    } else {
                        while (i11 < iT2) {
                            c3454f6.w(c3454f6.t(), c3454f.v(i11));
                            c3454f.w(i11, null);
                            i11++;
                        }
                    }
                    return c3454f6;
                }
                throw new IllegalArgumentException("Command not supported");
            case -678635926:
                if (str.equals("forEach")) {
                    AbstractC3633z2.a("forEach", 1, list);
                    InterfaceC3553q interfaceC3553qA4 = y12.a((InterfaceC3553q) list.get(0));
                    if (!(interfaceC3553qA4 instanceof C3544p)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (c3454f.u() == 0) {
                        return InterfaceC3553q.f39929W;
                    }
                    c(c3454f, y12, (C3544p) interfaceC3553qA4, null, null);
                    return InterfaceC3553q.f39929W;
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    AbstractC3633z2.c("lastIndexOf", 2, list);
                    InterfaceC3553q interfaceC3553qA5 = InterfaceC3553q.f39929W;
                    if (!list.isEmpty()) {
                        interfaceC3553qA5 = y12.a((InterfaceC3553q) list.get(0));
                    }
                    int iT3 = c3454f.t() - 1;
                    if (list.size() > 1) {
                        InterfaceC3553q interfaceC3553qA6 = y12.a((InterfaceC3553q) list.get(1));
                        dT = Double.isNaN(interfaceC3553qA6.l().doubleValue()) ? c3454f.t() - 1 : AbstractC3633z2.i(interfaceC3553qA6.l().doubleValue());
                        if (dT < 0.0d) {
                            dT += (double) c3454f.t();
                        }
                    } else {
                        dT = iT3;
                    }
                    if (dT < 0.0d) {
                        return new C3490j(dValueOf);
                    }
                    for (int iMin = (int) Math.min(c3454f.t(), dT); iMin >= 0; iMin--) {
                        if (c3454f.x(iMin) && AbstractC3633z2.f(c3454f.v(iMin), interfaceC3553qA5)) {
                            return new C3490j(Double.valueOf(iMin));
                        }
                    }
                    return new C3490j(dValueOf);
                }
                throw new IllegalArgumentException("Command not supported");
            case -277637751:
                if (str.equals("unshift")) {
                    if (!list.isEmpty()) {
                        C3454f c3454f7 = new C3454f();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            InterfaceC3553q interfaceC3553qA7 = y12.a((InterfaceC3553q) it2.next());
                            if (interfaceC3553qA7 instanceof C3472h) {
                                throw new IllegalStateException("Argument evaluation failed");
                            }
                            c3454f7.w(c3454f7.t(), interfaceC3553qA7);
                        }
                        int iT4 = c3454f7.t();
                        Iterator itS3 = c3454f.s();
                        while (itS3.hasNext()) {
                            Integer num2 = (Integer) itS3.next();
                            c3454f7.w(num2.intValue() + iT4, c3454f.v(num2.intValue()));
                        }
                        c3454f.y();
                        Iterator itS4 = c3454f7.s();
                        while (itS4.hasNext()) {
                            Integer num3 = (Integer) itS4.next();
                            c3454f.w(num3.intValue(), c3454f7.v(num3.intValue()));
                        }
                    }
                    return new C3490j(Double.valueOf(c3454f.t()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 107868:
                if (str.equals("map")) {
                    AbstractC3633z2.a("map", 1, list);
                    InterfaceC3553q interfaceC3553qA8 = y12.a((InterfaceC3553q) list.get(0));
                    if (interfaceC3553qA8 instanceof C3544p) {
                        return c3454f.t() == 0 ? new C3454f() : c(c3454f, y12, (C3544p) interfaceC3553qA8, null, null);
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                }
                throw new IllegalArgumentException("Command not supported");
            case 111185:
                if (str.equals("pop")) {
                    AbstractC3633z2.a("pop", 0, list);
                    int iT5 = c3454f.t();
                    if (iT5 == 0) {
                        return InterfaceC3553q.f39929W;
                    }
                    int i14 = iT5 - 1;
                    InterfaceC3553q interfaceC3553qV = c3454f.v(i14);
                    c3454f.A(i14);
                    return interfaceC3553qV;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3267882:
                if (str.equals("join")) {
                    AbstractC3633z2.c("join", 1, list);
                    if (c3454f.t() == 0) {
                        return InterfaceC3553q.f39936g0;
                    }
                    if (!list.isEmpty()) {
                        InterfaceC3553q interfaceC3553qA9 = y12.a((InterfaceC3553q) list.get(0));
                        strK = ((interfaceC3553qA9 instanceof C3535o) || (interfaceC3553qA9 instanceof C3597v)) ? "" : interfaceC3553qA9.k();
                    }
                    return new C3588u(c3454f.B(strK));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3452698:
                if (str.equals(Constants.PUSH)) {
                    if (!list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            c3454f.w(c3454f.t(), y12.a((InterfaceC3553q) it3.next()));
                        }
                    }
                    return new C3490j(Double.valueOf(c3454f.t()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536116:
                if (str.equals("some")) {
                    AbstractC3633z2.a("some", 1, list);
                    InterfaceC3553q interfaceC3553qA10 = y12.a((InterfaceC3553q) list.get(0));
                    if (!(interfaceC3553qA10 instanceof AbstractC3499k)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (c3454f.t() == 0) {
                        return InterfaceC3553q.f39935f0;
                    }
                    AbstractC3499k abstractC3499k2 = (AbstractC3499k) interfaceC3553qA10;
                    Iterator itS5 = c3454f.s();
                    while (itS5.hasNext()) {
                        int iIntValue = ((Integer) itS5.next()).intValue();
                        if (c3454f.x(iIntValue) && abstractC3499k2.a(y12, Arrays.asList(c3454f.v(iIntValue), new C3490j(Double.valueOf(iIntValue)), c3454f)).m().booleanValue()) {
                            return InterfaceC3553q.f39934e0;
                        }
                    }
                    return InterfaceC3553q.f39935f0;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536286:
                if (str.equals("sort")) {
                    AbstractC3633z2.c("sort", 1, list);
                    if (c3454f.t() >= 2) {
                        List listI = c3454f.i();
                        if (!list.isEmpty()) {
                            InterfaceC3553q interfaceC3553qA11 = y12.a((InterfaceC3553q) list.get(0));
                            if (!(interfaceC3553qA11 instanceof AbstractC3499k)) {
                                throw new IllegalArgumentException("Comparator should be a method");
                            }
                            abstractC3499k = (AbstractC3499k) interfaceC3553qA11;
                        }
                        Collections.sort(listI, new B(abstractC3499k, y12));
                        c3454f.y();
                        Iterator it4 = listI.iterator();
                        while (it4.hasNext()) {
                            c3454f.w(i10, (InterfaceC3553q) it4.next());
                            i10++;
                        }
                    }
                    return c3454f;
                }
                throw new IllegalArgumentException("Command not supported");
            case 96891675:
                if (str.equals("every")) {
                    AbstractC3633z2.a("every", 1, list);
                    InterfaceC3553q interfaceC3553qA12 = y12.a((InterfaceC3553q) list.get(0));
                    if (interfaceC3553qA12 instanceof C3544p) {
                        return c3454f.t() == 0 ? InterfaceC3553q.f39934e0 : c(c3454f, y12, (C3544p) interfaceC3553qA12, Boolean.FALSE, Boolean.TRUE).t() != c3454f.t() ? InterfaceC3553q.f39935f0 : InterfaceC3553q.f39934e0;
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                }
                throw new IllegalArgumentException("Command not supported");
            case 109407362:
                if (str.equals("shift")) {
                    AbstractC3633z2.a("shift", 0, list);
                    if (c3454f.t() == 0) {
                        return InterfaceC3553q.f39929W;
                    }
                    InterfaceC3553q interfaceC3553qV2 = c3454f.v(0);
                    c3454f.A(0);
                    return interfaceC3553qV2;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    AbstractC3633z2.c("slice", 2, list);
                    if (list.isEmpty()) {
                        return c3454f.p();
                    }
                    double dT3 = c3454f.t();
                    double dI = AbstractC3633z2.i(y12.a((InterfaceC3553q) list.get(0)).l().doubleValue());
                    double dMax = dI < 0.0d ? Math.max(dI + dT3, 0.0d) : Math.min(dI, dT3);
                    if (list.size() == 2) {
                        double dI2 = AbstractC3633z2.i(y12.a((InterfaceC3553q) list.get(1)).l().doubleValue());
                        dT3 = dI2 < 0.0d ? Math.max(dT3 + dI2, 0.0d) : Math.min(dT3, dI2);
                    }
                    C3454f c3454f8 = new C3454f();
                    for (int i15 = (int) dMax; i15 < dT3; i15++) {
                        c3454f8.w(c3454f8.t(), c3454f.v(i15));
                    }
                    return c3454f8;
                }
                throw new IllegalArgumentException("Command not supported");
            case 965561430:
                if (str.equals("reduceRight")) {
                    return b(c3454f, y12, list, false);
                }
                throw new IllegalArgumentException("Command not supported");
            case 1099846370:
                if (str.equals("reverse")) {
                    AbstractC3633z2.a("reverse", 0, list);
                    int iT6 = c3454f.t();
                    if (iT6 != 0) {
                        while (i10 < iT6 / 2) {
                            if (c3454f.x(i10)) {
                                InterfaceC3553q interfaceC3553qV3 = c3454f.v(i10);
                                c3454f.w(i10, null);
                                int i16 = (iT6 - 1) - i10;
                                if (c3454f.x(i16)) {
                                    c3454f.w(i10, c3454f.v(i16));
                                }
                                c3454f.w(i16, interfaceC3553qV3);
                            }
                            i10++;
                        }
                    }
                    return c3454f;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    AbstractC3633z2.c("indexOf", 2, list);
                    InterfaceC3553q interfaceC3553qA13 = InterfaceC3553q.f39929W;
                    if (!list.isEmpty()) {
                        interfaceC3553qA13 = y12.a((InterfaceC3553q) list.get(0));
                    }
                    if (list.size() > 1) {
                        double dI3 = AbstractC3633z2.i(y12.a((InterfaceC3553q) list.get(1)).l().doubleValue());
                        if (dI3 >= c3454f.t()) {
                            return new C3490j(dValueOf);
                        }
                        dT2 = dI3 < 0.0d ? ((double) c3454f.t()) + dI3 : dI3;
                    }
                    Iterator itS6 = c3454f.s();
                    while (itS6.hasNext()) {
                        int iIntValue2 = ((Integer) itS6.next()).intValue();
                        double d10 = iIntValue2;
                        if (d10 >= dT2 && AbstractC3633z2.f(c3454f.v(iIntValue2), interfaceC3553qA13)) {
                            return new C3490j(Double.valueOf(d10));
                        }
                    }
                    return new C3490j(dValueOf);
                }
                throw new IllegalArgumentException("Command not supported");
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static InterfaceC3553q b(C3454f c3454f, Y1 y12, List list, boolean z10) {
        InterfaceC3553q interfaceC3553qA;
        AbstractC3633z2.b("reduce", 1, list);
        AbstractC3633z2.c("reduce", 2, list);
        InterfaceC3553q interfaceC3553qA2 = y12.a((InterfaceC3553q) list.get(0));
        if (!(interfaceC3553qA2 instanceof AbstractC3499k)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            interfaceC3553qA = y12.a((InterfaceC3553q) list.get(1));
            if (interfaceC3553qA instanceof C3472h) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c3454f.t() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC3553qA = null;
        }
        AbstractC3499k abstractC3499k = (AbstractC3499k) interfaceC3553qA2;
        int iT = c3454f.t();
        int i10 = z10 ? 0 : iT - 1;
        int i11 = z10 ? iT - 1 : 0;
        int i12 = true == z10 ? 1 : -1;
        if (interfaceC3553qA == null) {
            interfaceC3553qA = c3454f.v(i10);
            i10 += i12;
        }
        while ((i11 - i10) * i12 >= 0) {
            if (c3454f.x(i10)) {
                interfaceC3553qA = abstractC3499k.a(y12, Arrays.asList(interfaceC3553qA, c3454f.v(i10), new C3490j(Double.valueOf(i10)), c3454f));
                if (interfaceC3553qA instanceof C3472h) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i12;
            } else {
                i10 += i12;
            }
        }
        return interfaceC3553qA;
    }

    private static C3454f c(C3454f c3454f, Y1 y12, AbstractC3499k abstractC3499k, Boolean bool, Boolean bool2) {
        C3454f c3454f2 = new C3454f();
        Iterator itS = c3454f.s();
        while (itS.hasNext()) {
            int iIntValue = ((Integer) itS.next()).intValue();
            if (c3454f.x(iIntValue)) {
                InterfaceC3553q interfaceC3553qA = abstractC3499k.a(y12, Arrays.asList(c3454f.v(iIntValue), new C3490j(Double.valueOf(iIntValue)), c3454f));
                if (interfaceC3553qA.m().equals(bool)) {
                    break;
                }
                if (bool2 == null || interfaceC3553qA.m().equals(bool2)) {
                    c3454f2.w(iIntValue, interfaceC3553qA);
                }
            }
        }
        return c3454f2;
    }
}
