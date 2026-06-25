package g5;

import S4.h;
import U4.v;
import android.content.res.Resources;
import b5.T;
import o5.k;

/* JADX INFO: renamed from: g5.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C4851b implements InterfaceC4854e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f47346a;

    public C4851b(Resources resources) {
        this.f47346a = (Resources) k.e(resources);
    }

    @Override // g5.InterfaceC4854e
    public v a(v vVar, h hVar) {
        return T.c(this.f47346a, vVar);
    }
}
