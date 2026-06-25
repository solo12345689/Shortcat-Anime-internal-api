package b5;

import android.graphics.Bitmap;
import b5.r;
import java.io.IOException;
import java.io.InputStream;
import o5.C5827d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class X implements S4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f33134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V4.b f33135b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a implements r.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final V f33136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C5827d f33137b;

        a(V v10, C5827d c5827d) {
            this.f33136a = v10;
            this.f33137b = c5827d;
        }

        @Override // b5.r.b
        public void a() {
            this.f33136a.b();
        }

        @Override // b5.r.b
        public void b(V4.d dVar, Bitmap bitmap) throws IOException {
            IOException iOExceptionA = this.f33137b.a();
            if (iOExceptionA != null) {
                if (bitmap == null) {
                    throw iOExceptionA;
                }
                dVar.c(bitmap);
                throw iOExceptionA;
            }
        }
    }

    public X(r rVar, V4.b bVar) {
        this.f33134a = rVar;
        this.f33135b = bVar;
    }

    @Override // S4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public U4.v a(InputStream inputStream, int i10, int i11, S4.h hVar) {
        boolean z10;
        V v10;
        if (inputStream instanceof V) {
            v10 = (V) inputStream;
            z10 = false;
        } else {
            z10 = true;
            v10 = new V(inputStream, this.f33135b);
        }
        C5827d c5827dB = C5827d.b(v10);
        try {
            U4.v vVarF = this.f33134a.f(new o5.i(c5827dB), i10, i11, hVar, new a(v10, c5827dB));
            c5827dB.g();
            if (z10) {
                v10.g();
            }
            return vVarF;
        } finally {
        }
    }

    @Override // S4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, S4.h hVar) {
        return this.f33134a.p(inputStream);
    }
}
