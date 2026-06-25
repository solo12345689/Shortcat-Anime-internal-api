package L4;

import Gf.InterfaceC1623n;
import Td.L;
import Td.u;
import Td.v;
import dg.E;
import dg.InterfaceC4624e;
import dg.InterfaceC4625f;
import java.io.IOException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class k implements InterfaceC4625f, Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4624e f11280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1623n f11281b;

    public k(InterfaceC4624e interfaceC4624e, InterfaceC1623n interfaceC1623n) {
        this.f11280a = interfaceC4624e;
        this.f11281b = interfaceC1623n;
    }

    public void a(Throwable th2) {
        try {
            this.f11280a.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // dg.InterfaceC4625f
    public void h(InterfaceC4624e interfaceC4624e, E e10) {
        this.f11281b.resumeWith(Td.u.b(e10));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return L.f17438a;
    }

    @Override // dg.InterfaceC4625f
    public void j(InterfaceC4624e interfaceC4624e, IOException iOException) {
        if (interfaceC4624e.u1()) {
            return;
        }
        InterfaceC1623n interfaceC1623n = this.f11281b;
        u.a aVar = Td.u.f17466b;
        interfaceC1623n.resumeWith(Td.u.b(v.a(iOException)));
    }
}
