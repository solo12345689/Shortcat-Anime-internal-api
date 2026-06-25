package j5;

import S4.k;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f51656a = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f51657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final k f51658b;

        a(Class cls, k kVar) {
            this.f51657a = cls;
            this.f51658b = kVar;
        }

        boolean a(Class cls) {
            return this.f51657a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, k kVar) {
        this.f51656a.add(new a(cls, kVar));
    }

    public synchronized k b(Class cls) {
        int size = this.f51656a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f51656a.get(i10);
            if (aVar.a(cls)) {
                return aVar.f51658b;
            }
        }
        return null;
    }
}
