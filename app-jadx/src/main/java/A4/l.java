package A4;

import A4.i;
import Df.r;
import Td.C2160k;
import Ud.AbstractC2279u;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.K;
import v4.InterfaceC6845d;
import x4.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f303c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G4.m f305b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements i.a {
        private final boolean c(Uri uri) {
            return AbstractC5504s.c(uri.getScheme(), "android.resource");
        }

        @Override // A4.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Uri uri, G4.m mVar, InterfaceC6845d interfaceC6845d) {
            if (c(uri)) {
                return new l(uri, mVar);
            }
            return null;
        }
    }

    public l(Uri uri, G4.m mVar) {
        this.f304a = uri;
        this.f305b = mVar;
    }

    private final Void b(Uri uri) {
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }

    @Override // A4.i
    public Object a(Zd.e eVar) {
        Integer numR;
        String authority = this.f304a.getAuthority();
        if (authority != null) {
            if (r.l0(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) AbstractC2279u.A0(this.f304a.getPathSegments());
                if (str == null || (numR = r.r(str)) == null) {
                    b(this.f304a);
                    throw new C2160k();
                }
                int iIntValue = numR.intValue();
                Context contextG = this.f305b.g();
                Resources resources = AbstractC5504s.c(authority, contextG.getPackageName()) ? contextG.getResources() : contextG.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String strJ = L4.j.j(MimeTypeMap.getSingleton(), charSequence.subSequence(r.o0(charSequence, '/', 0, false, 6, null), charSequence.length()).toString());
                if (!AbstractC5504s.c(strJ, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new m(q.b(K.d(K.k(resources.openRawResource(iIntValue, typedValue2))), contextG, new x4.r(authority, iIntValue, typedValue2.density)), strJ, x4.f.DISK);
                }
                Drawable drawableA = AbstractC5504s.c(authority, contextG.getPackageName()) ? L4.d.a(contextG, iIntValue) : L4.d.d(contextG, resources, iIntValue);
                boolean zT = L4.j.t(drawableA);
                if (zT) {
                    drawableA = new BitmapDrawable(contextG.getResources(), L4.l.f11282a.a(drawableA, this.f305b.f(), this.f305b.n(), this.f305b.m(), this.f305b.c()));
                }
                return new g(drawableA, zT, x4.f.DISK);
            }
        }
        b(this.f304a);
        throw new C2160k();
    }
}
