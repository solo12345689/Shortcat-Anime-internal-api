package g0;

import Y.D;
import Y.J;
import Y.U0;
import Y.n2;
import d0.C4553d;
import d0.t;
import f0.C4751e;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends C4553d implements U0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f47194g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f47195h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final m f47196i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends d0.f implements U0.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private m f47197g;

        public a(m mVar) {
            super(mVar);
            this.f47197g = mVar;
        }

        @Override // d0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof D) {
                return p((D) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof n2) {
                return q((n2) obj);
            }
            return false;
        }

        @Override // d0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof D) {
                return r((D) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof D) ? obj2 : t((D) obj, (n2) obj2);
        }

        @Override // d0.f
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public m build() {
            m mVar;
            if (i() == this.f47197g.q()) {
                mVar = this.f47197g;
            } else {
                m(new C4751e());
                mVar = new m(i(), size());
            }
            this.f47197g = mVar;
            return mVar;
        }

        public /* bridge */ boolean p(D d10) {
            return super.containsKey(d10);
        }

        public /* bridge */ boolean q(n2 n2Var) {
            return super.containsValue(n2Var);
        }

        public /* bridge */ n2 r(D d10) {
            return (n2) super.get(d10);
        }

        @Override // d0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof D) {
                return u((D) obj);
            }
            return null;
        }

        public /* bridge */ n2 t(D d10, n2 n2Var) {
            return (n2) super.getOrDefault(d10, n2Var);
        }

        public /* bridge */ n2 u(D d10) {
            return (n2) super.remove(d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a() {
            return m.f47196i;
        }

        private b() {
        }
    }

    static {
        d0.t tVarA = d0.t.f44926e.a();
        AbstractC5504s.f(tVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        f47196i = new m(tVarA, 0);
    }

    public m(d0.t tVar, int i10) {
        super(tVar, i10);
    }

    public /* bridge */ n2 A(D d10) {
        return (n2) super.get(d10);
    }

    public /* bridge */ n2 B(D d10, n2 n2Var) {
        return (n2) super.getOrDefault(d10, n2Var);
    }

    @Override // Y.I
    public Object a(D d10) {
        return J.b(this, d10);
    }

    @Override // d0.C4553d, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof D) {
            return y((D) obj);
        }
        return false;
    }

    @Override // Ud.AbstractC2265f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof n2) {
            return z((n2) obj);
        }
        return false;
    }

    @Override // d0.C4553d, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof D) {
            return A((D) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof D) ? obj2 : B((D) obj, (n2) obj2);
    }

    @Override // d0.C4553d
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public a builder() {
        return new a(this);
    }

    @Override // Y.U0
    public U0 x(D d10, n2 n2Var) {
        t.b bVarP = q().P(d10.hashCode(), d10, n2Var, 0);
        return bVarP == null ? this : new m(bVarP.a(), size() + bVarP.b());
    }

    public /* bridge */ boolean y(D d10) {
        return super.containsKey(d10);
    }

    public /* bridge */ boolean z(n2 n2Var) {
        return super.containsValue(n2Var);
    }
}
