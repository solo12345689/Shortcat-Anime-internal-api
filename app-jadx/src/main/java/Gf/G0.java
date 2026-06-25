package Gf;

import Gf.C0;
import ae.AbstractC2605b;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class G0 {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends AbstractC5502p implements Function1 {
        a(Object obj) {
            super(1, obj, H0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            j((Throwable) obj);
            return Td.L.f17438a;
        }

        public final void j(Throwable th2) {
            ((H0) this.receiver).w(th2);
        }
    }

    public static final A a(C0 c02) {
        return new E0(c02);
    }

    public static /* synthetic */ A b(C0 c02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c02 = null;
        }
        return F0.a(c02);
    }

    public static final void c(C0 c02, String str, Throwable th2) {
        c02.k(AbstractC1630q0.a(str, th2));
    }

    public static final void d(Zd.i iVar, CancellationException cancellationException) {
        C0 c02 = (C0) iVar.l(C0.f7490K);
        if (c02 != null) {
            c02.k(cancellationException);
        }
    }

    public static /* synthetic */ void e(C0 c02, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        F0.c(c02, str, th2);
    }

    public static /* synthetic */ void f(Zd.i iVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        F0.d(iVar, cancellationException);
    }

    public static final Object g(C0 c02, Zd.e eVar) {
        C0.a.a(c02, null, 1, null);
        Object objH0 = c02.h0(eVar);
        return objH0 == AbstractC2605b.f() ? objH0 : Td.L.f17438a;
    }

    public static final InterfaceC1612h0 h(C0 c02, InterfaceC1612h0 interfaceC1612h0) {
        return m(c02, false, new C1616j0(interfaceC1612h0), 1, null);
    }

    public static final void i(C0 c02) {
        if (!c02.b()) {
            throw c02.D();
        }
    }

    public static final void j(Zd.i iVar) {
        C0 c02 = (C0) iVar.l(C0.f7490K);
        if (c02 != null) {
            F0.i(c02);
        }
    }

    public static final C0 k(Zd.i iVar) {
        C0 c02 = (C0) iVar.l(C0.f7490K);
        if (c02 != null) {
            return c02;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + iVar).toString());
    }

    public static final InterfaceC1612h0 l(C0 c02, boolean z10, H0 h02) {
        return c02 instanceof I0 ? ((I0) c02).m0(z10, h02) : c02.C(h02.v(), z10, new a(h02));
    }

    public static /* synthetic */ InterfaceC1612h0 m(C0 c02, boolean z10, H0 h02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return F0.l(c02, z10, h02);
    }

    public static final boolean n(Zd.i iVar) {
        C0 c02 = (C0) iVar.l(C0.f7490K);
        if (c02 != null) {
            return c02.b();
        }
        return true;
    }
}
