package K8;

import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class l extends e {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ m f10959a;

    l(m mVar) {
        Objects.requireNonNull(mVar);
        this.f10959a = mVar;
    }

    @Override // K8.e, K8.v
    public final void L2(Status status) {
        this.f10959a.setResult(status);
    }
}
