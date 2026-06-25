package qb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: qb.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C6167a implements InterfaceC6168b {

    /* JADX INFO: renamed from: a */
    private Map f57908a;

    public C6167a() {
        this.f57908a = new HashMap();
    }

    @Override // qb.InterfaceC6168b
    public Object b(String str) {
        return this.f57908a.get(str);
    }

    @Override // qb.InterfaceC6168b
    public List d(String str, List list) {
        Object obj = this.f57908a.get(str);
        return obj instanceof List ? (List) obj : list;
    }

    @Override // qb.InterfaceC6168b
    public Map e(String str, Map map) {
        Object obj = this.f57908a.get(str);
        return obj instanceof Map ? (Map) obj : map;
    }

    @Override // qb.InterfaceC6168b
    public boolean f(String str) {
        return this.f57908a.containsKey(str);
    }

    @Override // qb.InterfaceC6168b
    public boolean getBoolean(String str, boolean z10) {
        Object obj = this.f57908a.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z10;
    }

    @Override // qb.InterfaceC6168b
    public int getInt(String str, int i10) {
        Object obj = this.f57908a.get(str);
        return obj instanceof Number ? ((Number) obj).intValue() : i10;
    }

    @Override // qb.InterfaceC6168b
    public String getString(String str, String str2) {
        Object obj = this.f57908a.get(str);
        return obj instanceof String ? (String) obj : str2;
    }

    public C6167a(Map map) {
        this.f57908a = map;
    }
}
