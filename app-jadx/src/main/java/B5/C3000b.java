package b5;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* JADX INFO: renamed from: b5.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3000b implements S4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V4.d f33146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S4.k f33147b;

    public C3000b(V4.d dVar, S4.k kVar) {
        this.f33146a = dVar;
        this.f33147b = kVar;
    }

    @Override // S4.k
    public S4.c a(S4.h hVar) {
        return this.f33147b.a(hVar);
    }

    @Override // S4.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(U4.v vVar, File file, S4.h hVar) {
        return this.f33147b.b(new C3005g(((BitmapDrawable) vVar.get()).getBitmap(), this.f33146a), file, hVar);
    }
}
