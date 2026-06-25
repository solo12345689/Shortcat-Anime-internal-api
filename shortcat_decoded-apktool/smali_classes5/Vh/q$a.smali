.class public LVh/q$a;
.super Lai/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVh/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lai/b;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lai/h;Lai/g;)Lai/f;
    .locals 5

    .line 1
    invoke-interface {p2}, Lai/g;->a()Lai/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1}, Lai/h;->b()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sget v2, LXh/f;->a:I

    .line 10
    .line 11
    if-lt v1, v2, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lai/f;->c()Lai/f;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    invoke-interface {p1}, Lai/h;->d()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-interface {p1}, Lai/h;->getColumn()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-interface {p1}, Lai/h;->b()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    add-int/2addr v2, v3

    .line 31
    invoke-interface {p2}, Lai/g;->b()LZh/g;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p2}, LZh/g;->f()Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    const/4 v3, 0x1

    .line 40
    xor-int/2addr p2, v3

    .line 41
    invoke-interface {p1}, Lai/h;->a()LZh/f;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v4}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-static {v4, v1, v2, p2}, LVh/q;->j(Ljava/lang/CharSequence;IIZ)LVh/q$b;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    if-nez p2, :cond_1

    .line 54
    .line 55
    invoke-static {}, Lai/f;->c()Lai/f;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1

    .line 60
    :cond_1
    iget v1, p2, LVh/q$b;->b:I

    .line 61
    .line 62
    new-instance v2, LVh/r;

    .line 63
    .line 64
    invoke-interface {p1}, Lai/h;->getColumn()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    sub-int p1, v1, p1

    .line 69
    .line 70
    invoke-direct {v2, p1}, LVh/r;-><init>(I)V

    .line 71
    .line 72
    .line 73
    instance-of p1, v0, LVh/q;

    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    if-eqz p1, :cond_3

    .line 77
    .line 78
    invoke-interface {v0}, Lai/d;->f()LYh/a;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, LYh/q;

    .line 83
    .line 84
    iget-object v0, p2, LVh/q$b;->a:LYh/q;

    .line 85
    .line 86
    invoke-static {p1, v0}, LVh/q;->k(LYh/q;LYh/q;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-nez p1, :cond_2

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    new-array p1, v3, [Lai/d;

    .line 94
    .line 95
    aput-object v2, p1, v4

    .line 96
    .line 97
    invoke-static {p1}, Lai/f;->d([Lai/d;)Lai/f;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1, v1}, Lai/f;->a(I)Lai/f;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    return-object p1

    .line 106
    :cond_3
    :goto_0
    new-instance p1, LVh/q;

    .line 107
    .line 108
    iget-object v0, p2, LVh/q$b;->a:LYh/q;

    .line 109
    .line 110
    invoke-direct {p1, v0}, LVh/q;-><init>(LYh/q;)V

    .line 111
    .line 112
    .line 113
    iget-object p2, p2, LVh/q$b;->a:LYh/q;

    .line 114
    .line 115
    invoke-virtual {p2, v3}, LYh/q;->o(Z)V

    .line 116
    .line 117
    .line 118
    const/4 p2, 0x2

    .line 119
    new-array p2, p2, [Lai/d;

    .line 120
    .line 121
    aput-object p1, p2, v4

    .line 122
    .line 123
    aput-object v2, p2, v3

    .line 124
    .line 125
    invoke-static {p2}, Lai/f;->d([Lai/d;)Lai/f;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p1, v1}, Lai/f;->a(I)Lai/f;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    return-object p1
.end method
