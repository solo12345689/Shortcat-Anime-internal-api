package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3628y5 extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C3628y5 f40113b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f40114a;

    static {
        C3628y5 c3628y5 = new C3628y5();
        f40113b = c3628y5;
        c3628y5.f40114a = false;
    }

    private C3628y5() {
        this.f40114a = true;
    }

    public static C3628y5 a() {
        return f40113b;
    }

    private static int h(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC3460f5) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iC = AbstractC3505k5.c(length, bArr, 0, length);
        if (iC == 0) {
            return 1;
        }
        return iC;
    }

    private final void i() {
        if (!this.f40114a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        super.clear();
    }

    public final void d(C3628y5 c3628y5) {
        i();
        if (c3628y5.isEmpty()) {
            return;
        }
        putAll(c3628y5);
    }

    public final C3628y5 e() {
        return isEmpty() ? new C3628y5() : new C3628y5(this);
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

    public final void f() {
        this.f40114a = false;
    }

    public final boolean g() {
        return this.f40114a;
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
        byte[] bArr = AbstractC3505k5.f39813b;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        i();
        for (Object obj : map.keySet()) {
            byte[] bArr = AbstractC3505k5.f39813b;
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

    private C3628y5(Map map) {
        super(map);
        this.f40114a = true;
    }
}
