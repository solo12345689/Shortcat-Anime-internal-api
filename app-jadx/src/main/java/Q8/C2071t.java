package Q8;

import P8.h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: renamed from: Q8.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C2071t implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f14511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2073v f14512b;

    C2071t(C2073v c2073v, BasePendingResult basePendingResult) {
        this.f14512b = c2073v;
        this.f14511a = basePendingResult;
    }

    @Override // P8.h.a
    public final void a(Status status) {
        this.f14512b.f14515a.remove(this.f14511a);
    }
}
