package Fe;

import Ge.b;
import Ge.c;
import Xe.f;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7227e;
import ye.N;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    public static final void a(c cVar, b from, InterfaceC7227e scopeOwner, f name) {
        AbstractC5504s.h(cVar, "<this>");
        AbstractC5504s.h(from, "from");
        AbstractC5504s.h(scopeOwner, "scopeOwner");
        AbstractC5504s.h(name, "name");
        if (cVar == c.a.f7454a) {
            return;
        }
        from.a();
    }

    public static final void b(c cVar, b from, N scopeOwner, f name) {
        AbstractC5504s.h(cVar, "<this>");
        AbstractC5504s.h(from, "from");
        AbstractC5504s.h(scopeOwner, "scopeOwner");
        AbstractC5504s.h(name, "name");
        String strA = scopeOwner.f().a();
        String strB = name.b();
        AbstractC5504s.g(strB, "asString(...)");
        c(cVar, from, strA, strB);
    }

    public static final void c(c cVar, b from, String packageFqName, String name) {
        AbstractC5504s.h(cVar, "<this>");
        AbstractC5504s.h(from, "from");
        AbstractC5504s.h(packageFqName, "packageFqName");
        AbstractC5504s.h(name, "name");
        if (cVar == c.a.f7454a) {
            return;
        }
        from.a();
    }
}
