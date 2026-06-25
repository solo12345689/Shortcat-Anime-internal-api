package t5;

import java.io.IOException;
import s5.InterfaceC6431b;
import s5.InterfaceC6432c;
import s5.InterfaceC6433d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class l implements InterfaceC6431b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f60818i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static l f60819j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f60820k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC6433d f60821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f60822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f60823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f60824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f60825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IOException f60826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC6432c.a f60827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f60828h;

    private l() {
    }

    public static l a() {
        synchronized (f60818i) {
            try {
                l lVar = f60819j;
                if (lVar == null) {
                    return new l();
                }
                f60819j = lVar.f60828h;
                lVar.f60828h = null;
                f60820k--;
                return lVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void c() {
        this.f60821a = null;
        this.f60822b = null;
        this.f60823c = 0L;
        this.f60824d = 0L;
        this.f60825e = 0L;
        this.f60826f = null;
        this.f60827g = null;
    }

    public void b() {
        synchronized (f60818i) {
            try {
                if (f60820k < 5) {
                    c();
                    f60820k++;
                    l lVar = f60819j;
                    if (lVar != null) {
                        this.f60828h = lVar;
                    }
                    f60819j = this;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public l d(InterfaceC6433d interfaceC6433d) {
        this.f60821a = interfaceC6433d;
        return this;
    }

    public l e(long j10) {
        this.f60824d = j10;
        return this;
    }

    public l f(long j10) {
        this.f60825e = j10;
        return this;
    }

    public l g(InterfaceC6432c.a aVar) {
        this.f60827g = aVar;
        return this;
    }

    public l h(IOException iOException) {
        this.f60826f = iOException;
        return this;
    }

    public l i(long j10) {
        this.f60823c = j10;
        return this;
    }

    public l j(String str) {
        this.f60822b = str;
        return this;
    }
}
