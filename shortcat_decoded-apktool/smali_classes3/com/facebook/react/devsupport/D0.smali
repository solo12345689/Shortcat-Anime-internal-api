.class public final Lcom/facebook/react/devsupport/D0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/D0$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/facebook/react/devsupport/D0;

.field private static final b:Ljava/util/regex/Pattern;

.field private static final c:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/D0;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/devsupport/D0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/devsupport/D0;->a:Lcom/facebook/react/devsupport/D0;

    .line 7
    .line 8
    const-string v0, "^(?:(.*?)@)?(.*?)\\:([0-9]+)\\:([0-9]+)$"

    .line 9
    .line 10
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "compile(...)"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/facebook/react/devsupport/D0;->b:Ljava/util/regex/Pattern;

    .line 20
    .line 21
    const-string v0, "\\s*(?:at)\\s*(.+?)\\s*[@(](.*):([0-9]+):([0-9]+)[)]$"

    .line 22
    .line 23
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lcom/facebook/react/devsupport/D0;->c:Ljava/util/regex/Pattern;

    .line 31
    .line 32
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final a(Ljava/lang/Throwable;)[Lc7/k;
    .locals 12

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    array-length v0, p0

    .line 11
    new-array v1, v0, [Lc7/k;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-ge v2, v0, :cond_0

    .line 15
    .line 16
    new-instance v3, Lcom/facebook/react/devsupport/D0$a;

    .line 17
    .line 18
    aget-object v4, p0, v2

    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    aget-object v5, p0, v2

    .line 25
    .line 26
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    aget-object v6, p0, v2

    .line 31
    .line 32
    invoke-virtual {v6}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    const-string v7, "getMethodName(...)"

    .line 37
    .line 38
    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    aget-object v7, p0, v2

    .line 42
    .line 43
    invoke-virtual {v7}, Ljava/lang/StackTraceElement;->getLineNumber()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    const/16 v10, 0x20

    .line 48
    .line 49
    const/4 v11, 0x0

    .line 50
    const/4 v8, -0x1

    .line 51
    const/4 v9, 0x0

    .line 52
    invoke-direct/range {v3 .. v11}, Lcom/facebook/react/devsupport/D0$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 53
    .line 54
    .line 55
    aput-object v3, v1, v2

    .line 56
    .line 57
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    return-object v1
.end method

.method public static final b(Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ProcessedError;)Lcom/facebook/react/bridge/JavaOnlyMap;
    .locals 8

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/facebook/react/bridge/JavaOnlyArray;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/facebook/react/bridge/JavaOnlyArray;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ProcessedError;->getStack()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ProcessedError$StackFrame;

    .line 30
    .line 31
    new-instance v3, Lcom/facebook/react/bridge/JavaOnlyMap;

    .line 32
    .line 33
    invoke-direct {v3}, Lcom/facebook/react/bridge/JavaOnlyMap;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-interface {v2}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ProcessedError$StackFrame;->getColumn()Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    const-string v5, "column"

    .line 47
    .line 48
    int-to-double v6, v4

    .line 49
    invoke-virtual {v3, v5, v6, v7}, Lcom/facebook/react/bridge/JavaOnlyMap;->putDouble(Ljava/lang/String;D)V

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-interface {v2}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ProcessedError$StackFrame;->getLineNumber()Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    if-eqz v4, :cond_1

    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    const-string v5, "lineNumber"

    .line 63
    .line 64
    int-to-double v6, v4

    .line 65
    invoke-virtual {v3, v5, v6, v7}, Lcom/facebook/react/bridge/JavaOnlyMap;->putDouble(Ljava/lang/String;D)V

    .line 66
    .line 67
    .line 68
    :cond_1
    const-string v4, "file"

    .line 69
    .line 70
    invoke-interface {v2}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ProcessedError$StackFrame;->getFile()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {v3, v4, v5}, Lcom/facebook/react/bridge/JavaOnlyMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-string v4, "methodName"

    .line 78
    .line 79
    invoke-interface {v2}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ProcessedError$StackFrame;->getMethodName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v3, v4, v2}, Lcom/facebook/react/bridge/JavaOnlyMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v3}, Lcom/facebook/react/bridge/JavaOnlyArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    new-instance v1, Lcom/facebook/react/bridge/JavaOnlyMap;

    .line 91
    .line 92
    invoke-direct {v1}, Lcom/facebook/react/bridge/JavaOnlyMap;-><init>()V

    .line 93
    .line 94
    .line 95
    const-string v2, "message"

    .line 96
    .line 97
    invoke-interface {p0}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ProcessedError;->getMessage()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v1, v2, v3}, Lcom/facebook/react/bridge/JavaOnlyMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {p0}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ProcessedError;->getOriginalMessage()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    if-eqz v2, :cond_3

    .line 109
    .line 110
    const-string v3, "originalMessage"

    .line 111
    .line 112
    invoke-virtual {v1, v3, v2}, Lcom/facebook/react/bridge/JavaOnlyMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_3
    invoke-interface {p0}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ProcessedError;->getName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    if-eqz v2, :cond_4

    .line 120
    .line 121
    const-string v3, "name"

    .line 122
    .line 123
    invoke-virtual {v1, v3, v2}, Lcom/facebook/react/bridge/JavaOnlyMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    :cond_4
    invoke-interface {p0}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ProcessedError;->getComponentStack()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    if-eqz v2, :cond_5

    .line 131
    .line 132
    const-string v3, "componentStack"

    .line 133
    .line 134
    invoke-virtual {v1, v3, v2}, Lcom/facebook/react/bridge/JavaOnlyMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :cond_5
    const-string v2, "stack"

    .line 138
    .line 139
    invoke-virtual {v1, v2, v0}, Lcom/facebook/react/bridge/JavaOnlyMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 140
    .line 141
    .line 142
    const-string v0, "id"

    .line 143
    .line 144
    invoke-interface {p0}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ProcessedError;->getId()I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    invoke-virtual {v1, v0, v2}, Lcom/facebook/react/bridge/JavaOnlyMap;->putInt(Ljava/lang/String;I)V

    .line 149
    .line 150
    .line 151
    const-string v0, "isFatal"

    .line 152
    .line 153
    invoke-interface {p0}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ProcessedError;->isFatal()Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    invoke-virtual {v1, v0, v2}, Lcom/facebook/react/bridge/JavaOnlyMap;->putBoolean(Ljava/lang/String;Z)V

    .line 158
    .line 159
    .line 160
    const-string v0, "extraData"

    .line 161
    .line 162
    invoke-interface {p0}, Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ProcessedError;->getExtraData()Lcom/facebook/react/bridge/ReadableMap;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-virtual {v1, v0, p0}, Lcom/facebook/react/bridge/JavaOnlyMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 167
    .line 168
    .line 169
    return-object v1
.end method


# virtual methods
.method public final c(Lc7/k;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "frame"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lc7/k;->getFileName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Lc7/k;->a()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-lez v1, :cond_0

    .line 23
    .line 24
    const-string v2, ":"

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Lc7/k;->getColumn()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-lez p1, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string v0, "toString(...)"

    .line 49
    .line 50
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object p1
.end method
