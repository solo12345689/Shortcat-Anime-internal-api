package com.android.billingclient.api;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.android.billingclient.api.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3164i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.N f35511a;

    /* JADX INFO: renamed from: com.android.billingclient.api.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.android.gms.internal.play_billing.N f35512a;

        /* synthetic */ a(N4.G g10) {
        }

        public C3164i a() {
            if (this.f35512a != null) {
                return new C3164i(this, null);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }

        public a b(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!"play_pass_subs".equals(bVar.c())) {
                    hashSet.add(bVar.c());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f35512a = com.google.android.gms.internal.play_billing.N.s(list);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.i$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f35513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35514b;

        /* JADX INFO: renamed from: com.android.billingclient.api.i$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f35515a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f35516b;

            /* synthetic */ a(N4.G g10) {
            }

            public b a() {
                if ("first_party".equals(this.f35516b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f35515a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.f35516b != null) {
                    return new b(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            public a b(String str) {
                this.f35515a = str;
                return this;
            }

            public a c(String str) {
                this.f35516b = str;
                return this;
            }
        }

        /* synthetic */ b(a aVar, N4.G g10) {
            this.f35513a = aVar.f35515a;
            this.f35514b = aVar.f35516b;
        }

        public static a a() {
            return new a(null);
        }

        public final String b() {
            return this.f35513a;
        }

        public final String c() {
            return this.f35514b;
        }
    }

    /* synthetic */ C3164i(a aVar, N4.G g10) {
        this.f35511a = aVar.f35512a;
    }

    public static a a() {
        return new a(null);
    }

    public final com.google.android.gms.internal.play_billing.N b() {
        return this.f35511a;
    }

    public final String c() {
        return ((b) this.f35511a.get(0)).c();
    }
}
