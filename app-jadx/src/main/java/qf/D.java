package qf;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class D extends E0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f57961e = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E0 f57962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E0 f57963d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E0 a(E0 first, E0 second) {
            AbstractC5504s.h(first, "first");
            AbstractC5504s.h(second, "second");
            return first.f() ? second : second.f() ? first : new D(first, second, null);
        }

        private a() {
        }
    }

    public /* synthetic */ D(E0 e02, E0 e03, DefaultConstructorMarker defaultConstructorMarker) {
        this(e02, e03);
    }

    public static final E0 i(E0 e02, E0 e03) {
        return f57961e.a(e02, e03);
    }

    @Override // qf.E0
    public boolean a() {
        return this.f57962c.a() || this.f57963d.a();
    }

    @Override // qf.E0
    public boolean b() {
        return this.f57962c.b() || this.f57963d.b();
    }

    @Override // qf.E0
    public InterfaceC7374h d(InterfaceC7374h annotations) {
        AbstractC5504s.h(annotations, "annotations");
        return this.f57963d.d(this.f57962c.d(annotations));
    }

    @Override // qf.E0
    public B0 e(S key) {
        AbstractC5504s.h(key, "key");
        B0 b0E = this.f57962c.e(key);
        return b0E == null ? this.f57963d.e(key) : b0E;
    }

    @Override // qf.E0
    public boolean f() {
        return false;
    }

    @Override // qf.E0
    public S g(S topLevelType, N0 position) {
        AbstractC5504s.h(topLevelType, "topLevelType");
        AbstractC5504s.h(position, "position");
        return this.f57963d.g(this.f57962c.g(topLevelType, position), position);
    }

    private D(E0 e02, E0 e03) {
        this.f57962c = e02;
        this.f57963d = e03;
    }
}
