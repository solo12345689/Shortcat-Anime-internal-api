package vb;

import Df.r;
import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: vb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6856a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6856a f62037a = new C6856a();

    private C6856a() {
    }

    public final boolean a() {
        String FINGERPRINT = Build.FINGERPRINT;
        AbstractC5504s.g(FINGERPRINT, "FINGERPRINT");
        if (r.Q(FINGERPRINT, "generic", false, 2, null)) {
            return true;
        }
        AbstractC5504s.g(FINGERPRINT, "FINGERPRINT");
        if (r.Q(FINGERPRINT, "unknown", false, 2, null)) {
            return true;
        }
        String MODEL = Build.MODEL;
        AbstractC5504s.g(MODEL, "MODEL");
        if (r.W(MODEL, "google_sdk", false, 2, null)) {
            return true;
        }
        AbstractC5504s.g(MODEL, "MODEL");
        Locale ROOT = Locale.ROOT;
        AbstractC5504s.g(ROOT, "ROOT");
        String lowerCase = MODEL.toLowerCase(ROOT);
        AbstractC5504s.g(lowerCase, "toLowerCase(...)");
        if (r.W(lowerCase, "droid4x", false, 2, null)) {
            return true;
        }
        AbstractC5504s.g(MODEL, "MODEL");
        if (r.W(MODEL, "Emulator", false, 2, null)) {
            return true;
        }
        AbstractC5504s.g(MODEL, "MODEL");
        if (r.W(MODEL, "Android SDK built for x86", false, 2, null)) {
            return true;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC5504s.g(MANUFACTURER, "MANUFACTURER");
        if (r.W(MANUFACTURER, "Genymotion", false, 2, null)) {
            return true;
        }
        String HARDWARE = Build.HARDWARE;
        AbstractC5504s.g(HARDWARE, "HARDWARE");
        if (r.W(HARDWARE, "goldfish", false, 2, null)) {
            return true;
        }
        AbstractC5504s.g(HARDWARE, "HARDWARE");
        if (r.W(HARDWARE, "ranchu", false, 2, null)) {
            return true;
        }
        AbstractC5504s.g(HARDWARE, "HARDWARE");
        if (r.W(HARDWARE, "vbox86", false, 2, null)) {
            return true;
        }
        String PRODUCT = Build.PRODUCT;
        AbstractC5504s.g(PRODUCT, "PRODUCT");
        if (r.W(PRODUCT, "sdk", false, 2, null)) {
            return true;
        }
        AbstractC5504s.g(PRODUCT, "PRODUCT");
        if (r.W(PRODUCT, "google_sdk", false, 2, null)) {
            return true;
        }
        AbstractC5504s.g(PRODUCT, "PRODUCT");
        if (r.W(PRODUCT, "sdk_google", false, 2, null)) {
            return true;
        }
        AbstractC5504s.g(PRODUCT, "PRODUCT");
        if (r.W(PRODUCT, "sdk_x86", false, 2, null)) {
            return true;
        }
        AbstractC5504s.g(PRODUCT, "PRODUCT");
        if (r.W(PRODUCT, "vbox86p", false, 2, null)) {
            return true;
        }
        AbstractC5504s.g(PRODUCT, "PRODUCT");
        if (r.W(PRODUCT, "emulator", false, 2, null)) {
            return true;
        }
        AbstractC5504s.g(PRODUCT, "PRODUCT");
        if (r.W(PRODUCT, "simulator", false, 2, null)) {
            return true;
        }
        String BOARD = Build.BOARD;
        AbstractC5504s.g(BOARD, "BOARD");
        AbstractC5504s.g(ROOT, "ROOT");
        String lowerCase2 = BOARD.toLowerCase(ROOT);
        AbstractC5504s.g(lowerCase2, "toLowerCase(...)");
        if (r.W(lowerCase2, "nox", false, 2, null)) {
            return true;
        }
        String BOOTLOADER = Build.BOOTLOADER;
        AbstractC5504s.g(BOOTLOADER, "BOOTLOADER");
        AbstractC5504s.g(ROOT, "ROOT");
        String lowerCase3 = BOOTLOADER.toLowerCase(ROOT);
        AbstractC5504s.g(lowerCase3, "toLowerCase(...)");
        if (r.W(lowerCase3, "nox", false, 2, null)) {
            return true;
        }
        AbstractC5504s.g(HARDWARE, "HARDWARE");
        AbstractC5504s.g(ROOT, "ROOT");
        String lowerCase4 = HARDWARE.toLowerCase(ROOT);
        AbstractC5504s.g(lowerCase4, "toLowerCase(...)");
        if (r.W(lowerCase4, "nox", false, 2, null)) {
            return true;
        }
        AbstractC5504s.g(PRODUCT, "PRODUCT");
        AbstractC5504s.g(ROOT, "ROOT");
        String lowerCase5 = PRODUCT.toLowerCase(ROOT);
        AbstractC5504s.g(lowerCase5, "toLowerCase(...)");
        if (r.W(lowerCase5, "nox", false, 2, null)) {
            return true;
        }
        String BRAND = Build.BRAND;
        AbstractC5504s.g(BRAND, "BRAND");
        if (r.Q(BRAND, "generic", false, 2, null)) {
            String DEVICE = Build.DEVICE;
            AbstractC5504s.g(DEVICE, "DEVICE");
            if (r.Q(DEVICE, "generic", false, 2, null)) {
                return true;
            }
        }
        return false;
    }
}
