package P3;

import android.view.View;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m {
    public static final i a(View view) {
        AbstractC5504s.h(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(a.f13454a);
            i iVar = tag instanceof i ? (i) tag : null;
            if (iVar != null) {
                return iVar;
            }
            Object objA = N1.b.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static final void b(View view, i iVar) {
        AbstractC5504s.h(view, "<this>");
        view.setTag(a.f13454a, iVar);
    }
}
