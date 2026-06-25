package Cc;

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
import gc.e;
import ie.InterfaceC5082a;
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LCc/b;", "Lgc/c;", "<init>", "()V", "Lgc/e;", "n", "()Lgc/e;", "expo-notifications_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends gc.c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Integer.valueOf(Cc.a.f3012a.a());
        }
    }

    /* JADX INFO: renamed from: Cc.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0034b implements Function2 {
        public C0034b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, u promise) throws i {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            int iIntValue = ((Integer) promise).intValue();
            Cc.a aVar = Cc.a.f3012a;
            Context contextB = b.this.i().B();
            if (contextB == null) {
                throw new i();
            }
            aVar.c(contextB, iIntValue);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws i {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f3015a = new c();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(Integer.TYPE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Function1 {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws i {
            AbstractC5504s.h(objArr, "<destruct>");
            int iIntValue = ((Number) objArr[0]).intValue();
            Cc.a aVar = Cc.a.f3012a;
            Context contextB = b.this.i().B();
            if (contextB != null) {
                return Boolean.valueOf(aVar.c(contextB, iIntValue));
            }
            throw new i();
        }
    }

    @Override // gc.c
    public e n() {
        g lVar;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoBadgeModule");
            C5972b[] c5972bArr = new C5972b[0];
            a aVar = new a();
            Class cls = Integer.TYPE;
            boolean zC = AbstractC5504s.c(Integer.class, cls);
            Class cls2 = Float.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Boolean.TYPE;
            dVar.k().put("getBadgeCountAsync", zC ? new l("getBadgeCountAsync", c5972bArr, aVar) : AbstractC5504s.c(Integer.class, cls4) ? new h("getBadgeCountAsync", c5972bArr, aVar) : AbstractC5504s.c(Integer.class, cls3) ? new dc.i("getBadgeCountAsync", c5972bArr, aVar) : AbstractC5504s.c(Integer.class, cls2) ? new j("getBadgeCountAsync", c5972bArr, aVar) : AbstractC5504s.c(Integer.class, String.class) ? new n("getBadgeCountAsync", c5972bArr, aVar) : new s("getBadgeCountAsync", c5972bArr, aVar));
            if (AbstractC5504s.c(Integer.class, u.class)) {
                lVar = new f("setBadgeCountAsync", new C5972b[0], new C0034b());
            } else {
                X xM = dVar.m();
                C5972b c5972b = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(Integer.class), Boolean.FALSE));
                if (c5972b == null) {
                    c5972b = new C5972b(new M(O.b(Integer.class), false, c.f3015a), xM);
                }
                C5972b[] c5972bArr2 = {c5972b};
                d dVar2 = new d();
                lVar = AbstractC5504s.c(Boolean.class, cls) ? new l("setBadgeCountAsync", c5972bArr2, dVar2) : AbstractC5504s.c(Boolean.class, cls4) ? new h("setBadgeCountAsync", c5972bArr2, dVar2) : AbstractC5504s.c(Boolean.class, cls3) ? new dc.i("setBadgeCountAsync", c5972bArr2, dVar2) : AbstractC5504s.c(Boolean.class, cls2) ? new j("setBadgeCountAsync", c5972bArr2, dVar2) : AbstractC5504s.c(Boolean.class, String.class) ? new n("setBadgeCountAsync", c5972bArr2, dVar2) : new s("setBadgeCountAsync", c5972bArr2, dVar2);
            }
            dVar.k().put("setBadgeCountAsync", lVar);
            e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
