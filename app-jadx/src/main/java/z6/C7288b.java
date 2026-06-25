package z6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: z6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7288b implements InterfaceC7302p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f65701f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f65702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f65703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f65704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f65705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f65706e;

    /* JADX INFO: renamed from: z6.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C7288b(int i10) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2, new B(10, "FrescoIoBoundExecutor", true));
        AbstractC5504s.g(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        this.f65702a = executorServiceNewFixedThreadPool;
        ExecutorService executorServiceNewFixedThreadPool2 = Executors.newFixedThreadPool(i10, new B(10, "FrescoDecodeExecutor", true));
        AbstractC5504s.g(executorServiceNewFixedThreadPool2, "newFixedThreadPool(...)");
        this.f65703b = executorServiceNewFixedThreadPool2;
        ExecutorService executorServiceNewFixedThreadPool3 = Executors.newFixedThreadPool(i10, new B(10, "FrescoBackgroundExecutor", true));
        AbstractC5504s.g(executorServiceNewFixedThreadPool3, "newFixedThreadPool(...)");
        this.f65704c = executorServiceNewFixedThreadPool3;
        ExecutorService executorServiceNewFixedThreadPool4 = Executors.newFixedThreadPool(1, new B(10, "FrescoLightWeightBackgroundExecutor", true));
        AbstractC5504s.g(executorServiceNewFixedThreadPool4, "newFixedThreadPool(...)");
        this.f65705d = executorServiceNewFixedThreadPool4;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(i10, new B(10, "FrescoBackgroundExecutor", true));
        AbstractC5504s.g(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(...)");
        this.f65706e = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // z6.InterfaceC7302p
    public Executor a() {
        return this.f65705d;
    }

    @Override // z6.InterfaceC7302p
    public Executor b() {
        return this.f65702a;
    }

    @Override // z6.InterfaceC7302p
    public ScheduledExecutorService c() {
        return this.f65706e;
    }

    @Override // z6.InterfaceC7302p
    public Executor d() {
        return this.f65703b;
    }

    @Override // z6.InterfaceC7302p
    public Executor e() {
        return this.f65704c;
    }

    @Override // z6.InterfaceC7302p
    public Executor f() {
        return this.f65702a;
    }

    @Override // z6.InterfaceC7302p
    public Executor g() {
        return this.f65702a;
    }
}
