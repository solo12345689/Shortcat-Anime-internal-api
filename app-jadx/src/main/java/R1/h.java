package r1;

import t1.C6592e;
import t1.C6595h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class h implements e, q1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final q1.g f58407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f58408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C6595h f58409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f58410d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f58411e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f58412f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f58413g;

    public h(q1.g gVar) {
        this.f58407a = gVar;
    }

    @Override // r1.e, q1.f
    public C6592e a() {
        if (this.f58409c == null) {
            this.f58409c = new C6595h();
        }
        return this.f58409c;
    }

    @Override // r1.e, q1.f
    public void apply() {
        this.f58409c.w1(this.f58408b);
        int i10 = this.f58410d;
        if (i10 != -1) {
            this.f58409c.t1(i10);
            return;
        }
        int i11 = this.f58411e;
        if (i11 != -1) {
            this.f58409c.u1(i11);
        } else {
            this.f58409c.v1(this.f58412f);
        }
    }

    @Override // q1.f
    public void b(C6592e c6592e) {
        if (c6592e instanceof C6595h) {
            this.f58409c = (C6595h) c6592e;
        } else {
            this.f58409c = null;
        }
    }

    @Override // q1.f
    public void c(Object obj) {
        this.f58413g = obj;
    }

    @Override // q1.f
    public e d() {
        return null;
    }

    public h e(Object obj) {
        this.f58410d = -1;
        this.f58411e = this.f58407a.e(obj);
        this.f58412f = 0.0f;
        return this;
    }

    public h f(float f10) {
        this.f58410d = -1;
        this.f58411e = -1;
        this.f58412f = f10;
        return this;
    }

    public void g(int i10) {
        this.f58408b = i10;
    }

    @Override // q1.f
    public Object getKey() {
        return this.f58413g;
    }

    public h h(Object obj) {
        this.f58410d = this.f58407a.e(obj);
        this.f58411e = -1;
        this.f58412f = 0.0f;
        return this;
    }
}
