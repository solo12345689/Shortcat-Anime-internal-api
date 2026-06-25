package s0;

import android.graphics.ColorSpace;
import kotlin.jvm.internal.AbstractC5504s;
import t0.AbstractC6580c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W0 f58917a = new W0();

    private W0() {
    }

    public static final ColorSpace a(AbstractC6580c abstractC6580c) {
        t0.k kVar = t0.k.f60205a;
        if (AbstractC5504s.c(abstractC6580c, kVar.q())) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (AbstractC5504s.c(abstractC6580c, kVar.r())) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }
}
