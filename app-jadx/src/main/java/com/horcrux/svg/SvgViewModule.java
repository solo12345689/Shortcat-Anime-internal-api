package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import k7.InterfaceC5454a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = "RNSVGSvgViewModule")
class SvgViewModule extends NativeSvgViewModuleSpec {
    public static final String NAME = "RNSVGSvgViewModule";

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f43690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableMap f43691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Callback f43692c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f43693d;

        /* JADX INFO: renamed from: com.horcrux.svg.SvgViewModule$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class RunnableC0651a implements Runnable {

            /* JADX INFO: renamed from: com.horcrux.svg.SvgViewModule$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            class RunnableC0652a implements Runnable {
                RunnableC0652a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a aVar = a.this;
                    SvgViewModule.toDataURL(aVar.f43690a, aVar.f43691b, aVar.f43692c, aVar.f43693d + 1);
                }
            }

            RunnableC0651a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(a.this.f43690a);
                if (svgViewByTag == null) {
                    return;
                }
                svgViewByTag.setToDataUrlTask(new RunnableC0652a());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                SvgViewModule.toDataURL(aVar.f43690a, aVar.f43691b, aVar.f43692c, aVar.f43693d + 1);
            }
        }

        a(int i10, ReadableMap readableMap, Callback callback, int i11) {
            this.f43690a = i10;
            this.f43691b = readableMap;
            this.f43692c = callback;
            this.f43693d = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(this.f43690a);
            if (svgViewByTag == null) {
                SvgViewManager.runWhenViewIsAvailable(this.f43690a, new RunnableC0651a());
                return;
            }
            if (svgViewByTag.notRendered()) {
                svgViewByTag.setToDataUrlTask(new b());
                return;
            }
            ReadableMap readableMap = this.f43691b;
            if (readableMap != null) {
                this.f43692c.invoke(svgViewByTag.toDataURL(readableMap.getInt("width"), this.f43691b.getInt("height")));
            } else {
                this.f43692c.invoke(svgViewByTag.toDataURL());
            }
        }
    }

    SvgViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toDataURL(int i10, ReadableMap readableMap, Callback callback, int i11) {
        UiThreadUtil.runOnUiThread(new a(i10, readableMap, callback, i11));
    }

    @Override // com.horcrux.svg.NativeSvgViewModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSVGSvgViewModule";
    }

    @Override // com.horcrux.svg.NativeSvgViewModuleSpec
    @ReactMethod
    public void toDataURL(Double d10, ReadableMap readableMap, Callback callback) {
        toDataURL(d10.intValue(), readableMap, callback, 0);
    }
}
