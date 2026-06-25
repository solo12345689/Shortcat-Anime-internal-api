package expo.modules.kotlin.jni.worklets;

import be.AbstractC3048a;
import com.facebook.jni.HybridData;
import expo.modules.kotlin.jni.Destructible;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\b\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0017\u0010\u0005\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/kotlin/jni/worklets/Serializable;", "Lexpo/modules/kotlin/jni/Destructible;", "Lcom/facebook/jni/HybridData;", "mHybridData", "", "type", "<init>", "(Lcom/facebook/jni/HybridData;I)V", "LTd/L;", "finalize", "()V", "a", "()Lcom/facebook/jni/HybridData;", "Lcom/facebook/jni/HybridData;", "Lexpo/modules/kotlin/jni/worklets/Serializable$a;", "Lexpo/modules/kotlin/jni/worklets/Serializable$a;", "b", "()Lexpo/modules/kotlin/jni/worklets/Serializable$a;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Serializable implements Destructible {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a type;
    private final HybridData mHybridData;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f46153b = new a("Undefined", 0, 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f46154c = new a("Null", 1, 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f46155d = new a("Boolean", 2, 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f46156e = new a("Number", 3, 4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f46157f = new a("BigInt", 4, 5);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f46158g = new a("String", 5, 6);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f46159h = new a("Object", 6, 7);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f46160i = new a("Array", 7, 8);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f46161j = new a("Map", 8, 9);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f46162k = new a("Set", 9, 10);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f46163l = new a("Worklet", 10, 11);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f46164m = new a("RemoteFunction", 11, 12);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f46165n = new a("Handle", 12, 13);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f46166o = new a("HostObject", 13, 14);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f46167p = new a("HostFunction", 14, 15);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f46168q = new a("ArrayBuffer", 15, 16);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f46169r = new a("TurboModuleLike", 16, 17);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f46170s = new a("Import", 17, 18);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final a f46171t = new a("Synchronizable", 18, 19);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final a f46172u = new a("Custom", 19, 20);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final /* synthetic */ a[] f46173v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f46174w;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f46175a;

        static {
            a[] aVarArrA = a();
            f46173v = aVarArrA;
            f46174w = AbstractC3048a.a(aVarArrA);
        }

        private a(String str, int i10, int i11) {
            this.f46175a = i11;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f46153b, f46154c, f46155d, f46156e, f46157f, f46158g, f46159h, f46160i, f46161j, f46162k, f46163l, f46164m, f46165n, f46166o, f46167p, f46168q, f46169r, f46170s, f46171t, f46172u};
        }

        public static EnumEntries b() {
            return f46174w;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f46173v.clone();
        }

        public final int c() {
            return this.f46175a;
        }
    }

    private Serializable(HybridData hybridData, int i10) {
        this.mHybridData = hybridData;
        for (a aVar : a.b()) {
            if (aVar.c() == i10) {
                this.type = aVar;
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // expo.modules.kotlin.jni.Destructible
    /* JADX INFO: renamed from: a, reason: from getter */
    public HybridData getMHybridData() {
        return this.mHybridData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getType() {
        return this.type;
    }

    protected final void finalize() {
        this.mHybridData.resetNative();
    }
}
