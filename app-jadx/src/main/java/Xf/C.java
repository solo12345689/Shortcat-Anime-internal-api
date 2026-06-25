package Xf;

import Td.C2160k;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class C {
    public static final C2387y a(Number value, String key, String output) {
        AbstractC5504s.h(value, "value");
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(output, "output");
        return e(-1, m(value, key, output));
    }

    public static final A b(Number value, String output) {
        AbstractC5504s.h(value, "value");
        AbstractC5504s.h(output, "output");
        return new A("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) k(output, 0, 1, null)));
    }

    public static final A c(Number value, String key, String output) {
        AbstractC5504s.h(value, "value");
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(output, "output");
        return new A(m(value, key, output));
    }

    public static final A d(Tf.e keyDescriptor) {
        AbstractC5504s.h(keyDescriptor, "keyDescriptor");
        return new A("Value of type '" + keyDescriptor.o() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.h() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final C2387y e(int i10, String message) {
        AbstractC5504s.h(message, "message");
        if (i10 >= 0) {
            message = "Unexpected JSON token at offset " + i10 + ": " + message;
        }
        return new C2387y(message);
    }

    public static final C2387y f(int i10, String message, CharSequence input) {
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(input, "input");
        return e(i10, message + "\nJSON input: " + ((Object) j(input, i10)));
    }

    public static final C2387y g(String key, String input) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(input, "input");
        return e(-1, "Encountered an unknown key '" + key + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) k(input, 0, 1, null)));
    }

    public static final Void h(AbstractC2364a abstractC2364a, String entity) {
        AbstractC5504s.h(abstractC2364a, "<this>");
        AbstractC5504s.h(entity, "entity");
        abstractC2364a.w("Trailing comma before the end of JSON " + entity, abstractC2364a.f21965a - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw new C2160k();
    }

    public static /* synthetic */ Void i(AbstractC2364a abstractC2364a, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "object";
        }
        return h(abstractC2364a, str);
    }

    public static final CharSequence j(CharSequence charSequence, int i10) {
        AbstractC5504s.h(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i10 != -1) {
                int i11 = i10 - 30;
                int i12 = i10 + 30;
                return (i11 <= 0 ? "" : ".....") + charSequence.subSequence(AbstractC5874j.e(i11, 0), AbstractC5874j.i(i12, charSequence.length())).toString() + (i12 >= charSequence.length() ? "" : ".....");
            }
            int length = charSequence.length() - 60;
            if (length > 0) {
                return "....." + charSequence.subSequence(length, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static /* synthetic */ CharSequence k(CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        return j(charSequence, i10);
    }

    public static final Void l(AbstractC2364a abstractC2364a, Number result) {
        AbstractC5504s.h(abstractC2364a, "<this>");
        AbstractC5504s.h(result, "result");
        AbstractC2364a.x(abstractC2364a, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new C2160k();
    }

    private static final String m(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) k(str2, 0, 1, null));
    }
}
