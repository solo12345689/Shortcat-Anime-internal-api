package o4;

import androidx.work.impl.E;
import i4.l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f54502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.o f54503b = new androidx.work.impl.o();

    public s(E e10) {
        this.f54502a = e10;
    }

    public i4.l a() {
        return this.f54503b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f54502a.v().J().b();
            this.f54503b.a(i4.l.f48678a);
        } catch (Throwable th2) {
            this.f54503b.a(new l.b.a(th2));
        }
    }
}
