.class public Lvc/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lvc/b;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Landroid/view/View;

.field private final c:Lkotlin/jvm/functions/Function1;

.field private d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "view"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lvc/a;->a:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p2, p0, Lvc/a;->b:Landroid/view/View;

    .line 17
    .line 18
    iput-object p3, p0, Lvc/a;->c:Lkotlin/jvm/functions/Function1;

    .line 19
    .line 20
    return-void
.end method

.method private final a(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;
    .locals 6

    .line 1
    sget-object v0, Lpc/K;->a:Lpc/K;

    .line 2
    .line 3
    const/4 v4, 0x6

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    move-object v1, p1

    .line 8
    invoke-static/range {v0 .. v5}, Lpc/K;->b(Lpc/K;Ljava/lang/Object;Lpc/K$a;ZILjava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    instance-of v0, p1, LTd/L;

    .line 13
    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    instance-of v0, p1, Lcom/facebook/react/bridge/WritableMap;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    check-cast p1, Lcom/facebook/react/bridge/WritableMap;

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_1
    sget-object v0, Lpc/K$b;->a:Lpc/K$b;

    .line 27
    .line 28
    invoke-virtual {v0}, Lpc/K$b;->b()Lcom/facebook/react/bridge/WritableMap;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "payload"

    .line 33
    .line 34
    invoke-static {v0, v1, p1}, Lpc/J;->b(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 39
    return-object p1
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lvc/a;->b:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    .line 13
    .line 14
    invoke-static {v0}, LUb/w;->a(Lcom/facebook/react/bridge/ReactContext;)Lexpo/modules/adapters/react/NativeModulesProxy;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto/16 :goto_3

    .line 21
    .line 22
    :cond_0
    invoke-virtual {v0}, Lexpo/modules/adapters/react/NativeModulesProxy;->getKotlinInteropModuleRegistry()LUb/p;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, LUb/p;->f()LUb/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-boolean v1, p0, Lvc/a;->d:Z

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    if-nez v1, :cond_6

    .line 34
    .line 35
    invoke-virtual {v0}, LUb/d;->C()LUb/s;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v3, p0, Lvc/a;->b:Landroid/view/View;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v1, v3}, LUb/s;->p(Ljava/lang/Class;)LUb/r;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const/4 v3, 0x2

    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object v0, p0, Lvc/a;->b:Landroid/view/View;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-instance v1, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v4, "\u26a0\ufe0f Cannot get module holder for "

    .line 68
    .line 69
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {p1, v0, v2, v3, v2}, Lub/d;->i(Lub/d;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_1
    invoke-virtual {v0}, LUb/d;->C()LUb/s;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    iget-object v5, p0, Lvc/a;->b:Landroid/view/View;

    .line 88
    .line 89
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-virtual {v4, v1, v5}, LUb/s;->u(LUb/r;Ljava/lang/Class;)Lexpo/modules/kotlin/views/r;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    if-eqz v4, :cond_2

    .line 98
    .line 99
    invoke-virtual {v4}, Lexpo/modules/kotlin/views/r;->c()Lexpo/modules/kotlin/views/b;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    goto :goto_0

    .line 104
    :cond_2
    move-object v4, v2

    .line 105
    :goto_0
    if-nez v4, :cond_3

    .line 106
    .line 107
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {v1}, LUb/r;->g()Lgc/c;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    new-instance v1, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 122
    .line 123
    .line 124
    const-string v4, "\u26a0\ufe0f Cannot get callbacks for "

    .line 125
    .line 126
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {p1, v0, v2, v3, v2}, Lub/d;->i(Lub/d;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_3
    invoke-virtual {v4}, Lexpo/modules/kotlin/views/b;->a()[Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    array-length v5, v4

    .line 145
    const/4 v6, 0x0

    .line 146
    :goto_1
    if-ge v6, v5, :cond_5

    .line 147
    .line 148
    aget-object v7, v4, v6

    .line 149
    .line 150
    iget-object v8, p0, Lvc/a;->a:Ljava/lang/String;

    .line 151
    .line 152
    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    if-eqz v7, :cond_4

    .line 157
    .line 158
    const/4 v1, 0x1

    .line 159
    iput-boolean v1, p0, Lvc/a;->d:Z

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_5
    invoke-static {}, LUb/f;->a()Lub/d;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    iget-object v0, p0, Lvc/a;->a:Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {v1}, LUb/r;->g()Lgc/c;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    new-instance v4, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 182
    .line 183
    .line 184
    const-string v5, "\u26a0\ufe0f Event "

    .line 185
    .line 186
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    const-string v0, " wasn\'t exported from "

    .line 193
    .line 194
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {p1, v0, v2, v3, v2}, Lub/d;->i(Lub/d;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :cond_6
    :goto_2
    invoke-virtual {v0}, LUb/d;->q()Lbc/b;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    if-eqz v0, :cond_8

    .line 213
    .line 214
    iget-object v1, p0, Lvc/a;->b:Landroid/view/View;

    .line 215
    .line 216
    iget-object v3, p0, Lvc/a;->a:Ljava/lang/String;

    .line 217
    .line 218
    invoke-direct {p0, p1}, Lvc/a;->a(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    iget-object v5, p0, Lvc/a;->c:Lkotlin/jvm/functions/Function1;

    .line 223
    .line 224
    if-eqz v5, :cond_7

    .line 225
    .line 226
    invoke-interface {v5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    move-object v2, p1

    .line 231
    check-cast v2, Ljava/lang/Short;

    .line 232
    .line 233
    :cond_7
    invoke-interface {v0, v1, v3, v4, v2}, Lbc/b;->e(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;Ljava/lang/Short;)V

    .line 234
    .line 235
    .line 236
    :cond_8
    :goto_3
    return-void
.end method
