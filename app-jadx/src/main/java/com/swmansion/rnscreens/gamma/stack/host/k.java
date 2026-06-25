package com.swmansion.rnscreens.gamma.stack.host;

import Td.r;
import Ud.AbstractC2279u;
import android.util.Log;
import android.view.ViewGroup;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.f0;
import com.swmansion.rnscreens.gamma.stack.screen.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends ViewGroup implements UIManagerListener, i {

    /* JADX INFO: renamed from: e */
    public static final a f44509e = new a(null);

    /* JADX INFO: renamed from: a */
    private final C3284b0 f44510a;

    /* JADX INFO: renamed from: b */
    private final ArrayList f44511b;

    /* JADX INFO: renamed from: c */
    private final h f44512c;

    /* JADX INFO: renamed from: d */
    private final j f44513d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44514a;

        static {
            int[] iArr = new int[a.EnumC0698a.values().length];
            try {
                iArr[a.EnumC0698a.f44522a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC0698a.f44523b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f44514a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C3284b0 reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        this.f44510a = reactContext;
        this.f44511b = new ArrayList();
        h hVar = new h(reactContext, new WeakReference(this));
        this.f44512c = hVar;
        this.f44513d = new j();
        addView(hVar);
        UIManager uIManagerG = f0.g(reactContext, 2);
        if (uIManagerG == null) {
            throw new IllegalStateException("[RNScreens] UIManager must not be null.");
        }
        uIManagerG.addUIManagerEventListener(this);
    }

    private final void b(com.swmansion.rnscreens.gamma.stack.screen.a aVar) {
        if (aVar.getActivityMode() == a.EnumC0698a.f44523b && !aVar.b()) {
            this.f44513d.a(aVar);
            return;
        }
        Log.d("StackHost", "Ignoring pop operation of " + aVar.getScreenKey() + ", already not attached or natively dismissed");
    }

    private final void c(com.swmansion.rnscreens.gamma.stack.screen.a aVar) {
        if (aVar.getActivityMode() == a.EnumC0698a.f44523b) {
            this.f44513d.b(aVar);
        }
    }

    @Override // com.swmansion.rnscreens.gamma.stack.host.i
    public void a(com.swmansion.rnscreens.gamma.stack.screen.a stackScreen) {
        AbstractC5504s.h(stackScreen, "stackScreen");
        if (stackScreen.getActivityMode() == a.EnumC0698a.f44523b) {
            stackScreen.setNativelyDismissed$react_native_screens_release(true);
        }
    }

    public final void d(com.swmansion.rnscreens.gamma.stack.screen.a stackScreen, int i10) {
        AbstractC5504s.h(stackScreen, "stackScreen");
        this.f44511b.add(i10, stackScreen);
        stackScreen.setStackHost$react_native_screens_release(new WeakReference<>(this));
        c(stackScreen);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uiManager) {
        AbstractC5504s.h(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uiManager) {
        AbstractC5504s.h(uiManager, "uiManager");
        this.f44513d.c(this.f44512c, this.f44511b);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uiManager) {
        AbstractC5504s.h(uiManager, "uiManager");
    }

    public final void e(com.swmansion.rnscreens.gamma.stack.screen.a stackScreen) {
        AbstractC5504s.h(stackScreen, "stackScreen");
        int i10 = b.f44514a[stackScreen.getActivityMode().ordinal()];
        if (i10 == 1) {
            this.f44513d.a(stackScreen);
        } else {
            if (i10 != 2) {
                throw new r();
            }
            this.f44513d.b(stackScreen);
        }
    }

    public final void f() {
        Iterator it = AbstractC2279u.V(this.f44511b).iterator();
        while (it.hasNext()) {
            b((com.swmansion.rnscreens.gamma.stack.screen.a) it.next());
        }
        this.f44511b.clear();
    }

    public final void g(com.swmansion.rnscreens.gamma.stack.screen.a reactSubview) {
        AbstractC5504s.h(reactSubview, "reactSubview");
        this.f44511b.remove(reactSubview);
        b(reactSubview);
    }

    public final ArrayList<com.swmansion.rnscreens.gamma.stack.screen.a> getRenderedScreens$react_native_screens_release() {
        return this.f44511b;
    }

    public final void h(int i10) {
        Object objRemove = this.f44511b.remove(i10);
        AbstractC5504s.g(objRemove, "removeAt(...)");
        b((com.swmansion.rnscreens.gamma.stack.screen.a) objRemove);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        fb.e.f46994a.a("StackHost", "StackHost [" + getId() + "] attached to window");
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f44512c.layout(i10, i11, i12, i13);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f44512c.measure(i10, i11);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uiManager) {
        AbstractC5504s.h(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uiManager) {
        AbstractC5504s.h(uiManager, "uiManager");
    }
}
