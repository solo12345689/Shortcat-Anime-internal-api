package qf;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class E0 {

    /* JADX INFO: renamed from: a */
    public static final b f57966a = new b(null);

    /* JADX INFO: renamed from: b */
    public static final E0 f57967b = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends E0 {
        a() {
        }

        @Override // qf.E0
        public /* bridge */ /* synthetic */ B0 e(S s10) {
            return (B0) i(s10);
        }

        @Override // qf.E0
        public boolean f() {
            return true;
        }

        public Void i(S key) {
            AbstractC5504s.h(key, "key");
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends E0 {
        c() {
        }

        @Override // qf.E0
        public boolean a() {
            return false;
        }

        @Override // qf.E0
        public boolean b() {
            return false;
        }

        @Override // qf.E0
        public InterfaceC7374h d(InterfaceC7374h annotations) {
            AbstractC5504s.h(annotations, "annotations");
            return E0.this.d(annotations);
        }

        @Override // qf.E0
        public B0 e(S key) {
            AbstractC5504s.h(key, "key");
            return E0.this.e(key);
        }

        @Override // qf.E0
        public boolean f() {
            return E0.this.f();
        }

        @Override // qf.E0
        public S g(S topLevelType, N0 position) {
            AbstractC5504s.h(topLevelType, "topLevelType");
            AbstractC5504s.h(position, "position");
            return E0.this.g(topLevelType, position);
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public final G0 c() {
        G0 g0G = G0.g(this);
        AbstractC5504s.g(g0G, "create(...)");
        return g0G;
    }

    public InterfaceC7374h d(InterfaceC7374h annotations) {
        AbstractC5504s.h(annotations, "annotations");
        return annotations;
    }

    public abstract B0 e(S s10);

    public boolean f() {
        return false;
    }

    public S g(S topLevelType, N0 position) {
        AbstractC5504s.h(topLevelType, "topLevelType");
        AbstractC5504s.h(position, "position");
        return topLevelType;
    }

    public final E0 h() {
        return new c();
    }
}
