package yd;

import Td.AbstractC2163n;
import android.util.Log;
import id.C5069a;
import id.C5081m;
import id.InterfaceC5075g;
import id.InterfaceC5076h;
import id.InterfaceC5077i;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f65043g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f65044h = n.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f65045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f65046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f65047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f65048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f65049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f65050f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JSONObject a(String str) {
            JSONObject jSONObject = new JSONObject();
            try {
                Map map = new id.n(str).B().get();
                for (String str2 : map.keySet()) {
                    Object obj = map.get(str2);
                    AbstractC5504s.e(obj);
                    InterfaceC5076h interfaceC5076h = (InterfaceC5076h) obj;
                    if ((interfaceC5076h instanceof id.o) || (interfaceC5076h instanceof C5069a) || (interfaceC5076h instanceof InterfaceC5077i)) {
                        jSONObject.put(str2, ((InterfaceC5075g) interfaceC5076h).get());
                    }
                }
                return jSONObject;
            } catch (C5081m e10) {
                Log.e(n.f65044h, "Failed to parse manifest header content", e10);
                return null;
            } catch (JSONException e11) {
                Log.e(n.f65044h, "Failed to parse manifest header content", e11);
                return null;
            }
        }

        private a() {
        }
    }

    public n(String str, String str2, String str3) {
        this.f65045a = str;
        this.f65046b = str2;
        this.f65047c = str3;
        this.f65048d = str != null ? Integer.valueOf(str) : null;
        this.f65049e = AbstractC2163n.b(new InterfaceC5082a() { // from class: yd.l
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return n.h(this.f65041a);
            }
        });
        this.f65050f = AbstractC2163n.b(new InterfaceC5082a() { // from class: yd.m
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return n.g(this.f65042a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject g(n nVar) {
        String str = nVar.f65047c;
        if (str != null) {
            return f65043g.a(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject h(n nVar) {
        String str = nVar.f65046b;
        if (str != null) {
            return f65043g.a(str);
        }
        return null;
    }

    public final JSONObject d() {
        return (JSONObject) this.f65050f.getValue();
    }

    public final Integer e() {
        return this.f65048d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC5504s.c(this.f65045a, nVar.f65045a) && AbstractC5504s.c(this.f65046b, nVar.f65046b) && AbstractC5504s.c(this.f65047c, nVar.f65047c);
    }

    public final JSONObject f() {
        return (JSONObject) this.f65049e.getValue();
    }

    public int hashCode() {
        String str = this.f65045a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f65046b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f65047c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "ResponseHeaderData(protocolVersionRaw=" + this.f65045a + ", serverDefinedHeadersRaw=" + this.f65046b + ", manifestFiltersRaw=" + this.f65047c + ")";
    }
}
