package R8;

import P8.h;
import R8.AbstractC2114o;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class L implements h.a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ P8.h f15211a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ n9.j f15212b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ AbstractC2114o.a f15213c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ N f15214d;

    L(P8.h hVar, n9.j jVar, AbstractC2114o.a aVar, N n10) {
        this.f15211a = hVar;
        this.f15212b = jVar;
        this.f15213c = aVar;
        this.f15214d = n10;
    }

    @Override // P8.h.a
    public final void a(Status status) {
        if (!status.l()) {
            this.f15212b.b(AbstractC2101b.a(status));
        } else {
            this.f15212b.c(this.f15213c.a(this.f15211a.await(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
