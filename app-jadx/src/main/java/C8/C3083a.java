package c8;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.e;
import d8.C4570a;
import j8.InterfaceC5342b;
import org.aomedia.avif.android.AvifDecoder;

/* JADX INFO: renamed from: c8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3083a extends com.github.penfeizhou.animation.decode.b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AvifDecoder f33543w;

    public C3083a(InterfaceC5342b interfaceC5342b, b.j jVar) {
        super(interfaceC5342b, jVar);
        this.f33543w = null;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    public int B() {
        return 1;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected /* bridge */ /* synthetic */ e C() {
        X();
        return null;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void M() {
        AvifDecoder avifDecoder = this.f33543w;
        if (avifDecoder != null) {
            avifDecoder.release();
            this.f33543w = null;
        }
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void O(com.github.penfeizhou.animation.decode.a aVar) {
        Bitmap bitmapI = I(this.f33543w.getWidth(), this.f33543w.getHeight());
        AvifDecoder avifDecoder = this.f33543w;
        if (avifDecoder == null) {
            return;
        }
        int i10 = this.f38750e;
        int i11 = ((b) aVar).f33544a;
        if (i10 != i11) {
            avifDecoder.nthFrame(i11, bitmapI);
        } else if (i10 == 0) {
            avifDecoder.nthFrame(0, bitmapI);
        } else {
            avifDecoder.nextFrame(bitmapI);
        }
        this.f38760o.rewind();
        try {
            bitmapI.copyPixelsToBuffer(this.f38760o);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        L(bitmapI);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public C4570a A(Reader reader) {
        return new C4570a(reader);
    }

    protected d8.b X() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Rect K(C4570a c4570a) {
        this.f33543w = AvifDecoder.create(c4570a.a());
        return new Rect(0, 0, this.f33543w.getWidth(), this.f33543w.getHeight());
    }

    @Override // com.github.penfeizhou.animation.decode.b
    public com.github.penfeizhou.animation.decode.a u(int i10) {
        b bVar = new b(null);
        bVar.f33544a = i10;
        bVar.frameDuration = (int) (this.f33543w.getFrameDurations()[i10] * 1000.0d);
        return bVar;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    public Bitmap v(int i10) {
        if (this.f33543w == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(s().width() / B(), s().height() / B(), Bitmap.Config.ARGB_8888);
        this.f33543w.nthFrame(i10, bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    public int w() {
        AvifDecoder avifDecoder = this.f33543w;
        if (avifDecoder == null) {
            return 0;
        }
        return avifDecoder.getFrameCount();
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int x() {
        AvifDecoder avifDecoder = this.f33543w;
        if (avifDecoder == null) {
            return 0;
        }
        if (avifDecoder.getFrameCount() == 1) {
            return 1;
        }
        return this.f33543w.getRepetitionCount();
    }
}
