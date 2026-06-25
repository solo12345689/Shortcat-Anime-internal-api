package ye;

import java.util.Collection;
import java.util.List;
import qf.E0;
import qf.G0;
import ye.InterfaceC7223a;
import ye.InterfaceC7224b;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: ye.z */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC7247z extends InterfaceC7224b {

    /* JADX INFO: renamed from: ye.z$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        a a();

        a b(List list);

        InterfaceC7247z build();

        a c(c0 c0Var);

        a d(InterfaceC7223a.InterfaceC0983a interfaceC0983a, Object obj);

        a e(c0 c0Var);

        a f();

        a g(E e10);

        a h(AbstractC7242u abstractC7242u);

        a i(InterfaceC7224b.a aVar);

        a j(Xe.f fVar);

        a k();

        a l();

        a m(boolean z10);

        a n(InterfaceC7235m interfaceC7235m);

        a o(qf.S s10);

        a p(E0 e02);

        a q(List list);

        a r(InterfaceC7224b interfaceC7224b);

        a s(InterfaceC7374h interfaceC7374h);

        a t();
    }

    boolean C();

    boolean D0();

    boolean G0();

    @Override // ye.InterfaceC7224b
    InterfaceC7247z a();

    @Override // ye.InterfaceC7236n, ye.InterfaceC7235m
    InterfaceC7235m b();

    InterfaceC7247z c(G0 g02);

    @Override // ye.InterfaceC7224b
    Collection e();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    InterfaceC7247z t0();

    a v();
}
