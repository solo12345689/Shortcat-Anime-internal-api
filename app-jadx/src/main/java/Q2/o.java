package Q2;

import M2.C1934y;
import Q2.m;
import android.net.Uri;
import java.io.InputStream;
import java.util.Map;
import t2.AbstractC6614a;
import t2.a0;
import w2.C6930D;
import w2.InterfaceC6940g;
import w2.o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2.o f14346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C6930D f14348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f14349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Object f14350f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        Object a(Uri uri, InputStream inputStream);
    }

    public o(InterfaceC6940g interfaceC6940g, Uri uri, int i10, a aVar) {
        this(interfaceC6940g, new o.b().i(uri).b(1).a(), i10, aVar);
    }

    @Override // Q2.m.e
    public final void a() {
        this.f14348d.s();
        w2.m mVar = new w2.m(this.f14348d, this.f14346b);
        try {
            mVar.b();
            this.f14350f = this.f14349e.a((Uri) AbstractC6614a.e(this.f14348d.c()), mVar);
        } finally {
            a0.p(mVar);
        }
    }

    public long b() {
        return this.f14348d.p();
    }

    public Map d() {
        return this.f14348d.r();
    }

    public final Object e() {
        return this.f14350f;
    }

    public Uri f() {
        return this.f14348d.q();
    }

    public o(InterfaceC6940g interfaceC6940g, w2.o oVar, int i10, a aVar) {
        this.f14348d = new C6930D(interfaceC6940g);
        this.f14346b = oVar;
        this.f14347c = i10;
        this.f14349e = aVar;
        this.f14345a = C1934y.a();
    }

    @Override // Q2.m.e
    public final void c() {
    }
}
