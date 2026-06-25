package Le;

import Le.U;
import Ud.AbstractC2279u;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b0 extends U {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Ke.k c10) {
        super(c10, null, 2, null);
        AbstractC5504s.h(c10, "c");
    }

    @Override // Le.U
    protected void C(Xe.f name, Collection result) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(result, "result");
    }

    @Override // Le.U
    protected ye.c0 O() {
        return null;
    }

    @Override // Le.U
    protected U.a Y(Oe.r method, List methodTypeParameters, qf.S returnType, List valueParameters) {
        AbstractC5504s.h(method, "method");
        AbstractC5504s.h(methodTypeParameters, "methodTypeParameters");
        AbstractC5504s.h(returnType, "returnType");
        AbstractC5504s.h(valueParameters, "valueParameters");
        return new U.a(returnType, null, valueParameters, methodTypeParameters, false, AbstractC2279u.m());
    }
}
