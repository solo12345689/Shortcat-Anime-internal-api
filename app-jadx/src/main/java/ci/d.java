package ci;

import ci.g;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: m */
    private static final ExecutorService f33736m = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: e */
    boolean f33741e;

    /* JADX INFO: renamed from: g */
    boolean f33743g;

    /* JADX INFO: renamed from: h */
    boolean f33744h;

    /* JADX INFO: renamed from: j */
    List f33746j;

    /* JADX INFO: renamed from: k */
    g f33747k;

    /* JADX INFO: renamed from: l */
    h f33748l;

    /* JADX INFO: renamed from: a */
    boolean f33737a = true;

    /* JADX INFO: renamed from: b */
    boolean f33738b = true;

    /* JADX INFO: renamed from: c */
    boolean f33739c = true;

    /* JADX INFO: renamed from: d */
    boolean f33740d = true;

    /* JADX INFO: renamed from: f */
    boolean f33742f = true;

    /* JADX INFO: renamed from: i */
    ExecutorService f33745i = f33736m;

    d() {
    }

    public c a() {
        return new c(this);
    }

    g b() {
        g gVar = this.f33747k;
        return gVar != null ? gVar : g.a.a();
    }

    h c() {
        h hVar = this.f33748l;
        if (hVar != null) {
            return hVar;
        }
        if (di.a.a()) {
            return di.a.b().f45748b;
        }
        return null;
    }
}
