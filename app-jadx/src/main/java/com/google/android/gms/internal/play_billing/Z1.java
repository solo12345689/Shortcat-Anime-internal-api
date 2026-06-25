package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class Z1 extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Z1 f40434b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f40435a;

    static {
        Z1 z12 = new Z1();
        f40434b = z12;
        z12.f40435a = false;
    }

    private Z1() {
        this.f40435a = true;
    }

    public static Z1 a() {
        return f40434b;
    }

    private static int h(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof L1) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iB = P1.b(length, bArr, 0, length);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    private final void i() {
        if (!this.f40435a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        super.clear();
    }

    public final Z1 d() {
        return isEmpty() ? new Z1() : new Z1(this);
    }

    public final void e() {
        this.f40435a = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final void f(Z1 z12) {
        i();
        if (z12.isEmpty()) {
            return;
        }
        putAll(z12);
    }

    public final boolean g() {
        return this.f40435a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iH = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iH += h(entry.getValue()) ^ h(entry.getKey());
        }
        return iH;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        i();
        byte[] bArr = P1.f40250b;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        i();
        for (Object obj : map.keySet()) {
            byte[] bArr = P1.f40250b;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        i();
        return super.remove(obj);
    }

    private Z1(Map map) {
        super(map);
        this.f40435a = true;
    }
}
