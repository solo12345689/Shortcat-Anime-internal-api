.class public abstract Lcom/facebook/react/T;
.super Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/T$a;,
        Lcom/facebook/react/T$b;
    }
.end annotation


# instance fields
.field private final moduleProviders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/react/T$b;",
            ">;"
        }
    .end annotation
.end field

.field private final packageModuleInfos:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/facebook/react/T$b;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/module/model/ReactModuleInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private final shouldEnableLegacyModuleInterop:Z


# direct methods
.method protected constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;Lcom/facebook/jni/HybridData;)V
    .locals 1

    .line 1
    const-string v0, "reactApplicationContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "packages"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "hybridData"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p3}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;-><init>(Lcom/facebook/jni/HybridData;)V

    .line 17
    .line 18
    .line 19
    new-instance p3, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p3, p0, Lcom/facebook/react/T;->moduleProviders:Ljava/util/List;

    .line 25
    .line 26
    new-instance p3, Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    invoke-direct {p3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p3, p0, Lcom/facebook/react/T;->packageModuleInfos:Ljava/util/Map;

    .line 32
    .line 33
    invoke-static {}, Lh7/i;->a()Z

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    if-eqz p3, :cond_0

    .line 38
    .line 39
    invoke-static {}, Lh7/i;->d()Z

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    if-eqz p3, :cond_0

    .line 44
    .line 45
    const/4 p3, 0x1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 p3, 0x0

    .line 48
    :goto_0
    iput-boolean p3, p0, Lcom/facebook/react/T;->shouldEnableLegacyModuleInterop:Z

    .line 49
    .line 50
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/T;->c(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static synthetic a(Ljava/util/Map;Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/T;->e(Ljava/util/Map;Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Lcom/facebook/react/O;Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/facebook/react/T;->d(Lcom/facebook/react/O;Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final c(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_6

    .line 14
    .line 15
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lcom/facebook/react/O;

    .line 20
    .line 21
    instance-of v4, v3, Lcom/facebook/react/a;

    .line 22
    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    new-instance v4, Lcom/facebook/react/Q;

    .line 26
    .line 27
    invoke-direct {v4, v3, v1}, Lcom/facebook/react/Q;-><init>(Lcom/facebook/react/O;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 28
    .line 29
    .line 30
    iget-object v5, v0, Lcom/facebook/react/T;->moduleProviders:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    iget-object v5, v0, Lcom/facebook/react/T;->packageModuleInfos:Ljava/util/Map;

    .line 36
    .line 37
    check-cast v3, Lcom/facebook/react/a;

    .line 38
    .line 39
    invoke-virtual {v3}, Lcom/facebook/react/a;->getReactModuleInfoProvider()Ll7/a;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-interface {v3}, Ll7/a;->a()Ljava/util/Map;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-interface {v5, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-direct {v0}, Lcom/facebook/react/T;->f()Z

    .line 52
    .line 53
    .line 54
    invoke-direct {v0}, Lcom/facebook/react/T;->f()Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_0

    .line 59
    .line 60
    invoke-interface {v3, v1}, Lcom/facebook/react/O;->createNativeModules(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 65
    .line 66
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 67
    .line 68
    .line 69
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 70
    .line 71
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_5

    .line 83
    .line 84
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    check-cast v6, Lcom/facebook/react/bridge/NativeModule;

    .line 89
    .line 90
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    const-class v8, Lk7/a;

    .line 95
    .line 96
    invoke-virtual {v7, v8}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    check-cast v8, Lk7/a;

    .line 101
    .line 102
    const-string v9, "getName(...)"

    .line 103
    .line 104
    if-eqz v8, :cond_3

    .line 105
    .line 106
    invoke-interface {v8}, Lk7/a;->name()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    if-nez v10, :cond_2

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_2
    :goto_2
    move-object v12, v10

    .line 114
    goto :goto_4

    .line 115
    :cond_3
    :goto_3
    invoke-interface {v6}, Lcom/facebook/react/bridge/NativeModule;->getName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    invoke-static {v10, v9}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :goto_4
    if-eqz v8, :cond_4

    .line 124
    .line 125
    new-instance v11, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 126
    .line 127
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v13

    .line 131
    invoke-static {v13, v9}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-interface {v8}, Lk7/a;->canOverrideExistingModule()Z

    .line 135
    .line 136
    .line 137
    move-result v14

    .line 138
    invoke-interface {v8}, Lk7/a;->isCxxModule()Z

    .line 139
    .line 140
    .line 141
    move-result v16

    .line 142
    sget-object v8, Lcom/facebook/react/module/model/ReactModuleInfo;->g:Lcom/facebook/react/module/model/ReactModuleInfo$a;

    .line 143
    .line 144
    invoke-virtual {v8, v7}, Lcom/facebook/react/module/model/ReactModuleInfo$a;->a(Ljava/lang/Class;)Z

    .line 145
    .line 146
    .line 147
    move-result v17

    .line 148
    const/4 v15, 0x1

    .line 149
    invoke-direct/range {v11 .. v17}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZ)V

    .line 150
    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_4
    new-instance v11, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 154
    .line 155
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v13

    .line 159
    invoke-static {v13, v9}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-interface {v6}, Lcom/facebook/react/bridge/NativeModule;->canOverrideExistingModule()Z

    .line 163
    .line 164
    .line 165
    move-result v14

    .line 166
    const-class v8, Lcom/facebook/react/bridge/CxxModuleWrapper;

    .line 167
    .line 168
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 169
    .line 170
    .line 171
    move-result v16

    .line 172
    sget-object v8, Lcom/facebook/react/module/model/ReactModuleInfo;->g:Lcom/facebook/react/module/model/ReactModuleInfo$a;

    .line 173
    .line 174
    invoke-virtual {v8, v7}, Lcom/facebook/react/module/model/ReactModuleInfo$a;->a(Ljava/lang/Class;)Z

    .line 175
    .line 176
    .line 177
    move-result v17

    .line 178
    const/4 v15, 0x1

    .line 179
    invoke-direct/range {v11 .. v17}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZ)V

    .line 180
    .line 181
    .line 182
    :goto_5
    invoke-interface {v5, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    invoke-interface {v4, v12, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_5
    new-instance v3, Lcom/facebook/react/S;

    .line 190
    .line 191
    invoke-direct {v3, v4}, Lcom/facebook/react/S;-><init>(Ljava/util/Map;)V

    .line 192
    .line 193
    .line 194
    iget-object v4, v0, Lcom/facebook/react/T;->moduleProviders:Ljava/util/List;

    .line 195
    .line 196
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    iget-object v4, v0, Lcom/facebook/react/T;->packageModuleInfos:Ljava/util/Map;

    .line 200
    .line 201
    invoke-interface {v4, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    goto/16 :goto_0

    .line 205
    .line 206
    :cond_6
    return-void
.end method

.method private static final d(Lcom/facebook/react/O;Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    const-string v0, "moduleName"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p0, Lcom/facebook/react/a;

    .line 7
    .line 8
    invoke-virtual {p0, p2, p1}, Lcom/facebook/react/a;->getModule(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method private static final e(Ljava/util/Map;Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    const-string v0, "module"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lcom/facebook/react/bridge/NativeModule;

    .line 11
    .line 12
    return-object p0
.end method

.method private final f()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/T;->unstable_shouldEnableLegacyModuleInterop()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method


# virtual methods
.method public getEagerInitModuleNames()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, LUd/u;->c()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/facebook/react/T;->moduleProviders:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_4

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lcom/facebook/react/T$b;

    .line 22
    .line 23
    iget-object v3, p0, Lcom/facebook/react/T;->packageModuleInfos:Ljava/util/Map;

    .line 24
    .line 25
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Ljava/util/Map;

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    :cond_1
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    :cond_2
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    :cond_3
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 58
    .line 59
    invoke-virtual {v3}, Lcom/facebook/react/module/model/ReactModuleInfo;->d()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    invoke-virtual {v3}, Lcom/facebook/react/module/model/ReactModuleInfo;->f()Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_3

    .line 70
    .line 71
    invoke-virtual {v3}, Lcom/facebook/react/module/model/ReactModuleInfo;->e()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    invoke-static {v0}, LUd/u;->a(Ljava/util/List;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    return-object v0
.end method

.method public getLegacyModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 6

    .line 1
    const-string v0, "moduleName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/facebook/react/T;->unstable_shouldEnableLegacyModuleInterop()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/T;->moduleProviders:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    move-object v2, v1

    .line 21
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_4

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lcom/facebook/react/T$b;

    .line 32
    .line 33
    iget-object v4, p0, Lcom/facebook/react/T;->packageModuleInfos:Ljava/util/Map;

    .line 34
    .line 35
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Ljava/util/Map;

    .line 40
    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    invoke-interface {v4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move-object v4, v1

    .line 51
    :goto_1
    if-eqz v4, :cond_1

    .line 52
    .line 53
    invoke-virtual {v4}, Lcom/facebook/react/module/model/ReactModuleInfo;->d()Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-nez v5, :cond_1

    .line 58
    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    invoke-virtual {v4}, Lcom/facebook/react/module/model/ReactModuleInfo;->a()Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_1

    .line 66
    .line 67
    :cond_3
    invoke-interface {v3, p1}, Lcom/facebook/react/T$b;->getModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    if-eqz v3, :cond_1

    .line 72
    .line 73
    move-object v2, v3

    .line 74
    goto :goto_0

    .line 75
    :cond_4
    instance-of p1, v2, Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;

    .line 76
    .line 77
    if-eqz p1, :cond_5

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_5
    return-object v2
.end method

.method public getModule(Ljava/lang/String;)Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;
    .locals 7

    .line 1
    const-string v0, "moduleName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/T;->moduleProviders:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    move-object v2, v1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_3

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lcom/facebook/react/T$b;

    .line 25
    .line 26
    iget-object v4, p0, Lcom/facebook/react/T;->packageModuleInfos:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Ljava/util/Map;

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    invoke-interface {v4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move-object v4, v1

    .line 44
    :goto_1
    if-eqz v4, :cond_0

    .line 45
    .line 46
    invoke-virtual {v4}, Lcom/facebook/react/module/model/ReactModuleInfo;->d()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    const/4 v6, 0x1

    .line 51
    if-ne v5, v6, :cond_0

    .line 52
    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-virtual {v4}, Lcom/facebook/react/module/model/ReactModuleInfo;->a()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_0

    .line 60
    .line 61
    :cond_2
    invoke-interface {v3, p1}, Lcom/facebook/react/T$b;->getModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    if-eqz v3, :cond_0

    .line 66
    .line 67
    move-object v2, v3

    .line 68
    goto :goto_0

    .line 69
    :cond_3
    instance-of p1, v2, Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;

    .line 70
    .line 71
    if-nez p1, :cond_4

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_4
    const-string p1, "null cannot be cast to non-null type com.facebook.react.turbomodule.core.interfaces.TurboModule"

    .line 75
    .line 76
    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    check-cast v2, Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;

    .line 80
    .line 81
    return-object v2
.end method

.method public unstable_isLegacyModuleRegistered(Ljava/lang/String;)Z
    .locals 3

    .line 1
    const-string v0, "moduleName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/T;->moduleProviders:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/facebook/react/T$b;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/facebook/react/T;->packageModuleInfos:Ljava/util/Map;

    .line 25
    .line 26
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/util/Map;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v1, 0x0

    .line 42
    :goto_0
    if-eqz v1, :cond_0

    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/facebook/react/module/model/ReactModuleInfo;->d()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_0

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    return p1

    .line 52
    :cond_2
    const/4 p1, 0x0

    .line 53
    return p1
.end method

.method public unstable_isModuleRegistered(Ljava/lang/String;)Z
    .locals 3

    .line 1
    const-string v0, "moduleName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/T;->moduleProviders:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/facebook/react/T$b;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/facebook/react/T;->packageModuleInfos:Ljava/util/Map;

    .line 25
    .line 26
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/util/Map;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v1, 0x0

    .line 42
    :goto_0
    if-eqz v1, :cond_0

    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/facebook/react/module/model/ReactModuleInfo;->d()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    const/4 v2, 0x1

    .line 49
    if-ne v1, v2, :cond_0

    .line 50
    .line 51
    return v2

    .line 52
    :cond_2
    const/4 p1, 0x0

    .line 53
    return p1
.end method

.method public unstable_shouldEnableLegacyModuleInterop()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/T;->shouldEnableLegacyModuleInterop:Z

    .line 2
    .line 3
    return v0
.end method
