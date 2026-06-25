package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.m0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f29209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f29210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f29211c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m0.b f29212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f29213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m0.b f29214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f29215d;

        public a(m0.b bVar, Object obj, m0.b bVar2, Object obj2) {
            this.f29212a = bVar;
            this.f29213b = obj;
            this.f29214c = bVar2;
            this.f29215d = obj2;
        }
    }

    private D(m0.b bVar, Object obj, m0.b bVar2, Object obj2) {
        this.f29209a = new a(bVar, obj, bVar2, obj2);
        this.f29210b = obj;
        this.f29211c = obj2;
    }

    static int b(a aVar, Object obj, Object obj2) {
        return C2813q.b(aVar.f29212a, 1, obj) + C2813q.b(aVar.f29214c, 2, obj2);
    }

    public static D d(m0.b bVar, Object obj, m0.b bVar2, Object obj2) {
        return new D(bVar, obj, bVar2, obj2);
    }

    static void e(AbstractC2805i abstractC2805i, a aVar, Object obj, Object obj2) {
        C2813q.u(abstractC2805i, aVar.f29212a, 1, obj);
        C2813q.u(abstractC2805i, aVar.f29214c, 2, obj2);
    }

    public int a(int i10, Object obj, Object obj2) {
        return AbstractC2805i.O(i10) + AbstractC2805i.y(b(this.f29209a, obj, obj2));
    }

    a c() {
        return this.f29209a;
    }
}
