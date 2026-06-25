package com.amazon.a.a.i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f34372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f34373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a[] f34374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f34375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f34376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f34377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f34378i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum a {
        DEFAULT,
        HELP,
        DEEPLINK
    }

    public c(String str, String str2, String str3, boolean z10) {
        this(str, str2, str3, z10, false);
    }

    public String a() {
        return this.f34373d[this.f34377h];
    }

    public String[] b() {
        return this.f34373d;
    }

    public a[] c() {
        return this.f34374e;
    }

    public String d() {
        return this.f34372c;
    }

    public String e() {
        return this.f34371b;
    }

    public String f() {
        return this.f34370a;
    }

    public int g() {
        return this.f34378i;
    }

    public boolean h() {
        return this.f34375f;
    }

    public boolean i() {
        return this.f34376g;
    }

    public String toString() {
        return "PromptContent: [ title:" + this.f34370a + ", message: " + this.f34372c + ", label: " + this.f34373d[0] + ", visible: " + this.f34375f + ", shouldShowFixup: " + this.f34376g + "]";
    }

    public c(String str, String str2, String str3, boolean z10, boolean z11) {
        this(str, str2, new String[]{str3}, new a[]{a.DEFAULT}, z10, z11, 0);
    }

    public c(String str, String str2, String[] strArr, a[] aVarArr, boolean z10, boolean z11, int i10) {
        this(new String[]{str}, str2, strArr, aVarArr, z10, z11, i10);
    }

    public c(String[] strArr, String str, String[] strArr2, a[] aVarArr, boolean z10, boolean z11, int i10) {
        this(strArr, str, strArr2, aVarArr, z10, z11, i10, -1);
    }

    public c(String[] strArr, String str, String[] strArr2, a[] aVarArr, boolean z10, boolean z11, int i10, int i11) {
        String str2 = strArr[0];
        this.f34370a = str2;
        if (strArr.length > 1) {
            this.f34371b = strArr[1];
        } else {
            this.f34371b = str2;
        }
        this.f34372c = str;
        this.f34373d = strArr2;
        this.f34374e = aVarArr;
        this.f34375f = z10;
        this.f34376g = z11;
        this.f34377h = i10;
        this.f34378i = i11;
    }
}
