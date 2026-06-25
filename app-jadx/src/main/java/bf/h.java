package bf;

import Be.C1114i;
import Be.K;
import Be.L;
import Be.M;
import Be.N;
import Be.O;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.Collections;
import java.util.List;
import kf.C5470b;
import kf.C5471c;
import kf.C5472d;
import qf.AbstractC6183d0;
import qf.D0;
import qf.N0;
import qf.S;
import qf.V;
import qf.r0;
import ye.AbstractC7241t;
import ye.AbstractC7242u;
import ye.E;
import ye.H;
import ye.InterfaceC7223a;
import ye.InterfaceC7224b;
import ye.InterfaceC7227e;
import ye.InterfaceC7247z;
import ye.Z;
import ye.c0;
import ye.g0;
import ye.h0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a extends C1114i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC7227e interfaceC7227e, h0 h0Var, boolean z10) {
            super(interfaceC7227e, null, InterfaceC7374h.f66223k0.b(), true, InterfaceC7224b.a.DECLARATION, h0Var);
            if (interfaceC7227e == null) {
                T(0);
            }
            if (h0Var == null) {
                T(1);
            }
            q1(Collections.EMPTY_LIST, i.k(interfaceC7227e, z10));
        }

        private static /* synthetic */ void T(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 12 || i10 == 23 || i10 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 12 || i10 == 23 || i10 == 25) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 12) {
            objArr[1] = "createSetter";
        } else if (i10 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i10 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 12 && i10 != 23 && i10 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static c0 b(InterfaceC7223a interfaceC7223a, S s10, Xe.f fVar, InterfaceC7374h interfaceC7374h, int i10) {
        if (interfaceC7223a == null) {
            a(32);
        }
        if (interfaceC7374h == null) {
            a(33);
        }
        if (s10 == null) {
            return null;
        }
        return new N(interfaceC7223a, new C5471c(interfaceC7223a, s10, fVar, null), interfaceC7374h, Xe.g.a(i10));
    }

    public static c0 c(InterfaceC7227e interfaceC7227e, S s10, Xe.f fVar, InterfaceC7374h interfaceC7374h, int i10) {
        if (interfaceC7227e == null) {
            a(34);
        }
        if (interfaceC7374h == null) {
            a(35);
        }
        if (s10 == null) {
            return null;
        }
        return new N(interfaceC7227e, new C5470b(interfaceC7227e, s10, fVar, null), interfaceC7374h, Xe.g.a(i10));
    }

    public static L d(Z z10, InterfaceC7374h interfaceC7374h) {
        if (z10 == null) {
            a(13);
        }
        if (interfaceC7374h == null) {
            a(14);
        }
        return j(z10, interfaceC7374h, true, false, false);
    }

    public static M e(Z z10, InterfaceC7374h interfaceC7374h, InterfaceC7374h interfaceC7374h2) {
        if (z10 == null) {
            a(0);
        }
        if (interfaceC7374h == null) {
            a(1);
        }
        if (interfaceC7374h2 == null) {
            a(2);
        }
        return n(z10, interfaceC7374h, interfaceC7374h2, true, false, false, z10.k());
    }

    public static Z f(InterfaceC7227e interfaceC7227e) {
        if (interfaceC7227e == null) {
            a(26);
        }
        H hG = i.g(interfaceC7227e);
        InterfaceC7227e interfaceC7227eA = v.a(hG).a(hG);
        if (interfaceC7227eA == null) {
            return null;
        }
        InterfaceC7374h.a aVar = InterfaceC7374h.f66223k0;
        InterfaceC7374h interfaceC7374hB = aVar.b();
        E e10 = E.f65060b;
        AbstractC7242u abstractC7242u = AbstractC7241t.f65124e;
        Xe.f fVar = ve.o.f62161e;
        InterfaceC7224b.a aVar2 = InterfaceC7224b.a.SYNTHESIZED;
        K kO0 = K.O0(interfaceC7227e, interfaceC7374hB, e10, abstractC7242u, false, fVar, aVar2, interfaceC7227e.k(), false, false, false, false, false, false);
        L l10 = new L(kO0, aVar.b(), e10, abstractC7242u, false, false, false, aVar2, null, interfaceC7227e.k());
        kO0.U0(l10, null);
        AbstractC6183d0 abstractC6183d0I = V.i(r0.f58089b.k(), interfaceC7227eA.l(), Collections.singletonList(new D0(interfaceC7227e.p())), false);
        List list = Collections.EMPTY_LIST;
        kO0.b1(abstractC6183d0I, list, null, null, list);
        l10.P0(kO0.getReturnType());
        return kO0;
    }

    public static g0 g(InterfaceC7227e interfaceC7227e) {
        if (interfaceC7227e == null) {
            a(24);
        }
        InterfaceC7374h.a aVar = InterfaceC7374h.f66223k0;
        O oL1 = O.l1(interfaceC7227e, aVar.b(), ve.o.f62162f, InterfaceC7224b.a.SYNTHESIZED, interfaceC7227e.k());
        Be.V v10 = new Be.V(oL1, null, 0, aVar.b(), Xe.f.m("value"), ff.e.m(interfaceC7227e).X(), false, false, false, null, interfaceC7227e.k());
        List list = Collections.EMPTY_LIST;
        O oR0 = oL1.R0(null, null, list, list, Collections.singletonList(v10), interfaceC7227e.p(), E.f65060b, AbstractC7241t.f65124e);
        if (oR0 == null) {
            a(25);
        }
        return oR0;
    }

    public static g0 h(InterfaceC7227e interfaceC7227e) {
        if (interfaceC7227e == null) {
            a(22);
        }
        O oL1 = O.l1(interfaceC7227e, InterfaceC7374h.f66223k0.b(), ve.o.f62160d, InterfaceC7224b.a.SYNTHESIZED, interfaceC7227e.k());
        List list = Collections.EMPTY_LIST;
        O oR0 = oL1.R0(null, null, list, list, list, ff.e.m(interfaceC7227e).m(N0.f57999e, interfaceC7227e.p()), E.f65060b, AbstractC7241t.f65124e);
        if (oR0 == null) {
            a(23);
        }
        return oR0;
    }

    public static c0 i(InterfaceC7223a interfaceC7223a, S s10, InterfaceC7374h interfaceC7374h) {
        if (interfaceC7223a == null) {
            a(30);
        }
        if (interfaceC7374h == null) {
            a(31);
        }
        if (s10 == null) {
            return null;
        }
        return new N(interfaceC7223a, new C5472d(interfaceC7223a, s10, null), interfaceC7374h);
    }

    public static L j(Z z10, InterfaceC7374h interfaceC7374h, boolean z11, boolean z12, boolean z13) {
        if (z10 == null) {
            a(15);
        }
        if (interfaceC7374h == null) {
            a(16);
        }
        return k(z10, interfaceC7374h, z11, z12, z13, z10.k());
    }

    public static L k(Z z10, InterfaceC7374h interfaceC7374h, boolean z11, boolean z12, boolean z13, h0 h0Var) {
        if (z10 == null) {
            a(17);
        }
        if (interfaceC7374h == null) {
            a(18);
        }
        if (h0Var == null) {
            a(19);
        }
        return new L(z10, interfaceC7374h, z10.r(), z10.getVisibility(), z11, z12, z13, InterfaceC7224b.a.DECLARATION, null, h0Var);
    }

    public static C1114i l(InterfaceC7227e interfaceC7227e, h0 h0Var) {
        if (interfaceC7227e == null) {
            a(20);
        }
        if (h0Var == null) {
            a(21);
        }
        return new a(interfaceC7227e, h0Var, false);
    }

    public static M m(Z z10, InterfaceC7374h interfaceC7374h, InterfaceC7374h interfaceC7374h2, boolean z11, boolean z12, boolean z13, AbstractC7242u abstractC7242u, h0 h0Var) {
        if (z10 == null) {
            a(7);
        }
        if (interfaceC7374h == null) {
            a(8);
        }
        if (interfaceC7374h2 == null) {
            a(9);
        }
        if (abstractC7242u == null) {
            a(10);
        }
        if (h0Var == null) {
            a(11);
        }
        M m10 = new M(z10, interfaceC7374h, z10.r(), abstractC7242u, z11, z12, z13, InterfaceC7224b.a.DECLARATION, null, h0Var);
        m10.Q0(M.O0(m10, z10.getType(), interfaceC7374h2));
        return m10;
    }

    public static M n(Z z10, InterfaceC7374h interfaceC7374h, InterfaceC7374h interfaceC7374h2, boolean z11, boolean z12, boolean z13, h0 h0Var) {
        if (z10 == null) {
            a(3);
        }
        if (interfaceC7374h == null) {
            a(4);
        }
        if (interfaceC7374h2 == null) {
            a(5);
        }
        if (h0Var == null) {
            a(6);
        }
        return m(z10, interfaceC7374h, interfaceC7374h2, z11, z12, z13, z10.getVisibility(), h0Var);
    }

    private static boolean o(InterfaceC7247z interfaceC7247z) {
        if (interfaceC7247z == null) {
            a(29);
        }
        return interfaceC7247z.h() == InterfaceC7224b.a.SYNTHESIZED && i.A(interfaceC7247z.b());
    }

    public static boolean p(InterfaceC7247z interfaceC7247z) {
        if (interfaceC7247z == null) {
            a(28);
        }
        return interfaceC7247z.getName().equals(ve.o.f62162f) && o(interfaceC7247z);
    }

    public static boolean q(InterfaceC7247z interfaceC7247z) {
        if (interfaceC7247z == null) {
            a(27);
        }
        return interfaceC7247z.getName().equals(ve.o.f62160d) && o(interfaceC7247z);
    }
}
