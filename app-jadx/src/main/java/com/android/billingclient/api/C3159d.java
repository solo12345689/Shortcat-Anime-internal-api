package com.android.billingclient.api;

import android.text.TextUtils;
import com.android.billingclient.api.C3163h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.android.billingclient.api.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3159d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f35407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.play_billing.N f35408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f35409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f35410g;

    /* JADX INFO: renamed from: com.android.billingclient.api.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f35413c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ArrayList f35414d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f35415e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c.a f35416f;

        /* synthetic */ a(N4.x xVar) {
            c.a aVarA = c.a();
            c.a.e(aVarA);
            this.f35416f = aVarA;
        }

        public C3159d a() {
            ArrayList arrayList = this.f35414d;
            boolean z10 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.f35413c;
            boolean z11 = (list == null || list.isEmpty()) ? false : true;
            if (!z10 && !z11) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z10 && z11) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            N4.x xVar = null;
            if (!z10) {
                List list2 = this.f35413c;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((b) it.next()) == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        }
                    }
                }
            } else {
                if (this.f35414d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f35414d.size() > 1) {
                    android.support.v4.media.session.b.a(this.f35414d.get(0));
                    throw null;
                }
            }
            C3159d c3159d = new C3159d(xVar);
            if (z10) {
                android.support.v4.media.session.b.a(this.f35414d.get(0));
                throw null;
            }
            c3159d.f35404a = z11 && !((b) this.f35413c.get(0)).b().i().isEmpty();
            c3159d.f35405b = this.f35411a;
            c3159d.f35406c = this.f35412b;
            c3159d.f35407d = this.f35416f.a();
            ArrayList arrayList2 = this.f35414d;
            c3159d.f35409f = arrayList2 != null ? new ArrayList(arrayList2) : new ArrayList();
            c3159d.f35410g = this.f35415e;
            List list3 = this.f35413c;
            c3159d.f35408e = list3 != null ? com.google.android.gms.internal.play_billing.N.s(list3) : com.google.android.gms.internal.play_billing.N.t();
            return c3159d;
        }

        public a b(boolean z10) {
            this.f35415e = z10;
            return this;
        }

        public a c(String str) {
            this.f35411a = str;
            return this;
        }

        public a d(List list) {
            this.f35413c = new ArrayList(list);
            return this;
        }

        public a e(c cVar) {
            this.f35416f = c.c(cVar);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C3163h f35417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35418b;

        /* JADX INFO: renamed from: com.android.billingclient.api.d$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private C3163h f35419a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f35420b;

            /* synthetic */ a(N4.x xVar) {
            }

            public b a() {
                com.google.android.gms.internal.play_billing.A.c(this.f35419a, "ProductDetails is required for constructing ProductDetailsParams.");
                return new b(this, null);
            }

            public a b(String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.f35420b = str;
                return this;
            }

            public a c(C3163h c3163h) {
                this.f35419a = c3163h;
                if (c3163h.c() != null) {
                    c3163h.c().getClass();
                    C3163h.b bVarC = c3163h.c();
                    if (bVarC.b() != null) {
                        this.f35420b = bVarC.b();
                    }
                }
                return this;
            }
        }

        /* synthetic */ b(a aVar, N4.x xVar) {
            this.f35417a = aVar.f35419a;
            this.f35418b = aVar.f35420b;
        }

        public static a a() {
            return new a(null);
        }

        public final C3163h b() {
            return this.f35417a;
        }

        public final String c() {
            return this.f35418b;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.d$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35423c = 0;

        /* JADX INFO: renamed from: com.android.billingclient.api.d$c$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f35424a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f35425b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f35426c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f35427d = 0;

            /* synthetic */ a(N4.x xVar) {
            }

            static /* synthetic */ a e(a aVar) {
                aVar.f35426c = true;
                return aVar;
            }

            public c a() {
                boolean z10 = true;
                N4.x xVar = null;
                if (TextUtils.isEmpty(this.f35424a) && TextUtils.isEmpty(null)) {
                    z10 = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.f35425b);
                if (z10 && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f35426c && !z10 && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                c cVar = new c(xVar);
                cVar.f35421a = this.f35424a;
                cVar.f35423c = this.f35427d;
                cVar.f35422b = this.f35425b;
                return cVar;
            }

            public a b(String str) {
                this.f35424a = str;
                return this;
            }

            public a c(String str) {
                this.f35425b = str;
                return this;
            }

            public a d(int i10) {
                this.f35427d = i10;
                return this;
            }

            public final a f(String str) {
                this.f35424a = str;
                return this;
            }
        }

        /* synthetic */ c(N4.x xVar) {
        }

        public static a a() {
            return new a(null);
        }

        static /* bridge */ /* synthetic */ a c(c cVar) {
            a aVarA = a();
            aVarA.f(cVar.f35421a);
            aVarA.d(cVar.f35423c);
            aVarA.c(cVar.f35422b);
            return aVarA;
        }

        final int b() {
            return this.f35423c;
        }

        final String d() {
            return this.f35421a;
        }

        final String e() {
            return this.f35422b;
        }
    }

    /* synthetic */ C3159d(N4.x xVar) {
    }

    public static a a() {
        return new a(null);
    }

    public int b() {
        return 0;
    }

    public final int c() {
        return this.f35407d.b();
    }

    public long d() {
        return 0L;
    }

    final C3160e e() {
        C3163h.b bVar;
        if (this.f35408e.isEmpty()) {
            return W.f35336i;
        }
        b bVar2 = (b) this.f35408e.get(0);
        for (int i10 = 1; i10 < this.f35408e.size(); i10++) {
            b bVar3 = (b) this.f35408e.get(i10);
            if (!bVar3.b().f().equals(bVar2.b().f()) && !bVar3.b().f().equals("play_pass_subs")) {
                return W.a(5, "All products should have same ProductType.");
            }
        }
        String strI = bVar2.b().i();
        HashMap map = new HashMap();
        HashSet<String> hashSet = new HashSet();
        com.google.android.gms.internal.play_billing.N n10 = this.f35408e;
        int size = n10.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar4 = (b) n10.get(i11);
            if (bVar4.b().g() != null && bVar4.c() == null) {
                return W.a(5, String.format("offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: %s", bVar4.b().e()));
            }
            if (map.containsKey(bVar4.b().e())) {
                return W.a(5, String.format("ProductId can not be duplicated. Invalid product id: %s.", bVar4.b().e()));
            }
            map.put(bVar4.b().e(), bVar4);
            if (!bVar2.b().f().equals("play_pass_subs") && !bVar4.b().f().equals("play_pass_subs") && !strI.equals(bVar4.b().i())) {
                return W.a(5, "All products must have the same package name.");
            }
        }
        for (String str : hashSet) {
            if (map.containsKey(str)) {
                return W.a(5, String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", str));
            }
        }
        List listD = bVar2.b().d();
        String strC = bVar2.c();
        if (strC != null && listD != null) {
            Iterator it = listD.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                bVar = (C3163h.b) it.next();
                if (strC.equals(bVar.b())) {
                    break;
                }
            }
            if (bVar != null && bVar.e() != null) {
                return W.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
            }
        }
        return W.f35336i;
    }

    public final String f() {
        return this.f35405b;
    }

    public final String g() {
        return this.f35406c;
    }

    public String h() {
        return null;
    }

    public final String i() {
        return this.f35407d.d();
    }

    public final String j() {
        return this.f35407d.e();
    }

    public final ArrayList k() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f35409f);
        return arrayList;
    }

    public final List l() {
        return this.f35408e;
    }

    public final boolean t() {
        return this.f35410g;
    }

    final boolean u() {
        if (this.f35405b != null || this.f35406c != null || this.f35407d.e() != null || this.f35407d.b() != 0 || this.f35404a || this.f35410g) {
            return true;
        }
        com.google.android.gms.internal.play_billing.N n10 = this.f35408e;
        if (n10 != null) {
            int size = n10.size();
            for (int i10 = 0; i10 < size; i10++) {
            }
        }
        return false;
    }
}
