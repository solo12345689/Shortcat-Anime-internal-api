package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class B3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f39329a = new HashMap();

    public final void a(String str, Callable callable) {
        this.f39329a.put(str, callable);
    }
}
