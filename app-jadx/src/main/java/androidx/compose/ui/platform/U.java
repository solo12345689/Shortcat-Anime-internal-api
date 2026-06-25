package androidx.compose.ui.platform;

import Gf.C1627p;
import Gf.InterfaceC1623n;
import Td.u;
import Y.InterfaceC2446t0;
import Zd.i;
import ae.AbstractC2605b;
import android.view.Choreographer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class U implements InterfaceC2446t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Choreographer f27389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S f27390b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ S f27391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f27392b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(S s10, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f27391a = s10;
            this.f27392b = frameCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Td.L.f17438a;
        }

        public final void invoke(Throwable th2) {
            this.f27391a.p2(this.f27392b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f27394b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f27394b = frameCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Td.L.f17438a;
        }

        public final void invoke(Throwable th2) {
            U.this.a().removeFrameCallback(this.f27394b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1623n f27395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ U f27396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f27397c;

        c(InterfaceC1623n interfaceC1623n, U u10, Function1 function1) {
            this.f27395a = interfaceC1623n;
            this.f27396b = u10;
            this.f27397c = function1;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object objB;
            InterfaceC1623n interfaceC1623n = this.f27395a;
            Function1 function1 = this.f27397c;
            try {
                u.a aVar = Td.u.f17466b;
                objB = Td.u.b(function1.invoke(Long.valueOf(j10)));
            } catch (Throwable th2) {
                u.a aVar2 = Td.u.f17466b;
                objB = Td.u.b(Td.v.a(th2));
            }
            interfaceC1623n.resumeWith(objB);
        }
    }

    public U(Choreographer choreographer, S s10) {
        this.f27389a = choreographer;
        this.f27390b = s10;
    }

    @Override // Y.InterfaceC2446t0
    public Object A1(Function1 function1, Zd.e eVar) {
        S s10 = this.f27390b;
        if (s10 == null) {
            i.b bVarL = eVar.getContext().l(Zd.f.f23273S);
            s10 = bVarL instanceof S ? (S) bVarL : null;
        }
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        c cVar = new c(c1627p, this, function1);
        if (s10 == null || !AbstractC5504s.c(s10.j2(), a())) {
            a().postFrameCallback(cVar);
            c1627p.p(new b(cVar));
        } else {
            s10.o2(cVar);
            c1627p.p(new a(s10, cVar));
        }
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV;
    }

    public final Choreographer a() {
        return this.f27389a;
    }

    @Override // Zd.i
    public Zd.i a1(i.c cVar) {
        return InterfaceC2446t0.a.c(this, cVar);
    }

    @Override // Zd.i.b, Zd.i
    public i.b l(i.c cVar) {
        return InterfaceC2446t0.a.b(this, cVar);
    }

    @Override // Zd.i
    public Zd.i w(Zd.i iVar) {
        return InterfaceC2446t0.a.d(this, iVar);
    }

    @Override // Zd.i
    public Object y1(Object obj, Function2 function2) {
        return InterfaceC2446t0.a.a(this, obj, function2);
    }
}
