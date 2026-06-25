package Be;

import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ye.AbstractC7242u;
import ye.InterfaceC7224b;
import ye.InterfaceC7235m;
import ye.InterfaceC7247z;
import ye.c0;
import ye.g0;
import ye.h0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class O extends AbstractC1123s implements g0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected O(InterfaceC7235m interfaceC7235m, g0 g0Var, InterfaceC7374h interfaceC7374h, Xe.f fVar, InterfaceC7224b.a aVar, h0 h0Var) {
        super(interfaceC7235m, g0Var, interfaceC7374h, fVar, aVar, h0Var);
        if (interfaceC7235m == null) {
            T(0);
        }
        if (interfaceC7374h == null) {
            T(1);
        }
        if (fVar == null) {
            T(2);
        }
        if (aVar == null) {
            T(3);
        }
        if (h0Var == null) {
            T(4);
        }
    }

    private static /* synthetic */ void T(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 13 || i10 == 18 || i10 == 23) {
            objArr[1] = "initialize";
        } else if (i10 == 24) {
            objArr[1] = "getOriginal";
        } else if (i10 == 29) {
            objArr[1] = "copy";
        } else if (i10 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 23 && i10 != 24 && i10 != 29 && i10 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static O l1(InterfaceC7235m interfaceC7235m, InterfaceC7374h interfaceC7374h, Xe.f fVar, InterfaceC7224b.a aVar, h0 h0Var) {
        if (interfaceC7235m == null) {
            T(5);
        }
        if (interfaceC7374h == null) {
            T(6);
        }
        if (fVar == null) {
            T(7);
        }
        if (aVar == null) {
            T(8);
        }
        if (h0Var == null) {
            T(9);
        }
        return new O(interfaceC7235m, null, interfaceC7374h, fVar, aVar, h0Var);
    }

    @Override // Be.AbstractC1123s
    protected AbstractC1123s L0(InterfaceC7235m interfaceC7235m, InterfaceC7247z interfaceC7247z, InterfaceC7224b.a aVar, Xe.f fVar, InterfaceC7374h interfaceC7374h, h0 h0Var) {
        if (interfaceC7235m == null) {
            T(25);
        }
        if (aVar == null) {
            T(26);
        }
        if (interfaceC7374h == null) {
            T(27);
        }
        if (h0Var == null) {
            T(28);
        }
        g0 g0Var = (g0) interfaceC7247z;
        if (fVar == null) {
            fVar = getName();
        }
        return new O(interfaceC7235m, g0Var, interfaceC7374h, fVar, aVar, h0Var);
    }

    @Override // ye.InterfaceC7224b
    /* JADX INFO: renamed from: k1 */
    public g0 l0(InterfaceC7235m interfaceC7235m, ye.E e10, AbstractC7242u abstractC7242u, InterfaceC7224b.a aVar, boolean z10) {
        g0 g0Var = (g0) super.K0(interfaceC7235m, e10, abstractC7242u, aVar, z10);
        if (g0Var == null) {
            T(29);
        }
        return g0Var;
    }

    @Override // Be.AbstractC1123s, Be.AbstractC1119n, Be.AbstractC1118m, ye.InterfaceC7235m, ye.InterfaceC7223a, ye.Z, ye.InterfaceC7224b
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public g0 a() {
        g0 g0Var = (g0) super.a();
        if (g0Var == null) {
            T(24);
        }
        return g0Var;
    }

    @Override // Be.AbstractC1123s
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public O R0(c0 c0Var, c0 c0Var2, List list, List list2, List list3, qf.S s10, ye.E e10, AbstractC7242u abstractC7242u) {
        if (list == null) {
            T(14);
        }
        if (list2 == null) {
            T(15);
        }
        if (list3 == null) {
            T(16);
        }
        if (abstractC7242u == null) {
            T(17);
        }
        O oO1 = o1(c0Var, c0Var2, list, list2, list3, s10, e10, abstractC7242u, null);
        if (oO1 == null) {
            T(18);
        }
        return oO1;
    }

    public O o1(c0 c0Var, c0 c0Var2, List list, List list2, List list3, qf.S s10, ye.E e10, AbstractC7242u abstractC7242u, Map map) {
        if (list == null) {
            T(19);
        }
        if (list2 == null) {
            T(20);
        }
        if (list3 == null) {
            T(21);
        }
        if (abstractC7242u == null) {
            T(22);
        }
        super.R0(c0Var, c0Var2, list, list2, list3, s10, e10, abstractC7242u);
        if (map != null && !map.isEmpty()) {
            this.f1831D = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // Be.AbstractC1123s, ye.InterfaceC7247z, ye.g0
    public InterfaceC7247z.a v() {
        InterfaceC7247z.a aVarV = super.v();
        if (aVarV == null) {
            T(30);
        }
        return aVarV;
    }
}
