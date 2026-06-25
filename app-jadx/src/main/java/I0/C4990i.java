package i0;

import Td.C2160k;
import j0.AbstractC5325b;
import j0.C5324a;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: i0.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4990i extends AbstractC4993l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Function1 f48491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f48492h;

    public C4990i(long j10, C4997p c4997p, Function1 function1) {
        super(j10, c4997p, null);
        this.f48491g = function1;
        this.f48492h = 1;
    }

    @Override // i0.AbstractC4993l
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Function1 g() {
        return this.f48491g;
    }

    @Override // i0.AbstractC4993l
    public void d() {
        if (e()) {
            return;
        }
        n(this);
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
    public void m(AbstractC4993l abstractC4993l) {
        this.f48492h++;
    }

    @Override // i0.AbstractC4993l
    public void n(AbstractC4993l abstractC4993l) {
        int i10 = this.f48492h - 1;
        this.f48492h = i10;
        if (i10 == 0) {
            b();
        }
    }

    @Override // i0.AbstractC4993l
    public void p(InterfaceC4976U interfaceC4976U) {
        AbstractC5003v.g0();
        throw new C2160k();
    }

    @Override // i0.AbstractC4993l
    public AbstractC4993l x(Function1 function1) {
        Map map;
        AbstractC5003v.o0(this);
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
        C4987f c4987f = new C4987f(i(), f(), AbstractC5003v.Q(function1, g(), false, 4, null), this);
        if (eVar != null) {
            AbstractC5325b.b(eVar, this, c4987f, map);
        }
        return c4987f;
    }

    @Override // i0.AbstractC4993l
    public void o() {
    }
}
