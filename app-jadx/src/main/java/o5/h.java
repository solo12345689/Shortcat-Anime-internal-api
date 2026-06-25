package O5;

import android.content.res.Resources;
import java.util.concurrent.Executor;
import x6.x;
import y5.n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Resources f13034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private R5.a f13035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private D6.a f13036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private D6.a f13037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Executor f13038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x f13039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private y5.f f13040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n f13041h;

    public void a(Resources resources, R5.a aVar, D6.a aVar2, D6.a aVar3, Executor executor, x xVar, y5.f fVar, n nVar) {
        this.f13034a = resources;
        this.f13035b = aVar;
        this.f13036c = aVar2;
        this.f13037d = aVar3;
        this.f13038e = executor;
        this.f13039f = xVar;
        this.f13040g = fVar;
        this.f13041h = nVar;
    }

    protected e b(Resources resources, R5.a aVar, D6.a aVar2, D6.a aVar3, Executor executor, x xVar, y5.f fVar) {
        return new e(resources, aVar, aVar2, aVar3, executor, xVar, fVar);
    }

    public e c() {
        e eVarB = b(this.f13034a, this.f13035b, this.f13036c, this.f13037d, this.f13038e, this.f13039f, this.f13040g);
        n nVar = this.f13041h;
        if (nVar != null) {
            eVarB.B0(((Boolean) nVar.get()).booleanValue());
        }
        return eVarB;
    }
}
