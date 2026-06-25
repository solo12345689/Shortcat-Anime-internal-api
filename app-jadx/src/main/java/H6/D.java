package H6;

import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.reflect.InvocationTargetException;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f7959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.f f7960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f7961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.f f7962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.d f7963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.f f7964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private B5.i f7965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private B5.l f7966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private B5.a f7967i;

    public D(B b10) {
        this.f7959a = (B) y5.k.g(b10);
    }

    private com.facebook.imagepipeline.memory.f a() {
        if (this.f7960b == null) {
            try {
                this.f7960b = (com.facebook.imagepipeline.memory.f) AshmemMemoryChunkPool.class.getConstructor(B5.d.class, E.class, F.class).newInstance(this.f7959a.i(), this.f7959a.g(), this.f7959a.h());
            } catch (ClassNotFoundException unused) {
                this.f7960b = null;
            } catch (IllegalAccessException unused2) {
                this.f7960b = null;
            } catch (InstantiationException unused3) {
                this.f7960b = null;
            } catch (NoSuchMethodException unused4) {
                this.f7960b = null;
            } catch (InvocationTargetException unused5) {
                this.f7960b = null;
            }
        }
        return this.f7960b;
    }

    private com.facebook.imagepipeline.memory.f f(int i10) {
        if (i10 == 0) {
            return g();
        }
        if (i10 == 1) {
            return c();
        }
        if (i10 == 2) {
            return a();
        }
        throw new IllegalArgumentException("Invalid MemoryChunkType");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public H6.i b() {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.D.b():H6.i");
    }

    public com.facebook.imagepipeline.memory.f c() {
        if (this.f7962d == null) {
            try {
                this.f7962d = (com.facebook.imagepipeline.memory.f) BufferMemoryChunkPool.class.getConstructor(B5.d.class, E.class, F.class).newInstance(this.f7959a.i(), this.f7959a.g(), this.f7959a.h());
            } catch (ClassNotFoundException unused) {
                this.f7962d = null;
            } catch (IllegalAccessException unused2) {
                this.f7962d = null;
            } catch (InstantiationException unused3) {
                this.f7962d = null;
            } catch (NoSuchMethodException unused4) {
                this.f7962d = null;
            } catch (InvocationTargetException unused5) {
                this.f7962d = null;
            }
        }
        return this.f7962d;
    }

    public com.facebook.imagepipeline.memory.d d() {
        if (this.f7963e == null) {
            this.f7963e = new com.facebook.imagepipeline.memory.d(this.f7959a.i(), this.f7959a.f());
        }
        return this.f7963e;
    }

    public int e() {
        return this.f7959a.f().f7974g;
    }

    public com.facebook.imagepipeline.memory.f g() {
        if (this.f7964f == null) {
            try {
                this.f7964f = (com.facebook.imagepipeline.memory.f) NativeMemoryChunkPool.class.getConstructor(B5.d.class, E.class, F.class).newInstance(this.f7959a.i(), this.f7959a.g(), this.f7959a.h());
            } catch (ClassNotFoundException e10) {
                AbstractC7283a.n("PoolFactory", "", e10);
                this.f7964f = null;
            } catch (IllegalAccessException e11) {
                AbstractC7283a.n("PoolFactory", "", e11);
                this.f7964f = null;
            } catch (InstantiationException e12) {
                AbstractC7283a.n("PoolFactory", "", e12);
                this.f7964f = null;
            } catch (NoSuchMethodException e13) {
                AbstractC7283a.n("PoolFactory", "", e13);
                this.f7964f = null;
            } catch (InvocationTargetException e14) {
                AbstractC7283a.n("PoolFactory", "", e14);
                this.f7964f = null;
            }
        }
        return this.f7964f;
    }

    public B5.i h() {
        return i(!z6.z.a() ? 1 : 0);
    }

    public B5.i i(int i10) {
        if (this.f7965g == null) {
            com.facebook.imagepipeline.memory.f fVarF = f(i10);
            y5.k.h(fVarF, "failed to get pool for chunk type: " + i10);
            this.f7965g = new y(fVarF, j());
        }
        return this.f7965g;
    }

    public B5.l j() {
        if (this.f7966h == null) {
            this.f7966h = new B5.l(k());
        }
        return this.f7966h;
    }

    public B5.a k() {
        if (this.f7967i == null) {
            this.f7967i = new com.facebook.imagepipeline.memory.e(this.f7959a.i(), this.f7959a.j(), this.f7959a.k());
        }
        return this.f7967i;
    }
}
