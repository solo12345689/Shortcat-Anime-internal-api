package Wb;

import Gf.C1627p;
import Gf.InterfaceC1623n;
import Td.u;
import ae.AbstractC2605b;
import g.InterfaceC4812b;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements InterfaceC4812b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1623n f20811a;

        a(InterfaceC1623n interfaceC1623n) {
            this.f20811a = interfaceC1623n;
        }

        @Override // g.InterfaceC4812b
        public final void onActivityResult(Object obj) {
            if (this.f20811a.b()) {
                this.f20811a.resumeWith(u.b(obj));
            }
        }
    }

    public final Object a(Serializable serializable, Zd.e eVar) {
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        b(serializable, new a(c1627p));
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV;
    }

    public abstract void b(Serializable serializable, InterfaceC4812b interfaceC4812b);
}
