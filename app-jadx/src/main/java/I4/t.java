package i4;

import android.content.Context;
import androidx.work.impl.E;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum a {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    protected t() {
    }

    public static t h(Context context) {
        return E.q(context);
    }

    public static void i(Context context, androidx.work.a aVar) {
        E.i(context, aVar);
    }

    public abstract l a(String str);

    public abstract l b(String str);

    public final l c(u uVar) {
        return d(Collections.singletonList(uVar));
    }

    public abstract l d(List list);

    public abstract l e(String str, c cVar, n nVar);

    public l f(String str, d dVar, k kVar) {
        return g(str, dVar, Collections.singletonList(kVar));
    }

    public abstract l g(String str, d dVar, List list);

    public abstract l j();
}
