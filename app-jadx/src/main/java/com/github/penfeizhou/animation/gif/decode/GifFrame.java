package com.github.penfeizhou.animation.gif.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.a;
import com.github.penfeizhou.animation.gif.io.GifReader;
import g8.C4862c;
import g8.C4868i;
import g8.j;
import h8.C4923a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class GifFrame extends a {
    private static final int DEFAULT_DELAY = 10;
    private static final ThreadLocal<byte[]> sDataBlock;
    public final C4862c colorTable;
    public final int disposalMethod;
    private final int imageDataOffset;
    private final boolean interlace;
    private final int lzwMinCodeSize;
    public final int transparentColorIndex;

    static {
        System.loadLibrary("animation-decoder-gif");
        sDataBlock = new ThreadLocal<>();
    }

    public GifFrame(GifReader gifReader, C4862c c4862c, C4868i c4868i, j jVar) {
        super(gifReader);
        if (c4868i != null) {
            this.disposalMethod = c4868i.c();
            int i10 = c4868i.f47381c;
            this.frameDuration = (i10 <= 0 ? DEFAULT_DELAY : i10) * DEFAULT_DELAY;
            if (c4868i.d()) {
                this.transparentColorIndex = c4868i.f47382d;
            } else {
                this.transparentColorIndex = -1;
            }
        } else {
            this.disposalMethod = 0;
            this.transparentColorIndex = -1;
        }
        this.frameX = jVar.f47383a;
        this.frameY = jVar.f47384b;
        this.frameWidth = jVar.f47385c;
        this.frameHeight = jVar.f47386d;
        this.interlace = jVar.b();
        if (jVar.c()) {
            this.colorTable = jVar.f47388f;
        } else {
            this.colorTable = c4862c;
        }
        this.lzwMinCodeSize = jVar.f47389g;
        this.imageDataOffset = jVar.f47390h;
    }

    private native void uncompressLZW(GifReader gifReader, int[] iArr, int i10, int[] iArr2, int i11, int i12, int i13, boolean z10, byte[] bArr);

    public void encode(int[] iArr, int i10) {
        ((GifReader) this.reader).reset();
        ((GifReader) this.reader).skip(this.imageDataOffset);
        ThreadLocal<byte[]> threadLocal = sDataBlock;
        byte[] bArr = threadLocal.get();
        if (bArr == null) {
            bArr = new byte[255];
            threadLocal.set(bArr);
        }
        uncompressLZW((GifReader) this.reader, this.colorTable.b(), this.transparentColorIndex, iArr, this.frameWidth / i10, this.frameHeight / i10, this.lzwMinCodeSize, this.interlace, bArr);
    }

    public boolean transparencyFlag() {
        return this.transparentColorIndex >= 0;
    }

    @Override // com.github.penfeizhou.animation.decode.a
    public Bitmap draw(Canvas canvas, Paint paint, int i10, Bitmap bitmap, C4923a c4923a) {
        try {
            c4923a.c((this.frameWidth * this.frameHeight) / (i10 * i10));
            encode(c4923a.b(), i10);
            bitmap.copyPixelsFromBuffer(c4923a.a().rewind());
            Rect rect = this.srcRect;
            rect.left = 0;
            rect.top = 0;
            rect.right = bitmap.getWidth();
            this.srcRect.bottom = bitmap.getHeight();
            Rect rect2 = this.dstRect;
            int i11 = this.frameX;
            float f10 = i10;
            rect2.left = (int) (i11 / f10);
            rect2.top = (int) (this.frameY / f10);
            rect2.right = (int) ((i11 / f10) + bitmap.getWidth());
            this.dstRect.bottom = (int) ((this.frameY / f10) + bitmap.getHeight());
            canvas.drawBitmap(bitmap, this.srcRect, this.dstRect, paint);
            return bitmap;
        } catch (Exception e10) {
            e10.printStackTrace();
            return bitmap;
        }
    }
}
