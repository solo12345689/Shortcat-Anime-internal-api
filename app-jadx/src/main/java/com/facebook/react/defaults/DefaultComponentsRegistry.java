package com.facebook.react.defaults;

import com.facebook.react.fabric.ComponentFactory;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/defaults/DefaultComponentsRegistry;", "", "<init>", "()V", "Lcom/facebook/react/fabric/ComponentFactory;", "componentFactory", "LTd/L;", "register", "(Lcom/facebook/react/fabric/ComponentFactory;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultComponentsRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DefaultComponentsRegistry f36587a = new DefaultComponentsRegistry();

    static {
        b.a();
    }

    private DefaultComponentsRegistry() {
    }

    public static final native void register(ComponentFactory componentFactory);
}
