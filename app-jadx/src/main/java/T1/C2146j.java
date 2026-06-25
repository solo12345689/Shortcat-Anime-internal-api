package T1;

import Gf.O;
import Ud.AbstractC2279u;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: T1.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2146j {

    /* JADX INFO: renamed from: a */
    public static final C2146j f16817a = new C2146j();

    private C2146j() {
    }

    public final InterfaceC2145i a(E storage, U1.b bVar, List migrations, O scope) {
        AbstractC5504s.h(storage, "storage");
        AbstractC5504s.h(migrations, "migrations");
        AbstractC5504s.h(scope, "scope");
        InterfaceC2141e aVar = bVar;
        if (bVar == null) {
            aVar = new U1.a();
        }
        return new C2147k(storage, AbstractC2279u.e(AbstractC2144h.f16799a.b(migrations)), aVar, scope);
    }
}
