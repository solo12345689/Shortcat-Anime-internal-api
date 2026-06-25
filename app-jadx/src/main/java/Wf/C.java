package Wf;

import Ud.AbstractC2279u;
import Xf.a0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import je.InterfaceC5371a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0001\u001bB\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0001H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u001e0\u001d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0014\u0010%\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010\u000eR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010&8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"LWf/C;", "LWf/i;", "", "", "content", "<init>", "(Ljava/util/Map;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", SubscriberAttributeKt.JSON_NAME_KEY, "d", "(Ljava/lang/String;)Z", "value", "e", "(LWf/i;)Z", "f", "(Ljava/lang/String;)LWf/i;", "isEmpty", "()Z", "a", "Ljava/util/Map;", "", "", "i", "()Ljava/util/Set;", "entries", "l", "keys", "n", "size", "", "p", "()Ljava/util/Collection;", "values", "Companion", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C extends i implements Map<String, i>, InterfaceC5371a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map content;

    /* JADX INFO: renamed from: Wf.C$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        private Companion() {
        }

        public final Rf.b serializer() {
            return D.f20883a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Map content) {
        super(null);
        AbstractC5504s.h(content, "content");
        this.content = content;
    }

    public static final CharSequence t(Map.Entry entry) {
        AbstractC5504s.h(entry, "<destruct>");
        String str = (String) entry.getKey();
        i iVar = (i) entry.getValue();
        StringBuilder sb2 = new StringBuilder();
        a0.c(sb2, str);
        sb2.append(':');
        sb2.append(iVar);
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i compute(String str, BiFunction<? super String, ? super i, ? extends i> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i computeIfAbsent(String str, Function<? super String, ? extends i> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i computeIfPresent(String str, BiFunction<? super String, ? super i, ? extends i> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return d((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof i) {
            return e((i) obj);
        }
        return false;
    }

    public boolean d(String str) {
        AbstractC5504s.h(str, "key");
        return this.content.containsKey(str);
    }

    public boolean e(i value) {
        AbstractC5504s.h(value, "value");
        return this.content.containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, i>> entrySet() {
        return i();
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        return AbstractC5504s.c(this.content, other);
    }

    public i f(String str) {
        AbstractC5504s.h(str, "key");
        return (i) this.content.get(str);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ i get(Object obj) {
        if (obj instanceof String) {
            return f((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.content.hashCode();
    }

    public Set i() {
        return this.content.entrySet();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.content.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return l();
    }

    public Set l() {
        return this.content.keySet();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i merge(String str, i iVar, BiFunction<? super i, ? super i, ? extends i> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int n() {
        return this.content.size();
    }

    public Collection p() {
        return this.content.values();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i put(String str, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends i> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i putIfAbsent(String str, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: r */
    public i remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ i replace(String str, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super i, ? extends i> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return n();
    }

    public String toString() {
        return AbstractC2279u.w0(this.content.entrySet(), com.amazon.a.a.o.b.f.f34694a, "{", "}", 0, null, new Function1() { // from class: Wf.B
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C.t((Map.Entry) obj);
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<i> values() {
        return p();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, i iVar, i iVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
