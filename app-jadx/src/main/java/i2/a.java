package I2;

import I2.b;
import android.content.Context;
import android.graphics.Point;
import androidx.media3.exoplayer.O0;
import java.io.IOException;
import java.nio.ByteBuffer;
import q2.AbstractC6079K;
import q2.C6080L;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.a0;
import w2.AbstractC6936c;
import z2.f;
import z2.h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h implements I2.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f8772o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f8773p;

    /* JADX INFO: renamed from: I2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0117a extends d {
        C0117a() {
        }

        @Override // z2.g
        public void w() {
            a.this.u(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f8775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8776b;

        public c(Context context) {
            this(context, null);
        }

        @Override // I2.b.a
        public int b(C6109x c6109x) {
            String str = c6109x.f57022o;
            return (str == null || !AbstractC6079K.q(str)) ? O0.t(0) : a0.J0(c6109x.f57022o) ? O0.t(4) : O0.t(1);
        }

        @Override // I2.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this.f8775a, null, this.f8776b, 0 == true ? 1 : 0);
        }

        private c(Context context, b bVar) {
            this.f8775a = context;
            this.f8776b = -1;
        }
    }

    /* synthetic */ a(Context context, b bVar, int i10, C0117a c0117a) {
        this(context, bVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z2.h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public I2.c l(Throwable th2) {
        return new I2.c("Unexpected decode error", th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z2.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public I2.c m(f fVar, d dVar, boolean z10) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC6614a.e(fVar.f65555d);
        AbstractC6614a.g(byteBuffer.hasArray());
        AbstractC6614a.a(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.f8773p;
            if (iMax == -1) {
                Context context = this.f8772o;
                if (context != null) {
                    Point pointX = a0.X(context);
                    int i10 = pointX.x;
                    int i11 = pointX.y;
                    C6109x c6109x = fVar.f65553b;
                    if (c6109x != null) {
                        int i12 = c6109x.f57004N;
                        if (i12 != -1) {
                            i10 *= i12;
                        }
                        int i13 = c6109x.f57005O;
                        if (i13 != -1) {
                            i11 *= i13;
                        }
                    }
                    iMax = (Math.max(i10, i11) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            dVar.f8777e = AbstractC6936c.a(byteBuffer.array(), byteBuffer.remaining(), null, iMax);
            dVar.f65563b = fVar.f65557f;
            return null;
        } catch (C6080L e10) {
            return new I2.c("Could not decode image data with BitmapFactory.", e10);
        } catch (IOException e11) {
            return new I2.c(e11);
        }
    }

    @Override // z2.h, z2.InterfaceC7279d, I2.b
    public /* bridge */ /* synthetic */ d b() {
        return (d) super.b();
    }

    @Override // z2.h
    protected f j() {
        return new f(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z2.h
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public d k() {
        return new C0117a();
    }

    private a(Context context, b bVar, int i10) {
        super(new f[1], new d[1]);
        this.f8772o = context;
        this.f8773p = i10;
    }
}
