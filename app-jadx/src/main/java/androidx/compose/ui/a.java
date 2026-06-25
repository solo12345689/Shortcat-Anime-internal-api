package androidx.compose.ui;

import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f26571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f26572c;

    /* JADX INFO: renamed from: androidx.compose.ui.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0463a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0463a f26573a = new C0463a();

        C0463a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, e.b bVar) {
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public a(e eVar, e eVar2) {
        this.f26571b = eVar;
        this.f26572c = eVar2;
    }

    public final e a() {
        return this.f26572c;
    }

    @Override // androidx.compose.ui.e
    public boolean all(Function1 function1) {
        return this.f26571b.all(function1) && this.f26572c.all(function1);
    }

    public final e c() {
        return this.f26571b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC5504s.c(this.f26571b, aVar.f26571b) && AbstractC5504s.c(this.f26572c, aVar.f26572c);
    }

    @Override // androidx.compose.ui.e
    public Object foldIn(Object obj, Function2 function2) {
        return this.f26572c.foldIn(this.f26571b.foldIn(obj, function2), function2);
    }

    public int hashCode() {
        return this.f26571b.hashCode() + (this.f26572c.hashCode() * 31);
    }

    public String toString() {
        return '[' + ((String) foldIn("", C0463a.f26573a)) + ']';
    }
}
