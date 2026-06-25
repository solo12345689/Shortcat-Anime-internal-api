package com.android.billingclient.api;

/* JADX INFO: renamed from: com.android.billingclient.api.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3160e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35433c;

    /* JADX INFO: renamed from: com.android.billingclient.api.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f35434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f35435b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f35436c = "";

        /* synthetic */ a(N4.y yVar) {
        }

        public C3160e a() {
            C3160e c3160e = new C3160e();
            c3160e.f35431a = this.f35434a;
            c3160e.f35432b = this.f35435b;
            c3160e.f35433c = this.f35436c;
            return c3160e;
        }

        public a b(String str) {
            this.f35436c = str;
            return this;
        }

        public a c(int i10) {
            this.f35435b = i10;
            return this;
        }

        public a d(int i10) {
            this.f35434a = i10;
            return this;
        }
    }

    public static a d() {
        return new a(null);
    }

    public String a() {
        return this.f35433c;
    }

    public int b() {
        return this.f35432b;
    }

    public int c() {
        return this.f35431a;
    }

    public String toString() {
        return "Response Code: " + com.google.android.gms.internal.play_billing.V.j(this.f35431a) + ", Debug Message: " + this.f35433c;
    }
}
