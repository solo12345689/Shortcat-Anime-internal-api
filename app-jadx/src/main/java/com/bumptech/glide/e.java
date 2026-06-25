package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f35607a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f35608a = new HashMap();

        a() {
        }

        e b() {
            return new e(this);
        }
    }

    e(a aVar) {
        this.f35607a = Collections.unmodifiableMap(new HashMap(aVar.f35608a));
    }

    public boolean a(Class cls) {
        return this.f35607a.containsKey(cls);
    }
}
