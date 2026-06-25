package N7;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import u7.EnumC6741a;
import z6.C7305t;
import z6.y;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f12690a = new b();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final N7.a f12691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final N7.a f12692b;

        public a(N7.a aVar, N7.a aVar2) {
            this.f12691a = aVar;
            this.f12692b = aVar2;
        }
    }

    private b() {
    }

    public static final a a(int i10, int i11, List sources) {
        AbstractC5504s.h(sources, "sources");
        return b(i10, i11, sources, 1.0d);
    }

    public static final a b(int i10, int i11, List sources, double d10) {
        AbstractC5504s.h(sources, "sources");
        if (sources.isEmpty()) {
            return new a(null, null);
        }
        if (sources.size() == 1) {
            return new a((N7.a) sources.get(0), null);
        }
        if (i10 <= 0 || i11 <= 0) {
            return new a(null, null);
        }
        C7305t c7305tJ = y.l().j();
        AbstractC5504s.g(c7305tJ, "getImagePipeline(...)");
        double d11 = ((double) (i10 * i11)) * d10;
        Iterator it = sources.iterator();
        double d12 = Double.MAX_VALUE;
        double d13 = Double.MAX_VALUE;
        N7.a aVar = null;
        N7.a aVar2 = null;
        while (it.hasNext()) {
            N7.a aVar3 = (N7.a) it.next();
            double dAbs = Math.abs(1.0d - (aVar3.d() / d11));
            if (dAbs < d12) {
                aVar2 = aVar3;
                d12 = dAbs;
            }
            if (dAbs < d13 && aVar3.c() != EnumC6741a.f61403b && (c7305tJ.u(aVar3.f()) || c7305tJ.w(aVar3.f()))) {
                aVar = aVar3;
                d13 = dAbs;
            }
        }
        return new a(aVar2, (aVar == null || aVar2 == null || !AbstractC5504s.c(aVar.e(), aVar2.e())) ? aVar : null);
    }
}
