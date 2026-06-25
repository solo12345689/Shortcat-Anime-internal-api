package we;

import kotlin.jvm.internal.AbstractC5504s;
import ve.o;

/* JADX INFO: renamed from: we.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6971f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Xe.c f63182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f63183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f63184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Xe.b f63185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f63186e;

    /* JADX INFO: renamed from: we.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC6971f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f63187f = new a();

        private a() {
            super(o.f62147A, "Function", false, null, true);
        }
    }

    /* JADX INFO: renamed from: we.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC6971f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f63188f = new b();

        private b() {
            super(o.f62180x, "KFunction", true, null, false);
        }
    }

    /* JADX INFO: renamed from: we.f$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends AbstractC6971f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f63189f = new c();

        private c() {
            super(o.f62180x, "KSuspendFunction", true, null, false);
        }
    }

    /* JADX INFO: renamed from: we.f$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends AbstractC6971f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f63190f = new d();

        private d() {
            super(o.f62175s, "SuspendFunction", false, null, true);
        }
    }

    public AbstractC6971f(Xe.c packageFqName, String classNamePrefix, boolean z10, Xe.b bVar, boolean z11) {
        AbstractC5504s.h(packageFqName, "packageFqName");
        AbstractC5504s.h(classNamePrefix, "classNamePrefix");
        this.f63182a = packageFqName;
        this.f63183b = classNamePrefix;
        this.f63184c = z10;
        this.f63185d = bVar;
        this.f63186e = z11;
    }

    public final String a() {
        return this.f63183b;
    }

    public final Xe.c b() {
        return this.f63182a;
    }

    public final Xe.f c(int i10) {
        Xe.f fVarM = Xe.f.m(this.f63183b + i10);
        AbstractC5504s.g(fVarM, "identifier(...)");
        return fVarM;
    }

    public String toString() {
        return this.f63182a + com.amazon.a.a.o.c.a.b.f34706a + this.f63183b + 'N';
    }
}
