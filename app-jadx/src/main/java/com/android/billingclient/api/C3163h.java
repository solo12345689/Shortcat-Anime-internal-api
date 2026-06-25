package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3163h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f35458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f35460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f35461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f35462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f35463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f35464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f35465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f35466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f35467k;

    /* JADX INFO: renamed from: com.android.billingclient.api.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f35468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f35469b;

        a(JSONObject jSONObject) {
            this.f35468a = jSONObject.getInt("commitmentPaymentsCount");
            this.f35469b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        public int a() {
            return this.f35468a;
        }

        public int b() {
            return this.f35469b;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.h$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f35470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f35471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f35472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f35473d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f35474e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f35475f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List f35476g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Long f35477h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final a f35478i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final d f35479j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final C0596b f35480k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final String f35481l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final c f35482m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Z f35483n;

        /* JADX INFO: renamed from: com.android.billingclient.api.h$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Integer f35484a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final C0595a f35485b;

            /* JADX INFO: renamed from: com.android.billingclient.api.h$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            public static final class C0595a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f35486a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final long f35487b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final String f35488c;

                C0595a(JSONObject jSONObject) {
                    this.f35486a = jSONObject.optString("formattedDiscountAmount");
                    this.f35487b = jSONObject.optLong("discountAmountMicros");
                    this.f35488c = jSONObject.optString("discountAmountCurrencyCode");
                }
            }

            a(JSONObject jSONObject) {
                this.f35484a = jSONObject.has("percentageDiscount") ? Integer.valueOf(jSONObject.optInt("percentageDiscount")) : null;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountAmount");
                this.f35485b = jSONObjectOptJSONObject != null ? new C0595a(jSONObjectOptJSONObject) : null;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.h$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0596b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f35489a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f35490b;

            C0596b(JSONObject jSONObject) {
                this.f35489a = jSONObject.getInt("maximumQuantity");
                this.f35490b = jSONObject.getInt("remainingQuantity");
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.h$b$c */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f35491a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f35492b;

            c(JSONObject jSONObject) {
                this.f35491a = jSONObject.getString("rentalPeriod");
                String strOptString = jSONObject.optString("rentalExpirationPeriod");
                this.f35492b = true == strOptString.isEmpty() ? null : strOptString;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.h$b$d */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Long f35493a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Long f35494b;

            d(JSONObject jSONObject) {
                this.f35493a = jSONObject.has("startTimeMillis") ? Long.valueOf(jSONObject.optLong("startTimeMillis")) : null;
                this.f35494b = jSONObject.has("endTimeMillis") ? Long.valueOf(jSONObject.optLong("endTimeMillis")) : null;
            }
        }

        b(JSONObject jSONObject) throws JSONException {
            this.f35470a = jSONObject.optString("formattedPrice");
            this.f35471b = jSONObject.optLong("priceAmountMicros");
            this.f35472c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.f35473d = true == strOptString.isEmpty() ? null : strOptString;
            String strOptString2 = jSONObject.optString("offerId");
            this.f35474e = true == strOptString2.isEmpty() ? null : strOptString2;
            String strOptString3 = jSONObject.optString("purchaseOptionId");
            this.f35475f = true == strOptString3.isEmpty() ? null : strOptString3;
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            this.f35476g = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    this.f35476g.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f35477h = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.f35478i = jSONObjectOptJSONObject == null ? null : new a(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.f35479j = jSONObjectOptJSONObject2 == null ? null : new d(jSONObjectOptJSONObject2);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.f35480k = jSONObjectOptJSONObject3 == null ? null : new C0596b(jSONObjectOptJSONObject3);
            this.f35481l = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject4.getLong("preorderReleaseTimeMillis");
                jSONObjectOptJSONObject4.getLong("preorderPresaleEndTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.f35482m = jSONObjectOptJSONObject5 == null ? null : new c(jSONObjectOptJSONObject5);
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.f35483n = jSONObjectOptJSONObject6 != null ? new Z(jSONObjectOptJSONObject6) : null;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("pricingPhases");
            if (jSONArrayOptJSONArray2 == null) {
                return;
            }
            new d(jSONArrayOptJSONArray2);
        }

        public String a() {
            return this.f35470a;
        }

        public String b() {
            return this.f35473d;
        }

        public long c() {
            return this.f35471b;
        }

        public String d() {
            return this.f35472c;
        }

        public final Z e() {
            return this.f35483n;
        }

        final String f() {
            return this.f35481l;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.h$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f35495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f35496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f35497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f35498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f35499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f35500f;

        c(JSONObject jSONObject) {
            this.f35498d = jSONObject.optString("billingPeriod");
            this.f35497c = jSONObject.optString("priceCurrencyCode");
            this.f35495a = jSONObject.optString("formattedPrice");
            this.f35496b = jSONObject.optLong("priceAmountMicros");
            this.f35500f = jSONObject.optInt("recurrenceMode");
            this.f35499e = jSONObject.optInt("billingCycleCount");
        }

        public int a() {
            return this.f35499e;
        }

        public String b() {
            return this.f35498d;
        }

        public String c() {
            return this.f35495a;
        }

        public long d() {
            return this.f35496b;
        }

        public String e() {
            return this.f35497c;
        }

        public int f() {
            return this.f35500f;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.h$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f35501a;

        d(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new c(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f35501a = arrayList;
        }

        public List a() {
            return this.f35501a;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.h$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f35502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f35504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d f35505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f35506e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final a f35507f;

        e(JSONObject jSONObject) throws JSONException {
            this.f35502a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.f35503b = true == strOptString.isEmpty() ? null : strOptString;
            this.f35504c = jSONObject.getString("offerIdToken");
            this.f35505d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f35507f = jSONObjectOptJSONObject != null ? new a(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString("productId");
                jSONObjectOptJSONObject2.optString(com.amazon.a.a.o.b.f34626S);
                jSONObjectOptJSONObject2.optString("name");
                jSONObjectOptJSONObject2.optString(com.amazon.a.a.o.b.f34645c);
                jSONObjectOptJSONObject2.optString("basePlanId");
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    new c(jSONObjectOptJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f35506e = arrayList;
        }

        public String a() {
            return this.f35502a;
        }

        public a b() {
            return this.f35507f;
        }

        public String c() {
            return this.f35503b;
        }

        public List d() {
            return this.f35506e;
        }

        public String e() {
            return this.f35504c;
        }

        public d f() {
            return this.f35505d;
        }
    }

    C3163h(String str) {
        this.f35457a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f35458b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f35459c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f35460d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f35461e = jSONObject.optString(com.amazon.a.a.o.b.f34626S);
        this.f35462f = jSONObject.optString("name");
        this.f35463g = jSONObject.optString(com.amazon.a.a.o.b.f34645c);
        jSONObject.optString("packageDisplayName");
        jSONObject.optString(com.amazon.a.a.o.b.f34652j);
        this.f35464h = jSONObject.optString("skuDetailsToken");
        this.f35465i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new e(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.f35466j = arrayList;
        } else {
            this.f35466j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f35458b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f35458b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new b(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.f35467k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f35467k = null;
        } else {
            arrayList2.add(new b(jSONObjectOptJSONObject));
            this.f35467k = arrayList2;
        }
    }

    public String a() {
        return this.f35463g;
    }

    public String b() {
        return this.f35462f;
    }

    public b c() {
        List list = this.f35467k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) list.get(0);
    }

    public List d() {
        return this.f35467k;
    }

    public String e() {
        return this.f35459c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3163h) {
            return TextUtils.equals(this.f35457a, ((C3163h) obj).f35457a);
        }
        return false;
    }

    public String f() {
        return this.f35460d;
    }

    public List g() {
        return this.f35466j;
    }

    public String h() {
        return this.f35461e;
    }

    public int hashCode() {
        return this.f35457a.hashCode();
    }

    public final String i() {
        return this.f35458b.optString("packageName");
    }

    final String j() {
        return this.f35464h;
    }

    public String k() {
        return this.f35465i;
    }

    final List l() {
        return this.f35467k;
    }

    public String toString() {
        List list = this.f35466j;
        return "ProductDetails{jsonString='" + this.f35457a + "', parsedJson=" + this.f35458b.toString() + ", productId='" + this.f35459c + "', productType='" + this.f35460d + "', title='" + this.f35461e + "', productDetailsToken='" + this.f35464h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
