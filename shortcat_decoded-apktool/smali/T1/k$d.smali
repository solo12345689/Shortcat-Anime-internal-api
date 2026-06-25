.class final LT1/k$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT1/k;-><init>(LT1/E;Ljava/util/List;LT1/e;LGf/O;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:LT1/k;


# direct methods
.method constructor <init>(LT1/k;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT1/k$d;->d:LT1/k;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 2

    .line 1
    new-instance v0, LT1/k$d;

    .line 2
    .line 3
    iget-object v1, p0, LT1/k$d;->d:LT1/k;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LT1/k$d;-><init>(LT1/k;LZd/e;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LT1/k$d;->c:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(LJf/f;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LT1/k$d;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LT1/k$d;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LT1/k$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LJf/f;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LT1/k$d;->invoke(LJf/f;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LT1/k$d;->b:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    iget-object v1, p0, LT1/k$d;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, LT1/D;

    .line 34
    .line 35
    iget-object v3, p0, LT1/k$d;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, LJf/f;

    .line 38
    .line 39
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iget-object v1, p0, LT1/k$d;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, LJf/f;

    .line 46
    .line 47
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, LT1/k$d;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, LJf/f;

    .line 57
    .line 58
    iget-object v1, p0, LT1/k$d;->d:LT1/k;

    .line 59
    .line 60
    iput-object p1, p0, LT1/k$d;->c:Ljava/lang/Object;

    .line 61
    .line 62
    iput v4, p0, LT1/k$d;->b:I

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    invoke-static {v1, v4, p0}, LT1/k;->p(LT1/k;ZLZd/e;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    if-ne v1, v0, :cond_4

    .line 70
    .line 71
    goto/16 :goto_3

    .line 72
    .line 73
    :cond_4
    move-object v7, v1

    .line 74
    move-object v1, p1

    .line 75
    move-object p1, v7

    .line 76
    :goto_0
    check-cast p1, LT1/D;

    .line 77
    .line 78
    instance-of v4, p1, LT1/f;

    .line 79
    .line 80
    if-eqz v4, :cond_6

    .line 81
    .line 82
    move-object v4, p1

    .line 83
    check-cast v4, LT1/f;

    .line 84
    .line 85
    invoke-virtual {v4}, LT1/f;->c()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    iput-object v1, p0, LT1/k$d;->c:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object p1, p0, LT1/k$d;->a:Ljava/lang/Object;

    .line 92
    .line 93
    iput v3, p0, LT1/k$d;->b:I

    .line 94
    .line 95
    invoke-interface {v1, v4, p0}, LJf/f;->emit(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    if-ne v3, v0, :cond_5

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_5
    move-object v3, v1

    .line 103
    move-object v1, p1

    .line 104
    :goto_1
    move-object p1, v1

    .line 105
    move-object v1, v3

    .line 106
    goto :goto_2

    .line 107
    :cond_6
    instance-of v3, p1, LT1/H;

    .line 108
    .line 109
    if-nez v3, :cond_a

    .line 110
    .line 111
    instance-of v3, p1, LT1/x;

    .line 112
    .line 113
    if-nez v3, :cond_9

    .line 114
    .line 115
    instance-of v3, p1, LT1/r;

    .line 116
    .line 117
    if-eqz v3, :cond_7

    .line 118
    .line 119
    sget-object p1, LTd/L;->a:LTd/L;

    .line 120
    .line 121
    return-object p1

    .line 122
    :cond_7
    :goto_2
    iget-object v3, p0, LT1/k$d;->d:LT1/k;

    .line 123
    .line 124
    invoke-static {v3}, LT1/k;->d(LT1/k;)LT1/l;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v3}, LT1/l;->b()LJf/e;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    new-instance v4, LT1/k$d$a;

    .line 133
    .line 134
    iget-object v5, p0, LT1/k$d;->d:LT1/k;

    .line 135
    .line 136
    const/4 v6, 0x0

    .line 137
    invoke-direct {v4, v5, v6}, LT1/k$d$a;-><init>(LT1/k;LZd/e;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v3, v4}, LJf/g;->v(LJf/e;Lkotlin/jvm/functions/Function2;)LJf/e;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    new-instance v4, LT1/k$d$b;

    .line 145
    .line 146
    invoke-direct {v4, v6}, LT1/k$d$b;-><init>(LZd/e;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v3, v4}, LJf/g;->x(LJf/e;Lkotlin/jvm/functions/Function2;)LJf/e;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    new-instance v4, LT1/k$d$c;

    .line 154
    .line 155
    invoke-direct {v4, p1, v6}, LT1/k$d$c;-><init>(LT1/D;LZd/e;)V

    .line 156
    .line 157
    .line 158
    invoke-static {v3, v4}, LJf/g;->j(LJf/e;Lkotlin/jvm/functions/Function2;)LJf/e;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    new-instance v3, LT1/k$d$e;

    .line 163
    .line 164
    invoke-direct {v3, p1}, LT1/k$d$e;-><init>(LJf/e;)V

    .line 165
    .line 166
    .line 167
    new-instance p1, LT1/k$d$d;

    .line 168
    .line 169
    iget-object v4, p0, LT1/k$d;->d:LT1/k;

    .line 170
    .line 171
    invoke-direct {p1, v4, v6}, LT1/k$d$d;-><init>(LT1/k;LZd/e;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v3, p1}, LJf/g;->u(LJf/e;Lie/o;)LJf/e;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    iput-object v6, p0, LT1/k$d;->c:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v6, p0, LT1/k$d;->a:Ljava/lang/Object;

    .line 181
    .line 182
    iput v2, p0, LT1/k$d;->b:I

    .line 183
    .line 184
    invoke-static {v1, p1, p0}, LJf/g;->l(LJf/f;LJf/e;LZd/e;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    if-ne p1, v0, :cond_8

    .line 189
    .line 190
    :goto_3
    return-object v0

    .line 191
    :cond_8
    :goto_4
    sget-object p1, LTd/L;->a:LTd/L;

    .line 192
    .line 193
    return-object p1

    .line 194
    :cond_9
    check-cast p1, LT1/x;

    .line 195
    .line 196
    invoke-virtual {p1}, LT1/x;->b()Ljava/lang/Throwable;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    throw p1

    .line 201
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 202
    .line 203
    const-string v0, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    .line 204
    .line 205
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw p1
.end method
