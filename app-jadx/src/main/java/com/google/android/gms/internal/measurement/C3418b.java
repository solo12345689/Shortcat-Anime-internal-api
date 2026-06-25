package com.google.android.gms.internal.measurement;

import P9.AbstractC2013w;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3418b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC2013w f39707d = AbstractC2013w.D("_syn", "_err", "_el");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f39709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f39710c;

    public C3418b(String str, long j10, Map map) {
        this.f39708a = str;
        this.f39709b = j10;
        HashMap map2 = new HashMap();
        this.f39710c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object h(String str, Object obj, Object obj2) {
        if (f39707d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final long a() {
        return this.f39709b;
    }

    public final String b() {
        return this.f39708a;
    }

    public final void c(String str) {
        this.f39708a = str;
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.f39710c.remove(str);
        } else {
            Map map = this.f39710c;
            map.put(str, h(str, map.get(str), obj));
        }
    }

    public final Object e(String str) {
        Map map = this.f39710c;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3418b)) {
            return false;
        }
        C3418b c3418b = (C3418b) obj;
        if (this.f39709b == c3418b.f39709b && this.f39708a.equals(c3418b.f39708a)) {
            return this.f39710c.equals(c3418b.f39710c);
        }
        return false;
    }

    public final Map f() {
        return this.f39710c;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final C3418b clone() {
        return new C3418b(this.f39708a, this.f39709b, new HashMap(this.f39710c));
    }

    public final int hashCode() {
        int iHashCode = this.f39708a.hashCode() * 31;
        long j10 = this.f39709b;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f39710c.hashCode();
    }

    public final String toString() {
        String str = this.f39708a;
        String string = this.f39710c.toString();
        int length = String.valueOf(str).length();
        long j10 = this.f39709b;
        StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(j10).length() + 9 + string.length() + 1);
        sb2.append("Event{name='");
        sb2.append(str);
        sb2.append("', timestamp=");
        sb2.append(j10);
        sb2.append(", params=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }
}
