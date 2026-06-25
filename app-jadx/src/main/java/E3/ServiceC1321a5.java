package E3;

import E3.C1375h3;
import F3.g;
import F3.n;
import F3.q;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import t2.AbstractC6635w;
import t2.C6626m;

/* JADX INFO: renamed from: E3.a5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class ServiceC1321a5 extends F3.g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final F3.q f5128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final I3 f5129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C1363g f5130l;

    public ServiceC1321a5(I3 i32) {
        this.f5128j = F3.q.a(i32.a0());
        this.f5129k = i32;
        this.f5130l = new C1363g(i32);
    }

    public static /* synthetic */ void t(ServiceC1321a5 serviceC1321a5, AtomicReference atomicReference, C1375h3.g gVar, C6626m c6626m) {
        atomicReference.set(serviceC1321a5.f5129k.x0(gVar));
        c6626m.f();
    }

    @Override // F3.g
    public g.e g(String str, int i10, Bundle bundle) {
        q.b bVarD = d();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        final C1375h3.g gVarU = u(bVarD, bundle);
        final AtomicReference atomicReference = new AtomicReference();
        final C6626m c6626m = new C6626m();
        t2.a0.g1(this.f5129k.X(), new Runnable() { // from class: E3.Z4
            @Override // java.lang.Runnable
            public final void run() {
                ServiceC1321a5.t(this.f5091a, atomicReference, gVarU, c6626m);
            }
        });
        try {
            c6626m.a();
            C1375h3.e eVar = (C1375h3.e) atomicReference.get();
            if (!eVar.f5318a) {
                return null;
            }
            this.f5130l.e(bVarD, gVarU, eVar.f5319b, eVar.f5320c);
            return L6.f4573a;
        } catch (InterruptedException e10) {
            AbstractC6635w.e("MSSLegacyStub", "Couldn't get a result from onConnect", e10);
            return null;
        }
    }

    @Override // F3.g
    public void h(String str, g.l lVar) {
        lVar.f(null);
    }

    public C1375h3.g u(q.b bVar, Bundle bundle) {
        return new C1375h3.g(bVar, 0, 0, this.f5128j.b(bVar), null, bundle, AbstractC1466t.b0(bundle));
    }

    public void v(n.j jVar) {
        c(this.f5129k.a0());
        onCreate();
        s(jVar);
    }
}
