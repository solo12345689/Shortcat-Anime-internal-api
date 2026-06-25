package com.amazon.device.iap.internal.b;

import com.amazon.a.a.o.f;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f35062b = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<String> f35063a = new ConcurrentSkipListSet();

    public boolean a(String str) {
        if (f.a(str)) {
            return false;
        }
        return this.f35063a.remove(str);
    }

    public void b(String str) {
        if (f.a(str)) {
            return;
        }
        this.f35063a.add(str);
    }

    public static e a() {
        return f35062b;
    }
}
