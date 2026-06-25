package com.facebook.react.modules.fresco;

import O5.b;
import android.content.Context;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import dg.C4618A;
import dg.n;
import dg.w;
import java.util.HashSet;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u7.c;
import u7.d;
import v6.C6850a;
import v7.InterfaceC6851a;
import v7.f;
import z5.AbstractC7283a;
import z6.C7305t;
import z6.C7306u;
import z6.EnumC7300n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = FrescoModule.NAME, needsEagerInit = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0017\u0018\u0000 #2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001$B)\b\u0007\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/facebook/react/modules/fresco/FrescoModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "clearOnDestroy", "Lz6/u;", "imagePipelineConfig", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;ZLz6/u;)V", "Lz6/t;", "imagePipeline", "hasBeenInitializedExternally", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lz6/t;ZZ)V", "LTd/L;", "initialize", "()V", "", "getName", "()Ljava/lang/String;", "clearSensitiveData", "onHostResume", "onHostPause", "onHostDestroy", "invalidate", "Z", "config", "Lz6/u;", "pipeline", "Lz6/t;", "getImagePipeline", "()Lz6/t;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FrescoModule extends ReactContextBaseJavaModule implements LifecycleEventListener, TurboModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String NAME = "FrescoModule";
    private static boolean hasBeenInitialized;
    private final boolean clearOnDestroy;
    private C7306u config;
    private C7305t pipeline;

    /* JADX INFO: renamed from: com.facebook.react.modules.fresco.FrescoModule$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C7306u b(ReactContext reactContext) {
            return c(reactContext).a();
        }

        public final C7306u.a c(ReactContext context) {
            AbstractC5504s.h(context, "context");
            HashSet hashSet = new HashSet();
            hashSet.add(new d());
            C4618A c4618aA = f.a();
            n nVarD = c4618aA.d();
            AbstractC5504s.f(nVarD, "null cannot be cast to non-null type com.facebook.react.modules.network.CookieJarContainer");
            ((InterfaceC6851a) nVarD).a(new w(new v7.d()));
            Context applicationContext = context.getApplicationContext();
            AbstractC5504s.g(applicationContext, "getApplicationContext(...)");
            C7306u.a aVarT = C6850a.a(applicationContext, c4618aA).S(new c(c4618aA)).R(EnumC7300n.f65735b).T(hashSet);
            aVarT.b().d(true);
            return aVarT;
        }

        public final boolean d() {
            return FrescoModule.hasBeenInitialized;
        }

        private Companion() {
        }
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, false, null, 6, null);
    }

    public static final C7306u.a getDefaultConfigBuilder(ReactContext reactContext) {
        return INSTANCE.c(reactContext);
    }

    private final C7305t getImagePipeline() {
        if (this.pipeline == null) {
            this.pipeline = O5.d.a();
        }
        return this.pipeline;
    }

    public static final boolean hasBeenInitialized() {
        return INSTANCE.d();
    }

    public void clearSensitiveData() {
        C7305t imagePipeline = getImagePipeline();
        if (imagePipeline != null) {
            imagePipeline.c();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        AbstractC5504s.g(reactApplicationContext, "getReactApplicationContext(...)");
        reactApplicationContext.addLifecycleEventListener(this);
        Companion companion = INSTANCE;
        if (!companion.d()) {
            C7306u c7306uB = this.config;
            if (c7306uB == null) {
                c7306uB = companion.b(reactApplicationContext);
            }
            b.a aVarE = b.e();
            AbstractC5504s.g(aVarE, "newBuilder(...)");
            O5.d.e(reactApplicationContext.getApplicationContext(), c7306uB, aVarE.e());
            hasBeenInitialized = true;
        } else if (this.config != null) {
            AbstractC7283a.I("ReactNative", "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
        }
        this.config = null;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        C7305t imagePipeline;
        if (INSTANCE.d() && this.clearOnDestroy && (imagePipeline = getImagePipeline()) != null) {
            imagePipeline.e();
        }
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, C7305t c7305t) {
        this(reactApplicationContext, c7305t, false, false, 12, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, C7305t c7305t, boolean z10) {
        this(reactApplicationContext, c7305t, z10, false, 8, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z10) {
        this(reactApplicationContext, z10, null, 4, null);
    }

    public /* synthetic */ FrescoModule(ReactApplicationContext reactApplicationContext, boolean z10, C7306u c7306u, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : c7306u);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z10, C7306u c7306u) {
        super(reactApplicationContext);
        this.clearOnDestroy = z10;
        this.config = c7306u;
    }

    public /* synthetic */ FrescoModule(ReactApplicationContext reactApplicationContext, C7305t c7305t, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, c7305t, (i10 & 4) != 0 ? true : z10, (i10 & 8) != 0 ? false : z11);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, C7305t c7305t, boolean z10, boolean z11) {
        this(reactApplicationContext, z10, null, 4, null);
        this.pipeline = c7305t;
        if (z11) {
            hasBeenInitialized = true;
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }
}
