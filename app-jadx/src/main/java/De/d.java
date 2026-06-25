package De;

import Df.r;
import Ee.B;
import Ee.q;
import He.InterfaceC1673u;
import Oe.u;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class d implements InterfaceC1673u {

    /* JADX INFO: renamed from: a */
    private final ClassLoader f3698a;

    public d(ClassLoader classLoader) {
        AbstractC5504s.h(classLoader, "classLoader");
        this.f3698a = classLoader;
    }

    @Override // He.InterfaceC1673u
    public u a(Xe.c fqName, boolean z10) {
        AbstractC5504s.h(fqName, "fqName");
        return new B(fqName);
    }

    @Override // He.InterfaceC1673u
    public Oe.g b(InterfaceC1673u.a request) {
        AbstractC5504s.h(request, "request");
        Xe.b bVarA = request.a();
        Xe.c cVarF = bVarA.f();
        String strJ = r.J(bVarA.g().a(), com.amazon.a.a.o.c.a.b.f34706a, '$', false, 4, null);
        if (!cVarF.c()) {
            strJ = cVarF.a() + com.amazon.a.a.o.c.a.b.f34706a + strJ;
        }
        Class clsA = e.a(this.f3698a, strJ);
        if (clsA != null) {
            return new q(clsA);
        }
        return null;
    }

    @Override // He.InterfaceC1673u
    public Set c(Xe.c packageFqName) {
        AbstractC5504s.h(packageFqName, "packageFqName");
        return null;
    }
}
