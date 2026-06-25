package Be;

import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import qf.N0;
import ye.InterfaceC7235m;
import ye.h0;
import ye.k0;
import ye.m0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class U extends AbstractC1113h {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Function1 f1748k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f1749l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f1750m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private U(InterfaceC7235m interfaceC7235m, InterfaceC7374h interfaceC7374h, boolean z10, N0 n02, Xe.f fVar, int i10, h0 h0Var, Function1 function1, k0 k0Var, pf.n nVar) {
        super(nVar, interfaceC7235m, interfaceC7374h, fVar, n02, z10, i10, h0Var, k0Var);
        if (interfaceC7235m == null) {
            T(19);
        }
        if (interfaceC7374h == null) {
            T(20);
        }
        if (n02 == null) {
            T(21);
        }
        if (fVar == null) {
            T(22);
        }
        if (h0Var == null) {
            T(23);
        }
        if (k0Var == null) {
            T(24);
        }
        if (nVar == null) {
            T(25);
        }
        this.f1749l = new ArrayList(1);
        this.f1750m = false;
        this.f1748k = function1;
    }

    private void N0() {
        if (this.f1750m) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + U0());
    }

    private void O0() {
        if (this.f1750m) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + U0());
        }
    }

    public static U P0(InterfaceC7235m interfaceC7235m, InterfaceC7374h interfaceC7374h, boolean z10, N0 n02, Xe.f fVar, int i10, h0 h0Var, Function1 function1, k0 k0Var, pf.n nVar) {
        if (interfaceC7235m == null) {
            T(12);
        }
        if (interfaceC7374h == null) {
            T(13);
        }
        if (n02 == null) {
            T(14);
        }
        if (fVar == null) {
            T(15);
        }
        if (h0Var == null) {
            T(16);
        }
        if (k0Var == null) {
            T(17);
        }
        if (nVar == null) {
            T(18);
        }
        return new U(interfaceC7235m, interfaceC7374h, z10, n02, fVar, i10, h0Var, function1, k0Var, nVar);
    }

    public static U Q0(InterfaceC7235m interfaceC7235m, InterfaceC7374h interfaceC7374h, boolean z10, N0 n02, Xe.f fVar, int i10, h0 h0Var, pf.n nVar) {
        if (interfaceC7235m == null) {
            T(6);
        }
        if (interfaceC7374h == null) {
            T(7);
        }
        if (n02 == null) {
            T(8);
        }
        if (fVar == null) {
            T(9);
        }
        if (h0Var == null) {
            T(10);
        }
        if (nVar == null) {
            T(11);
        }
        return P0(interfaceC7235m, interfaceC7374h, z10, n02, fVar, i10, h0Var, null, k0.a.f65115a, nVar);
    }

    public static m0 R0(InterfaceC7235m interfaceC7235m, InterfaceC7374h interfaceC7374h, boolean z10, N0 n02, Xe.f fVar, int i10, pf.n nVar) {
        if (interfaceC7235m == null) {
            T(0);
        }
        if (interfaceC7374h == null) {
            T(1);
        }
        if (n02 == null) {
            T(2);
        }
        if (fVar == null) {
            T(3);
        }
        if (nVar == null) {
            T(4);
        }
        U uQ0 = Q0(interfaceC7235m, interfaceC7374h, z10, n02, fVar, i10, h0.f65112a, nVar);
        uQ0.M0(ff.e.m(interfaceC7235m).z());
        uQ0.V0();
        return uQ0;
    }

    private void S0(qf.S s10) {
        if (qf.W.a(s10)) {
            return;
        }
        this.f1749l.add(s10);
    }

    private static /* synthetic */ void T(int i10) {
        String str = (i10 == 5 || i10 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 28) ? 2 : 3];
        switch (i10) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i10 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i10 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i10) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    private String U0() {
        return getName() + " declared in " + bf.i.m(b());
    }

    @Override // Be.AbstractC1113h
    protected void K0(qf.S s10) {
        if (s10 == null) {
            T(27);
        }
        Function1 function1 = this.f1748k;
        if (function1 == null) {
            return;
        }
        function1.invoke(s10);
    }

    @Override // Be.AbstractC1113h
    protected List L0() {
        N0();
        List list = this.f1749l;
        if (list == null) {
            T(28);
        }
        return list;
    }

    public void M0(qf.S s10) {
        if (s10 == null) {
            T(26);
        }
        O0();
        S0(s10);
    }

    public boolean T0() {
        return this.f1750m;
    }

    public void V0() {
        O0();
        this.f1750m = true;
    }
}
