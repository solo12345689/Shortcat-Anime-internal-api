package Je;

import Be.K;
import Be.L;
import Be.M;
import Pe.s0;
import Ud.AbstractC2279u;
import com.revenuecat.purchases.common.verification.SigningManager;
import ie.InterfaceC5082a;
import java.util.List;
import kotlin.Pair;
import qf.S;
import ve.i;
import ye.AbstractC7242u;
import ye.C7232j;
import ye.E;
import ye.InterfaceC7223a;
import ye.InterfaceC7224b;
import ye.InterfaceC7235m;
import ye.Z;
import ye.b0;
import ye.h0;
import ye.t0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class f extends K implements a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f9510C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Pair f9511D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private S f9512E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected f(InterfaceC7235m interfaceC7235m, InterfaceC7374h interfaceC7374h, E e10, AbstractC7242u abstractC7242u, boolean z10, Xe.f fVar, h0 h0Var, Z z11, InterfaceC7224b.a aVar, boolean z12, Pair pair) {
        super(interfaceC7235m, z11, interfaceC7374h, e10, abstractC7242u, z10, fVar, aVar, h0Var, false, false, false, false, false, false);
        if (interfaceC7235m == null) {
            T(0);
        }
        if (interfaceC7374h == null) {
            T(1);
        }
        if (e10 == null) {
            T(2);
        }
        if (abstractC7242u == null) {
            T(3);
        }
        if (fVar == null) {
            T(4);
        }
        if (h0Var == null) {
            T(5);
        }
        if (aVar == null) {
            T(6);
        }
        this.f9512E = null;
        this.f9510C = z12;
        this.f9511D = pair;
    }

    private static /* synthetic */ void T(int i10) {
        String str = i10 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 21 ? 3 : 2];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    public static f f1(InterfaceC7235m interfaceC7235m, InterfaceC7374h interfaceC7374h, E e10, AbstractC7242u abstractC7242u, boolean z10, Xe.f fVar, h0 h0Var, boolean z11) {
        if (interfaceC7235m == null) {
            T(7);
        }
        if (interfaceC7374h == null) {
            T(8);
        }
        if (e10 == null) {
            T(9);
        }
        if (abstractC7242u == null) {
            T(10);
        }
        if (fVar == null) {
            T(11);
        }
        if (h0Var == null) {
            T(12);
        }
        return new f(interfaceC7235m, interfaceC7374h, e10, abstractC7242u, z10, fVar, h0Var, null, InterfaceC7224b.a.DECLARATION, z11, null);
    }

    @Override // Be.K
    protected K P0(InterfaceC7235m interfaceC7235m, E e10, AbstractC7242u abstractC7242u, Z z10, InterfaceC7224b.a aVar, Xe.f fVar, h0 h0Var) {
        if (interfaceC7235m == null) {
            T(13);
        }
        if (e10 == null) {
            T(14);
        }
        if (abstractC7242u == null) {
            T(15);
        }
        if (aVar == null) {
            T(16);
        }
        if (fVar == null) {
            T(17);
        }
        if (h0Var == null) {
            T(18);
        }
        return new f(interfaceC7235m, getAnnotations(), e10, abstractC7242u, N(), fVar, h0Var, z10, aVar, this.f9510C, this.f9511D);
    }

    @Override // Be.K
    public void Z0(S s10) {
        if (s10 == null) {
            T(22);
        }
        this.f9512E = s10;
    }

    @Override // Be.K, ye.u0
    public boolean d0() {
        S type = getType();
        if (this.f9510C && C7232j.a(type)) {
            return !s0.i(type) || i.w0(type);
        }
        return false;
    }

    @Override // Be.X, ye.InterfaceC7223a
    public boolean i0() {
        return false;
    }

    @Override // Be.K, ye.InterfaceC7223a
    public Object n0(InterfaceC7223a.InterfaceC0983a interfaceC0983a) {
        Pair pair = this.f9511D;
        if (pair == null || !((InterfaceC7223a.InterfaceC0983a) pair.c()).equals(interfaceC0983a)) {
            return null;
        }
        return this.f9511D.d();
    }

    @Override // Je.a
    public a x(S s10, List list, S s11, Pair pair) {
        L l10;
        M m10;
        if (list == null) {
            T(19);
        }
        if (s11 == null) {
            T(20);
        }
        Z zA = a() == this ? null : a();
        f fVar = new f(b(), getAnnotations(), r(), getVisibility(), N(), getName(), k(), zA, h(), this.f9510C, pair);
        L lD = d();
        if (lD != null) {
            L l11 = new L(fVar, lD.getAnnotations(), lD.r(), lD.getVisibility(), lD.F(), lD.isExternal(), lD.isInline(), h(), zA == null ? null : zA.d(), lD.k());
            l11.M0(lD.t0());
            l11.P0(s11);
            l10 = l11;
        } else {
            l10 = null;
        }
        b0 b0VarG = g();
        if (b0VarG != null) {
            m10 = new M(fVar, b0VarG.getAnnotations(), b0VarG.r(), b0VarG.getVisibility(), b0VarG.F(), b0VarG.isExternal(), b0VarG.isInline(), h(), zA == null ? null : zA.g(), b0VarG.k());
            m10.M0(m10.t0());
            m10.Q0((t0) b0VarG.j().get(0));
        } else {
            m10 = null;
        }
        fVar.V0(l10, m10, w0(), P());
        fVar.a1(W0());
        InterfaceC5082a interfaceC5082a = this.f1763h;
        if (interfaceC5082a != null) {
            fVar.K0(this.f1762g, interfaceC5082a);
        }
        fVar.E0(e());
        fVar.b1(s11, getTypeParameters(), K(), s10 != null ? bf.h.i(this, s10, InterfaceC7374h.f66223k0.b()) : null, AbstractC2279u.m());
        return fVar;
    }
}
