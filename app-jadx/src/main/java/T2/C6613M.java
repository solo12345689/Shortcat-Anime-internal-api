package t2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import t2.InterfaceC6631s;

/* JADX INFO: renamed from: t2.M, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C6613M implements InterfaceC6631s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f60540b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f60541a;

    /* JADX INFO: renamed from: t2.M$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements InterfaceC6631s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Message f60542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C6613M f60543b;

        private b() {
        }

        private void b() {
            this.f60542a = null;
            this.f60543b = null;
            C6613M.o(this);
        }

        @Override // t2.InterfaceC6631s.a
        public void a() {
            ((Message) AbstractC6614a.e(this.f60542a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) AbstractC6614a.e(this.f60542a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        public b d(Message message, C6613M c6613m) {
            this.f60542a = message;
            this.f60543b = c6613m;
            return this;
        }
    }

    public C6613M(Handler handler) {
        this.f60541a = handler;
    }

    private static b n() {
        b bVar;
        List list = f60540b;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : (b) list.remove(list.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(b bVar) {
        List list = f60540b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // t2.InterfaceC6631s
    public boolean a(InterfaceC6631s.a aVar) {
        return ((b) aVar).c(this.f60541a);
    }

    @Override // t2.InterfaceC6631s
    public InterfaceC6631s.a b(int i10) {
        return n().d(this.f60541a.obtainMessage(i10), this);
    }

    @Override // t2.InterfaceC6631s
    public boolean c(int i10) {
        AbstractC6614a.a(i10 != 0);
        return this.f60541a.hasMessages(i10);
    }

    @Override // t2.InterfaceC6631s
    public InterfaceC6631s.a d(int i10, int i11, int i12, Object obj) {
        return n().d(this.f60541a.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // t2.InterfaceC6631s
    public InterfaceC6631s.a e(int i10, Object obj) {
        return n().d(this.f60541a.obtainMessage(i10, obj), this);
    }

    @Override // t2.InterfaceC6631s
    public void f(Object obj) {
        this.f60541a.removeCallbacksAndMessages(obj);
    }

    @Override // t2.InterfaceC6631s
    public Looper g() {
        return this.f60541a.getLooper();
    }

    @Override // t2.InterfaceC6631s
    public InterfaceC6631s.a h(int i10, int i11, int i12) {
        return n().d(this.f60541a.obtainMessage(i10, i11, i12), this);
    }

    @Override // t2.InterfaceC6631s
    public boolean i(Runnable runnable) {
        return this.f60541a.post(runnable);
    }

    @Override // t2.InterfaceC6631s
    public boolean j(int i10) {
        return this.f60541a.sendEmptyMessage(i10);
    }

    @Override // t2.InterfaceC6631s
    public boolean k(int i10, long j10) {
        return this.f60541a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // t2.InterfaceC6631s
    public void l(int i10) {
        AbstractC6614a.a(i10 != 0);
        this.f60541a.removeMessages(i10);
    }
}
