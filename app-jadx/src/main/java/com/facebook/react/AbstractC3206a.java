package com.facebook.react;

import Td.InterfaceC2154e;
import Ud.AbstractC2279u;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import h7.C4921i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Provider;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;
import l7.InterfaceC5558a;

/* JADX INFO: renamed from: com.facebook.react.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3206a implements O {

    /* JADX INFO: renamed from: com.facebook.react.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class C0609a implements Provider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f36456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ReactApplicationContext f36457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC3206a f36458c;

        public C0609a(AbstractC3206a abstractC3206a, String name, ReactApplicationContext reactContext) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(reactContext, "reactContext");
            this.f36458c = abstractC3206a;
            this.f36456a = name;
            this.f36457b = reactContext;
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return this.f36458c.getModule(this.f36456a, this.f36457b);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Iterable, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f36459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC3206a f36460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f36461c;

        public b(Iterator it, AbstractC3206a abstractC3206a, ReactApplicationContext reactApplicationContext) {
            this.f36459a = it;
            this.f36460b = abstractC3206a;
            this.f36461c = reactApplicationContext;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new c(this.f36459a, this.f36460b, this.f36461c);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map.Entry f36462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterator f36463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC3206a f36464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f36465d;

        c(Iterator it, AbstractC3206a abstractC3206a, ReactApplicationContext reactApplicationContext) {
            this.f36463b = it;
            this.f36464c = abstractC3206a;
            this.f36465d = reactApplicationContext;
        }

        private final void b() {
            while (this.f36463b.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f36463b.next();
                ReactModuleInfo reactModuleInfo = (ReactModuleInfo) entry.getValue();
                if (!C4921i.e() || !reactModuleInfo.d()) {
                    this.f36462a = entry;
                    return;
                }
            }
            this.f36462a = null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ModuleHolder next() {
            if (this.f36462a == null) {
                b();
            }
            Map.Entry entry = this.f36462a;
            if (entry == null) {
                throw new NoSuchElementException("ModuleHolder not found");
            }
            b();
            return new ModuleHolder((ReactModuleInfo) entry.getValue(), new C0609a(this.f36464c, (String) entry.getKey(), this.f36465d));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f36462a == null) {
                b();
            }
            return this.f36462a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // com.facebook.react.O
    @InterfaceC2154e
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        throw new UnsupportedOperationException("createNativeModules method is not supported. Use getModule() method instead.");
    }

    @Override // com.facebook.react.O
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        List<ModuleSpec> viewManagers = getViewManagers(reactContext);
        if (viewManagers == null || viewManagers.isEmpty()) {
            return AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ModuleSpec> it = viewManagers.iterator();
        while (it.hasNext()) {
            Object obj = it.next().provider().get();
            AbstractC5504s.f(obj, "null cannot be cast to non-null type com.facebook.react.uimanager.ViewManager<*, *>");
            arrayList.add((ViewManager) obj);
        }
        return arrayList;
    }

    @Override // com.facebook.react.O
    public abstract NativeModule getModule(String str, ReactApplicationContext reactApplicationContext);

    public final Iterable<ModuleHolder> getNativeModuleIterator$ReactAndroid_release(ReactApplicationContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return new b(getReactModuleInfoProvider().a().entrySet().iterator(), this, reactContext);
    }

    public abstract InterfaceC5558a getReactModuleInfoProvider();

    protected List<ModuleSpec> getViewManagers(ReactApplicationContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return AbstractC2279u.m();
    }
}
