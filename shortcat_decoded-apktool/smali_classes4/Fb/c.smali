.class public LFb/c;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "LFb/c;",
        "Lgc/c;",
        "<init>",
        "()V",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
        "Landroid/content/Context;",
        "y",
        "()Landroid/content/Context;",
        "context",
        "expo-font_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lgc/c;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic x(LFb/c;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-direct {p0}, LFb/c;->y()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final y()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgc/c;->i()LUb/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LUb/d;->B()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lcc/i;

    .line 13
    .line 14
    invoke-direct {v0}, Lcc/i;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0
.end method


# virtual methods
.method public n()Lgc/e;
    .locals 12

    .line 1
    const-class v0, Lexpo/modules/font/RenderToImageOptions;

    .line 2
    .line 3
    const-class v1, Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v3, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v2, ".ModuleDefinition"

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v4, "["

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v4, "ExpoModulesCore"

    .line 37
    .line 38
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v4, "] "

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v2}, LX3/a;->c(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :try_start_0
    new-instance v2, Lgc/d;

    .line 57
    .line 58
    invoke-direct {v2, p0}, Lgc/d;-><init>(Lgc/c;)V

    .line 59
    .line 60
    .line 61
    const-string v3, "ExpoFontUtils"

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Lgc/a;->s(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v3, "renderToImageAsync"

    .line 67
    .line 68
    new-instance v4, Ldc/f;

    .line 69
    .line 70
    invoke-virtual {v2}, Lhc/f;->m()Lpc/X;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    sget-object v6, Lpc/d;->a:Lpc/d;

    .line 75
    .line 76
    new-instance v7, Lkotlin/Pair;

    .line 77
    .line 78
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-direct {v7, v8, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6}, Lpc/d;->a()Ljava/util/Map;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    check-cast v7, Lpc/b;

    .line 96
    .line 97
    const/4 v8, 0x0

    .line 98
    if-nez v7, :cond_0

    .line 99
    .line 100
    sget-object v7, LFb/c$a;->a:LFb/c$a;

    .line 101
    .line 102
    new-instance v10, Lpc/b;

    .line 103
    .line 104
    new-instance v11, Lpc/M;

    .line 105
    .line 106
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-direct {v11, v1, v8, v7}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 111
    .line 112
    .line 113
    invoke-direct {v10, v11, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 114
    .line 115
    .line 116
    move-object v7, v10

    .line 117
    goto :goto_0

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    goto :goto_1

    .line 120
    :cond_0
    :goto_0
    new-instance v1, Lkotlin/Pair;

    .line 121
    .line 122
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    invoke-direct {v1, v10, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v6}, Lpc/d;->a()Ljava/util/Map;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-interface {v6, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    check-cast v1, Lpc/b;

    .line 138
    .line 139
    if-nez v1, :cond_1

    .line 140
    .line 141
    sget-object v1, LFb/c$b;->a:LFb/c$b;

    .line 142
    .line 143
    new-instance v6, Lpc/b;

    .line 144
    .line 145
    new-instance v9, Lpc/M;

    .line 146
    .line 147
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-direct {v9, v0, v8, v1}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 152
    .line 153
    .line 154
    invoke-direct {v6, v9, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 155
    .line 156
    .line 157
    move-object v1, v6

    .line 158
    :cond_1
    filled-new-array {v7, v1}, [Lpc/b;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    new-instance v1, LFb/c$c;

    .line 163
    .line 164
    invoke-direct {v1, p0}, LFb/c$c;-><init>(LFb/c;)V

    .line 165
    .line 166
    .line 167
    invoke-direct {v4, v3, v0, v1}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2}, Lhc/f;->k()Ljava/util/Map;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2}, Lgc/a;->u()Lgc/e;

    .line 178
    .line 179
    .line 180
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    invoke-static {}, LX3/a;->f()V

    .line 182
    .line 183
    .line 184
    return-object v0

    .line 185
    :goto_1
    invoke-static {}, LX3/a;->f()V

    .line 186
    .line 187
    .line 188
    throw v0
.end method
