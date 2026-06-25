package hc;

import Ud.S;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: hc.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4936h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5082a f47828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f47829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f47830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bc.f f47831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f47832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f47833f;

    public C4936h(InterfaceC5082a legacyConstantsProvider, Map syncFunctions, Map asyncFunctions, bc.f fVar, Map properties, Map constants) {
        AbstractC5504s.h(legacyConstantsProvider, "legacyConstantsProvider");
        AbstractC5504s.h(syncFunctions, "syncFunctions");
        AbstractC5504s.h(asyncFunctions, "asyncFunctions");
        AbstractC5504s.h(properties, "properties");
        AbstractC5504s.h(constants, "constants");
        this.f47828a = legacyConstantsProvider;
        this.f47829b = syncFunctions;
        this.f47830c = asyncFunctions;
        this.f47831d = fVar;
        this.f47832e = properties;
        this.f47833f = constants;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map j(C4936h c4936h, C4936h c4936h2) {
        return S.p((Map) c4936h.f47828a.invoke(), (Map) c4936h2.f47828a.invoke());
    }

    public final Map b() {
        return this.f47830c;
    }

    public final Map c() {
        return this.f47833f;
    }

    public final bc.f d() {
        return this.f47831d;
    }

    public final Ub.e e() {
        return new Ub.e(this.f47829b.values().iterator(), this.f47830c.values().iterator());
    }

    public final InterfaceC5082a f() {
        return this.f47828a;
    }

    public final Map g() {
        return this.f47832e;
    }

    public final Map h() {
        return this.f47829b;
    }

    public final C4936h i(final C4936h c4936h) {
        if (c4936h == null) {
            return this;
        }
        InterfaceC5082a interfaceC5082a = new InterfaceC5082a() { // from class: hc.g
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C4936h.j(this.f47826a, c4936h);
            }
        };
        Map mapP = S.p(this.f47829b, c4936h.f47829b);
        Map mapP2 = S.p(this.f47830c, c4936h.f47830c);
        bc.f fVar = this.f47831d;
        return new C4936h(interfaceC5082a, mapP, mapP2, fVar != null ? fVar.b(c4936h.f47831d) : null, S.p(this.f47832e, c4936h.f47832e), S.p(this.f47833f, c4936h.f47833f));
    }
}
