package Df;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Df.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1271d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1271d f3717a = new C1271d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f3718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f3719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f3720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f3721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f3722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Charset f3723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Charset f3724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile Charset f3725i;

    static {
        Charset charsetForName = Charset.forName(Constants.ENCODING);
        AbstractC5504s.g(charsetForName, "forName(...)");
        f3718b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        AbstractC5504s.g(charsetForName2, "forName(...)");
        f3719c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        AbstractC5504s.g(charsetForName3, "forName(...)");
        f3720d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        AbstractC5504s.g(charsetForName4, "forName(...)");
        f3721e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        AbstractC5504s.g(charsetForName5, "forName(...)");
        f3722f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        AbstractC5504s.g(charsetForName6, "forName(...)");
        f3723g = charsetForName6;
    }

    private C1271d() {
    }

    public final Charset a() {
        Charset charset = f3725i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        AbstractC5504s.g(charsetForName, "forName(...)");
        f3725i = charsetForName;
        return charsetForName;
    }

    public final Charset b() {
        Charset charset = f3724h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        AbstractC5504s.g(charsetForName, "forName(...)");
        f3724h = charsetForName;
        return charsetForName;
    }
}
