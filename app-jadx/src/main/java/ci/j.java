package ci;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f33755d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f33756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    q f33757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    j f33758c;

    private j(Object obj, q qVar) {
        this.f33756a = obj;
        this.f33757b = qVar;
    }

    static j a(q qVar, Object obj) {
        List list = f33755d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new j(obj, qVar);
                }
                j jVar = (j) list.remove(size - 1);
                jVar.f33756a = obj;
                jVar.f33757b = qVar;
                jVar.f33758c = null;
                return jVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static void b(j jVar) {
        jVar.f33756a = null;
        jVar.f33757b = null;
        jVar.f33758c = null;
        List list = f33755d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(jVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
