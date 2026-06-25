package s0;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v0.C6788D;
import v0.C6789E;
import v0.C6811c;
import v0.C6814f;
import v0.InterfaceC6812d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class I implements Z0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f58885f = new c(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f58886g = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f58887a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.compose.ui.graphics.layer.view.a f58889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f58890d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f58888b = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ComponentCallbacks2 f58891e = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            I.this.i(view.getContext());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            I.this.j(view.getContext());
            I.this.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f58894a = new d();

        private d() {
        }

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public I(ViewGroup viewGroup) {
        this.f58887a = viewGroup;
        if (viewGroup.isAttachedToWindow()) {
            i(viewGroup.getContext());
        }
        viewGroup.addOnAttachStateChangeListener(new b());
    }

    private final long g(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(view);
        }
        return -1L;
    }

    private final androidx.compose.ui.graphics.layer.view.a h(ViewGroup viewGroup) {
        androidx.compose.ui.graphics.layer.view.a aVar = this.f58889c;
        if (aVar != null) {
            return aVar;
        }
        androidx.compose.ui.graphics.layer.view.b bVar = new androidx.compose.ui.graphics.layer.view.b(viewGroup.getContext());
        viewGroup.addView(bVar);
        this.f58889c = bVar;
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(Context context) {
        if (this.f58890d) {
            return;
        }
        context.getApplicationContext().registerComponentCallbacks(this.f58891e);
        this.f58890d = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(Context context) {
        if (this.f58890d) {
            context.getApplicationContext().unregisterComponentCallbacks(this.f58891e);
            this.f58890d = false;
        }
    }

    @Override // s0.Z0
    public C6811c a() {
        InterfaceC6812d c6789e;
        C6811c c6811c;
        synchronized (this.f58888b) {
            try {
                long jG = g(this.f58887a);
                if (Build.VERSION.SDK_INT >= 29) {
                    c6789e = new C6788D(jG, null, null, 6, null);
                } else if (f58886g) {
                    try {
                        c6789e = new C6814f(this.f58887a, jG, null, null, 12, null);
                    } catch (Throwable unused) {
                        f58886g = false;
                        c6789e = new C6789E(h(this.f58887a), jG, null, null, 12, null);
                    }
                } else {
                    c6789e = new C6789E(h(this.f58887a), jG, null, null, 12, null);
                }
                c6811c = new C6811c(c6789e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6811c;
    }

    @Override // s0.Z0
    public void b(C6811c c6811c) {
        synchronized (this.f58888b) {
            c6811c.I();
            Td.L l10 = Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements ComponentCallbacks2 {
        a() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            if (i10 >= 40) {
                I.this.f();
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
    }
}
