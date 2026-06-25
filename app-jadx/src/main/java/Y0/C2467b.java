package Y0;

import Y0.K;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Y0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2467b extends AbstractC2475j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final File f22648h;

    public /* synthetic */ C2467b(File file, L l10, int i10, K.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, l10, i10, dVar);
    }

    @Override // Y0.AbstractC2475j
    public Typeface f(Context context) {
        return Build.VERSION.SDK_INT >= 26 ? m0.f22695a.b(this.f22648h, context, e()) : Typeface.createFromFile(this.f22648h);
    }

    public String toString() {
        return "Font(file=" + this.f22648h + ", weight=" + b() + ", style=" + ((Object) H.h(c())) + ')';
    }

    private C2467b(File file, L l10, int i10, K.d dVar) {
        super(l10, i10, dVar, null);
        this.f22648h = file;
        h(f(null));
    }
}
