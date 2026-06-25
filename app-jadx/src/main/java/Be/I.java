package Be;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1687a = a.f1688a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f1688a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final ye.G f1689b = new ye.G("PackageViewDescriptorFactory");

        private a() {
        }

        public final ye.G a() {
            return f1689b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements I {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f1690b = new b();

        private b() {
        }

        @Override // Be.I
        public ye.V a(F module, Xe.c fqName, pf.n storageManager) {
            AbstractC5504s.h(module, "module");
            AbstractC5504s.h(fqName, "fqName");
            AbstractC5504s.h(storageManager, "storageManager");
            return new C1128x(module, fqName, storageManager);
        }
    }

    ye.V a(F f10, Xe.c cVar, pf.n nVar);
}
