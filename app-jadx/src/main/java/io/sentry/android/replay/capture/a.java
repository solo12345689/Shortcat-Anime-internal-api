package io.sentry.android.replay.capture;

import Td.AbstractC2163n;
import Td.L;
import Ud.AbstractC2279u;
import android.view.MotionEvent;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import ie.InterfaceC5082a;
import io.sentry.A3;
import io.sentry.AbstractC5226l;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.InterfaceC5114a0;
import io.sentry.android.replay.capture.h;
import io.sentry.android.replay.s;
import io.sentry.protocol.x;
import io.sentry.transport.o;
import java.util.Date;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.z;
import le.InterfaceC5593d;
import pe.InterfaceC6023m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements io.sentry.android.replay.capture.h {

    /* JADX INFO: renamed from: b */
    private final C5322z3 f50144b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC5114a0 f50145c;

    /* JADX INFO: renamed from: d */
    private final o f50146d;

    /* JADX INFO: renamed from: e */
    private final ScheduledExecutorService f50147e;

    /* JADX INFO: renamed from: f */
    private final Function1 f50148f;

    /* JADX INFO: renamed from: g */
    private final Lazy f50149g;

    /* JADX INFO: renamed from: h */
    private final io.sentry.android.replay.gestures.b f50150h;

    /* JADX INFO: renamed from: i */
    private final AtomicBoolean f50151i;

    /* JADX INFO: renamed from: j */
    private io.sentry.android.replay.i f50152j;

    /* JADX INFO: renamed from: k */
    private final InterfaceC5593d f50153k;

    /* JADX INFO: renamed from: l */
    private final InterfaceC5593d f50154l;

    /* JADX INFO: renamed from: m */
    private final AtomicLong f50155m;

    /* JADX INFO: renamed from: n */
    private final InterfaceC5593d f50156n;

    /* JADX INFO: renamed from: o */
    private final InterfaceC5593d f50157o;

    /* JADX INFO: renamed from: p */
    private final InterfaceC5593d f50158p;

    /* JADX INFO: renamed from: q */
    private final InterfaceC5593d f50159q;

    /* JADX INFO: renamed from: r */
    private final Deque f50160r;

    /* JADX INFO: renamed from: t */
    static final /* synthetic */ InterfaceC6023m[] f50142t = {O.e(new z(a.class, "recorderConfig", "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0)), O.e(new z(a.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0)), O.e(new z(a.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0)), O.e(new z(a.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0)), O.e(new z(a.class, "currentSegment", "getCurrentSegment()I", 0)), O.e(new z(a.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0))};

    /* JADX INFO: renamed from: s */
    public static final C0783a f50141s = new C0783a(null);

    /* JADX INFO: renamed from: u */
    public static final int f50143u = 8;

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0783a {
        public /* synthetic */ C0783a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0783a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private int f50161a;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r10) {
            AbstractC5504s.h(r10, "r");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryReplayPersister-");
            int i10 = this.f50161a;
            this.f50161a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(r10, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {
        c() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final io.sentry.android.replay.util.l invoke() {
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new b());
            AbstractC5504s.e(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
            return new io.sentry.android.replay.util.l(scheduledExecutorServiceNewSingleThreadScheduledExecutor, a.this.f50144b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements InterfaceC5593d {

        /* JADX INFO: renamed from: a */
        private final AtomicReference f50163a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ a f50164b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f50165c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ a f50166d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f50167e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$d$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class RunnableC0784a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC5082a f50168a;

            public RunnableC0784a(InterfaceC5082a interfaceC5082a) {
                this.f50168a = interfaceC5082a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f50168a.invoke();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f50169a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Object f50170b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ Object f50171c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ a f50172d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ String f50173e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f50169a = str;
                this.f50170b = obj;
                this.f50171c = obj2;
                this.f50172d = aVar;
                this.f50173e = str2;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                m953invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m953invoke() throws Exception {
                Object obj = this.f50171c;
                io.sentry.android.replay.i iVarO = this.f50172d.o();
                if (iVarO != null) {
                    iVarO.E(this.f50173e, String.valueOf(obj));
                }
            }
        }

        public d(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f50164b = aVar;
            this.f50165c = str;
            this.f50166d = aVar2;
            this.f50167e = str2;
            this.f50163a = new AtomicReference(obj);
        }

        private final void c(InterfaceC5082a interfaceC5082a) {
            if (this.f50164b.f50144b.getThreadChecker().a()) {
                this.f50164b.q().submit(new io.sentry.android.replay.util.m("CaptureStrategy.runInBackground", new RunnableC0784a(interfaceC5082a)));
                return;
            }
            try {
                interfaceC5082a.invoke();
            } catch (Throwable th2) {
                this.f50164b.f50144b.getLogger().b(EnumC5215i3.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // le.InterfaceC5593d, le.InterfaceC5592c
        public Object a(Object obj, InterfaceC6023m property) {
            AbstractC5504s.h(property, "property");
            return this.f50163a.get();
        }

        @Override // le.InterfaceC5593d
        public void b(Object obj, InterfaceC6023m property, Object obj2) {
            AbstractC5504s.h(property, "property");
            Object andSet = this.f50163a.getAndSet(obj2);
            if (AbstractC5504s.c(andSet, obj2)) {
                return;
            }
            c(new b(this.f50165c, andSet, obj2, this.f50166d, this.f50167e));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements InterfaceC5593d {

        /* JADX INFO: renamed from: a */
        private final AtomicReference f50174a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ a f50175b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f50176c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ a f50177d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f50178e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$e$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class RunnableC0785a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC5082a f50179a;

            public RunnableC0785a(InterfaceC5082a interfaceC5082a) {
                this.f50179a = interfaceC5082a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f50179a.invoke();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f50180a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Object f50181b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ Object f50182c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ a f50183d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ String f50184e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f50180a = str;
                this.f50181b = obj;
                this.f50182c = obj2;
                this.f50183d = aVar;
                this.f50184e = str2;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                m954invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m954invoke() throws Exception {
                Object obj = this.f50182c;
                io.sentry.android.replay.i iVarO = this.f50183d.o();
                if (iVarO != null) {
                    iVarO.E(this.f50184e, String.valueOf(obj));
                }
            }
        }

        public e(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f50175b = aVar;
            this.f50176c = str;
            this.f50177d = aVar2;
            this.f50178e = str2;
            this.f50174a = new AtomicReference(obj);
        }

        private final void c(InterfaceC5082a interfaceC5082a) {
            if (this.f50175b.f50144b.getThreadChecker().a()) {
                this.f50175b.q().submit(new io.sentry.android.replay.util.m("CaptureStrategy.runInBackground", new RunnableC0785a(interfaceC5082a)));
                return;
            }
            try {
                interfaceC5082a.invoke();
            } catch (Throwable th2) {
                this.f50175b.f50144b.getLogger().b(EnumC5215i3.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // le.InterfaceC5593d, le.InterfaceC5592c
        public Object a(Object obj, InterfaceC6023m property) {
            AbstractC5504s.h(property, "property");
            return this.f50174a.get();
        }

        @Override // le.InterfaceC5593d
        public void b(Object obj, InterfaceC6023m property, Object obj2) {
            AbstractC5504s.h(property, "property");
            Object andSet = this.f50174a.getAndSet(obj2);
            if (AbstractC5504s.c(andSet, obj2)) {
                return;
            }
            c(new b(this.f50176c, andSet, obj2, this.f50177d, this.f50178e));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements InterfaceC5593d {

        /* JADX INFO: renamed from: a */
        private final AtomicReference f50185a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ a f50186b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f50187c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ a f50188d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f50189e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$f$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class RunnableC0786a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC5082a f50190a;

            public RunnableC0786a(InterfaceC5082a interfaceC5082a) {
                this.f50190a = interfaceC5082a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f50190a.invoke();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f50191a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Object f50192b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ Object f50193c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ a f50194d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ String f50195e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f50191a = str;
                this.f50192b = obj;
                this.f50193c = obj2;
                this.f50194d = aVar;
                this.f50195e = str2;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                m955invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m955invoke() throws Exception {
                Object obj = this.f50193c;
                io.sentry.android.replay.i iVarO = this.f50194d.o();
                if (iVarO != null) {
                    iVarO.E(this.f50195e, String.valueOf(obj));
                }
            }
        }

        public f(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f50186b = aVar;
            this.f50187c = str;
            this.f50188d = aVar2;
            this.f50189e = str2;
            this.f50185a = new AtomicReference(obj);
        }

        private final void c(InterfaceC5082a interfaceC5082a) {
            if (this.f50186b.f50144b.getThreadChecker().a()) {
                this.f50186b.q().submit(new io.sentry.android.replay.util.m("CaptureStrategy.runInBackground", new RunnableC0786a(interfaceC5082a)));
                return;
            }
            try {
                interfaceC5082a.invoke();
            } catch (Throwable th2) {
                this.f50186b.f50144b.getLogger().b(EnumC5215i3.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // le.InterfaceC5593d, le.InterfaceC5592c
        public Object a(Object obj, InterfaceC6023m property) {
            AbstractC5504s.h(property, "property");
            return this.f50185a.get();
        }

        @Override // le.InterfaceC5593d
        public void b(Object obj, InterfaceC6023m property, Object obj2) {
            AbstractC5504s.h(property, "property");
            Object andSet = this.f50185a.getAndSet(obj2);
            if (AbstractC5504s.c(andSet, obj2)) {
                return;
            }
            c(new b(this.f50187c, andSet, obj2, this.f50188d, this.f50189e));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements InterfaceC5593d {

        /* JADX INFO: renamed from: a */
        private final AtomicReference f50196a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ a f50197b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f50198c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ a f50199d;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$g$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class RunnableC0787a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC5082a f50200a;

            public RunnableC0787a(InterfaceC5082a interfaceC5082a) {
                this.f50200a = interfaceC5082a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f50200a.invoke();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f50201a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Object f50202b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ Object f50203c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ a f50204d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar) {
                super(0);
                this.f50201a = str;
                this.f50202b = obj;
                this.f50203c = obj2;
                this.f50204d = aVar;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                m956invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m956invoke() throws Exception {
                Object obj = this.f50202b;
                s sVar = (s) this.f50203c;
                if (sVar == null) {
                    return;
                }
                io.sentry.android.replay.i iVarO = this.f50204d.o();
                if (iVarO != null) {
                    iVarO.E("config.height", String.valueOf(sVar.c()));
                }
                io.sentry.android.replay.i iVarO2 = this.f50204d.o();
                if (iVarO2 != null) {
                    iVarO2.E("config.width", String.valueOf(sVar.d()));
                }
                io.sentry.android.replay.i iVarO3 = this.f50204d.o();
                if (iVarO3 != null) {
                    iVarO3.E("config.frame-rate", String.valueOf(sVar.b()));
                }
                io.sentry.android.replay.i iVarO4 = this.f50204d.o();
                if (iVarO4 != null) {
                    iVarO4.E("config.bit-rate", String.valueOf(sVar.a()));
                }
            }
        }

        public g(Object obj, a aVar, String str, a aVar2) {
            this.f50197b = aVar;
            this.f50198c = str;
            this.f50199d = aVar2;
            this.f50196a = new AtomicReference(obj);
        }

        private final void c(InterfaceC5082a interfaceC5082a) {
            if (this.f50197b.f50144b.getThreadChecker().a()) {
                this.f50197b.q().submit(new io.sentry.android.replay.util.m("CaptureStrategy.runInBackground", new RunnableC0787a(interfaceC5082a)));
                return;
            }
            try {
                interfaceC5082a.invoke();
            } catch (Throwable th2) {
                this.f50197b.f50144b.getLogger().b(EnumC5215i3.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // le.InterfaceC5593d, le.InterfaceC5592c
        public Object a(Object obj, InterfaceC6023m property) {
            AbstractC5504s.h(property, "property");
            return this.f50196a.get();
        }

        @Override // le.InterfaceC5593d
        public void b(Object obj, InterfaceC6023m property, Object obj2) {
            AbstractC5504s.h(property, "property");
            Object andSet = this.f50196a.getAndSet(obj2);
            if (AbstractC5504s.c(andSet, obj2)) {
                return;
            }
            c(new b(this.f50198c, andSet, obj2, this.f50199d));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements InterfaceC5593d {

        /* JADX INFO: renamed from: a */
        private final AtomicReference f50205a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ a f50206b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f50207c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ a f50208d;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$h$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class RunnableC0788a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC5082a f50209a;

            public RunnableC0788a(InterfaceC5082a interfaceC5082a) {
                this.f50209a = interfaceC5082a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f50209a.invoke();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f50210a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Object f50211b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ Object f50212c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ a f50213d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar) {
                super(0);
                this.f50210a = str;
                this.f50211b = obj;
                this.f50212c = obj2;
                this.f50213d = aVar;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                m957invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m957invoke() throws Exception {
                Object obj = this.f50211b;
                Date date = (Date) this.f50212c;
                io.sentry.android.replay.i iVarO = this.f50213d.o();
                if (iVarO != null) {
                    iVarO.E("segment.timestamp", date == null ? null : AbstractC5226l.h(date));
                }
            }
        }

        public h(Object obj, a aVar, String str, a aVar2) {
            this.f50206b = aVar;
            this.f50207c = str;
            this.f50208d = aVar2;
            this.f50205a = new AtomicReference(obj);
        }

        private final void c(InterfaceC5082a interfaceC5082a) {
            if (this.f50206b.f50144b.getThreadChecker().a()) {
                this.f50206b.q().submit(new io.sentry.android.replay.util.m("CaptureStrategy.runInBackground", new RunnableC0788a(interfaceC5082a)));
                return;
            }
            try {
                interfaceC5082a.invoke();
            } catch (Throwable th2) {
                this.f50206b.f50144b.getLogger().b(EnumC5215i3.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // le.InterfaceC5593d, le.InterfaceC5592c
        public Object a(Object obj, InterfaceC6023m property) {
            AbstractC5504s.h(property, "property");
            return this.f50205a.get();
        }

        @Override // le.InterfaceC5593d
        public void b(Object obj, InterfaceC6023m property, Object obj2) {
            AbstractC5504s.h(property, "property");
            Object andSet = this.f50205a.getAndSet(obj2);
            if (AbstractC5504s.c(andSet, obj2)) {
                return;
            }
            c(new b(this.f50207c, andSet, obj2, this.f50208d));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i implements InterfaceC5593d {

        /* JADX INFO: renamed from: a */
        private final AtomicReference f50214a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ a f50215b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f50216c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ a f50217d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f50218e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$i$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class RunnableC0789a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC5082a f50219a;

            public RunnableC0789a(InterfaceC5082a interfaceC5082a) {
                this.f50219a = interfaceC5082a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f50219a.invoke();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f50220a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Object f50221b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ Object f50222c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ a f50223d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ String f50224e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f50220a = str;
                this.f50221b = obj;
                this.f50222c = obj2;
                this.f50223d = aVar;
                this.f50224e = str2;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                m958invoke();
                return L.f17438a;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m958invoke() throws Exception {
                Object obj = this.f50222c;
                io.sentry.android.replay.i iVarO = this.f50223d.o();
                if (iVarO != null) {
                    iVarO.E(this.f50224e, String.valueOf(obj));
                }
            }
        }

        public i(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f50215b = aVar;
            this.f50216c = str;
            this.f50217d = aVar2;
            this.f50218e = str2;
            this.f50214a = new AtomicReference(obj);
        }

        private final void c(InterfaceC5082a interfaceC5082a) {
            if (this.f50215b.f50144b.getThreadChecker().a()) {
                this.f50215b.q().submit(new io.sentry.android.replay.util.m("CaptureStrategy.runInBackground", new RunnableC0789a(interfaceC5082a)));
                return;
            }
            try {
                interfaceC5082a.invoke();
            } catch (Throwable th2) {
                this.f50215b.f50144b.getLogger().b(EnumC5215i3.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // le.InterfaceC5593d, le.InterfaceC5592c
        public Object a(Object obj, InterfaceC6023m property) {
            AbstractC5504s.h(property, "property");
            return this.f50214a.get();
        }

        @Override // le.InterfaceC5593d
        public void b(Object obj, InterfaceC6023m property, Object obj2) {
            AbstractC5504s.h(property, "property");
            Object andSet = this.f50214a.getAndSet(obj2);
            if (AbstractC5504s.c(andSet, obj2)) {
                return;
            }
            c(new b(this.f50216c, andSet, obj2, this.f50217d, this.f50218e));
        }
    }

    public a(C5322z3 options, InterfaceC5114a0 interfaceC5114a0, o dateProvider, ScheduledExecutorService replayExecutor, Function1 function1) {
        AbstractC5504s.h(options, "options");
        AbstractC5504s.h(dateProvider, "dateProvider");
        AbstractC5504s.h(replayExecutor, "replayExecutor");
        this.f50144b = options;
        this.f50145c = interfaceC5114a0;
        this.f50146d = dateProvider;
        this.f50147e = replayExecutor;
        this.f50148f = function1;
        this.f50149g = AbstractC2163n.b(new c());
        this.f50150h = new io.sentry.android.replay.gestures.b(dateProvider);
        this.f50151i = new AtomicBoolean(false);
        this.f50153k = new g(null, this, "", this);
        this.f50154l = new h(null, this, "segment.timestamp", this);
        this.f50155m = new AtomicLong();
        this.f50156n = new i(null, this, "replay.screen-at-start", this, "replay.screen-at-start");
        this.f50157o = new d(x.f51153b, this, "replay.id", this, "replay.id");
        this.f50158p = new e(-1, this, "segment.id", this, "segment.id");
        this.f50159q = new f(null, this, "replay.type", this, "replay.type");
        this.f50160r = new ConcurrentLinkedDeque();
    }

    public static /* synthetic */ h.c n(a aVar, long j10, Date date, x xVar, int i10, int i11, int i12, int i13, int i14, A3.b bVar, io.sentry.android.replay.i iVar, String str, List list, Deque deque, int i15, Object obj) {
        Deque deque2;
        a aVar2;
        long j11;
        Date date2;
        x xVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSegmentInternal");
        }
        A3.b bVarV = (i15 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? aVar.v() : bVar;
        io.sentry.android.replay.i iVar2 = (i15 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? aVar.f50152j : iVar;
        String strW = (i15 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? aVar.w() : str;
        List list2 = (i15 & 2048) != 0 ? null : list;
        if ((i15 & 4096) != 0) {
            deque2 = aVar.f50160r;
            aVar2 = aVar;
            date2 = date;
            xVar2 = xVar;
            i16 = i10;
            i17 = i11;
            i18 = i12;
            i19 = i13;
            i20 = i14;
            j11 = j10;
        } else {
            deque2 = deque;
            aVar2 = aVar;
            j11 = j10;
            date2 = date;
            xVar2 = xVar;
            i16 = i10;
            i17 = i11;
            i18 = i12;
            i19 = i13;
            i20 = i14;
        }
        return aVar2.m(j11, date2, xVar2, i16, i17, i18, i19, i20, bVarV, iVar2, strW, list2, deque2);
    }

    public final ScheduledExecutorService q() {
        return (ScheduledExecutorService) this.f50149g.getValue();
    }

    public final void A(s sVar) {
        this.f50153k.b(this, f50142t[0], sVar);
    }

    public void B(A3.b bVar) {
        AbstractC5504s.h(bVar, "<set-?>");
        this.f50159q.b(this, f50142t[5], bVar);
    }

    protected final void C(String str) {
        this.f50156n.b(this, f50142t[2], str);
    }

    @Override // io.sentry.android.replay.capture.h
    public x a() {
        return (x) this.f50157o.a(this, f50142t[3]);
    }

    @Override // io.sentry.android.replay.capture.h
    public void b(MotionEvent event) {
        List listA;
        AbstractC5504s.h(event, "event");
        s sVarS = s();
        if (sVarS == null || (listA = this.f50150h.a(event, sVarS)) == null) {
            return;
        }
        AbstractC2279u.D(this.f50160r, listA);
    }

    @Override // io.sentry.android.replay.capture.h
    public void c(int i10) {
        this.f50158p.b(this, f50142t[4], Integer.valueOf(i10));
    }

    @Override // io.sentry.android.replay.capture.h
    public int d() {
        return ((Number) this.f50158p.a(this, f50142t[4])).intValue();
    }

    @Override // io.sentry.android.replay.capture.h
    public void h(int i10, x replayId, A3.b bVar) {
        io.sentry.android.replay.i iVar;
        AbstractC5504s.h(replayId, "replayId");
        Function1 function1 = this.f50148f;
        if (function1 == null || (iVar = (io.sentry.android.replay.i) function1.invoke(replayId)) == null) {
            iVar = new io.sentry.android.replay.i(this.f50144b, replayId);
        }
        this.f50152j = iVar;
        z(replayId);
        c(i10);
        if (bVar == null) {
            bVar = this instanceof m ? A3.b.SESSION : A3.b.BUFFER;
        }
        B(bVar);
        j(AbstractC5226l.d());
        this.f50155m.set(this.f50146d.getCurrentTimeMillis());
    }

    @Override // io.sentry.android.replay.capture.h
    public void i() {
        j(AbstractC5226l.d());
    }

    @Override // io.sentry.android.replay.capture.h
    public void j(Date date) {
        this.f50154l.b(this, f50142t[1], date);
    }

    protected final h.c m(long j10, Date currentSegmentTimestamp, x replayId, int i10, int i11, int i12, int i13, int i14, A3.b replayType, io.sentry.android.replay.i iVar, String str, List list, Deque events) {
        AbstractC5504s.h(currentSegmentTimestamp, "currentSegmentTimestamp");
        AbstractC5504s.h(replayId, "replayId");
        AbstractC5504s.h(replayType, "replayType");
        AbstractC5504s.h(events, "events");
        return io.sentry.android.replay.capture.h.f50252a.c(this.f50145c, this.f50144b, j10, currentSegmentTimestamp, replayId, i10, i11, i12, replayType, iVar, i13, i14, str, list, events);
    }

    protected final io.sentry.android.replay.i o() {
        return this.f50152j;
    }

    protected final Deque p() {
        return this.f50160r;
    }

    @Override // io.sentry.android.replay.capture.h
    public void r(s recorderConfig) {
        AbstractC5504s.h(recorderConfig, "recorderConfig");
        A(recorderConfig);
    }

    public final s s() {
        return (s) this.f50153k.a(this, f50142t[0]);
    }

    @Override // io.sentry.android.replay.capture.h
    public void stop() throws Exception {
        io.sentry.android.replay.i iVar = this.f50152j;
        if (iVar != null) {
            iVar.close();
        }
        this.f50155m.set(0L);
        j(null);
        x EMPTY_ID = x.f51153b;
        AbstractC5504s.g(EMPTY_ID, "EMPTY_ID");
        z(EMPTY_ID);
    }

    protected final ScheduledExecutorService t() {
        return this.f50147e;
    }

    protected final AtomicLong u() {
        return this.f50155m;
    }

    public A3.b v() {
        return (A3.b) this.f50159q.a(this, f50142t[5]);
    }

    protected final String w() {
        return (String) this.f50156n.a(this, f50142t[2]);
    }

    public Date x() {
        return (Date) this.f50154l.a(this, f50142t[1]);
    }

    protected final AtomicBoolean y() {
        return this.f50151i;
    }

    public void z(x xVar) {
        AbstractC5504s.h(xVar, "<set-?>");
        this.f50157o.b(this, f50142t[3], xVar);
    }

    @Override // io.sentry.android.replay.capture.h
    public void pause() {
    }
}
