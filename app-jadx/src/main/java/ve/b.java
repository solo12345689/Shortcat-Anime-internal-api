package ve;

import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import ye.H;
import ye.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f62092a = a.f62093a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f62093a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Lazy f62094b = AbstractC2163n.a(Td.q.f17462b, C6863a.f62091a);

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b a() {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(b.class, b.class.getClassLoader());
            AbstractC5504s.e(serviceLoaderLoad);
            b bVar = (b) AbstractC2279u.n0(serviceLoaderLoad);
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }

        public final b c() {
            return (b) f62094b.getValue();
        }
    }

    O a(pf.n nVar, H h10, Iterable iterable, Ae.c cVar, Ae.a aVar, boolean z10);
}
