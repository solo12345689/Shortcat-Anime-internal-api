package L9;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class j extends M9.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ n9.j f11343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f11344c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(m mVar, n9.j jVar, n9.j jVar2) {
        super(jVar);
        this.f11344c = mVar;
        this.f11343b = jVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [M9.f, android.os.IInterface] */
    @Override // M9.j
    protected final void a() {
        try {
            ?? E10 = this.f11344c.f11350a.e();
            String str = this.f11344c.f11351b;
            Bundle bundleA = n.a();
            m mVar = this.f11344c;
            E10.p1(str, bundleA, new l(mVar, this.f11343b, mVar.f11351b));
        } catch (RemoteException e10) {
            m.f11349c.c(e10, "error requesting in-app review for %s", this.f11344c.f11351b);
            this.f11343b.d(new RuntimeException(e10));
        }
    }
}
