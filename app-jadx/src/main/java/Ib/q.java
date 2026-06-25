package Ib;

import b5.AbstractC3012n;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final o f9003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f9004k;

    public q(o target) {
        AbstractC5504s.h(target, "target");
        this.f9003j = target;
    }

    @Override // b5.AbstractC3012n
    public AbstractC3012n.g a(int i10, int i11, int i12, int i13) {
        return AbstractC3012n.g.QUALITY;
    }

    @Override // b5.AbstractC3012n
    public float b(int i10, int i11, int i12, int i13) {
        if (this.f9004k) {
            return 1.0f;
        }
        this.f9003j.z(i10);
        this.f9003j.y(i11);
        this.f9004k = true;
        return 1.0f;
    }
}
