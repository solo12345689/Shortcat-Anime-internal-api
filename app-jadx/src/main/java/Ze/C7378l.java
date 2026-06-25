package ze;

import Td.AbstractC2163n;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.AbstractC6183d0;
import qf.S;
import ye.h0;

/* JADX INFO: renamed from: ze.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C7378l implements InterfaceC7369c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ve.i f66228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Xe.c f66229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f66230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f66231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f66232e;

    public C7378l(ve.i builtIns, Xe.c fqName, Map allValueArguments, boolean z10) {
        AbstractC5504s.h(builtIns, "builtIns");
        AbstractC5504s.h(fqName, "fqName");
        AbstractC5504s.h(allValueArguments, "allValueArguments");
        this.f66228a = builtIns;
        this.f66229b = fqName;
        this.f66230c = allValueArguments;
        this.f66231d = z10;
        this.f66232e = AbstractC2163n.a(Td.q.f17462b, new C7377k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC6183d0 c(C7378l c7378l) {
        return c7378l.f66228a.p(c7378l.f()).p();
    }

    @Override // ze.InterfaceC7369c
    public Map a() {
        return this.f66230c;
    }

    @Override // ze.InterfaceC7369c
    public Xe.c f() {
        return this.f66229b;
    }

    @Override // ze.InterfaceC7369c
    public S getType() {
        Object value = this.f66232e.getValue();
        AbstractC5504s.g(value, "getValue(...)");
        return (S) value;
    }

    @Override // ze.InterfaceC7369c
    public h0 k() {
        h0 NO_SOURCE = h0.f65112a;
        AbstractC5504s.g(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    public /* synthetic */ C7378l(ve.i iVar, Xe.c cVar, Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, cVar, map, (i10 & 8) != 0 ? false : z10);
    }
}
