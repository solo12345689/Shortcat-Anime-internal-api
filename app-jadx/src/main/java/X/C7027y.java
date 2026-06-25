package x;

import Gf.AbstractC1617k;
import Gf.C0;
import Gf.InterfaceC1612h0;
import ae.AbstractC2605b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: x.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C7027y extends e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private B.m f63390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private B.d f63391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f63392c;

    /* JADX INFO: renamed from: x.y$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f63393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ B.m f63394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ B.j f63395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1612h0 f63396d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(B.m mVar, B.j jVar, InterfaceC1612h0 interfaceC1612h0, Zd.e eVar) {
            super(2, eVar);
            this.f63394b = mVar;
            this.f63395c = jVar;
            this.f63396d = interfaceC1612h0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new a(this.f63394b, this.f63395c, this.f63396d, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f63393a;
            if (i10 == 0) {
                Td.v.b(obj);
                B.m mVar = this.f63394b;
                B.j jVar = this.f63395c;
                this.f63393a = 1;
                if (mVar.c(jVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            InterfaceC1612h0 interfaceC1612h0 = this.f63396d;
            if (interfaceC1612h0 != null) {
                interfaceC1612h0.dispose();
            }
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: x.y$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ B.m f63397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ B.j f63398b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(B.m mVar, B.j jVar) {
            super(1);
            this.f63397a = mVar;
            this.f63398b = jVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Td.L.f17438a;
        }

        public final void invoke(Throwable th2) {
            this.f63397a.a(this.f63398b);
        }
    }

    public C7027y(B.m mVar) {
        this.f63390a = mVar;
    }

    private final void E1() {
        B.d dVar;
        B.m mVar = this.f63390a;
        if (mVar != null && (dVar = this.f63391b) != null) {
            mVar.a(new B.e(dVar));
        }
        this.f63391b = null;
    }

    private final void F1(B.m mVar, B.j jVar) {
        if (!isAttached()) {
            mVar.a(jVar);
        } else {
            C0 c02 = (C0) getCoroutineScope().getCoroutineContext().l(C0.f7490K);
            AbstractC1617k.d(getCoroutineScope(), null, null, new a(mVar, jVar, c02 != null ? c02.H(new b(mVar, jVar)) : null, null), 3, null);
        }
    }

    public final void G1(boolean z10) {
        B.m mVar = this.f63390a;
        if (mVar != null) {
            if (!z10) {
                B.d dVar = this.f63391b;
                if (dVar != null) {
                    F1(mVar, new B.e(dVar));
                    this.f63391b = null;
                    return;
                }
                return;
            }
            B.d dVar2 = this.f63391b;
            if (dVar2 != null) {
                F1(mVar, new B.e(dVar2));
                this.f63391b = null;
            }
            B.d dVar3 = new B.d();
            F1(mVar, dVar3);
            this.f63391b = dVar3;
        }
    }

    public final void H1(B.m mVar) {
        if (AbstractC5504s.c(this.f63390a, mVar)) {
            return;
        }
        E1();
        this.f63390a = mVar;
    }

    @Override // androidx.compose.ui.e.c
    public boolean getShouldAutoInvalidate() {
        return this.f63392c;
    }
}
