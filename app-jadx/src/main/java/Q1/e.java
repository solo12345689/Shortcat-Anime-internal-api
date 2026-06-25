package q1;

import java.util.ArrayList;
import java.util.Collections;
import q1.g;
import t1.AbstractC6597j;
import t1.C6592e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class e extends C6068a implements r1.e {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    protected final g f56223m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    final g.d f56224n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    protected ArrayList f56225o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private AbstractC6597j f56226p0;

    public e(g gVar, g.d dVar) {
        super(gVar);
        this.f56225o0 = new ArrayList();
        this.f56223m0 = gVar;
        this.f56224n0 = dVar;
    }

    @Override // q1.C6068a, q1.f
    public C6592e a() {
        return u0();
    }

    public e s0(Object... objArr) {
        Collections.addAll(this.f56225o0, objArr);
        return this;
    }

    public void t0() {
        super.apply();
    }

    public AbstractC6597j u0() {
        return this.f56226p0;
    }

    public g.d v0() {
        return this.f56224n0;
    }

    @Override // q1.C6068a, q1.f
    public void apply() {
    }
}
