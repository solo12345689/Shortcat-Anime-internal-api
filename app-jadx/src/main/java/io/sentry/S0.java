package io.sentry;

import io.sentry.E1;
import io.sentry.protocol.C5253c;
import io.sentry.protocol.C5257g;
import io.sentry.util.p;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class S0 implements Y {

    /* JADX INFO: renamed from: b */
    private static final S0 f49299b = new S0();

    /* JADX INFO: renamed from: a */
    private final io.sentry.util.p f49300a = new io.sentry.util.p(new p.a() { // from class: io.sentry.R0
        @Override // io.sentry.util.p.a
        public final Object a() {
            return C5322z3.empty();
        }
    });

    private S0() {
    }

    public static S0 T() {
        return f49299b;
    }

    @Override // io.sentry.Y
    public String A() {
        return null;
    }

    @Override // io.sentry.Y
    public io.sentry.featureflags.b C() {
        return io.sentry.featureflags.c.a();
    }

    @Override // io.sentry.Y
    public O3 F() {
        return null;
    }

    @Override // io.sentry.Y
    public io.sentry.protocol.x G() {
        return io.sentry.protocol.x.f51153b;
    }

    @Override // io.sentry.Y
    public C5310x1 H() {
        return new C5310x1();
    }

    @Override // io.sentry.Y
    public InterfaceC5182c0 J() {
        return X0.k();
    }

    @Override // io.sentry.Y
    public List K() {
        return new ArrayList();
    }

    @Override // io.sentry.Y
    public C5310x1 N(E1.a aVar) {
        return new C5310x1();
    }

    @Override // io.sentry.Y
    public List Q() {
        return new ArrayList();
    }

    @Override // io.sentry.Y
    public io.sentry.protocol.o c() {
        return null;
    }

    @Override // io.sentry.Y
    public InterfaceC5207h0 f() {
        return null;
    }

    @Override // io.sentry.Y
    public Map getExtras() {
        return new HashMap();
    }

    @Override // io.sentry.Y
    public Map getTags() {
        return new HashMap();
    }

    @Override // io.sentry.Y
    public C5322z3 h() {
        return (C5322z3) this.f49300a.a();
    }

    @Override // io.sentry.Y
    public InterfaceC5217j0 j() {
        return null;
    }

    @Override // io.sentry.Y
    public String k() {
        return null;
    }

    @Override // io.sentry.Y
    public O3 l() {
        return null;
    }

    @Override // io.sentry.Y
    public EnumC5215i3 m() {
        return null;
    }

    @Override // io.sentry.Y
    public C5257g n() {
        return null;
    }

    @Override // io.sentry.Y
    public E1.d p() {
        return null;
    }

    @Override // io.sentry.Y
    public Queue r() {
        return new ArrayDeque();
    }

    @Override // io.sentry.Y
    public O3 s(E1.b bVar) {
        return null;
    }

    @Override // io.sentry.Y
    public List u() {
        return new ArrayList();
    }

    @Override // io.sentry.Y
    public C5253c v() {
        return new C5253c();
    }

    @Override // io.sentry.Y
    public List y() {
        return new ArrayList();
    }

    @Override // io.sentry.Y
    public io.sentry.protocol.I z() {
        return null;
    }

    @Override // io.sentry.Y
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Y m951clone() {
        return T();
    }

    @Override // io.sentry.Y
    public void B() {
    }

    @Override // io.sentry.Y
    public void M() {
    }

    @Override // io.sentry.Y
    public void clear() {
    }

    @Override // io.sentry.Y
    public void t() {
    }

    @Override // io.sentry.Y
    public void D(InterfaceC5182c0 interfaceC5182c0) {
    }

    @Override // io.sentry.Y
    public void E(String str) {
    }

    @Override // io.sentry.Y
    public void I(String str) {
    }

    @Override // io.sentry.Y
    public void L(V2 v22) {
    }

    @Override // io.sentry.Y
    public void O(E1.c cVar) {
    }

    @Override // io.sentry.Y
    public void P(io.sentry.protocol.x xVar) {
    }

    @Override // io.sentry.Y
    public void R(C5310x1 c5310x1) {
    }

    @Override // io.sentry.Y
    public void a(C5191e c5191e) {
    }

    @Override // io.sentry.Y
    public void i(io.sentry.protocol.I i10) {
    }

    @Override // io.sentry.Y
    public void o(io.sentry.protocol.x xVar) {
    }

    @Override // io.sentry.Y
    public void q(C5322z3 c5322z3) {
    }

    @Override // io.sentry.Y
    public void x(InterfaceC5217j0 interfaceC5217j0) {
    }

    @Override // io.sentry.Y
    public void b(String str, String str2) {
    }

    @Override // io.sentry.Y
    public void d(String str, String str2) {
    }

    @Override // io.sentry.Y
    public void e(C5191e c5191e, H h10) {
    }

    @Override // io.sentry.Y
    public void w(String str, Object obj) {
    }

    @Override // io.sentry.Y
    public void g(Throwable th2, InterfaceC5207h0 interfaceC5207h0, String str) {
    }
}
