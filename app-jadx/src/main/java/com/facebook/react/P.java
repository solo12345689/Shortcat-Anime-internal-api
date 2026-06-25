package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;
import java.util.List;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P f36419a = new P();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Iterable, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f36420a;

        public a(List list) {
            this.f36420a = list;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f36420a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f36421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f36422b;

        b(List list) {
            this.f36422b = list;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ModuleHolder next() {
            List list = this.f36422b;
            int i10 = this.f36421a;
            this.f36421a = i10 + 1;
            return new ModuleHolder((NativeModule) list.get(i10));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36421a < this.f36422b.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private P() {
    }

    public final Iterable a(O reactPackage, ReactApplicationContext reactApplicationContext) {
        AbstractC5504s.h(reactPackage, "reactPackage");
        AbstractC5504s.h(reactApplicationContext, "reactApplicationContext");
        AbstractC7283a.b("ReactNative", reactPackage.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        return new a(reactPackage.createNativeModules(reactApplicationContext));
    }
}
