package xa;

import xa.e0;

/* JADX INFO: renamed from: xa.w */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C7096w {

    /* JADX INFO: renamed from: a */
    private final a f64277a;

    /* JADX INFO: renamed from: b */
    private final Object f64278b;

    /* JADX INFO: renamed from: c */
    private final Object f64279c;

    /* JADX INFO: renamed from: xa.w$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: a */
        public final e0.b f64280a;

        /* JADX INFO: renamed from: b */
        public final Object f64281b;

        /* JADX INFO: renamed from: c */
        public final e0.b f64282c;

        /* JADX INFO: renamed from: d */
        public final Object f64283d;

        public a(e0.b bVar, Object obj, e0.b bVar2, Object obj2) {
            this.f64280a = bVar;
            this.f64281b = obj;
            this.f64282c = bVar2;
            this.f64283d = obj2;
        }
    }

    private C7096w(e0.b bVar, Object obj, e0.b bVar2, Object obj2) {
        this.f64277a = new a(bVar, obj, bVar2, obj2);
        this.f64278b = obj;
        this.f64279c = obj2;
    }

    public static C7096w b(e0.b bVar, Object obj, e0.b bVar2, Object obj2) {
        return new C7096w(bVar, obj, bVar2, obj2);
    }

    a a() {
        return this.f64277a;
    }
}
