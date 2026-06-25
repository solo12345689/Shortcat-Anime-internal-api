package Qe;

import kotlin.jvm.internal.AbstractC5504s;
import mf.InterfaceC5692x;
import qf.AbstractC6183d0;
import qf.S;
import qf.V;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class p implements InterfaceC5692x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f14892a = new p();

    private p() {
    }

    @Override // mf.InterfaceC5692x
    public S a(Se.r proto, String flexibleId, AbstractC6183d0 lowerBound, AbstractC6183d0 upperBound) {
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(flexibleId, "flexibleId");
        AbstractC5504s.h(lowerBound, "lowerBound");
        AbstractC5504s.h(upperBound, "upperBound");
        return !AbstractC5504s.c(flexibleId, "kotlin.jvm.PlatformType") ? sf.l.d(sf.k.f59653I, flexibleId, lowerBound.toString(), upperBound.toString()) : proto.y(Ve.a.f20034g) ? new Me.k(lowerBound, upperBound) : V.e(lowerBound, upperBound);
    }
}
