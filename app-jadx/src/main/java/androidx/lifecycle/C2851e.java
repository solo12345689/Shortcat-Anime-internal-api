package androidx.lifecycle;

import androidx.lifecycle.AbstractC2857k;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2851e implements InterfaceC2861o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DefaultLifecycleObserver f30226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2861o f30227b;

    /* JADX INFO: renamed from: androidx.lifecycle.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30228a;

        static {
            int[] iArr = new int[AbstractC2857k.a.values().length];
            try {
                iArr[AbstractC2857k.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC2857k.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC2857k.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC2857k.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC2857k.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC2857k.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC2857k.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f30228a = iArr;
        }
    }

    public C2851e(DefaultLifecycleObserver defaultLifecycleObserver, InterfaceC2861o interfaceC2861o) {
        AbstractC5504s.h(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f30226a = defaultLifecycleObserver;
        this.f30227b = interfaceC2861o;
    }

    @Override // androidx.lifecycle.InterfaceC2861o
    public void g(r source, AbstractC2857k.a event) {
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(event, "event");
        switch (a.f30228a[event.ordinal()]) {
            case 1:
                this.f30226a.onCreate(source);
                break;
            case 2:
                this.f30226a.onStart(source);
                break;
            case 3:
                this.f30226a.onResume(source);
                break;
            case 4:
                this.f30226a.onPause(source);
                break;
            case 5:
                this.f30226a.onStop(source);
                break;
            case 6:
                this.f30226a.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new Td.r();
        }
        InterfaceC2861o interfaceC2861o = this.f30227b;
        if (interfaceC2861o != null) {
            interfaceC2861o.g(source, event);
        }
    }
}
