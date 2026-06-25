package com.google.android.material.datepicker;

import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class q extends AbstractComponentCallbacksC2838q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final LinkedHashSet f42450a = new LinkedHashSet();

    q() {
    }

    boolean w(p pVar) {
        return this.f42450a.add(pVar);
    }

    void x() {
        this.f42450a.clear();
    }
}
