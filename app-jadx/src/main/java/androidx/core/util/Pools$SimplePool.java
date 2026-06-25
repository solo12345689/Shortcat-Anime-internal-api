package androidx.core.util;

import K1.d;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class Pools$SimplePool implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f28935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28936b;

    public Pools$SimplePool(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f28935a = new Object[i10];
    }

    private final boolean c(Object obj) {
        int i10 = this.f28936b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f28935a[i11] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // K1.d
    public boolean a(Object instance) {
        AbstractC5504s.h(instance, "instance");
        if (c(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i10 = this.f28936b;
        Object[] objArr = this.f28935a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = instance;
        this.f28936b = i10 + 1;
        return true;
    }

    @Override // K1.d
    public Object b() {
        int i10 = this.f28936b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = this.f28935a[i11];
        AbstractC5504s.f(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f28935a[i11] = null;
        this.f28936b--;
        return obj;
    }
}
