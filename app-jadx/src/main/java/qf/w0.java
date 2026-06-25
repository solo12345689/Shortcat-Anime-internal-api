package qf;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class w0 extends E0 {

    /* JADX INFO: renamed from: c */
    public static final a f58118c = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: qf.w0$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0879a extends w0 {

            /* JADX INFO: renamed from: d */
            final /* synthetic */ Map f58119d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ boolean f58120e;

            C0879a(Map map, boolean z10) {
                this.f58119d = map;
                this.f58120e = z10;
            }

            @Override // qf.E0
            public boolean a() {
                return this.f58120e;
            }

            @Override // qf.E0
            public boolean f() {
                return this.f58119d.isEmpty();
            }

            @Override // qf.w0
            public B0 k(v0 key) {
                AbstractC5504s.h(key, "key");
                return (B0) this.f58119d.get(key);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ w0 e(a aVar, Map map, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.d(map, z10);
        }

        public final E0 a(S kotlinType) {
            AbstractC5504s.h(kotlinType, "kotlinType");
            return b(kotlinType.N0(), kotlinType.L0());
        }

        public final E0 b(v0 typeConstructor, List arguments) {
            AbstractC5504s.h(typeConstructor, "typeConstructor");
            AbstractC5504s.h(arguments, "arguments");
            List parameters = typeConstructor.getParameters();
            AbstractC5504s.g(parameters, "getParameters(...)");
            ye.m0 m0Var = (ye.m0) AbstractC2279u.A0(parameters);
            if (m0Var == null || !m0Var.Q()) {
                return new M(parameters, arguments);
            }
            List parameters2 = typeConstructor.getParameters();
            AbstractC5504s.g(parameters2, "getParameters(...)");
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(parameters2, 10));
            Iterator it = parameters2.iterator();
            while (it.hasNext()) {
                arrayList.add(((ye.m0) it.next()).l());
            }
            return e(this, Ud.S.w(AbstractC2279u.j1(arrayList, arguments)), false, 2, null);
        }

        public final w0 c(Map map) {
            AbstractC5504s.h(map, "map");
            return e(this, map, false, 2, null);
        }

        public final w0 d(Map map, boolean z10) {
            AbstractC5504s.h(map, "map");
            return new C0879a(map, z10);
        }

        private a() {
        }
    }

    public static final E0 i(v0 v0Var, List list) {
        return f58118c.b(v0Var, list);
    }

    public static final w0 j(Map map) {
        return f58118c.c(map);
    }

    @Override // qf.E0
    public B0 e(S key) {
        AbstractC5504s.h(key, "key");
        return k(key.N0());
    }

    public abstract B0 k(v0 v0Var);
}
