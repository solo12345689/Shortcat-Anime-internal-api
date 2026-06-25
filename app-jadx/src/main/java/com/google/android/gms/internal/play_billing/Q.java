package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Q implements Map, Serializable {

    /* JADX INFO: renamed from: a */
    private transient S f40251a;

    /* JADX INFO: renamed from: b */
    private transient S f40252b;

    /* JADX INFO: renamed from: c */
    private transient K f40253c;

    Q() {
    }

    public static Q d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        I.a("com.android.vending.billing.PURCHASES_UPDATED", obj2);
        I.a("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4);
        I.a("com.android.vending.billing.ALTERNATIVE_BILLING", obj6);
        return C3644b0.h(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4, "com.android.vending.billing.ALTERNATIVE_BILLING", obj6}, null);
    }

    abstract K a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b */
    public final K values() {
        K k10 = this.f40253c;
        if (k10 != null) {
            return k10;
        }
        K kA = a();
        this.f40253c = kA;
        return kA;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract S e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    abstract S f();

    @Override // java.util.Map
    /* JADX INFO: renamed from: g */
    public final S entrySet() {
        S s10 = this.f40251a;
        if (s10 != null) {
            return s10;
        }
        S sE = e();
        this.f40251a = sE;
        return sE;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC3649c0.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        S s10 = this.f40252b;
        if (s10 != null) {
            return s10;
        }
        S sF = f();
        this.f40252b = sF;
        return sF;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }
}
