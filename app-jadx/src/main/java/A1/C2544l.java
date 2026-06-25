package a1;

import U0.AbstractC2201g;
import U0.C2197e;
import U0.W0;
import U0.X0;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: a1.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2544l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C2527U f23615a = new C2527U(AbstractC2201g.f(), W0.f18785b.a(), (W0) null, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C2545m f23616b = new C2545m(this.f23615a.i(), this.f23615a.k(), null);

    private final String c(List list, final InterfaceC2541i interfaceC2541i) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error while applying EditCommand batch to buffer (length=" + this.f23616b.h() + ", composition=" + this.f23616b.d() + ", selection=" + ((Object) W0.q(this.f23616b.i())) + "):");
        AbstractC5504s.g(sb2, "append(...)");
        sb2.append('\n');
        AbstractC5504s.g(sb2, "append(...)");
        Ud.F.t0(list, sb2, (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new Function1() { // from class: a1.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2544l.d(interfaceC2541i, this, (InterfaceC2541i) obj);
            }
        });
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence d(InterfaceC2541i interfaceC2541i, C2544l c2544l, InterfaceC2541i interfaceC2541i2) {
        return (interfaceC2541i == interfaceC2541i2 ? " > " : "   ") + c2544l.f(interfaceC2541i2);
    }

    private final String f(InterfaceC2541i interfaceC2541i) {
        if (interfaceC2541i instanceof C2533a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CommitTextCommand(text.length=");
            C2533a c2533a = (C2533a) interfaceC2541i;
            sb2.append(c2533a.c().length());
            sb2.append(", newCursorPosition=");
            sb2.append(c2533a.b());
            sb2.append(')');
            return sb2.toString();
        }
        if (interfaceC2541i instanceof C2523P) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("SetComposingTextCommand(text.length=");
            C2523P c2523p = (C2523P) interfaceC2541i;
            sb3.append(c2523p.c().length());
            sb3.append(", newCursorPosition=");
            sb3.append(c2523p.b());
            sb3.append(')');
            return sb3.toString();
        }
        if (interfaceC2541i instanceof C2522O) {
            return ((C2522O) interfaceC2541i).toString();
        }
        if (interfaceC2541i instanceof C2539g) {
            return ((C2539g) interfaceC2541i).toString();
        }
        if (interfaceC2541i instanceof C2540h) {
            return ((C2540h) interfaceC2541i).toString();
        }
        if (interfaceC2541i instanceof C2524Q) {
            return ((C2524Q) interfaceC2541i).toString();
        }
        if (interfaceC2541i instanceof C2547o) {
            return ((C2547o) interfaceC2541i).toString();
        }
        if (interfaceC2541i instanceof C2538f) {
            return ((C2538f) interfaceC2541i).toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Unknown EditCommand: ");
        String strV = kotlin.jvm.internal.O.b(interfaceC2541i.getClass()).v();
        if (strV == null) {
            strV = "{anonymous EditCommand}";
        }
        sb4.append(strV);
        return sb4.toString();
    }

    public final C2527U b(List list) {
        InterfaceC2541i interfaceC2541i = null;
        try {
            int size = list.size();
            int i10 = 0;
            InterfaceC2541i interfaceC2541i2 = null;
            while (i10 < size) {
                try {
                    InterfaceC2541i interfaceC2541i3 = (InterfaceC2541i) list.get(i10);
                    try {
                        interfaceC2541i3.a(this.f23616b);
                        i10++;
                        interfaceC2541i2 = interfaceC2541i3;
                    } catch (Exception e10) {
                        e = e10;
                        interfaceC2541i = interfaceC2541i3;
                        throw new RuntimeException(c(list, interfaceC2541i), e);
                    }
                } catch (Exception e11) {
                    e = e11;
                    interfaceC2541i = interfaceC2541i2;
                }
            }
            C2197e c2197eS = this.f23616b.s();
            long jI = this.f23616b.i();
            W0 w0B = W0.b(jI);
            w0B.r();
            W0 w02 = W0.m(this.f23615a.k()) ? null : w0B;
            C2527U c2527u = new C2527U(c2197eS, w02 != null ? w02.r() : X0.b(W0.k(jI), W0.l(jI)), this.f23616b.d(), (DefaultConstructorMarker) null);
            this.f23615a = c2527u;
            return c2527u;
        } catch (Exception e12) {
            e = e12;
        }
    }

    public final void e(C2527U c2527u, c0 c0Var) {
        boolean zC = AbstractC5504s.c(c2527u.j(), this.f23616b.d());
        boolean z10 = true;
        boolean z11 = false;
        if (!AbstractC5504s.c(this.f23615a.i().j(), c2527u.i().j())) {
            this.f23616b = new C2545m(c2527u.i(), c2527u.k(), null);
        } else if (W0.g(this.f23615a.k(), c2527u.k())) {
            z10 = false;
        } else {
            this.f23616b.p(W0.l(c2527u.k()), W0.k(c2527u.k()));
            z11 = true;
            z10 = false;
        }
        if (c2527u.j() == null) {
            this.f23616b.a();
        } else if (!W0.h(c2527u.j().r())) {
            this.f23616b.n(W0.l(c2527u.j().r()), W0.k(c2527u.j().r()));
        }
        if (z10 || (!z11 && !zC)) {
            this.f23616b.a();
            c2527u = C2527U.g(c2527u, null, 0L, null, 3, null);
        }
        C2527U c2527u2 = this.f23615a;
        this.f23615a = c2527u;
        if (c0Var != null) {
            c0Var.d(c2527u2, c2527u);
        }
    }

    public final C2527U g() {
        return this.f23615a;
    }
}
