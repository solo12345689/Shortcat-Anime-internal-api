package Q4;

import S4.h;
import S4.j;
import U4.v;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.util.List;
import o5.AbstractC5824a;
import o5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f14365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f14366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V4.b f14367c;

    public b(List list, a aVar, V4.b bVar) {
        this.f14365a = list;
        this.f14366b = (a) k.e(aVar);
        this.f14367c = (V4.b) k.e(bVar);
    }

    @Override // S4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v a(InputStream inputStream, int i10, int i11, h hVar) {
        return this.f14366b.a(AbstractC5824a.b(inputStream), i10, i11, hVar);
    }

    @Override // S4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, h hVar) {
        ImageHeaderParser.ImageType imageTypeF = com.bumptech.glide.load.a.f(this.f14365a, inputStream, this.f14367c);
        return imageTypeF.equals(ImageHeaderParser.ImageType.AVIF) || imageTypeF.equals(ImageHeaderParser.ImageType.ANIMATED_AVIF);
    }
}
