package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import java.util.Queue;
import y5.k;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Queue f35978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f35979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35980e;

    public b(int i10, int i11, int i12, boolean z10) {
        k.i(i10 > 0);
        k.i(i11 >= 0);
        k.i(i12 >= 0);
        this.f35976a = i10;
        this.f35977b = i11;
        this.f35978c = new LinkedList();
        this.f35980e = i12;
        this.f35979d = z10;
    }

    void a(Object obj) {
        this.f35978c.add(obj);
    }

    public void b() {
        k.i(this.f35980e > 0);
        this.f35980e--;
    }

    public Object c() {
        Object objG = g();
        if (objG != null) {
            this.f35980e++;
        }
        return objG;
    }

    int d() {
        return this.f35978c.size();
    }

    public void e() {
        this.f35980e++;
    }

    public boolean f() {
        return this.f35980e + d() > this.f35977b;
    }

    public Object g() {
        return this.f35978c.poll();
    }

    public void h(Object obj) {
        k.g(obj);
        if (this.f35979d) {
            k.i(this.f35980e > 0);
            this.f35980e--;
            a(obj);
        } else {
            int i10 = this.f35980e;
            if (i10 <= 0) {
                AbstractC7283a.o("BUCKET", "Tried to release value %s from an empty bucket!", obj);
            } else {
                this.f35980e = i10 - 1;
                a(obj);
            }
        }
    }
}
