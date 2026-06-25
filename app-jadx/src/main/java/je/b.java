package Je;

import Be.C1114i;
import Ud.AbstractC2279u;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.List;
import kotlin.Pair;
import qf.S;
import ye.InterfaceC7223a;
import ye.InterfaceC7224b;
import ye.InterfaceC7227e;
import ye.InterfaceC7235m;
import ye.InterfaceC7247z;
import ye.h0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class b extends C1114i implements a {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Boolean f9494F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Boolean f9495G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected b(InterfaceC7227e interfaceC7227e, b bVar, InterfaceC7374h interfaceC7374h, boolean z10, InterfaceC7224b.a aVar, h0 h0Var) {
        super(interfaceC7227e, bVar, interfaceC7374h, z10, aVar, h0Var);
        if (interfaceC7227e == null) {
            T(0);
        }
        if (interfaceC7374h == null) {
            T(1);
        }
        if (aVar == null) {
            T(2);
        }
        if (h0Var == null) {
            T(3);
        }
        this.f9494F = null;
        this.f9495G = null;
    }

    private static /* synthetic */ void T(int i10) {
        String str = (i10 == 11 || i10 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 11 || i10 == 18) ? 2 : 3];
        switch (i10) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 11 && i10 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static b t1(InterfaceC7227e interfaceC7227e, InterfaceC7374h interfaceC7374h, boolean z10, h0 h0Var) {
        if (interfaceC7227e == null) {
            T(4);
        }
        if (interfaceC7374h == null) {
            T(5);
        }
        if (h0Var == null) {
            T(6);
        }
        return new b(interfaceC7227e, null, interfaceC7374h, z10, InterfaceC7224b.a.DECLARATION, h0Var);
    }

    @Override // Be.AbstractC1123s
    public boolean Q0() {
        return this.f9494F.booleanValue();
    }

    @Override // Be.AbstractC1123s
    public void Y0(boolean z10) {
        this.f9494F = Boolean.valueOf(z10);
    }

    @Override // Be.AbstractC1123s
    public void Z0(boolean z10) {
        this.f9495G = Boolean.valueOf(z10);
    }

    @Override // Be.AbstractC1123s, ye.InterfaceC7223a
    public boolean i0() {
        return this.f9495G.booleanValue();
    }

    protected b s1(InterfaceC7227e interfaceC7227e, b bVar, InterfaceC7224b.a aVar, h0 h0Var, InterfaceC7374h interfaceC7374h) {
        if (interfaceC7227e == null) {
            T(12);
        }
        if (aVar == null) {
            T(13);
        }
        if (h0Var == null) {
            T(14);
        }
        if (interfaceC7374h == null) {
            T(15);
        }
        return new b(interfaceC7227e, bVar, interfaceC7374h, this.f1796E, aVar, h0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Be.C1114i
    /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
    public b L0(InterfaceC7235m interfaceC7235m, InterfaceC7247z interfaceC7247z, InterfaceC7224b.a aVar, Xe.f fVar, InterfaceC7374h interfaceC7374h, h0 h0Var) {
        if (interfaceC7235m == null) {
            T(7);
        }
        if (aVar == null) {
            T(8);
        }
        if (interfaceC7374h == null) {
            T(9);
        }
        if (h0Var == null) {
            T(10);
        }
        if (aVar == InterfaceC7224b.a.DECLARATION || aVar == InterfaceC7224b.a.SYNTHESIZED) {
            b bVarS1 = s1((InterfaceC7227e) interfaceC7235m, (b) interfaceC7247z, aVar, h0Var, interfaceC7374h);
            bVarS1.Y0(Q0());
            bVarS1.Z0(i0());
            return bVarS1;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC7235m + "\nkind: " + aVar);
    }

    @Override // Je.a
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public b x(S s10, List list, S s11, Pair pair) {
        if (list == null) {
            T(16);
        }
        if (s11 == null) {
            T(17);
        }
        b bVarL0 = L0(b(), null, h(), null, getAnnotations(), k());
        bVarL0.R0(s10 == null ? null : bf.h.i(bVarL0, s10, InterfaceC7374h.f66223k0.b()), K(), AbstractC2279u.m(), getTypeParameters(), h.a(list, j(), bVarL0), s11, r(), getVisibility());
        if (pair != null) {
            bVarL0.U0((InterfaceC7223a.InterfaceC0983a) pair.c(), pair.d());
        }
        return bVarL0;
    }
}
