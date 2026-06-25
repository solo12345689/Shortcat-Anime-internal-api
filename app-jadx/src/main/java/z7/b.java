package Z7;

import Z7.d;
import a8.C2585a;
import a8.C2586b;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.io.Reader;
import j8.InterfaceC5342b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends com.github.penfeizhou.animation.decode.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final String f23194A = "b";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private C2586b f23195w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f23196x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Paint f23197y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final C0400b f23198z;

    /* JADX INFO: renamed from: Z7.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class C0400b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        byte f23199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Rect f23200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ByteBuffer f23201c;

        private C0400b() {
            this.f23200b = new Rect();
        }
    }

    public b(InterfaceC5342b interfaceC5342b, b.j jVar) {
        super(interfaceC5342b, jVar);
        Paint paint = new Paint();
        this.f23197y = paint;
        this.f23198z = new C0400b();
        paint.setAntiAlias(true);
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void M() {
        this.f23198z.f23201c = null;
        this.f23195w = null;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void O(com.github.penfeizhou.animation.decode.a aVar) {
        if (aVar == null || this.f38761p == null) {
            return;
        }
        try {
            Bitmap bitmapI = I(this.f38761p.width() / this.f38756k, this.f38761p.height() / this.f38756k);
            Canvas canvas = (Canvas) this.f38759n.get(bitmapI);
            if (canvas == null) {
                canvas = new Canvas(bitmapI);
                this.f38759n.put(bitmapI, canvas);
            }
            Canvas canvas2 = canvas;
            if (aVar instanceof c) {
                this.f38760o.rewind();
                bitmapI.copyPixelsFromBuffer(this.f38760o);
                if (this.f38750e == 0) {
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                } else {
                    canvas2.save();
                    canvas2.clipRect(this.f23198z.f23200b);
                    C0400b c0400b = this.f23198z;
                    byte b10 = c0400b.f23199a;
                    if (b10 == 1) {
                        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                    } else if (b10 == 2) {
                        c0400b.f23201c.rewind();
                        bitmapI.copyPixelsFromBuffer(this.f23198z.f23201c);
                    }
                    canvas2.restore();
                }
                if (((c) aVar).f23206b == 2) {
                    C0400b c0400b2 = this.f23198z;
                    if (c0400b2.f23199a != 2) {
                        c0400b2.f23201c.rewind();
                        bitmapI.copyPixelsToBuffer(this.f23198z.f23201c);
                    }
                }
                this.f23198z.f23199a = ((c) aVar).f23206b;
                canvas2.save();
                if (((c) aVar).f23205a == 0) {
                    int i10 = aVar.frameX;
                    int i11 = this.f38756k;
                    int i12 = aVar.frameY;
                    canvas2.clipRect(i10 / i11, i12 / i11, (i10 + aVar.frameWidth) / i11, (i12 + aVar.frameHeight) / i11);
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                }
                Rect rect = this.f23198z.f23200b;
                int i13 = aVar.frameX;
                int i14 = this.f38756k;
                int i15 = aVar.frameY;
                rect.set(i13 / i14, i15 / i14, (i13 + aVar.frameWidth) / i14, (i15 + aVar.frameHeight) / i14);
                canvas2.restore();
            }
            Bitmap bitmapI2 = I(aVar.frameWidth, aVar.frameHeight);
            L(aVar.draw(canvas2, this.f23197y, this.f38756k, bitmapI2, C()));
            L(bitmapI2);
            this.f38760o.rewind();
            bitmapI.copyPixelsToBuffer(this.f38760o);
            L(bitmapI);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public C2585a A(Reader reader) {
        return new C2585a(reader);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public C2586b C() {
        if (this.f23195w == null) {
            this.f23195w = new C2586b();
        }
        return this.f23195w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Rect K(C2585a c2585a) throws d.a {
        List listB = d.b(c2585a);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[0];
        Iterator it = listB.iterator();
        c cVar = null;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            e eVar = (e) it.next();
            boolean z11 = eVar instanceof i;
            if (z11) {
                Log.e(f23194A, "chunk read reach to end");
                break;
            }
            if (eVar instanceof Z7.a) {
                this.f23196x = ((Z7.a) eVar).f23193f;
                z10 = true;
            } else if (eVar instanceof f) {
                cVar = new c(c2585a, (f) eVar);
                cVar.f23209e = arrayList;
                cVar.f23207c = bArr;
                this.f38749d.add(cVar);
            } else if (eVar instanceof g) {
                if (cVar != null) {
                    cVar.f23208d.add(eVar);
                }
            } else if (eVar instanceof h) {
                if (!z10) {
                    k kVar = new k(c2585a);
                    kVar.frameWidth = i10;
                    kVar.frameHeight = i11;
                    this.f38749d.add(kVar);
                    this.f23196x = 1;
                    break;
                }
                if (cVar != null) {
                    cVar.f23208d.add(eVar);
                }
            } else if (eVar instanceof j) {
                j jVar = (j) eVar;
                i10 = jVar.f23229e;
                i11 = jVar.f23230f;
                bArr = jVar.f23231g;
            } else if (!z11) {
                arrayList.add(eVar);
            }
        }
        int i12 = i10 * i11;
        int i13 = this.f38756k;
        this.f38760o = ByteBuffer.allocate(((i12 / (i13 * i13)) + 1) * 4);
        C0400b c0400b = this.f23198z;
        int i14 = this.f38756k;
        c0400b.f23201c = ByteBuffer.allocate(((i12 / (i14 * i14)) + 1) * 4);
        return new Rect(0, 0, i10, i11);
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int x() {
        return this.f23196x;
    }
}
