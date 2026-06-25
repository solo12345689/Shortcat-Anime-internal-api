package t2;

/* JADX INFO: renamed from: t2.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C6626m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6623j f60604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f60605b;

    public C6626m() {
        this(InterfaceC6623j.f60596a);
    }

    public synchronized void a() {
        while (!this.f60605b) {
            this.f60604a.f();
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f60605b) {
            try {
                this.f60604a.f();
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c(long j10) {
        if (j10 <= 0) {
            return this.f60605b;
        }
        long jC = this.f60604a.c();
        long j11 = j10 + jC;
        if (j11 < jC) {
            b();
        } else {
            boolean z10 = false;
            while (!this.f60605b && jC < j11) {
                try {
                    this.f60604a.f();
                    wait(j11 - jC);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                jC = this.f60604a.c();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f60605b;
    }

    public synchronized boolean d() {
        boolean z10;
        z10 = this.f60605b;
        this.f60605b = false;
        return z10;
    }

    public synchronized boolean e() {
        return this.f60605b;
    }

    public synchronized boolean f() {
        if (this.f60605b) {
            return false;
        }
        this.f60605b = true;
        notifyAll();
        return true;
    }

    public C6626m(InterfaceC6623j interfaceC6623j) {
        this.f60604a = interfaceC6623j;
    }
}
