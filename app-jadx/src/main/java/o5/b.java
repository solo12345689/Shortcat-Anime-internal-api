package O5;

import java.util.List;
import y5.n;
import y5.o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y5.f f13002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f13003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f13004c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f13005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private n f13006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h f13007c;

        static /* bridge */ /* synthetic */ l6.g c(a aVar) {
            aVar.getClass();
            return null;
        }

        public b e() {
            return new b(this);
        }
    }

    public static a e() {
        return new a();
    }

    public y5.f a() {
        return this.f13002a;
    }

    public n b() {
        return this.f13004c;
    }

    public l6.g c() {
        return null;
    }

    public h d() {
        return this.f13003b;
    }

    private b(a aVar) {
        this.f13002a = aVar.f13005a != null ? y5.f.c(aVar.f13005a) : null;
        this.f13004c = aVar.f13006b != null ? aVar.f13006b : o.a(Boolean.FALSE);
        this.f13003b = aVar.f13007c;
        a.c(aVar);
    }
}
