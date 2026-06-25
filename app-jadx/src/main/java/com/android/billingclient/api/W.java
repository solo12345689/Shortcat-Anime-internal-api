package com.android.billingclient.api;

import com.android.billingclient.api.C3160e;
import com.revenuecat.purchases.google.ErrorsKt;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class W {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    static final C3160e f35322A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    static final C3160e f35323B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    static final C3160e f35324C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    static final C3160e f35325D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    static final C3160e f35326E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    static final C3160e f35327F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C3160e f35328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final C3160e f35329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C3160e f35330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final C3160e f35331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final C3160e f35332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final C3160e f35333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final C3160e f35334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final C3160e f35335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final C3160e f35336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final C3160e f35337j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final C3160e f35338k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final C3160e f35339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final C3160e f35340m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final C3160e f35341n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final C3160e f35342o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final C3160e f35343p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final C3160e f35344q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final C3160e f35345r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final C3160e f35346s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final C3160e f35347t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final C3160e f35348u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final C3160e f35349v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final C3160e f35350w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final C3160e f35351x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final C3160e f35352y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final C3160e f35353z;

    static {
        C3160e.a aVarD = C3160e.d();
        aVarD.d(3);
        aVarD.b(ErrorsKt.IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE);
        aVarD.a();
        C3160e.a aVarD2 = C3160e.d();
        aVarD2.d(3);
        aVarD2.b("Google Play In-app Billing API version is less than 9");
        f35328a = aVarD2.a();
        C3160e.a aVarD3 = C3160e.d();
        aVarD3.d(3);
        aVarD3.b("Billing service unavailable on device.");
        f35329b = aVarD3.a();
        C3160e.a aVarD4 = C3160e.d();
        aVarD4.d(2);
        aVarD4.b("Billing service unavailable on device.");
        f35330c = aVarD4.a();
        C3160e.a aVarD5 = C3160e.d();
        aVarD5.d(5);
        aVarD5.b("Client is already in the process of connecting to billing service.");
        f35331d = aVarD5.a();
        C3160e.a aVarD6 = C3160e.d();
        aVarD6.d(5);
        aVarD6.b("The list of SKUs can't be empty.");
        aVarD6.a();
        C3160e.a aVarD7 = C3160e.d();
        aVarD7.d(5);
        aVarD7.b("SKU type can't be empty.");
        aVarD7.a();
        C3160e.a aVarD8 = C3160e.d();
        aVarD8.d(5);
        aVarD8.b("Product type can't be empty.");
        f35332e = aVarD8.a();
        C3160e.a aVarD9 = C3160e.d();
        aVarD9.d(-2);
        aVarD9.b("Client does not support extra params.");
        f35333f = aVarD9.a();
        C3160e.a aVarD10 = C3160e.d();
        aVarD10.d(5);
        aVarD10.b("Invalid purchase token.");
        f35334g = aVarD10.a();
        C3160e.a aVarD11 = C3160e.d();
        aVarD11.d(6);
        aVarD11.b("An internal error occurred.");
        f35335h = aVarD11.a();
        C3160e.a aVarD12 = C3160e.d();
        aVarD12.d(5);
        aVarD12.b("SKU can't be null.");
        aVarD12.a();
        C3160e.a aVarD13 = C3160e.d();
        aVarD13.d(0);
        f35336i = aVarD13.a();
        C3160e.a aVarD14 = C3160e.d();
        aVarD14.d(-1);
        aVarD14.b("Service connection is disconnected.");
        f35337j = aVarD14.a();
        C3160e.a aVarD15 = C3160e.d();
        aVarD15.d(2);
        aVarD15.b("Timeout communicating with service.");
        f35338k = aVarD15.a();
        C3160e.a aVarD16 = C3160e.d();
        aVarD16.d(-2);
        aVarD16.b("Client does not support subscriptions.");
        f35339l = aVarD16.a();
        C3160e.a aVarD17 = C3160e.d();
        aVarD17.d(-2);
        aVarD17.b("Client does not support subscriptions update.");
        f35340m = aVarD17.a();
        C3160e.a aVarD18 = C3160e.d();
        aVarD18.d(-2);
        aVarD18.b("Client does not support get purchase history.");
        aVarD18.a();
        C3160e.a aVarD19 = C3160e.d();
        aVarD19.d(-2);
        aVarD19.b("Client does not support price change confirmation.");
        f35341n = aVarD19.a();
        C3160e.a aVarD20 = C3160e.d();
        aVarD20.d(-2);
        aVarD20.b("Play Store version installed does not support cross selling products.");
        f35342o = aVarD20.a();
        C3160e.a aVarD21 = C3160e.d();
        aVarD21.d(-2);
        aVarD21.b("Client does not support multi-item purchases.");
        f35343p = aVarD21.a();
        C3160e.a aVarD22 = C3160e.d();
        aVarD22.d(-2);
        aVarD22.b("Client does not support offer_id_token.");
        f35344q = aVarD22.a();
        C3160e.a aVarD23 = C3160e.d();
        aVarD23.d(-2);
        aVarD23.b("Client does not support ProductDetails.");
        f35345r = aVarD23.a();
        C3160e.a aVarD24 = C3160e.d();
        aVarD24.d(-2);
        aVarD24.b("Client does not support in-app messages.");
        f35346s = aVarD24.a();
        C3160e.a aVarD25 = C3160e.d();
        aVarD25.d(-2);
        aVarD25.b("Client does not support user choice billing.");
        aVarD25.a();
        C3160e.a aVarD26 = C3160e.d();
        aVarD26.d(-2);
        aVarD26.b("Play Store version installed does not support external offer.");
        f35347t = aVarD26.a();
        C3160e.a aVarD27 = C3160e.d();
        aVarD27.d(-2);
        aVarD27.b("Play Store version installed does not support multi-item purchases with season pass in one cart.");
        f35348u = aVarD27.a();
        C3160e.a aVarD28 = C3160e.d();
        aVarD28.d(-2);
        aVarD28.b("Play Store version installed does not support querying AutoPay plan purchase.");
        f35349v = aVarD28.a();
        C3160e.a aVarD29 = C3160e.d();
        aVarD29.d(-2);
        aVarD29.b("Play Store version installed does not support including suspended subscriptions.");
        f35350w = aVarD29.a();
        C3160e.a aVarD30 = C3160e.d();
        aVarD30.d(5);
        aVarD30.b("Unknown feature");
        f35351x = aVarD30.a();
        C3160e.a aVarD31 = C3160e.d();
        aVarD31.d(-2);
        aVarD31.b("Play Store version installed does not support get billing config.");
        f35352y = aVarD31.a();
        C3160e.a aVarD32 = C3160e.d();
        aVarD32.d(-2);
        aVarD32.b("Query product details with serialized docid is not supported.");
        f35353z = aVarD32.a();
        C3160e.a aVarD33 = C3160e.d();
        aVarD33.d(-2);
        aVarD33.b("Play Store version installed does not support launching external offer flow.");
        f35322A = aVarD33.a();
        C3160e.a aVarD34 = C3160e.d();
        aVarD34.d(4);
        aVarD34.b("Item is unavailable for purchase.");
        f35323B = aVarD34.a();
        C3160e.a aVarD35 = C3160e.d();
        aVarD35.d(-2);
        aVarD35.b("Query product details with developer specified account is not supported.");
        f35324C = aVarD35.a();
        C3160e.a aVarD36 = C3160e.d();
        aVarD36.d(-2);
        aVarD36.b("Play Store version installed does not support alternative billing only.");
        f35325D = aVarD36.a();
        C3160e.a aVarD37 = C3160e.d();
        aVarD37.d(5);
        aVarD37.b("To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        f35326E = aVarD37.a();
        C3160e.a aVarD38 = C3160e.d();
        aVarD38.d(6);
        aVarD38.b("An error occurred while retrieving billing override.");
        f35327F = aVarD38.a();
        C3160e.a aVarD39 = C3160e.d();
        aVarD39.d(-2);
        aVarD39.b("Play Store version installed does not support the provided billing program.");
        aVarD39.a();
    }

    static C3160e a(int i10, String str) {
        C3160e.a aVarD = C3160e.d();
        aVarD.d(i10);
        aVarD.b(str);
        return aVarD.a();
    }
}
