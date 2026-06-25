.class public final LU/a0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU/a0$a;,
        LU/a0$b;
    }
.end annotation


# instance fields
.field private final a:LPf/a;

.field private final b:LY/C0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {v0, v1, v2}, LPf/g;->b(ZILjava/lang/Object;)LPf/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, LU/a0;->a:LPf/a;

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-static {v2, v2, v0, v2}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, LU/a0;->b:LY/C0;

    .line 19
    .line 20
    return-void
.end method

.method public static final synthetic a(LU/a0;LU/W;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LU/a0;->c(LU/W;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final c(LU/W;)V
    .locals 1

    .line 1
    iget-object v0, p0, LU/a0;->b:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic f(LU/a0;Ljava/lang/String;Ljava/lang/String;ZLU/Y;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    and-int/lit8 p7, p6, 0x2

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    move-object v2, p2

    .line 7
    and-int/lit8 p2, p6, 0x4

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    :cond_1
    move v3, p3

    .line 13
    and-int/lit8 p2, p6, 0x8

    .line 14
    .line 15
    if-eqz p2, :cond_3

    .line 16
    .line 17
    if-nez v2, :cond_2

    .line 18
    .line 19
    sget-object p2, LU/Y;->a:LU/Y;

    .line 20
    .line 21
    :goto_0
    move-object p4, p2

    .line 22
    goto :goto_1

    .line 23
    :cond_2
    sget-object p2, LU/Y;->c:LU/Y;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    :goto_1
    move-object v0, p0

    .line 27
    move-object v1, p1

    .line 28
    move-object v4, p4

    .line 29
    move-object v5, p5

    .line 30
    invoke-virtual/range {v0 .. v5}, LU/a0;->e(Ljava/lang/String;Ljava/lang/String;ZLU/Y;LZd/e;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method


# virtual methods
.method public final b()LU/W;
    .locals 1

    .line 1
    iget-object v0, p0, LU/a0;->b:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LU/W;

    .line 8
    .line 9
    return-object v0
.end method

.method public final d(LU/d0;LZd/e;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, LU/a0$c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LU/a0$c;

    .line 7
    .line 8
    iget v1, v0, LU/a0$c;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LU/a0$c;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LU/a0$c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LU/a0$c;-><init>(LU/a0;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LU/a0$c;->e:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LU/a0$c;->g:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    const/4 v5, 0x0

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget-object p1, v0, LU/a0$c;->d:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, LU/a0$c;

    .line 45
    .line 46
    iget-object p1, v0, LU/a0$c;->c:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, LPf/a;

    .line 49
    .line 50
    iget-object v1, v0, LU/a0$c;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, LU/d0;

    .line 53
    .line 54
    iget-object v0, v0, LU/a0$c;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, LU/a0;

    .line 57
    .line 58
    :try_start_0
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    goto/16 :goto_4

    .line 62
    .line 63
    :catchall_0
    move-exception p2

    .line 64
    goto/16 :goto_5

    .line 65
    .line 66
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1

    .line 74
    :cond_2
    iget-object p1, v0, LU/a0$c;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, LPf/a;

    .line 77
    .line 78
    iget-object v2, v0, LU/a0$c;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, LU/d0;

    .line 81
    .line 82
    iget-object v6, v0, LU/a0$c;->a:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v6, LU/a0;

    .line 85
    .line 86
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    move-object p2, p1

    .line 90
    move-object p1, v2

    .line 91
    goto :goto_1

    .line 92
    :cond_3
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-object p2, p0, LU/a0;->a:LPf/a;

    .line 96
    .line 97
    iput-object p0, v0, LU/a0$c;->a:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object p1, v0, LU/a0$c;->b:Ljava/lang/Object;

    .line 100
    .line 101
    iput-object p2, v0, LU/a0$c;->c:Ljava/lang/Object;

    .line 102
    .line 103
    iput v4, v0, LU/a0$c;->g:I

    .line 104
    .line 105
    invoke-interface {p2, v5, v0}, LPf/a;->c(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    if-ne v2, v1, :cond_4

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_4
    move-object v6, p0

    .line 113
    :goto_1
    :try_start_1
    iput-object v6, v0, LU/a0$c;->a:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object p1, v0, LU/a0$c;->b:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object p2, v0, LU/a0$c;->c:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v0, v0, LU/a0$c;->d:Ljava/lang/Object;

    .line 120
    .line 121
    iput v3, v0, LU/a0$c;->g:I

    .line 122
    .line 123
    new-instance v2, LGf/p;

    .line 124
    .line 125
    invoke-static {v0}, Lae/b;->c(LZd/e;)LZd/e;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-direct {v2, v3, v4}, LGf/p;-><init>(LZd/e;I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, LGf/p;->C()V

    .line 133
    .line 134
    .line 135
    new-instance v3, LU/a0$a;

    .line 136
    .line 137
    invoke-direct {v3, p1, v2}, LU/a0$a;-><init>(LU/d0;LGf/n;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v6, v3}, LU/a0;->a(LU/a0;LU/W;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, LGf/p;->v()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    if-ne p1, v2, :cond_5

    .line 152
    .line 153
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :catchall_1
    move-exception p1

    .line 158
    move-object v0, p2

    .line 159
    move-object p2, p1

    .line 160
    move-object p1, v0

    .line 161
    move-object v0, v6

    .line 162
    goto :goto_5

    .line 163
    :cond_5
    :goto_2
    if-ne p1, v1, :cond_6

    .line 164
    .line 165
    :goto_3
    return-object v1

    .line 166
    :cond_6
    move-object v0, p2

    .line 167
    move-object p2, p1

    .line 168
    move-object p1, v0

    .line 169
    move-object v0, v6

    .line 170
    :goto_4
    :try_start_2
    invoke-direct {v0, v5}, LU/a0;->c(LU/W;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 171
    .line 172
    .line 173
    invoke-interface {p1, v5}, LPf/a;->e(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    return-object p2

    .line 177
    :catchall_2
    move-exception p2

    .line 178
    goto :goto_6

    .line 179
    :goto_5
    :try_start_3
    invoke-direct {v0, v5}, LU/a0;->c(LU/W;)V

    .line 180
    .line 181
    .line 182
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 183
    :goto_6
    invoke-interface {p1, v5}, LPf/a;->e(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    throw p2
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;ZLU/Y;LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, LU/a0$b;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, LU/a0$b;-><init>(Ljava/lang/String;Ljava/lang/String;ZLU/Y;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, p5}, LU/a0;->d(LU/d0;LZd/e;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method
