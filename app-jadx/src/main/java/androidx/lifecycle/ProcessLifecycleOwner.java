package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.G;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0002\u0013\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/r;", "<init>", "()V", "LTd/L;", "f", "e", "d", "g", "j", "k", "Landroid/content/Context;", "context", "h", "(Landroid/content/Context;)V", "", "a", "I", "startedCounter", "b", "resumedCounter", "", "c", "Z", "pauseSent", "stopSent", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/t;", "Landroidx/lifecycle/t;", "registry", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "delayedPauseRunnable", "Landroidx/lifecycle/G$a;", "Landroidx/lifecycle/G$a;", "initializationListener", "Landroidx/lifecycle/k;", "getLifecycle", "()Landroidx/lifecycle/k;", "lifecycle", "i", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessLifecycleOwner implements r {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ProcessLifecycleOwner f30187j = new ProcessLifecycleOwner();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int startedCounter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int resumedCounter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Handler handler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean pauseSent = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean stopSent = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C2865t registry = new C2865t(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Runnable delayedPauseRunnable = new Runnable() { // from class: androidx.lifecycle.D
        @Override // java.lang.Runnable
        public final void run() {
            ProcessLifecycleOwner.i(this.f30129a);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final G.a initializationListener = new d();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30196a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            AbstractC5504s.h(activity, "activity");
            AbstractC5504s.h(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.ProcessLifecycleOwner$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r a() {
            return ProcessLifecycleOwner.f30187j;
        }

        public final void b(Context context) {
            AbstractC5504s.h(context, "context");
            ProcessLifecycleOwner.f30187j.h(context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends AbstractC2852f {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends AbstractC2852f {
            final /* synthetic */ ProcessLifecycleOwner this$0;

            a(ProcessLifecycleOwner processLifecycleOwner) {
                this.this$0 = processLifecycleOwner;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                AbstractC5504s.h(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                AbstractC5504s.h(activity, "activity");
                this.this$0.f();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.AbstractC2852f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC5504s.h(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                G.INSTANCE.b(activity).e(ProcessLifecycleOwner.this.initializationListener);
            }
        }

        @Override // androidx.lifecycle.AbstractC2852f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC5504s.h(activity, "activity");
            ProcessLifecycleOwner.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            AbstractC5504s.h(activity, "activity");
            a.a(activity, new a(ProcessLifecycleOwner.this));
        }

        @Override // androidx.lifecycle.AbstractC2852f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC5504s.h(activity, "activity");
            ProcessLifecycleOwner.this.g();
        }
    }

    private ProcessLifecycleOwner() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(ProcessLifecycleOwner processLifecycleOwner) {
        processLifecycleOwner.j();
        processLifecycleOwner.k();
    }

    public static final r l() {
        return INSTANCE.a();
    }

    public final void d() {
        int i10 = this.resumedCounter - 1;
        this.resumedCounter = i10;
        if (i10 == 0) {
            Handler handler = this.handler;
            AbstractC5504s.e(handler);
            handler.postDelayed(this.delayedPauseRunnable, 700L);
        }
    }

    public final void e() {
        int i10 = this.resumedCounter + 1;
        this.resumedCounter = i10;
        if (i10 == 1) {
            if (this.pauseSent) {
                this.registry.g(AbstractC2857k.a.ON_RESUME);
                this.pauseSent = false;
            } else {
                Handler handler = this.handler;
                AbstractC5504s.e(handler);
                handler.removeCallbacks(this.delayedPauseRunnable);
            }
        }
    }

    public final void f() {
        int i10 = this.startedCounter + 1;
        this.startedCounter = i10;
        if (i10 == 1 && this.stopSent) {
            this.registry.g(AbstractC2857k.a.ON_START);
            this.stopSent = false;
        }
    }

    public final void g() {
        this.startedCounter--;
        k();
    }

    @Override // androidx.lifecycle.r
    public AbstractC2857k getLifecycle() {
        return this.registry;
    }

    public final void h(Context context) {
        AbstractC5504s.h(context, "context");
        this.handler = new Handler();
        this.registry.g(AbstractC2857k.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        AbstractC5504s.f(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.resumedCounter == 0) {
            this.pauseSent = true;
            this.registry.g(AbstractC2857k.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.startedCounter == 0 && this.pauseSent) {
            this.registry.g(AbstractC2857k.a.ON_STOP);
            this.stopSent = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements G.a {
        d() {
        }

        @Override // androidx.lifecycle.G.a
        public void b() {
            ProcessLifecycleOwner.this.f();
        }

        @Override // androidx.lifecycle.G.a
        public void onResume() {
            ProcessLifecycleOwner.this.e();
        }

        @Override // androidx.lifecycle.G.a
        public void a() {
        }
    }
}
