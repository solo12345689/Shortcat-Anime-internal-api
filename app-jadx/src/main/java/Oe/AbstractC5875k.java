package oe;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: oe.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5875k {
    public static final void a(boolean z10, Number step) {
        AbstractC5504s.h(step, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + com.amazon.a.a.o.c.a.b.f34706a);
    }

    public static InterfaceC5866b b(float f10, float f11) {
        return new C5865a(f10, f11);
    }
}
