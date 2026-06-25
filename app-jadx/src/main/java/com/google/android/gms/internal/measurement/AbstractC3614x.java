package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3614x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f40020a = new ArrayList();

    protected AbstractC3614x() {
    }

    public abstract InterfaceC3553q a(String str, Y1 y12, List list);

    final InterfaceC3553q b(String str) {
        if (this.f40020a.contains(AbstractC3633z2.e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
