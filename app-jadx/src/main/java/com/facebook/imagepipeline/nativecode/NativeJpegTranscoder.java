package com.facebook.imagepipeline.nativecode;

import android.graphics.ColorSpace;
import java.io.InputStream;
import java.io.OutputStream;
import y5.AbstractC7204b;
import y5.k;
import y6.g;
import y6.h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class NativeJpegTranscoder implements M6.c {

    /* JADX INFO: renamed from: a */
    private boolean f35993a;

    /* JADX INFO: renamed from: b */
    private int f35994b;

    /* JADX INFO: renamed from: c */
    private boolean f35995c;

    public NativeJpegTranscoder(boolean z10, int i10, boolean z11, boolean z12) {
        this.f35993a = z10;
        this.f35994b = i10;
        this.f35995c = z11;
        if (z12) {
            d.a();
        }
    }

    public static void e(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12) {
        d.a();
        k.b(Boolean.valueOf(i11 >= 1));
        k.b(Boolean.valueOf(i11 <= 16));
        k.b(Boolean.valueOf(i12 >= 0));
        k.b(Boolean.valueOf(i12 <= 100));
        k.b(Boolean.valueOf(M6.e.j(i10)));
        k.c((i11 == 8 && i10 == 0) ? false : true, "no transformation requested");
        nativeTranscodeJpeg((InputStream) k.g(inputStream), (OutputStream) k.g(outputStream), i10, i11, i12);
    }

    public static void f(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12) {
        d.a();
        k.b(Boolean.valueOf(i11 >= 1));
        k.b(Boolean.valueOf(i11 <= 16));
        k.b(Boolean.valueOf(i12 >= 0));
        k.b(Boolean.valueOf(i12 <= 100));
        k.b(Boolean.valueOf(M6.e.i(i10)));
        k.c((i11 == 8 && i10 == 1) ? false : true, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) k.g(inputStream), (OutputStream) k.g(outputStream), i10, i11, i12);
    }

    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12);

    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12);

    @Override // M6.c
    public String a() {
        return "NativeJpegTranscoder";
    }

    @Override // M6.c
    public M6.b b(E6.k kVar, OutputStream outputStream, h hVar, g gVar, q6.c cVar, Integer num, ColorSpace colorSpace) {
        if (num == null) {
            num = 85;
        }
        if (hVar == null) {
            hVar = h.c();
        }
        int iB = M6.a.b(hVar, gVar, kVar, this.f35994b);
        try {
            int iF = M6.e.f(hVar, gVar, kVar, this.f35993a);
            int iA = M6.e.a(iB);
            if (this.f35995c) {
                iF = iA;
            }
            InputStream inputStreamQ = kVar.q();
            if (M6.e.f12235b.contains(Integer.valueOf(kVar.U0()))) {
                f((InputStream) k.h(inputStreamQ, "Cannot transcode from null input stream!"), outputStream, M6.e.d(hVar, kVar), iF, num.intValue());
            } else {
                e((InputStream) k.h(inputStreamQ, "Cannot transcode from null input stream!"), outputStream, M6.e.e(hVar, kVar), iF, num.intValue());
            }
            AbstractC7204b.b(inputStreamQ);
            return new M6.b(iB != 1 ? 0 : 1);
        } catch (Throwable th2) {
            AbstractC7204b.b(null);
            throw th2;
        }
    }

    @Override // M6.c
    public boolean c(E6.k kVar, h hVar, g gVar) {
        if (hVar == null) {
            hVar = h.c();
        }
        return M6.e.f(hVar, gVar, kVar, this.f35993a) < 8;
    }

    @Override // M6.c
    public boolean d(q6.c cVar) {
        return cVar == q6.b.f57656b;
    }
}
