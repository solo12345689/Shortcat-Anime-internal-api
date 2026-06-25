package De;

import Ee.u;
import kotlin.jvm.internal.AbstractC5504s;
import ye.i0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class l implements Ne.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f3709a = new l();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Ne.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u f3710b;

        public a(u javaElement) {
            AbstractC5504s.h(javaElement, "javaElement");
            this.f3710b = javaElement;
        }

        @Override // ye.h0
        public i0 b() {
            i0 NO_SOURCE_FILE = i0.f65113a;
            AbstractC5504s.g(NO_SOURCE_FILE, "NO_SOURCE_FILE");
            return NO_SOURCE_FILE;
        }

        @Override // Ne.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u c() {
            return this.f3710b;
        }

        public String toString() {
            return a.class.getName() + ": " + c();
        }
    }

    private l() {
    }

    @Override // Ne.b
    public Ne.a a(Oe.l javaElement) {
        AbstractC5504s.h(javaElement, "javaElement");
        return new a((u) javaElement);
    }
}
