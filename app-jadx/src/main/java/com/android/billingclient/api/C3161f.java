package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.android.billingclient.api.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3161f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f35443a;

    /* JADX INFO: renamed from: com.android.billingclient.api.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f35444a = new HashSet();

        public a a(int i10) {
            this.f35444a.add(Integer.valueOf(i10));
            return this;
        }

        public C3161f b() {
            return new C3161f(this.f35444a, null);
        }
    }

    /* synthetic */ C3161f(Set set, N4.D d10) {
        this.f35443a = new ArrayList(Collections.unmodifiableList(new ArrayList(set)));
    }

    public static a a() {
        return new a();
    }

    final ArrayList b() {
        return this.f35443a;
    }
}
