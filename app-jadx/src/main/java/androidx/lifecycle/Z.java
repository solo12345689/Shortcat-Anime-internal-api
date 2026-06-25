package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.internal.AbstractC5504s;
import l2.AbstractC5545a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Z {
    public static final r a(View view) {
        AbstractC5504s.h(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(AbstractC5545a.f52534a);
            r rVar = tag instanceof r ? (r) tag : null;
            if (rVar != null) {
                return rVar;
            }
            Object objA = N1.b.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static final void b(View view, r rVar) {
        AbstractC5504s.h(view, "<this>");
        view.setTag(AbstractC5545a.f52534a, rVar);
    }
}
