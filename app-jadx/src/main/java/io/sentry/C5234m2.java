package io.sentry;

import io.sentry.C5322z3;
import io.sentry.E1;
import io.sentry.O3;
import io.sentry.protocol.C5253c;
import io.sentry.protocol.C5254d;
import io.sentry.protocol.C5257g;
import io.sentry.util.AbstractC5292e;
import io.sentry.util.AbstractC5294g;
import io.sentry.util.AbstractC5295h;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.m2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5234m2 implements InterfaceC5182c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5322z3 f50832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.transport.p f50833c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.logger.c f50835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.sentry.metrics.c f50836f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f50834d = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f50831a = true;

    /* JADX INFO: renamed from: io.sentry.m2$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements Comparator {
        private b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C5191e c5191e, C5191e c5191e2) {
            return c5191e.x().compareTo(c5191e2.x());
        }
    }

    public C5234m2(C5322z3 c5322z3) {
        this.f50832b = (C5322z3) io.sentry.util.w.c(c5322z3, "SentryOptions is required.");
        InterfaceC5227l0 transportFactory = c5322z3.getTransportFactory();
        if (transportFactory instanceof C5208h1) {
            transportFactory = new C5113a();
            c5322z3.setTransportFactory(transportFactory);
        }
        this.f50833c = transportFactory.a(c5322z3, new C1(c5322z3).a());
        if (c5322z3.getLogs().b()) {
            this.f50835e = c5322z3.getLogs().a().a(c5322z3, this);
        } else {
            this.f50835e = io.sentry.logger.h.a();
        }
        if (c5322z3.getMetrics().b()) {
            this.f50836f = c5322z3.getMetrics().a().a(c5322z3, this);
        } else {
            this.f50836f = io.sentry.metrics.h.a();
        }
    }

    private void A(Y y10, H h10) {
        InterfaceC5217j0 interfaceC5217j0J = y10.j();
        if (interfaceC5217j0J == null || !io.sentry.util.l.f(h10, io.sentry.hints.r.class)) {
            return;
        }
        Object objE = io.sentry.util.l.e(h10);
        if (!(objE instanceof io.sentry.hints.f)) {
            interfaceC5217j0J.a(a4.ABORTED, false, null);
        } else {
            ((io.sentry.hints.f) objE).d(interfaceC5217j0J.f());
            interfaceC5217j0J.a(a4.ABORTED, false, h10);
        }
    }

    private List B(H h10) {
        List listE = h10.e();
        C5176b c5176bG = h10.g();
        if (c5176bG != null) {
            listE.add(c5176bG);
        }
        C5176b c5176bI = h10.i();
        if (c5176bI != null) {
            listE.add(c5176bI);
        }
        C5176b c5176bH = h10.h();
        if (c5176bH != null) {
            listE.add(c5176bH);
        }
        return listE;
    }

    private f4 C(Y y10, H h10, AbstractC5219j2 abstractC5219j2, String str) {
        if (io.sentry.util.l.f(h10, io.sentry.hints.c.class)) {
            if (abstractC5219j2 != null) {
                return C5186d.c(abstractC5219j2, str, this.f50832b).J();
            }
            return null;
        }
        if (y10 == null) {
            return null;
        }
        InterfaceC5217j0 interfaceC5217j0J = y10.j();
        return interfaceC5217j0J != null ? interfaceC5217j0J.h() : io.sentry.util.H.g(y10, this.f50832b).h();
    }

    private f4 D(Y y10, H h10, V2 v22) {
        return C(y10, h10, v22, v22 != null ? v22.w0() : null);
    }

    private V2 E(V2 v22, H h10, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C c10 = (C) it.next();
            try {
                boolean z10 = c10 instanceof InterfaceC5181c;
                boolean zF = io.sentry.util.l.f(h10, io.sentry.hints.c.class);
                if (zF && z10) {
                    v22 = c10.b(v22, h10);
                } else if (!zF && !z10) {
                    v22 = c10.b(v22, h10);
                }
            } catch (Throwable th2) {
                this.f50832b.getLogger().a(EnumC5215i3.ERROR, th2, "An exception occurred while processing event by processor: %s", c10.getClass().getName());
            }
            if (v22 == null) {
                this.f50832b.getLogger().c(EnumC5215i3.DEBUG, "Event was dropped by a processor: %s", c10.getClass().getName());
                this.f50832b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, EnumC5221k.Error);
                break;
            }
        }
        return v22;
    }

    private A3 F(A3 a32, H h10, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C c10 = (C) it.next();
            try {
                a32 = c10.a(a32, h10);
            } catch (Throwable th2) {
                this.f50832b.getLogger().a(EnumC5215i3.ERROR, th2, "An exception occurred while processing replay event by processor: %s", c10.getClass().getName());
            }
            if (a32 == null) {
                this.f50832b.getLogger().c(EnumC5215i3.DEBUG, "Replay event was dropped by a processor: %s", c10.getClass().getName());
                this.f50832b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, EnumC5221k.Replay);
                break;
            }
        }
        return a32;
    }

    private io.sentry.protocol.E G(io.sentry.protocol.E e10, H h10, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C c10 = (C) it.next();
            int size = e10.o0().size();
            try {
                e10 = c10.g(e10, h10);
            } catch (Throwable th2) {
                this.f50832b.getLogger().a(EnumC5215i3.ERROR, th2, "An exception occurred while processing transaction by processor: %s", c10.getClass().getName());
            }
            int size2 = e10 == null ? 0 : e10.o0().size();
            if (e10 == null) {
                this.f50832b.getLogger().c(EnumC5215i3.DEBUG, "Transaction was dropped by a processor: %s", c10.getClass().getName());
                io.sentry.clientreport.h clientReportRecorder = this.f50832b.getClientReportRecorder();
                io.sentry.clientreport.f fVar = io.sentry.clientreport.f.EVENT_PROCESSOR;
                clientReportRecorder.a(fVar, EnumC5221k.Transaction);
                this.f50832b.getClientReportRecorder().c(fVar, EnumC5221k.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i10 = size - size2;
                this.f50832b.getLogger().c(EnumC5215i3.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i10), c10.getClass().getName());
                this.f50832b.getClientReportRecorder().c(io.sentry.clientreport.f.EVENT_PROCESSOR, EnumC5221k.Span, i10);
            }
        }
        return e10;
    }

    private boolean H() {
        io.sentry.util.z zVarA = this.f50832b.getSampleRate() == null ? null : io.sentry.util.B.a();
        return this.f50832b.getSampleRate() == null || zVarA == null || this.f50832b.getSampleRate().doubleValue() >= zVarA.c();
    }

    private io.sentry.protocol.x I(C5265q2 c5265q2, H h10) {
        C5322z3.b beforeEnvelopeCallback = this.f50832b.getBeforeEnvelopeCallback();
        if (beforeEnvelopeCallback != null) {
            try {
                beforeEnvelopeCallback.a(c5265q2, h10);
            } catch (Throwable th2) {
                this.f50832b.getLogger().b(EnumC5215i3.ERROR, "The BeforeEnvelope callback threw an exception.", th2);
            }
        }
        C5205g3.d().c(this.f50832b.getLogger());
        if (h10 == null) {
            this.f50833c.K1(c5265q2);
        } else {
            this.f50833c.e0(c5265q2, h10);
        }
        io.sentry.protocol.x xVarA = c5265q2.b().a();
        return xVarA != null ? xVarA : io.sentry.protocol.x.f51153b;
    }

    private boolean J(AbstractC5219j2 abstractC5219j2, H h10) {
        if (io.sentry.util.l.n(h10)) {
            return true;
        }
        this.f50832b.getLogger().c(EnumC5215i3.DEBUG, "Event was cached so not applying scope: %s", abstractC5219j2.G());
        return false;
    }

    private boolean K(O3 o32, O3 o33) {
        if (o33 == null) {
            return false;
        }
        if (o32 == null) {
            return true;
        }
        O3.b bVarL = o33.l();
        O3.b bVar = O3.b.Crashed;
        if (bVarL != bVar || o32.l() == bVar) {
            return o33.e() > 0 && o32.e() <= 0;
        }
        return true;
    }

    private void L(AbstractC5219j2 abstractC5219j2, Collection collection) {
        List listB = abstractC5219j2.B();
        if (listB == null || collection.isEmpty()) {
            return;
        }
        listB.addAll(collection);
        Collections.sort(listB, this.f50834d);
    }

    public static /* synthetic */ void l(C5234m2 c5234m2, V2 v22, H h10, O3 o32) {
        if (o32 == null) {
            c5234m2.f50832b.getLogger().c(EnumC5215i3.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        c5234m2.getClass();
        String strH = null;
        O3.b bVar = v22.y0() ? O3.b.Crashed : null;
        boolean z10 = O3.b.Crashed == bVar || v22.z0();
        String str = (v22.K() == null || v22.K().l() == null || !v22.K().l().containsKey("user-agent")) ? null : (String) v22.K().l().get("user-agent");
        Object objE = io.sentry.util.l.e(h10);
        if (objE instanceof io.sentry.hints.a) {
            strH = ((io.sentry.hints.a) objE).h();
            bVar = O3.b.Abnormal;
        }
        if (o32.q(bVar, str, z10, strH) && o32.m()) {
            o32.c();
        }
    }

    private void m(Y y10, H h10) {
        if (y10 != null) {
            h10.a(y10.K());
        }
    }

    private AbstractC5219j2 p(AbstractC5219j2 abstractC5219j2, Y y10) {
        if (y10 != null) {
            if (abstractC5219j2.K() == null) {
                abstractC5219j2.a0(y10.c());
            }
            if (abstractC5219j2.Q() == null) {
                abstractC5219j2.f0(y10.z());
            }
            if (abstractC5219j2.N() == null) {
                abstractC5219j2.e0(new HashMap(y10.getTags()));
            } else {
                for (Map.Entry entry : y10.getTags().entrySet()) {
                    if (!abstractC5219j2.N().containsKey(entry.getKey())) {
                        abstractC5219j2.N().put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            if (abstractC5219j2.B() == null) {
                abstractC5219j2.S(new ArrayList(y10.r()));
            } else {
                L(abstractC5219j2, y10.r());
            }
            if (abstractC5219j2.H() == null) {
                abstractC5219j2.X(new HashMap(y10.getExtras()));
            } else {
                for (Map.Entry entry2 : y10.getExtras().entrySet()) {
                    if (!abstractC5219j2.H().containsKey(entry2.getKey())) {
                        abstractC5219j2.H().put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            C5253c c5253cC = abstractC5219j2.C();
            for (Map.Entry entry3 : new C5253c(y10.v()).b()) {
                if (!c5253cC.a(entry3.getKey())) {
                    c5253cC.l((String) entry3.getKey(), entry3.getValue());
                }
            }
        }
        return abstractC5219j2;
    }

    private V2 q(V2 v22, Y y10, H h10) {
        C5257g c5257gN;
        if (y10 == null) {
            return v22;
        }
        p(v22, y10);
        if (v22.w0() == null) {
            v22.H0(y10.A());
        }
        if (v22.q0() == null) {
            v22.B0(y10.y());
        }
        if (y10.m() != null) {
            v22.C0(y10.m());
        }
        InterfaceC5207h0 interfaceC5207h0F = y10.f();
        if (v22.C().j() == null) {
            if (interfaceC5207h0F == null) {
                v22.C().z(i4.x(y10.H()));
            } else {
                v22.C().z(interfaceC5207h0F.q());
            }
        }
        if (v22.C().f() == null && (c5257gN = y10.n()) != null) {
            v22.C().r(c5257gN);
        }
        return E(v22, h10, y10.Q());
    }

    private A3 r(A3 a32, Y y10) {
        if (y10 != null) {
            if (a32.K() == null) {
                a32.a0(y10.c());
            }
            if (a32.Q() == null) {
                a32.f0(y10.z());
            }
            if (a32.N() == null) {
                a32.e0(new HashMap(y10.getTags()));
            } else {
                for (Map.Entry entry : y10.getTags().entrySet()) {
                    if (!a32.N().containsKey(entry.getKey())) {
                        a32.N().put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            C5253c c5253cC = a32.C();
            for (Map.Entry entry2 : new C5253c(y10.v()).b()) {
                if (!c5253cC.a(entry2.getKey())) {
                    c5253cC.l((String) entry2.getKey(), entry2.getValue());
                }
            }
            InterfaceC5207h0 interfaceC5207h0F = y10.f();
            if (a32.C().j() == null) {
                if (interfaceC5207h0F == null) {
                    a32.C().z(i4.x(y10.H()));
                    return a32;
                }
                a32.C().z(interfaceC5207h0F.q());
            }
        }
        return a32;
    }

    private C5265q2 s(AbstractC5219j2 abstractC5219j2, List list, O3 o32, f4 f4Var, C5300v1 c5300v1) {
        io.sentry.protocol.x xVar;
        ArrayList arrayList = new ArrayList();
        if (abstractC5219j2 != null) {
            arrayList.add(T2.E(this.f50832b.getSerializer(), abstractC5219j2));
            xVar = abstractC5219j2.G();
        } else {
            xVar = null;
        }
        if (o32 != null) {
            arrayList.add(T2.K(this.f50832b.getSerializer(), o32));
        }
        if (c5300v1 != null) {
            arrayList.add(T2.I(c5300v1, this.f50832b.getMaxTraceFileSize(), this.f50832b.getSerializer()));
            if (xVar == null) {
                xVar = new io.sentry.protocol.x(c5300v1.B());
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(T2.C(this.f50832b.getSerializer(), this.f50832b.getLogger(), (C5176b) it.next(), this.f50832b.getMaxAttachmentSize()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C5265q2(new C5269r2(xVar, this.f50832b.getSdkVersion(), f4Var), arrayList);
    }

    private C5265q2 t(C5235m3 c5235m3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(T2.F(this.f50832b.getSerializer(), c5235m3));
        return new C5265q2(new C5269r2(null, this.f50832b.getSdkVersion(), null), arrayList);
    }

    private C5265q2 u(C5266q3 c5266q3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(T2.G(this.f50832b.getSerializer(), c5266q3));
        return new C5265q2(new C5269r2(null, this.f50832b.getSdkVersion(), null), arrayList);
    }

    private C5265q2 v(A3 a32, A1 a12, f4 f4Var, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(T2.J(this.f50832b.getSerializer(), this.f50832b.getLogger(), a32, a12, z10));
        return new C5265q2(new C5269r2(a32.G(), this.f50832b.getSessionReplay().o(), f4Var), arrayList);
    }

    private V2 w(V2 v22, H h10) {
        C5322z3.c beforeSend = this.f50832b.getBeforeSend();
        if (beforeSend == null) {
            return v22;
        }
        try {
            return beforeSend.a(v22, h10);
        } catch (Throwable th2) {
            this.f50832b.getLogger().b(EnumC5215i3.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th2);
            return null;
        }
    }

    private A3 x(A3 a32, H h10) {
        this.f50832b.getBeforeSendReplay();
        return a32;
    }

    private io.sentry.protocol.E y(io.sentry.protocol.E e10, H h10) {
        this.f50832b.getBeforeSendTransaction();
        return e10;
    }

    private List z(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5176b c5176b = (C5176b) it.next();
            if (c5176b.k()) {
                arrayList.add(c5176b);
            }
        }
        return arrayList;
    }

    O3 M(final V2 v22, final H h10, Y y10) {
        if (io.sentry.util.l.n(h10)) {
            if (y10 != null) {
                return y10.s(new E1.b() { // from class: io.sentry.l2
                    @Override // io.sentry.E1.b
                    public final void a(O3 o32) {
                        C5234m2.l(this.f50807a, v22, h10, o32);
                    }
                });
            }
            this.f50832b.getLogger().c(EnumC5215i3.INFO, "Scope is null on client.captureEvent", new Object[0]);
        }
        return null;
    }

    @Override // io.sentry.InterfaceC5182c0
    public io.sentry.protocol.x a(A3 a32, Y y10, H h10) {
        io.sentry.util.w.c(a32, "SessionReplay is required.");
        if (h10 == null) {
            h10 = new H();
        }
        if (J(a32, h10)) {
            r(a32, y10);
        }
        ILogger logger = this.f50832b.getLogger();
        EnumC5215i3 enumC5215i3 = EnumC5215i3.DEBUG;
        logger.c(enumC5215i3, "Capturing session replay: %s", a32.G());
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f51153b;
        io.sentry.protocol.x xVarG = a32.G() != null ? a32.G() : xVar;
        A3 a3F = F(a32, h10, this.f50832b.getEventProcessors());
        if (a3F != null && (a3F = x(a3F, h10)) == null) {
            this.f50832b.getLogger().c(enumC5215i3, "Event was dropped by beforeSendReplay", new Object[0]);
            this.f50832b.getClientReportRecorder().a(io.sentry.clientreport.f.BEFORE_SEND, EnumC5221k.Replay);
        }
        if (a3F == null) {
            return xVar;
        }
        try {
            C5265q2 c5265q2V = v(a3F, h10.f(), C(y10, h10, a3F, null), io.sentry.util.l.f(h10, io.sentry.hints.c.class));
            h10.b();
            this.f50833c.e0(c5265q2V, h10);
            return xVarG;
        } catch (IOException e10) {
            this.f50832b.getLogger().a(EnumC5215i3.WARNING, e10, "Capturing event %s failed.", xVarG);
            return io.sentry.protocol.x.f51153b;
        }
    }

    @Override // io.sentry.InterfaceC5182c0
    public io.sentry.protocol.x b(io.sentry.protocol.E e10, f4 f4Var, Y y10, H h10, C5300v1 c5300v1) {
        io.sentry.util.w.c(e10, "Transaction is required.");
        if (h10 == null) {
            h10 = new H();
        }
        if (J(e10, h10)) {
            m(y10, h10);
        }
        ILogger logger = this.f50832b.getLogger();
        EnumC5215i3 enumC5215i3 = EnumC5215i3.DEBUG;
        logger.c(enumC5215i3, "Capturing transaction: %s", e10.G());
        if (io.sentry.util.H.f(this.f50832b.getIgnoredTransactions(), e10.p0())) {
            this.f50832b.getLogger().c(enumC5215i3, "Transaction was dropped as transaction name %s is ignored", e10.p0());
            io.sentry.clientreport.h clientReportRecorder = this.f50832b.getClientReportRecorder();
            io.sentry.clientreport.f fVar = io.sentry.clientreport.f.EVENT_PROCESSOR;
            clientReportRecorder.a(fVar, EnumC5221k.Transaction);
            this.f50832b.getClientReportRecorder().c(fVar, EnumC5221k.Span, e10.o0().size() + 1);
            return io.sentry.protocol.x.f51153b;
        }
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f51153b;
        io.sentry.protocol.x xVarG = e10.G() != null ? e10.G() : xVar;
        if (J(e10, h10)) {
            e10 = (io.sentry.protocol.E) p(e10, y10);
            if (e10 != null && y10 != null) {
                e10 = G(e10, h10, y10.Q());
            }
            if (e10 == null) {
                this.f50832b.getLogger().c(enumC5215i3, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (e10 != null) {
            e10 = G(e10, h10, this.f50832b.getEventProcessors());
        }
        if (e10 == null) {
            this.f50832b.getLogger().c(enumC5215i3, "Transaction was dropped by Event processors.", new Object[0]);
            return xVar;
        }
        int size = e10.o0().size();
        io.sentry.protocol.E eY = y(e10, h10);
        int size2 = eY == null ? 0 : eY.o0().size();
        if (eY == null) {
            this.f50832b.getLogger().c(enumC5215i3, "Transaction was dropped by beforeSendTransaction.", new Object[0]);
            io.sentry.clientreport.h clientReportRecorder2 = this.f50832b.getClientReportRecorder();
            io.sentry.clientreport.f fVar2 = io.sentry.clientreport.f.BEFORE_SEND;
            clientReportRecorder2.a(fVar2, EnumC5221k.Transaction);
            this.f50832b.getClientReportRecorder().c(fVar2, EnumC5221k.Span, size + 1);
            return xVar;
        }
        if (size2 < size) {
            int i10 = size - size2;
            this.f50832b.getLogger().c(enumC5215i3, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i10));
            this.f50832b.getClientReportRecorder().c(io.sentry.clientreport.f.BEFORE_SEND, EnumC5221k.Span, i10);
        }
        try {
            C5265q2 c5265q2S = s(eY, z(B(h10)), null, f4Var, c5300v1);
            h10.b();
            return c5265q2S != null ? I(c5265q2S, h10) : xVarG;
        } catch (io.sentry.exception.b | IOException e11) {
            this.f50832b.getLogger().a(EnumC5215i3.WARNING, e11, "Capturing transaction %s failed.", xVarG);
            return io.sentry.protocol.x.f51153b;
        }
    }

    @Override // io.sentry.InterfaceC5182c0
    public void c(boolean z10) {
        long shutdownTimeoutMillis;
        this.f50832b.getLogger().c(EnumC5215i3.INFO, "Closing SentryClient.", new Object[0]);
        if (z10) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = this.f50832b.getShutdownTimeoutMillis();
            } catch (IOException e10) {
                this.f50832b.getLogger().b(EnumC5215i3.WARNING, "Failed to close the connection to the Sentry Server.", e10);
            }
        }
        d(shutdownTimeoutMillis);
        this.f50835e.c(z10);
        this.f50836f.c(z10);
        this.f50833c.c(z10);
        for (C c10 : this.f50832b.getEventProcessors()) {
            if (c10 instanceof Closeable) {
                try {
                    ((Closeable) c10).close();
                } catch (IOException e11) {
                    this.f50832b.getLogger().c(EnumC5215i3.WARNING, "Failed to close the event processor {}.", c10, e11);
                }
            }
        }
        this.f50831a = false;
    }

    @Override // io.sentry.InterfaceC5182c0
    public void d(long j10) {
        this.f50835e.d(j10);
        this.f50836f.d(j10);
        this.f50833c.d(j10);
    }

    @Override // io.sentry.InterfaceC5182c0
    public void e(O3 o32, H h10) {
        io.sentry.util.w.c(o32, "Session is required.");
        if (o32.h() == null || o32.h().isEmpty()) {
            this.f50832b.getLogger().c(EnumC5215i3.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            o(C5265q2.a(this.f50832b.getSerializer(), o32, this.f50832b.getSdkVersion()), h10);
        } catch (IOException e10) {
            this.f50832b.getLogger().b(EnumC5215i3.ERROR, "Failed to capture session.", e10);
        }
    }

    @Override // io.sentry.InterfaceC5182c0
    public boolean f() {
        return this.f50833c.f();
    }

    @Override // io.sentry.InterfaceC5182c0
    public void g(C5235m3 c5235m3) {
        try {
            I(t(c5235m3), null);
        } catch (IOException e10) {
            this.f50832b.getLogger().a(EnumC5215i3.WARNING, e10, "Capturing logs failed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC5182c0
    public void h(C5266q3 c5266q3) {
        try {
            I(u(c5266q3), null);
        } catch (IOException e10) {
            this.f50832b.getLogger().a(EnumC5215i3.WARNING, e10, "Capturing metrics failed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC5182c0
    public io.sentry.protocol.x i(C5268r1 c5268r1, Y y10) {
        io.sentry.util.w.c(c5268r1, "profileChunk is required.");
        this.f50832b.getLogger().c(EnumC5215i3.DEBUG, "Capturing profile chunk: %s", c5268r1.n());
        io.sentry.protocol.x xVarN = c5268r1.n();
        C5254d c5254dC = C5254d.c(c5268r1.o(), this.f50832b);
        if (c5254dC != null) {
            c5268r1.r(c5254dC);
        }
        try {
            return I(new C5265q2(new C5269r2(xVarN, this.f50832b.getSdkVersion(), null), Collections.singletonList(T2.H(c5268r1, this.f50832b.getSerializer(), this.f50832b.getProfilerConverter()))), null);
        } catch (io.sentry.exception.b | IOException e10) {
            this.f50832b.getLogger().a(EnumC5215i3.WARNING, e10, "Capturing profile chunk %s failed.", xVarN);
            return io.sentry.protocol.x.f51153b;
        }
    }

    @Override // io.sentry.InterfaceC5182c0
    public boolean isEnabled() {
        return this.f50831a;
    }

    @Override // io.sentry.InterfaceC5182c0
    public io.sentry.protocol.x j(V2 v22, Y y10, H h10) {
        V2 v23;
        C5234m2 c5234m2;
        io.sentry.util.w.c(v22, "SentryEvent is required.");
        if (h10 == null) {
            h10 = new H();
        }
        if (J(v22, h10)) {
            m(y10, h10);
        }
        ILogger logger = this.f50832b.getLogger();
        EnumC5215i3 enumC5215i3 = EnumC5215i3.DEBUG;
        logger.c(enumC5215i3, "Capturing event: %s", v22.G());
        Throwable thO = v22.O();
        if (thO != null && AbstractC5295h.b(this.f50832b.getIgnoredExceptionsForType(), thO)) {
            this.f50832b.getLogger().c(enumC5215i3, "Event was dropped as the exception %s is ignored", thO.getClass());
            this.f50832b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, EnumC5221k.Error);
            return io.sentry.protocol.x.f51153b;
        }
        if (AbstractC5292e.a(this.f50832b.getIgnoredErrors(), v22)) {
            this.f50832b.getLogger().c(enumC5215i3, "Event was dropped as it matched a string/pattern in ignoredErrors", v22.s0());
            this.f50832b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, EnumC5221k.Error);
            return io.sentry.protocol.x.f51153b;
        }
        boolean z10 = false;
        if (J(v22, h10) && (v22 = q(v22, y10, h10)) == null) {
            this.f50832b.getLogger().c(enumC5215i3, "Event was dropped by applyScope", new Object[0]);
            return io.sentry.protocol.x.f51153b;
        }
        V2 v2E = E(v22, h10, this.f50832b.getEventProcessors());
        if (v2E != null && (v2E = w(v2E, h10)) == null) {
            this.f50832b.getLogger().c(enumC5215i3, "Event was dropped by beforeSend", new Object[0]);
            this.f50832b.getClientReportRecorder().a(io.sentry.clientreport.f.BEFORE_SEND, EnumC5221k.Error);
        }
        if (v2E != null) {
            v2E = AbstractC5294g.b(v2E, h10, this.f50832b);
        }
        if (v2E == null) {
            return io.sentry.protocol.x.f51153b;
        }
        O3 o3S = y10 != null ? y10.s(new E1.b() { // from class: io.sentry.k2
            @Override // io.sentry.E1.b
            public final void a(O3 o32) {
                C5234m2.k(o32);
            }
        }) : null;
        O3 o3M = (o3S == null || !o3S.m()) ? M(v2E, h10, y10) : null;
        if (H()) {
            v23 = v2E;
        } else {
            this.f50832b.getLogger().c(enumC5215i3, "Event %s was dropped due to sampling decision.", v2E.G());
            this.f50832b.getClientReportRecorder().a(io.sentry.clientreport.f.SAMPLE_RATE, EnumC5221k.Error);
            v23 = null;
        }
        boolean zK = K(o3S, o3M);
        if (v23 == null && !zK) {
            this.f50832b.getLogger().c(enumC5215i3, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
            return io.sentry.protocol.x.f51153b;
        }
        io.sentry.protocol.x xVarI = io.sentry.protocol.x.f51153b;
        if (v23 != null && v23.G() != null) {
            xVarI = v23.G();
        }
        boolean zF = io.sentry.util.l.f(h10, io.sentry.hints.c.class);
        if (io.sentry.util.l.f(h10, io.sentry.hints.e.class) && !io.sentry.util.l.f(h10, io.sentry.hints.b.class)) {
            z10 = true;
        }
        if (v23 != null && !zF && !z10 && (v23.z0() || v23.y0())) {
            this.f50832b.getReplayController().l(Boolean.valueOf(v23.y0()));
        }
        try {
            c5234m2 = this;
            try {
                C5265q2 c5265q2S = c5234m2.s(v23, v23 != null ? B(h10) : null, o3M, D(y10, h10, v23), null);
                h10.b();
                if (c5265q2S != null) {
                    xVarI = I(c5265q2S, h10);
                }
            } catch (io.sentry.exception.b e10) {
                e = e10;
                c5234m2.f50832b.getLogger().a(EnumC5215i3.WARNING, e, "Capturing event %s failed.", xVarI);
                xVarI = io.sentry.protocol.x.f51153b;
            } catch (IOException e11) {
                e = e11;
                c5234m2.f50832b.getLogger().a(EnumC5215i3.WARNING, e, "Capturing event %s failed.", xVarI);
                xVarI = io.sentry.protocol.x.f51153b;
            }
        } catch (io.sentry.exception.b | IOException e12) {
            e = e12;
            c5234m2 = this;
        }
        if (y10 != null) {
            A(y10, h10);
        }
        return xVarI;
    }

    @Override // io.sentry.InterfaceC5182c0
    public io.sentry.transport.z n() {
        return this.f50833c.n();
    }

    @Override // io.sentry.InterfaceC5182c0
    public io.sentry.protocol.x o(C5265q2 c5265q2, H h10) {
        io.sentry.util.w.c(c5265q2, "SentryEnvelope is required.");
        if (h10 == null) {
            h10 = new H();
        }
        try {
            h10.b();
            return I(c5265q2, h10);
        } catch (IOException e10) {
            this.f50832b.getLogger().b(EnumC5215i3.ERROR, "Failed to capture envelope.", e10);
            return io.sentry.protocol.x.f51153b;
        }
    }

    public static /* synthetic */ void k(O3 o32) {
    }
}
