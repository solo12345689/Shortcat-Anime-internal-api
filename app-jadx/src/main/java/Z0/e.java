package Z0;

import Y0.InterfaceC2484t;
import Y0.L;
import Z0.c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final InterfaceC2484t a(c cVar, c.a aVar, L l10, int i10) {
        return new d(cVar.b(), aVar, l10, i10, cVar.a(), null);
    }

    public static final String c(int i10) {
        return i10 != -4 ? i10 != -3 ? i10 != -2 ? i10 != -1 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "Unknown error code" : "The given query was not supported by this provider." : "The provider found the queried font, but it is currently unavailable." : "Font not found, please check availability on GoogleFont.Provider.AllFontsList: https://fonts.gstatic.com/s/a/directory.xml" : "The requested provider was not found on this device." : "The given provider cannot be authenticated with the certificates given." : "Generic error loading font, for example variation settings were not parsable" : "Font was not loaded due to security issues. This usually means the font was attempted to load in a restricted context";
    }
}
