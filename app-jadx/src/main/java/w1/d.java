package W1;

import T1.C2140d;
import androidx.datastore.preferences.protobuf.C2817v;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20622a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(InputStream input) throws C2140d {
            AbstractC5504s.h(input, "input");
            try {
                f fVarV = f.V(input);
                AbstractC5504s.g(fVarV, "{\n                Prefer…From(input)\n            }");
                return fVarV;
            } catch (C2817v e10) {
                throw new C2140d("Unable to parse preferences proto.", e10);
            }
        }

        private a() {
        }
    }
}
