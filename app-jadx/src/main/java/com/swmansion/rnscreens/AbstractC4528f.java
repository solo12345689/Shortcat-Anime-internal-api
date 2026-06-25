package com.swmansion.rnscreens;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.InterfaceC3282a0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.swmansion.rnscreens.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4528f extends ViewGroup {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f44472f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC3282a0 f44473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f44474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f44475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f44476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f44477e;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AbstractC4528f(Context context) {
        super(context);
    }

    private final void b(int i10, int i11, int i12, int i13) {
        float fG = com.facebook.react.uimanager.B.g(i10);
        float fG2 = com.facebook.react.uimanager.B.g(i11);
        float fG3 = com.facebook.react.uimanager.B.g(i12);
        float fG4 = com.facebook.react.uimanager.B.g(i13);
        if (Math.abs(this.f44474b - fG) >= 0.9f || Math.abs(this.f44475c - fG2) >= 0.9f || Math.abs(this.f44476d - fG3) >= 0.9f || Math.abs(this.f44477e - fG4) >= 0.9f) {
            this.f44474b = fG;
            this.f44475c = fG2;
            this.f44476d = fG3;
            this.f44477e = fG4;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("frameWidth", fG);
            writableNativeMap.putDouble("frameHeight", fG2);
            writableNativeMap.putDouble("paddingStart", fG3);
            writableNativeMap.putDouble("paddingEnd", fG4);
            InterfaceC3282a0 interfaceC3282a0 = this.f44473a;
            if (interfaceC3282a0 != null) {
                interfaceC3282a0.updateState(writableNativeMap);
            }
        }
    }

    public final void a(int i10, int i11, int i12, int i13) {
        b(i10, i11, i12, i13);
    }

    public final void setStateWrapper(InterfaceC3282a0 interfaceC3282a0) {
        this.f44473a = interfaceC3282a0;
    }
}
