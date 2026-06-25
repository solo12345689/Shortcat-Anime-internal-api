package androidx.lifecycle;

import Gf.C1608f0;
import Gf.X0;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2862p {
    public static final AbstractC2858l a(AbstractC2857k abstractC2857k) {
        C2859m c2859m;
        AbstractC5504s.h(abstractC2857k, "<this>");
        do {
            C2859m c2859m2 = (C2859m) abstractC2857k.getInternalScopeRef().b();
            if (c2859m2 != null) {
                return c2859m2;
            }
            c2859m = new C2859m(abstractC2857k, X0.b(null, 1, null).w(C1608f0.c().b2()));
        } while (!abstractC2857k.getInternalScopeRef().a(null, c2859m));
        c2859m.b();
        return c2859m;
    }
}
