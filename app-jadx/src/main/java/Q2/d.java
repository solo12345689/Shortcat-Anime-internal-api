package Q2;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import t2.AbstractC6614a;
import w2.InterfaceC6932F;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface d {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {

        /* JADX INFO: renamed from: Q2.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0241a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList f14272a = new CopyOnWriteArrayList();

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: Q2.d$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0242a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Handler f14273a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final a f14274b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f14275c;

                public C0242a(Handler handler, a aVar) {
                    this.f14273a = handler;
                    this.f14274b = aVar;
                }

                public void d() {
                    this.f14275c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                AbstractC6614a.e(handler);
                AbstractC6614a.e(aVar);
                d(aVar);
                this.f14272a.add(new C0242a(handler, aVar));
            }

            public void c(int i10, long j10, long j11) {
                final int i11;
                final long j12;
                final long j13;
                for (final C0242a c0242a : this.f14272a) {
                    if (c0242a.f14275c) {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                    } else {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                        c0242a.f14273a.post(new Runnable() { // from class: Q2.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                c0242a.f14274b.K(i11, j12, j13);
                            }
                        });
                    }
                    i10 = i11;
                    j10 = j12;
                    j11 = j13;
                }
            }

            public void d(a aVar) {
                for (C0242a c0242a : this.f14272a) {
                    if (c0242a.f14274b == aVar) {
                        c0242a.d();
                        this.f14272a.remove(c0242a);
                    }
                }
            }
        }

        void K(int i10, long j10, long j11);
    }

    default long a() {
        return -9223372036854775807L;
    }

    InterfaceC6932F c();

    long d();

    void f(a aVar);

    void i(Handler handler, a aVar);
}
