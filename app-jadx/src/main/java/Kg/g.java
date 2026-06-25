package kg;

import dg.C;
import dg.E;
import dg.InterfaceC4624e;
import dg.v;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class g implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jg.e f52207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f52208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f52209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jg.c f52210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C f52211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f52212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f52213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f52214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f52215i;

    public g(jg.e call, List interceptors, int i10, jg.c cVar, C request, int i11, int i12, int i13) {
        AbstractC5504s.h(call, "call");
        AbstractC5504s.h(interceptors, "interceptors");
        AbstractC5504s.h(request, "request");
        this.f52207a = call;
        this.f52208b = interceptors;
        this.f52209c = i10;
        this.f52210d = cVar;
        this.f52211e = request;
        this.f52212f = i11;
        this.f52213g = i12;
        this.f52214h = i13;
    }

    public static /* synthetic */ g c(g gVar, int i10, jg.c cVar, C c10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = gVar.f52209c;
        }
        if ((i14 & 2) != 0) {
            cVar = gVar.f52210d;
        }
        if ((i14 & 4) != 0) {
            c10 = gVar.f52211e;
        }
        if ((i14 & 8) != 0) {
            i11 = gVar.f52212f;
        }
        if ((i14 & 16) != 0) {
            i12 = gVar.f52213g;
        }
        if ((i14 & 32) != 0) {
            i13 = gVar.f52214h;
        }
        int i15 = i12;
        int i16 = i13;
        return gVar.b(i10, cVar, c10, i11, i15, i16);
    }

    @Override // dg.v.a
    public E a(C request) {
        AbstractC5504s.h(request, "request");
        if (this.f52209c >= this.f52208b.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f52215i++;
        jg.c cVar = this.f52210d;
        if (cVar != null) {
            if (!cVar.j().g(request.p())) {
                throw new IllegalStateException(("network interceptor " + this.f52208b.get(this.f52209c - 1) + " must retain the same host and port").toString());
            }
            if (this.f52215i != 1) {
                throw new IllegalStateException(("network interceptor " + this.f52208b.get(this.f52209c - 1) + " must call proceed() exactly once").toString());
            }
        }
        g gVarC = c(this, this.f52209c + 1, null, request, 0, 0, 0, 58, null);
        v vVar = (v) this.f52208b.get(this.f52209c);
        E eA = vVar.a(gVarC);
        if (eA == null) {
            throw new NullPointerException("interceptor " + vVar + " returned null");
        }
        if (this.f52210d != null && this.f52209c + 1 < this.f52208b.size() && gVarC.f52215i != 1) {
            throw new IllegalStateException(("network interceptor " + vVar + " must call proceed() exactly once").toString());
        }
        if (eA.j() != null) {
            return eA;
        }
        throw new IllegalStateException(("interceptor " + vVar + " returned a response with no body").toString());
    }

    public final g b(int i10, jg.c cVar, C request, int i11, int i12, int i13) {
        AbstractC5504s.h(request, "request");
        return new g(this.f52207a, this.f52208b, i10, cVar, request, i11, i12, i13);
    }

    @Override // dg.v.a
    public InterfaceC4624e call() {
        return this.f52207a;
    }

    public final jg.e d() {
        return this.f52207a;
    }

    public final int e() {
        return this.f52212f;
    }

    public final jg.c f() {
        return this.f52210d;
    }

    public final int g() {
        return this.f52213g;
    }

    public final C h() {
        return this.f52211e;
    }

    public final int i() {
        return this.f52214h;
    }

    public int j() {
        return this.f52213g;
    }

    @Override // dg.v.a
    public C z() {
        return this.f52211e;
    }
}
