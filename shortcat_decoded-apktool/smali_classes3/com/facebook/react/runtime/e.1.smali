.class public final Lcom/facebook/react/runtime/e;
.super Lcom/facebook/react/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lc7/f;

.field private final b:Lq7/a;


# direct methods
.method public constructor <init>(Lc7/f;Lq7/a;)V
    .locals 1

    .line 1
    const-string v0, "devSupportManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "hardwareBackBtnHandler"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/facebook/react/a;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/facebook/react/runtime/e;->a:Lc7/f;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/facebook/react/runtime/e;->b:Lq7/a;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic a(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/runtime/e;->c(Ljava/util/Map;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final b()Ll7/a;
    .locals 13

    .line 1
    const-class v6, Lcom/facebook/react/devsupport/LogBoxModule;

    .line 2
    .line 3
    const-class v7, Lcom/facebook/react/modules/core/ExceptionsManagerModule;

    .line 4
    .line 5
    const-class v0, Lcom/facebook/react/modules/systeminfo/AndroidInfoModule;

    .line 6
    .line 7
    const-class v1, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;

    .line 8
    .line 9
    const-class v2, Lcom/facebook/react/modules/debug/SourceCodeModule;

    .line 10
    .line 11
    const-class v3, Lcom/facebook/react/modules/debug/DevMenuModule;

    .line 12
    .line 13
    const-class v4, Lcom/facebook/react/modules/debug/DevSettingsModule;

    .line 14
    .line 15
    const-class v5, Lcom/facebook/react/modules/core/DeviceEventManagerModule;

    .line 16
    .line 17
    filled-new-array/range {v0 .. v7}, [Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    :goto_0
    const/16 v3, 0x8

    .line 28
    .line 29
    if-ge v2, v3, :cond_1

    .line 30
    .line 31
    aget-object v3, v0, v2

    .line 32
    .line 33
    const-class v4, Lk7/a;

    .line 34
    .line 35
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Lk7/a;

    .line 40
    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    invoke-interface {v4}, Lk7/a;->name()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    new-instance v6, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 48
    .line 49
    invoke-interface {v4}, Lk7/a;->name()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    const-string v9, "getName(...)"

    .line 58
    .line 59
    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v4}, Lk7/a;->canOverrideExistingModule()Z

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    invoke-interface {v4}, Lk7/a;->needsEagerInit()Z

    .line 67
    .line 68
    .line 69
    move-result v10

    .line 70
    invoke-interface {v4}, Lk7/a;->isCxxModule()Z

    .line 71
    .line 72
    .line 73
    move-result v11

    .line 74
    sget-object v4, Lcom/facebook/react/module/model/ReactModuleInfo;->g:Lcom/facebook/react/module/model/ReactModuleInfo$a;

    .line 75
    .line 76
    invoke-virtual {v4, v3}, Lcom/facebook/react/module/model/ReactModuleInfo$a;->a(Ljava/lang/Class;)Z

    .line 77
    .line 78
    .line 79
    move-result v12

    .line 80
    invoke-direct/range {v6 .. v12}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZ)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    new-instance v0, Lcom/facebook/react/runtime/d;

    .line 90
    .line 91
    invoke-direct {v0, v1}, Lcom/facebook/react/runtime/d;-><init>(Ljava/util/Map;)V

    .line 92
    .line 93
    .line 94
    return-object v0
.end method

.method private static final c(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 1
    return-object p0
.end method


# virtual methods
.method public getModule(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "reactContext"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sparse-switch v0, :sswitch_data_0

    .line 16
    .line 17
    .line 18
    goto/16 :goto_0

    .line 19
    .line 20
    :sswitch_0
    const-string v0, "SourceCode"

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :cond_0
    new-instance p1, Lcom/facebook/react/modules/debug/SourceCodeModule;

    .line 31
    .line 32
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/debug/SourceCodeModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :sswitch_1
    const-string p2, "ExceptionsManager"

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    new-instance p1, Lcom/facebook/react/modules/core/ExceptionsManagerModule;

    .line 46
    .line 47
    iget-object p2, p0, Lcom/facebook/react/runtime/e;->a:Lc7/f;

    .line 48
    .line 49
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/core/ExceptionsManagerModule;-><init>(Lc7/f;)V

    .line 50
    .line 51
    .line 52
    return-object p1

    .line 53
    :sswitch_2
    const-string v0, "PlatformConstants"

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_6

    .line 60
    .line 61
    new-instance p1, Lcom/facebook/react/modules/systeminfo/AndroidInfoModule;

    .line 62
    .line 63
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/systeminfo/AndroidInfoModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :sswitch_3
    const-string v0, "DeviceEventManager"

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-nez p1, :cond_2

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    new-instance p1, Lcom/facebook/react/modules/core/DeviceEventManagerModule;

    .line 77
    .line 78
    iget-object v0, p0, Lcom/facebook/react/runtime/e;->b:Lq7/a;

    .line 79
    .line 80
    invoke-direct {p1, p2, v0}, Lcom/facebook/react/modules/core/DeviceEventManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lq7/a;)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    :sswitch_4
    const-string v0, "DevMenu"

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-nez p1, :cond_3

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    new-instance p1, Lcom/facebook/react/modules/debug/DevMenuModule;

    .line 94
    .line 95
    iget-object v0, p0, Lcom/facebook/react/runtime/e;->a:Lc7/f;

    .line 96
    .line 97
    invoke-direct {p1, p2, v0}, Lcom/facebook/react/modules/debug/DevMenuModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lc7/f;)V

    .line 98
    .line 99
    .line 100
    return-object p1

    .line 101
    :sswitch_5
    const-string v0, "DeviceInfo"

    .line 102
    .line 103
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-nez p1, :cond_4

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_4
    new-instance p1, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;

    .line 111
    .line 112
    invoke-direct {p1, p2}, Lcom/facebook/react/modules/deviceinfo/DeviceInfoModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 113
    .line 114
    .line 115
    return-object p1

    .line 116
    :sswitch_6
    const-string v0, "DevSettings"

    .line 117
    .line 118
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-nez p1, :cond_5

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_5
    new-instance p1, Lcom/facebook/react/modules/debug/DevSettingsModule;

    .line 126
    .line 127
    iget-object v0, p0, Lcom/facebook/react/runtime/e;->a:Lc7/f;

    .line 128
    .line 129
    invoke-direct {p1, p2, v0}, Lcom/facebook/react/modules/debug/DevSettingsModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lc7/f;)V

    .line 130
    .line 131
    .line 132
    return-object p1

    .line 133
    :sswitch_7
    const-string v0, "LogBox"

    .line 134
    .line 135
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-nez p1, :cond_7

    .line 140
    .line 141
    :cond_6
    :goto_0
    const/4 p1, 0x0

    .line 142
    return-object p1

    .line 143
    :cond_7
    new-instance p1, Lcom/facebook/react/devsupport/LogBoxModule;

    .line 144
    .line 145
    iget-object v0, p0, Lcom/facebook/react/runtime/e;->a:Lc7/f;

    .line 146
    .line 147
    invoke-direct {p1, p2, v0}, Lcom/facebook/react/devsupport/LogBoxModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lc7/f;)V

    .line 148
    .line 149
    .line 150
    return-object p1

    .line 151
    :sswitch_data_0
    .sparse-switch
        -0x7803a7f9 -> :sswitch_7
        -0x615e98c8 -> :sswitch_6
        -0x5aa347bc -> :sswitch_5
        -0x3fdb6d0c -> :sswitch_4
        -0x3dd2aeb7 -> :sswitch_3
        -0x2f1fa604 -> :sswitch_2
        0x1e8b20e9 -> :sswitch_1
        0x348ae0c8 -> :sswitch_0
    .end sparse-switch
.end method

.method public getReactModuleInfoProvider()Ll7/a;
    .locals 6

    .line 1
    const-string v0, "$$ReactModuleInfoProvider"

    .line 2
    .line 3
    const-class v1, Lcom/facebook/react/runtime/e;

    .line 4
    .line 5
    invoke-static {}, LU6/a;->a()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/facebook/react/runtime/e;->b()Ll7/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    new-instance v3, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v2}, LU6/a;->b(Ljava/lang/String;)Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const/4 v3, 0x0

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    goto :goto_0

    .line 47
    :catch_0
    move-exception v2

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move-object v2, v3

    .line 50
    :goto_0
    instance-of v4, v2, Ll7/a;

    .line 51
    .line 52
    if-eqz v4, :cond_2

    .line 53
    .line 54
    move-object v3, v2

    .line 55
    check-cast v3, Ll7/a;

    .line 56
    .line 57
    :cond_2
    if-nez v3, :cond_3

    .line 58
    .line 59
    invoke-direct {p0}, Lcom/facebook/react/runtime/e;->b()Ll7/a;

    .line 60
    .line 61
    .line 62
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    return-object v0

    .line 64
    :cond_3
    return-object v3

    .line 65
    :goto_1
    instance-of v3, v2, Ljava/lang/ClassNotFoundException;

    .line 66
    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    invoke-direct {p0}, Lcom/facebook/react/runtime/e;->b()Ll7/a;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    return-object v0

    .line 74
    :cond_4
    instance-of v3, v2, Ljava/lang/InstantiationException;

    .line 75
    .line 76
    if-nez v3, :cond_6

    .line 77
    .line 78
    instance-of v3, v2, Ljava/lang/IllegalAccessException;

    .line 79
    .line 80
    if-eqz v3, :cond_5

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    throw v2

    .line 84
    :cond_6
    :goto_2
    new-instance v3, Ljava/lang/RuntimeException;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    new-instance v4, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    .line 95
    const-string v5, "No ReactModuleInfoProvider for "

    .line 96
    .line 97
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-direct {v3, v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    throw v3
.end method
