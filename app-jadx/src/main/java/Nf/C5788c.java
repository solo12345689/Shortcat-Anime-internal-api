package nf;

import ff.e;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.AbstractC5689u;
import pf.n;
import ye.H;

/* JADX INFO: renamed from: nf.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5788c extends AbstractC5689u implements ve.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f54131o = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f54132n;

    /* JADX INFO: renamed from: nf.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5788c a(Xe.c fqName, n storageManager, H module, InputStream inputStream, boolean z10) throws IOException {
            AbstractC5504s.h(fqName, "fqName");
            AbstractC5504s.h(storageManager, "storageManager");
            AbstractC5504s.h(module, "module");
            AbstractC5504s.h(inputStream, "inputStream");
            Pair pairA = Te.c.a(inputStream);
            Se.n nVar = (Se.n) pairA.getFirst();
            Te.a aVar = (Te.a) pairA.getSecond();
            if (nVar != null) {
                return new C5788c(fqName, storageManager, module, nVar, aVar, z10, null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + Te.a.f17481h + ", actual " + aVar + ". Please update Kotlin");
        }

        private a() {
        }
    }

    public /* synthetic */ C5788c(Xe.c cVar, n nVar, H h10, Se.n nVar2, Te.a aVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, nVar, h10, nVar2, aVar, z10);
    }

    @Override // Be.H, Be.AbstractC1118m
    public String toString() {
        return "builtins package fragment for " + f() + " from " + e.s(this);
    }

    private C5788c(Xe.c cVar, n nVar, H h10, Se.n nVar2, Te.a aVar, boolean z10) {
        super(cVar, nVar, h10, nVar2, aVar, null);
        this.f54132n = z10;
    }
}
