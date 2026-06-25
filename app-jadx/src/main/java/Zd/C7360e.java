package zd;

import Cd.e;
import Gf.AbstractC1613i;
import Gf.AbstractC1617k;
import Gf.C1608f0;
import Gf.M0;
import Gf.O;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import android.app.Activity;
import android.content.Context;
import com.facebook.react.ReactHost;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import vd.InterfaceC6861b;
import zd.AbstractC7365j;

/* JADX INFO: renamed from: zd.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7360e extends AbstractC7365j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f66101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f66102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6861b.a f66103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final O f66104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f66105e;

    /* JADX INFO: renamed from: zd.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f66106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReactHost f66107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C7360e f66108c;

        /* JADX INFO: renamed from: zd.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0998a extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f66109a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ReactHost f66110b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ C7360e f66111c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0998a(ReactHost reactHost, C7360e c7360e, Zd.e eVar) {
                super(2, eVar);
                this.f66110b = reactHost;
                this.f66111c = c7360e;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new C0998a(this.f66110b, this.f66111c, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((C0998a) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC2605b.f();
                if (this.f66109a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                ReactHost reactHost = this.f66110b;
                WeakReference weakReference = this.f66111c.f66102b;
                AbstractC7362g.b(reactHost, weakReference != null ? (Activity) weakReference.get() : null, "Restart from RecreateReactContextProcedure");
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ReactHost reactHost, C7360e c7360e, Zd.e eVar) {
            super(2, eVar);
            this.f66107b = reactHost;
            this.f66108c = c7360e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new a(this.f66107b, this.f66108c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f66106a;
            if (i10 == 0) {
                v.b(obj);
                M0 m0C = C1608f0.c();
                C0998a c0998a = new C0998a(this.f66107b, this.f66108c, null);
                this.f66106a = 1;
                if (AbstractC1613i.g(m0C, c0998a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return L.f17438a;
        }
    }

    public C7360e(Context context, WeakReference weakReference, InterfaceC6861b.a callback, O procedureScope) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(callback, "callback");
        AbstractC5504s.h(procedureScope, "procedureScope");
        this.f66101a = context;
        this.f66102b = weakReference;
        this.f66103c = callback;
        this.f66104d = procedureScope;
        this.f66105e = "timer-recreate-react-context";
    }

    @Override // zd.AbstractC7365j
    public String a() {
        return this.f66105e;
    }

    @Override // zd.AbstractC7365j
    public Object b(AbstractC7365j.a aVar, Zd.e eVar) {
        ReactHost reactHostA = AbstractC7362g.a(this.f66101a);
        if (reactHostA == null) {
            this.f66103c.onFailure(new Exception("Could not reload application. Ensure you have passed the correct instance of ReactApplication into UpdatesController.initialize()."));
            return L.f17438a;
        }
        aVar.a(new e.m());
        this.f66103c.a();
        AbstractC1617k.d(this.f66104d, null, null, new a(reactHostA, this, null), 3, null);
        aVar.b();
        aVar.c();
        return L.f17438a;
    }
}
