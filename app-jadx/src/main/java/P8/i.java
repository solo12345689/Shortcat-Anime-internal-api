package P8;

import Q8.C2065m;
import Q8.C2069q;
import R8.AbstractC2115p;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static h a(k kVar, f fVar) {
        AbstractC2115p.m(kVar, "Result must not be null");
        AbstractC2115p.b(!kVar.b().l(), "Status code must not be SUCCESS");
        o oVar = new o(fVar, kVar);
        oVar.setResult(kVar);
        return oVar;
    }

    public static g b(k kVar, f fVar) {
        AbstractC2115p.m(kVar, "Result must not be null");
        p pVar = new p(fVar);
        pVar.setResult(kVar);
        return new C2065m(pVar);
    }

    public static h c(Status status, f fVar) {
        AbstractC2115p.m(status, "Result must not be null");
        C2069q c2069q = new C2069q(fVar);
        c2069q.setResult(status);
        return c2069q;
    }
}
