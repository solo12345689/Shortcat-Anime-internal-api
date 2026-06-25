package L9;

import M9.t;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class k extends M9.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final M9.i f11345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final n9.j f11346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f11347c;

    k(m mVar, M9.i iVar, n9.j jVar) {
        this.f11347c = mVar;
        this.f11345a = iVar;
        this.f11346b = jVar;
    }

    @Override // M9.h
    public void f(Bundle bundle) {
        t tVar = this.f11347c.f11350a;
        if (tVar != null) {
            tVar.r(this.f11346b);
        }
        this.f11345a.d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
