package Ie;

import Oe.InterfaceC1980a;
import Oe.InterfaceC1981b;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import df.AbstractC4598g;
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
public final class n extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f9105h = {O.k(new F(n.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC6044i f9106g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(InterfaceC1980a annotation, Ke.k c10) {
        super(c10, annotation, o.a.f62197H);
        AbstractC5504s.h(annotation, "annotation");
        AbstractC5504s.h(c10, "c");
        this.f9106g = c10.e().c(new m(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map i(n nVar) {
        InterfaceC1981b interfaceC1981bC = nVar.c();
        AbstractC4598g abstractC4598gD = interfaceC1981bC instanceof Oe.e ? f.f9093a.d(((Oe.e) nVar.c()).c()) : interfaceC1981bC instanceof Oe.m ? f.f9093a.d(AbstractC2279u.e(nVar.c())) : null;
        Map mapF = abstractC4598gD != null ? S.f(z.a(d.f9087a.d(), abstractC4598gD)) : null;
        return mapF == null ? S.i() : mapF;
    }

    @Override // Ie.c, ze.InterfaceC7369c
    public Map a() {
        return (Map) AbstractC6048m.a(this.f9106g, this, f9105h[0]);
    }
}
