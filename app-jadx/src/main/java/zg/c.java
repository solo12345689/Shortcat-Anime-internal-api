package Zg;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f23451d = new c("dilithium2", 2, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f23452e = new c("dilithium3", 3, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f23453f = new c("dilithium5", 5, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f23456c;

    private c(String str, int i10, boolean z10) {
        this.f23455b = str;
        this.f23454a = i10;
        this.f23456c = z10;
    }

    a a(SecureRandom secureRandom) {
        return new a(this.f23454a, secureRandom, this.f23456c);
    }

    public String b() {
        return this.f23455b;
    }
}
