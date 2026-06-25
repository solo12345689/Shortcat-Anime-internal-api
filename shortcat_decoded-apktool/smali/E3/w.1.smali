.class public final LE3/w;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final g:Ljava/lang/String;

.field private static final h:Ljava/lang/String;

.field private static final i:Ljava/lang/String;

.field private static final j:Ljava/lang/String;

.field private static final k:Ljava/lang/String;

.field private static final l:Ljava/lang/String;


# instance fields
.field public final a:I

.field public final b:J

.field public final c:Ljava/lang/Object;

.field private final d:I

.field public final e:LE3/Y2;

.field public final f:LE3/V6;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, LE3/w;->g:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, LE3/w;->h:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, LE3/w;->i:Ljava/lang/String;

    .line 21
    .line 22
    const/4 v0, 0x3

    .line 23
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, LE3/w;->j:Ljava/lang/String;

    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, LE3/w;->k:Ljava/lang/String;

    .line 35
    .line 36
    const/4 v0, 0x5

    .line 37
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, LE3/w;->l:Ljava/lang/String;

    .line 42
    .line 43
    return-void
.end method

.method private constructor <init>(IJLE3/Y2;LE3/V6;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LE3/w;->a:I

    .line 5
    .line 6
    iput-wide p2, p0, LE3/w;->b:J

    .line 7
    .line 8
    iput-object p4, p0, LE3/w;->e:LE3/Y2;

    .line 9
    .line 10
    iput-object p5, p0, LE3/w;->f:LE3/V6;

    .line 11
    .line 12
    iput-object p6, p0, LE3/w;->c:Ljava/lang/Object;

    .line 13
    .line 14
    iput p7, p0, LE3/w;->d:I

    .line 15
    .line 16
    return-void
.end method

.method private static a(Landroid/os/Bundle;Ljava/lang/Integer;)LE3/w;
    .locals 10

    .line 1
    sget-object v0, LE3/w;->g:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    sget-object v0, LE3/w;->h:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 11
    .line 12
    .line 13
    move-result-wide v4

    .line 14
    invoke-virtual {p0, v0, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v4

    .line 18
    sget-object v0, LE3/w;->i:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v2, 0x0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    move-object v6, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v0}, LE3/Y2;->a(Landroid/os/Bundle;)LE3/Y2;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    move-object v6, v0

    .line 34
    :goto_0
    sget-object v0, LE3/w;->l:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-static {v0}, LE3/V6;->a(Landroid/os/Bundle;)LE3/V6;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_1
    move-object v7, v0

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    if-eqz v3, :cond_2

    .line 49
    .line 50
    new-instance v0, LE3/V6;

    .line 51
    .line 52
    const-string v7, "no error message provided"

    .line 53
    .line 54
    invoke-direct {v0, v3, v7}, LE3/V6;-><init>(ILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move-object v7, v2

    .line 59
    :goto_2
    sget-object v0, LE3/w;->k:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    const/4 v0, 0x1

    .line 66
    if-eq v9, v0, :cond_8

    .line 67
    .line 68
    const/4 v8, 0x2

    .line 69
    if-eq v9, v8, :cond_9

    .line 70
    .line 71
    const/4 v8, 0x3

    .line 72
    if-eq v9, v8, :cond_4

    .line 73
    .line 74
    const/4 p0, 0x4

    .line 75
    if-ne v9, p0, :cond_3

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 81
    .line 82
    .line 83
    throw p0

    .line 84
    :cond_4
    if-eqz p1, :cond_5

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-ne p1, v8, :cond_6

    .line 91
    .line 92
    :cond_5
    move v1, v0

    .line 93
    :cond_6
    invoke-static {v1}, Lt2/a;->g(Z)V

    .line 94
    .line 95
    .line 96
    sget-object p1, LE3/w;->j:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {p0, p1}, Landroidx/core/app/h;->a(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    if-nez p0, :cond_7

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_7
    new-instance p1, LE3/u;

    .line 106
    .line 107
    invoke-direct {p1}, LE3/u;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-static {p0}, Lq2/j;->a(Landroid/os/IBinder;)LP9/u;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-static {p1, p0}, Lt2/i;->d(LO9/f;Ljava/util/List;)LP9/u;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    :cond_8
    :goto_3
    move-object v8, v2

    .line 119
    goto :goto_4

    .line 120
    :cond_9
    if-eqz p1, :cond_a

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-ne p1, v8, :cond_b

    .line 127
    .line 128
    :cond_a
    move v1, v0

    .line 129
    :cond_b
    invoke-static {v1}, Lt2/a;->g(Z)V

    .line 130
    .line 131
    .line 132
    sget-object p1, LE3/w;->j:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    if-nez p0, :cond_c

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_c
    invoke-static {p0}, Lq2/C;->b(Landroid/os/Bundle;)Lq2/C;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    goto :goto_3

    .line 146
    :goto_4
    new-instance v2, LE3/w;

    .line 147
    .line 148
    invoke-direct/range {v2 .. v9}, LE3/w;-><init>(IJLE3/Y2;LE3/V6;Ljava/lang/Object;I)V

    .line 149
    .line 150
    .line 151
    return-object v2
.end method

.method public static b(Landroid/os/Bundle;)LE3/w;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, LE3/w;->a(Landroid/os/Bundle;Ljava/lang/Integer;)LE3/w;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static c(I)LE3/w;
    .locals 3

    .line 1
    new-instance v0, LE3/V6;

    .line 2
    .line 3
    const-string v1, "no error message provided"

    .line 4
    .line 5
    sget-object v2, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {v0, p0, v1, v2}, LE3/V6;-><init>(ILjava/lang/String;Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, LE3/w;->d(LE3/V6;)LE3/w;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static d(LE3/V6;)LE3/w;
    .locals 8

    .line 1
    new-instance v0, LE3/w;

    .line 2
    .line 3
    iget v1, p0, LE3/V6;->a:I

    .line 4
    .line 5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v7, 0x4

    .line 11
    const/4 v4, 0x0

    .line 12
    move-object v5, p0

    .line 13
    invoke-direct/range {v0 .. v7}, LE3/w;-><init>(IJLE3/Y2;LE3/V6;Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method


# virtual methods
.method public e()Landroid/os/Bundle;
    .locals 5

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, LE3/w;->g:Ljava/lang/String;

    .line 7
    .line 8
    iget v2, p0, LE3/w;->a:I

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sget-object v1, LE3/w;->h:Ljava/lang/String;

    .line 14
    .line 15
    iget-wide v2, p0, LE3/w;->b:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, LE3/w;->e:LE3/Y2;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    sget-object v2, LE3/w;->i:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v1}, LE3/Y2;->b()Landroid/os/Bundle;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object v1, p0, LE3/w;->f:LE3/V6;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    sget-object v2, LE3/w;->l:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v1}, LE3/V6;->b()Landroid/os/Bundle;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    sget-object v1, LE3/w;->k:Ljava/lang/String;

    .line 47
    .line 48
    iget v2, p0, LE3/w;->d:I

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, LE3/w;->c:Ljava/lang/Object;

    .line 54
    .line 55
    if-nez v1, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    iget v2, p0, LE3/w;->d:I

    .line 59
    .line 60
    const/4 v3, 0x1

    .line 61
    if-eq v2, v3, :cond_5

    .line 62
    .line 63
    const/4 v3, 0x2

    .line 64
    if-eq v2, v3, :cond_4

    .line 65
    .line 66
    const/4 v1, 0x3

    .line 67
    if-eq v2, v1, :cond_3

    .line 68
    .line 69
    const/4 v1, 0x4

    .line 70
    if-eq v2, v1, :cond_5

    .line 71
    .line 72
    :goto_0
    return-object v0

    .line 73
    :cond_3
    sget-object v1, LE3/w;->j:Ljava/lang/String;

    .line 74
    .line 75
    new-instance v2, Lq2/j;

    .line 76
    .line 77
    iget-object v3, p0, LE3/w;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v3, LP9/u;

    .line 80
    .line 81
    new-instance v4, LE3/v;

    .line 82
    .line 83
    invoke-direct {v4}, LE3/v;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-static {v3, v4}, Lt2/i;->i(Ljava/util/List;LO9/f;)LP9/u;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-direct {v2, v3}, Lq2/j;-><init>(Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v0, v1, v2}, Landroidx/core/app/h;->b(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/IBinder;)V

    .line 94
    .line 95
    .line 96
    return-object v0

    .line 97
    :cond_4
    sget-object v2, LE3/w;->j:Ljava/lang/String;

    .line 98
    .line 99
    check-cast v1, Lq2/C;

    .line 100
    .line 101
    invoke-virtual {v1}, Lq2/C;->e()Landroid/os/Bundle;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 110
    .line 111
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 112
    .line 113
    .line 114
    throw v0
.end method
