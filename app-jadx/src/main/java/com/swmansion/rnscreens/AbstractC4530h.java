package com.swmansion.rnscreens;

import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.InterfaceC3282a0;

/* JADX INFO: renamed from: com.swmansion.rnscreens.h */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4530h extends ViewGroup {

    /* JADX INFO: renamed from: a */
    private InterfaceC3282a0 f44626a;

    /* JADX INFO: renamed from: b */
    private float f44627b;

    /* JADX INFO: renamed from: c */
    private float f44628c;

    /* JADX INFO: renamed from: d */
    private float f44629d;

    public AbstractC4530h(ReactContext reactContext) {
        super(reactContext);
    }

    protected final void b(int i10, int i11, int i12) {
        c(i10, i11, i12);
    }

    public final void c(int i10, int i11, int i12) {
        float fG = com.facebook.react.uimanager.B.g(i10);
        float fG2 = com.facebook.react.uimanager.B.g(i11);
        float fG3 = com.facebook.react.uimanager.B.g(i12);
        if (Math.abs(this.f44627b - fG) >= 0.9f || Math.abs(this.f44628c - fG2) >= 0.9f || Math.abs(this.f44629d - fG3) >= 0.9f) {
            this.f44627b = fG;
            this.f44628c = fG2;
            this.f44629d = fG3;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("frameWidth", fG);
            writableNativeMap.putDouble("frameHeight", fG2);
            writableNativeMap.putDouble("contentOffsetX", 0.0d);
            writableNativeMap.putDouble("contentOffsetY", fG3);
            InterfaceC3282a0 interfaceC3282a0 = this.f44626a;
            if (interfaceC3282a0 != null) {
                interfaceC3282a0.updateState(writableNativeMap);
            }
        }
    }

    public final void setStateWrapper(InterfaceC3282a0 interfaceC3282a0) {
        this.f44626a = interfaceC3282a0;
    }
}
