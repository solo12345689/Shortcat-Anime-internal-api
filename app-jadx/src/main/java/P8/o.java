package P8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class o extends BasePendingResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f13571a;

    public o(f fVar, k kVar) {
        super(fVar);
        this.f13571a = kVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final k a(Status status) {
        return this.f13571a;
    }
}
