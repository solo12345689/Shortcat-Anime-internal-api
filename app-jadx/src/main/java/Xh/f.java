package Xh;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f22055a = 4;

    public static int a(int i10) {
        return 4 - (i10 % 4);
    }

    public static int b(char c10, CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            if (charSequence.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == '\n' || cCharAt == '\r') {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private static int d(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt != ' ') {
                switch (cCharAt) {
                    case '\t':
                    case '\n':
                    case 11:
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    case '\r':
                        break;
                    default:
                        return i10;
                }
            }
            i10++;
        }
        return -1;
    }

    public static boolean e(CharSequence charSequence) {
        int length = charSequence.length();
        return m(' ', charSequence, 0, length) != length;
    }

    public static boolean f(CharSequence charSequence) {
        return d(charSequence, 0) == -1;
    }

    public static boolean g(char c10) {
        switch (c10) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
                return true;
            default:
                switch (c10) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                        return true;
                    default:
                        switch (c10) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                                return true;
                            default:
                                switch (c10) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static boolean h(CharSequence charSequence, int i10) {
        return Character.isLetter(Character.codePointAt(charSequence, i10));
    }

    public static boolean i(int i10) {
        int type = Character.getType(i10);
        if (type != 29 && type != 30) {
            switch (type) {
                default:
                    if (i10 != 36 && i10 != 43 && i10 != 94 && i10 != 96 && i10 != 124 && i10 != 126) {
                        switch (i10) {
                            case 60:
                            case 61:
                            case 62:
                                break;
                            default:
                                return false;
                        }
                    }
                case 20:
                case 21:
                case 22:
                case 23:
                case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                    return true;
            }
        }
        return true;
    }

    public static boolean j(CharSequence charSequence, int i10) {
        if (i10 >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i10);
        return cCharAt == '\t' || cCharAt == ' ';
    }

    public static boolean k(int i10) {
        return i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32 || Character.getType(i10) == 12;
    }

    public static CharSequence l(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder sb2 = null;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == 0) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length);
                    sb2.append(charSequence, 0, i10);
                }
                sb2.append((char) 65533);
            } else if (sb2 != null) {
                sb2.append(cCharAt);
            }
        }
        return sb2 != null ? sb2.toString() : charSequence;
    }

    public static int m(char c10, CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            if (charSequence.charAt(i10) != c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int n(char c10, CharSequence charSequence, int i10, int i11) {
        while (i10 >= i11) {
            if (charSequence.charAt(i10) != c10) {
                return i10;
            }
            i10--;
        }
        return i11 - 1;
    }

    public static int o(CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int p(CharSequence charSequence, int i10, int i11) {
        while (i10 >= i11) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i10;
            }
            i10--;
        }
        return i11 - 1;
    }
}
