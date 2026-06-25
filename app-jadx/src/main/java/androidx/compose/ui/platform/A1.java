package androidx.compose.ui.platform;

import i1.AbstractC5016i;
import i1.C5015h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface A1 {
    long a();

    long b();

    long c();

    default float d() {
        return 2.0f;
    }

    default long e() {
        float f10 = 48;
        return AbstractC5016i.b(C5015h.n(f10), C5015h.n(f10));
    }

    default float f() {
        return Float.MAX_VALUE;
    }

    float g();

    default float h() {
        return 16.0f;
    }
}
