package Ie;

import Oe.InterfaceC1980a;
import Td.z;
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
public final class l extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f9102h = {O.k(new F(l.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC6044i f9103g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC1980a annotation, Ke.k c10) {
        super(c10, annotation, o.a.f62205L);
        AbstractC5504s.h(annotation, "annotation");
        AbstractC5504s.h(c10, "c");
        this.f9103g = c10.e().c(new k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map i(l lVar) {
        AbstractC4598g abstractC4598gB = f.f9093a.b(lVar.c());
        Map mapF = abstractC4598gB != null ? S.f(z.a(d.f9087a.c(), abstractC4598gB)) : null;
        return mapF == null ? S.i() : mapF;
    }

    @Override // Ie.c, ze.InterfaceC7369c
    public Map a() {
        return (Map) AbstractC6048m.a(this.f9103g, this, f9102h[0]);
    }
}
