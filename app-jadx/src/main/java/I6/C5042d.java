package i6;

import a6.C2582c;
import a6.InterfaceC2580a;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import b6.C3024a;
import b6.InterfaceC3025b;
import c6.C3078a;
import c6.C3079b;
import c6.C3080c;
import c6.C3081d;
import d6.InterfaceC4568a;
import d6.f;
import f6.k;
import g6.C4856a;
import g6.C4857b;
import h6.C4908b;
import h6.C4912f;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import r6.InterfaceC6273a;
import r6.e;
import t6.C6647c;
import t6.InterfaceC6646b;
import x6.n;
import y5.o;

/* JADX INFO: renamed from: i6.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C5042d implements D6.a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC6646b f48709a;

    /* JADX INFO: renamed from: b */
    private final ScheduledExecutorService f48710b;

    /* JADX INFO: renamed from: c */
    private final ExecutorService f48711c;

    /* JADX INFO: renamed from: d */
    private final F5.b f48712d;

    /* JADX INFO: renamed from: e */
    private final w6.d f48713e;

    /* JADX INFO: renamed from: f */
    private final n f48714f;

    /* JADX INFO: renamed from: g */
    private final y5.n f48715g;

    /* JADX INFO: renamed from: h */
    private final y5.n f48716h;

    /* JADX INFO: renamed from: i */
    private final y5.n f48717i;

    /* JADX INFO: renamed from: j */
    private final y5.n f48718j;

    /* JADX INFO: renamed from: k */
    private final y5.n f48719k;

    /* JADX INFO: renamed from: l */
    private final y5.n f48720l;

    /* JADX INFO: renamed from: m */
    private final y5.n f48721m;

    /* JADX INFO: renamed from: n */
    private final y5.n f48722n = o.f64829b;

    public C5042d(InterfaceC6646b interfaceC6646b, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, F5.b bVar, w6.d dVar, n nVar, y5.n nVar2, y5.n nVar3, y5.n nVar4, y5.n nVar5, y5.n nVar6, y5.n nVar7, y5.n nVar8) {
        this.f48709a = interfaceC6646b;
        this.f48710b = scheduledExecutorService;
        this.f48711c = executorService;
        this.f48712d = bVar;
        this.f48713e = dVar;
        this.f48714f = nVar;
        this.f48715g = nVar2;
        this.f48716h = nVar3;
        this.f48717i = nVar4;
        this.f48718j = nVar5;
        this.f48720l = nVar7;
        this.f48719k = nVar6;
        this.f48721m = nVar8;
    }

    private InterfaceC6273a c(e eVar) {
        r6.c cVarD = eVar.d();
        return this.f48709a.a(eVar, new Rect(0, 0, cVarD.getWidth(), cVarD.getHeight()));
    }

    private C6647c d(e eVar) {
        return new C6647c(new C3078a(eVar.hashCode(), ((Boolean) this.f48717i.get()).booleanValue()), this.f48714f);
    }

    private InterfaceC2580a e(e eVar, Bitmap.Config config, n6.c cVar) {
        InterfaceC4568a fVar;
        d6.b bVarG;
        InterfaceC6273a interfaceC6273aC = c(eVar);
        C4856a c4856a = new C4856a(interfaceC6273aC);
        InterfaceC3025b interfaceC3025bF = f(eVar);
        C4857b c4857b = new C4857b(interfaceC3025bF, interfaceC6273aC, ((Boolean) this.f48718j.get()).booleanValue());
        int iIntValue = ((Integer) this.f48716h.get()).intValue();
        if (iIntValue > 0) {
            fVar = new d6.d(iIntValue);
            bVarG = g(c4857b, config);
        } else {
            fVar = null;
            bVarG = null;
        }
        if (((Boolean) this.f48718j.get()).booleanValue()) {
            fVar = new f(eVar.e(), c4856a, c4857b, new k(this.f48713e, ((Integer) this.f48720l.get()).intValue(), ((Integer) this.f48721m.get()).intValue()), ((Boolean) this.f48719k.get()).booleanValue());
        }
        return C2582c.r(new C3024a(this.f48713e, interfaceC3025bF, c4856a, c4857b, ((Boolean) this.f48718j.get()).booleanValue(), fVar, bVarG, null), this.f48712d, this.f48710b);
    }

    private InterfaceC3025b f(e eVar) {
        int iIntValue = ((Integer) this.f48715g.get()).intValue();
        return iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? new C3081d() : new C3080c() : new C3079b(d(eVar), false) : new C3079b(d(eVar), true);
    }

    private d6.b g(b6.c cVar, Bitmap.Config config) {
        w6.d dVar = this.f48713e;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return new d6.c(dVar, cVar, config, this.f48711c);
    }

    @Override // D6.a
    public boolean a(E6.e eVar) {
        return eVar instanceof E6.c;
    }

    @Override // D6.a
    public Drawable b(E6.e eVar) {
        if (!a(eVar)) {
            return null;
        }
        E6.c cVar = (E6.c) eVar;
        r6.c cVarH = cVar.H();
        InterfaceC2580a interfaceC2580aE = e((e) y5.k.g(cVar.J()), cVarH != null ? cVarH.e() : null, null);
        return ((Boolean) this.f48722n.get()).booleanValue() ? new C4912f(interfaceC2580aE) : new C4908b(interfaceC2580aE);
    }
}
