package com.facebook.react.views.drawer;

import K7.C1813a;
import K7.InterfaceC1815b;
import M7.c;
import M7.d;
import Td.InterfaceC2154e;
import Td.z;
import Ud.S;
import a2.AbstractC2559a;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.q0;
import java.util.LinkedHashMap;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = ReactDrawerLayoutManager.REACT_CLASS)
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002CDB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0016\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ!\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u001e\u0010\u000bJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010 J!\u0010\"\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\"\u0010\u000bJ!\u0010$\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0004\b&\u0010%J\u001f\u0010(\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0019H\u0016¢\u0006\u0004\b(\u0010\u001cJ\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020#0,H\u0016¢\u0006\u0004\b-\u0010.J)\u00102\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010/\u001a\u00020#2\b\u00101\u001a\u0004\u0018\u000100H\u0017¢\u0006\u0004\b2\u00103J\u001b\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002040,H\u0016¢\u0006\u0004\b5\u0010.J\u001b\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002040,H\u0016¢\u0006\u0004\b6\u0010.J'\u0010;\u001a\u00020\t2\u0006\u00107\u001a\u00020\u00022\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020#H\u0016¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020=H\u0016¢\u0006\u0004\b>\u0010?R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lcom/facebook/react/views/drawer/ReactDrawerLayoutManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/drawer/a;", "LK7/b;", "<init>", "()V", "view", "", "drawerPosition", "LTd/L;", "setDrawerPositionInternal", "(Lcom/facebook/react/views/drawer/a;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/b0;", "reactContext", "addEventEmitters", "(Lcom/facebook/react/uimanager/b0;Lcom/facebook/react/views/drawer/a;)V", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/drawer/a;", "value", "setDrawerPosition", "Lcom/facebook/react/bridge/Dynamic;", "(Lcom/facebook/react/views/drawer/a;Lcom/facebook/react/bridge/Dynamic;)V", "", "width", "setDrawerWidth", "(Lcom/facebook/react/views/drawer/a;F)V", "(Lcom/facebook/react/views/drawer/a;Ljava/lang/Float;)V", "setDrawerLockMode", ReactDrawerLayoutManager.COMMAND_OPEN_DRAWER, "(Lcom/facebook/react/views/drawer/a;)V", ReactDrawerLayoutManager.COMMAND_CLOSE_DRAWER, "setKeyboardDismissMode", "", "setDrawerBackgroundColor", "(Lcom/facebook/react/views/drawer/a;Ljava/lang/Integer;)V", "setStatusBarBackgroundColor", "elevation", "setElevation", "", "needsCustomLayoutForChildren", "()Z", "", "getCommandsMap", "()Ljava/util/Map;", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "(Lcom/facebook/react/views/drawer/a;ILcom/facebook/react/bridge/ReadableArray;)V", "", "getExportedViewConstants", "getExportedCustomDirectEventTypeConstants", "parent", "Landroid/view/View;", "child", "index", "addView", "(Lcom/facebook/react/views/drawer/a;Landroid/view/View;I)V", "Lcom/facebook/react/uimanager/q0;", "getDelegate", "()Lcom/facebook/react/uimanager/q0;", "delegate", "Lcom/facebook/react/uimanager/q0;", "Companion", "b", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactDrawerLayoutManager extends ViewGroupManager<a> implements InterfaceC1815b {
    public static final int CLOSE_DRAWER = 2;
    public static final String COMMAND_CLOSE_DRAWER = "closeDrawer";
    public static final String COMMAND_OPEN_DRAWER = "openDrawer";
    private static final String DRAWER_POSITION = "DrawerPosition";
    private static final String DRAWER_POSITION_LEFT = "Left";
    private static final String DRAWER_POSITION_RIGHT = "Right";
    public static final int OPEN_DRAWER = 1;
    public static final String REACT_CLASS = "AndroidDrawerLayout";
    private final q0 delegate;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements AbstractC2559a.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC2559a f37890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final EventDispatcher f37891b;

        public b(AbstractC2559a drawerLayout, EventDispatcher eventDispatcher) {
            AbstractC5504s.h(drawerLayout, "drawerLayout");
            AbstractC5504s.h(eventDispatcher, "eventDispatcher");
            this.f37890a = drawerLayout;
            this.f37891b = eventDispatcher;
        }

        @Override // a2.AbstractC2559a.e
        public void a(View view) {
            AbstractC5504s.h(view, "view");
            this.f37891b.d(new M7.b(f0.f(this.f37890a), this.f37890a.getId()));
        }

        @Override // a2.AbstractC2559a.e
        public void b(View view) {
            AbstractC5504s.h(view, "view");
            this.f37891b.d(new M7.a(f0.f(this.f37890a), this.f37890a.getId()));
        }

        @Override // a2.AbstractC2559a.e
        public void c(int i10) {
            this.f37891b.d(new d(f0.f(this.f37890a), this.f37890a.getId(), i10));
        }

        @Override // a2.AbstractC2559a.e
        public void d(View view, float f10) {
            AbstractC5504s.h(view, "view");
            this.f37891b.d(new c(f0.f(this.f37890a), this.f37890a.getId(), f10));
        }
    }

    public ReactDrawerLayoutManager() {
        super(null, 1, null);
        this.delegate = new C1813a(this);
    }

    private final void setDrawerPositionInternal(a view, String drawerPosition) {
        if (AbstractC5504s.c(drawerPosition, "left")) {
            view.setDrawerPosition$ReactAndroid_release(8388611);
            return;
        }
        if (AbstractC5504s.c(drawerPosition, "right")) {
            view.setDrawerPosition$ReactAndroid_release(8388613);
            return;
        }
        AbstractC7283a.I("ReactNative", "drawerPosition must be 'left' or 'right', received" + drawerPosition);
        view.setDrawerPosition$ReactAndroid_release(8388611);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return S.l(z.a(COMMAND_OPEN_DRAWER, 1), z.a(COMMAND_CLOSE_DRAWER, 2));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public q0 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        exportedCustomDirectEventTypeConstants.put("topDrawerSlide", S.f(z.a("registrationName", "onDrawerSlide")));
        exportedCustomDirectEventTypeConstants.put("topDrawerOpen", S.f(z.a("registrationName", "onDrawerOpen")));
        exportedCustomDirectEventTypeConstants.put("topDrawerClose", S.f(z.a("registrationName", "onDrawerClose")));
        exportedCustomDirectEventTypeConstants.put("topDrawerStateChanged", S.f(z.a("registrationName", "onDrawerStateChanged")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return S.f(z.a(DRAWER_POSITION, S.l(z.a(DRAWER_POSITION_LEFT, 8388611), z.a(DRAWER_POSITION_RIGHT, 8388613))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3298n
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // K7.InterfaceC1815b
    @B7.a(customType = "Color", name = "drawerBackgroundColor")
    public void setDrawerBackgroundColor(a view, Integer value) {
        AbstractC5504s.h(view, "view");
    }

    @Override // K7.InterfaceC1815b
    @B7.a(name = "keyboardDismissMode")
    public void setKeyboardDismissMode(a view, String value) {
        AbstractC5504s.h(view, "view");
    }

    @Override // K7.InterfaceC1815b
    @B7.a(customType = "Color", name = "statusBarBackgroundColor")
    public void setStatusBarBackgroundColor(a view, Integer value) {
        AbstractC5504s.h(view, "view");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C3284b0 reactContext, a view) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(view, "view");
        EventDispatcher eventDispatcherC = f0.c(reactContext, view.getId());
        if (eventDispatcherC == null) {
            return;
        }
        view.a(new b(view, eventDispatcherC));
    }

    @Override // K7.InterfaceC1815b
    public void closeDrawer(a view) {
        AbstractC5504s.h(view, "view");
        view.W();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(C3284b0 context) {
        AbstractC5504s.h(context, "context");
        return new a(context);
    }

    @Override // K7.InterfaceC1815b
    public void openDrawer(a view) {
        AbstractC5504s.h(view, "view");
        view.X();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @InterfaceC2154e
    public void receiveCommand(a view, int commandId, ReadableArray args) {
        AbstractC5504s.h(view, "view");
        if (commandId == 1) {
            view.X();
        } else {
            if (commandId != 2) {
                return;
            }
            view.W();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r5.equals("unlocked") != false) goto L25;
     */
    @Override // K7.InterfaceC1815b
    @B7.a(name = "drawerLockMode")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setDrawerLockMode(com.facebook.react.views.drawer.a r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.AbstractC5504s.h(r4, r0)
            r0 = 0
            if (r5 == 0) goto L5a
            int r1 = r5.hashCode()
            r2 = -1292600945(0xffffffffb2f4798f, float:-2.8460617E-8)
            if (r1 == r2) goto L33
            r2 = -210949405(0xfffffffff36d2ae3, float:-1.8790347E31)
            if (r1 == r2) goto L2a
            r2 = 168848173(0xa106b2d, float:6.953505E-33)
            if (r1 == r2) goto L1c
            goto L3b
        L1c:
            java.lang.String r1 = "locked-open"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L25
            goto L3b
        L25:
            r5 = 2
            r4.setDrawerLockMode(r5)
            return
        L2a:
            java.lang.String r1 = "unlocked"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L3b
            goto L5a
        L33:
            java.lang.String r1 = "locked-closed"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L55
        L3b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown drawerLockMode "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "ReactNative"
            z5.AbstractC7283a.I(r1, r5)
            r4.setDrawerLockMode(r0)
            return
        L55:
            r5 = 1
            r4.setDrawerLockMode(r5)
            return
        L5a:
            r4.setDrawerLockMode(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.drawer.ReactDrawerLayoutManager.setDrawerLockMode(com.facebook.react.views.drawer.a, java.lang.String):void");
    }

    @Override // K7.InterfaceC1815b
    public void setDrawerPosition(a view, String value) {
        AbstractC5504s.h(view, "view");
        if (value == null) {
            view.setDrawerPosition$ReactAndroid_release(8388611);
        } else {
            setDrawerPositionInternal(view, value);
        }
    }

    @B7.a(defaultFloat = Float.NaN, name = "drawerWidth")
    public final void setDrawerWidth(a view, float width) {
        AbstractC5504s.h(view, "view");
        view.setDrawerWidth$ReactAndroid_release(Float.isNaN(width) ? -1 : Math.round(B.f37368a.b(width)));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setElevation(a view, float elevation) {
        AbstractC5504s.h(view, "view");
        view.setDrawerElevation(B.f37368a.b(elevation));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(a parent, View child, int index) {
        AbstractC5504s.h(parent, "parent");
        AbstractC5504s.h(child, "child");
        if (getChildCount(parent) >= 2) {
            throw new JSApplicationIllegalArgumentException("The Drawer cannot have more than two children");
        }
        if (index != 0 && index != 1) {
            throw new JSApplicationIllegalArgumentException("The only valid indices for drawer's child are 0 or 1. Got " + index + " instead.");
        }
        parent.addView(child, index);
        parent.Y();
    }

    @B7.a(name = "drawerPosition")
    public final void setDrawerPosition(a view, Dynamic drawerPosition) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(drawerPosition, "drawerPosition");
        if (drawerPosition.isNull()) {
            view.setDrawerPosition$ReactAndroid_release(8388611);
            return;
        }
        if (drawerPosition.getType() == ReadableType.Number) {
            int iAsInt = drawerPosition.asInt();
            if (8388611 != iAsInt && 8388613 != iAsInt) {
                AbstractC7283a.I("ReactNative", "Unknown drawerPosition " + iAsInt);
                view.setDrawerPosition$ReactAndroid_release(8388611);
                return;
            }
            view.setDrawerPosition$ReactAndroid_release(iAsInt);
            return;
        }
        if (drawerPosition.getType() == ReadableType.String) {
            String strAsString = drawerPosition.asString();
            if (strAsString == null) {
                throw new IllegalStateException("Required value was null.");
            }
            setDrawerPositionInternal(view, strAsString);
            return;
        }
        AbstractC7283a.I("ReactNative", "drawerPosition must be a string or int");
        view.setDrawerPosition$ReactAndroid_release(8388611);
    }

    @Override // K7.InterfaceC1815b
    public void setDrawerWidth(a view, Float value) {
        int iRound;
        AbstractC5504s.h(view, "view");
        if (value != null) {
            iRound = Math.round(B.f37368a.b(value.floatValue()));
        } else {
            iRound = -1;
        }
        view.setDrawerWidth$ReactAndroid_release(iRound);
    }
}
