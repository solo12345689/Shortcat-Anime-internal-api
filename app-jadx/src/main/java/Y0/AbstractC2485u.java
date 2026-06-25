package Y0;

import Y.h2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Y0.u */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2485u {

    /* JADX INFO: renamed from: b */
    public static final a f22726b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final g0 f22727c = new C2480o();

    /* JADX INFO: renamed from: d */
    private static final P f22728d = new P("sans-serif", "FontFamily.SansSerif");

    /* JADX INFO: renamed from: e */
    private static final P f22729e = new P("serif", "FontFamily.Serif");

    /* JADX INFO: renamed from: f */
    private static final P f22730f = new P("monospace", "FontFamily.Monospace");

    /* JADX INFO: renamed from: g */
    private static final P f22731g = new P("cursive", "FontFamily.Cursive");

    /* JADX INFO: renamed from: a */
    private final boolean f22732a;

    /* JADX INFO: renamed from: Y0.u$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final P a() {
            return AbstractC2485u.f22731g;
        }

        public final g0 b() {
            return AbstractC2485u.f22727c;
        }

        public final P c() {
            return AbstractC2485u.f22730f;
        }

        public final P d() {
            return AbstractC2485u.f22728d;
        }

        public final P e() {
            return AbstractC2485u.f22729e;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: Y0.u$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        static /* synthetic */ h2 a(b bVar, AbstractC2485u abstractC2485u, L l10, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
            }
            if ((i12 & 1) != 0) {
                abstractC2485u = null;
            }
            if ((i12 & 2) != 0) {
                l10 = L.f22613b.g();
            }
            if ((i12 & 4) != 0) {
                i10 = H.f22594b.b();
            }
            if ((i12 & 8) != 0) {
                i11 = I.f22598b.a();
            }
            return bVar.b(abstractC2485u, l10, i10, i11);
        }

        h2 b(AbstractC2485u abstractC2485u, L l10, int i10, int i11);
    }

    public /* synthetic */ AbstractC2485u(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10);
    }

    private AbstractC2485u(boolean z10) {
        this.f22732a = z10;
    }
}
