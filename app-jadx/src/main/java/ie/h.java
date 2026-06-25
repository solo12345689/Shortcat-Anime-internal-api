package Ie;

import Oe.InterfaceC1980a;
import Td.z;
import Ud.S;
import df.C4615x;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import pe.InterfaceC6023m;
import pf.AbstractC6048m;
import pf.InterfaceC6044i;
import ve.o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f9097h = {O.k(new F(h.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC6044i f9098g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InterfaceC1980a interfaceC1980a, Ke.k c10) {
        super(c10, interfaceC1980a, o.a.f62279y);
        AbstractC5504s.h(c10, "c");
        this.f9098g = c10.e().c(g.f9096a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map i() {
        return S.f(z.a(d.f9087a.b(), new C4615x("Deprecated in Java")));
    }

    @Override // Ie.c, ze.InterfaceC7369c
    public Map a() {
        return (Map) AbstractC6048m.a(this.f9098g, this, f9097h[0]);
    }
}
