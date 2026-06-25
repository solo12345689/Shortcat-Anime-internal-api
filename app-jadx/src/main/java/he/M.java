package He;

import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import pf.C6041f;
import pf.InterfaceC6043h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class M implements K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f8496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6041f f8497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC6043h f8498d;

    public M(Map states) {
        AbstractC5504s.h(states, "states");
        this.f8496b = states;
        C6041f c6041f = new C6041f("Java nullability annotation states");
        this.f8497c = c6041f;
        InterfaceC6043h interfaceC6043hD = c6041f.d(new L(this));
        AbstractC5504s.g(interfaceC6043hD, "createMemoizedFunctionWithNullableValues(...)");
        this.f8498d = interfaceC6043hD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(M m10, Xe.c cVar) {
        AbstractC5504s.e(cVar);
        return Xe.e.a(cVar, m10.f8496b);
    }

    @Override // He.K
    public Object a(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        return this.f8498d.invoke(fqName);
    }
}
