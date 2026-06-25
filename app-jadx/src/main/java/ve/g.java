package ve;

import Td.AbstractC2163n;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C6041f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class g extends i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f62098h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Lazy f62099i = AbstractC2163n.b(f.f62097a);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return (g) g.f62099i.getValue();
        }

        private a() {
        }
    }

    public g(boolean z10) {
        super(new C6041f("DefaultBuiltIns"));
        if (z10) {
            f(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g G0() {
        return new g(false, 1, null);
    }

    public /* synthetic */ g(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
