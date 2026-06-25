package Q8;

import P8.h;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Q8.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2065m extends P8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BasePendingResult f14503a;

    public C2065m(P8.h hVar) {
        this.f14503a = (BasePendingResult) hVar;
    }

    @Override // P8.h
    public final void addStatusListener(h.a aVar) {
        this.f14503a.addStatusListener(aVar);
    }

    @Override // P8.h
    public final P8.k await(long j10, TimeUnit timeUnit) {
        return this.f14503a.await(j10, timeUnit);
    }
}
