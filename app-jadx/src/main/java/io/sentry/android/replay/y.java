package io.sentry.android.replay;

import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y {
    public static final Window a(View view) {
        AbstractC5504s.h(view, "<this>");
        x xVar = x.f50518a;
        View rootView = view.getRootView();
        AbstractC5504s.g(rootView, "getRootView(...)");
        return xVar.d(rootView);
    }
}
