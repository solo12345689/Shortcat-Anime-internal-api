package androidx.compose.foundation.text.handwriting;

import L.c;
import androidx.compose.foundation.layout.p;
import androidx.compose.ui.e;
import i1.C5015h;
import ie.InterfaceC5082a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f26436a = C5015h.n(40);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f26437b = C5015h.n(10);

    public static final float a() {
        return f26437b;
    }

    public static final float b() {
        return f26436a;
    }

    public static final e c(e eVar, boolean z10, InterfaceC5082a interfaceC5082a) {
        return (z10 && c.a()) ? p.j(eVar.then(new StylusHandwritingElementWithNegativePadding(interfaceC5082a)), f26437b, f26436a) : eVar;
    }
}
