package Ea;

import Td.L;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C3284b0;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f5865d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5866e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3284b0 f5867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Ea.a f5868b = new Ea.a(0.0d, 0.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f5869c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public p(C3284b0 c3284b0) {
        this.f5867a = c3284b0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(p pVar, ViewGroup viewGroup) {
        pVar.e(viewGroup);
    }

    private final void e(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        Ea.a aVar = new Ea.a(Ba.d.a(viewGroup.getWidth()), Ba.d.a(viewGroup.getHeight()));
        if (AbstractC5504s.c(aVar, this.f5868b)) {
            return;
        }
        this.f5868b = aVar;
        C3284b0 c3284b0 = this.f5867a;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("height", aVar.a());
        writableMapCreateMap.putDouble("width", aVar.b());
        L l10 = L.f17438a;
        Ba.g.b(c3284b0, "KeyboardController::windowDidResize", writableMapCreateMap);
    }

    public final void b() {
        ViewTreeObserver viewTreeObserver;
        C3284b0 c3284b0 = this.f5867a;
        if (c3284b0 == null || f5866e == c3284b0.hashCode()) {
            return;
        }
        f5866e = this.f5867a.hashCode();
        final ViewGroup viewGroupA = Ba.f.a(this.f5867a);
        e(viewGroupA);
        this.f5869c = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: Ea.o
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                p.c(this.f5863a, viewGroupA);
            }
        };
        if (viewGroupA == null || (viewTreeObserver = viewGroupA.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this.f5869c);
    }

    public final void d() {
        ViewGroup viewGroupA;
        ViewTreeObserver viewTreeObserver;
        C3284b0 c3284b0 = this.f5867a;
        if (c3284b0 == null || (viewGroupA = Ba.f.a(c3284b0)) == null || (viewTreeObserver = viewGroupA.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this.f5869c);
    }
}
