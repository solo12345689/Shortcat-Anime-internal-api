package com.amazon.device.iap.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataRequest;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f35133a = "d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f35134b = "sku";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static d f35135c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f35136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f35137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PurchasingListener f35138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f35139g = false;

    private d() {
    }

    public static d f() {
        return f35135c;
    }

    private void g() {
        if (this.f35138f == null) {
            throw new IllegalStateException("You must register a PurchasingListener before invoking this operation");
        }
    }

    public PurchasingListener a() {
        return this.f35138f;
    }

    public Context b() {
        return this.f35137e;
    }

    public void c() {
        this.f35139g = true;
    }

    public boolean d() {
        return this.f35139g;
    }

    public boolean e() {
        g();
        return com.amazon.a.a.a((Application) this.f35137e.getApplicationContext());
    }

    public void a(Context context, PurchasingListener purchasingListener) {
        com.amazon.device.iap.internal.util.b.a(f35133a, "PurchasingListener registered: " + purchasingListener);
        com.amazon.device.iap.internal.util.b.a(f35133a, "PurchasingListener Context: " + context);
        if (purchasingListener == null || context == null) {
            throw new IllegalArgumentException("Neither PurchasingListener or its Context can be null");
        }
        this.f35137e = context.getApplicationContext();
        e eVarA = b.a().a(this.f35137e);
        this.f35136d = eVarA;
        if (eVarA == null) {
            com.amazon.device.iap.internal.util.b.a(f35133a, "requestHandler is null");
        }
        this.f35138f = purchasingListener;
    }

    public RequestId a(UserDataRequest userDataRequest) {
        g();
        RequestId requestId = new RequestId();
        this.f35136d.a(requestId, userDataRequest);
        return requestId;
    }

    public RequestId a(String str) {
        f.a((Object) str, f35134b);
        g();
        RequestId requestId = new RequestId();
        this.f35136d.a(requestId, str);
        return requestId;
    }

    public RequestId a(Set<String> set) {
        f.a((Object) set, com.amazon.a.a.o.b.f34622O);
        f.a((Collection<? extends Object>) set, com.amazon.a.a.o.b.f34622O);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (it.next().trim().length() == 0) {
                throw new IllegalArgumentException("Empty SKU values are not allowed");
            }
        }
        if (set.size() <= 100) {
            g();
            RequestId requestId = new RequestId();
            this.f35136d.a(requestId, new LinkedHashSet(set));
            return requestId;
        }
        throw new IllegalArgumentException(set.size() + " SKUs were provided, but no more than 100 SKUs are allowed");
    }

    public RequestId a(boolean z10) {
        g();
        RequestId requestId = new RequestId();
        this.f35136d.a(requestId, z10);
        return requestId;
    }

    public void a(String str, FulfillmentResult fulfillmentResult) {
        if (!f.a(str)) {
            f.a(fulfillmentResult, "fulfillmentResult");
            g();
            this.f35136d.a(new RequestId(), str, fulfillmentResult);
            return;
        }
        throw new IllegalArgumentException("Empty receiptId is not allowed");
    }

    public void a(Context context, Intent intent) {
        try {
            this.f35136d.a(context, intent);
        } catch (Exception e10) {
            com.amazon.device.iap.internal.util.b.b(f35133a, "Error in onReceive: " + e10);
        }
    }
}
