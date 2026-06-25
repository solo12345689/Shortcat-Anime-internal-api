package androidx.fragment.app;

import android.view.View;
import androidx.transition.C2940e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import t.C6551a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V f29887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X f29888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final X f29889c;

    static {
        V v10 = new V();
        f29887a = v10;
        f29888b = new W();
        f29889c = v10.b();
    }

    private V() {
    }

    public static final void a(AbstractComponentCallbacksC2838q inFragment, AbstractComponentCallbacksC2838q outFragment, boolean z10, C6551a sharedElements, boolean z11) {
        AbstractC5504s.h(inFragment, "inFragment");
        AbstractC5504s.h(outFragment, "outFragment");
        AbstractC5504s.h(sharedElements, "sharedElements");
        if (z10) {
            outFragment.getEnterTransitionCallback();
        } else {
            inFragment.getEnterTransitionCallback();
        }
    }

    private final X b() {
        try {
            AbstractC5504s.f(C2940e.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (X) C2940e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void c(C6551a c6551a, C6551a namedViews) {
        AbstractC5504s.h(c6551a, "<this>");
        AbstractC5504s.h(namedViews, "namedViews");
        int size = c6551a.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey((String) c6551a.k(size))) {
                c6551a.i(size);
            }
        }
    }

    public static final void d(List views, int i10) {
        AbstractC5504s.h(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }
}
