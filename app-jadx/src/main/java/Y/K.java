package Y;

import k0.InterfaceC5422l;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f22161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC2460y f22162b;

    public K(InterfaceC5422l interfaceC5422l, boolean z10, AbstractC2460y abstractC2460y) {
        this.f22161a = z10;
        this.f22162b = abstractC2460y;
    }

    public final InterfaceC5422l a() {
        if (this.f22161a) {
            return null;
        }
        this.f22162b.k();
        AbstractC5504s.c(null, null);
        return null;
    }

    public /* synthetic */ K(InterfaceC5422l interfaceC5422l, boolean z10, AbstractC2460y abstractC2460y, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : interfaceC5422l, (i10 & 2) != 0 ? false : z10, abstractC2460y);
    }
}
