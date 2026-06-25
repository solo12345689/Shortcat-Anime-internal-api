package P5;

import F5.b;
import G6.c;
import O5.e;
import android.graphics.Rect;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l6.g;
import l6.i;
import l6.j;
import l6.k;
import l6.n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f13513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f13514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f13515c = new j(k.f52657c);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Q5.a f13516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Q5.b f13517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f13518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f13519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f13520h;

    public a(b bVar, e eVar) {
        this.f13514b = bVar;
        this.f13513a = eVar;
    }

    private void h() {
        if (this.f13517e == null) {
            this.f13517e = new Q5.b(this.f13514b, this.f13515c, this);
        }
        if (this.f13516d == null) {
            this.f13516d = new Q5.a(this.f13514b, this.f13515c);
        }
        if (this.f13518f == null) {
            this.f13518f = new c(this.f13516d);
        }
    }

    @Override // l6.i
    public void a(j jVar, l6.e eVar) {
        List list;
        jVar.H(eVar);
        if (!this.f13520h || (list = this.f13519g) == null || list.isEmpty()) {
            return;
        }
        if (eVar == l6.e.f52570g) {
            d();
        }
        jVar.S();
        Iterator it = this.f13519g.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // l6.i
    public void b(j jVar, n nVar) {
        List list;
        if (!this.f13520h || (list = this.f13519g) == null || list.isEmpty()) {
            return;
        }
        jVar.S();
        Iterator it = this.f13519g.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    public void c(g gVar) {
        if (gVar == null) {
            return;
        }
        if (this.f13519g == null) {
            this.f13519g = new CopyOnWriteArrayList();
        }
        this.f13519g.add(gVar);
    }

    public void d() {
        Y5.b bVarF = this.f13513a.f();
        if (bVarF == null || bVarF.d() == null) {
            return;
        }
        Rect bounds = bVarF.d().getBounds();
        this.f13515c.N(bounds.width());
        this.f13515c.M(bounds.height());
    }

    public void e() {
        List list = this.f13519g;
        if (list != null) {
            list.clear();
        }
    }

    public void f() {
        e();
        g(false);
        this.f13515c.w();
    }

    public void g(boolean z10) {
        this.f13520h = z10;
        if (!z10) {
            Q5.b bVar = this.f13517e;
            if (bVar != null) {
                this.f13513a.T(bVar);
            }
            c cVar = this.f13518f;
            if (cVar != null) {
                this.f13513a.z0(cVar);
                return;
            }
            return;
        }
        h();
        Q5.b bVar2 = this.f13517e;
        if (bVar2 != null) {
            this.f13513a.l(bVar2);
        }
        c cVar2 = this.f13518f;
        if (cVar2 != null) {
            this.f13513a.j0(cVar2);
        }
    }
}
