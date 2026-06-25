package o5;

/* JADX INFO: renamed from: o5.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5829f {

    /* JADX INFO: renamed from: o5.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile Object f54537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f54538b;

        a(b bVar) {
            this.f54538b = bVar;
        }

        @Override // o5.AbstractC5829f.b
        public Object get() {
            if (this.f54537a == null) {
                synchronized (this) {
                    try {
                        if (this.f54537a == null) {
                            this.f54537a = k.e(this.f54538b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.f54537a;
        }
    }

    /* JADX INFO: renamed from: o5.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        Object get();
    }

    public static b a(b bVar) {
        return new a(bVar);
    }
}
