package Sg;

import Oh.i;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f16668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f16670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Map f16671e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16672a;

    static {
        a aVar = new a("ML-KEM-512");
        f16668b = aVar;
        a aVar2 = new a("ML-KEM-768");
        f16669c = aVar2;
        a aVar3 = new a("ML-KEM-1024");
        f16670d = aVar3;
        HashMap map = new HashMap();
        f16671e = map;
        map.put("ml-kem-512", aVar);
        f16671e.put("ml-kem-768", aVar2);
        f16671e.put("ml-kem-1024", aVar3);
        f16671e.put("kyber512", aVar);
        f16671e.put("kyber768", aVar2);
        f16671e.put("kyber1024", aVar3);
    }

    private a(String str) {
        this.f16672a = str;
    }

    public static a a(String str) {
        if (str == null) {
            throw new NullPointerException("name cannot be null");
        }
        a aVar = (a) f16671e.get(i.f(str));
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("unknown parameter name: " + str);
    }

    public String b() {
        return this.f16672a;
    }
}
