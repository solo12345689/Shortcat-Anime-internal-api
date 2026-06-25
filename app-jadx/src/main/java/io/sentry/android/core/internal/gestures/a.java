package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import io.sentry.android.core.internal.util.m;
import io.sentry.internal.gestures.b;
import io.sentry.util.p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements io.sentry.internal.gestures.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f49764a;

    public a(p pVar) {
        this.f49764a = pVar;
    }

    private io.sentry.internal.gestures.b b(View view) {
        try {
            return new io.sentry.internal.gestures.b(view, m.a(view), i.b(view), null, "old_view_system");
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private static boolean c(View view, boolean z10) {
        if (z10) {
            return ScrollingView.class.isAssignableFrom(view.getClass());
        }
        return false;
    }

    private static boolean d(View view, boolean z10) {
        return (c(view, z10) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0;
    }

    private static boolean e(View view) {
        return view.isClickable() && view.getVisibility() == 0;
    }

    @Override // io.sentry.internal.gestures.a
    public io.sentry.internal.gestures.b a(Object obj, float f10, float f11, b.a aVar) {
        if (!(obj instanceof View)) {
            return null;
        }
        View view = (View) obj;
        if (aVar == b.a.CLICKABLE && e(view)) {
            return b(view);
        }
        if (aVar == b.a.SCROLLABLE && d(view, ((Boolean) this.f49764a.a()).booleanValue())) {
            return b(view);
        }
        return null;
    }
}
