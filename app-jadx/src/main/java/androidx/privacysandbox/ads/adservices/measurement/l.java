package androidx.privacysandbox.ads.adservices.measurement;

import Gf.C1627p;
import Gf.O;
import Gf.P;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MeasurementManager f31614b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f31616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f31617c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, l lVar, Zd.e eVar) {
            super(2, eVar);
            this.f31617c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = new a(null, this.f31617c, eVar);
            aVar.f31616b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f31615a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            throw null;
        }
    }

    public l(MeasurementManager mMeasurementManager) {
        AbstractC5504s.h(mMeasurementManager, "mMeasurementManager");
        this.f31614b = mMeasurementManager;
    }

    static /* synthetic */ Object h(l lVar, androidx.privacysandbox.ads.adservices.measurement.a aVar, Zd.e eVar) {
        new C1627p(AbstractC2605b.c(eVar), 1).C();
        lVar.i();
        throw null;
    }

    static /* synthetic */ Object j(l lVar, Zd.e eVar) {
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        lVar.i().getMeasurementApiStatus(new k(), G1.m.a(c1627p));
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV;
    }

    static /* synthetic */ Object k(l lVar, Uri uri, InputEvent inputEvent, Zd.e eVar) {
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        lVar.i().registerSource(uri, inputEvent, new k(), G1.m.a(c1627p));
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV == AbstractC2605b.f() ? objV : L.f17438a;
    }

    static /* synthetic */ Object l(l lVar, m mVar, Zd.e eVar) {
        Object objE = P.e(new a(mVar, lVar, null), eVar);
        return objE == AbstractC2605b.f() ? objE : L.f17438a;
    }

    static /* synthetic */ Object m(l lVar, Uri uri, Zd.e eVar) {
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        lVar.i().registerTrigger(uri, new k(), G1.m.a(c1627p));
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV == AbstractC2605b.f() ? objV : L.f17438a;
    }

    static /* synthetic */ Object n(l lVar, n nVar, Zd.e eVar) {
        new C1627p(AbstractC2605b.c(eVar), 1).C();
        lVar.i();
        throw null;
    }

    static /* synthetic */ Object o(l lVar, o oVar, Zd.e eVar) {
        new C1627p(AbstractC2605b.c(eVar), 1).C();
        lVar.i();
        throw null;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object a(androidx.privacysandbox.ads.adservices.measurement.a aVar, Zd.e eVar) {
        return h(this, aVar, eVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object b(Zd.e eVar) {
        return j(this, eVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object c(Uri uri, InputEvent inputEvent, Zd.e eVar) {
        return k(this, uri, inputEvent, eVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object d(m mVar, Zd.e eVar) {
        return l(this, mVar, eVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object e(Uri uri, Zd.e eVar) {
        return m(this, uri, eVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object f(n nVar, Zd.e eVar) {
        return n(this, nVar, eVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object g(o oVar, Zd.e eVar) {
        return o(this, oVar, eVar);
    }

    protected final MeasurementManager i() {
        return this.f31614b;
    }
}
