package g5;

import S4.h;
import U4.v;
import android.graphics.Bitmap;
import c5.C3077b;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: g5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C4850a implements InterfaceC4854e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap.CompressFormat f47344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47345b;

    public C4850a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // g5.InterfaceC4854e
    public v a(v vVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) vVar.get()).compress(this.f47344a, this.f47345b, byteArrayOutputStream);
        vVar.recycle();
        return new C3077b(byteArrayOutputStream.toByteArray());
    }

    public C4850a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f47344a = compressFormat;
        this.f47345b = i10;
    }
}
