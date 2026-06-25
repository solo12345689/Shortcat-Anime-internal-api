package p4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import o4.t;

/* JADX INFO: renamed from: p4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C5932c implements InterfaceC5931b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f55801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Handler f55802b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f55803c = new a();

    /* JADX INFO: renamed from: p4.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C5932c.this.f55802b.post(runnable);
        }
    }

    public C5932c(Executor executor) {
        this.f55801a = new t(executor);
    }

    @Override // p4.InterfaceC5931b
    public Executor a() {
        return this.f55803c;
    }

    @Override // p4.InterfaceC5931b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public t b() {
        return this.f55801a;
    }
}
