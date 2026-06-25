package hd;

import Td.L;
import Ub.u;
import android.content.Context;
import android.content.pm.PackageManager;
import cc.i;
import com.facebook.react.bridge.BaseJavaModule;
import com.revenuecat.purchases.google.history.BillingConstants;
import dc.f;
import dc.g;
import dc.h;
import dc.j;
import dc.l;
import dc.n;
import dc.s;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import n9.InterfaceC5760d;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.X;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lhd/e;", "Lgc/c;", "<init>", "()V", "LUb/u;", BaseJavaModule.METHOD_TYPE_PROMISE, "LTd/L;", "D", "(LUb/u;)V", "", "C", "()Z", "Lgc/e;", "n", "()Lgc/e;", "Landroid/content/Context;", "B", "()Landroid/content/Context;", "context", "expo-store-review_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends gc.c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Function1 {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Boolean.valueOf(e.this.C());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Function2 {
        public b() {
        }

        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            e.this.D(promise);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f47851a = new c();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(u.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Function1 {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            e.this.D((u) objArr[0]);
            return L.f17438a;
        }
    }

    private final Context B() throws i {
        Context contextB = i().B();
        if (contextB != null) {
            return contextB;
        }
        throw new i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean C() {
        try {
            B().getPackageManager().getPackageInfo(BillingConstants.VENDING_PACKAGE, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(final u promise) {
        final L9.c cVarA = L9.d.a(B());
        AbstractC5504s.g(cVarA, "create(...)");
        n9.i iVarB = cVarA.b();
        AbstractC5504s.g(iVarB, "requestReviewFlow(...)");
        iVarB.c(new InterfaceC5760d() { // from class: hd.c
            @Override // n9.InterfaceC5760d
            public final void a(n9.i iVar) {
                e.E(promise, cVarA, this, iVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(final u uVar, L9.c cVar, e eVar, n9.i task) {
        AbstractC5504s.h(task, "task");
        if (!task.o()) {
            uVar.h(new C4943b());
            L l10 = L.f17438a;
            return;
        }
        L9.b bVar = (L9.b) task.k();
        if (bVar != null) {
            n9.i iVarA = cVar.a(eVar.i().F(), bVar);
            AbstractC5504s.g(iVarA, "launchReviewFlow(...)");
            if (iVarA.c(new InterfaceC5760d() { // from class: hd.d
                @Override // n9.InterfaceC5760d
                public final void a(n9.i iVar) {
                    e.F(uVar, iVar);
                }
            }) != null) {
                return;
            }
        }
        uVar.h(new C4942a());
        L l11 = L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(u uVar, n9.i result) {
        AbstractC5504s.h(result, "result");
        if (result.o()) {
            uVar.resolve((Object) null);
        } else {
            uVar.h(new C4942a());
        }
    }

    @Override // gc.c
    public gc.e n() {
        g lVar;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoStoreReview");
            C5972b[] c5972bArr = new C5972b[0];
            a aVar = new a();
            Class cls = Integer.TYPE;
            boolean zC = AbstractC5504s.c(Boolean.class, cls);
            Class cls2 = Float.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Boolean.TYPE;
            dVar.k().put("isAvailableAsync", zC ? new l("isAvailableAsync", c5972bArr, aVar) : AbstractC5504s.c(Boolean.class, cls4) ? new h("isAvailableAsync", c5972bArr, aVar) : AbstractC5504s.c(Boolean.class, cls3) ? new dc.i("isAvailableAsync", c5972bArr, aVar) : AbstractC5504s.c(Boolean.class, cls2) ? new j("isAvailableAsync", c5972bArr, aVar) : AbstractC5504s.c(Boolean.class, String.class) ? new n("isAvailableAsync", c5972bArr, aVar) : new s("isAvailableAsync", c5972bArr, aVar));
            if (AbstractC5504s.c(u.class, u.class)) {
                lVar = new f("requestReview", new C5972b[0], new b());
            } else {
                X xM = dVar.m();
                C5972b c5972b = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(u.class), Boolean.FALSE));
                if (c5972b == null) {
                    c5972b = new C5972b(new M(O.b(u.class), false, c.f47851a), xM);
                }
                C5972b[] c5972bArr2 = {c5972b};
                d dVar2 = new d();
                lVar = AbstractC5504s.c(L.class, cls) ? new l("requestReview", c5972bArr2, dVar2) : AbstractC5504s.c(L.class, cls4) ? new h("requestReview", c5972bArr2, dVar2) : AbstractC5504s.c(L.class, cls3) ? new dc.i("requestReview", c5972bArr2, dVar2) : AbstractC5504s.c(L.class, cls2) ? new j("requestReview", c5972bArr2, dVar2) : AbstractC5504s.c(L.class, String.class) ? new n("requestReview", c5972bArr2, dVar2) : new s("requestReview", c5972bArr2, dVar2);
            }
            dVar.k().put("requestReview", lVar);
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
