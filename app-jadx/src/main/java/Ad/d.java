package Ad;

import Gf.AbstractC1617k;
import Gf.C1608f0;
import Gf.O;
import Gf.P;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import android.R;
import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import expo.modules.updates.reloadscreen.ReloadScreenOptions;
import java.lang.ref.WeakReference;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Ad.a f379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference f381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final O f383e = P.a(C1608f0.c());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ReactMarker.MarkerListener f384f = new ReactMarker.MarkerListener() { // from class: Ad.b
        @Override // com.facebook.react.bridge.ReactMarker.MarkerListener
        public final void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10) {
            d.f(this.f376a, reactMarkerConstants, str, i10);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f385a;

        a(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return d.this.new a(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f385a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            d.this.c();
            return L.f17438a;
        }
    }

    private final void d() {
        final e eVar;
        WeakReference weakReference = this.f380b;
        if (weakReference == null || (eVar = (e) weakReference.get()) == null) {
            return;
        }
        Ad.a aVar = this.f379a;
        if (aVar == null || !aVar.b()) {
            g(eVar);
        } else {
            eVar.animate().alpha(0.0f).setDuration(300L).withEndAction(new Runnable() { // from class: Ad.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.e(this.f377a, eVar);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(d dVar, e eVar) {
        dVar.g(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(d dVar, ReactMarkerConstants name, String str, int i10) {
        AbstractC5504s.h(name, "name");
        if (name == ReactMarkerConstants.RUN_JS_BUNDLE_END && dVar.f382d) {
            AbstractC1617k.d(dVar.f383e, null, null, dVar.new a(null), 3, null);
        }
    }

    private final void g(e eVar) {
        ViewParent parent = eVar.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(eVar);
        }
        this.f380b = null;
        ReactMarker.removeListener(this.f384f);
    }

    private final void j(Activity activity) {
        Ad.a aVarA = this.f379a;
        if (aVarA == null) {
            aVarA = Ad.a.f369g.a(null);
        }
        e eVar = new e(activity, null, 0, 6, null);
        eVar.h(aVarA);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        if (viewGroup != null) {
            viewGroup.addView(eVar, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f380b = new WeakReference(eVar);
    }

    public final void c() {
        if (this.f382d) {
            d();
            this.f382d = false;
        }
    }

    public final void h(ReloadScreenOptions reloadScreenOptions) {
        this.f379a = Ad.a.f369g.a(reloadScreenOptions);
    }

    public final void i(Activity activity) {
        if (this.f382d) {
            return;
        }
        ReactMarker.addListener(this.f384f);
        if (activity == null) {
            WeakReference weakReference = this.f381c;
            activity = weakReference != null ? (Activity) weakReference.get() : null;
        }
        if (activity == null) {
            return;
        }
        j(activity);
        this.f382d = true;
    }
}
