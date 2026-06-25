package q1;

import java.util.HashMap;
import n1.C5715a;
import o1.C5801b;
import t1.C6591d;
import t1.C6592e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static float f56291v = Float.NaN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C6592e f56292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f56297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f56298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f56299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f56300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f56301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f56302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f56303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f56304m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f56305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f56306o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f56307p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f56308q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f56309r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final HashMap f56310s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f56311t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    C5801b f56312u;

    public h(C6592e c6592e) {
        this.f56292a = null;
        this.f56293b = 0;
        this.f56294c = 0;
        this.f56295d = 0;
        this.f56296e = 0;
        this.f56297f = Float.NaN;
        this.f56298g = Float.NaN;
        this.f56299h = Float.NaN;
        this.f56300i = Float.NaN;
        this.f56301j = Float.NaN;
        this.f56302k = Float.NaN;
        this.f56303l = Float.NaN;
        this.f56304m = Float.NaN;
        this.f56305n = Float.NaN;
        this.f56306o = Float.NaN;
        this.f56307p = Float.NaN;
        this.f56308q = Float.NaN;
        this.f56309r = 0;
        this.f56310s = new HashMap();
        this.f56311t = null;
        this.f56292a = c6592e;
    }

    private static void a(StringBuilder sb2, String str, float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        sb2.append(str);
        sb2.append(": ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    private static void b(StringBuilder sb2, String str, int i10) {
        sb2.append(str);
        sb2.append(": ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    private void f(StringBuilder sb2, C6591d.a aVar) {
        C6591d c6591dO = this.f56292a.o(aVar);
        if (c6591dO == null || c6591dO.f60302f == null) {
            return;
        }
        sb2.append("Anchor");
        sb2.append(aVar.name());
        sb2.append(": ['");
        String str = c6591dO.f60302f.h().f60381o;
        if (str == null) {
            str = "#PARENT";
        }
        sb2.append(str);
        sb2.append("', '");
        sb2.append(c6591dO.f60302f.k().name());
        sb2.append("', '");
        sb2.append(c6591dO.f60303g);
        sb2.append("'],\n");
    }

    public String c() {
        C6592e c6592e = this.f56292a;
        return c6592e == null ? "unknown" : c6592e.f60381o;
    }

    public boolean d() {
        return Float.isNaN(this.f56299h) && Float.isNaN(this.f56300i) && Float.isNaN(this.f56301j) && Float.isNaN(this.f56302k) && Float.isNaN(this.f56303l) && Float.isNaN(this.f56304m) && Float.isNaN(this.f56305n) && Float.isNaN(this.f56306o) && Float.isNaN(this.f56307p);
    }

    public StringBuilder e(StringBuilder sb2, boolean z10) {
        sb2.append("{\n");
        b(sb2, "left", this.f56293b);
        b(sb2, "top", this.f56294c);
        b(sb2, "right", this.f56295d);
        b(sb2, "bottom", this.f56296e);
        a(sb2, "pivotX", this.f56297f);
        a(sb2, "pivotY", this.f56298g);
        a(sb2, "rotationX", this.f56299h);
        a(sb2, "rotationY", this.f56300i);
        a(sb2, "rotationZ", this.f56301j);
        a(sb2, "translationX", this.f56302k);
        a(sb2, "translationY", this.f56303l);
        a(sb2, "translationZ", this.f56304m);
        a(sb2, "scaleX", this.f56305n);
        a(sb2, "scaleY", this.f56306o);
        a(sb2, "alpha", this.f56307p);
        b(sb2, "visibility", this.f56309r);
        a(sb2, "interpolatedPos", this.f56308q);
        if (this.f56292a != null) {
            for (C6591d.a aVar : C6591d.a.values()) {
                f(sb2, aVar);
            }
        }
        if (z10) {
            a(sb2, "phone_orientation", f56291v);
        }
        if (z10) {
            a(sb2, "phone_orientation", f56291v);
        }
        if (this.f56310s.size() != 0) {
            sb2.append("custom : {\n");
            for (String str : this.f56310s.keySet()) {
                C5715a c5715a = (C5715a) this.f56310s.get(str);
                sb2.append(str);
                sb2.append(": ");
                switch (c5715a.h()) {
                    case 900:
                        sb2.append(c5715a.e());
                        sb2.append(",\n");
                        break;
                    case 901:
                    case 905:
                        sb2.append(c5715a.d());
                        sb2.append(",\n");
                        break;
                    case 902:
                        sb2.append("'");
                        sb2.append(C5715a.a(c5715a.e()));
                        sb2.append("',\n");
                        break;
                    case 903:
                        sb2.append("'");
                        sb2.append(c5715a.g());
                        sb2.append("',\n");
                        break;
                    case 904:
                        sb2.append("'");
                        sb2.append(c5715a.c());
                        sb2.append("',\n");
                        break;
                }
            }
            sb2.append("}\n");
        }
        sb2.append("}\n");
        return sb2;
    }

    public void g(String str, int i10, float f10) {
        if (this.f56310s.containsKey(str)) {
            ((C5715a) this.f56310s.get(str)).i(f10);
        } else {
            this.f56310s.put(str, new C5715a(str, i10, f10));
        }
    }

    public void h(String str, int i10, int i11) {
        if (this.f56310s.containsKey(str)) {
            ((C5715a) this.f56310s.get(str)).j(i11);
        } else {
            this.f56310s.put(str, new C5715a(str, i10, i11));
        }
    }

    void i(C5801b c5801b) {
        this.f56312u = c5801b;
    }

    public h j() {
        C6592e c6592e = this.f56292a;
        if (c6592e != null) {
            this.f56293b = c6592e.E();
            this.f56294c = this.f56292a.P();
            this.f56295d = this.f56292a.N();
            this.f56296e = this.f56292a.r();
            k(this.f56292a.f60379n);
        }
        return this;
    }

    public void k(h hVar) {
        if (hVar == null) {
            return;
        }
        this.f56297f = hVar.f56297f;
        this.f56298g = hVar.f56298g;
        this.f56299h = hVar.f56299h;
        this.f56300i = hVar.f56300i;
        this.f56301j = hVar.f56301j;
        this.f56302k = hVar.f56302k;
        this.f56303l = hVar.f56303l;
        this.f56304m = hVar.f56304m;
        this.f56305n = hVar.f56305n;
        this.f56306o = hVar.f56306o;
        this.f56307p = hVar.f56307p;
        this.f56309r = hVar.f56309r;
        i(hVar.f56312u);
        this.f56310s.clear();
        for (C5715a c5715a : hVar.f56310s.values()) {
            this.f56310s.put(c5715a.f(), c5715a.b());
        }
    }

    public h(h hVar) {
        this.f56292a = null;
        this.f56293b = 0;
        this.f56294c = 0;
        this.f56295d = 0;
        this.f56296e = 0;
        this.f56297f = Float.NaN;
        this.f56298g = Float.NaN;
        this.f56299h = Float.NaN;
        this.f56300i = Float.NaN;
        this.f56301j = Float.NaN;
        this.f56302k = Float.NaN;
        this.f56303l = Float.NaN;
        this.f56304m = Float.NaN;
        this.f56305n = Float.NaN;
        this.f56306o = Float.NaN;
        this.f56307p = Float.NaN;
        this.f56308q = Float.NaN;
        this.f56309r = 0;
        this.f56310s = new HashMap();
        this.f56311t = null;
        this.f56292a = hVar.f56292a;
        this.f56293b = hVar.f56293b;
        this.f56294c = hVar.f56294c;
        this.f56295d = hVar.f56295d;
        this.f56296e = hVar.f56296e;
        k(hVar);
    }
}
