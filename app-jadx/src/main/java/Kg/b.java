package Kg;

import Oh.h;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class b implements Fg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f11143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BigInteger f11144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BigInteger f11145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BigInteger f11146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f11149g;

    public b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i10, int i11, BigInteger bigInteger4, c cVar) {
        if (i11 != 0) {
            if (i11 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i11 < i10) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i10 > bigInteger.bitLength() && !h.b("org.bouncycastle.dh.allow_unsafe_p_value")) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.f11143a = bigInteger2;
        this.f11144b = bigInteger;
        this.f11145c = bigInteger3;
        this.f11147e = i10;
        this.f11148f = i11;
        this.f11146d = bigInteger4;
        this.f11149g = cVar;
    }

    public BigInteger a() {
        return this.f11143a;
    }

    public BigInteger b() {
        return this.f11144b;
    }

    public BigInteger c() {
        return this.f11145c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (c() != null) {
            if (!c().equals(bVar.c())) {
                return false;
            }
        } else if (bVar.c() != null) {
            return false;
        }
        return bVar.b().equals(this.f11144b) && bVar.a().equals(this.f11143a);
    }

    public int hashCode() {
        return (b().hashCode() ^ a().hashCode()) ^ (c() != null ? c().hashCode() : 0);
    }
}
