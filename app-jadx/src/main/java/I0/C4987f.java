package i0;

import Td.C2160k;
import j0.AbstractC5325b;
import j0.C5324a;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: i0.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4987f extends AbstractC4993l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Function1 f48488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC4993l f48489h;

    public C4987f(long j10, C4997p c4997p, Function1 function1, AbstractC4993l abstractC4993l) {
        super(j10, c4997p, null);
        this.f48488g = function1;
        this.f48489h = abstractC4993l;
        abstractC4993l.m(this);
    }

    public final AbstractC4993l A() {
        return this.f48489h;
    }

    @Override // i0.AbstractC4993l
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Function1 g() {
        return this.f48488g;
    }

    @Override // i0.AbstractC4993l
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public Void m(AbstractC4993l abstractC4993l) {
        AbstractC4964H.b();
        throw new C2160k();
    }

    @Override // i0.AbstractC4993l
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Void n(AbstractC4993l abstractC4993l) {
        AbstractC4964H.b();
        throw new C2160k();
    }

    @Override // i0.AbstractC4993l
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Void p(InterfaceC4976U interfaceC4976U) {
        AbstractC5003v.g0();
        throw new C2160k();
    }

    @Override // i0.AbstractC4993l
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public C4987f x(Function1 function1) {
        Map map;
        b0.e eVar = AbstractC5325b.f51587a;
        if (eVar != null) {
            Pair pairE = AbstractC5325b.e(eVar, this, true, function1, null);
            C5324a c5324a = (C5324a) pairE.c();
            Function1 function1A = c5324a.a();
            c5324a.b();
            map = (Map) pairE.d();
            function1 = function1A;
        } else {
            map = null;
        }
        C4987f c4987f = new C4987f(i(), f(), AbstractC5003v.Q(function1, g(), false, 4, null), A());
        if (eVar != null) {
            AbstractC5325b.b(eVar, this, c4987f, map);
        }
        return c4987f;
    }

    @Override // i0.AbstractC4993l
    public void d() {
        if (e()) {
            return;
        }
        if (i() != this.f48489h.i()) {
            b();
        }
        this.f48489h.n(this);
        super.d();
        AbstractC5325b.d(this);
    }

    @Override // i0.AbstractC4993l
    public boolean h() {
        return true;
    }

    @Override // i0.AbstractC4993l
    public Function1 k() {
        return null;
    }

    @Override // i0.AbstractC4993l
    public void o() {
    }
}
