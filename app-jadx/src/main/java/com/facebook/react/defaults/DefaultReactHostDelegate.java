package com.facebook.react.defaults;

import app.notifee.core.event.LogEvent;
import com.facebook.react.T;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.InterfaceC3258f;
import com.facebook.react.runtime.JSRuntimeFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\t\u0010\u001bR\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010%\u001a\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00050\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010*\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b#\u0010)¨\u0006+"}, d2 = {"Lcom/facebook/react/defaults/DefaultReactHostDelegate;", "Lcom/facebook/react/runtime/f;", "Ljava/lang/Exception;", "Lkotlin/Exception;", LogEvent.LEVEL_ERROR, "LTd/L;", "e", "(Ljava/lang/Exception;)V", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "jsMainModulePath", "Lcom/facebook/react/bridge/JSBundleLoader;", "b", "Lcom/facebook/react/bridge/JSBundleLoader;", "()Lcom/facebook/react/bridge/JSBundleLoader;", "jsBundleLoader", "", "Lcom/facebook/react/O;", "Ljava/util/List;", "d", "()Ljava/util/List;", "reactPackages", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "()Lcom/facebook/react/runtime/JSRuntimeFactory;", "jsRuntimeFactory", "Lcom/facebook/react/runtime/BindingsInstaller;", "Lcom/facebook/react/runtime/BindingsInstaller;", "getBindingsInstaller", "()Lcom/facebook/react/runtime/BindingsInstaller;", "bindingsInstaller", "Lkotlin/Function1;", "f", "Lkotlin/jvm/functions/Function1;", "exceptionHandler", "Lcom/facebook/react/T$a;", "g", "Lcom/facebook/react/T$a;", "()Lcom/facebook/react/T$a;", "turboModuleManagerDelegateBuilder", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultReactHostDelegate implements InterfaceC3258f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String jsMainModulePath;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final JSBundleLoader jsBundleLoader;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List reactPackages;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final JSRuntimeFactory jsRuntimeFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final BindingsInstaller bindingsInstaller;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Function1 exceptionHandler;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final T.a turboModuleManagerDelegateBuilder;

    @Override // com.facebook.react.runtime.InterfaceC3258f
    /* JADX INFO: renamed from: a, reason: from getter */
    public JSRuntimeFactory getJsRuntimeFactory() {
        return this.jsRuntimeFactory;
    }

    @Override // com.facebook.react.runtime.InterfaceC3258f
    /* JADX INFO: renamed from: b, reason: from getter */
    public JSBundleLoader getJsBundleLoader() {
        return this.jsBundleLoader;
    }

    @Override // com.facebook.react.runtime.InterfaceC3258f
    /* JADX INFO: renamed from: c, reason: from getter */
    public String getJsMainModulePath() {
        return this.jsMainModulePath;
    }

    @Override // com.facebook.react.runtime.InterfaceC3258f
    /* JADX INFO: renamed from: d, reason: from getter */
    public List getReactPackages() {
        return this.reactPackages;
    }

    @Override // com.facebook.react.runtime.InterfaceC3258f
    public void e(Exception error) {
        AbstractC5504s.h(error, "error");
        this.exceptionHandler.invoke(error);
    }

    @Override // com.facebook.react.runtime.InterfaceC3258f
    /* JADX INFO: renamed from: f, reason: from getter */
    public T.a getTurboModuleManagerDelegateBuilder() {
        return this.turboModuleManagerDelegateBuilder;
    }

    @Override // com.facebook.react.runtime.InterfaceC3258f
    public BindingsInstaller getBindingsInstaller() {
        return this.bindingsInstaller;
    }
}
