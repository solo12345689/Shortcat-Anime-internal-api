package com.facebook.imagepipeline.platform;

import B5.h;
import C5.a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.memory.d;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import y5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f36005c;

    public KitKatPurgeableDecoder(d dVar) {
        this.f36005c = dVar;
    }

    private static void h(byte[] bArr, int i10) {
        bArr[i10] = -1;
        bArr[i10 + 1] = -39;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap c(a aVar, BitmapFactory.Options options) {
        h hVar = (h) aVar.C();
        int size = hVar.size();
        a aVarA = this.f36005c.a(size);
        try {
            byte[] bArr = (byte[]) aVarA.C();
            hVar.u(0, bArr, 0, size);
            return (Bitmap) k.h(BitmapFactory.decodeByteArray(bArr, 0, size, options), "BitmapFactory returned null");
        } finally {
            a.m(aVarA);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(a aVar, int i10, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.e(aVar, i10) ? null : DalvikPurgeableDecoder.f35991b;
        h hVar = (h) aVar.C();
        k.b(Boolean.valueOf(i10 <= hVar.size()));
        int i11 = i10 + 2;
        a aVarA = this.f36005c.a(i11);
        try {
            byte[] bArr2 = (byte[]) aVarA.C();
            hVar.u(0, bArr2, 0, i10);
            if (bArr != null) {
                h(bArr2, i10);
                i10 = i11;
            }
            Bitmap bitmap = (Bitmap) k.h(BitmapFactory.decodeByteArray(bArr2, 0, i10, options), "BitmapFactory returned null");
            a.m(aVarA);
            return bitmap;
        } catch (Throwable th2) {
            a.m(aVarA);
            throw th2;
        }
    }
}
