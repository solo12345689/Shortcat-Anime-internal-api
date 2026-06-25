package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.react.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3244i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f36889c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f36890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f36891b;

    /* JADX INFO: renamed from: com.facebook.react.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        W6.b.a("NativeModuleRegistryBuilder", W6.a.f20778b);
    }

    public C3244i(ReactApplicationContext reactApplicationContext) {
        AbstractC5504s.h(reactApplicationContext, "reactApplicationContext");
        this.f36890a = reactApplicationContext;
        this.f36891b = new HashMap();
    }

    public final NativeModuleRegistry a() {
        return new NativeModuleRegistry(this.f36890a, this.f36891b);
    }

    public final void b(O reactPackage) {
        AbstractC5504s.h(reactPackage, "reactPackage");
        for (ModuleHolder moduleHolder : reactPackage instanceof AbstractC3206a ? ((AbstractC3206a) reactPackage).getNativeModuleIterator$ReactAndroid_release(this.f36890a) : P.f36419a.a(reactPackage, this.f36890a)) {
            String name = moduleHolder.getName();
            ModuleHolder moduleHolder2 = (ModuleHolder) this.f36891b.get(name);
            if (moduleHolder2 != null && !moduleHolder.getCanOverrideExistingModule()) {
                throw new IllegalStateException(("\nNative module " + name + " tried to override " + moduleHolder2.getClassName() + ".\n\nCheck the getPackages() method in MainApplication.java, it might be that module is being created twice.\nIf this was your intention, set canOverrideExistingModule=true. This error may also be present if the\npackage is present only once in getPackages() but is also automatically added later during build time\nby autolinking. Try removing the existing entry and rebuild.\n").toString());
            }
            this.f36891b.put(name, moduleHolder);
        }
    }
}
