package P1;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC2759g0;
import androidx.core.view.AbstractC2761h0;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f13255a = d.f13259b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f13256b = d.f13258a;

    public static final void a(View view, b listener) {
        AbstractC5504s.h(view, "<this>");
        AbstractC5504s.h(listener, "listener");
        d(view).a(listener);
    }

    public static final void b(View view) {
        AbstractC5504s.h(view, "<this>");
        Iterator it = AbstractC2761h0.a(view).iterator();
        while (it.hasNext()) {
            d((View) it.next()).b();
        }
    }

    public static final void c(ViewGroup viewGroup) {
        AbstractC5504s.h(viewGroup, "<this>");
        Iterator it = AbstractC2759g0.a(viewGroup).iterator();
        while (it.hasNext()) {
            d((View) it.next()).b();
        }
    }

    private static final c d(View view) {
        int i10 = f13255a;
        c cVar = (c) view.getTag(i10);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        view.setTag(i10, cVar2);
        return cVar2;
    }

    public static final boolean e(View view) {
        AbstractC5504s.h(view, "<this>");
        Object tag = view.getTag(f13256b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean f(View view) {
        AbstractC5504s.h(view, "<this>");
        for (Object obj : AbstractC2761h0.b(view)) {
            if ((obj instanceof View) && e((View) obj)) {
                return true;
            }
        }
        return false;
    }

    public static final void g(View view, b listener) {
        AbstractC5504s.h(view, "<this>");
        AbstractC5504s.h(listener, "listener");
        d(view).c(listener);
    }

    public static final void h(View view, boolean z10) {
        AbstractC5504s.h(view, "<this>");
        view.setTag(f13256b, Boolean.valueOf(z10));
    }
}
