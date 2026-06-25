package Wa;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0364a f20788d = new C0364a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactContext f20789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventDispatcher f20791c;

    /* JADX INFO: renamed from: Wa.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0364a {
        public /* synthetic */ C0364a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0364a() {
        }
    }

    public a(ReactContext reactContext, int i10) {
        AbstractC5504s.h(reactContext, "reactContext");
        this.f20789a = reactContext;
        this.f20790b = i10;
        EventDispatcher eventDispatcherC = f0.c(reactContext, i10);
        if (eventDispatcherC != null) {
            this.f20791c = eventDispatcherC;
            return;
        }
        throw new IllegalStateException(("[RNScreens] Nullish event dispatcher for view with tag: " + i10).toString());
    }

    protected final EventDispatcher e() {
        return this.f20791c;
    }

    protected final int f() {
        return f0.e(this.f20789a);
    }

    public final int g() {
        return this.f20790b;
    }
}
