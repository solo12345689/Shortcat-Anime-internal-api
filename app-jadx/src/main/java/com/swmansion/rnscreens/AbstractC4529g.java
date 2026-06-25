package com.swmansion.rnscreens;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.InterfaceC3282a0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.swmansion.rnscreens.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4529g extends ViewGroup {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f44480f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC3282a0 f44481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f44482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f44483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f44484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f44485e;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AbstractC4529g(Context context) {
        super(context);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        float fG = com.facebook.react.uimanager.B.g(i10);
        float fG2 = com.facebook.react.uimanager.B.g(i11);
        float fG3 = com.facebook.react.uimanager.B.g(i12);
        float fG4 = com.facebook.react.uimanager.B.g(i13);
        if (Math.abs(this.f44482b - fG) >= 0.9f || Math.abs(this.f44483c - fG2) >= 0.9f || Math.abs(this.f44484d - fG3) >= 0.9f || Math.abs(this.f44485e - fG4) >= 0.9f) {
            this.f44482b = fG;
            this.f44483c = fG2;
            this.f44484d = fG3;
            this.f44485e = fG4;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("frameWidth", fG);
            writableNativeMap.putDouble("frameHeight", fG2);
            writableNativeMap.putDouble("contentOffsetX", fG3);
            writableNativeMap.putDouble("contentOffsetY", fG4);
            InterfaceC3282a0 interfaceC3282a0 = this.f44481a;
            if (interfaceC3282a0 != null) {
                interfaceC3282a0.updateState(writableNativeMap);
            }
        }
    }

    protected final void b(int i10, int i11, int i12, int i13) {
        a(i10, i11, i12, i13);
    }

    public final void setStateWrapper(InterfaceC3282a0 interfaceC3282a0) {
        this.f44481a = interfaceC3282a0;
    }
}
