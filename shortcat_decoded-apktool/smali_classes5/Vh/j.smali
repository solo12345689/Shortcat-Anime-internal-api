.class public LVh/j;
.super Lai/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LVh/j$a;
    }
.end annotation


# instance fields
.field private final a:LYh/j;

.field private final b:LZh/g;


# direct methods
.method public constructor <init>(ILZh/g;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lai/a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LYh/j;

    .line 5
    .line 6
    invoke-direct {v0}, LYh/j;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LVh/j;->a:LYh/j;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, LYh/j;->p(I)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, LVh/j;->b:LZh/g;

    .line 15
    .line 16
    return-void
.end method

.method static synthetic j(LZh/f;)LVh/j;
    .locals 0

    .line 1
    invoke-static {p0}, LVh/j;->l(LZh/f;)LVh/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic k(Ljava/lang/CharSequence;I)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, LVh/j;->m(Ljava/lang/CharSequence;I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static l(LZh/f;)LVh/j;
    .locals 10

    .line 1
    invoke-static {p0}, LZh/g;->g(LZh/f;)LZh/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, LWh/m;->k(LZh/g;)LWh/m;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0x23

    .line 10
    .line 11
    invoke-virtual {p0, v0}, LWh/m;->g(C)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_a

    .line 17
    .line 18
    const/4 v3, 0x6

    .line 19
    if-le v1, v3, :cond_0

    .line 20
    .line 21
    goto/16 :goto_3

    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, LWh/m;->e()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    new-instance p0, LVh/j;

    .line 30
    .line 31
    invoke-static {}, LZh/g;->b()LZh/g;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-direct {p0, v1, v0}, LVh/j;-><init>(ILZh/g;)V

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_1
    invoke-virtual {p0}, LWh/m;->l()C

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/16 v4, 0x9

    .line 44
    .line 45
    const/16 v5, 0x20

    .line 46
    .line 47
    if-eq v3, v5, :cond_2

    .line 48
    .line 49
    if-eq v3, v4, :cond_2

    .line 50
    .line 51
    return-object v2

    .line 52
    :cond_2
    invoke-virtual {p0}, LWh/m;->r()I

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, LWh/m;->o()LWh/l;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    const/4 v3, 0x1

    .line 60
    move-object v6, v2

    .line 61
    :goto_0
    move v7, v3

    .line 62
    :goto_1
    invoke-virtual {p0}, LWh/m;->e()Z

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    if-eqz v8, :cond_8

    .line 67
    .line 68
    invoke-virtual {p0}, LWh/m;->l()C

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    if-eq v8, v4, :cond_7

    .line 73
    .line 74
    if-eq v8, v5, :cond_7

    .line 75
    .line 76
    const/4 v9, 0x0

    .line 77
    if-eq v8, v0, :cond_3

    .line 78
    .line 79
    invoke-virtual {p0}, LWh/m;->h()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, LWh/m;->o()LWh/l;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    goto :goto_2

    .line 87
    :cond_3
    if-eqz v7, :cond_6

    .line 88
    .line 89
    invoke-virtual {p0, v0}, LWh/m;->g(C)I

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, LWh/m;->r()I

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    invoke-virtual {p0}, LWh/m;->e()Z

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    if-eqz v8, :cond_4

    .line 101
    .line 102
    invoke-virtual {p0}, LWh/m;->o()LWh/l;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    :cond_4
    if-lez v7, :cond_5

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    :goto_2
    move v7, v9

    .line 110
    goto :goto_1

    .line 111
    :cond_6
    invoke-virtual {p0}, LWh/m;->h()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, LWh/m;->o()LWh/l;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    goto :goto_1

    .line 119
    :cond_7
    invoke-virtual {p0}, LWh/m;->h()V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_8
    invoke-virtual {p0, v2, v6}, LWh/m;->d(LWh/l;LWh/l;)LZh/g;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {p0}, LZh/g;->c()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_9

    .line 136
    .line 137
    new-instance p0, LVh/j;

    .line 138
    .line 139
    invoke-static {}, LZh/g;->b()LZh/g;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-direct {p0, v1, v0}, LVh/j;-><init>(ILZh/g;)V

    .line 144
    .line 145
    .line 146
    return-object p0

    .line 147
    :cond_9
    new-instance v0, LVh/j;

    .line 148
    .line 149
    invoke-direct {v0, v1, p0}, LVh/j;-><init>(ILZh/g;)V

    .line 150
    .line 151
    .line 152
    return-object v0

    .line 153
    :cond_a
    :goto_3
    return-object v2
.end method

.method private static m(Ljava/lang/CharSequence;I)I
    .locals 4

    .line 1
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/16 v2, 0x2d

    .line 7
    .line 8
    if-eq v0, v2, :cond_1

    .line 9
    .line 10
    const/16 v3, 0x3d

    .line 11
    .line 12
    if-eq v0, v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    add-int/lit8 v0, p1, 0x1

    .line 16
    .line 17
    invoke-static {p0, v0, v3}, LVh/j;->n(Ljava/lang/CharSequence;IC)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    return v1

    .line 24
    :cond_1
    add-int/2addr p1, v1

    .line 25
    invoke-static {p0, p1, v2}, LVh/j;->n(Ljava/lang/CharSequence;IC)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    const/4 p0, 0x2

    .line 32
    return p0

    .line 33
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method private static n(Ljava/lang/CharSequence;IC)Z
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p2, p0, p1, v0}, LXh/f;->m(CLjava/lang/CharSequence;II)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-static {p0, p1, p2}, LXh/f;->o(Ljava/lang/CharSequence;II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-lt p1, p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method


# virtual methods
.method public b(LZh/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, LVh/j;->b:LZh/g;

    .line 2
    .line 3
    iget-object v1, p0, LVh/j;->a:LYh/j;

    .line 4
    .line 5
    invoke-interface {p1, v0, v1}, LZh/b;->b(LZh/g;LYh/s;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public f()LYh/a;
    .locals 1

    .line 1
    iget-object v0, p0, LVh/j;->a:LYh/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public i(Lai/h;)Lai/c;
    .locals 0

    .line 1
    invoke-static {}, Lai/c;->d()Lai/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
