.class public final Lib/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lib/h$a;
    }
.end annotation


# static fields
.field public static final a:Lib/h;

.field private static b:Lcom/facebook/react/ReactHost;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lib/h;

    .line 2
    .line 3
    invoke-direct {v0}, Lib/h;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lib/h;->a:Lib/h;

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

.method public static final a(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/runtime/JSRuntimeFactory;ZLcom/facebook/react/runtime/BindingsInstaller;)Lcom/facebook/react/ReactHost;
    .locals 12

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "packageList"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "jsMainModulePath"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "jsBundleAssetPath"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lib/h;->b:Lcom/facebook/react/ReactHost;

    .line 22
    .line 23
    if-nez v0, :cond_3

    .line 24
    .line 25
    sget-object v0, Lib/c;->b:Lib/c$a;

    .line 26
    .line 27
    invoke-virtual {v0}, Lib/c$a;->a()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v9, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lsb/g;

    .line 51
    .line 52
    invoke-interface {v1, p0}, Lsb/g;->a(Landroid/content/Context;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const-string v2, "createReactNativeHostHandlers(...)"

    .line 57
    .line 58
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v9, v1}, LUd/u;->D(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    new-instance v0, Lib/h$a;

    .line 66
    .line 67
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 68
    .line 69
    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const/16 v10, 0x80

    .line 73
    .line 74
    const/4 v11, 0x0

    .line 75
    const/4 v8, 0x0

    .line 76
    move-object v2, p1

    .line 77
    move-object v3, p2

    .line 78
    move-object v4, p3

    .line 79
    move-object/from16 v5, p4

    .line 80
    .line 81
    move/from16 v6, p6

    .line 82
    .line 83
    move-object/from16 v7, p7

    .line 84
    .line 85
    invoke-direct/range {v0 .. v11}, Lib/h$a;-><init>(Ljava/lang/ref/WeakReference;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/facebook/react/runtime/BindingsInstaller;Lcom/facebook/react/T$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 86
    .line 87
    .line 88
    move v5, v6

    .line 89
    new-instance v3, Lcom/facebook/react/fabric/ComponentFactory;

    .line 90
    .line 91
    invoke-direct {v3}, Lcom/facebook/react/fabric/ComponentFactory;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-static {v3}, Lcom/facebook/react/defaults/DefaultComponentsRegistry;->register(Lcom/facebook/react/fabric/ComponentFactory;)V

    .line 95
    .line 96
    .line 97
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_1

    .line 106
    .line 107
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    check-cast v1, Lsb/j;

    .line 112
    .line 113
    invoke-interface {v1, v5}, Lsb/j;->h(Z)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_1
    new-instance p1, Lcom/facebook/react/runtime/ReactHostImpl;

    .line 118
    .line 119
    const/4 v4, 0x1

    .line 120
    move-object v1, p0

    .line 121
    move-object v2, v0

    .line 122
    move-object v0, p1

    .line 123
    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/runtime/ReactHostImpl;-><init>(Landroid/content/Context;Lcom/facebook/react/runtime/f;Lcom/facebook/react/fabric/ComponentFactory;ZZ)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_2

    .line 135
    .line 136
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    check-cast v2, Lsb/j;

    .line 141
    .line 142
    invoke-interface {v2, p0, v0}, Lsb/j;->c(Landroid/content/Context;Lcom/facebook/react/ReactHost;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->getDevSupportManager()Lc7/f;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-interface {v2, v3}, Lsb/j;->a(Lc7/f;)V

    .line 150
    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_2
    new-instance p0, Lib/h$b;

    .line 154
    .line 155
    invoke-direct {p0, v9, v5}, Lib/h$b;-><init>(Ljava/util/List;Z)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, p0}, Lcom/facebook/react/runtime/ReactHostImpl;->addReactInstanceEventListener(Lcom/facebook/react/z;)V

    .line 159
    .line 160
    .line 161
    sput-object v0, Lib/h;->b:Lcom/facebook/react/ReactHost;

    .line 162
    .line 163
    :cond_3
    sget-object p0, Lib/h;->b:Lcom/facebook/react/ReactHost;

    .line 164
    .line 165
    const-string p1, "null cannot be cast to non-null type com.facebook.react.ReactHost"

    .line 166
    .line 167
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/runtime/JSRuntimeFactory;ZLcom/facebook/react/runtime/BindingsInstaller;ILjava/lang/Object;)Lcom/facebook/react/ReactHost;
    .locals 7

    .line 1
    and-int/lit8 v1, p8, 0x4

    .line 2
    .line 3
    if-eqz v1, :cond_0

    .line 4
    .line 5
    const-string v1, ".expo/.virtual-metro-entry"

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object v1, p2

    .line 9
    :goto_0
    and-int/lit8 v2, p8, 0x8

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    const-string v2, "index.android.bundle"

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move-object v2, p3

    .line 17
    :goto_1
    and-int/lit8 v3, p8, 0x10

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz v3, :cond_2

    .line 21
    .line 22
    move-object v3, v4

    .line 23
    goto :goto_2

    .line 24
    :cond_2
    move-object v3, p4

    .line 25
    :goto_2
    and-int/lit8 v5, p8, 0x20

    .line 26
    .line 27
    if-eqz v5, :cond_3

    .line 28
    .line 29
    move-object v5, v4

    .line 30
    goto :goto_3

    .line 31
    :cond_3
    move-object v5, p5

    .line 32
    :goto_3
    and-int/lit8 v6, p8, 0x40

    .line 33
    .line 34
    if-eqz v6, :cond_4

    .line 35
    .line 36
    sget-boolean v6, LY6/a;->b:Z

    .line 37
    .line 38
    goto :goto_4

    .line 39
    :cond_4
    move v6, p6

    .line 40
    :goto_4
    and-int/lit16 v0, p8, 0x80

    .line 41
    .line 42
    if-eqz v0, :cond_5

    .line 43
    .line 44
    move-object/from16 p9, v4

    .line 45
    .line 46
    :goto_5
    move-object p2, p0

    .line 47
    move-object p3, p1

    .line 48
    move-object p4, v1

    .line 49
    move-object p5, v2

    .line 50
    move-object p6, v3

    .line 51
    move-object p7, v5

    .line 52
    move p8, v6

    .line 53
    goto :goto_6

    .line 54
    :cond_5
    move-object/from16 p9, p7

    .line 55
    .line 56
    goto :goto_5

    .line 57
    :goto_6
    invoke-static/range {p2 .. p9}, Lib/h;->a(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/runtime/JSRuntimeFactory;ZLcom/facebook/react/runtime/BindingsInstaller;)Lcom/facebook/react/ReactHost;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0
.end method
