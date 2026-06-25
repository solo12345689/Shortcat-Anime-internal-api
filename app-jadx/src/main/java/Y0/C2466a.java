package Y0;

import Y0.K;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Y0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2466a extends AbstractC2475j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AssetManager f22645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f22646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f22647j;

    public /* synthetic */ C2466a(AssetManager assetManager, String str, L l10, int i10, K.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetManager, str, l10, i10, dVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2466a)) {
            return false;
        }
        C2466a c2466a = (C2466a) obj;
        return AbstractC5504s.c(this.f22646i, c2466a.f22646i) && AbstractC5504s.c(e(), c2466a.e());
    }

    @Override // Y0.AbstractC2475j
    public Typeface f(Context context) {
        return Build.VERSION.SDK_INT >= 26 ? m0.f22695a.a(this.f22645h, this.f22646i, context, e()) : Typeface.createFromAsset(this.f22645h, this.f22646i);
    }

    public int hashCode() {
        return (this.f22646i.hashCode() * 31) + e().hashCode();
    }

    public String toString() {
        return "Font(assetManager, path=" + this.f22646i + ", weight=" + b() + ", style=" + ((Object) H.h(c())) + ')';
    }

    private C2466a(AssetManager assetManager, String str, L l10, int i10, K.d dVar) {
        super(l10, i10, dVar, null);
        this.f22645h = assetManager;
        this.f22646i = str;
        h(f(null));
        this.f22647j = "asset:" + str;
    }
}
