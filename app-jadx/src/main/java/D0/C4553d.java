package d0;

import Ud.AbstractC2265f;
import b0.InterfaceC2965b;
import b0.InterfaceC2967d;
import d0.t;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: d0.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C4553d extends AbstractC2265f implements b0.f {

    /* JADX INFO: renamed from: d */
    public static final a f44901d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final int f44902e = 8;

    /* JADX INFO: renamed from: f */
    private static final C4553d f44903f = new C4553d(t.f44926e.a(), 0);

    /* JADX INFO: renamed from: b */
    private final t f44904b;

    /* JADX INFO: renamed from: c */
    private final int f44905c;

    /* JADX INFO: renamed from: d0.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4553d a() {
            C4553d c4553d = C4553d.f44903f;
            AbstractC5504s.f(c4553d, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return c4553d;
        }

        private a() {
        }
    }

    public C4553d(t tVar, int i10) {
        this.f44904b = tVar;
        this.f44905c = i10;
    }

    private final InterfaceC2967d o() {
        return new n(this);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f44904b.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // Ud.AbstractC2265f
    public final Set e() {
        return o();
    }

    @Override // Ud.AbstractC2265f
    public int g() {
        return this.f44905c;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f44904b.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // b0.f
    /* JADX INFO: renamed from: n */
    public f builder() {
        return new f(this);
    }

    @Override // Ud.AbstractC2265f
    /* JADX INFO: renamed from: p */
    public InterfaceC2967d f() {
        return new p(this);
    }

    public final t q() {
        return this.f44904b;
    }

    @Override // Ud.AbstractC2265f
    /* JADX INFO: renamed from: r */
    public InterfaceC2965b i() {
        return new r(this);
    }

    public C4553d t(Object obj, Object obj2) {
        t.b bVarP = this.f44904b.P(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return bVarP == null ? this : new C4553d(bVarP.a(), size() + bVarP.b());
    }

    public C4553d u(Object obj) {
        t tVarQ = this.f44904b.Q(obj != null ? obj.hashCode() : 0, obj, 0);
        return this.f44904b == tVarQ ? this : tVarQ == null ? f44901d.a() : new C4553d(tVarQ, size() - 1);
    }
}
