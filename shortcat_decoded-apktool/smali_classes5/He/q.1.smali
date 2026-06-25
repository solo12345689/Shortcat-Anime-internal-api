.class public final LHe/q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lbf/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LHe/q$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic c(Lye/t0;)Lqf/S;
    .locals 0

    .line 1
    invoke-static {p0}, LHe/q;->d(Lye/t0;)Lqf/S;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final d(Lye/t0;)Lqf/S;
    .locals 0

    .line 1
    invoke-interface {p0}, Lye/s0;->getType()Lqf/S;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public a(Lye/a;Lye/a;Lye/e;)Lbf/j$b;
    .locals 4

    .line 1
    const-string p3, "superDescriptor"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p3, "subDescriptor"

    .line 7
    .line 8
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    instance-of p3, p2, LJe/e;

    .line 12
    .line 13
    if-eqz p3, :cond_9

    .line 14
    .line 15
    move-object p3, p2

    .line 16
    check-cast p3, LJe/e;

    .line 17
    .line 18
    invoke-virtual {p3}, LBe/s;->getTypeParameters()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "getTypeParameters(...)"

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :cond_0
    invoke-static {p1, p2}, Lbf/o;->w(Lye/a;Lye/a;)Lbf/o$i;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v2, 0x0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-virtual {v0}, Lbf/o$i;->c()Lbf/o$i$a;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move-object v0, v2

    .line 48
    :goto_0
    if-eqz v0, :cond_2

    .line 49
    .line 50
    sget-object p1, Lbf/j$b;->c:Lbf/j$b;

    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_2
    invoke-virtual {p3}, LBe/s;->j()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-string v3, "getValueParameters(...)"

    .line 58
    .line 59
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, LUd/u;->c0(Ljava/lang/Iterable;)LCf/i;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sget-object v3, LHe/p;->a:LHe/p;

    .line 67
    .line 68
    invoke-static {v0, v3}, LCf/l;->K(LCf/i;Lkotlin/jvm/functions/Function1;)LCf/i;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p3}, LBe/s;->getReturnType()Lqf/S;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v3}, LCf/l;->O(LCf/i;Ljava/lang/Object;)LCf/i;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p3}, LBe/s;->O()Lye/c0;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    if-eqz p3, :cond_3

    .line 88
    .line 89
    invoke-interface {p3}, Lye/s0;->getType()Lqf/S;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    goto :goto_1

    .line 94
    :cond_3
    move-object p3, v2

    .line 95
    :goto_1
    invoke-static {p3}, LUd/u;->q(Ljava/lang/Object;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    invoke-static {v0, p3}, LCf/l;->N(LCf/i;Ljava/lang/Iterable;)LCf/i;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    invoke-interface {p3}, LCf/i;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    :cond_4
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_5

    .line 112
    .line 113
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, Lqf/S;

    .line 118
    .line 119
    invoke-virtual {v0}, Lqf/S;->L0()Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-nez v3, :cond_4

    .line 128
    .line 129
    invoke-virtual {v0}, Lqf/S;->Q0()Lqf/M0;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    instance-of v0, v0, LMe/k;

    .line 134
    .line 135
    if-nez v0, :cond_4

    .line 136
    .line 137
    sget-object p1, Lbf/j$b;->c:Lbf/j$b;

    .line 138
    .line 139
    return-object p1

    .line 140
    :cond_5
    new-instance p3, LMe/i;

    .line 141
    .line 142
    const/4 v0, 0x1

    .line 143
    invoke-direct {p3, v2, v0, v2}, LMe/i;-><init>(Lqf/A0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p3}, Lqf/E0;->c()Lqf/G0;

    .line 147
    .line 148
    .line 149
    move-result-object p3

    .line 150
    invoke-interface {p1, p3}, Lye/j0;->c(Lqf/G0;)Lye/n;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    check-cast p1, Lye/a;

    .line 155
    .line 156
    if-nez p1, :cond_6

    .line 157
    .line 158
    sget-object p1, Lbf/j$b;->c:Lbf/j$b;

    .line 159
    .line 160
    return-object p1

    .line 161
    :cond_6
    instance-of p3, p1, Lye/g0;

    .line 162
    .line 163
    if-eqz p3, :cond_7

    .line 164
    .line 165
    move-object p3, p1

    .line 166
    check-cast p3, Lye/g0;

    .line 167
    .line 168
    invoke-interface {p3}, Lye/a;->getTypeParameters()Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-nez v1, :cond_7

    .line 180
    .line 181
    invoke-interface {p3}, Lye/g0;->v()Lye/z$a;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object p3

    .line 189
    invoke-interface {p1, p3}, Lye/z$a;->q(Ljava/util/List;)Lye/z$a;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-interface {p1}, Lye/z$a;->build()Lye/z;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    :cond_7
    sget-object p3, Lbf/o;->f:Lbf/o;

    .line 201
    .line 202
    const/4 v1, 0x0

    .line 203
    invoke-virtual {p3, p1, p2, v1}, Lbf/o;->F(Lye/a;Lye/a;Z)Lbf/o$i;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {p1}, Lbf/o$i;->c()Lbf/o$i$a;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    const-string p2, "getResult(...)"

    .line 212
    .line 213
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    sget-object p2, LHe/q$a;->a:[I

    .line 217
    .line 218
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    aget p1, p2, p1

    .line 223
    .line 224
    if-ne p1, v0, :cond_8

    .line 225
    .line 226
    sget-object p1, Lbf/j$b;->a:Lbf/j$b;

    .line 227
    .line 228
    return-object p1

    .line 229
    :cond_8
    sget-object p1, Lbf/j$b;->c:Lbf/j$b;

    .line 230
    .line 231
    return-object p1

    .line 232
    :cond_9
    :goto_2
    sget-object p1, Lbf/j$b;->c:Lbf/j$b;

    .line 233
    .line 234
    return-object p1
.end method

.method public b()Lbf/j$a;
    .locals 1

    .line 1
    sget-object v0, Lbf/j$a;->b:Lbf/j$a;

    .line 2
    .line 3
    return-object v0
.end method
