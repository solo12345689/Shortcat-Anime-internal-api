package r6;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f58630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C5.a f58631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f58632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f58633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f58634e;

    f(c cVar) {
        this.f58630a = cVar;
    }

    public e a() {
        try {
            return new e(this);
        } finally {
            C5.a.m(this.f58631b);
            this.f58631b = null;
            C5.a.q(this.f58632c);
            this.f58632c = null;
        }
    }

    public N6.a b() {
        return null;
    }

    public List c() {
        return C5.a.k(this.f58632c);
    }

    public int d() {
        return this.f58633d;
    }

    public c e() {
        return this.f58630a;
    }

    public C5.a f() {
        return C5.a.j(this.f58631b);
    }

    public String g() {
        return this.f58634e;
    }

    public f i(List list) {
        this.f58632c = C5.a.k(list);
        return this;
    }

    public f j(int i10) {
        this.f58633d = i10;
        return this;
    }

    public f k(C5.a aVar) {
        this.f58631b = C5.a.j(aVar);
        return this;
    }

    public f l(String str) {
        this.f58634e = str;
        return this;
    }

    public f h(N6.a aVar) {
        return this;
    }
}
