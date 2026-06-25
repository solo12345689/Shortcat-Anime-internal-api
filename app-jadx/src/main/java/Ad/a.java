package Ad;

import android.graphics.Color;
import expo.modules.updates.reloadscreen.ImageResizeMode;
import expo.modules.updates.reloadscreen.ReloadScreenImageSource;
import expo.modules.updates.reloadscreen.ReloadScreenOptions;
import expo.modules.updates.reloadscreen.SpinnerOptions;
import expo.modules.updates.reloadscreen.SpinnerSize;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0008a f369g = new C0008a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReloadScreenImageSource f371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ImageResizeMode f372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f375f;

    /* JADX INFO: renamed from: Ad.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0008a {
        public /* synthetic */ C0008a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(ReloadScreenOptions reloadScreenOptions) {
            String backgroundColor;
            ImageResizeMode imageResizeMode;
            String color;
            SpinnerSize size;
            SpinnerOptions spinner;
            SpinnerOptions spinner2;
            SpinnerOptions spinner3;
            Boolean enabled;
            Boolean fade;
            Boolean imageFullScreen;
            boolean zBooleanValue = true;
            boolean z10 = (reloadScreenOptions != null ? reloadScreenOptions.getImage() : null) != null;
            if (reloadScreenOptions == null || (backgroundColor = reloadScreenOptions.getBackgroundColor()) == null) {
                backgroundColor = "#ffffff";
            }
            int color2 = Color.parseColor(backgroundColor);
            ReloadScreenImageSource image = reloadScreenOptions != null ? reloadScreenOptions.getImage() : null;
            if (reloadScreenOptions == null || (imageResizeMode = reloadScreenOptions.getImageResizeMode()) == null) {
                imageResizeMode = ImageResizeMode.CONTAIN;
            }
            ImageResizeMode imageResizeMode2 = imageResizeMode;
            boolean zBooleanValue2 = (reloadScreenOptions == null || (imageFullScreen = reloadScreenOptions.getImageFullScreen()) == null) ? false : imageFullScreen.booleanValue();
            boolean zBooleanValue3 = (reloadScreenOptions == null || (fade = reloadScreenOptions.getFade()) == null) ? false : fade.booleanValue();
            if (reloadScreenOptions != null && (spinner3 = reloadScreenOptions.getSpinner()) != null && (enabled = spinner3.getEnabled()) != null) {
                zBooleanValue = enabled.booleanValue();
            } else if (z10) {
                zBooleanValue = false;
            }
            if (reloadScreenOptions == null || (spinner2 = reloadScreenOptions.getSpinner()) == null || (color = spinner2.getColor()) == null) {
                color = "#007aff";
            }
            int color3 = Color.parseColor(color);
            if (reloadScreenOptions == null || (spinner = reloadScreenOptions.getSpinner()) == null || (size = spinner.getSize()) == null) {
                size = SpinnerSize.MEDIUM;
            }
            return new a(color2, image, imageResizeMode2, zBooleanValue2, zBooleanValue3, new f(zBooleanValue, color3, size));
        }

        private C0008a() {
        }
    }

    public a(int i10, ReloadScreenImageSource reloadScreenImageSource, ImageResizeMode imageResizeMode, boolean z10, boolean z11, f spinner) {
        AbstractC5504s.h(imageResizeMode, "imageResizeMode");
        AbstractC5504s.h(spinner, "spinner");
        this.f370a = i10;
        this.f371b = reloadScreenImageSource;
        this.f372c = imageResizeMode;
        this.f373d = z10;
        this.f374e = z11;
        this.f375f = spinner;
    }

    public final int a() {
        return this.f370a;
    }

    public final boolean b() {
        return this.f374e;
    }

    public final ReloadScreenImageSource c() {
        return this.f371b;
    }

    public final boolean d() {
        return this.f373d;
    }

    public final ImageResizeMode e() {
        return this.f372c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f370a == aVar.f370a && AbstractC5504s.c(this.f371b, aVar.f371b) && this.f372c == aVar.f372c && this.f373d == aVar.f373d && this.f374e == aVar.f374e && AbstractC5504s.c(this.f375f, aVar.f375f);
    }

    public final f f() {
        return this.f375f;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f370a) * 31;
        ReloadScreenImageSource reloadScreenImageSource = this.f371b;
        return ((((((((iHashCode + (reloadScreenImageSource == null ? 0 : reloadScreenImageSource.hashCode())) * 31) + this.f372c.hashCode()) * 31) + Boolean.hashCode(this.f373d)) * 31) + Boolean.hashCode(this.f374e)) * 31) + this.f375f.hashCode();
    }

    public String toString() {
        return "ReloadScreenConfiguration(backgroundColor=" + this.f370a + ", image=" + this.f371b + ", imageResizeMode=" + this.f372c + ", imageFullScreen=" + this.f373d + ", fade=" + this.f374e + ", spinner=" + this.f375f + ")";
    }
}
