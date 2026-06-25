package N8;

import android.os.Looper;
import android.os.Message;
import e9.HandlerC4663f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class i extends HandlerC4663f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1974c f12731b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(C1974c c1974c, Looper looper) {
        super(looper);
        this.f12731b = c1974c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1974c.g(this.f12731b, message);
    }
}
