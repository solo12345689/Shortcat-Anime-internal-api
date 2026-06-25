package P8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class p extends BasePendingResult {
    public p(f fVar) {
        super(fVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final k a(Status status) {
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
