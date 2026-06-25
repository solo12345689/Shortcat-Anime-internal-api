package com.amazon.a.a.o.c.a;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public enum d implements Serializable {
    SENSITIVE("Sensitive", true),
    INSENSITIVE("Insensitive", false),
    SYSTEM("System", !b.a());


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f34717d = -6343169151696340687L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f34719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient boolean f34720f;

    d(String str, boolean z10) {
        this.f34719e = str;
        this.f34720f = z10;
    }

    public static d a(String str) {
        for (d dVar : values()) {
            if (dVar.a().equals(str)) {
                return dVar;
            }
        }
        throw new IllegalArgumentException("Invalid IOCase name: " + str);
    }

    private Object c() {
        return a(this.f34719e);
    }

    public boolean b() {
        return this.f34720f;
    }

    public boolean d(String str, String str2) {
        int length = str2.length();
        return str.regionMatches(!this.f34720f, str.length() - length, str2, 0, length);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f34719e;
    }

    public boolean b(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("The strings must not be null");
        }
        return this.f34720f ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public boolean c(String str, String str2) {
        return str.regionMatches(!this.f34720f, 0, str2, 0, str2.length());
    }

    public String a() {
        return this.f34719e;
    }

    public boolean b(String str, int i10, String str2) {
        return str.regionMatches(!this.f34720f, i10, str2, 0, str2.length());
    }

    public int a(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("The strings must not be null");
        }
        return this.f34720f ? str.compareTo(str2) : str.compareToIgnoreCase(str2);
    }

    public int a(String str, int i10, String str2) {
        int length = str.length() - str2.length();
        if (length < i10) {
            return -1;
        }
        while (i10 <= length) {
            if (b(str, i10, str2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
