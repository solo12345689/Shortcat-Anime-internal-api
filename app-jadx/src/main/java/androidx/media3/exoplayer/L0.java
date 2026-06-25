package androidx.media3.exoplayer;

import android.os.Looper;
import t2.AbstractC6614a;
import t2.InterfaceC6623j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f30434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f30435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6623j f30436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q2.Y f30437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f30439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Looper f30440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f30441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f30442i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f30443j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f30444k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f30445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f30446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f30447n;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void i(L0 l02);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void v(int i10, Object obj);
    }

    public L0(a aVar, b bVar, q2.Y y10, int i10, InterfaceC6623j interfaceC6623j, Looper looper) {
        this.f30435b = aVar;
        this.f30434a = bVar;
        this.f30437d = y10;
        this.f30440g = looper;
        this.f30436c = interfaceC6623j;
        this.f30441h = i10;
    }

    public boolean a() {
        return this.f30443j;
    }

    public Looper b() {
        return this.f30440g;
    }

    public int c() {
        return this.f30441h;
    }

    public Object d() {
        return this.f30439f;
    }

    public long e() {
        return this.f30442i;
    }

    public b f() {
        return this.f30434a;
    }

    public q2.Y g() {
        return this.f30437d;
    }

    public int h() {
        return this.f30438e;
    }

    public synchronized boolean i() {
        return this.f30447n;
    }

    public synchronized void j(boolean z10) {
        this.f30445l = z10 | this.f30445l;
        this.f30446m = true;
        notifyAll();
    }

    public L0 k() {
        AbstractC6614a.g(!this.f30444k);
        if (this.f30442i == -9223372036854775807L) {
            AbstractC6614a.a(this.f30443j);
        }
        this.f30444k = true;
        this.f30435b.i(this);
        return this;
    }

    public L0 l(Object obj) {
        AbstractC6614a.g(!this.f30444k);
        this.f30439f = obj;
        return this;
    }

    public L0 m(int i10) {
        AbstractC6614a.g(!this.f30444k);
        this.f30438e = i10;
        return this;
    }
}
