package Ab;

import Td.AbstractC2163n;
import Td.F;
import Td.N;
import android.content.Context;
import android.content.SharedPreferences;
import ie.InterfaceC5082a;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f360c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f362b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final double a(UUID uuid) {
            AbstractC5504s.h(uuid, "uuid");
            return N.e(F.b(uuid.getLeastSignificantBits())) / N.e(-1L);
        }

        private a() {
        }
    }

    public b(Context context) {
        AbstractC5504s.h(context, "context");
        this.f361a = context;
        this.f362b = AbstractC2163n.b(new InterfaceC5082a() { // from class: Ab.a
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return b.c(this.f359a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID c(b bVar) {
        SharedPreferences sharedPreferences = bVar.f361a.getSharedPreferences("dev.expo.EASSharedPreferences", 0);
        String string = sharedPreferences.getString("eas-client-id", null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("eas-client-id", string);
            editorEdit.apply();
        }
        return UUID.fromString(string);
    }

    public final UUID b() {
        Object value = this.f362b.getValue();
        AbstractC5504s.g(value, "getValue(...)");
        return (UUID) value;
    }
}
