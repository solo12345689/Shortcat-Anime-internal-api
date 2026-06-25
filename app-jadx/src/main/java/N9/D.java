package n9;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f54005a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue f54006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f54007c;

    D() {
    }

    public final void a(C c10) {
        synchronized (this.f54005a) {
            try {
                if (this.f54006b == null) {
                    this.f54006b = new ArrayDeque();
                }
                this.f54006b.add(c10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(i iVar) {
        C c10;
        synchronized (this.f54005a) {
            if (this.f54006b != null && !this.f54007c) {
                this.f54007c = true;
                while (true) {
                    synchronized (this.f54005a) {
                        try {
                            c10 = (C) this.f54006b.poll();
                            if (c10 == null) {
                                this.f54007c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    c10.b(iVar);
                }
            }
        }
    }
}
