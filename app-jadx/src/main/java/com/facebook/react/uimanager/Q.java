package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReadableMap f37525a;

    public Q(ReadableMap props) {
        AbstractC5504s.h(props, "props");
        this.f37525a = props;
    }

    public final boolean a(String name, boolean z10) {
        AbstractC5504s.h(name, "name");
        return this.f37525a.isNull(name) ? z10 : this.f37525a.getBoolean(name);
    }

    public final String b(String name) {
        AbstractC5504s.h(name, "name");
        return this.f37525a.getString(name);
    }

    public final boolean c(String name) {
        AbstractC5504s.h(name, "name");
        return this.f37525a.hasKey(name);
    }

    public final ReadableMap d() {
        return this.f37525a;
    }

    public String toString() {
        return "{ " + Q.class.getSimpleName() + ": " + this.f37525a + " }";
    }
}
