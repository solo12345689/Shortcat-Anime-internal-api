package e4;

import a4.C2569d;
import a4.C2570e;
import androidx.window.extensions.layout.WindowLayoutComponent;
import d4.InterfaceC4566a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: e4.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4645a implements InterfaceC4566a {

    /* JADX INFO: renamed from: a */
    public static final C0724a f45797a = new C0724a(null);

    /* JADX INFO: renamed from: e4.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0724a {
        public /* synthetic */ C0724a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC4566a a(WindowLayoutComponent component, C2569d adapter) {
            AbstractC5504s.h(component, "component");
            AbstractC5504s.h(adapter, "adapter");
            int iA = C2570e.f23774a.a();
            return iA >= 2 ? new C4649e(component) : iA == 1 ? new C4648d(component, adapter) : new C4647c();
        }

        private C0724a() {
        }
    }
}
