package Je;

import Be.O;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import qf.S;
import xf.C7167s;
import ye.AbstractC7242u;
import ye.E;
import ye.InterfaceC7223a;
import ye.InterfaceC7224b;
import ye.InterfaceC7235m;
import ye.InterfaceC7247z;
import ye.c0;
import ye.g0;
import ye.h0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class e extends O implements Je.a {

    /* JADX INFO: renamed from: G */
    public static final InterfaceC7223a.InterfaceC0983a f9499G = new a();

    /* JADX INFO: renamed from: H */
    public static final InterfaceC7223a.InterfaceC0983a f9500H = new b();

    /* JADX INFO: renamed from: E */
    private c f9501E;

    /* JADX INFO: renamed from: F */
    private final boolean f9502F;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a implements InterfaceC7223a.InterfaceC0983a {
        a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b implements InterfaceC7223a.InterfaceC0983a {
        b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);


        /* JADX INFO: renamed from: a */
        public final boolean f9508a;

        /* JADX INFO: renamed from: b */
        public final boolean f9509b;

        c(boolean z10, boolean z11) {
            this.f9508a = z10;
            this.f9509b = z11;
        }

        private static /* synthetic */ void a(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", com.amazon.a.a.o.b.au));
        }

        public static c b(boolean z10, boolean z11) {
            c cVar = z10 ? z11 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z11 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (cVar == null) {
                a(0);
            }
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected e(InterfaceC7235m interfaceC7235m, g0 g0Var, InterfaceC7374h interfaceC7374h, Xe.f fVar, InterfaceC7224b.a aVar, h0 h0Var, boolean z10) {
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
        this.f9501E = null;
        this.f9502F = z10;
    }

    private static /* synthetic */ void T(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 21) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 13) {
            objArr[1] = "initialize";
        } else if (i10 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static e p1(InterfaceC7235m interfaceC7235m, InterfaceC7374h interfaceC7374h, Xe.f fVar, h0 h0Var, boolean z10) {
        if (interfaceC7235m == null) {
            T(5);
        }
        if (interfaceC7374h == null) {
            T(6);
        }
        if (fVar == null) {
            T(7);
        }
        if (h0Var == null) {
            T(8);
        }
        return new e(interfaceC7235m, null, interfaceC7374h, fVar, InterfaceC7224b.a.DECLARATION, h0Var, z10);
    }

    @Override // Be.AbstractC1123s
    public boolean Q0() {
        return this.f9501E.f9508a;
    }

    @Override // Be.AbstractC1123s, ye.InterfaceC7223a
    public boolean i0() {
        return this.f9501E.f9509b;
    }

    @Override // Be.O
    public O o1(c0 c0Var, c0 c0Var2, List list, List list2, List list3, S s10, E e10, AbstractC7242u abstractC7242u, Map map) {
        if (list == null) {
            T(9);
        }
        if (list2 == null) {
            T(10);
        }
        if (list3 == null) {
            T(11);
        }
        if (abstractC7242u == null) {
            T(12);
        }
        O oO1 = super.o1(c0Var, c0Var2, list, list2, list3, s10, e10, abstractC7242u, map);
        f1(C7167s.f64505a.a(oO1).a());
        if (oO1 == null) {
            T(13);
        }
        return oO1;
    }

    @Override // Be.O, Be.AbstractC1123s
    /* JADX INFO: renamed from: q1 */
    public e L0(InterfaceC7235m interfaceC7235m, InterfaceC7247z interfaceC7247z, InterfaceC7224b.a aVar, Xe.f fVar, InterfaceC7374h interfaceC7374h, h0 h0Var) {
        if (interfaceC7235m == null) {
            T(14);
        }
        if (aVar == null) {
            T(15);
        }
        if (interfaceC7374h == null) {
            T(16);
        }
        if (h0Var == null) {
            T(17);
        }
        g0 g0Var = (g0) interfaceC7247z;
        if (fVar == null) {
            fVar = getName();
        }
        e eVar = new e(interfaceC7235m, g0Var, interfaceC7374h, fVar, aVar, h0Var, this.f9502F);
        eVar.s1(Q0(), i0());
        return eVar;
    }

    @Override // Je.a
    /* JADX INFO: renamed from: r1 */
    public e x(S s10, List list, S s11, Pair pair) {
        if (list == null) {
            T(19);
        }
        if (s11 == null) {
            T(20);
        }
        e eVar = (e) v().b(h.a(list, j(), this)).o(s11).e(s10 == null ? null : bf.h.i(this, s10, InterfaceC7374h.f66223k0.b())).a().l().build();
        if (pair != null) {
            eVar.U0((InterfaceC7223a.InterfaceC0983a) pair.c(), pair.d());
        }
        if (eVar == null) {
            T(21);
        }
        return eVar;
    }

    public void s1(boolean z10, boolean z11) {
        this.f9501E = c.b(z10, z11);
    }
}
