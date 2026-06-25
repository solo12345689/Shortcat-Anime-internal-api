package com.android.billingclient.api;

/* JADX INFO: renamed from: com.android.billingclient.api.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3162g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f35447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f35448b;

    /* JADX INFO: renamed from: com.android.billingclient.api.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f35449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f35450b;

        private a() {
        }

        public C3162g a() {
            if (!this.f35449a) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return new C3162g(true, this.f35450b);
        }

        public a b() {
            this.f35449a = true;
            return this;
        }

        public a c() {
            this.f35450b = true;
            return this;
        }
    }

    private C3162g(boolean z10, boolean z11) {
        this.f35447a = z10;
        this.f35448b = z11;
    }

    public static a c() {
        return new a();
    }

    boolean a() {
        return this.f35447a;
    }

    boolean b() {
        return this.f35448b;
    }
}
