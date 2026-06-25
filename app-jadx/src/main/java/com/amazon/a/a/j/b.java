package com.amazon.a.a.j;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f34425a = "RESPONSE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f34426b = "RESET_OFFSET";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f34427d = "RECEIPT_STRING";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f34428e = "KIWI_EXECUTION_RESULT_CODE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f34429f = "RECEIPT_DELIVERED";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f34430g = "PURCHASE_REQUEST_ID";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f34431h = "userId";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ boolean f34432i = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Object> f34433c = new HashMap();

    public Object a(String str) {
        return this.f34433c.get(str);
    }

    public boolean b(String str) {
        return this.f34433c.containsKey(str);
    }

    public Object c(String str) {
        return this.f34433c.remove(str);
    }

    public void a(String str, Object obj) {
        this.f34433c.put(str, obj);
    }

    public Object b() {
        return this.f34433c.get(f34425a);
    }

    public void c() {
        this.f34433c.remove(f34425a);
    }

    public boolean a(Class cls) {
        return b(f34425a) && a(f34425a).getClass().equals(cls);
    }

    public void a() {
        this.f34433c.clear();
    }

    public void a(Object obj) {
        if (!f34432i && obj == null) {
            throw new AssertionError();
        }
        this.f34433c.put(f34425a, obj);
    }
}
