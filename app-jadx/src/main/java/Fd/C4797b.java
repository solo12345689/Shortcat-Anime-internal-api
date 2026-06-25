package fd;

import Zd.e;
import android.content.Context;
import android.util.Base64;
import com.revenuecat.purchases.common.Constants;
import ed.C4669b;
import ed.g;
import expo.modules.securestore.SecureStoreOptions;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: renamed from: fd.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4797b implements InterfaceC4798c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f47006d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f47007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4796a f47008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SecureRandom f47009c;

    /* JADX INFO: renamed from: fd.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4797b(Context mContext, C4796a mAESEncryptor) {
        AbstractC5504s.h(mContext, "mContext");
        AbstractC5504s.h(mAESEncryptor, "mAESEncryptor");
        this.f47007a = mContext;
        this.f47008b = mAESEncryptor;
        this.f47009c = new SecureRandom();
    }

    private final Cipher e() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher = Cipher.getInstance("RSA/None/PKCS1Padding");
        AbstractC5504s.g(cipher, "getInstance(...)");
        return cipher;
    }

    @Override // fd.InterfaceC4798c
    public String a(SecureStoreOptions options, boolean z10) {
        AbstractC5504s.h(options, "options");
        String str = z10 ? "keystoreAuthenticated" : "keystoreUnauthenticated";
        return b(options) + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str;
    }

    @Override // fd.InterfaceC4798c
    public String b(SecureStoreOptions options) {
        AbstractC5504s.h(options, "options");
        return "RSA/None/PKCS1Padding:" + options.getKeychainService();
    }

    public Object d(String str, JSONObject jSONObject, KeyStore.PrivateKeyEntry privateKeyEntry, SecureStoreOptions secureStoreOptions, C4669b c4669b, e eVar) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        byte[] bArrDecode = Base64.decode(jSONObject.getString("esk"), 0);
        Cipher cipherE = e();
        cipherE.init(2, privateKeyEntry.getPrivateKey());
        return this.f47008b.f(str, jSONObject, new KeyStore.SecretKeyEntry(new SecretKeySpec(cipherE.doFinal(bArrDecode), "AES")), secureStoreOptions, c4669b, eVar);
    }

    @Override // fd.InterfaceC4798c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public KeyStore.PrivateKeyEntry c(KeyStore keyStore, SecureStoreOptions options) throws g {
        AbstractC5504s.h(keyStore, "keyStore");
        AbstractC5504s.h(options, "options");
        throw new g("Tried to initialize HybridAESEncryptor key store entry on Android SDK >= 23. This shouldn't happen. If you see this message report an issue at https://github.com/expo/expo.");
    }
}
