package N2;

import M2.C1934y;
import Q2.m;
import android.net.Uri;
import java.util.Map;
import q2.C6109x;
import t2.AbstractC6614a;
import w2.C6930D;
import w2.InterfaceC6940g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12605a = C1934y.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2.o f12606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C6109x f12608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f12610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f12611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f12612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final C6930D f12613i;

    public e(InterfaceC6940g interfaceC6940g, w2.o oVar, int i10, C6109x c6109x, int i11, Object obj, long j10, long j11) {
        this.f12613i = new C6930D(interfaceC6940g);
        this.f12606b = (w2.o) AbstractC6614a.e(oVar);
        this.f12607c = i10;
        this.f12608d = c6109x;
        this.f12609e = i11;
        this.f12610f = obj;
        this.f12611g = j10;
        this.f12612h = j11;
    }

    public final long b() {
        return this.f12613i.p();
    }

    public final long d() {
        return this.f12612h - this.f12611g;
    }

    public final Map e() {
        return this.f12613i.r();
    }

    public final Uri f() {
        return this.f12613i.q();
    }
}
