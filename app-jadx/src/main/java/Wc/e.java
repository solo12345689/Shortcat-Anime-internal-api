package Wc;

import Td.AbstractC2163n;
import Td.L;
import Ub.u;
import android.content.Context;
import cc.i;
import dc.f;
import dc.g;
import dc.h;
import dc.j;
import dc.l;
import dc.n;
import dc.s;
import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.X;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LWc/e;", "Lgc/c;", "<init>", "()V", "Lgc/e;", "n", "()Lgc/e;", "", "C", "()Ljava/lang/String;", "LWc/a;", "d", "Lkotlin/Lazy;", "B", "()LWc/a;", "installationId", "LWc/b;", "e", "D", "()LWc/b;", "mRegistrationInfo", "Landroid/content/Context;", "A", "()Landroid/content/Context;", "context", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class e extends gc.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy installationId = AbstractC2163n.b(new InterfaceC5082a() { // from class: Wc.c
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return e.E(this.f20848a);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy mRegistrationInfo = AbstractC2163n.b(new InterfaceC5082a() { // from class: Wc.d
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return e.F(this.f20849a);
        }
    });

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Function1 {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return e.this.C();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Function1 {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return e.this.D().a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Function2 {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            e.this.D().c((String) promise);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f20855a = new d();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.f(String.class);
        }
    }

    /* JADX INFO: renamed from: Wc.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0367e implements Function1 {
        public C0367e() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            e.this.D().c((String) objArr[0]);
            return L.f17438a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Wc.b D() {
        return (Wc.b) this.mRegistrationInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Wc.a E(e eVar) {
        return new Wc.a(eVar.A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Wc.b F(e eVar) {
        return new Wc.b(eVar.A());
    }

    public final Context A() throws i {
        Context contextB = i().B();
        if (contextB != null) {
            return contextB;
        }
        throw new i();
    }

    protected final Wc.a B() {
        return (Wc.a) this.installationId.getValue();
    }

    public String C() {
        String strB = B().b();
        AbstractC5504s.g(strB, "getOrCreateUUID(...)");
        return strB;
    }

    @Override // gc.c
    public gc.e n() {
        g lVar;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("NotificationsServerRegistrationModule");
            C5972b[] c5972bArr = new C5972b[0];
            a aVar = new a();
            Class cls = Integer.TYPE;
            boolean zC = AbstractC5504s.c(String.class, cls);
            Class cls2 = Float.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Boolean.TYPE;
            dVar.k().put("getInstallationIdAsync", zC ? new l("getInstallationIdAsync", c5972bArr, aVar) : AbstractC5504s.c(String.class, cls4) ? new h("getInstallationIdAsync", c5972bArr, aVar) : AbstractC5504s.c(String.class, cls3) ? new dc.i("getInstallationIdAsync", c5972bArr, aVar) : AbstractC5504s.c(String.class, cls2) ? new j("getInstallationIdAsync", c5972bArr, aVar) : AbstractC5504s.c(String.class, String.class) ? new n("getInstallationIdAsync", c5972bArr, aVar) : new s("getInstallationIdAsync", c5972bArr, aVar));
            dVar.k().put("getRegistrationInfoAsync", new s("getRegistrationInfoAsync", new C5972b[0], new b()));
            if (AbstractC5504s.c(String.class, u.class)) {
                lVar = new f("setRegistrationInfoAsync", new C5972b[0], new c());
            } else {
                X xM = dVar.m();
                C5972b c5972b = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(String.class), Boolean.TRUE));
                if (c5972b == null) {
                    c5972b = new C5972b(new M(O.b(String.class), true, d.f20855a), xM);
                }
                C5972b[] c5972bArr2 = {c5972b};
                C0367e c0367e = new C0367e();
                lVar = AbstractC5504s.c(L.class, cls) ? new l("setRegistrationInfoAsync", c5972bArr2, c0367e) : AbstractC5504s.c(L.class, cls4) ? new h("setRegistrationInfoAsync", c5972bArr2, c0367e) : AbstractC5504s.c(L.class, cls3) ? new dc.i("setRegistrationInfoAsync", c5972bArr2, c0367e) : AbstractC5504s.c(L.class, cls2) ? new j("setRegistrationInfoAsync", c5972bArr2, c0367e) : AbstractC5504s.c(L.class, String.class) ? new n("setRegistrationInfoAsync", c5972bArr2, c0367e) : new s("setRegistrationInfoAsync", c5972bArr2, c0367e);
            }
            dVar.k().put("setRegistrationInfoAsync", lVar);
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
