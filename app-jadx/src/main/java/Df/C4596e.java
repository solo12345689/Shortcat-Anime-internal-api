package df;

import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import ye.H;

/* JADX INFO: renamed from: df.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4596e extends AbstractC4609r {
    public C4596e(char c10) {
        super(Character.valueOf(c10));
    }

    private final String c(char c10) {
        switch (c10) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            case 11:
            default:
                return e(c10) ? String.valueOf(c10) : "?";
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return "\\f";
            case '\r':
                return "\\r";
        }
    }

    private final boolean e(char c10) {
        byte type = (byte) Character.getType(c10);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // df.AbstractC4598g
    /* JADX INFO: renamed from: d */
    public AbstractC6183d0 a(H module) {
        AbstractC5504s.h(module, "module");
        AbstractC6183d0 abstractC6183d0V = module.n().v();
        AbstractC5504s.g(abstractC6183d0V, "getCharType(...)");
        return abstractC6183d0V;
    }

    @Override // df.AbstractC4598g
    public String toString() {
        String str = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(((Character) b()).charValue()), c(((Character) b()).charValue())}, 2));
        AbstractC5504s.g(str, "format(...)");
        return str;
    }
}
