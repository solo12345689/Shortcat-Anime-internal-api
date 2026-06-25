package c4;

import a4.C2567b;
import android.graphics.Rect;
import c4.InterfaceC3075c;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements InterfaceC3075c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f33472d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2567b f33473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f33474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3075c.C0564c f33475c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(C2567b bounds) {
            AbstractC5504s.h(bounds, "bounds");
            if (bounds.d() == 0 && bounds.a() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero");
            }
            if (bounds.b() != 0 && bounds.c() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
            }
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f33476b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final b f33477c = new b("FOLD");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final b f33478d = new b("HINGE");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f33479a;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a() {
                return b.f33477c;
            }

            public final b b() {
                return b.f33478d;
            }

            private a() {
            }
        }

        private b(String str) {
            this.f33479a = str;
        }

        public String toString() {
            return this.f33479a;
        }
    }

    public d(C2567b featureBounds, b type, InterfaceC3075c.C0564c state) {
        AbstractC5504s.h(featureBounds, "featureBounds");
        AbstractC5504s.h(type, "type");
        AbstractC5504s.h(state, "state");
        this.f33473a = featureBounds;
        this.f33474b = type;
        this.f33475c = state;
        f33472d.a(featureBounds);
    }

    @Override // c4.InterfaceC3075c
    public InterfaceC3075c.b a() {
        return this.f33473a.d() > this.f33473a.a() ? InterfaceC3075c.b.f33466d : InterfaceC3075c.b.f33465c;
    }

    @Override // c4.InterfaceC3075c
    public boolean b() {
        b bVar = this.f33474b;
        b.a aVar = b.f33476b;
        if (AbstractC5504s.c(bVar, aVar.b())) {
            return true;
        }
        return AbstractC5504s.c(this.f33474b, aVar.a()) && AbstractC5504s.c(getState(), InterfaceC3075c.C0564c.f33470d);
    }

    @Override // c4.InterfaceC3075c
    public InterfaceC3075c.a c() {
        return (this.f33473a.d() == 0 || this.f33473a.a() == 0) ? InterfaceC3075c.a.f33461c : InterfaceC3075c.a.f33462d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC5504s.c(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC5504s.f(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        d dVar = (d) obj;
        return AbstractC5504s.c(this.f33473a, dVar.f33473a) && AbstractC5504s.c(this.f33474b, dVar.f33474b) && AbstractC5504s.c(getState(), dVar.getState());
    }

    @Override // c4.InterfaceC3073a
    public Rect getBounds() {
        return this.f33473a.f();
    }

    @Override // c4.InterfaceC3075c
    public InterfaceC3075c.C0564c getState() {
        return this.f33475c;
    }

    public int hashCode() {
        return (((this.f33473a.hashCode() * 31) + this.f33474b.hashCode()) * 31) + getState().hashCode();
    }

    public String toString() {
        return d.class.getSimpleName() + " { " + this.f33473a + ", type=" + this.f33474b + ", state=" + getState() + " }";
    }
}
