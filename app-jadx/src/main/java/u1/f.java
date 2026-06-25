package u1;

import com.revenuecat.purchases.common.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d */
    p f61153d;

    /* JADX INFO: renamed from: f */
    int f61155f;

    /* JADX INFO: renamed from: g */
    public int f61156g;

    /* JADX INFO: renamed from: a */
    public d f61150a = null;

    /* JADX INFO: renamed from: b */
    public boolean f61151b = false;

    /* JADX INFO: renamed from: c */
    public boolean f61152c = false;

    /* JADX INFO: renamed from: e */
    a f61154e = a.UNKNOWN;

    /* JADX INFO: renamed from: h */
    int f61157h = 1;

    /* JADX INFO: renamed from: i */
    g f61158i = null;

    /* JADX INFO: renamed from: j */
    public boolean f61159j = false;

    /* JADX INFO: renamed from: k */
    List f61160k = new ArrayList();

    /* JADX INFO: renamed from: l */
    List f61161l = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f61153d = pVar;
    }

    @Override // u1.d
    public void a(d dVar) {
        Iterator it = this.f61161l.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f61159j) {
                return;
            }
        }
        this.f61152c = true;
        d dVar2 = this.f61150a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f61151b) {
            this.f61153d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f61161l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f61159j) {
            g gVar = this.f61158i;
            if (gVar != null) {
                if (!gVar.f61159j) {
                    return;
                } else {
                    this.f61155f = this.f61157h * gVar.f61156g;
                }
            }
            d(fVar.f61156g + this.f61155f);
        }
        d dVar3 = this.f61150a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f61160k.add(dVar);
        if (this.f61159j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f61161l.clear();
        this.f61160k.clear();
        this.f61159j = false;
        this.f61156g = 0;
        this.f61152c = false;
        this.f61151b = false;
    }

    public void d(int i10) {
        if (this.f61159j) {
            return;
        }
        this.f61159j = true;
        this.f61156g = i10;
        for (d dVar : this.f61160k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f61153d.f61203b.t());
        sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        sb2.append(this.f61154e);
        sb2.append("(");
        sb2.append(this.f61159j ? Integer.valueOf(this.f61156g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f61161l.size());
        sb2.append(":d=");
        sb2.append(this.f61160k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
