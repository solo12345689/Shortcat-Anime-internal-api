package E3;

import E3.C1323b;
import E3.U6;
import F3.a;
import F3.j;
import F3.l;
import F3.m;
import F3.n;
import F3.v;
import P9.AbstractC2011u;
import P9.AbstractC2013w;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q2.C6071C;
import q2.C6077I;
import q2.C6081M;
import q2.C6082N;
import q2.C6083O;
import q2.C6087b;
import q2.C6088c;
import q2.C6101p;
import q2.C6111z;
import q2.InterfaceC6084P;
import q2.Y;
import t2.AbstractC6614a;
import t2.AbstractC6635w;

/* JADX INFO: renamed from: E3.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1466t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2013w f5527a = AbstractC2013w.G("android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.DURATION", "android.media.metadata.ALBUM", "android.media.metadata.AUTHOR", "android.media.metadata.WRITER", "android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");

    /* JADX INFO: renamed from: E3.t$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b extends Exception {
        private b(String str) {
            super(str);
        }
    }

    public static C6077I A(F3.l lVar, int i10) {
        return B(lVar, i10, false, true);
    }

    private static C6077I B(F3.l lVar, int i10, boolean z10, boolean z11) {
        byte[] bArrF;
        if (lVar == null) {
            return C6077I.f56472K;
        }
        C6077I.b bVar = new C6077I.b();
        bVar.o0(lVar.i()).W(lVar.b()).S(lVar.e()).u0(R(F3.w.m(i10)));
        Bitmap bitmapD = lVar.d();
        if (bitmapD != null) {
            try {
                bArrF = f(bitmapD);
            } catch (IOException e10) {
                AbstractC6635w.j("LegacyConversions", "Failed to convert iconBitmap to artworkData", e10);
                bArrF = null;
            }
            bVar.R(bArrF, 3);
        }
        Bundle bundleC = lVar.c();
        Bundle bundle = bundleC != null ? new Bundle(bundleC) : null;
        if (bundle != null && bundle.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            bVar.b0(Integer.valueOf(l(bundle.getLong("android.media.extra.BT_FOLDER_TYPE"))));
            bundle.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        bVar.d0(Boolean.valueOf(z10));
        if (bundle != null && bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            bVar.f0(Integer.valueOf((int) bundle.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")));
            bundle.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null && bundle.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            bVar.p0(AbstractC2011u.w((Collection) AbstractC6614a.e(bundle.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST"))));
        }
        if (bundle == null || !bundle.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            bVar.q0(lVar.j());
        } else {
            bVar.q0(bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title"));
            bVar.Y(lVar.j());
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle != null && !bundle.isEmpty()) {
            bVar.a0(bundle);
        }
        bVar.e0(Boolean.valueOf(z11));
        return bVar.J();
    }

    public static C6077I C(F3.m mVar, int i10) {
        CharSequence charSequenceI;
        CharSequence charSequenceI2;
        if (mVar == null) {
            return C6077I.f56472K;
        }
        C6077I.b bVar = new C6077I.b();
        CharSequence charSequenceI3 = mVar.i("android.media.metadata.DISPLAY_TITLE");
        if (charSequenceI3 != null) {
            charSequenceI2 = mVar.i("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceI = mVar.i("android.media.metadata.DISPLAY_DESCRIPTION");
        } else {
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i11 = 0;
            int i12 = 0;
            while (i11 < 3) {
                String[] strArr = F3.m.f6437d;
                if (i12 >= strArr.length) {
                    break;
                }
                int i13 = i12 + 1;
                CharSequence charSequenceI4 = mVar.i(strArr[i12]);
                if (!TextUtils.isEmpty(charSequenceI4)) {
                    charSequenceArr[i11] = charSequenceI4;
                    i11++;
                }
                i12 = i13;
            }
            CharSequence charSequence = charSequenceArr[0];
            CharSequence charSequence2 = charSequenceArr[1];
            charSequenceI = charSequenceArr[2];
            charSequenceI3 = charSequence;
            charSequenceI2 = charSequence2;
        }
        CharSequence charSequenceI5 = mVar.i("android.media.metadata.TITLE");
        if (charSequenceI5 == null) {
            charSequenceI5 = charSequenceI3;
        }
        bVar.q0(charSequenceI5).Y(charSequenceI3).o0(charSequenceI2).W(charSequenceI).Q(mVar.i("android.media.metadata.ARTIST")).P(mVar.i("android.media.metadata.ALBUM")).O(mVar.i("android.media.metadata.ALBUM_ARTIST")).g0(R(mVar.g("android.media.metadata.RATING")));
        if (mVar.a("android.media.metadata.DURATION")) {
            long jE = mVar.e("android.media.metadata.DURATION");
            if (jE >= 0) {
                bVar.Z(Long.valueOf(jE));
            }
        }
        q2.S sR = R(mVar.g("android.media.metadata.USER_RATING"));
        if (sR != null) {
            bVar.u0(sR);
        } else {
            bVar.u0(R(F3.w.m(i10)));
        }
        if (mVar.a("android.media.metadata.YEAR")) {
            bVar.j0(Integer.valueOf((int) mVar.e("android.media.metadata.YEAR")));
        }
        String strE0 = e0(mVar, "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.ART_URI");
        if (strE0 != null) {
            bVar.S(Uri.parse(strE0));
        }
        Bitmap bitmapD0 = d0(mVar, "android.media.metadata.DISPLAY_ICON", "android.media.metadata.ALBUM_ART", "android.media.metadata.ART");
        if (bitmapD0 != null) {
            try {
                bVar.R(f(bitmapD0), 3);
            } catch (IOException e10) {
                AbstractC6635w.j("LegacyConversions", "Failed to convert artworkBitmap to artworkData", e10);
            }
        }
        boolean zA = mVar.a("android.media.metadata.BT_FOLDER_TYPE");
        bVar.d0(Boolean.valueOf(zA));
        if (zA) {
            bVar.b0(Integer.valueOf(l(mVar.e("android.media.metadata.BT_FOLDER_TYPE"))));
        }
        if (mVar.a("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            bVar.f0(Integer.valueOf((int) mVar.e("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")));
        }
        bVar.e0(Boolean.TRUE);
        Bundle bundleD = mVar.d();
        P9.X it = f5527a.iterator();
        while (it.hasNext()) {
            bundleD.remove((String) it.next());
        }
        if (!bundleD.isEmpty()) {
            bVar.a0(bundleD);
        }
        return bVar.J();
    }

    public static C6077I D(CharSequence charSequence) {
        return charSequence == null ? C6077I.f56472K : new C6077I.b().q0(charSequence).J();
    }

    public static F3.m E(C6077I c6077i, String str, Uri uri, long j10, Bitmap bitmap) {
        Long l10;
        m.b bVarE = new m.b().e("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = c6077i.f56518a;
        if (charSequence != null) {
            bVarE.f("android.media.metadata.TITLE", charSequence);
        }
        CharSequence charSequence2 = c6077i.f56522e;
        if (charSequence2 != null) {
            bVarE.f("android.media.metadata.DISPLAY_TITLE", charSequence2);
        }
        CharSequence charSequence3 = c6077i.f56523f;
        if (charSequence3 != null) {
            bVarE.f("android.media.metadata.DISPLAY_SUBTITLE", charSequence3);
        }
        CharSequence charSequence4 = c6077i.f56524g;
        if (charSequence4 != null) {
            bVarE.f("android.media.metadata.DISPLAY_DESCRIPTION", charSequence4);
        }
        CharSequence charSequence5 = c6077i.f56519b;
        if (charSequence5 != null) {
            bVarE.f("android.media.metadata.ARTIST", charSequence5);
        }
        CharSequence charSequence6 = c6077i.f56520c;
        if (charSequence6 != null) {
            bVarE.f("android.media.metadata.ALBUM", charSequence6);
        }
        CharSequence charSequence7 = c6077i.f56521d;
        if (charSequence7 != null) {
            bVarE.f("android.media.metadata.ALBUM_ARTIST", charSequence7);
        }
        if (c6077i.f56537t != null) {
            bVarE.c("android.media.metadata.YEAR", r0.intValue());
        }
        if (uri != null) {
            bVarE.e("android.media.metadata.MEDIA_URI", uri.toString());
        }
        Uri uri2 = c6077i.f56530m;
        if (uri2 != null) {
            bVarE.e("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            bVarE.e("android.media.metadata.ALBUM_ART_URI", c6077i.f56530m.toString());
            bVarE.e("android.media.metadata.ART_URI", c6077i.f56530m.toString());
        }
        if (bitmap != null) {
            bVarE.b("android.media.metadata.DISPLAY_ICON", bitmap);
            bVarE.b("android.media.metadata.ALBUM_ART", bitmap);
        }
        Integer num = c6077i.f56533p;
        if (num != null && num.intValue() != -1) {
            bVarE.c("android.media.metadata.BT_FOLDER_TYPE", k(c6077i.f56533p.intValue()));
        }
        if (j10 == -9223372036854775807L && (l10 = c6077i.f56525h) != null) {
            j10 = l10.longValue();
        }
        if (j10 == -9223372036854775807L) {
            j10 = -1;
        }
        bVarE.c("android.media.metadata.DURATION", j10);
        F3.w wVarS = S(c6077i.f56526i);
        if (wVarS != null) {
            bVarE.d("android.media.metadata.USER_RATING", wVarS);
        }
        F3.w wVarS2 = S(c6077i.f56527j);
        if (wVarS2 != null) {
            bVarE.d("android.media.metadata.RATING", wVarS2);
        }
        if (c6077i.f56515H != null) {
            bVarE.c("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", r5.intValue());
        }
        Bundle bundle = c6077i.f56516I;
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = c6077i.f56516I.get(str2);
                if (obj == null || (obj instanceof CharSequence)) {
                    bVarE.f(str2, (CharSequence) obj);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    bVarE.c(str2, ((Number) obj).longValue());
                }
            }
        }
        return bVarE.a();
    }

    public static Y.b F(int i10) {
        Y.b bVar = new Y.b();
        bVar.u(null, null, i10, -9223372036854775807L, 0L, C6087b.f56707g, true);
        return bVar;
    }

    public static boolean G(F3.v vVar) {
        if (vVar == null) {
            return false;
        }
        switch (vVar.o()) {
        }
        return false;
    }

    public static C6082N H(F3.v vVar, Context context) {
        if (vVar == null || vVar.o() != 7) {
            return null;
        }
        CharSequence charSequenceH = vVar.h();
        if (charSequenceH == null) {
            charSequenceH = i0(X(vVar.g()), context);
        }
        Bundle bundleI = vVar.i();
        String string = charSequenceH != null ? charSequenceH.toString() : null;
        int I10 = I(vVar.g());
        if (bundleI == null) {
            bundleI = Bundle.EMPTY;
        }
        return new C6082N(string, null, I10, bundleI);
    }

    private static int I(int i10) {
        int iX = X(i10);
        if (iX == -5) {
            return 2000;
        }
        if (iX != -1) {
            return iX;
        }
        return 1000;
    }

    public static C6083O J(F3.v vVar) {
        return vVar == null ? C6083O.f56598d : new C6083O(vVar.k());
    }

    public static int K(F3.v vVar, F3.m mVar, long j10) {
        if (vVar == null) {
            return 1;
        }
        boolean zN = n(vVar, mVar, j10);
        switch (vVar.o()) {
            case 1:
                if (zN) {
                    return 4;
                }
            case 0:
            case 7:
            case 8:
                return 1;
            case 2:
                return zN ? 4 : 3;
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
                return 2;
            default:
                throw new b("Invalid state of PlaybackStateCompat: " + vVar.o());
        }
    }

    public static int L(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                AbstractC6635w.i("LegacyConversions", "Unrecognized RepeatMode: " + i10 + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                return 0;
            }
        }
        return i11;
    }

    public static int N(InterfaceC6084P interfaceC6084P, boolean z10) {
        if (interfaceC6084P.y() != null) {
            return 7;
        }
        int iP = interfaceC6084P.p();
        if (iP == 1) {
            return 0;
        }
        if (iP == 2) {
            return z10 ? 2 : 6;
        }
        if (iP == 3) {
            return z10 ? 2 : 3;
        }
        if (iP == 4) {
            return 1;
        }
        throw new IllegalArgumentException("Unrecognized State: " + iP);
    }

    public static InterfaceC6084P.b O(F3.v vVar, int i10, long j10, boolean z10) {
        InterfaceC6084P.b.a aVar = new InterfaceC6084P.b.a();
        long jB = vVar == null ? 0L : vVar.b();
        boolean zG = G(vVar);
        if ((k0(jB, 4L) && !zG) || ((k0(jB, 2L) && zG) || k0(jB, 512L))) {
            aVar.a(1);
        }
        if (k0(jB, 16384L)) {
            aVar.a(2);
        }
        if ((k0(jB, 32768L) && k0(jB, 1024L)) || ((k0(jB, 65536L) && k0(jB, 2048L)) || (k0(jB, 131072L) && k0(jB, 8192L)))) {
            aVar.c(31, 2);
        }
        if (k0(jB, 8L)) {
            aVar.a(11);
        }
        if (k0(jB, 64L)) {
            aVar.a(12);
        }
        if (k0(jB, 256L)) {
            aVar.c(5, 4);
        }
        if (k0(jB, 32L)) {
            aVar.c(9, 8);
        }
        if (k0(jB, 16L)) {
            aVar.c(7, 6);
        }
        if (k0(jB, 4194304L)) {
            aVar.a(13);
        }
        if (k0(jB, 1L)) {
            aVar.a(3);
        }
        if (i10 == 1) {
            aVar.c(26, 34);
        } else if (i10 == 2) {
            aVar.c(26, 34, 25, 33);
        }
        aVar.c(23, 17, 18, 16, 21, 32);
        if ((j10 & 4) != 0) {
            aVar.a(20);
            if (k0(jB, 4096L)) {
                aVar.a(10);
            }
        }
        if (z10) {
            if (k0(jB, 262144L)) {
                aVar.a(15);
            }
            if (k0(jB, 2097152L)) {
                aVar.a(14);
            }
        }
        return aVar.f();
    }

    public static n.h P(C6071C c6071c, int i10, Bitmap bitmap) {
        return new n.h(t(c6071c, bitmap), Q(i10));
    }

    public static long Q(int i10) {
        if (i10 == -1) {
            return -1L;
        }
        return i10;
    }

    public static q2.S R(F3.w wVar) {
        if (wVar == null) {
            return null;
        }
        switch (wVar.d()) {
            case 1:
                if (!wVar.g()) {
                }
                break;
            case 2:
                if (!wVar.g()) {
                }
                break;
            case 3:
                if (!wVar.g()) {
                }
                break;
            case 4:
                if (!wVar.g()) {
                }
                break;
            case 5:
                if (!wVar.g()) {
                }
                break;
            case 6:
                if (!wVar.g()) {
                }
                break;
        }
        return null;
    }

    public static F3.w S(q2.S s10) {
        if (s10 == null) {
            return null;
        }
        int iH0 = h0(s10);
        if (!s10.b()) {
            return F3.w.m(iH0);
        }
        switch (iH0) {
            case 1:
                return F3.w.i(((C6111z) s10).e());
            case 2:
                return F3.w.l(((q2.V) s10).e());
            case 3:
            case 4:
            case 5:
                return F3.w.k(iH0, ((q2.T) s10).f());
            case 6:
                return F3.w.j(((C6081M) s10).e());
            default:
                return null;
        }
    }

    public static int T(int i10) {
        if (i10 == -1 || i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 3) {
                AbstractC6635w.i("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i10 + " was converted to `Player.REPEAT_MODE_OFF`");
                return 0;
            }
        }
        return i11;
    }

    public static U6 U(F3.v vVar, boolean z10) {
        U6.b bVar = new U6.b();
        bVar.c();
        if (!z10) {
            bVar.f(40010);
        }
        if (vVar != null) {
            for (v.d dVar : vVar.f()) {
                String strB = dVar.b();
                Bundle bundleD = dVar.d();
                if (bundleD == null) {
                    bundleD = Bundle.EMPTY;
                }
                bVar.a(new T6(strB, bundleD));
            }
        }
        return bVar.e();
    }

    static V6 V(int i10, int i11, CharSequence charSequence, Bundle bundle, Context context) {
        if (i10 == 7 || i11 == 0) {
            return null;
        }
        int iX = X(i11);
        String string = charSequence != null ? charSequence.toString() : i0(iX, context);
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        return new V6(iX, string, bundle);
    }

    public static V6 W(F3.v vVar, Context context) {
        if (vVar == null) {
            return null;
        }
        return V(vVar.o(), vVar.g(), vVar.h(), vVar.i(), context);
    }

    private static int X(int i10) {
        switch (i10) {
            case 1:
                return -2;
            case 2:
                return -6;
            case 3:
                return -102;
            case 4:
                return -103;
            case 5:
                return -104;
            case 6:
                return -105;
            case 7:
                return -106;
            case 8:
                return -110;
            case 9:
                return -107;
            case 10:
                return 1;
            case 11:
                return -109;
            default:
                return -1;
        }
    }

    public static boolean Y(int i10) {
        if (i10 == -1 || i10 == 0) {
            return false;
        }
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        throw new IllegalArgumentException("Unrecognized ShuffleMode: " + i10);
    }

    public static long Z(F3.v vVar, F3.m mVar, long j10) {
        return e(vVar, mVar, j10) - g(vVar, mVar, j10);
    }

    public static C6088c a(F3.a aVar) {
        return aVar == null ? C6088c.f56745h : new C6088c.e().c(aVar.a()).d(aVar.b()).g(aVar.d()).a();
    }

    public static Y.d a0(C6071C c6071c, int i10) {
        Y.d dVar = new Y.d();
        dVar.h(0, c6071c, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, i10, i10, 0L);
        return dVar;
    }

    public static C6088c b(j.e eVar) {
        return eVar == null ? C6088c.f56745h : a(eVar.a());
    }

    public static int b0(Bundle bundle) {
        return Math.max(0, bundle.getInt("androidx.media.utils.MediaBrowserCompat.extras.CUSTOM_BROWSER_ACTION_LIMIT", 0));
    }

    public static F3.a c(C6088c c6088c) {
        return new a.d().b(c6088c.f56752a).c(c6088c.f56753b).d(c6088c.f56754c).a();
    }

    private static long c0(F3.v vVar, long j10) {
        return vVar.e(j10 == -9223372036854775807L ? null : Long.valueOf(j10));
    }

    public static int d(F3.v vVar, F3.m mVar, long j10) {
        return L6.c(e(vVar, mVar, j10), j(mVar));
    }

    private static Bitmap d0(F3.m mVar, String... strArr) {
        for (String str : strArr) {
            if (mVar.a(str)) {
                return mVar.c(str);
            }
        }
        return null;
    }

    public static long e(F3.v vVar, F3.m mVar, long j10) {
        long jD = vVar == null ? 0L : vVar.d();
        long jG = g(vVar, mVar, j10);
        long j11 = j(mVar);
        return j11 == -9223372036854775807L ? Math.max(jG, jD) : t2.a0.s(jD, jG, j11);
    }

    private static String e0(F3.m mVar, String... strArr) {
        for (String str : strArr) {
            if (mVar.a(str)) {
                return mVar.h(str);
            }
        }
        return null;
    }

    private static byte[] f(Bitmap bitmap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static Object f0(Future future, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = false;
        long j11 = j10;
        while (true) {
            try {
                try {
                    return future.get(j11, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                    z10 = true;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    if (jElapsedRealtime2 >= j10) {
                        throw new TimeoutException();
                    }
                    j11 = j10 - jElapsedRealtime2;
                }
            } finally {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static long g(F3.v vVar, F3.m mVar, long j10) {
        if (vVar == null) {
            return 0L;
        }
        long jC0 = vVar.o() == 3 ? c0(vVar, j10) : vVar.m();
        long j11 = j(mVar);
        return j11 == -9223372036854775807L ? Math.max(0L, jC0) : t2.a0.s(jC0, 0L, j11);
    }

    public static int g0(C6088c c6088c) {
        int iC = c(c6088c).c();
        if (iC == Integer.MIN_VALUE) {
            return 3;
        }
        return iC;
    }

    public static C6101p h(j.e eVar, String str) {
        if (eVar == null) {
            return C6101p.f56928e;
        }
        return new C6101p.b(eVar.d() == 2 ? 1 : 0).f(eVar.c()).h(str).e();
    }

    public static int h0(q2.S s10) {
        if (s10 instanceof C6111z) {
            return 1;
        }
        if (s10 instanceof q2.V) {
            return 2;
        }
        if (!(s10 instanceof q2.T)) {
            return s10 instanceof C6081M ? 6 : 0;
        }
        int iE = ((q2.T) s10).e();
        int i10 = 3;
        if (iE != 3) {
            i10 = 4;
            if (iE != 4) {
                i10 = 5;
                if (iE != 5) {
                    return 0;
                }
            }
        }
        return i10;
    }

    public static int i(j.e eVar) {
        if (eVar == null) {
            return 0;
        }
        return eVar.b();
    }

    private static String i0(int i10, Context context) {
        if (i10 == -100) {
            return context.getString(Q6.f4875f);
        }
        if (i10 == 1) {
            return context.getString(Q6.f4878i);
        }
        if (i10 == -6) {
            return context.getString(Q6.f4882m);
        }
        if (i10 == -5) {
            return context.getString(Q6.f4880k);
        }
        if (i10 == -4) {
            return context.getString(Q6.f4884o);
        }
        if (i10 == -3) {
            return context.getString(Q6.f4872c);
        }
        if (i10 == -2) {
            return context.getString(Q6.f4879j);
        }
        switch (i10) {
            case -110:
                return context.getString(Q6.f4874e);
            case -109:
                return context.getString(Q6.f4876g);
            case -108:
                return context.getString(Q6.f4886q);
            case -107:
                return context.getString(Q6.f4887r);
            case -106:
                return context.getString(Q6.f4881l);
            case -105:
                return context.getString(Q6.f4883n);
            case -104:
                return context.getString(Q6.f4873d);
            case -103:
                return context.getString(Q6.f4885p);
            case -102:
                return context.getString(Q6.f4871b);
            default:
                return context.getString(Q6.f4877h);
        }
    }

    public static long j(F3.m mVar) {
        if (mVar == null || !mVar.a("android.media.metadata.DURATION")) {
            return -9223372036854775807L;
        }
        long jE = mVar.e("android.media.metadata.DURATION");
        if (jE <= 0) {
            return -9223372036854775807L;
        }
        return jE;
    }

    private static CharSequence j0(String str, C6077I c6077i) {
        str.getClass();
        switch (str) {
            case "android.media.metadata.ARTIST":
                return c6077i.f56519b;
            case "android.media.metadata.WRITER":
                return c6077i.f56543z;
            case "android.media.metadata.DISPLAY_SUBTITLE":
                return c6077i.f56523f;
            case "android.media.metadata.COMPOSER":
                return c6077i.f56508A;
            case "android.media.metadata.ALBUM":
                return c6077i.f56520c;
            case "android.media.metadata.TITLE":
                return c6077i.f56518a;
            case "android.media.metadata.ALBUM_ARTIST":
                return c6077i.f56521d;
            default:
                return null;
        }
    }

    private static long k(int i10) {
        switch (i10) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                throw new IllegalArgumentException("Unrecognized FolderType: " + i10);
        }
    }

    private static boolean k0(long j10, long j11) {
        return (j10 & j11) != 0;
    }

    private static int l(long j10) {
        if (j10 == 0) {
            return 0;
        }
        if (j10 == 1) {
            return 1;
        }
        if (j10 == 2) {
            return 2;
        }
        if (j10 == 3) {
            return 3;
        }
        if (j10 == 4) {
            return 4;
        }
        if (j10 == 5) {
            return 5;
        }
        return j10 == 6 ? 6 : 0;
    }

    public static boolean m(j.e eVar) {
        return eVar != null && eVar.b() == 0;
    }

    private static boolean n(F3.v vVar, F3.m mVar, long j10) {
        long j11 = j(mVar);
        return j11 != -9223372036854775807L && g(vVar, mVar, j10) >= j11;
    }

    public static boolean o(F3.v vVar) {
        return vVar != null && vVar.o() == 3;
    }

    public static boolean p(F3.m mVar) {
        return (mVar == null || mVar.e("android.media.metadata.ADVERTISEMENT") == 0) ? false : true;
    }

    public static int q(int i10) {
        if (i10 == -110) {
            return 8;
        }
        if (i10 == -109) {
            return 11;
        }
        if (i10 == -6) {
            return 2;
        }
        if (i10 == -2) {
            return 1;
        }
        if (i10 == 1) {
            return 10;
        }
        switch (i10) {
            case -107:
                return 9;
            case -106:
                return 7;
            case -105:
                return 6;
            case -104:
                return 5;
            case -103:
                return 4;
            case -102:
                return 3;
            default:
                return 0;
        }
    }

    public static int r(C6082N c6082n) {
        return q(c6082n.f56595a);
    }

    public static AbstractC2011u s(F3.v vVar, InterfaceC6084P.b bVar, Bundle bundle) {
        if (vVar == null) {
            return AbstractC2011u.A();
        }
        List<v.d> listF = vVar.f();
        AbstractC2011u.a aVar = new AbstractC2011u.a();
        for (v.d dVar : listF) {
            String strB = dVar.b();
            Bundle bundleD = dVar.d();
            C1323b.C0050b c0050bD = new C1323b.C0050b(bundleD != null ? bundleD.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0) : 0, dVar.e()).i(new T6(strB, bundleD == null ? Bundle.EMPTY : bundleD)).c(dVar.f()).d(true);
            String string = bundleD != null ? bundleD.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT") : null;
            if (string != null) {
                Uri uri = Uri.parse(string);
                String scheme = uri.getScheme();
                if (Objects.equals(scheme, "content") || Objects.equals(scheme, "android.resource")) {
                    c0050bD.g(uri);
                }
            }
            aVar.a(c0050bD.a());
        }
        return C1323b.i(aVar.k(), bVar, bundle);
    }

    public static F3.l t(C6071C c6071c, Bitmap bitmap) {
        CharSequence charSequence;
        CharSequence charSequence2;
        l.c cVarF = new l.c().f(c6071c.f56327a.equals("") ? null : c6071c.f56327a);
        C6077I c6077i = c6071c.f56331e;
        if (bitmap != null) {
            cVarF.d(bitmap);
        }
        Bundle bundle = c6077i.f56516I;
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        Integer num = c6077i.f56533p;
        boolean z10 = (num == null || num.intValue() == -1) ? false : true;
        boolean z11 = c6077i.f56515H != null;
        if (z10 || z11) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (z10) {
                bundle.putLong("android.media.extra.BT_FOLDER_TYPE", k(((Integer) AbstractC6614a.e(c6077i.f56533p)).intValue()));
            }
            if (z11) {
                bundle.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", ((Integer) AbstractC6614a.e(c6077i.f56515H)).intValue());
            }
        }
        if (!c6077i.f56517J.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", new ArrayList<>(c6077i.f56517J));
        }
        CharSequence charSequence3 = c6077i.f56522e;
        if (charSequence3 != null) {
            charSequence = c6077i.f56523f;
            charSequence2 = c6077i.f56524g;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putCharSequence("androidx.media3.mediadescriptioncompat.title", c6077i.f56518a);
        } else {
            CharSequence[] charSequenceArr = new CharSequence[3];
            int i10 = 0;
            int i11 = 0;
            while (i10 < 3) {
                String[] strArr = F3.m.f6437d;
                if (i11 >= strArr.length) {
                    break;
                }
                int i12 = i11 + 1;
                CharSequence charSequenceJ0 = j0(strArr[i11], c6077i);
                if (!TextUtils.isEmpty(charSequenceJ0)) {
                    charSequenceArr[i10] = charSequenceJ0;
                    i10++;
                }
                i11 = i12;
            }
            charSequence3 = charSequenceArr[0];
            charSequence = charSequenceArr[1];
            charSequence2 = charSequenceArr[2];
        }
        return cVarF.i(charSequence3).h(charSequence).b(charSequence2).e(c6077i.f56530m).g(c6071c.f56334h.f56443a).c(bundle).a();
    }

    public static C6071C u(F3.l lVar) {
        AbstractC6614a.e(lVar);
        return v(lVar, false, true);
    }

    private static C6071C v(F3.l lVar, boolean z10, boolean z11) {
        String strG = lVar.g();
        C6071C.c cVar = new C6071C.c();
        if (strG == null) {
            strG = "";
        }
        return cVar.d(strG).g(new C6071C.i.a().f(lVar.h()).d()).e(B(lVar, 0, z10, z11)).a();
    }

    public static C6071C w(F3.m mVar, int i10) {
        return y(mVar.h("android.media.metadata.MEDIA_ID"), mVar, i10);
    }

    public static C6071C x(n.h hVar) {
        return u(hVar.c());
    }

    public static C6071C y(String str, F3.m mVar, int i10) {
        C6071C.c cVar = new C6071C.c();
        if (str != null) {
            cVar.d(str);
        }
        String strH = mVar.h("android.media.metadata.MEDIA_URI");
        if (strH != null) {
            cVar.g(new C6071C.i.a().f(Uri.parse(strH)).d());
        }
        cVar.e(C(mVar, i10));
        return cVar.a();
    }

    public static List z(q2.Y y10) {
        ArrayList arrayList = new ArrayList();
        Y.d dVar = new Y.d();
        for (int i10 = 0; i10 < y10.t(); i10++) {
            arrayList.add(y10.r(i10, dVar).f56680c);
        }
        return arrayList;
    }

    public static int M(boolean z10) {
        return z10 ? 1 : 0;
    }
}
