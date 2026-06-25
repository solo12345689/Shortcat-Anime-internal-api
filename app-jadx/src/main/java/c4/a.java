package C4;

import G4.m;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f2859a;

    public a(boolean z10) {
        this.f2859a = z10;
    }

    @Override // C4.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(File file, m mVar) {
        if (!this.f2859a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
