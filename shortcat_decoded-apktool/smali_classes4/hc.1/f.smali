.class public abstract Lhc/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lpc/X;

.field private b:Lie/a;

.field private c:Lbc/f;

.field private d:Ljava/util/Map;

.field private e:Ljava/util/Map;

.field private f:Ljava/util/Map;

.field private g:Ljava/util/Map;

.field private h:Ljava/util/Map;

.field private i:Ljava/util/Map;

.field private final j:Ljava/util/List;


# direct methods
.method public constructor <init>(Lpc/X;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhc/f;->a:Lpc/X;

    .line 5
    .line 6
    new-instance p1, Lhc/e;

    .line 7
    .line 8
    invoke-direct {p1}, Lhc/e;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lhc/f;->b:Lie/a;

    .line 12
    .line 13
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lhc/f;->d:Ljava/util/Map;

    .line 19
    .line 20
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lhc/f;->e:Ljava/util/Map;

    .line 26
    .line 27
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lhc/f;->f:Ljava/util/Map;

    .line 33
    .line 34
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lhc/f;->g:Ljava/util/Map;

    .line 40
    .line 41
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 42
    .line 43
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lhc/f;->h:Ljava/util/Map;

    .line 47
    .line 48
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lhc/f;->i:Ljava/util/Map;

    .line 54
    .line 55
    new-instance p1, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lhc/f;->j:Ljava/util/List;

    .line 61
    .line 62
    return-void
.end method

.method public static synthetic a()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-static {}, Lhc/f;->q()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static final synthetic i(Lhc/f;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lhc/f;->j:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method private static final q()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Ldc/b;
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldc/b;

    .line 7
    .line 8
    iget-object v1, p0, Lhc/f;->a:Lpc/X;

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, Ldc/b;-><init>(Ljava/lang/String;Lpc/X;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lhc/f;->g:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final c(Lie/a;)V
    .locals 1

    .line 1
    const-string v0, "legacyConstantsProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lhc/f;->b:Lie/a;

    .line 7
    .line 8
    return-void
.end method

.method public final varargs d([Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "events"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lbc/f;

    .line 7
    .line 8
    invoke-static {p1}, LUd/n;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v1, 0x0

    .line 13
    new-array v1, v1, [Ljava/lang/String;

    .line 14
    .line 15
    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, [Ljava/lang/String;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lbc/f;-><init>([Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lhc/f;->c:Lbc/f;

    .line 25
    .line 26
    return-void
.end method

.method public final e(Ljava/lang/Enum;Lie/a;)V
    .locals 1

    .line 1
    const-string v0, "enum"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "body"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, LUb/h;->a(Ljava/lang/Enum;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1, p2}, Lhc/f;->f(Ljava/lang/String;Lie/a;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final f(Ljava/lang/String;Lie/a;)V
    .locals 3

    .line 1
    const-string v0, "eventName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "body"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lhc/d;

    .line 12
    .line 13
    sget-object v1, Lhc/d$c;->b:Lhc/d$c;

    .line 14
    .line 15
    new-instance v2, Lhc/d$b;

    .line 16
    .line 17
    invoke-direct {v2, p1}, Lhc/d$b;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1, v2, p2}, Lhc/d;-><init>(Lhc/d$c;Lhc/d$a;Lie/a;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lhc/f;->j:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final g(Ljava/lang/Enum;Lie/a;)V
    .locals 1

    .line 1
    const-string v0, "enum"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "body"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, LUb/h;->a(Ljava/lang/Enum;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1, p2}, Lhc/f;->h(Ljava/lang/String;Lie/a;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final h(Ljava/lang/String;Lie/a;)V
    .locals 3

    .line 1
    const-string v0, "eventName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "body"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lhc/d;

    .line 12
    .line 13
    sget-object v1, Lhc/d$c;->c:Lhc/d$c;

    .line 14
    .line 15
    new-instance v2, Lhc/d$b;

    .line 16
    .line 17
    invoke-direct {v2, p1}, Lhc/d$b;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1, v2, p2}, Lhc/d;-><init>(Lhc/d$c;Lhc/d$a;Lie/a;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lhc/f;->j:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final j()Lhc/h;
    .locals 10

    .line 1
    invoke-static {}, Lhc/d$c;->b()Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_8

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lhc/d$c;

    .line 20
    .line 21
    iget-object v2, p0, Lhc/f;->f:Ljava/util/Map;

    .line 22
    .line 23
    invoke-virtual {v1}, Lhc/d$c;->c()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1}, Lhc/d$c;->c()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-class v3, LUb/u;

    .line 38
    .line 39
    const-class v4, Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const/4 v5, 0x0

    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    new-instance v3, Ldc/f;

    .line 49
    .line 50
    new-array v4, v5, [Lpc/b;

    .line 51
    .line 52
    new-instance v5, Lhc/f$a;

    .line 53
    .line 54
    invoke-direct {v5, p0, v1}, Lhc/f$a;-><init>(Lhc/f;Lhc/d$c;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {v3, v2, v4, v5}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_2

    .line 61
    .line 62
    :cond_1
    invoke-virtual {p0}, Lhc/f;->m()Lpc/X;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    sget-object v6, Lpc/d;->a:Lpc/d;

    .line 67
    .line 68
    new-instance v7, Lkotlin/Pair;

    .line 69
    .line 70
    invoke-static {v4}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-direct {v7, v8, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v6}, Lpc/d;->a()Ljava/util/Map;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    check-cast v6, Lpc/b;

    .line 88
    .line 89
    if-nez v6, :cond_2

    .line 90
    .line 91
    sget-object v6, Lhc/f$b;->a:Lhc/f$b;

    .line 92
    .line 93
    new-instance v7, Lpc/b;

    .line 94
    .line 95
    new-instance v8, Lpc/M;

    .line 96
    .line 97
    invoke-static {v4}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    invoke-direct {v8, v9, v5, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 102
    .line 103
    .line 104
    invoke-direct {v7, v8, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 105
    .line 106
    .line 107
    move-object v6, v7

    .line 108
    :cond_2
    filled-new-array {v6}, [Lpc/b;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    new-instance v5, Lhc/f$c;

    .line 113
    .line 114
    invoke-direct {v5, p0, v1}, Lhc/f$c;-><init>(Lhc/f;Lhc/d$c;)V

    .line 115
    .line 116
    .line 117
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 118
    .line 119
    const-class v6, LTd/L;

    .line 120
    .line 121
    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_3

    .line 126
    .line 127
    new-instance v1, Ldc/l;

    .line 128
    .line 129
    invoke-direct {v1, v2, v3, v5}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 130
    .line 131
    .line 132
    :goto_1
    move-object v3, v1

    .line 133
    goto :goto_2

    .line 134
    :cond_3
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 135
    .line 136
    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-eqz v1, :cond_4

    .line 141
    .line 142
    new-instance v1, Ldc/h;

    .line 143
    .line 144
    invoke-direct {v1, v2, v3, v5}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_4
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 149
    .line 150
    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_5

    .line 155
    .line 156
    new-instance v1, Ldc/i;

    .line 157
    .line 158
    invoke-direct {v1, v2, v3, v5}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_5
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 163
    .line 164
    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-eqz v1, :cond_6

    .line 169
    .line 170
    new-instance v1, Ldc/j;

    .line 171
    .line 172
    invoke-direct {v1, v2, v3, v5}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_6
    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-eqz v1, :cond_7

    .line 181
    .line 182
    new-instance v1, Ldc/n;

    .line 183
    .line 184
    invoke-direct {v1, v2, v3, v5}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 185
    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_7
    new-instance v1, Ldc/s;

    .line 189
    .line 190
    invoke-direct {v1, v2, v3, v5}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :goto_2
    invoke-virtual {p0}, Lhc/f;->k()Ljava/util/Map;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :cond_8
    iget-object v0, p0, Lhc/f;->f:Ljava/util/Map;

    .line 204
    .line 205
    iget-object v1, p0, Lhc/f;->g:Ljava/util/Map;

    .line 206
    .line 207
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 208
    .line 209
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    invoke-static {v3}, LUd/S;->e(I)I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    invoke-direct {v2, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 218
    .line 219
    .line 220
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    check-cast v1, Ljava/lang/Iterable;

    .line 225
    .line 226
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    if-eqz v3, :cond_9

    .line 235
    .line 236
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    check-cast v3, Ljava/util/Map$Entry;

    .line 241
    .line 242
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    check-cast v3, Ldc/b;

    .line 251
    .line 252
    invoke-virtual {v3}, Ldc/b;->a()Ldc/g;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_9
    invoke-static {v0, v2}, LUd/S;->p(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-static {v0}, LUd/S;->B(Ljava/util/Map;)Ljava/util/Map;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    iget-object v2, p0, Lhc/f;->b:Lie/a;

    .line 269
    .line 270
    iget-object v0, p0, Lhc/f;->d:Ljava/util/Map;

    .line 271
    .line 272
    iget-object v1, p0, Lhc/f;->e:Ljava/util/Map;

    .line 273
    .line 274
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 275
    .line 276
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 277
    .line 278
    .line 279
    move-result v5

    .line 280
    invoke-static {v5}, LUd/S;->e(I)I

    .line 281
    .line 282
    .line 283
    move-result v5

    .line 284
    invoke-direct {v3, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 285
    .line 286
    .line 287
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    check-cast v1, Ljava/lang/Iterable;

    .line 292
    .line 293
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    if-nez v5, :cond_c

    .line 302
    .line 303
    invoke-static {v0, v3}, LUd/S;->p(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    iget-object v5, p0, Lhc/f;->c:Lbc/f;

    .line 308
    .line 309
    iget-object v0, p0, Lhc/f;->h:Ljava/util/Map;

    .line 310
    .line 311
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 312
    .line 313
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    invoke-static {v1}, LUd/S;->e(I)I

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    invoke-direct {v6, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 322
    .line 323
    .line 324
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    check-cast v0, Ljava/lang/Iterable;

    .line 329
    .line 330
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    if-eqz v1, :cond_a

    .line 339
    .line 340
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    check-cast v1, Ljava/util/Map$Entry;

    .line 345
    .line 346
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v7

    .line 350
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    check-cast v1, Lhc/l;

    .line 355
    .line 356
    invoke-virtual {v1}, Lhc/l;->a()Lhc/k;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    invoke-interface {v6, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    goto :goto_4

    .line 364
    :cond_a
    iget-object v0, p0, Lhc/f;->i:Ljava/util/Map;

    .line 365
    .line 366
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 367
    .line 368
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    invoke-static {v1}, LUd/S;->e(I)I

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    invoke-direct {v7, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 377
    .line 378
    .line 379
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    check-cast v0, Ljava/lang/Iterable;

    .line 384
    .line 385
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 390
    .line 391
    .line 392
    move-result v1

    .line 393
    if-eqz v1, :cond_b

    .line 394
    .line 395
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    check-cast v1, Ljava/util/Map$Entry;

    .line 400
    .line 401
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v8

    .line 405
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    check-cast v1, Lhc/c;

    .line 410
    .line 411
    invoke-virtual {v1}, Lhc/c;->a()Lhc/b;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    invoke-interface {v7, v8, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    goto :goto_5

    .line 419
    :cond_b
    new-instance v1, Lhc/h;

    .line 420
    .line 421
    invoke-direct/range {v1 .. v7}, Lhc/h;-><init>(Lie/a;Ljava/util/Map;Ljava/util/Map;Lbc/f;Ljava/util/Map;Ljava/util/Map;)V

    .line 422
    .line 423
    .line 424
    return-object v1

    .line 425
    :cond_c
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    check-cast v0, Ljava/util/Map$Entry;

    .line 430
    .line 431
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-static {v0}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    const/4 v0, 0x0

    .line 442
    throw v0
.end method

.method public final k()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lhc/f;->f:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lhc/f;->i:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Lpc/X;
    .locals 1

    .line 1
    iget-object v0, p0, Lhc/f;->a:Lpc/X;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Lbc/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lhc/f;->c:Lbc/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lhc/f;->h:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lhc/f;->d:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r(Lbc/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhc/f;->c:Lbc/f;

    .line 2
    .line 3
    return-void
.end method
