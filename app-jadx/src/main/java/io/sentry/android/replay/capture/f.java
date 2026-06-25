package io.sentry.android.replay.capture;

import Td.L;
import Ud.AbstractC2279u;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import io.sentry.A3;
import io.sentry.AbstractC5226l;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.G1;
import io.sentry.InterfaceC5114a0;
import io.sentry.Y;
import io.sentry.android.replay.capture.h;
import io.sentry.android.replay.s;
import io.sentry.android.replay.util.n;
import io.sentry.protocol.x;
import io.sentry.transport.o;
import io.sentry.util.AbstractC5296i;
import io.sentry.util.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.J;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends io.sentry.android.replay.capture.a {

    /* JADX INFO: renamed from: A */
    public static final a f50237A = new a(null);

    /* JADX INFO: renamed from: B */
    public static final int f50238B = 8;

    /* JADX INFO: renamed from: v */
    private final C5322z3 f50239v;

    /* JADX INFO: renamed from: w */
    private final InterfaceC5114a0 f50240w;

    /* JADX INFO: renamed from: x */
    private final o f50241x;

    /* JADX INFO: renamed from: y */
    private final z f50242y;

    /* JADX INFO: renamed from: z */
    private final List f50243z;

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

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function1 f50245b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function1 function1) {
            super(1);
            this.f50245b = function1;
        }

        public final void a(h.c segment) throws InterruptedException {
            AbstractC5504s.h(segment, "segment");
            f fVar = f.this;
            fVar.L(fVar.f50243z);
            if (segment instanceof h.c.a) {
                h.c.a aVar = (h.c.a) segment;
                h.c.a.b(aVar, f.this.f50240w, null, 2, null);
                Function1 function1 = this.f50245b;
                Date dateG0 = aVar.c().g0();
                AbstractC5504s.g(dateG0, "getTimestamp(...)");
                function1.invoke(dateG0);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws InterruptedException {
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
                f.this.f50243z.add(segment);
                f fVar = f.this;
                fVar.c(fVar.d() + 1);
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
        d() {
            super(1);
        }

        public final void a(h.c segment) {
            AbstractC5504s.h(segment, "segment");
            if (segment instanceof h.c.a) {
                f.this.f50243z.add(segment);
                f fVar = f.this;
                fVar.c(fVar.d() + 1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h.c) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f50248a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ f f50249b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ J f50250c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, f fVar, J j11) {
            super(1);
            this.f50248a = j10;
            this.f50249b = fVar;
            this.f50250c = j11;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Boolean invoke(h.c.a it) {
            AbstractC5504s.h(it, "it");
            if (it.c().g0().getTime() >= this.f50248a) {
                return Boolean.FALSE;
            }
            this.f50249b.c(r0.d() - 1);
            this.f50249b.P(it.c().h0());
            this.f50250c.f52255a = true;
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C5322z3 options, InterfaceC5114a0 interfaceC5114a0, o dateProvider, z random, ScheduledExecutorService executor, Function1 function1) {
        super(options, interfaceC5114a0, dateProvider, executor, function1);
        AbstractC5504s.h(options, "options");
        AbstractC5504s.h(dateProvider, "dateProvider");
        AbstractC5504s.h(random, "random");
        AbstractC5504s.h(executor, "executor");
        this.f50239v = options;
        this.f50240w = interfaceC5114a0;
        this.f50241x = dateProvider;
        this.f50242y = random;
        this.f50243z = new ArrayList();
    }

    public final void L(List list) throws InterruptedException {
        h.c.a aVar = (h.c.a) AbstractC2279u.L(list);
        while (aVar != null) {
            h.c.a.b(aVar, this.f50240w, null, 2, null);
            aVar = (h.c.a) AbstractC2279u.L(list);
            Thread.sleep(100L);
        }
    }

    public static final void M(f fVar, Y it) {
        AbstractC5504s.h(it, "it");
        it.o(fVar.a());
    }

    private final void N(String str, final Function1 function1) {
        final Date dateE;
        Long lW;
        final s sVarS = s();
        if (sVarS == null) {
            this.f50239v.getLogger().c(EnumC5215i3.DEBUG, "Recorder config is not set, not creating segment for task: " + str, new Object[0]);
            return;
        }
        long jC = this.f50239v.getSessionReplay().c();
        long currentTimeMillis = this.f50241x.getCurrentTimeMillis();
        io.sentry.android.replay.i iVarO = o();
        if (iVarO == null || (lW = iVarO.w()) == null || (dateE = AbstractC5226l.e(lW.longValue())) == null) {
            dateE = AbstractC5226l.e(currentTimeMillis - jC);
        }
        AbstractC5504s.e(dateE);
        final long time = currentTimeMillis - dateE.getTime();
        final x xVarA = a();
        t().submit(new io.sentry.android.replay.util.m("BufferCaptureStrategy." + str, new Runnable() { // from class: io.sentry.android.replay.capture.b
            @Override // java.lang.Runnable
            public final void run() {
                f.O(this.f50225a, time, dateE, xVarA, sVarS, function1);
            }
        }));
    }

    public static final void O(f fVar, long j10, Date date, x xVar, s sVar, Function1 function1) {
        function1.invoke(io.sentry.android.replay.capture.a.n(fVar, j10, date, xVar, fVar.d(), sVar.c(), sVar.d(), sVar.b(), sVar.a(), null, null, null, null, null, 7936, null));
    }

    public final void P(File file) {
        if (file == null) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            this.f50239v.getLogger().c(EnumC5215i3.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
        } catch (Throwable th2) {
            this.f50239v.getLogger().a(EnumC5215i3.ERROR, th2, "Failed to delete replay segment: %s", file.getAbsolutePath());
        }
    }

    public static final void Q(f fVar, Function2 function2, long j10) {
        io.sentry.android.replay.i iVarO = fVar.o();
        if (iVarO != null) {
            function2.invoke(iVarO, Long.valueOf(j10));
        }
        long currentTimeMillis = fVar.f50241x.getCurrentTimeMillis() - fVar.f50239v.getSessionReplay().c();
        io.sentry.android.replay.i iVarO2 = fVar.o();
        fVar.C(iVarO2 != null ? iVarO2.H(currentTimeMillis) : null);
        fVar.R(fVar.f50243z, currentTimeMillis);
    }

    private final void R(List list, long j10) {
        J j11 = new J();
        AbstractC2279u.K(list, new e(j10, this, j11));
        if (j11.f52255a) {
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC2279u.w();
                }
                ((h.c.a) obj).d(i10);
                i10 = i11;
            }
        }
    }

    public static final void S(File file, f fVar) {
        AbstractC5296i.a(file);
        fVar.c(-1);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void b(MotionEvent event) {
        AbstractC5504s.h(event, "event");
        super.b(event);
        h.a.h(h.f50252a, p(), this.f50241x.getCurrentTimeMillis() - this.f50239v.getSessionReplay().c(), null, 4, null);
    }

    @Override // io.sentry.android.replay.capture.h
    public void e(boolean z10, Function1 onSegmentSent) {
        AbstractC5504s.h(onSegmentSent, "onSegmentSent");
        if (!n.a(this.f50242y, this.f50239v.getSessionReplay().l())) {
            this.f50239v.getLogger().c(EnumC5215i3.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        InterfaceC5114a0 interfaceC5114a0 = this.f50240w;
        if (interfaceC5114a0 != null) {
            interfaceC5114a0.r(new G1() { // from class: io.sentry.android.replay.capture.c
                @Override // io.sentry.G1
                public final void a(Y y10) {
                    f.M(this.f50231a, y10);
                }
            });
        }
        if (!z10) {
            N("capture_replay", new b(onSegmentSent));
        } else {
            y().set(true);
            this.f50239v.getLogger().c(EnumC5215i3.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.h
    public void f(Bitmap bitmap, final Function2 store) {
        AbstractC5504s.h(store, "store");
        final long currentTimeMillis = this.f50241x.getCurrentTimeMillis();
        t().submit(new io.sentry.android.replay.util.m("BufferCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.e
            @Override // java.lang.Runnable
            public final void run() {
                f.Q(this.f50234a, store, currentTimeMillis);
            }
        }));
    }

    @Override // io.sentry.android.replay.capture.h
    public h g() {
        if (y().get()) {
            this.f50239v.getLogger().c(EnumC5215i3.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        m mVar = new m(this.f50239v, this.f50240w, this.f50241x, t(), null, 16, null);
        mVar.A(s());
        mVar.h(d(), a(), A3.b.BUFFER);
        return mVar;
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void pause() {
        N("pause", new d());
        super.pause();
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void r(s recorderConfig) {
        AbstractC5504s.h(recorderConfig, "recorderConfig");
        N("configuration_changed", new c());
        super.r(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void stop() throws Exception {
        io.sentry.android.replay.i iVarO = o();
        final File fileD = iVarO != null ? iVarO.D() : null;
        t().submit(new io.sentry.android.replay.util.m("BufferCaptureStrategy.stop", new Runnable() { // from class: io.sentry.android.replay.capture.d
            @Override // java.lang.Runnable
            public final void run() {
                f.S(fileD, this);
            }
        }));
        super.stop();
    }
}
