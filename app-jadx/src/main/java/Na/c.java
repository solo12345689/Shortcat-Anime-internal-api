package Na;

import Td.AbstractC2163n;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.C3300p;
import com.facebook.react.uimanager.events.EventDispatcher;
import ie.InterfaceC5082a;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends C3300p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f12761l = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Lazy f12762k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ViewGroup viewGroup) {
        super(viewGroup);
        AbstractC5504s.h(viewGroup, "viewGroup");
        this.f12762k = AbstractC2163n.b(new InterfaceC5082a() { // from class: Na.b
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return c.x();
            }
        });
    }

    private final Method v() {
        return (Method) this.f12762k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method x() {
        try {
            try {
                return C3300p.class.getMethod("k", MotionEvent.class, EventDispatcher.class, Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                return C3300p.class.getMethod("handleMotionEvent", MotionEvent.class, EventDispatcher.class);
            }
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    public final void w(MotionEvent motionEvent, EventDispatcher eventDispatcher, boolean z10) {
        Method methodV = v();
        if (methodV != null) {
            if (Na.a.a(methodV) == 3) {
                methodV.invoke(this, motionEvent, eventDispatcher, Boolean.valueOf(z10));
            } else {
                methodV.invoke(this, motionEvent, eventDispatcher);
            }
        }
    }
}
