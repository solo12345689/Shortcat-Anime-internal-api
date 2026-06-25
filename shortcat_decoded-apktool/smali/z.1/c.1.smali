.class public final Lz/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final b:I


# instance fields
.field private final a:La0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, La0/c;->d:I

    .line 2
    .line 3
    sput v0, Lz/c;->b:I

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La0/c;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    new-array v1, v1, [Lz/f$a;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, v1, v2}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lz/c;->a:La0/c;

    .line 15
    .line 16
    return-void
.end method

.method public static final synthetic a(Lz/c;)La0/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lz/c;->a:La0/c;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lz/c;->a:La0/c;

    .line 2
    .line 3
    invoke-virtual {v0}, La0/c;->p()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    new-array v2, v1, [LGf/n;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    if-ge v4, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, La0/c;->o()[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    aget-object v5, v5, v4

    .line 18
    .line 19
    check-cast v5, Lz/f$a;

    .line 20
    .line 21
    invoke-virtual {v5}, Lz/f$a;->a()LGf/n;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    aput-object v5, v2, v4

    .line 26
    .line 27
    add-int/lit8 v4, v4, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    :goto_1
    if-ge v3, v1, :cond_1

    .line 31
    .line 32
    aget-object v0, v2, v3

    .line 33
    .line 34
    invoke-interface {v0, p1}, LGf/n;->L(Ljava/lang/Throwable;)Z

    .line 35
    .line 36
    .line 37
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    iget-object p1, p0, Lz/c;->a:La0/c;

    .line 41
    .line 42
    invoke-virtual {p1}, La0/c;->s()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v0, "uncancelled requests present"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1
.end method

.method public final c(Lz/f$a;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Lz/f$a;->b()Lie/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lr0/h;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Lz/f$a;->a()LGf/n;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v0, LTd/u;->b:LTd/u$a;

    .line 19
    .line 20
    sget-object v0, LTd/L;->a:LTd/L;

    .line 21
    .line 22
    invoke-static {v0}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {p1, v0}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return v1

    .line 30
    :cond_0
    invoke-virtual {p1}, Lz/f$a;->a()LGf/n;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    new-instance v3, Lz/c$a;

    .line 35
    .line 36
    invoke-direct {v3, p0, p1}, Lz/c$a;-><init>(Lz/c;Lz/f$a;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v2, v3}, LGf/n;->p(Lkotlin/jvm/functions/Function1;)V

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, Lz/c;->a:La0/c;

    .line 43
    .line 44
    new-instance v3, Loe/f;

    .line 45
    .line 46
    invoke-virtual {v2}, La0/c;->p()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const/4 v4, 0x1

    .line 51
    sub-int/2addr v2, v4

    .line 52
    invoke-direct {v3, v1, v2}, Loe/f;-><init>(II)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Loe/d;->f()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-virtual {v3}, Loe/d;->i()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-gt v2, v3, :cond_4

    .line 64
    .line 65
    :goto_0
    iget-object v5, p0, Lz/c;->a:La0/c;

    .line 66
    .line 67
    invoke-virtual {v5}, La0/c;->o()[Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    aget-object v5, v5, v3

    .line 72
    .line 73
    check-cast v5, Lz/f$a;

    .line 74
    .line 75
    invoke-virtual {v5}, Lz/f$a;->b()Lie/a;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-interface {v5}, Lie/a;->invoke()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    check-cast v5, Lr0/h;

    .line 84
    .line 85
    if-nez v5, :cond_1

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_1
    invoke-virtual {v0, v5}, Lr0/h;->p(Lr0/h;)Lr0/h;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    if-eqz v7, :cond_2

    .line 97
    .line 98
    iget-object v0, p0, Lz/c;->a:La0/c;

    .line 99
    .line 100
    add-int/2addr v3, v4

    .line 101
    invoke-virtual {v0, v3, p1}, La0/c;->b(ILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    return v4

    .line 105
    :cond_2
    invoke-static {v6, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-nez v5, :cond_3

    .line 110
    .line 111
    new-instance v5, Ljava/util/concurrent/CancellationException;

    .line 112
    .line 113
    const-string v6, "bringIntoView call interrupted by a newer, non-overlapping call"

    .line 114
    .line 115
    invoke-direct {v5, v6}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iget-object v6, p0, Lz/c;->a:La0/c;

    .line 119
    .line 120
    invoke-virtual {v6}, La0/c;->p()I

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    sub-int/2addr v6, v4

    .line 125
    if-gt v6, v3, :cond_3

    .line 126
    .line 127
    :goto_1
    iget-object v7, p0, Lz/c;->a:La0/c;

    .line 128
    .line 129
    invoke-virtual {v7}, La0/c;->o()[Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    aget-object v7, v7, v3

    .line 134
    .line 135
    check-cast v7, Lz/f$a;

    .line 136
    .line 137
    invoke-virtual {v7}, Lz/f$a;->a()LGf/n;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    invoke-interface {v7, v5}, LGf/n;->L(Ljava/lang/Throwable;)Z

    .line 142
    .line 143
    .line 144
    if-eq v6, v3, :cond_3

    .line 145
    .line 146
    add-int/lit8 v6, v6, 0x1

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_3
    :goto_2
    if-eq v3, v2, :cond_4

    .line 150
    .line 151
    add-int/lit8 v3, v3, -0x1

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_4
    iget-object v0, p0, Lz/c;->a:La0/c;

    .line 155
    .line 156
    invoke-virtual {v0, v1, p1}, La0/c;->b(ILjava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    return v4
.end method

.method public final d()V
    .locals 4

    .line 1
    iget-object v0, p0, Lz/c;->a:La0/c;

    .line 2
    .line 3
    new-instance v1, Loe/f;

    .line 4
    .line 5
    invoke-virtual {v0}, La0/c;->p()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, v2, v0}, Loe/f;-><init>(II)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Loe/d;->f()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {v1}, Loe/d;->i()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-gt v0, v1, :cond_0

    .line 24
    .line 25
    :goto_0
    iget-object v2, p0, Lz/c;->a:La0/c;

    .line 26
    .line 27
    invoke-virtual {v2}, La0/c;->o()[Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    aget-object v2, v2, v0

    .line 32
    .line 33
    check-cast v2, Lz/f$a;

    .line 34
    .line 35
    invoke-virtual {v2}, Lz/f$a;->a()LGf/n;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    sget-object v3, LTd/L;->a:LTd/L;

    .line 40
    .line 41
    invoke-static {v3}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-interface {v2, v3}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    if-eq v0, v1, :cond_0

    .line 49
    .line 50
    add-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget-object v0, p0, Lz/c;->a:La0/c;

    .line 54
    .line 55
    invoke-virtual {v0}, La0/c;->i()V

    .line 56
    .line 57
    .line 58
    return-void
.end method
