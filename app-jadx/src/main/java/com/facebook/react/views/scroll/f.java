package com.facebook.react.views.scroll;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.f0;
import com.facebook.react.views.scroll.n;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements UIManagerListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f38006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f38007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f38008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakReference f38009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Rect f38010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f38011f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0629a f38012c = new C0629a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f38013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Integer f38014b;

        /* JADX INFO: renamed from: com.facebook.react.views.scroll.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0629a {
            public /* synthetic */ C0629a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(ReadableMap value) {
                AbstractC5504s.h(value, "value");
                return new a(value.getInt("minIndexForVisible"), value.hasKey("autoscrollToTopThreshold") ? Integer.valueOf(value.getInt("autoscrollToTopThreshold")) : null);
            }

            private C0629a() {
            }
        }

        public a(int i10, Integer num) {
            this.f38013a = i10;
            this.f38014b = num;
        }

        public final Integer a() {
            return this.f38014b;
        }

        public final int b() {
            return this.f38013a;
        }
    }

    public f(ViewGroup viewGroup, boolean z10) {
        this.f38006a = viewGroup;
        this.f38007b = z10;
    }

    private final void b() {
        ViewGroup viewGroup;
        com.facebook.react.views.view.g gVarC;
        float y10;
        int height;
        a aVar = this.f38008c;
        if (aVar == null || (viewGroup = this.f38006a) == null || (gVarC = c()) == null) {
            return;
        }
        int scrollX = this.f38007b ? viewGroup.getScrollX() : viewGroup.getScrollY();
        int childCount = gVarC.getChildCount();
        for (int iB = aVar.b(); iB < childCount; iB++) {
            View childAt = gVarC.getChildAt(iB);
            if (this.f38007b) {
                y10 = childAt.getX();
                height = childAt.getWidth();
            } else {
                y10 = childAt.getY();
                height = childAt.getHeight();
            }
            if (y10 + height > scrollX || iB == gVarC.getChildCount() - 1) {
                this.f38009d = new WeakReference(childAt);
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                this.f38010e = rect;
                return;
            }
        }
    }

    private final com.facebook.react.views.view.g c() {
        ViewGroup viewGroup = this.f38006a;
        return (com.facebook.react.views.view.g) (viewGroup != null ? viewGroup.getChildAt(0) : null);
    }

    private final UIManager d() {
        ViewGroup viewGroup = this.f38006a;
        ReactContext reactContext = (ReactContext) (viewGroup != null ? viewGroup.getContext() : null);
        if (reactContext == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ViewGroup viewGroup2 = this.f38006a;
        UIManager uIManagerG = f0.g(reactContext, C7.a.a(viewGroup2 != null ? viewGroup2.getId() : 0));
        if (uIManagerG != null) {
            return uIManagerG;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void i() {
        WeakReference weakReference;
        Rect rect;
        View view;
        ViewGroup viewGroup;
        a aVar = this.f38008c;
        if (aVar == null || (weakReference = this.f38009d) == null || (rect = this.f38010e) == null || (view = (View) weakReference.get()) == null || (viewGroup = this.f38006a) == 0) {
            return;
        }
        Rect rect2 = new Rect();
        view.getHitRect(rect2);
        if (this.f38007b) {
            int i10 = rect2.left - rect.left;
            if (i10 != 0) {
                int scrollX = viewGroup.getScrollX();
                n.d dVar = (n.d) viewGroup;
                dVar.a(i10 + scrollX, viewGroup.getScrollY());
                this.f38010e = rect2;
                if (aVar.a() == null || scrollX > aVar.a().intValue()) {
                    return;
                }
                dVar.b(0, viewGroup.getScrollY());
                return;
            }
            return;
        }
        int i11 = rect2.top - rect.top;
        if (i11 != 0) {
            int scrollY = viewGroup.getScrollY();
            n.d dVar2 = (n.d) viewGroup;
            dVar2.a(viewGroup.getScrollX(), i11 + scrollY);
            this.f38010e = rect2;
            if (aVar.a() == null || scrollY > aVar.a().intValue()) {
                return;
            }
            dVar2.b(viewGroup.getScrollX(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(f fVar) {
        fVar.b();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uiManager) {
        AbstractC5504s.h(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uiManager) {
        AbstractC5504s.h(uiManager, "uiManager");
        i();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uiManager) {
        AbstractC5504s.h(uiManager, "uiManager");
    }

    public final void e(a aVar) {
        this.f38008c = aVar;
    }

    public final void f() {
        if (this.f38011f) {
            return;
        }
        this.f38011f = true;
        d().addUIManagerEventListener(this);
    }

    public final void g() {
        if (this.f38011f) {
            this.f38011f = false;
            d().removeUIManagerEventListener(this);
        }
    }

    public final void h() {
        ViewGroup viewGroup = this.f38006a;
        if (viewGroup == null || C7.a.a(viewGroup.getId()) == 2) {
            return;
        }
        i();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uiManager) {
        AbstractC5504s.h(uiManager, "uiManager");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.views.scroll.e
            @Override // java.lang.Runnable
            public final void run() {
                f.j(this.f38005a);
            }
        });
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uiManager) {
        AbstractC5504s.h(uiManager, "uiManager");
        b();
    }
}
