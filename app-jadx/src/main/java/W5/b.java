package W5;

import V5.q;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import y5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final q f20740t = q.f19908h;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final q f20741u = q.f19909i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Resources f20742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f20744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f20745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private q f20746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f20747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q f20748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Drawable f20749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private q f20750i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f20751j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private q f20752k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private q f20753l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Matrix f20754m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private PointF f20755n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorFilter f20756o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f20757p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f20758q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f20759r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private d f20760s;

    public b(Resources resources) {
        this.f20742a = resources;
        s();
    }

    private void s() {
        this.f20743b = 300;
        this.f20744c = 0.0f;
        this.f20745d = null;
        q qVar = f20740t;
        this.f20746e = qVar;
        this.f20747f = null;
        this.f20748g = qVar;
        this.f20749h = null;
        this.f20750i = qVar;
        this.f20751j = null;
        this.f20752k = qVar;
        this.f20753l = f20741u;
        this.f20754m = null;
        this.f20755n = null;
        this.f20756o = null;
        this.f20757p = null;
        this.f20758q = null;
        this.f20759r = null;
        this.f20760s = null;
    }

    public static b t(Resources resources) {
        return new b(resources);
    }

    private void v() {
        List list = this.f20758q;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k.g((Drawable) it.next());
            }
        }
    }

    public a a() {
        v();
        return new a(this);
    }

    public ColorFilter b() {
        return this.f20756o;
    }

    public PointF c() {
        return this.f20755n;
    }

    public q d() {
        return this.f20753l;
    }

    public Drawable e() {
        return this.f20757p;
    }

    public int f() {
        return this.f20743b;
    }

    public Drawable g() {
        return this.f20749h;
    }

    public q h() {
        return this.f20750i;
    }

    public List i() {
        return this.f20758q;
    }

    public Drawable j() {
        return this.f20745d;
    }

    public q k() {
        return this.f20746e;
    }

    public Drawable l() {
        return this.f20759r;
    }

    public Drawable m() {
        return this.f20751j;
    }

    public q n() {
        return this.f20752k;
    }

    public Resources o() {
        return this.f20742a;
    }

    public Drawable p() {
        return this.f20747f;
    }

    public q q() {
        return this.f20748g;
    }

    public d r() {
        return this.f20760s;
    }

    public b u(d dVar) {
        this.f20760s = dVar;
        return this;
    }
}
