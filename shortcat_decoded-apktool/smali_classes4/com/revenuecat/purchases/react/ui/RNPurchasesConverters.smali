.class public final Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\u000c\u0012\u0004\u0012\u00020\u0008\u0012\u0002\u0008\u00030\u0007H\u0007J\u001d\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000cH\u0002\u00a2\u0006\u0002\u0010\rJ \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00082\u0010\u0010\u000e\u001a\u000c\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u0007\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;",
        "",
        "<init>",
        "()V",
        "convertMapToWriteableMap",
        "Lcom/facebook/react/bridge/WritableMap;",
        "map",
        "",
        "",
        "convertArrayToWritableArray",
        "Lcom/facebook/react/bridge/WritableArray;",
        "array",
        "",
        "([Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableArray;",
        "presentedOfferingContext",
        "Lcom/revenuecat/purchases/PresentedOfferingContext;",
        "offeringIdentifier",
        "react-native-purchases-ui_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;->INSTANCE:Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;

    .line 7
    .line 8
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

.method private final convertArrayToWritableArray([Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableArray;
    .locals 6

    .line 1
    new-instance v0, Lcom/facebook/react/bridge/WritableNativeArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeArray;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_9

    .line 10
    .line 11
    aget-object v4, p1, v3

    .line 12
    .line 13
    if-nez v4, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Lcom/facebook/react/bridge/WritableArray;->pushNull()V

    .line 16
    .line 17
    .line 18
    goto/16 :goto_1

    .line 19
    .line 20
    :cond_0
    instance-of v5, v4, Ljava/lang/Boolean;

    .line 21
    .line 22
    if-eqz v5, :cond_1

    .line 23
    .line 24
    check-cast v4, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-interface {v0, v4}, Lcom/facebook/react/bridge/WritableArray;->pushBoolean(Z)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    instance-of v5, v4, Ljava/lang/Integer;

    .line 35
    .line 36
    if-eqz v5, :cond_2

    .line 37
    .line 38
    check-cast v4, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-interface {v0, v4}, Lcom/facebook/react/bridge/WritableArray;->pushInt(I)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    instance-of v5, v4, Ljava/lang/Long;

    .line 49
    .line 50
    if-eqz v5, :cond_3

    .line 51
    .line 52
    check-cast v4, Ljava/lang/Number;

    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    long-to-double v4, v4

    .line 59
    invoke-interface {v0, v4, v5}, Lcom/facebook/react/bridge/WritableArray;->pushDouble(D)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    instance-of v5, v4, Ljava/lang/Double;

    .line 64
    .line 65
    if-eqz v5, :cond_4

    .line 66
    .line 67
    check-cast v4, Ljava/lang/Number;

    .line 68
    .line 69
    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    .line 70
    .line 71
    .line 72
    move-result-wide v4

    .line 73
    invoke-interface {v0, v4, v5}, Lcom/facebook/react/bridge/WritableArray;->pushDouble(D)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    instance-of v5, v4, Ljava/lang/String;

    .line 78
    .line 79
    if-eqz v5, :cond_5

    .line 80
    .line 81
    check-cast v4, Ljava/lang/String;

    .line 82
    .line 83
    invoke-interface {v0, v4}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    instance-of v5, v4, Ljava/util/Map;

    .line 88
    .line 89
    if-eqz v5, :cond_6

    .line 90
    .line 91
    const-string v5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>"

    .line 92
    .line 93
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    check-cast v4, Ljava/util/Map;

    .line 97
    .line 98
    invoke-static {v4}, Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;->convertMapToWriteableMap(Ljava/util/Map;)Lcom/facebook/react/bridge/WritableMap;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-interface {v0, v4}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_6
    instance-of v5, v4, [Ljava/lang/Object;

    .line 107
    .line 108
    if-eqz v5, :cond_7

    .line 109
    .line 110
    check-cast v4, [Ljava/lang/Object;

    .line 111
    .line 112
    invoke-direct {p0, v4}, Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;->convertArrayToWritableArray([Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableArray;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-interface {v0, v4}, Lcom/facebook/react/bridge/WritableArray;->pushArray(Lcom/facebook/react/bridge/ReadableArray;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_7
    instance-of v5, v4, Ljava/util/List;

    .line 121
    .line 122
    if-eqz v5, :cond_8

    .line 123
    .line 124
    check-cast v4, Ljava/util/Collection;

    .line 125
    .line 126
    new-array v5, v2, [Ljava/lang/Object;

    .line 127
    .line 128
    invoke-interface {v4, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-direct {p0, v4}, Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;->convertArrayToWritableArray([Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableArray;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-interface {v0, v4}, Lcom/facebook/react/bridge/WritableArray;->pushArray(Lcom/facebook/react/bridge/ReadableArray;)V

    .line 137
    .line 138
    .line 139
    :cond_8
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 140
    .line 141
    goto/16 :goto_0

    .line 142
    .line 143
    :cond_9
    return-object v0
.end method

.method public static final convertMapToWriteableMap(Ljava/util/Map;)Lcom/facebook/react/bridge/WritableMap;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)",
            "Lcom/facebook/react/bridge/WritableMap;"
        }
    .end annotation

    .line 1
    const-string v0, "map"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_9

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/util/Map$Entry;

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/WritableMap;->putNull(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    instance-of v3, v1, Ljava/lang/Boolean;

    .line 48
    .line 49
    if-eqz v3, :cond_2

    .line 50
    .line 51
    check-cast v1, Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    instance-of v3, v1, Ljava/lang/Integer;

    .line 62
    .line 63
    if-eqz v3, :cond_3

    .line 64
    .line 65
    check-cast v1, Ljava/lang/Number;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    instance-of v3, v1, Ljava/lang/Long;

    .line 76
    .line 77
    if-eqz v3, :cond_4

    .line 78
    .line 79
    check-cast v1, Ljava/lang/Number;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v3

    .line 85
    long-to-double v3, v3

    .line 86
    invoke-interface {v0, v2, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    instance-of v3, v1, Ljava/lang/Double;

    .line 91
    .line 92
    if-eqz v3, :cond_5

    .line 93
    .line 94
    check-cast v1, Ljava/lang/Number;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 97
    .line 98
    .line 99
    move-result-wide v3

    .line 100
    invoke-interface {v0, v2, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_5
    instance-of v3, v1, Ljava/lang/String;

    .line 105
    .line 106
    if-eqz v3, :cond_6

    .line 107
    .line 108
    check-cast v1, Ljava/lang/String;

    .line 109
    .line 110
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_6
    instance-of v3, v1, Ljava/util/Map;

    .line 115
    .line 116
    if-eqz v3, :cond_7

    .line 117
    .line 118
    const-string v3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>"

    .line 119
    .line 120
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    check-cast v1, Ljava/util/Map;

    .line 124
    .line 125
    invoke-static {v1}, Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;->convertMapToWriteableMap(Ljava/util/Map;)Lcom/facebook/react/bridge/WritableMap;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_7
    instance-of v3, v1, [Ljava/lang/Object;

    .line 134
    .line 135
    if-eqz v3, :cond_8

    .line 136
    .line 137
    sget-object v3, Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;->INSTANCE:Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;

    .line 138
    .line 139
    check-cast v1, [Ljava/lang/Object;

    .line 140
    .line 141
    invoke-direct {v3, v1}, Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;->convertArrayToWritableArray([Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableArray;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_0

    .line 149
    .line 150
    :cond_8
    instance-of v3, v1, Ljava/util/List;

    .line 151
    .line 152
    if-eqz v3, :cond_0

    .line 153
    .line 154
    sget-object v3, Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;->INSTANCE:Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;

    .line 155
    .line 156
    check-cast v1, Ljava/util/Collection;

    .line 157
    .line 158
    const/4 v4, 0x0

    .line 159
    new-array v4, v4, [Ljava/lang/Object;

    .line 160
    .line 161
    invoke-interface {v1, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-direct {v3, v1}, Lcom/revenuecat/purchases/react/ui/RNPurchasesConverters;->convertArrayToWritableArray([Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableArray;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 170
    .line 171
    .line 172
    goto/16 :goto_0

    .line 173
    .line 174
    :cond_9
    return-object v0
.end method


# virtual methods
.method public final presentedOfferingContext(Ljava/lang/String;Ljava/util/Map;)Lcom/revenuecat/purchases/PresentedOfferingContext;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "**>;)",
            "Lcom/revenuecat/purchases/PresentedOfferingContext;"
        }
    .end annotation

    .line 1
    const-string v0, "offeringIdentifier"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    new-instance p2, Lcom/revenuecat/purchases/PresentedOfferingContext;

    .line 9
    .line 10
    invoke-direct {p2, p1}, Lcom/revenuecat/purchases/PresentedOfferingContext;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-object p2

    .line 14
    :cond_0
    const-string v0, "targetingContext"

    .line 15
    .line 16
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    instance-of v1, v0, Ljava/util/Map;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    check-cast v0, Ljava/util/Map;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v0, v2

    .line 29
    :goto_0
    if-eqz v0, :cond_5

    .line 30
    .line 31
    const-string v1, "revision"

    .line 32
    .line 33
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    instance-of v3, v1, Ljava/lang/Number;

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    check-cast v1, Ljava/lang/Number;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move-object v1, v2

    .line 45
    :goto_1
    if-eqz v1, :cond_3

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    goto :goto_2

    .line 56
    :cond_3
    move-object v1, v2

    .line 57
    :goto_2
    const-string v3, "ruleId"

    .line 58
    .line 59
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    instance-of v3, v0, Ljava/lang/String;

    .line 64
    .line 65
    if-eqz v3, :cond_4

    .line 66
    .line 67
    check-cast v0, Ljava/lang/String;

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_4
    move-object v0, v2

    .line 71
    :goto_3
    if-eqz v1, :cond_5

    .line 72
    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    new-instance v3, Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-direct {v3, v1, v0}, Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;-><init>(ILjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_5
    move-object v3, v2

    .line 86
    :goto_4
    const-string v0, "placementIdentifier"

    .line 87
    .line 88
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    instance-of v0, p2, Ljava/lang/String;

    .line 93
    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    move-object v2, p2

    .line 97
    check-cast v2, Ljava/lang/String;

    .line 98
    .line 99
    :cond_6
    new-instance p2, Lcom/revenuecat/purchases/PresentedOfferingContext;

    .line 100
    .line 101
    invoke-direct {p2, p1, v2, v3}, Lcom/revenuecat/purchases/PresentedOfferingContext;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;)V

    .line 102
    .line 103
    .line 104
    return-object p2
.end method
