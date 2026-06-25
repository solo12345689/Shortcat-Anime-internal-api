package mf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: mf.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5686q implements InterfaceC5679j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ye.O f53467a;

    public C5686q(ye.O packageFragmentProvider) {
        AbstractC5504s.h(packageFragmentProvider, "packageFragmentProvider");
        this.f53467a = packageFragmentProvider;
    }

    @Override // mf.InterfaceC5679j
    public C5678i a(Xe.b classId) {
        C5678i c5678iA;
        AbstractC5504s.h(classId, "classId");
        for (ye.N n10 : ye.T.c(this.f53467a, classId.f())) {
            if ((n10 instanceof r) && (c5678iA = ((r) n10).H0().a(classId)) != null) {
                return c5678iA;
            }
        }
        return null;
    }
}
