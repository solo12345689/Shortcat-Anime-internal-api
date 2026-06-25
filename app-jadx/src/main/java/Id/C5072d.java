package id;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: id.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C5072d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f48864a;

    private C5072d(Map map) {
        this.f48864a = Collections.unmodifiableMap(r.b(map));
    }

    public static C5072d f(Map map) {
        return new C5072d(map);
    }

    @Override // id.q
    public StringBuilder c(StringBuilder sb2) {
        String str = "";
        for (Map.Entry entry : this.f48864a.entrySet()) {
            sb2.append(str);
            String str2 = (String) entry.getKey();
            InterfaceC5076h interfaceC5076h = (InterfaceC5076h) entry.getValue();
            sb2.append(str2);
            if (Boolean.TRUE.equals(interfaceC5076h.get())) {
                interfaceC5076h.a().o(sb2);
            } else {
                sb2.append(com.amazon.a.a.o.b.f.f34695b);
                interfaceC5076h.c(sb2);
            }
            str = ", ";
        }
        return sb2;
    }

    @Override // K1.h
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Map get() {
        return this.f48864a;
    }

    public String e() {
        return c(new StringBuilder()).toString();
    }
}
