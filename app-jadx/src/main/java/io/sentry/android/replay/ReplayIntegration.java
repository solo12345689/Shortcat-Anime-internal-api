package io.sentry.android.replay;

import Td.AbstractC2163n;
import Td.L;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.MotionEvent;
import ge.AbstractC4877a;
import ie.InterfaceC5082a;
import io.sentry.B3;
import io.sentry.C5205g3;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.EnumC5221k;
import io.sentry.G1;
import io.sentry.H;
import io.sentry.InterfaceC5114a0;
import io.sentry.InterfaceC5187d0;
import io.sentry.InterfaceC5192e0;
import io.sentry.InterfaceC5247p0;
import io.sentry.InterfaceC5315y1;
import io.sentry.InterfaceC5320z1;
import io.sentry.M;
import io.sentry.P0;
import io.sentry.Y;
import io.sentry.android.replay.capture.h;
import io.sentry.android.replay.i;
import io.sentry.android.replay.s;
import io.sentry.transport.z;
import io.sentry.util.AbstractC5296i;
import io.sentry.util.C5288a;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0093\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0003CKXBA\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u0019J\u0019\u0010 \u001a\u00020\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010\u0019J\u001f\u0010'\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0017H\u0016¢\u0006\u0004\b,\u0010\u0019J\u000f\u0010-\u001a\u00020\u0017H\u0016¢\u0006\u0004\b-\u0010\u0019J\u0019\u0010/\u001a\u00020\u00172\b\u0010.\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0011H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00172\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u000203H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0017H\u0016¢\u0006\u0004\b9\u0010\u0019J\u000f\u0010:\u001a\u00020)H\u0016¢\u0006\u0004\b:\u0010+J\u000f\u0010;\u001a\u00020\u0017H\u0016¢\u0006\u0004\b;\u0010\u0019J\u0017\u0010>\u001a\u00020\u00172\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0017H\u0016¢\u0006\u0004\b@\u0010\u0019J\u0017\u0010C\u001a\u00020\u00172\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u00172\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\u00172\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u001f\u0010P\u001a\u00020\u00172\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020MH\u0016¢\u0006\u0004\bP\u0010QJ\u0015\u0010T\u001a\u00020\u00172\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bT\u0010UR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010VR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010WR\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010^\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010a\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010bR\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010cR\u0018\u0010e\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010dR\u0018\u0010h\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010gR\u001b\u0010m\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010j\u001a\u0004\bk\u0010lR\u001b\u0010q\u001a\u00020n8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b/\u0010j\u001a\u0004\bo\u0010pR\u001b\u0010u\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010j\u001a\u0004\bs\u0010tR\u001a\u0010{\u001a\u00020v8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u001a\u0010}\u001a\u00020v8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010x\u001a\u0004\b|\u0010zR\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0083\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b7\u0010\u0082\u0001R%\u0010\u0084\u0001\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020~\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010[R\u001a\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R \u0010\u008a\u0001\u001a\n\u0012\u0004\u0012\u00020f\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010YR\u0018\u0010\u008e\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0094\u0001"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "Lio/sentry/p0;", "Ljava/io/Closeable;", "Lio/sentry/android/replay/r;", "Lio/sentry/android/replay/gestures/c;", "Lio/sentry/z1;", "Lio/sentry/M$b;", "Lio/sentry/transport/z$b;", "Lio/sentry/android/replay/u;", "Landroid/content/Context;", "context", "Lio/sentry/transport/o;", "dateProvider", "Lkotlin/Function0;", "Lio/sentry/android/replay/g;", "recorderProvider", "Lkotlin/Function1;", "Lio/sentry/protocol/x;", "Lio/sentry/android/replay/i;", "replayCacheProvider", "<init>", "(Landroid/content/Context;Lio/sentry/transport/o;Lie/a;Lkotlin/jvm/functions/Function1;)V", "(Landroid/content/Context;Lio/sentry/transport/o;)V", "LTd/L;", "a1", "()V", "G0", "E", "M0", "q1", "", "unfinishedReplayId", "H", "(Ljava/lang/String;)V", "O", "Lio/sentry/a0;", "scopes", "Lio/sentry/z3;", "options", "g", "(Lio/sentry/a0;Lio/sentry/z3;)V", "", "B0", "()Z", "start", "i", "isTerminating", "l", "(Ljava/lang/Boolean;)V", "k0", "()Lio/sentry/protocol/x;", "Lio/sentry/y1;", "converter", "k", "(Lio/sentry/y1;)V", "q", "()Lio/sentry/y1;", "pause", "o", "stop", "Landroid/graphics/Bitmap;", "bitmap", "j", "(Landroid/graphics/Bitmap;)V", "close", "Lio/sentry/M$a;", "status", "a", "(Lio/sentry/M$a;)V", "Lio/sentry/transport/z;", "rateLimiter", "m", "(Lio/sentry/transport/z;)V", "Landroid/view/MotionEvent;", "event", "b", "(Landroid/view/MotionEvent;)V", "", "width", "height", "h", "(II)V", "Lio/sentry/android/replay/s;", "config", "r", "(Lio/sentry/android/replay/s;)V", "Landroid/content/Context;", "Lio/sentry/transport/o;", "c", "Lie/a;", "d", "Lkotlin/jvm/functions/Function1;", "e", "Lio/sentry/M$a;", "lastKnownConnectionStatus", "f", "Z", "debugMaskingEnabled", "Lio/sentry/z3;", "Lio/sentry/a0;", "Lio/sentry/android/replay/g;", "recorder", "Lio/sentry/android/replay/gestures/a;", "Lio/sentry/android/replay/gestures/a;", "gestureRecorder", "Lio/sentry/util/z;", "Lkotlin/Lazy;", "Y", "()Lio/sentry/util/z;", "random", "Lio/sentry/android/replay/p;", "p0", "()Lio/sentry/android/replay/p;", "rootViewsSpy", "Lio/sentry/android/replay/util/l;", "h0", "()Lio/sentry/android/replay/util/l;", "replayExecutor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "n", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled$sentry_android_replay_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled", "isManualPause$sentry_android_replay_release", "isManualPause", "Lio/sentry/android/replay/capture/h;", "p", "Lio/sentry/android/replay/capture/h;", "captureStrategy", "Lio/sentry/y1;", "replayBreadcrumbConverter", "replayCaptureStrategyProvider", "Lio/sentry/android/replay/util/i;", "s", "Lio/sentry/android/replay/util/i;", "mainLooperHandler", "t", "gestureRecorderProvider", "Lio/sentry/util/a;", "u", "Lio/sentry/util/a;", "lifecycleLock", "Lio/sentry/android/replay/m;", "v", "Lio/sentry/android/replay/m;", "lifecycle", "w", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReplayIntegration implements InterfaceC5247p0, Closeable, r, io.sentry.android.replay.gestures.c, InterfaceC5320z1, M.b, z.b, u {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final a f50096w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f50097x = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.transport.o dateProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5082a recorderProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function1 replayCacheProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private volatile M.a lastKnownConnectionStatus;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean debugMaskingEnabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private C5322z3 options;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5114a0 scopes;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private io.sentry.android.replay.g recorder;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private io.sentry.android.replay.gestures.a gestureRecorder;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy random;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy rootViewsSpy;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Lazy replayExecutor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isEnabled;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isManualPause;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private io.sentry.android.replay.capture.h captureStrategy;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5315y1 replayBreadcrumbConverter;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Function1 replayCaptureStrategyProvider;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private io.sentry.android.replay.util.i mainLooperHandler;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5082a gestureRecorderProvider;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final C5288a lifecycleLock;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final m lifecycle;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements io.sentry.hints.c {
        @Override // io.sentry.hints.c
        public boolean b() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f50120a;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r10) {
            AbstractC5504s.h(r10, "r");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryReplayIntegration-");
            int i10 = this.f50120a;
            this.f50120a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(r10, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {
        d() {
            super(1);
        }

        public final void a(Date newTimestamp) {
            AbstractC5504s.h(newTimestamp, "newTimestamp");
            io.sentry.android.replay.capture.h hVar = ReplayIntegration.this.captureStrategy;
            if (hVar != null) {
                io.sentry.android.replay.capture.h hVar2 = ReplayIntegration.this.captureStrategy;
                Integer numValueOf = hVar2 != null ? Integer.valueOf(hVar2.d()) : null;
                AbstractC5504s.e(numValueOf);
                hVar.c(numValueOf.intValue() + 1);
            }
            io.sentry.android.replay.capture.h hVar3 = ReplayIntegration.this.captureStrategy;
            if (hVar3 == null) {
                return;
            }
            hVar3.j(newTimestamp);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Date) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bitmap f50122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f50123b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Bitmap bitmap, N n10) {
            super(2);
            this.f50122a = bitmap;
            this.f50123b = n10;
        }

        public final void a(i onScreenshotRecorded, long j10) throws IOException {
            AbstractC5504s.h(onScreenshotRecorded, "$this$onScreenshotRecorded");
            onScreenshotRecorded.k(this.f50122a, j10, (String) this.f50123b.f52259a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            a((i) obj, ((Number) obj2).longValue());
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f50124a = new f();

        f() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.sentry.util.z invoke() {
            return new io.sentry.util.z();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends AbstractC5506u implements InterfaceC5082a {
        g() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.sentry.android.replay.util.l invoke() {
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new c());
            AbstractC5504s.e(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
            C5322z3 c5322z3 = ReplayIntegration.this.options;
            if (c5322z3 == null) {
                AbstractC5504s.u("options");
                c5322z3 = null;
            }
            return new io.sentry.android.replay.util.l(scheduledExecutorServiceNewSingleThreadScheduledExecutor, c5322z3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f50126a = new h();

        h() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p invoke() {
            return p.f50329e.b();
        }
    }

    static {
        C5205g3.d().b("maven:io.sentry:sentry-android-replay", "8.31.0");
    }

    public ReplayIntegration(Context context, io.sentry.transport.o dateProvider, InterfaceC5082a interfaceC5082a, Function1 function1) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(dateProvider, "dateProvider");
        this.context = context;
        this.dateProvider = dateProvider;
        this.recorderProvider = interfaceC5082a;
        this.replayCacheProvider = function1;
        this.lastKnownConnectionStatus = M.a.UNKNOWN;
        this.random = AbstractC2163n.b(f.f50124a);
        this.rootViewsSpy = AbstractC2163n.b(h.f50126a);
        this.replayExecutor = AbstractC2163n.b(new g());
        this.isEnabled = new AtomicBoolean(false);
        this.isManualPause = new AtomicBoolean(false);
        P0 p0B = P0.b();
        AbstractC5504s.g(p0B, "getInstance(...)");
        this.replayBreadcrumbConverter = p0B;
        this.mainLooperHandler = new io.sentry.android.replay.util.i(null, 1, null);
        this.lifecycleLock = new C5288a();
        this.lifecycle = new m();
    }

    private final void E() throws Exception {
        InterfaceC5114a0 interfaceC5114a0;
        InterfaceC5114a0 interfaceC5114a02;
        z zVarN;
        z zVarN2;
        if (this.captureStrategy instanceof io.sentry.android.replay.capture.m) {
            if (this.lastKnownConnectionStatus == M.a.DISCONNECTED || !(((interfaceC5114a0 = this.scopes) == null || (zVarN2 = interfaceC5114a0.n()) == null || !zVarN2.o(EnumC5221k.All)) && ((interfaceC5114a02 = this.scopes) == null || (zVarN = interfaceC5114a02.n()) == null || !zVarN.o(EnumC5221k.Replay)))) {
                G0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(N n10, Y it) {
        AbstractC5504s.h(it, "it");
        String strK = it.k();
        n10.f52259a = strK != null ? Df.r.Z0(strK, com.amazon.a.a.o.c.a.b.f34706a, null, 2, null) : null;
    }

    private final void G0() throws Exception {
        InterfaceC5192e0 interfaceC5192e0A = this.lifecycleLock.a();
        try {
            if (this.isEnabled.get()) {
                m mVar = this.lifecycle;
                n nVar = n.PAUSED;
                if (mVar.b(nVar)) {
                    io.sentry.android.replay.g gVar = this.recorder;
                    if (gVar != null) {
                        gVar.pause();
                    }
                    io.sentry.android.replay.capture.h hVar = this.captureStrategy;
                    if (hVar != null) {
                        hVar.pause();
                    }
                    this.lifecycle.d(nVar);
                    L l10 = L.f17438a;
                    AbstractC4877a.a(interfaceC5192e0A, null);
                    return;
                }
            }
            AbstractC4877a.a(interfaceC5192e0A, null);
        } finally {
        }
    }

    private final void H(String unfinishedReplayId) {
        File[] fileArrListFiles;
        C5322z3 c5322z3 = this.options;
        if (c5322z3 == null) {
            AbstractC5504s.u("options");
            c5322z3 = null;
        }
        String cacheDirPath = c5322z3.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        AbstractC5504s.e(fileArrListFiles);
        for (File file : fileArrListFiles) {
            String name = file.getName();
            AbstractC5504s.e(name);
            if (Df.r.Q(name, "replay_", false, 2, null)) {
                String string = k0().toString();
                AbstractC5504s.g(string, "toString(...)");
                if (!Df.r.W(name, string, false, 2, null) && (Df.r.l0(unfinishedReplayId) || !Df.r.W(name, unfinishedReplayId, false, 2, null))) {
                    AbstractC5296i.a(file);
                }
            }
        }
    }

    static /* synthetic */ void J(ReplayIntegration replayIntegration, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        replayIntegration.H(str);
    }

    private final void M0() {
        if (this.recorder instanceof io.sentry.android.replay.e) {
            CopyOnWriteArrayList copyOnWriteArrayListH = p0().h();
            io.sentry.android.replay.g gVar = this.recorder;
            AbstractC5504s.f(gVar, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            copyOnWriteArrayListH.add((io.sentry.android.replay.e) gVar);
        }
        p0().h().add(this.gestureRecorder);
    }

    private final void O() {
        C5322z3 c5322z3 = this.options;
        C5322z3 c5322z32 = null;
        if (c5322z3 == null) {
            AbstractC5504s.u("options");
            c5322z3 = null;
        }
        InterfaceC5187d0 executorService = c5322z3.getExecutorService();
        AbstractC5504s.g(executorService, "getExecutorService(...)");
        C5322z3 c5322z33 = this.options;
        if (c5322z33 == null) {
            AbstractC5504s.u("options");
        } else {
            c5322z32 = c5322z33;
        }
        io.sentry.android.replay.util.f.b(executorService, c5322z32, "ReplayIntegration.finalize_previous_replay", new Runnable() { // from class: io.sentry.android.replay.k
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                ReplayIntegration.S(this.f50324a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(ReplayIntegration replayIntegration) throws IOException {
        C5322z3 c5322z3;
        C5322z3 c5322z32 = replayIntegration.options;
        if (c5322z32 == null) {
            AbstractC5504s.u("options");
            c5322z32 = null;
        }
        io.sentry.cache.t tVarFindPersistingScopeObserver = c5322z32.findPersistingScopeObserver();
        if (tVarFindPersistingScopeObserver != null) {
            C5322z3 c5322z33 = replayIntegration.options;
            if (c5322z33 == null) {
                AbstractC5504s.u("options");
                c5322z33 = null;
            }
            String str = (String) tVarFindPersistingScopeObserver.B(c5322z33, "replay.json", String.class);
            if (str != null) {
                io.sentry.protocol.x xVar = new io.sentry.protocol.x(str);
                if (AbstractC5504s.c(xVar, io.sentry.protocol.x.f51153b)) {
                    J(replayIntegration, null, 1, null);
                    return;
                }
                i.a aVar = i.f50302l;
                C5322z3 c5322z34 = replayIntegration.options;
                if (c5322z34 == null) {
                    AbstractC5504s.u("options");
                    c5322z34 = null;
                }
                io.sentry.android.replay.d dVarC = aVar.c(c5322z34, xVar, replayIntegration.replayCacheProvider);
                if (dVarC == null) {
                    J(replayIntegration, null, 1, null);
                    return;
                }
                C5322z3 c5322z35 = replayIntegration.options;
                if (c5322z35 == null) {
                    AbstractC5504s.u("options");
                    c5322z35 = null;
                }
                Object objB = tVarFindPersistingScopeObserver.B(c5322z35, "breadcrumbs.json", List.class);
                List list = objB instanceof List ? (List) objB : null;
                h.a aVar2 = io.sentry.android.replay.capture.h.f50252a;
                InterfaceC5114a0 interfaceC5114a0 = replayIntegration.scopes;
                C5322z3 c5322z36 = replayIntegration.options;
                if (c5322z36 == null) {
                    AbstractC5504s.u("options");
                    c5322z3 = null;
                } else {
                    c5322z3 = c5322z36;
                }
                h.c cVarC = aVar2.c(interfaceC5114a0, c5322z3, dVarC.b(), dVarC.h(), xVar, dVarC.d(), dVarC.e().c(), dVarC.e().d(), dVarC.f(), dVarC.a(), dVarC.e().b(), dVarC.e().a(), dVarC.g(), list, new LinkedList(dVarC.c()));
                if (cVarC instanceof h.c.a) {
                    H hC = io.sentry.util.l.c(new b());
                    InterfaceC5114a0 interfaceC5114a02 = replayIntegration.scopes;
                    AbstractC5504s.e(hC);
                    ((h.c.a) cVarC).a(interfaceC5114a02, hC);
                }
                replayIntegration.H(str);
                return;
            }
        }
        J(replayIntegration, null, 1, null);
    }

    private final io.sentry.util.z Y() {
        return (io.sentry.util.z) this.random.getValue();
    }

    private final void a1() throws Exception {
        InterfaceC5114a0 interfaceC5114a0;
        InterfaceC5114a0 interfaceC5114a02;
        z zVarN;
        z zVarN2;
        InterfaceC5192e0 interfaceC5192e0A = this.lifecycleLock.a();
        try {
            if (this.isEnabled.get()) {
                m mVar = this.lifecycle;
                n nVar = n.RESUMED;
                if (mVar.b(nVar)) {
                    if (!this.isManualPause.get() && this.lastKnownConnectionStatus != M.a.DISCONNECTED && (((interfaceC5114a0 = this.scopes) == null || (zVarN2 = interfaceC5114a0.n()) == null || !zVarN2.o(EnumC5221k.All)) && ((interfaceC5114a02 = this.scopes) == null || (zVarN = interfaceC5114a02.n()) == null || !zVarN.o(EnumC5221k.Replay)))) {
                        this.lifecycle.d(nVar);
                        io.sentry.android.replay.capture.h hVar = this.captureStrategy;
                        if (hVar != null) {
                            hVar.i();
                        }
                        io.sentry.android.replay.g gVar = this.recorder;
                        if (gVar != null) {
                            gVar.i();
                            L l10 = L.f17438a;
                        }
                        AbstractC4877a.a(interfaceC5192e0A, null);
                        return;
                    }
                    AbstractC4877a.a(interfaceC5192e0A, null);
                    return;
                }
            }
            AbstractC4877a.a(interfaceC5192e0A, null);
        } finally {
        }
    }

    private final io.sentry.android.replay.util.l h0() {
        return (io.sentry.android.replay.util.l) this.replayExecutor.getValue();
    }

    private final void q1() {
        if (this.recorder instanceof io.sentry.android.replay.e) {
            CopyOnWriteArrayList copyOnWriteArrayListH = p0().h();
            io.sentry.android.replay.g gVar = this.recorder;
            AbstractC5504s.f(gVar, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            copyOnWriteArrayListH.remove((io.sentry.android.replay.e) gVar);
        }
        p0().h().remove(this.gestureRecorder);
    }

    public boolean B0() {
        return this.lifecycle.a().compareTo(n.STARTED) >= 0 && this.lifecycle.a().compareTo(n.STOPPED) < 0;
    }

    @Override // io.sentry.M.b
    public void a(M.a status) throws Exception {
        AbstractC5504s.h(status, "status");
        this.lastKnownConnectionStatus = status;
        if (this.captureStrategy instanceof io.sentry.android.replay.capture.m) {
            if (status == M.a.DISCONNECTED) {
                G0();
            } else {
                a1();
            }
        }
    }

    @Override // io.sentry.android.replay.gestures.c
    public void b(MotionEvent event) {
        io.sentry.android.replay.capture.h hVar;
        AbstractC5504s.h(event, "event");
        if (this.isEnabled.get() && this.lifecycle.c() && (hVar = this.captureStrategy) != null) {
            hVar.b(event);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        z zVarN;
        InterfaceC5192e0 interfaceC5192e0A = this.lifecycleLock.a();
        try {
            if (this.isEnabled.get()) {
                m mVar = this.lifecycle;
                n nVar = n.CLOSED;
                if (mVar.b(nVar)) {
                    C5322z3 c5322z3 = this.options;
                    if (c5322z3 == null) {
                        AbstractC5504s.u("options");
                        c5322z3 = null;
                    }
                    c5322z3.getConnectionStatusProvider().P1(this);
                    InterfaceC5114a0 interfaceC5114a0 = this.scopes;
                    if (interfaceC5114a0 != null && (zVarN = interfaceC5114a0.n()) != null) {
                        zVarN.E(this);
                    }
                    stop();
                    io.sentry.android.replay.g gVar = this.recorder;
                    if (gVar != null) {
                        gVar.close();
                    }
                    this.recorder = null;
                    p0().close();
                    h0().shutdown();
                    this.lifecycle.d(nVar);
                    L l10 = L.f17438a;
                    AbstractC4877a.a(interfaceC5192e0A, null);
                    return;
                }
            }
            AbstractC4877a.a(interfaceC5192e0A, null);
        } finally {
        }
    }

    @Override // io.sentry.InterfaceC5247p0
    public void g(InterfaceC5114a0 scopes, C5322z3 options) {
        ReplayIntegration replayIntegration;
        C5322z3 c5322z3;
        io.sentry.android.replay.g wVar;
        io.sentry.android.replay.gestures.a aVar;
        AbstractC5504s.h(scopes, "scopes");
        AbstractC5504s.h(options, "options");
        this.options = options;
        if (Build.VERSION.SDK_INT < 26) {
            options.getLogger().c(EnumC5215i3.INFO, "Session replay is only supported on API 26 and above", new Object[0]);
            return;
        }
        if (!options.getSessionReplay().w() && !options.getSessionReplay().x()) {
            options.getLogger().c(EnumC5215i3.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        this.scopes = scopes;
        InterfaceC5082a interfaceC5082a = this.recorderProvider;
        if (interfaceC5082a == null || (wVar = (io.sentry.android.replay.g) interfaceC5082a.invoke()) == null) {
            replayIntegration = this;
            c5322z3 = options;
            wVar = new w(c5322z3, replayIntegration, this, this.mainLooperHandler, h0());
        } else {
            replayIntegration = this;
            c5322z3 = options;
        }
        replayIntegration.recorder = wVar;
        InterfaceC5082a interfaceC5082a2 = replayIntegration.gestureRecorderProvider;
        if (interfaceC5082a2 == null || (aVar = (io.sentry.android.replay.gestures.a) interfaceC5082a2.invoke()) == null) {
            aVar = new io.sentry.android.replay.gestures.a(c5322z3, this);
        }
        replayIntegration.gestureRecorder = aVar;
        replayIntegration.isEnabled.set(true);
        c5322z3.getConnectionStatusProvider().C1(this);
        z zVarN = scopes.n();
        if (zVarN != null) {
            zVarN.j(this);
        }
        io.sentry.util.n.a("Replay");
        O();
    }

    @Override // io.sentry.android.replay.u
    public void h(int width, int height) {
        if (this.isEnabled.get() && B0()) {
            C5322z3 c5322z3 = this.options;
            C5322z3 c5322z32 = null;
            if (c5322z3 == null) {
                AbstractC5504s.u("options");
                c5322z3 = null;
            }
            if (c5322z3.getSessionReplay().y()) {
                s.a aVar = s.f50347g;
                Context context = this.context;
                C5322z3 c5322z33 = this.options;
                if (c5322z33 == null) {
                    AbstractC5504s.u("options");
                } else {
                    c5322z32 = c5322z33;
                }
                B3 sessionReplay = c5322z32.getSessionReplay();
                AbstractC5504s.g(sessionReplay, "getSessionReplay(...)");
                r(aVar.b(context, sessionReplay, width, height));
            }
        }
    }

    @Override // io.sentry.InterfaceC5320z1
    public void i() throws Exception {
        this.isManualPause.set(false);
        a1();
    }

    @Override // io.sentry.android.replay.r
    public void j(Bitmap bitmap) throws Exception {
        AbstractC5504s.h(bitmap, "bitmap");
        final N n10 = new N();
        InterfaceC5114a0 interfaceC5114a0 = this.scopes;
        if (interfaceC5114a0 != null) {
            interfaceC5114a0.r(new G1() { // from class: io.sentry.android.replay.l
                @Override // io.sentry.G1
                public final void a(Y y10) {
                    ReplayIntegration.F0(n10, y10);
                }
            });
        }
        io.sentry.android.replay.capture.h hVar = this.captureStrategy;
        if (hVar != null) {
            hVar.f(bitmap, new e(bitmap, n10));
        }
        E();
    }

    @Override // io.sentry.InterfaceC5320z1
    public void k(InterfaceC5315y1 converter) {
        AbstractC5504s.h(converter, "converter");
        this.replayBreadcrumbConverter = converter;
    }

    public io.sentry.protocol.x k0() {
        io.sentry.protocol.x xVarA;
        io.sentry.android.replay.capture.h hVar = this.captureStrategy;
        if (hVar != null && (xVarA = hVar.a()) != null) {
            return xVarA;
        }
        io.sentry.protocol.x EMPTY_ID = io.sentry.protocol.x.f51153b;
        AbstractC5504s.g(EMPTY_ID, "EMPTY_ID");
        return EMPTY_ID;
    }

    @Override // io.sentry.InterfaceC5320z1
    public void l(Boolean isTerminating) {
        if (this.isEnabled.get() && B0()) {
            io.sentry.protocol.x xVar = io.sentry.protocol.x.f51153b;
            io.sentry.android.replay.capture.h hVar = this.captureStrategy;
            C5322z3 c5322z3 = null;
            if (xVar.equals(hVar != null ? hVar.a() : null)) {
                C5322z3 c5322z32 = this.options;
                if (c5322z32 == null) {
                    AbstractC5504s.u("options");
                } else {
                    c5322z3 = c5322z32;
                }
                c5322z3.getLogger().c(EnumC5215i3.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                return;
            }
            io.sentry.android.replay.capture.h hVar2 = this.captureStrategy;
            if (hVar2 != null) {
                hVar2.e(AbstractC5504s.c(isTerminating, Boolean.TRUE), new d());
            }
            io.sentry.android.replay.capture.h hVar3 = this.captureStrategy;
            this.captureStrategy = hVar3 != null ? hVar3.g() : null;
        }
    }

    @Override // io.sentry.transport.z.b
    public void m(z rateLimiter) throws Exception {
        AbstractC5504s.h(rateLimiter, "rateLimiter");
        if (this.captureStrategy instanceof io.sentry.android.replay.capture.m) {
            if (rateLimiter.o(EnumC5221k.All) || rateLimiter.o(EnumC5221k.Replay)) {
                G0();
            } else {
                a1();
            }
        }
    }

    @Override // io.sentry.InterfaceC5320z1
    /* JADX INFO: renamed from: o, reason: from getter */
    public boolean getDebugMaskingEnabled() {
        return this.debugMaskingEnabled;
    }

    public final p p0() {
        return (p) this.rootViewsSpy.getValue();
    }

    @Override // io.sentry.InterfaceC5320z1
    public void pause() throws Exception {
        this.isManualPause.set(true);
        G0();
    }

    @Override // io.sentry.InterfaceC5320z1
    /* JADX INFO: renamed from: q, reason: from getter */
    public InterfaceC5315y1 getReplayBreadcrumbConverter() {
        return this.replayBreadcrumbConverter;
    }

    public final void r(s config) {
        io.sentry.android.replay.g gVar;
        AbstractC5504s.h(config, "config");
        if (this.isEnabled.get() && B0()) {
            io.sentry.android.replay.capture.h hVar = this.captureStrategy;
            if (hVar != null) {
                hVar.r(config);
            }
            io.sentry.android.replay.g gVar2 = this.recorder;
            if (gVar2 != null) {
                gVar2.r(config);
            }
            if (this.lifecycle.a() != n.PAUSED || (gVar = this.recorder) == null) {
                return;
            }
            gVar.pause();
        }
    }

    @Override // io.sentry.InterfaceC5320z1
    public void start() throws Exception {
        io.sentry.android.replay.capture.h fVar;
        C5322z3 c5322z3;
        C5322z3 c5322z32;
        InterfaceC5192e0 interfaceC5192e0A = this.lifecycleLock.a();
        try {
            if (!this.isEnabled.get()) {
                AbstractC4877a.a(interfaceC5192e0A, null);
                return;
            }
            m mVar = this.lifecycle;
            n nVar = n.STARTED;
            if (!mVar.b(nVar)) {
                C5322z3 c5322z33 = this.options;
                if (c5322z33 == null) {
                    AbstractC5504s.u("options");
                    c5322z33 = null;
                }
                c5322z33.getLogger().c(EnumC5215i3.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                AbstractC4877a.a(interfaceC5192e0A, null);
                return;
            }
            io.sentry.util.z zVarY = Y();
            C5322z3 c5322z34 = this.options;
            if (c5322z34 == null) {
                AbstractC5504s.u("options");
                c5322z34 = null;
            }
            boolean zA = io.sentry.android.replay.util.n.a(zVarY, c5322z34.getSessionReplay().q());
            if (!zA) {
                C5322z3 c5322z35 = this.options;
                if (c5322z35 == null) {
                    AbstractC5504s.u("options");
                    c5322z35 = null;
                }
                if (!c5322z35.getSessionReplay().x()) {
                    C5322z3 c5322z36 = this.options;
                    if (c5322z36 == null) {
                        AbstractC5504s.u("options");
                        c5322z36 = null;
                    }
                    c5322z36.getLogger().c(EnumC5215i3.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    AbstractC4877a.a(interfaceC5192e0A, null);
                    return;
                }
            }
            this.lifecycle.d(nVar);
            Function1 function1 = this.replayCaptureStrategyProvider;
            if (function1 == null || (fVar = (io.sentry.android.replay.capture.h) function1.invoke(Boolean.valueOf(zA))) == null) {
                if (zA) {
                    C5322z3 c5322z37 = this.options;
                    if (c5322z37 == null) {
                        AbstractC5504s.u("options");
                        c5322z32 = null;
                    } else {
                        c5322z32 = c5322z37;
                    }
                    fVar = new io.sentry.android.replay.capture.m(c5322z32, this.scopes, this.dateProvider, h0(), this.replayCacheProvider);
                } else {
                    C5322z3 c5322z38 = this.options;
                    if (c5322z38 == null) {
                        AbstractC5504s.u("options");
                        c5322z3 = null;
                    } else {
                        c5322z3 = c5322z38;
                    }
                    fVar = new io.sentry.android.replay.capture.f(c5322z3, this.scopes, this.dateProvider, Y(), h0(), this.replayCacheProvider);
                }
            }
            this.captureStrategy = fVar;
            io.sentry.android.replay.g gVar = this.recorder;
            if (gVar != null) {
                gVar.start();
            }
            io.sentry.android.replay.capture.h hVar = this.captureStrategy;
            if (hVar != null) {
                h.b.a(hVar, 0, null, null, 7, null);
            }
            M0();
            L l10 = L.f17438a;
            AbstractC4877a.a(interfaceC5192e0A, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC4877a.a(interfaceC5192e0A, th2);
                throw th3;
            }
        }
    }

    @Override // io.sentry.InterfaceC5320z1
    public void stop() throws Exception {
        InterfaceC5192e0 interfaceC5192e0A = this.lifecycleLock.a();
        try {
            if (this.isEnabled.get()) {
                m mVar = this.lifecycle;
                n nVar = n.STOPPED;
                if (mVar.b(nVar)) {
                    q1();
                    io.sentry.android.replay.g gVar = this.recorder;
                    if (gVar != null) {
                        gVar.reset();
                    }
                    io.sentry.android.replay.g gVar2 = this.recorder;
                    if (gVar2 != null) {
                        gVar2.stop();
                    }
                    io.sentry.android.replay.gestures.a aVar = this.gestureRecorder;
                    if (aVar != null) {
                        aVar.c();
                    }
                    io.sentry.android.replay.capture.h hVar = this.captureStrategy;
                    if (hVar != null) {
                        hVar.stop();
                    }
                    this.captureStrategy = null;
                    this.lifecycle.d(nVar);
                    L l10 = L.f17438a;
                    AbstractC4877a.a(interfaceC5192e0A, null);
                    return;
                }
            }
            AbstractC4877a.a(interfaceC5192e0A, null);
        } finally {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(Context context, io.sentry.transport.o dateProvider) {
        this(io.sentry.android.replay.util.c.a(context), dateProvider, null, null);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(dateProvider, "dateProvider");
    }
}
