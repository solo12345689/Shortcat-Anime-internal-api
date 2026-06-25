package com.amazon.a.b;

import com.amazon.a.a.i.c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f34758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f34759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f34760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f34761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f34762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f34763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.amazon.a.a.i.c f34764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f34765h = "Quit";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f34766i = "Help";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f34767j = "Update";

    static {
        String[] strArr = {f34765h, f34766i};
        c.a aVar = c.a.DEFAULT;
        c.a aVar2 = c.a.HELP;
        f34758a = new com.amazon.a.a.i.c(new String[]{"Amazon Appstore required"}, "Amazon Appstore is not installed on your device. Please install Amazon Appstore and sign in to Amazon to use this app.", strArr, new c.a[]{aVar, aVar2}, true, true, 1, 1);
        f34759b = new com.amazon.a.a.i.c("Amazon Appstore connection failure", "An error occurred connecting to Amazon Appstore. Please try opening this app again", f34765h, true, false);
        f34760c = new com.amazon.a.a.i.c(new String[]{"New Appstore version required", "Amazon Appstore Update Required"}, "Amazon Appstore is out of date.  Please visit the Amazon website to install the latest version of the Appstore. ", new String[]{f34765h, f34766i}, new c.a[]{aVar, aVar2}, true, true, 1, 2);
        f34761d = new com.amazon.a.a.i.c("Internet connection required", "An internet connection is required to open this app. Please connect to the internet and reopen this app.", f34765h, true, false);
        f34762e = new com.amazon.a.a.i.c(new String[]{"Connection error"}, "An unknown error occurred connecting to Amazon Appstore.", new String[]{f34765h, f34766i}, new c.a[]{aVar, aVar2}, true, true, 1, 3);
        f34763f = new com.amazon.a.a.i.c("Internal error", "An internal error occurred, please try opening this app again", f34765h, true, false);
        f34764g = new com.amazon.a.a.i.c("App update required", "Please update this app from the Amazon Appstore.", new String[]{f34765h, f34767j}, new c.a[]{aVar, c.a.DEEPLINK}, true, false, 0);
    }

    private e() {
    }
}
