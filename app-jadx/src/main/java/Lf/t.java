package Lf;

import Gf.M0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f11600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M0 f11601b;

    static {
        t tVar = new t();
        f11600a = tVar;
        F.f("kotlinx.coroutines.fast.service.loader", true);
        f11601b = tVar.a();
    }

    private t() {
    }

    private final M0 a() {
        Object next;
        M0 m0E;
        try {
            List listT = Cf.l.T(Cf.l.g(ServiceLoader.load(s.class, s.class.getClassLoader()).iterator()));
            Iterator it = listT.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((s) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((s) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            s sVar = (s) next;
            if (sVar != null && (m0E = u.e(sVar, listT)) != null) {
                return m0E;
            }
            u.b(null, null, 3, null);
            return null;
        } catch (Throwable th2) {
            u.b(th2, null, 2, null);
            return null;
        }
    }
}
