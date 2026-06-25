.class public LVh/k$b;
.super Lai/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVh/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
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
    .locals 8

    .line 1
    invoke-interface {p1}, Lai/h;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1}, Lai/h;->a()LZh/f;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, LZh/f;->a()Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {p1}, Lai/h;->b()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x4

    .line 18
    if-ge v2, v3, :cond_2

    .line 19
    .line 20
    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/16 v3, 0x3c

    .line 25
    .line 26
    if-ne v2, v3, :cond_2

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    move v3, v2

    .line 30
    :goto_0
    const/4 v4, 0x7

    .line 31
    if-gt v3, v4, :cond_2

    .line 32
    .line 33
    if-ne v3, v4, :cond_0

    .line 34
    .line 35
    invoke-interface {p2}, Lai/g;->a()Lai/d;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-interface {v4}, Lai/d;->f()LYh/a;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    instance-of v4, v4, LYh/v;

    .line 44
    .line 45
    if-nez v4, :cond_1

    .line 46
    .line 47
    invoke-interface {p1}, Lai/h;->e()Lai/d;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-interface {v4}, Lai/d;->d()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_0

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_0
    invoke-static {}, LVh/k;->j()[[Ljava/util/regex/Pattern;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    aget-object v4, v4, v3

    .line 63
    .line 64
    const/4 v5, 0x0

    .line 65
    aget-object v4, v4, v5

    .line 66
    .line 67
    invoke-static {}, LVh/k;->j()[[Ljava/util/regex/Pattern;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    aget-object v6, v6, v3

    .line 72
    .line 73
    aget-object v6, v6, v2

    .line 74
    .line 75
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    invoke-interface {v1, v0, v7}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-virtual {v4, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_1

    .line 92
    .line 93
    new-instance p2, LVh/k;

    .line 94
    .line 95
    const/4 v0, 0x0

    .line 96
    invoke-direct {p2, v6, v0}, LVh/k;-><init>(Ljava/util/regex/Pattern;LVh/k$a;)V

    .line 97
    .line 98
    .line 99
    new-array v0, v2, [Lai/d;

    .line 100
    .line 101
    aput-object p2, v0, v5

    .line 102
    .line 103
    invoke-static {v0}, Lai/f;->d([Lai/d;)Lai/f;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-interface {p1}, Lai/h;->getIndex()I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    invoke-virtual {p2, p1}, Lai/f;->b(I)Lai/f;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    return-object p1

    .line 116
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_2
    invoke-static {}, Lai/f;->c()Lai/f;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    return-object p1
.end method
