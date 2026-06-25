package se;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6022l;
import ye.InterfaceC7223a;
import ye.InterfaceC7247z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f59490a = new e1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final af.n f59491b = af.n.f23993h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59492a;

        static {
            int[] iArr = new int[InterfaceC6022l.a.values().length];
            try {
                iArr[InterfaceC6022l.a.f56009b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC6022l.a.f56008a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC6022l.a.f56010c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f59492a = iArr;
        }
    }

    private e1() {
    }

    private final void c(StringBuilder sb2, ye.c0 c0Var) {
        if (c0Var != null) {
            qf.S type = c0Var.getType();
            AbstractC5504s.g(type, "getType(...)");
            sb2.append(l(type));
            sb2.append(".");
        }
    }

    private final void d(StringBuilder sb2, InterfaceC7223a interfaceC7223a) {
        ye.c0 c0VarI = j1.i(interfaceC7223a);
        ye.c0 c0VarO = interfaceC7223a.O();
        c(sb2, c0VarI);
        boolean z10 = (c0VarI == null || c0VarO == null) ? false : true;
        if (z10) {
            sb2.append("(");
        }
        c(sb2, c0VarO);
        if (z10) {
            sb2.append(")");
        }
    }

    private final String e(InterfaceC7223a interfaceC7223a) {
        if (interfaceC7223a instanceof ye.Z) {
            return k((ye.Z) interfaceC7223a);
        }
        if (interfaceC7223a instanceof InterfaceC7247z) {
            return f((InterfaceC7247z) interfaceC7223a);
        }
        throw new IllegalStateException(("Illegal callable: " + interfaceC7223a).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence g(ye.t0 t0Var) {
        e1 e1Var = f59490a;
        qf.S type = t0Var.getType();
        AbstractC5504s.g(type, "getType(...)");
        return e1Var.l(type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(ye.t0 t0Var) {
        e1 e1Var = f59490a;
        qf.S type = t0Var.getType();
        AbstractC5504s.g(type, "getType(...)");
        return e1Var.l(type);
    }

    public final String f(InterfaceC7247z descriptor) throws IOException {
        AbstractC5504s.h(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        e1 e1Var = f59490a;
        e1Var.d(sb2, descriptor);
        af.n nVar = f59491b;
        Xe.f name = descriptor.getName();
        AbstractC5504s.g(name, "getName(...)");
        sb2.append(nVar.R(name, true));
        List listJ = descriptor.j();
        AbstractC5504s.g(listJ, "getValueParameters(...)");
        Ud.F.t0(listJ, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : c1.f59473a);
        sb2.append(": ");
        qf.S returnType = descriptor.getReturnType();
        AbstractC5504s.e(returnType);
        sb2.append(e1Var.l(returnType));
        return sb2.toString();
    }

    public final String h(InterfaceC7247z invoke) throws IOException {
        AbstractC5504s.h(invoke, "invoke");
        StringBuilder sb2 = new StringBuilder();
        e1 e1Var = f59490a;
        e1Var.d(sb2, invoke);
        List listJ = invoke.j();
        AbstractC5504s.g(listJ, "getValueParameters(...)");
        Ud.F.t0(listJ, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : d1.f59487a);
        sb2.append(" -> ");
        qf.S returnType = invoke.getReturnType();
        AbstractC5504s.e(returnType);
        sb2.append(e1Var.l(returnType));
        return sb2.toString();
    }

    public final String j(C6526y0 parameter) {
        AbstractC5504s.h(parameter, "parameter");
        StringBuilder sb2 = new StringBuilder();
        int i10 = a.f59492a[parameter.h().ordinal()];
        if (i10 == 1) {
            sb2.append("extension receiver parameter");
        } else if (i10 == 2) {
            sb2.append("instance parameter");
        } else {
            if (i10 != 3) {
                throw new Td.r();
            }
            sb2.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb2.append(" of ");
        sb2.append(f59490a.e(parameter.q().b0()));
        return sb2.toString();
    }

    public final String k(ye.Z descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(descriptor.N() ? "var " : "val ");
        e1 e1Var = f59490a;
        e1Var.d(sb2, descriptor);
        af.n nVar = f59491b;
        Xe.f name = descriptor.getName();
        AbstractC5504s.g(name, "getName(...)");
        sb2.append(nVar.R(name, true));
        sb2.append(": ");
        qf.S type = descriptor.getType();
        AbstractC5504s.g(type, "getType(...)");
        sb2.append(e1Var.l(type));
        return sb2.toString();
    }

    public final String l(qf.S type) {
        AbstractC5504s.h(type, "type");
        return f59491b.S(type);
    }
}
