package j0;

import Td.z;
import Ud.a0;
import a0.f;
import b0.e;
import i0.AbstractC4993l;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import t.e0;

/* JADX INFO: renamed from: j0.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5325b {

    /* JADX INFO: renamed from: a */
    private static e f51587a;

    public static final void b(e eVar, AbstractC4993l abstractC4993l, AbstractC4993l abstractC4993l2, Map map) {
        if (eVar.size() > 0) {
            android.support.v4.media.session.b.a(eVar.get(0));
            if (map == null) {
                throw null;
            }
            throw null;
        }
    }

    public static final void c(AbstractC4993l abstractC4993l, e0 e0Var) {
        e eVar = f51587a;
        if (eVar == null || eVar.isEmpty()) {
            return;
        }
        if (e0Var == null || f.a(e0Var) == null) {
            a0.d();
        }
        if (eVar.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(eVar.get(0));
        throw null;
    }

    public static final void d(AbstractC4993l abstractC4993l) {
        e eVar = f51587a;
        if (eVar == null || eVar.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(eVar.get(0));
        throw null;
    }

    public static final Pair e(e eVar, AbstractC4993l abstractC4993l, boolean z10, Function1 function1, Function1 function12) {
        if (eVar.size() <= 0) {
            return z.a(new C5324a(function1, function12), null);
        }
        android.support.v4.media.session.b.a(eVar.get(0));
        throw null;
    }
}
