package com.facebook.react.fabric;

import Td.InterfaceC2154e;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.uimanager.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/fabric/FabricUIManagerProviderImpl;", "Lcom/facebook/react/bridge/UIManagerProvider;", "Lcom/facebook/react/fabric/ComponentFactory;", "componentFactory", "Lcom/facebook/react/uimanager/y0;", "viewManagerRegistry", "<init>", "(Lcom/facebook/react/fabric/ComponentFactory;Lcom/facebook/react/uimanager/y0;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "Lcom/facebook/react/bridge/UIManager;", "createUIManager", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/UIManager;", "Lcom/facebook/react/fabric/ComponentFactory;", "Lcom/facebook/react/uimanager/y0;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InterfaceC2154e
public final class FabricUIManagerProviderImpl implements UIManagerProvider {
    private final ComponentFactory componentFactory;
    private final y0 viewManagerRegistry;

    public FabricUIManagerProviderImpl(ComponentFactory componentFactory, y0 viewManagerRegistry) {
        AbstractC5504s.h(componentFactory, "componentFactory");
        AbstractC5504s.h(viewManagerRegistry, "viewManagerRegistry");
        this.componentFactory = componentFactory;
        this.viewManagerRegistry = viewManagerRegistry;
    }

    @Override // com.facebook.react.bridge.UIManagerProvider
    public UIManager createUIManager(ReactApplicationContext context) {
        AbstractC5504s.h(context, "context");
        U7.a.c(0L, "FabricUIManagerProviderImpl.create");
        EventBeatManager eventBeatManager = new EventBeatManager();
        U7.a.c(0L, "FabricUIManagerProviderImpl.createUIManager");
        FabricUIManager fabricUIManager = new FabricUIManager(context, this.viewManagerRegistry, eventBeatManager);
        U7.a.i(0L);
        U7.a.c(0L, "FabricUIManagerProviderImpl.registerBinding");
        FabricUIManagerBinding fabricUIManagerBinding = new FabricUIManagerBinding();
        CatalystInstance catalystInstance = context.getCatalystInstance();
        RuntimeExecutor runtimeExecutor = catalystInstance != null ? catalystInstance.getRuntimeExecutor() : null;
        RuntimeScheduler runtimeScheduler = catalystInstance != null ? catalystInstance.getRuntimeScheduler() : null;
        if (runtimeExecutor == null || runtimeScheduler == null) {
            throw new IllegalStateException("Unable to register FabricUIManager with CatalystInstance, runtimeExecutor and runtimeScheduler must not be null");
        }
        fabricUIManagerBinding.register(runtimeExecutor, runtimeScheduler, fabricUIManager, eventBeatManager, this.componentFactory);
        U7.a.i(0L);
        U7.a.i(0L);
        return fabricUIManager;
    }
}
