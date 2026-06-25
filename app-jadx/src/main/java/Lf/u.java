package Lf;

import Gf.M0;
import Td.C2160k;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class u {
    private static final v a(Throwable th2, String str) throws Throwable {
        if (th2 != null) {
            throw th2;
        }
        d();
        throw new C2160k();
    }

    static /* synthetic */ v b(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th2, str);
    }

    public static final boolean c(M0 m02) {
        return m02.b2() instanceof v;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final M0 e(s sVar, List list) {
        try {
            return sVar.b(list);
        } catch (Throwable th2) {
            return a(th2, sVar.a());
        }
    }
}
