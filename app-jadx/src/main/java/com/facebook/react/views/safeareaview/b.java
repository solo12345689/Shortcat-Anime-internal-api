package com.facebook.react.views.safeareaview;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.I;
import androidx.core.view.L0;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.uimanager.UIManagerModule;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3284b0 f37987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC3282a0 f37988b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends GuardedRunnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ A1.b f37990b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(A1.b bVar, C3284b0 c3284b0) {
            super(c3284b0);
            this.f37990b = bVar;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule uIManagerModule = (UIManagerModule) b.this.getReactContext().b().getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                int id2 = b.this.getId();
                A1.b bVar = this.f37990b;
                uIManagerModule.updateInsetsPadding(id2, bVar.f105b, bVar.f104a, bVar.f107d, bVar.f106c);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C3284b0 reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        this.f37987a = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 b(b bVar, View view, L0 windowInsets) {
        AbstractC5504s.h(view, "<unused var>");
        AbstractC5504s.h(windowInsets, "windowInsets");
        A1.b bVarF = windowInsets.f(L0.p.i() | L0.p.c());
        AbstractC5504s.g(bVarF, "getInsets(...)");
        bVar.c(bVarF);
        return L0.f28953b;
    }

    private final void c(A1.b bVar) {
        InterfaceC3282a0 interfaceC3282a0 = this.f37988b;
        if (interfaceC3282a0 == null) {
            if (Y6.a.f22864f) {
                return;
            }
            C3284b0 c3284b0 = this.f37987a;
            c3284b0.runOnNativeModulesQueueThread(new a(bVar, c3284b0));
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        B b10 = B.f37368a;
        writableNativeMap.putDouble("left", b10.e(bVar.f104a));
        writableNativeMap.putDouble("top", b10.e(bVar.f105b));
        writableNativeMap.putDouble("bottom", b10.e(bVar.f107d));
        writableNativeMap.putDouble("right", b10.e(bVar.f106c));
        interfaceC3282a0.updateState(writableNativeMap);
    }

    public final C3284b0 getReactContext() {
        return this.f37987a;
    }

    public final InterfaceC3282a0 getStateWrapper$ReactAndroid_release() {
        return this.f37988b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC2747a0.w0(this, new I() { // from class: com.facebook.react.views.safeareaview.a
            @Override // androidx.core.view.I
            public final L0 d(View view, L0 l02) {
                return b.b(this.f37986a, view, l02);
            }
        });
        requestApplyInsets();
    }

    public final void setStateWrapper$ReactAndroid_release(InterfaceC3282a0 interfaceC3282a0) {
        this.f37988b = interfaceC3282a0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
