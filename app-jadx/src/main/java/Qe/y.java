package Qe;

import kotlin.jvm.internal.AbstractC5504s;
import ye.h0;
import ye.i0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class y implements h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Le.D f14916b;

    public y(Le.D packageFragment) {
        AbstractC5504s.h(packageFragment, "packageFragment");
        this.f14916b = packageFragment;
    }

    @Override // ye.h0
    public i0 b() {
        i0 NO_SOURCE_FILE = i0.f65113a;
        AbstractC5504s.g(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public String toString() {
        return this.f14916b + ": " + this.f14916b.O0().keySet();
    }
}
