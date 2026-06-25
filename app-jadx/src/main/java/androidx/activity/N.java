package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class N {
    public static final void a(View view, F fullyDrawnReporterOwner) {
        AbstractC5504s.h(view, "<this>");
        AbstractC5504s.h(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(L.f24193a, fullyDrawnReporterOwner);
    }
}
