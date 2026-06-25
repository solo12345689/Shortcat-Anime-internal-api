package z7;

import Td.z;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Ud.S;
import com.facebook.react.AbstractC3206a;
import com.facebook.react.Y;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.modules.blob.FileReaderModule;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.facebook.react.modules.devtoolsruntimesettings.ReactDevToolsRuntimeSettingsModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.reactdevtoolssettings.ReactDevToolsSettingsManagerModule;
import com.facebook.react.modules.share.ShareModule;
import com.facebook.react.modules.sound.SoundManagerModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.modules.vibration.VibrationModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.safeareaview.ReactSafeAreaViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.switchview.ReactSwitchManager;
import com.facebook.react.views.text.PreparedLayoutTextViewManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.frescosupport.FrescoBasedReactTextInlineImageViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.unimplementedview.ReactUnimplementedViewManager;
import com.facebook.react.views.view.ReactViewManager;
import h7.C4914b;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import k7.InterfaceC5454a;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import l7.InterfaceC5558a;
import oe.AbstractC5874j;
import z6.C7306u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends AbstractC3206a implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f65939a;

    public r(AbstractC7309a abstractC7309a) {
        ModuleSpec.Companion companion = ModuleSpec.INSTANCE;
        this.f65939a = S.l(z.a(ReactDrawerLayoutManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: z7.i
            @Override // javax.inject.Provider
            public final Object get() {
                return r.s();
            }
        })), z.a(ReactHorizontalScrollViewManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: z7.o
            @Override // javax.inject.Provider
            public final Object get() {
                return r.t();
            }
        })), z.a(ReactHorizontalScrollContainerViewManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: z7.p
            @Override // javax.inject.Provider
            public final Object get() {
                return r.z();
            }
        })), z.a(ReactProgressBarViewManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: z7.q
            @Override // javax.inject.Provider
            public final Object get() {
                return r.A();
            }
        })), z.a(ReactSafeAreaViewManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: z7.c
            @Override // javax.inject.Provider
            public final Object get() {
                return r.B();
            }
        })), z.a(ReactScrollViewManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: z7.d
            @Override // javax.inject.Provider
            public final Object get() {
                return r.C();
            }
        })), z.a(ReactSwitchManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: z7.e
            @Override // javax.inject.Provider
            public final Object get() {
                return r.D();
            }
        })), z.a(SwipeRefreshLayoutManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: z7.f
            @Override // javax.inject.Provider
            public final Object get() {
                return r.E();
            }
        })), z.a(FrescoBasedReactTextInlineImageViewManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: z7.g
            @Override // javax.inject.Provider
            public final Object get() {
                return r.F();
            }
        })), z.a(ReactImageManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: z7.h
            @Override // javax.inject.Provider
            public final Object get() {
                return r.G();
            }
        })), z.a(ReactModalHostManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: z7.j
            @Override // javax.inject.Provider
            public final Object get() {
                return r.u();
            }
        })), z.a(ReactTextInputManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: z7.k
            @Override // javax.inject.Provider
            public final Object get() {
                return r.v();
            }
        })), z.a("RCTText", companion.viewManagerSpec(new Provider() { // from class: z7.l
            @Override // javax.inject.Provider
            public final Object get() {
                return r.w();
            }
        })), z.a(ReactViewManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: z7.m
            @Override // javax.inject.Provider
            public final Object get() {
                return r.x();
            }
        })), z.a(ReactUnimplementedViewManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: z7.n
            @Override // javax.inject.Provider
            public final Object get() {
                return r.y();
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule A() {
        return new ReactProgressBarViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule B() {
        return new ReactSafeAreaViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule C() {
        return new ReactScrollViewManager(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule D() {
        return new ReactSwitchManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule E() {
        return new SwipeRefreshLayoutManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule F() {
        return new FrescoBasedReactTextInlineImageViewManager(null, null, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule G() {
        return new ReactImageManager(null, null, null, 7, null);
    }

    private final InterfaceC5558a q() {
        Class[] clsArr = (Class[]) AbstractC2273n.U(new Class[]{AccessibilityInfoModule.class, AppearanceModule.class, AppStateModule.class, BlobModule.class, DevLoadingModule.class, FileReaderModule.class, ClipboardModule.class, DialogModule.class, FrescoModule.class, I18nManagerModule.class, ImageLoaderModule.class, ImageStoreManager.class, IntentModule.class, C4914b.c() ? null : NativeAnimatedModule.class, NetworkingModule.class, PermissionsModule.class, ReactDevToolsSettingsManagerModule.class, ReactDevToolsRuntimeSettingsModule.class, ShareModule.class, StatusBarModule.class, SoundManagerModule.class, ToastModule.class, VibrationModule.class, WebSocketModule.class}).toArray(new Class[0]);
        ArrayList<Class> arrayList = new ArrayList();
        for (Class cls : clsArr) {
            if (cls.isAnnotationPresent(InterfaceC5454a.class)) {
                arrayList.add(cls);
            }
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(AbstractC2279u.x(arrayList, 10)), 16));
        for (Class cls2 : arrayList) {
            Annotation annotation = cls2.getAnnotation(InterfaceC5454a.class);
            if (annotation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            InterfaceC5454a interfaceC5454a = (InterfaceC5454a) annotation;
            String strName = interfaceC5454a.name();
            String strName2 = interfaceC5454a.name();
            String name = cls2.getName();
            AbstractC5504s.g(name, "getName(...)");
            Pair pairA = z.a(strName, new ReactModuleInfo(strName2, name, interfaceC5454a.canOverrideExistingModule(), interfaceC5454a.needsEagerInit(), interfaceC5454a.isCxxModule(), ReactModuleInfo.f36934g.a(cls2)));
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return new InterfaceC5558a() { // from class: z7.b
            @Override // l7.InterfaceC5558a
            public final Map a() {
                return r.r(linkedHashMap);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule s() {
        return new ReactDrawerLayoutManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule t() {
        return new ReactHorizontalScrollViewManager(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule u() {
        return new ReactModalHostManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule v() {
        return new ReactTextInputManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule w() {
        return C4914b.s() ? new PreparedLayoutTextViewManager(null, 1, null) : new ReactTextViewManager(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule x() {
        return new ReactViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule y() {
        return new ReactUnimplementedViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule z() {
        return new ReactHorizontalScrollContainerViewManager();
    }

    @Override // com.facebook.react.Y
    public ViewManager createViewManager(ReactApplicationContext reactContext, String viewManagerName) {
        Provider provider;
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(viewManagerName, "viewManagerName");
        ModuleSpec moduleSpec = (ModuleSpec) this.f65939a.get(viewManagerName);
        NativeModule nativeModule = (moduleSpec == null || (provider = moduleSpec.provider()) == null) ? null : (NativeModule) provider.get();
        if (nativeModule instanceof ViewManager) {
            return (ViewManager) nativeModule;
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public List createViewManagers(ReactApplicationContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return AbstractC2279u.p(new ReactDrawerLayoutManager(), new ReactHorizontalScrollViewManager(null, 1, null), new ReactHorizontalScrollContainerViewManager(), new ReactProgressBarViewManager(), new ReactScrollViewManager(null, 1, null), new ReactSwitchManager(), new ReactSafeAreaViewManager(), new SwipeRefreshLayoutManager(), new FrescoBasedReactTextInlineImageViewManager(null, null, 3, null), new ReactImageManager(null, null, null, 7, null), new ReactModalHostManager(), new ReactTextInputManager(), C4914b.s() ? new PreparedLayoutTextViewManager(null, 1, null) : new ReactTextViewManager(null, 1, null), new ReactViewManager(), new ReactUnimplementedViewManager());
    }

    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(reactContext, "reactContext");
        if (AbstractC5504s.c(name, "AccessibilityInfo")) {
            return new AccessibilityInfoModule(reactContext);
        }
        if (AbstractC5504s.c(name, "Appearance")) {
            return new AppearanceModule(reactContext, null, 2, null);
        }
        if (AbstractC5504s.c(name, "AppState")) {
            return new AppStateModule(reactContext);
        }
        if (AbstractC5504s.c(name, "BlobModule")) {
            return new BlobModule(reactContext);
        }
        if (AbstractC5504s.c(name, "DevLoadingView")) {
            return new DevLoadingModule(reactContext);
        }
        if (AbstractC5504s.c(name, FileReaderModule.INSTANCE.a())) {
            return new FileReaderModule(reactContext);
        }
        if (AbstractC5504s.c(name, "Clipboard")) {
            return new ClipboardModule(reactContext);
        }
        if (AbstractC5504s.c(name, "DialogManagerAndroid")) {
            return new DialogModule(reactContext);
        }
        if (AbstractC5504s.c(name, FrescoModule.NAME)) {
            return new FrescoModule(reactContext, true, (C7306u) null);
        }
        if (AbstractC5504s.c(name, "I18nManager")) {
            return new I18nManagerModule(reactContext);
        }
        if (AbstractC5504s.c(name, "ImageLoader")) {
            return new ImageLoaderModule(reactContext);
        }
        if (AbstractC5504s.c(name, "ImageStoreManager")) {
            return new ImageStoreManager(reactContext);
        }
        if (AbstractC5504s.c(name, "IntentAndroid")) {
            return new IntentModule(reactContext);
        }
        if (AbstractC5504s.c(name, "NativeAnimatedModule")) {
            if (C4914b.c()) {
                return null;
            }
            return new NativeAnimatedModule(reactContext);
        }
        if (AbstractC5504s.c(name, "Networking")) {
            return new NetworkingModule(reactContext);
        }
        if (AbstractC5504s.c(name, "PermissionsAndroid")) {
            return new PermissionsModule(reactContext);
        }
        if (AbstractC5504s.c(name, "ShareModule")) {
            return new ShareModule(reactContext);
        }
        if (AbstractC5504s.c(name, "StatusBarManager")) {
            return new StatusBarModule(reactContext);
        }
        if (AbstractC5504s.c(name, "SoundManager")) {
            return new SoundManagerModule(reactContext);
        }
        if (AbstractC5504s.c(name, "ToastAndroid")) {
            return new ToastModule(reactContext);
        }
        if (AbstractC5504s.c(name, "Vibration")) {
            return new VibrationModule(reactContext);
        }
        if (AbstractC5504s.c(name, "WebSocketModule")) {
            return new WebSocketModule(reactContext);
        }
        if (AbstractC5504s.c(name, "ReactDevToolsSettingsManager")) {
            return new ReactDevToolsSettingsManagerModule(reactContext);
        }
        if (AbstractC5504s.c(name, "ReactDevToolsRuntimeSettingsModule")) {
            return new ReactDevToolsRuntimeSettingsModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC3206a
    public InterfaceC5558a getReactModuleInfoProvider() {
        if (!U6.a.a()) {
            return q();
        }
        try {
            Class clsB = U6.a.b("com.facebook.react.shell.MainReactPackage$$ReactModuleInfoProvider");
            Object objNewInstance = clsB != null ? clsB.newInstance() : null;
            InterfaceC5558a interfaceC5558a = objNewInstance instanceof InterfaceC5558a ? (InterfaceC5558a) objNewInstance : null;
            return interfaceC5558a == null ? q() : interfaceC5558a;
        } catch (ClassNotFoundException unused) {
            return q();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for MainReactPackage$$ReactModuleInfoProvider", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for MainReactPackage$$ReactModuleInfoProvider", e11);
        }
    }

    @Override // com.facebook.react.Y
    public Collection getViewManagerNames(ReactApplicationContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return this.f65939a.keySet();
    }

    @Override // com.facebook.react.AbstractC3206a
    public List getViewManagers(ReactApplicationContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return AbstractC2279u.b1(this.f65939a.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map r(Map map) {
        return map;
    }
}
