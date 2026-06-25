package fh;

import java.security.SecureRandom;

/* JADX INFO: renamed from: fh.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C4810c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C4810c f47093d = new C4810c("ml-dsa-44", 2, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C4810c f47094e = new C4810c("ml-dsa-65", 3, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C4810c f47095f = new C4810c("ml-dsa-87", 5, 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C4810c f47096g = new C4810c("ml-dsa-44-with-sha512", 2, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C4810c f47097h = new C4810c("ml-dsa-65-with-sha512", 3, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C4810c f47098i = new C4810c("ml-dsa-87-with-sha512", 5, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47101c;

    private C4810c(String str, int i10, int i11) {
        this.f47100b = str;
        this.f47099a = i10;
        this.f47101c = i11;
    }

    C4808a a(SecureRandom secureRandom) {
        return new C4808a(this.f47099a, secureRandom);
    }

    public String b() {
        return this.f47100b;
    }
}
