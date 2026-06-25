package com.revenuecat.purchases.utils;

import Cf.i;
import Cf.l;
import Df.r;
import Td.L;
import Ud.S;
import com.revenuecat.purchases.DebugEvent;
import com.revenuecat.purchases.DebugEventName;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.utils.Event;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 +*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001+BG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0019\u001a\u00020\u00112\u001a\u0010\u0018\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0017\u0012\u0004\u0012\u00020\u00110\b¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u00020\u00112\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0017\u0012\u0004\u0012\u00020\u00110\b¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R0\u0010'\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010%\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u001a¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/utils/Event;", "T", "", "Lcom/revenuecat/purchases/common/FileHelper;", "fileHelper", "", "filePath", "Lkotlin/Function1;", "eventSerializer", "eventDeserializer", "<init>", "(Lcom/revenuecat/purchases/common/FileHelper;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "string", "mapToEvent", "(Ljava/lang/String;)Lcom/revenuecat/purchases/utils/Event;", "event", "LTd/L;", "appendEvent", "(Lcom/revenuecat/purchases/utils/Event;)V", "", "fileSizeInKB", "()D", "LCf/i;", "block", "readFile", "(Lkotlin/jvm/functions/Function1;)V", "Lorg/json/JSONObject;", "readFileAsJson", "", "eventsToDeleteCount", "clear", "(I)V", "deleteFile", "()V", "Lcom/revenuecat/purchases/common/FileHelper;", "Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "Lcom/revenuecat/purchases/DebugEvent;", "debugEventCallback", "getDebugEventCallback", "()Lkotlin/jvm/functions/Function1;", "setDebugEventCallback", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class EventsFileHelper<T extends Event> {
    public static final int MAX_EVENT_PROPERTY_SIZE = 80;
    private Function1 debugEventCallback;
    private final Function1 eventDeserializer;
    private final Function1 eventSerializer;
    private final FileHelper fileHelper;
    private final String filePath;

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$clear$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/utils/Event;", "T", "", "e", "LTd/L;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        final /* synthetic */ EventsFileHelper<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(EventsFileHelper<T> eventsFileHelper) {
            super(1);
            this.this$0 = eventsFileHelper;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return L.f17438a;
        }

        public final void invoke(Throwable e10) {
            AbstractC5504s.h(e10, "e");
            Function1 debugEventCallback = this.this$0.getDebugEventCallback();
            if (debugEventCallback != null) {
                DebugEventName debugEventName = DebugEventName.REMOVE_LINES_EXCEPTION;
                Map mapC = S.c();
                String strV = O.b(e10.getClass()).v();
                if (strV == null) {
                    strV = "Unknown";
                }
                mapC.put("exceptionType", strV);
                String message = e10.getMessage();
                if (message != null) {
                    mapC.put("message", r.s1(message, 80));
                }
                L l10 = L.f17438a;
                debugEventCallback.invoke(new DebugEvent(debugEventName, S.b(mapC)));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/revenuecat/purchases/utils/Event;", "T", "LCf/i;", "", "sequence", "LTd/L;", "invoke", "(LCf/i;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C45201 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $block;
        final /* synthetic */ EventsFileHelper<T> this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFile$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "T", "Lcom/revenuecat/purchases/utils/Event;", "line", "", "invoke", "(Ljava/lang/String;)Lcom/revenuecat/purchases/utils/Event;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class C06951 extends AbstractC5506u implements Function1 {
            final /* synthetic */ EventsFileHelper<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06951(EventsFileHelper<T> eventsFileHelper) {
                super(1);
                this.this$0 = eventsFileHelper;
            }

            @Override // kotlin.jvm.functions.Function1
            public final T invoke(String line) {
                AbstractC5504s.h(line, "line");
                return (T) this.this$0.mapToEvent(line);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C45201(Function1 function1, EventsFileHelper<T> eventsFileHelper) {
            super(1);
            this.$block = function1;
            this.this$0 = eventsFileHelper;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((i) obj);
            return L.f17438a;
        }

        public final void invoke(i sequence) {
            AbstractC5504s.h(sequence, "sequence");
            this.$block.invoke(l.K(sequence, new C06951(this.this$0)));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFileAsJson$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/revenuecat/purchases/utils/Event;", "T", "LCf/i;", "", "sequence", "LTd/L;", "invoke", "(LCf/i;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C45211 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $block;

        /* JADX INFO: renamed from: com.revenuecat.purchases.utils.EventsFileHelper$readFileAsJson$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "T", "Lcom/revenuecat/purchases/utils/Event;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class C06961 extends AbstractC5506u implements Function1 {
            public static final C06961 INSTANCE = new C06961();

            C06961() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final JSONObject invoke(String it) {
                AbstractC5504s.h(it, "it");
                return new JSONObject(it);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C45211(Function1 function1) {
            super(1);
            this.$block = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((i) obj);
            return L.f17438a;
        }

        public final void invoke(i sequence) {
            AbstractC5504s.h(sequence, "sequence");
            this.$block.invoke(l.K(sequence, C06961.INSTANCE));
        }
    }

    public EventsFileHelper(FileHelper fileHelper, String filePath, Function1 function1, Function1 function12) {
        AbstractC5504s.h(fileHelper, "fileHelper");
        AbstractC5504s.h(filePath, "filePath");
        this.fileHelper = fileHelper;
        this.filePath = filePath;
        this.eventSerializer = function1;
        this.eventDeserializer = function12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T mapToEvent(String string) {
        Function1 function1 = this.eventDeserializer;
        if (function1 == null) {
            Function1 function12 = this.debugEventCallback;
            if (function12 != null) {
                function12.invoke(new DebugEvent(DebugEventName.DESERIALIZATION_ERROR, S.i()));
            }
            return null;
        }
        try {
            return (T) function1.invoke(string);
        } catch (SerializationException e10) {
            Function1 function13 = this.debugEventCallback;
            if (function13 != null) {
                DebugEventName debugEventName = DebugEventName.DESERIALIZATION_ERROR;
                Map mapC = S.c();
                mapC.put("exceptionType", "SerializationException");
                String message = e10.getMessage();
                if (message != null) {
                    mapC.put("message", r.s1(message, 80));
                }
                L l10 = L.f17438a;
                function13.invoke(new DebugEvent(debugEventName, S.b(mapC)));
            }
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error parsing event from file: " + string, e10);
            return null;
        } catch (IllegalArgumentException e11) {
            Function1 function14 = this.debugEventCallback;
            if (function14 != null) {
                DebugEventName debugEventName2 = DebugEventName.DESERIALIZATION_ERROR;
                Map mapC2 = S.c();
                mapC2.put("exceptionType", "IllegalArgumentException");
                String message2 = e11.getMessage();
                if (message2 != null) {
                    mapC2.put("message", r.s1(message2, 80));
                }
                L l11 = L.f17438a;
                function14.invoke(new DebugEvent(debugEventName2, S.b(mapC2)));
            }
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error parsing event from file: " + string, e11);
            return null;
        }
    }

    public final synchronized void appendEvent(T event) {
        String string;
        try {
            AbstractC5504s.h(event, "event");
            try {
                FileHelper fileHelper = this.fileHelper;
                String str = this.filePath;
                StringBuilder sb2 = new StringBuilder();
                Function1 function1 = this.eventSerializer;
                if (function1 == null || (string = (String) function1.invoke(event)) == null) {
                    string = event.toString();
                }
                sb2.append(string);
                sb2.append('\n');
                fileHelper.appendToFile(str, sb2.toString());
            } catch (Exception e10) {
                Function1 function12 = this.debugEventCallback;
                if (function12 != null) {
                    DebugEventName debugEventName = DebugEventName.APPEND_EVENT_EXCEPTION;
                    Map mapC = S.c();
                    String strV = O.b(e10.getClass()).v();
                    if (strV == null) {
                        strV = "Unknown";
                    }
                    mapC.put("exceptionType", strV);
                    String message = e10.getMessage();
                    if (message != null) {
                        mapC.put("message", r.s1(message, 80));
                    }
                    L l10 = L.f17438a;
                    function12.invoke(new DebugEvent(debugEventName, S.b(mapC)));
                }
                throw e10;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void clear(int eventsToDeleteCount) {
        this.fileHelper.removeFirstLinesFromFile(this.filePath, eventsToDeleteCount, new AnonymousClass1(this));
    }

    public final synchronized void deleteFile() {
        if (!this.fileHelper.deleteFile(this.filePath)) {
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "Failed to delete events file in " + this.filePath + com.amazon.a.a.o.c.a.b.f34706a);
            }
        }
    }

    public final synchronized double fileSizeInKB() {
        return this.fileHelper.fileSizeInKB(this.filePath);
    }

    public final Function1 getDebugEventCallback() {
        return this.debugEventCallback;
    }

    public final synchronized void readFile(Function1 block) {
        try {
            AbstractC5504s.h(block, "block");
            if (this.eventDeserializer == null || this.fileHelper.fileIsEmpty(this.filePath)) {
                block.invoke(l.i());
            } else {
                this.fileHelper.readFilePerLines(this.filePath, new C45201(block, this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void readFileAsJson(Function1 block) {
        try {
            AbstractC5504s.h(block, "block");
            if (this.fileHelper.fileIsEmpty(this.filePath)) {
                block.invoke(l.i());
            } else {
                this.fileHelper.readFilePerLines(this.filePath, new C45211(block));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void setDebugEventCallback(Function1 function1) {
        this.debugEventCallback = function1;
    }

    public /* synthetic */ EventsFileHelper(FileHelper fileHelper, String str, Function1 function1, Function1 function12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fileHelper, str, (i10 & 4) != 0 ? null : function1, (i10 & 8) != 0 ? null : function12);
    }
}
