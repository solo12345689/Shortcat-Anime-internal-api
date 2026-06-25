package F8;

import R8.AbstractC2115p;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f6578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final f f6579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f6580c;

    protected h(n nVar, com.google.android.gms.common.util.d dVar) {
        AbstractC2115p.l(nVar);
        this.f6578a = nVar;
        this.f6580c = new ArrayList();
        f fVar = new f(this, dVar);
        fVar.a();
        this.f6579b = fVar;
    }
}
