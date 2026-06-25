package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.internal.AbstractC5504s;
import m2.AbstractC5630c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static final Y a(View view) {
        AbstractC5504s.h(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(AbstractC5630c.f53050a);
            Y y10 = tag instanceof Y ? (Y) tag : null;
            if (y10 != null) {
                return y10;
            }
            Object objA = N1.b.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static final void b(View view, Y y10) {
        AbstractC5504s.h(view, "<this>");
        view.setTag(AbstractC5630c.f53050a, y10);
    }
}
