package io.sentry;

import io.sentry.E1;
import io.sentry.protocol.C5253c;
import io.sentry.protocol.C5257g;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface Y {
    String A();

    void B();

    io.sentry.featureflags.b C();

    void D(InterfaceC5182c0 interfaceC5182c0);

    void E(String str);

    O3 F();

    io.sentry.protocol.x G();

    C5310x1 H();

    void I(String str);

    InterfaceC5182c0 J();

    List K();

    void L(V2 v22);

    void M();

    C5310x1 N(E1.a aVar);

    void O(E1.c cVar);

    void P(io.sentry.protocol.x xVar);

    List Q();

    void R(C5310x1 c5310x1);

    void a(C5191e c5191e);

    void b(String str, String str2);

    io.sentry.protocol.o c();

    void clear();

    /* JADX INFO: renamed from: clone */
    Y m946clone();

    void d(String str, String str2);

    void e(C5191e c5191e, H h10);

    InterfaceC5207h0 f();

    void g(Throwable th2, InterfaceC5207h0 interfaceC5207h0, String str);

    Map getExtras();

    Map getTags();

    C5322z3 h();

    void i(io.sentry.protocol.I i10);

    InterfaceC5217j0 j();

    String k();

    O3 l();

    EnumC5215i3 m();

    C5257g n();

    void o(io.sentry.protocol.x xVar);

    E1.d p();

    void q(C5322z3 c5322z3);

    Queue r();

    O3 s(E1.b bVar);

    void t();

    List u();

    C5253c v();

    void w(String str, Object obj);

    void x(InterfaceC5217j0 interfaceC5217j0);

    List y();

    io.sentry.protocol.I z();
}
