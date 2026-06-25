package io.sentry.android.replay.capture;

import Df.r;
import Td.L;
import android.graphics.Bitmap;
import io.sentry.A3;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.G1;
import io.sentry.InterfaceC5114a0;
import io.sentry.Y;
import io.sentry.android.replay.capture.h;
import io.sentry.android.replay.s;
import io.sentry.protocol.x;
import io.sentry.transport.o;
import io.sentry.util.AbstractC5296i;
import java.io.File;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends io.sentry.android.replay.capture.a {

    /* JADX INFO: renamed from: y */
    public static final a f50270y = new a(null);

    /* JADX INFO: renamed from: z */
    public static final int f50271z = 8;

    /* JADX INFO: renamed from: v */
    private final C5322z3 f50272v;

    /* JADX INFO: renamed from: w */
    private final InterfaceC5114a0 f50273w;

    /* JADX INFO: renamed from: x */
    private final o f50274x;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {
        b() {
            super(1);
        }

        public final void a(h.c segment) {
            AbstractC5504s.h(segment, "segment");
            if (segment instanceof h.c.a) {
                h.c.a aVar = (h.c.a) segment;
                h.c.a.b(aVar, m.this.f50273w, null, 2, null);
                m mVar = m.this;
                mVar.c(mVar.d() + 1);
                m.this.j(aVar.c().g0());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h.c) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {
        c() {
            super(1);
        }

        public final void a(h.c segment) {
            AbstractC5504s.h(segment, "segment");
            if (segment instanceof h.c.a) {
                h.c.a.b((h.c.a) segment, m.this.f50273w, null, 2, null);
                m mVar = m.this;
                mVar.c(mVar.d() + 1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h.c) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ File f50278b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(File file) {
            super(1);
            this.f50278b = file;
        }

        public final void a(h.c segment) {
            AbstractC5504s.h(segment, "segment");
            if (segment instanceof h.c.a) {
                h.c.a.b((h.c.a) segment, m.this.f50273w, null, 2, null);
            }
            m.this.c(-1);
            AbstractC5296i.a(this.f50278b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h.c) obj);
            return L.f17438a;
        }
    }

    public /* synthetic */ m(C5322z3 c5322z3, InterfaceC5114a0 interfaceC5114a0, o oVar, ScheduledExecutorService scheduledExecutorService, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c5322z3, interfaceC5114a0, oVar, scheduledExecutorService, (i10 & 16) != 0 ? null : function1);
    }

    private final void I(String str, final Function1 function1) {
        final s sVarS = s();
        if (sVarS == null) {
            this.f50272v.getLogger().c(EnumC5215i3.DEBUG, "Recorder config is not set, not creating segment for task: " + str, new Object[0]);
            return;
        }
        long currentTimeMillis = this.f50274x.getCurrentTimeMillis();
        final Date dateX = x();
        if (dateX == null) {
            return;
        }
        final long time = currentTimeMillis - dateX.getTime();
        final x xVarA = a();
        t().submit(new io.sentry.android.replay.util.m("SessionCaptureStrategy." + str, new Runnable() { // from class: io.sentry.android.replay.capture.i
            @Override // java.lang.Runnable
            public final void run() {
                m.J(this.f50259a, time, dateX, xVarA, sVarS, function1);
            }
        }));
    }

    public static final void J(m mVar, long j10, Date date, x xVar, s sVar, Function1 function1) {
        function1.invoke(io.sentry.android.replay.capture.a.n(mVar, j10, date, xVar, mVar.d(), sVar.c(), sVar.d(), sVar.b(), sVar.a(), null, null, null, null, null, 7936, null));
    }

    public static final void K(m mVar, Function2 function2, long j10, s sVar) {
        io.sentry.android.replay.i iVarO = mVar.o();
        if (iVarO != null) {
            function2.invoke(iVarO, Long.valueOf(j10));
        }
        Date dateX = mVar.x();
        if (dateX == null) {
            mVar.f50272v.getLogger().c(EnumC5215i3.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
            return;
        }
        if (mVar.y().get()) {
            mVar.f50272v.getLogger().c(EnumC5215i3.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
            return;
        }
        if (sVar == null) {
            mVar.f50272v.getLogger().c(EnumC5215i3.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
            return;
        }
        long currentTimeMillis = mVar.f50274x.getCurrentTimeMillis();
        if (currentTimeMillis - dateX.getTime() >= mVar.f50272v.getSessionReplay().r()) {
            h.c cVarN = io.sentry.android.replay.capture.a.n(mVar, mVar.f50272v.getSessionReplay().r(), dateX, mVar.a(), mVar.d(), sVar.c(), sVar.d(), sVar.b(), sVar.a(), null, null, null, null, null, 7936, null);
            if (cVarN instanceof h.c.a) {
                h.c.a aVar = (h.c.a) cVarN;
                h.c.a.b(aVar, mVar.f50273w, null, 2, null);
                mVar.c(mVar.d() + 1);
                mVar.j(aVar.c().g0());
            }
        }
        if (currentTimeMillis - mVar.u().get() >= mVar.f50272v.getSessionReplay().p()) {
            mVar.f50272v.getReplayController().stop();
            mVar.f50272v.getLogger().c(EnumC5215i3.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
        }
    }

    public static final void L(m mVar, Y it) {
        AbstractC5504s.h(it, "it");
        it.o(mVar.a());
        String strK = it.k();
        mVar.C(strK != null ? r.Z0(strK, com.amazon.a.a.o.c.a.b.f34706a, null, 2, null) : null);
    }

    public static final void M(Y it) {
        AbstractC5504s.h(it, "it");
        it.o(x.f51153b);
    }

    @Override // io.sentry.android.replay.capture.h
    public void e(boolean z10, Function1 onSegmentSent) {
        AbstractC5504s.h(onSegmentSent, "onSegmentSent");
        if (this.f50272v.getSessionReplay().u()) {
            this.f50272v.getLogger().c(EnumC5215i3.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        y().set(z10);
    }

    @Override // io.sentry.android.replay.capture.h
    public void f(Bitmap bitmap, final Function2 store) {
        AbstractC5504s.h(store, "store");
        final s sVarS = s();
        final long currentTimeMillis = this.f50274x.getCurrentTimeMillis();
        t().submit(new io.sentry.android.replay.util.m("SessionCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.l
            @Override // java.lang.Runnable
            public final void run() {
                m.K(this.f50266a, store, currentTimeMillis, sVarS);
            }
        }));
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void h(int i10, x replayId, A3.b bVar) {
        AbstractC5504s.h(replayId, "replayId");
        super.h(i10, replayId, bVar);
        InterfaceC5114a0 interfaceC5114a0 = this.f50273w;
        if (interfaceC5114a0 != null) {
            interfaceC5114a0.r(new G1() { // from class: io.sentry.android.replay.capture.j
                @Override // io.sentry.G1
                public final void a(Y y10) {
                    m.L(this.f50265a, y10);
                }
            });
        }
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void pause() {
        I("pause", new c());
        super.pause();
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void r(s recorderConfig) {
        AbstractC5504s.h(recorderConfig, "recorderConfig");
        I("onConfigurationChanged", new b());
        super.r(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void stop() throws Exception {
        io.sentry.android.replay.i iVarO = o();
        I("stop", new d(iVarO != null ? iVarO.D() : null));
        InterfaceC5114a0 interfaceC5114a0 = this.f50273w;
        if (interfaceC5114a0 != null) {
            interfaceC5114a0.r(new G1() { // from class: io.sentry.android.replay.capture.k
                @Override // io.sentry.G1
                public final void a(Y y10) {
                    m.M(y10);
                }
            });
        }
        super.stop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C5322z3 options, InterfaceC5114a0 interfaceC5114a0, o dateProvider, ScheduledExecutorService executor, Function1 function1) {
        super(options, interfaceC5114a0, dateProvider, executor, function1);
        AbstractC5504s.h(options, "options");
        AbstractC5504s.h(dateProvider, "dateProvider");
        AbstractC5504s.h(executor, "executor");
        this.f50272v = options;
        this.f50273w = interfaceC5114a0;
        this.f50274x = dateProvider;
    }

    @Override // io.sentry.android.replay.capture.h
    public h g() {
        return this;
    }
}
