package androidx.lifecycle;

import Gf.AbstractC1617k;
import Gf.C1608f0;
import Gf.G0;
import ae.AbstractC2605b;
import androidx.lifecycle.AbstractC2857k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: androidx.lifecycle.m */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2859m extends AbstractC2858l implements InterfaceC2861o {

    /* JADX INFO: renamed from: a */
    private final AbstractC2857k f30242a;

    /* JADX INFO: renamed from: b */
    private final Zd.i f30243b;

    /* JADX INFO: renamed from: androidx.lifecycle.m$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f30244a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f30245b;

        a(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = C2859m.this.new a(eVar);
            aVar.f30245b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f30244a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Td.v.b(obj);
            Gf.O o10 = (Gf.O) this.f30245b;
            if (C2859m.this.a().getCurrentState().compareTo(AbstractC2857k.b.f30236b) >= 0) {
                C2859m.this.a().addObserver(C2859m.this);
            } else {
                G0.f(o10.getCoroutineContext(), null, 1, null);
            }
            return Td.L.f17438a;
        }
    }

    public C2859m(AbstractC2857k lifecycle, Zd.i coroutineContext) {
        AbstractC5504s.h(lifecycle, "lifecycle");
        AbstractC5504s.h(coroutineContext, "coroutineContext");
        this.f30242a = lifecycle;
        this.f30243b = coroutineContext;
        if (a().getCurrentState() == AbstractC2857k.b.f30235a) {
            G0.f(getCoroutineContext(), null, 1, null);
        }
    }

    public AbstractC2857k a() {
        return this.f30242a;
    }

    public final void b() {
        AbstractC1617k.d(this, C1608f0.c().d2(), null, new a(null), 2, null);
    }

    @Override // androidx.lifecycle.InterfaceC2861o
    public void g(r source, AbstractC2857k.a event) {
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(event, "event");
        if (a().getCurrentState().compareTo(AbstractC2857k.b.f30235a) <= 0) {
            a().removeObserver(this);
            G0.f(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // Gf.O
    public Zd.i getCoroutineContext() {
        return this.f30243b;
    }
}
