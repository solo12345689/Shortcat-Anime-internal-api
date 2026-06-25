package com.facebook.imagepipeline.producers;

import android.os.Looper;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f36241c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f36242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p0 f36243b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(e0 e0Var) {
            if (!F6.a.b()) {
                return null;
            }
            return "ThreadHandoffProducer_produceResults_" + e0Var.getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(e0 e0Var) {
            return e0Var.g().G().k() && Looper.getMainLooper().getThread() != Thread.currentThread();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC3186f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f36244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f36245b;

        b(m0 m0Var, o0 o0Var) {
            this.f36244a = m0Var;
            this.f36245b = o0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void b() {
            this.f36244a.a();
            this.f36245b.d().a(this.f36244a);
        }
    }

    public o0(d0 inputProducer, p0 threadHandoffProducerQueue) {
        AbstractC5504s.h(inputProducer, "inputProducer");
        AbstractC5504s.h(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        this.f36242a = inputProducer;
        this.f36243b = threadHandoffProducerQueue;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n consumer, e0 context) {
        AbstractC5504s.h(consumer, "consumer");
        AbstractC5504s.h(context, "context");
        if (!L6.b.d()) {
            g0 g0VarM = context.m();
            a aVar = f36241c;
            if (aVar.d(context)) {
                g0VarM.d(context, "BackgroundThreadHandoffProducer");
                g0VarM.j(context, "BackgroundThreadHandoffProducer", null);
                this.f36242a.a(consumer, context);
                return;
            } else {
                c cVar = new c(consumer, g0VarM, context, this);
                context.b(new b(cVar, this));
                this.f36243b.b(F6.a.a(cVar, aVar.c(context)));
                return;
            }
        }
        L6.b.a("ThreadHandoffProducer#produceResults");
        try {
            g0 g0VarM2 = context.m();
            a aVar2 = f36241c;
            if (aVar2.d(context)) {
                g0VarM2.d(context, "BackgroundThreadHandoffProducer");
                g0VarM2.j(context, "BackgroundThreadHandoffProducer", null);
                this.f36242a.a(consumer, context);
            } else {
                c cVar2 = new c(consumer, g0VarM2, context, this);
                context.b(new b(cVar2, this));
                this.f36243b.b(F6.a.a(cVar2, aVar2.c(context)));
                Td.L l10 = Td.L.f17438a;
            }
        } finally {
            L6.b.b();
        }
    }

    public final d0 c() {
        return this.f36242a;
    }

    public final p0 d() {
        return this.f36243b;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends m0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC3194n f36246f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g0 f36247g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ e0 f36248h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ o0 f36249i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC3194n interfaceC3194n, g0 g0Var, e0 e0Var, o0 o0Var) {
            super(interfaceC3194n, g0Var, e0Var, "BackgroundThreadHandoffProducer");
            this.f36246f = interfaceC3194n;
            this.f36247g = g0Var;
            this.f36248h = e0Var;
            this.f36249i = o0Var;
        }

        @Override // w5.h
        protected Object c() {
            return null;
        }

        @Override // com.facebook.imagepipeline.producers.m0, w5.h
        protected void f(Object obj) {
            this.f36247g.j(this.f36248h, "BackgroundThreadHandoffProducer", null);
            this.f36249i.c().a(this.f36246f, this.f36248h);
        }

        @Override // w5.h
        protected void b(Object obj) {
        }
    }
}
