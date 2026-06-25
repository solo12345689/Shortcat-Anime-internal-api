package b5;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import o5.AbstractC5824a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class S implements S4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3004f f33122a = new C3004f();

    @Override // S4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public U4.v a(InputStream inputStream, int i10, int i11, S4.h hVar) {
        return this.f33122a.c(ImageDecoder.createSource(AbstractC5824a.b(inputStream)), i10, i11, hVar);
    }

    @Override // S4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, S4.h hVar) {
        return true;
    }
}
