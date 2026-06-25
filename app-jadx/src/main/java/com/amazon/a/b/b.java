package com.amazon.a.b;

import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f34749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Date f34750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f34751e;

    public b(com.amazon.a.a.o.b.f fVar) {
        this.f34747a = a("checksum", fVar);
        this.f34748b = a("customerId", fVar);
        this.f34749c = a("deviceId", fVar);
        this.f34751e = a("packageName", fVar);
        this.f34750d = b("expiration", fVar);
    }

    private String a(String str, com.amazon.a.a.o.b.f fVar) throws com.amazon.a.a.o.b.a.b {
        String strA = fVar.a(str);
        if (com.amazon.a.a.o.e.a(strA)) {
            throw com.amazon.a.a.o.b.a.b.a(str);
        }
        return strA;
    }

    private Date b(String str, com.amazon.a.a.o.b.f fVar) throws com.amazon.a.a.o.b.a.b {
        String strA = a(str, fVar);
        try {
            return new Date(Long.parseLong(strA));
        } catch (NumberFormatException unused) {
            throw com.amazon.a.a.o.b.a.b.a(str, strA);
        }
    }

    public String c() {
        return this.f34749c;
    }

    public Date d() {
        return this.f34750d;
    }

    public String e() {
        return this.f34751e;
    }

    public String a() {
        return this.f34747a;
    }

    public String b() {
        return this.f34748b;
    }
}
