package com.horcrux.svg;

import com.facebook.react.AbstractC3206a;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.horcrux.svg.RenderableViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import k7.InterfaceC5454a;
import l7.InterfaceC5558a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class SvgPackage extends AbstractC3206a implements com.facebook.react.Y {
    private Map<String, ModuleSpec> mViewManagers;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class A implements Provider {
        A() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.RectViewManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class B implements Provider {
        B() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.TextViewManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C implements Provider {
        C() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.TSpanViewManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class D implements Provider {
        D() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.TextPathViewManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$a, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C3988a implements Provider {
        C3988a() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.ImageViewManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$b, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C3989b implements Provider {
        C3989b() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.ClipPathViewManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$c, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C3990c implements Provider {
        C3990c() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.DefsViewManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$d, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C3991d implements Provider {
        C3991d() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.UseViewManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e implements Provider {
        e() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.SymbolManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class f implements Provider {
        f() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.LinearGradientManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class g implements Provider {
        g() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.RadialGradientManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class h implements Provider {
        h() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.PatternManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class i implements Provider {
        i() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.MaskManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class j implements Provider {
        j() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FilterManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class k implements Provider {
        k() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.GroupViewManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class l implements Provider {
        l() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeBlendManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class m implements Provider {
        m() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeColorMatrixManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class n implements Provider {
        n() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeCompositeManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class o implements Provider {
        o() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeFloodManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class p implements Provider {
        p() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeGaussianBlurManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class q implements Provider {
        q() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeMergeManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class r implements Provider {
        r() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeOffsetManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class s implements Provider {
        s() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.ForeignObjectManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class t implements Provider {
        t() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.MarkerManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class u implements Provider {
        u() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new SvgViewManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class v implements Provider {
        v() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.PathViewManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class w implements InterfaceC5558a {
        w() {
        }

        @Override // l7.InterfaceC5558a
        public Map a() {
            HashMap map = new HashMap();
            Class[] clsArr = {SvgViewModule.class, RNSVGRenderableManager.class};
            for (int i10 = 0; i10 < 2; i10++) {
                Class cls = clsArr[i10];
                InterfaceC5454a interfaceC5454a = (InterfaceC5454a) cls.getAnnotation(InterfaceC5454a.class);
                map.put(interfaceC5454a.name(), new ReactModuleInfo(interfaceC5454a.name(), cls.getName(), interfaceC5454a.canOverrideExistingModule(), interfaceC5454a.needsEagerInit(), interfaceC5454a.isCxxModule(), true));
            }
            return map;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class x implements Provider {
        x() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.CircleViewManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class y implements Provider {
        y() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.EllipseViewManager();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class z implements Provider {
        z() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.LineViewManager();
        }
    }

    private Map<String, ModuleSpec> getViewManagersMap(ReactApplicationContext reactApplicationContext) {
        if (this.mViewManagers == null) {
            HashMap mapB = U6.c.b();
            mapB.put(RenderableViewManager.GroupViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new k()));
            mapB.put(RenderableViewManager.PathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new v()));
            mapB.put(RenderableViewManager.CircleViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new x()));
            mapB.put(RenderableViewManager.EllipseViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new y()));
            mapB.put(RenderableViewManager.LineViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new z()));
            mapB.put(RenderableViewManager.RectViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new A()));
            mapB.put(RenderableViewManager.TextViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new B()));
            mapB.put(RenderableViewManager.TSpanViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C()));
            mapB.put(RenderableViewManager.TextPathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new D()));
            mapB.put(RenderableViewManager.ImageViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C3988a()));
            mapB.put(RenderableViewManager.ClipPathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C3989b()));
            mapB.put(RenderableViewManager.DefsViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C3990c()));
            mapB.put(RenderableViewManager.UseViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C3991d()));
            mapB.put(RenderableViewManager.SymbolManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new e()));
            mapB.put(RenderableViewManager.LinearGradientManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new f()));
            mapB.put(RenderableViewManager.RadialGradientManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new g()));
            mapB.put(RenderableViewManager.PatternManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new h()));
            mapB.put(RenderableViewManager.MaskManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new i()));
            mapB.put(RenderableViewManager.FilterManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new j()));
            mapB.put(RenderableViewManager.FeBlendManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new l()));
            mapB.put(RenderableViewManager.FeColorMatrixManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new m()));
            mapB.put(RenderableViewManager.FeCompositeManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new n()));
            mapB.put(RenderableViewManager.FeFloodManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new o()));
            mapB.put(RenderableViewManager.FeGaussianBlurManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new p()));
            mapB.put(RenderableViewManager.FeMergeManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new q()));
            mapB.put(RenderableViewManager.FeOffsetManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new r()));
            mapB.put(RenderableViewManager.ForeignObjectManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new s()));
            mapB.put(RenderableViewManager.MarkerManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new t()));
            mapB.put(SvgViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new u()));
            this.mViewManagers = mapB;
        }
        return this.mViewManagers;
    }

    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.react.Y
    public ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        ModuleSpec moduleSpec = getViewManagersMap(reactApplicationContext).get(str);
        if (moduleSpec != null) {
            return (ViewManager) moduleSpec.getProvider().get();
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        if (str.equals("RNSVGRenderableModule")) {
            return new RNSVGRenderableManager(reactApplicationContext);
        }
        if (str.equals("RNSVGSvgViewModule")) {
            return new SvgViewModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC3206a
    public InterfaceC5558a getReactModuleInfoProvider() {
        try {
            return (InterfaceC5558a) Class.forName("com.horcrux.svg.SvgPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return new w();
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new RuntimeException("No ReactModuleInfoProvider for MyPackage$$ReactModuleInfoProvider", e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new RuntimeException("No ReactModuleInfoProvider for MyPackage$$ReactModuleInfoProvider", e);
        }
    }

    @Override // com.facebook.react.AbstractC3206a
    protected List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(getViewManagersMap(reactApplicationContext).values());
    }

    @Override // com.facebook.react.Y
    public List<String> getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(getViewManagersMap(reactApplicationContext).keySet());
    }
}
