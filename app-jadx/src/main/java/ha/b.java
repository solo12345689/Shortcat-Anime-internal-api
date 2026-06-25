package Ha;

import Ba.h;
import Ea.k;
import Ea.l;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.r;
import androidx.core.view.AbstractC2747a0;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.events.i;
import com.facebook.react.uimanager.f0;
import com.facebook.react.views.view.g;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements i {

    /* JADX INFO: renamed from: h */
    public static final a f8360h = new a(null);

    /* JADX INFO: renamed from: a */
    private final g f8361a;

    /* JADX INFO: renamed from: b */
    private final C3284b0 f8362b;

    /* JADX INFO: renamed from: c */
    private final l f8363c;

    /* JADX INFO: renamed from: d */
    private InterfaceC5082a f8364d;

    /* JADX INFO: renamed from: e */
    private final int f8365e;

    /* JADX INFO: renamed from: f */
    private final UIManager f8366f;

    /* JADX INFO: renamed from: g */
    private final EventDispatcher f8367g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(g view, C3284b0 reactContext, l config, InterfaceC5082a callback) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(config, "config");
        AbstractC5504s.h(callback, "callback");
        this.f8361a = view;
        this.f8362b = reactContext;
        this.f8363c = config;
        this.f8364d = callback;
        this.f8365e = 2;
        this.f8366f = f0.g(reactContext.b(), 2);
        this.f8367g = f0.b(reactContext.b(), 2);
    }

    public static final void d(k kVar, g gVar, b bVar, DialogInterface dialogInterface) {
        k.q(kVar, null, null, 3, null);
        kVar.e();
        h.a(gVar);
        k kVar2 = (k) bVar.f8364d.invoke();
        if (kVar2 != null) {
            kVar2.o(false);
        }
    }

    public final void b() {
        EventDispatcher eventDispatcher = this.f8367g;
        if (eventDispatcher != null) {
            eventDispatcher.b(this);
        }
    }

    public final void c() {
        EventDispatcher eventDispatcher = this.f8367g;
        if (eventDispatcher != null) {
            eventDispatcher.c(this);
        }
    }

    @Override // com.facebook.react.uimanager.events.i
    public void onEventDispatch(d event) {
        View decorView;
        View viewResolveView;
        AbstractC5504s.h(event, "event");
        if (AbstractC5504s.c(event.internal_getEventNameCompat(), "topShow")) {
            View rootView = null;
            try {
                UIManager uIManager = this.f8366f;
                viewResolveView = uIManager != null ? uIManager.resolveView(event.getViewTag()) : null;
            } catch (Exception e10) {
                Fa.a.f6597a.c(c.f8368a, "Can not resolve view for Modal#" + event.getViewTag(), e10);
            }
            com.facebook.react.views.modal.d dVar = viewResolveView instanceof com.facebook.react.views.modal.d ? (com.facebook.react.views.modal.d) viewResolveView : null;
            if (dVar == null) {
                return;
            }
            r dialog = dVar.getDialog();
            Window window = dialog != null ? dialog.getWindow() : null;
            if (window != null && (decorView = window.getDecorView()) != null) {
                rootView = decorView.getRootView();
            }
            ViewGroup viewGroup = (ViewGroup) rootView;
            if (viewGroup != null) {
                final g gVar = new g(this.f8362b);
                gVar.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                final k kVar = new k(this.f8361a, viewGroup, this.f8362b, this.f8363c);
                viewGroup.addView(gVar);
                if (c.f8369b) {
                    k kVar2 = (k) this.f8364d.invoke();
                    if (kVar2 != null) {
                        kVar2.o(true);
                    }
                    AbstractC2747a0.C0(viewGroup, kVar);
                    AbstractC2747a0.w0(gVar, kVar);
                    kVar.p(Double.valueOf(0.0d), Boolean.FALSE);
                }
                if (dialog != null) {
                    dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: Ha.a
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            b.d(kVar, gVar, this, dialogInterface);
                        }
                    });
                }
                if (window != null) {
                    window.setSoftInputMode(48);
                }
            }
        }
    }
}
