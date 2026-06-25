package com.google.android.datatransport.cct;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p8.C5938c;
import r8.InterfaceC6281g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements InterfaceC6281g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f38804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f38805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f38806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f38807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f38808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f38809h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38811b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f38804c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f38805d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f38806e = strA3;
        f38807f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C5938c.b("proto"), C5938c.b("json"))));
        f38808g = new a(strA, null);
        f38809h = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f38810a = str;
        this.f38811b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName(Constants.ENCODING));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // r8.InterfaceC6281g
    public Set a() {
        return f38807f;
    }

    public byte[] b() {
        String str = this.f38811b;
        if (str == null && this.f38810a == null) {
            return null;
        }
        String str2 = this.f38810a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName(Constants.ENCODING));
    }

    public String d() {
        return this.f38811b;
    }

    public String e() {
        return this.f38810a;
    }

    @Override // r8.InterfaceC6280f
    public byte[] getExtras() {
        return b();
    }

    @Override // r8.InterfaceC6280f
    public String getName() {
        return "cct";
    }
}
