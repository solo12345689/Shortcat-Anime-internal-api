package He;

import He.U;
import Qe.s;
import Ud.AbstractC2279u;
import bf.j;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vf.AbstractC6867d;
import ye.InterfaceC7223a;
import ye.InterfaceC7224b;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;
import ye.InterfaceC7247z;
import ye.t0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class z implements bf.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f8591a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b(InterfaceC7247z interfaceC7247z) {
            if (interfaceC7247z.j().size() != 1) {
                return false;
            }
            InterfaceC7235m interfaceC7235mB = interfaceC7247z.b();
            InterfaceC7227e interfaceC7227e = interfaceC7235mB instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7235mB : null;
            if (interfaceC7227e == null) {
                return false;
            }
            List listJ = interfaceC7247z.j();
            AbstractC5504s.g(listJ, "getValueParameters(...)");
            InterfaceC7230h interfaceC7230hP = ((t0) AbstractC2279u.M0(listJ)).getType().N0().p();
            InterfaceC7227e interfaceC7227e2 = interfaceC7230hP instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7230hP : null;
            return interfaceC7227e2 != null && ve.i.s0(interfaceC7227e) && AbstractC5504s.c(ff.e.o(interfaceC7227e), ff.e.o(interfaceC7227e2));
        }

        private final Qe.s c(InterfaceC7247z interfaceC7247z, t0 t0Var) {
            if (Qe.C.e(interfaceC7247z) || b(interfaceC7247z)) {
                qf.S type = t0Var.getType();
                AbstractC5504s.g(type, "getType(...)");
                return Qe.C.g(AbstractC6867d.B(type));
            }
            qf.S type2 = t0Var.getType();
            AbstractC5504s.g(type2, "getType(...)");
            return Qe.C.g(type2);
        }

        public final boolean a(InterfaceC7223a superDescriptor, InterfaceC7223a subDescriptor) {
            AbstractC5504s.h(superDescriptor, "superDescriptor");
            AbstractC5504s.h(subDescriptor, "subDescriptor");
            if ((subDescriptor instanceof Je.e) && (superDescriptor instanceof InterfaceC7247z)) {
                Je.e eVar = (Je.e) subDescriptor;
                eVar.j().size();
                InterfaceC7247z interfaceC7247z = (InterfaceC7247z) superDescriptor;
                interfaceC7247z.j().size();
                List listJ = eVar.a().j();
                AbstractC5504s.g(listJ, "getValueParameters(...)");
                List listJ2 = interfaceC7247z.a().j();
                AbstractC5504s.g(listJ2, "getValueParameters(...)");
                for (Pair pair : AbstractC2279u.j1(listJ, listJ2)) {
                    t0 t0Var = (t0) pair.getFirst();
                    t0 t0Var2 = (t0) pair.getSecond();
                    AbstractC5504s.e(t0Var);
                    boolean z10 = c((InterfaceC7247z) subDescriptor, t0Var) instanceof s.d;
                    AbstractC5504s.e(t0Var2);
                    if (z10 != (c(interfaceC7247z, t0Var2) instanceof s.d)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private a() {
        }
    }

    private final boolean c(InterfaceC7223a interfaceC7223a, InterfaceC7223a interfaceC7223a2, InterfaceC7227e interfaceC7227e) {
        if ((interfaceC7223a instanceof InterfaceC7224b) && (interfaceC7223a2 instanceof InterfaceC7247z) && !ve.i.h0(interfaceC7223a2)) {
            C1662i c1662i = C1662i.f8560o;
            InterfaceC7247z interfaceC7247z = (InterfaceC7247z) interfaceC7223a2;
            Xe.f name = interfaceC7247z.getName();
            AbstractC5504s.g(name, "getName(...)");
            if (!c1662i.n(name)) {
                U.a aVar = U.f8509a;
                Xe.f name2 = interfaceC7247z.getName();
                AbstractC5504s.g(name2, "getName(...)");
                if (!aVar.k(name2)) {
                    return false;
                }
            }
            InterfaceC7224b interfaceC7224bJ = T.j((InterfaceC7224b) interfaceC7223a);
            boolean z10 = interfaceC7223a instanceof InterfaceC7247z;
            InterfaceC7247z interfaceC7247z2 = z10 ? (InterfaceC7247z) interfaceC7223a : null;
            if (!(interfaceC7247z2 != null && interfaceC7247z.D0() == interfaceC7247z2.D0()) && (interfaceC7224bJ == null || !interfaceC7247z.D0())) {
                return true;
            }
            if ((interfaceC7227e instanceof Je.c) && interfaceC7247z.t0() == null && interfaceC7224bJ != null && !T.l(interfaceC7227e, interfaceC7224bJ)) {
                if ((interfaceC7224bJ instanceof InterfaceC7247z) && z10 && C1662i.l((InterfaceC7247z) interfaceC7224bJ) != null) {
                    String strC = Qe.C.c(interfaceC7247z, false, false, 2, null);
                    InterfaceC7247z interfaceC7247zA = ((InterfaceC7247z) interfaceC7223a).a();
                    AbstractC5504s.g(interfaceC7247zA, "getOriginal(...)");
                    if (AbstractC5504s.c(strC, Qe.C.c(interfaceC7247zA, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // bf.j
    public j.b a(InterfaceC7223a superDescriptor, InterfaceC7223a subDescriptor, InterfaceC7227e interfaceC7227e) {
        AbstractC5504s.h(superDescriptor, "superDescriptor");
        AbstractC5504s.h(subDescriptor, "subDescriptor");
        return c(superDescriptor, subDescriptor, interfaceC7227e) ? j.b.INCOMPATIBLE : f8591a.a(superDescriptor, subDescriptor) ? j.b.INCOMPATIBLE : j.b.UNKNOWN;
    }

    @Override // bf.j
    public j.a b() {
        return j.a.CONFLICTS_ONLY;
    }
}
