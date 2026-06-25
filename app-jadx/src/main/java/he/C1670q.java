package He;

import Ud.AbstractC2279u;
import bf.j;
import bf.o;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import qf.A0;
import ye.InterfaceC7223a;
import ye.InterfaceC7227e;
import ye.c0;
import ye.g0;
import ye.t0;

/* JADX INFO: renamed from: He.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1670q implements bf.j {

    /* JADX INFO: renamed from: He.q$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8571a;

        static {
            int[] iArr = new int[o.i.a.values().length];
            try {
                iArr[o.i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f8571a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qf.S d(t0 t0Var) {
        return t0Var.getType();
    }

    @Override // bf.j
    public j.b a(InterfaceC7223a superDescriptor, InterfaceC7223a subDescriptor, InterfaceC7227e interfaceC7227e) {
        AbstractC5504s.h(superDescriptor, "superDescriptor");
        AbstractC5504s.h(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof Je.e) {
            Je.e eVar = (Je.e) subDescriptor;
            List typeParameters = eVar.getTypeParameters();
            AbstractC5504s.g(typeParameters, "getTypeParameters(...)");
            if (typeParameters.isEmpty()) {
                o.i iVarW = bf.o.w(superDescriptor, subDescriptor);
                A0 a02 = null;
                byte b10 = 0;
                if ((iVarW != null ? iVarW.c() : null) != null) {
                    return j.b.UNKNOWN;
                }
                List listJ = eVar.j();
                AbstractC5504s.g(listJ, "getValueParameters(...)");
                Cf.i iVarK = Cf.l.K(AbstractC2279u.c0(listJ), C1669p.f8570a);
                qf.S returnType = eVar.getReturnType();
                AbstractC5504s.e(returnType);
                Cf.i iVarO = Cf.l.O(iVarK, returnType);
                c0 c0VarO = eVar.O();
                for (qf.S s10 : Cf.l.N(iVarO, AbstractC2279u.q(c0VarO != null ? c0VarO.getType() : null))) {
                    if (!s10.L0().isEmpty() && !(s10.Q0() instanceof Me.k)) {
                        return j.b.UNKNOWN;
                    }
                }
                InterfaceC7223a interfaceC7223aBuild = (InterfaceC7223a) superDescriptor.c(new Me.i(a02, 1, b10 == true ? 1 : 0).c());
                if (interfaceC7223aBuild == null) {
                    return j.b.UNKNOWN;
                }
                if (interfaceC7223aBuild instanceof g0) {
                    g0 g0Var = (g0) interfaceC7223aBuild;
                    List typeParameters2 = g0Var.getTypeParameters();
                    AbstractC5504s.g(typeParameters2, "getTypeParameters(...)");
                    if (!typeParameters2.isEmpty()) {
                        interfaceC7223aBuild = g0Var.v().q(AbstractC2279u.m()).build();
                        AbstractC5504s.e(interfaceC7223aBuild);
                    }
                }
                o.i.a aVarC = bf.o.f33312f.F(interfaceC7223aBuild, subDescriptor, false).c();
                AbstractC5504s.g(aVarC, "getResult(...)");
                return a.f8571a[aVarC.ordinal()] == 1 ? j.b.OVERRIDABLE : j.b.UNKNOWN;
            }
        }
        return j.b.UNKNOWN;
    }

    @Override // bf.j
    public j.a b() {
        return j.a.SUCCESS_ONLY;
    }
}
