package com.amazon.a.a.m;

import com.amazon.a.a.k.d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f34461a = "DATA_AUTHENTICATION_KEY";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f34462b = "APPLICATION_LICENSE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f34463c = "LICENSE_FAILURE_CONTENT";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f34464d = "LICENSE_FAILURE_RAW_EXCEPTION";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f34465e = "TEST_MODE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f34466f = "PACKAGE";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f34467g = "COMMAND";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.k.b f34468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f34469i = new b();

    public <T> void a(String str, a aVar) {
        this.f34469i.a(str, aVar);
    }

    public boolean b(String str) {
        return this.f34469i.a(str);
    }

    public void c(String str) {
        this.f34469i.c(str);
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        this.f34468h.b(this.f34469i);
    }

    public String toString() {
        return this.f34469i.toString();
    }

    public <T> void a(String str, T t10) {
        this.f34469i.a(str, t10);
    }

    public <T> T a(String str) {
        return (T) this.f34469i.b(str);
    }
}
