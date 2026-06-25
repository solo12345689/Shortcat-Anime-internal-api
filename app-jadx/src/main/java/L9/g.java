package L9;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class g extends ResultReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ n9.j f11339a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, Handler handler, n9.j jVar) {
        super(handler);
        this.f11339a = jVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f11339a.e(null);
    }
}
