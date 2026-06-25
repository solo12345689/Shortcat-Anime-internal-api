.class public final LE3/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE3/b$b;
    }
.end annotation


# static fields
.field private static final j:Ljava/lang/String;

.field private static final k:Ljava/lang/String;

.field private static final l:Ljava/lang/String;

.field private static final m:Ljava/lang/String;

.field private static final n:Ljava/lang/String;

.field private static final o:Ljava/lang/String;

.field private static final p:Ljava/lang/String;

.field private static final q:Ljava/lang/String;

.field private static final r:Ljava/lang/String;


# instance fields
.field public final a:LE3/T6;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:Landroid/net/Uri;

.field public final f:Ljava/lang/CharSequence;

.field public final g:Landroid/os/Bundle;

.field public final h:LS9/e;

.field public final i:Z


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
    sput-object v0, LE3/b;->j:Ljava/lang/String;

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
    sput-object v0, LE3/b;->k:Ljava/lang/String;

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
    sput-object v0, LE3/b;->l:Ljava/lang/String;

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
    sput-object v0, LE3/b;->m:Ljava/lang/String;

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
    sput-object v0, LE3/b;->n:Ljava/lang/String;

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
    sput-object v0, LE3/b;->o:Ljava/lang/String;

    .line 42
    .line 43
    const/4 v0, 0x6

    .line 44
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sput-object v0, LE3/b;->p:Ljava/lang/String;

    .line 49
    .line 50
    const/4 v0, 0x7

    .line 51
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, LE3/b;->q:Ljava/lang/String;

    .line 56
    .line 57
    const/16 v0, 0x8

    .line 58
    .line 59
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, LE3/b;->r:Ljava/lang/String;

    .line 64
    .line 65
    return-void
.end method

.method private constructor <init>(LE3/T6;IIILandroid/net/Uri;Ljava/lang/CharSequence;Landroid/os/Bundle;ZLS9/e;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LE3/b;->a:LE3/T6;

    .line 4
    iput p2, p0, LE3/b;->b:I

    .line 5
    iput p3, p0, LE3/b;->c:I

    .line 6
    iput p4, p0, LE3/b;->d:I

    .line 7
    iput-object p5, p0, LE3/b;->e:Landroid/net/Uri;

    .line 8
    iput-object p6, p0, LE3/b;->f:Ljava/lang/CharSequence;

    .line 9
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1, p7}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object p1, p0, LE3/b;->g:Landroid/os/Bundle;

    .line 10
    iput-boolean p8, p0, LE3/b;->i:Z

    .line 11
    iput-object p9, p0, LE3/b;->h:LS9/e;

    return-void
.end method

.method synthetic constructor <init>(LE3/T6;IIILandroid/net/Uri;Ljava/lang/CharSequence;Landroid/os/Bundle;ZLS9/e;LE3/b$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p9}, LE3/b;-><init>(LE3/T6;IIILandroid/net/Uri;Ljava/lang/CharSequence;Landroid/os/Bundle;ZLS9/e;)V

    return-void
.end method

.method static a(Ljava/util/List;I)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_1

    .line 8
    .line 9
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, LE3/b;

    .line 14
    .line 15
    iget-object v2, v2, LE3/b;->h:LS9/e;

    .line 16
    .line 17
    invoke-virtual {v2, v0}, LS9/e;->c(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-ne v2, p1, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return v0
.end method

.method static d(Ljava/util/List;LE3/U6;Lq2/P$b;)LP9/u;
    .locals 5

    .line 1
    new-instance v0, LP9/u$a;

    .line 2
    .line 3
    invoke-direct {v0}, LP9/u$a;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-ge v2, v3, :cond_1

    .line 13
    .line 14
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, LE3/b;

    .line 19
    .line 20
    invoke-static {v3, p1, p2}, LE3/b;->j(LE3/b;LE3/U6;Lq2/P$b;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0, v3}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-virtual {v3, v1}, LE3/b;->b(Z)LE3/b;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v0, v3}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 35
    .line 36
    .line 37
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v0}, LP9/u$a;->k()LP9/u;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public static e(Landroid/os/Bundle;I)LE3/b;
    .locals 11

    .line 1
    sget-object v0, LE3/b;->j:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-static {v0}, LE3/T6;->a(Landroid/os/Bundle;)LE3/T6;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    sget-object v1, LE3/b;->k:Ljava/lang/String;

    .line 16
    .line 17
    const/4 v2, -0x1

    .line 18
    invoke-virtual {p0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    sget-object v3, LE3/b;->l:Ljava/lang/String;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-virtual {p0, v3, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    sget-object v5, LE3/b;->m:Ljava/lang/String;

    .line 30
    .line 31
    const-string v6, ""

    .line 32
    .line 33
    invoke-virtual {p0, v5, v6}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    sget-object v6, LE3/b;->n:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p0, v6}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    const/4 v7, 0x3

    .line 44
    const/4 v8, 0x1

    .line 45
    if-lt p1, v7, :cond_2

    .line 46
    .line 47
    sget-object p1, LE3/b;->o:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p0, p1, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move p1, v4

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    :goto_1
    move p1, v8

    .line 59
    :goto_2
    sget-object v7, LE3/b;->p:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {p0, v7}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    check-cast v7, Landroid/net/Uri;

    .line 66
    .line 67
    sget-object v9, LE3/b;->q:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {p0, v9, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    sget-object v10, LE3/b;->r:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p0, v10}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    new-instance v10, LE3/b$b;

    .line 80
    .line 81
    invoke-direct {v10, v9, v3}, LE3/b$b;-><init>(II)V

    .line 82
    .line 83
    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    invoke-virtual {v10, v0}, LE3/b$b;->i(LE3/T6;)LE3/b$b;

    .line 87
    .line 88
    .line 89
    :cond_3
    if-eq v1, v2, :cond_4

    .line 90
    .line 91
    invoke-virtual {v10, v1}, LE3/b$b;->h(I)LE3/b$b;

    .line 92
    .line 93
    .line 94
    :cond_4
    if-eqz v7, :cond_6

    .line 95
    .line 96
    invoke-virtual {v7}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    const-string v1, "content"

    .line 101
    .line 102
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-nez v0, :cond_5

    .line 107
    .line 108
    invoke-virtual {v7}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    const-string v1, "android.resource"

    .line 113
    .line 114
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_6

    .line 119
    .line 120
    :cond_5
    invoke-virtual {v10, v7}, LE3/b$b;->g(Landroid/net/Uri;)LE3/b$b;

    .line 121
    .line 122
    .line 123
    :cond_6
    invoke-virtual {v10, v5}, LE3/b$b;->c(Ljava/lang/CharSequence;)LE3/b$b;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    if-nez v6, :cond_7

    .line 128
    .line 129
    sget-object v6, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 130
    .line 131
    :cond_7
    invoke-virtual {v0, v6}, LE3/b$b;->e(Landroid/os/Bundle;)LE3/b$b;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0, p1}, LE3/b$b;->d(Z)LE3/b$b;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-nez p0, :cond_8

    .line 140
    .line 141
    new-array p0, v8, [I

    .line 142
    .line 143
    const/4 v0, 0x6

    .line 144
    aput v0, p0, v4

    .line 145
    .line 146
    :cond_8
    invoke-virtual {p1, p0}, LE3/b$b;->j([I)LE3/b$b;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-virtual {p0}, LE3/b$b;->a()LE3/b;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    return-object p0
.end method

.method static f(Ljava/util/List;ZZ)LP9/u;
    .locals 11

    .line 1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    const/4 v1, -0x1

    .line 14
    move v2, v0

    .line 15
    move v3, v1

    .line 16
    move v4, v3

    .line 17
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    const/4 v6, 0x3

    .line 22
    const/4 v7, 0x2

    .line 23
    const/4 v8, 0x6

    .line 24
    if-ge v2, v5, :cond_6

    .line 25
    .line 26
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, LE3/b;

    .line 31
    .line 32
    iget-boolean v9, v5, LE3/b;->i:Z

    .line 33
    .line 34
    if-eqz v9, :cond_5

    .line 35
    .line 36
    iget-object v9, v5, LE3/b;->a:LE3/T6;

    .line 37
    .line 38
    if-eqz v9, :cond_5

    .line 39
    .line 40
    iget v9, v9, LE3/T6;->a:I

    .line 41
    .line 42
    if-eqz v9, :cond_1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    move v9, v0

    .line 46
    :goto_1
    iget-object v10, v5, LE3/b;->h:LS9/e;

    .line 47
    .line 48
    invoke-virtual {v10}, LS9/e;->f()I

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    if-ge v9, v10, :cond_5

    .line 53
    .line 54
    iget-object v10, v5, LE3/b;->h:LS9/e;

    .line 55
    .line 56
    invoke-virtual {v10, v9}, LS9/e;->c(I)I

    .line 57
    .line 58
    .line 59
    move-result v10

    .line 60
    if-ne v10, v8, :cond_2

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    if-eqz p1, :cond_3

    .line 64
    .line 65
    if-ne v3, v1, :cond_3

    .line 66
    .line 67
    if-ne v10, v7, :cond_3

    .line 68
    .line 69
    move v3, v2

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    if-eqz p2, :cond_4

    .line 72
    .line 73
    if-ne v4, v1, :cond_4

    .line 74
    .line 75
    if-ne v10, v6, :cond_4

    .line 76
    .line 77
    move v4, v2

    .line 78
    goto :goto_2

    .line 79
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_6
    invoke-static {}, LP9/u;->t()LP9/u$a;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    if-eq v3, v1, :cond_7

    .line 90
    .line 91
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    check-cast p2, LE3/b;

    .line 96
    .line 97
    invoke-static {v7}, LS9/e;->h(I)LS9/e;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {p2, v2}, LE3/b;->c(LS9/e;)LE3/b;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-virtual {p1, p2}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 106
    .line 107
    .line 108
    :cond_7
    if-eq v4, v1, :cond_8

    .line 109
    .line 110
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    check-cast p2, LE3/b;

    .line 115
    .line 116
    invoke-static {v6}, LS9/e;->h(I)LS9/e;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {p2, v1}, LE3/b;->c(LS9/e;)LE3/b;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    invoke-virtual {p1, p2}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 125
    .line 126
    .line 127
    :cond_8
    :goto_3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    if-ge v0, p2, :cond_b

    .line 132
    .line 133
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    check-cast p2, LE3/b;

    .line 138
    .line 139
    iget-boolean v1, p2, LE3/b;->i:Z

    .line 140
    .line 141
    if-eqz v1, :cond_a

    .line 142
    .line 143
    iget-object v1, p2, LE3/b;->a:LE3/T6;

    .line 144
    .line 145
    if-eqz v1, :cond_a

    .line 146
    .line 147
    iget v1, v1, LE3/T6;->a:I

    .line 148
    .line 149
    if-eqz v1, :cond_9

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_9
    if-eq v0, v3, :cond_a

    .line 153
    .line 154
    if-eq v0, v4, :cond_a

    .line 155
    .line 156
    iget-object v1, p2, LE3/b;->h:LS9/e;

    .line 157
    .line 158
    invoke-virtual {v1, v8}, LS9/e;->a(I)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_a

    .line 163
    .line 164
    invoke-static {v8}, LS9/e;->h(I)LS9/e;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {p2, v1}, LE3/b;->c(LS9/e;)LE3/b;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    invoke-virtual {p1, p2}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 173
    .line 174
    .line 175
    :cond_a
    :goto_4
    add-int/lit8 v0, v0, 0x1

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_b
    invoke-virtual {p1}, LP9/u$a;->k()LP9/u;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    return-object p0
.end method

.method public static g(II)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_5

    .line 3
    .line 4
    const v1, 0xe037

    .line 5
    .line 6
    .line 7
    if-eq p1, v1, :cond_5

    .line 8
    .line 9
    const v1, 0xe034

    .line 10
    .line 11
    .line 12
    if-ne p1, v1, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    const/16 v0, 0xb

    .line 16
    .line 17
    if-eq p0, v0, :cond_4

    .line 18
    .line 19
    const/4 v0, 0x7

    .line 20
    if-eq p0, v0, :cond_4

    .line 21
    .line 22
    const/4 v0, 0x6

    .line 23
    if-eq p0, v0, :cond_4

    .line 24
    .line 25
    const v1, 0xe045

    .line 26
    .line 27
    .line 28
    if-eq p1, v1, :cond_4

    .line 29
    .line 30
    const v1, 0xe020

    .line 31
    .line 32
    .line 33
    if-eq p1, v1, :cond_4

    .line 34
    .line 35
    const v1, 0xe042

    .line 36
    .line 37
    .line 38
    if-eq p1, v1, :cond_4

    .line 39
    .line 40
    const v1, 0xe05b

    .line 41
    .line 42
    .line 43
    if-eq p1, v1, :cond_4

    .line 44
    .line 45
    const v1, 0xe059

    .line 46
    .line 47
    .line 48
    if-eq p1, v1, :cond_4

    .line 49
    .line 50
    const v1, 0xfe059

    .line 51
    .line 52
    .line 53
    if-eq p1, v1, :cond_4

    .line 54
    .line 55
    const v1, 0xe05a

    .line 56
    .line 57
    .line 58
    if-ne p1, v1, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    const/16 v1, 0xc

    .line 62
    .line 63
    if-eq p0, v1, :cond_3

    .line 64
    .line 65
    const/16 v1, 0x9

    .line 66
    .line 67
    if-eq p0, v1, :cond_3

    .line 68
    .line 69
    const/16 v1, 0x8

    .line 70
    .line 71
    if-eq p0, v1, :cond_3

    .line 72
    .line 73
    const p0, 0xe044

    .line 74
    .line 75
    .line 76
    if-eq p1, p0, :cond_3

    .line 77
    .line 78
    const p0, 0xe01f

    .line 79
    .line 80
    .line 81
    if-eq p1, p0, :cond_3

    .line 82
    .line 83
    const p0, 0xf6f4

    .line 84
    .line 85
    .line 86
    if-eq p1, p0, :cond_3

    .line 87
    .line 88
    const p0, 0xe058

    .line 89
    .line 90
    .line 91
    if-eq p1, p0, :cond_3

    .line 92
    .line 93
    const p0, 0xe056

    .line 94
    .line 95
    .line 96
    if-eq p1, p0, :cond_3

    .line 97
    .line 98
    const p0, 0xfe056

    .line 99
    .line 100
    .line 101
    if-eq p1, p0, :cond_3

    .line 102
    .line 103
    const p0, 0xe057

    .line 104
    .line 105
    .line 106
    if-ne p1, p0, :cond_2

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    return v0

    .line 110
    :cond_3
    :goto_0
    const/4 p0, 0x3

    .line 111
    return p0

    .line 112
    :cond_4
    :goto_1
    const/4 p0, 0x2

    .line 113
    return p0

    .line 114
    :cond_5
    :goto_2
    return v0
.end method

.method public static h(I)I
    .locals 0

    .line 1
    sparse-switch p0, :sswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return p0

    .line 6
    :sswitch_0
    sget p0, LE3/P6;->y:I

    .line 7
    .line 8
    return p0

    .line 9
    :sswitch_1
    sget p0, LE3/P6;->C:I

    .line 10
    .line 11
    return p0

    .line 12
    :sswitch_2
    sget p0, LE3/P6;->r0:I

    .line 13
    .line 14
    return p0

    .line 15
    :sswitch_3
    sget p0, LE3/P6;->p0:I

    .line 16
    .line 17
    return p0

    .line 18
    :sswitch_4
    sget p0, LE3/P6;->o:I

    .line 19
    .line 20
    return p0

    .line 21
    :sswitch_5
    sget p0, LE3/P6;->f:I

    .line 22
    .line 23
    return p0

    .line 24
    :sswitch_6
    sget p0, LE3/P6;->d:I

    .line 25
    .line 26
    return p0

    .line 27
    :sswitch_7
    sget p0, LE3/P6;->j0:I

    .line 28
    .line 29
    return p0

    .line 30
    :sswitch_8
    sget p0, LE3/P6;->m:I

    .line 31
    .line 32
    return p0

    .line 33
    :sswitch_9
    sget p0, LE3/P6;->s:I

    .line 34
    .line 35
    return p0

    .line 36
    :sswitch_a
    sget p0, LE3/P6;->r:I

    .line 37
    .line 38
    return p0

    .line 39
    :sswitch_b
    sget p0, LE3/P6;->H:I

    .line 40
    .line 41
    return p0

    .line 42
    :sswitch_c
    sget p0, LE3/P6;->b0:I

    .line 43
    .line 44
    return p0

    .line 45
    :sswitch_d
    sget p0, LE3/P6;->g0:I

    .line 46
    .line 47
    return p0

    .line 48
    :sswitch_e
    sget p0, LE3/P6;->V:I

    .line 49
    .line 50
    return p0

    .line 51
    :sswitch_f
    sget p0, LE3/P6;->X:I

    .line 52
    .line 53
    return p0

    .line 54
    :sswitch_10
    sget p0, LE3/P6;->Q:I

    .line 55
    .line 56
    return p0

    .line 57
    :sswitch_11
    sget p0, LE3/P6;->e0:I

    .line 58
    .line 59
    return p0

    .line 60
    :sswitch_12
    sget p0, LE3/P6;->D:I

    .line 61
    .line 62
    return p0

    .line 63
    :sswitch_13
    sget p0, LE3/P6;->x:I

    .line 64
    .line 65
    return p0

    .line 66
    :sswitch_14
    sget p0, LE3/P6;->A:I

    .line 67
    .line 68
    return p0

    .line 69
    :sswitch_15
    sget p0, LE3/P6;->B:I

    .line 70
    .line 71
    return p0

    .line 72
    :sswitch_16
    sget p0, LE3/P6;->j:I

    .line 73
    .line 74
    return p0

    .line 75
    :sswitch_17
    sget p0, LE3/P6;->Y:I

    .line 76
    .line 77
    return p0

    .line 78
    :sswitch_18
    sget p0, LE3/P6;->z:I

    .line 79
    .line 80
    return p0

    .line 81
    :sswitch_19
    sget p0, LE3/P6;->n0:I

    .line 82
    .line 83
    return p0

    .line 84
    :sswitch_1a
    sget p0, LE3/P6;->F:I

    .line 85
    .line 86
    return p0

    .line 87
    :sswitch_1b
    sget p0, LE3/P6;->s0:I

    .line 88
    .line 89
    return p0

    .line 90
    :sswitch_1c
    sget p0, LE3/P6;->q0:I

    .line 91
    .line 92
    return p0

    .line 93
    :sswitch_1d
    sget p0, LE3/P6;->T:I

    .line 94
    .line 95
    return p0

    .line 96
    :sswitch_1e
    sget p0, LE3/P6;->p:I

    .line 97
    .line 98
    return p0

    .line 99
    :sswitch_1f
    sget p0, LE3/P6;->g:I

    .line 100
    .line 101
    return p0

    .line 102
    :sswitch_20
    sget p0, LE3/P6;->e:I

    .line 103
    .line 104
    return p0

    .line 105
    :sswitch_21
    sget p0, LE3/P6;->k0:I

    .line 106
    .line 107
    return p0

    .line 108
    :sswitch_22
    sget p0, LE3/P6;->U:I

    .line 109
    .line 110
    return p0

    .line 111
    :sswitch_23
    sget p0, LE3/P6;->o0:I

    .line 112
    .line 113
    return p0

    .line 114
    :sswitch_24
    sget p0, LE3/P6;->O:I

    .line 115
    .line 116
    return p0

    .line 117
    :sswitch_25
    sget p0, LE3/P6;->K:I

    .line 118
    .line 119
    return p0

    .line 120
    :sswitch_26
    sget p0, LE3/P6;->q:I

    .line 121
    .line 122
    return p0

    .line 123
    :sswitch_27
    sget p0, LE3/P6;->n:I

    .line 124
    .line 125
    return p0

    .line 126
    :sswitch_28
    sget p0, LE3/P6;->c:I

    .line 127
    .line 128
    return p0

    .line 129
    :sswitch_29
    sget p0, LE3/P6;->I:I

    .line 130
    .line 131
    return p0

    .line 132
    :sswitch_2a
    sget p0, LE3/P6;->G:I

    .line 133
    .line 134
    return p0

    .line 135
    :sswitch_2b
    sget p0, LE3/P6;->l:I

    .line 136
    .line 137
    return p0

    .line 138
    :sswitch_2c
    sget p0, LE3/P6;->w:I

    .line 139
    .line 140
    return p0

    .line 141
    :sswitch_2d
    sget p0, LE3/P6;->N:I

    .line 142
    .line 143
    return p0

    .line 144
    :sswitch_2e
    sget p0, LE3/P6;->M:I

    .line 145
    .line 146
    return p0

    .line 147
    :sswitch_2f
    sget p0, LE3/P6;->L:I

    .line 148
    .line 149
    return p0

    .line 150
    :sswitch_30
    sget p0, LE3/P6;->d0:I

    .line 151
    .line 152
    return p0

    .line 153
    :sswitch_31
    sget p0, LE3/P6;->c0:I

    .line 154
    .line 155
    return p0

    .line 156
    :sswitch_32
    sget p0, LE3/P6;->a0:I

    .line 157
    .line 158
    return p0

    .line 159
    :sswitch_33
    sget p0, LE3/P6;->i0:I

    .line 160
    .line 161
    return p0

    .line 162
    :sswitch_34
    sget p0, LE3/P6;->h0:I

    .line 163
    .line 164
    return p0

    .line 165
    :sswitch_35
    sget p0, LE3/P6;->f0:I

    .line 166
    .line 167
    return p0

    .line 168
    :sswitch_36
    sget p0, LE3/P6;->v0:I

    .line 169
    .line 170
    return p0

    .line 171
    :sswitch_37
    sget p0, LE3/P6;->u0:I

    .line 172
    .line 173
    return p0

    .line 174
    :sswitch_38
    sget p0, LE3/P6;->t0:I

    .line 175
    .line 176
    return p0

    .line 177
    :sswitch_39
    sget p0, LE3/P6;->m0:I

    .line 178
    .line 179
    return p0

    .line 180
    :sswitch_3a
    sget p0, LE3/P6;->l0:I

    .line 181
    .line 182
    return p0

    .line 183
    :sswitch_3b
    sget p0, LE3/P6;->J:I

    .line 184
    .line 185
    return p0

    .line 186
    :sswitch_3c
    sget p0, LE3/P6;->t:I

    .line 187
    .line 188
    return p0

    .line 189
    :sswitch_3d
    sget p0, LE3/P6;->W:I

    .line 190
    .line 191
    return p0

    .line 192
    :sswitch_3e
    sget p0, LE3/P6;->Z:I

    .line 193
    .line 194
    return p0

    .line 195
    :sswitch_3f
    sget p0, LE3/P6;->R:I

    .line 196
    .line 197
    return p0

    .line 198
    :sswitch_40
    sget p0, LE3/P6;->P:I

    .line 199
    .line 200
    return p0

    .line 201
    :sswitch_41
    sget p0, LE3/P6;->E:I

    .line 202
    .line 203
    return p0

    .line 204
    :sswitch_42
    sget p0, LE3/P6;->v:I

    .line 205
    .line 206
    return p0

    .line 207
    :sswitch_43
    sget p0, LE3/P6;->u:I

    .line 208
    .line 209
    return p0

    .line 210
    :sswitch_44
    sget p0, LE3/P6;->S:I

    .line 211
    .line 212
    return p0

    .line 213
    :sswitch_45
    sget p0, LE3/P6;->k:I

    .line 214
    .line 215
    return p0

    .line 216
    :sswitch_46
    sget p0, LE3/P6;->i:I

    .line 217
    .line 218
    return p0

    .line 219
    :sswitch_47
    sget p0, LE3/P6;->b:I

    .line 220
    .line 221
    return p0

    .line 222
    :sswitch_48
    sget p0, LE3/P6;->a:I

    .line 223
    .line 224
    return p0

    .line 225
    :sswitch_data_0
    .sparse-switch
        0xe019 -> :sswitch_48
        0xe01a -> :sswitch_47
        0xe01c -> :sswitch_46
        0xe01f -> :sswitch_45
        0xe020 -> :sswitch_44
        0xe034 -> :sswitch_43
        0xe037 -> :sswitch_42
        0xe03b -> :sswitch_41
        0xe040 -> :sswitch_40
        0xe041 -> :sswitch_3f
        0xe042 -> :sswitch_3e
        0xe043 -> :sswitch_3d
        0xe044 -> :sswitch_3c
        0xe045 -> :sswitch_3b
        0xe047 -> :sswitch_3a
        0xe048 -> :sswitch_39
        0xe04d -> :sswitch_38
        0xe04f -> :sswitch_37
        0xe050 -> :sswitch_36
        0xe056 -> :sswitch_35
        0xe057 -> :sswitch_34
        0xe058 -> :sswitch_33
        0xe059 -> :sswitch_32
        0xe05a -> :sswitch_31
        0xe05b -> :sswitch_30
        0xe05c -> :sswitch_2f
        0xe066 -> :sswitch_2e
        0xe067 -> :sswitch_2d
        0xe068 -> :sswitch_2c
        0xe0e5 -> :sswitch_2b
        0xe145 -> :sswitch_2a
        0xe147 -> :sswitch_29
        0xe14b -> :sswitch_28
        0xe153 -> :sswitch_27
        0xe15b -> :sswitch_26
        0xe429 -> :sswitch_25
        0xe51e -> :sswitch_24
        0xe627 -> :sswitch_23
        0xe80d -> :sswitch_22
        0xe838 -> :sswitch_21
        0xe866 -> :sswitch_20
        0xe86c -> :sswitch_1f
        0xe87d -> :sswitch_1e
        0xe8b8 -> :sswitch_1d
        0xe8db -> :sswitch_1c
        0xe8dc -> :sswitch_1b
        0xeb80 -> :sswitch_1a
        0xef72 -> :sswitch_19
        0xefcd -> :sswitch_18
        0xf048 -> :sswitch_17
        0xf1dc -> :sswitch_16
        0xf4e0 -> :sswitch_15
        0xf4e1 -> :sswitch_14
        0xf4e2 -> :sswitch_13
        0xf4eb -> :sswitch_12
        0xf6f4 -> :sswitch_11
        0xfe040 -> :sswitch_10
        0xfe043 -> :sswitch_f
        0xfe044 -> :sswitch_e
        0xfe056 -> :sswitch_d
        0xfe059 -> :sswitch_c
        0xfe147 -> :sswitch_b
        0xfe148 -> :sswitch_a
        0xfe149 -> :sswitch_9
        0xfe153 -> :sswitch_8
        0xfe838 -> :sswitch_7
        0xfe866 -> :sswitch_6
        0xfe86c -> :sswitch_5
        0xfe87d -> :sswitch_4
        0xfe8db -> :sswitch_3
        0xfe8dc -> :sswitch_2
        0xff4e0 -> :sswitch_1
        0xff4e2 -> :sswitch_0
    .end sparse-switch
.end method

.method static i(Ljava/util/List;Lq2/P$b;Landroid/os/Bundle;)LP9/u;
    .locals 7

    .line 1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 v0, 0x7

    .line 13
    const/4 v1, 0x6

    .line 14
    filled-new-array {v0, v1}, [I

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p1, v0}, Lq2/P$b;->d([I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/16 v2, 0x9

    .line 23
    .line 24
    const/16 v3, 0x8

    .line 25
    .line 26
    filled-new-array {v2, v3}, [I

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {p1, v2}, Lq2/P$b;->d([I)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    const-string v2, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS"

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-virtual {p2, v2, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const-string v4, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"

    .line 42
    .line 43
    invoke-virtual {p2, v4, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    const/4 v4, -0x1

    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move v0, v3

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    :goto_0
    move v0, v4

    .line 56
    :goto_1
    if-nez p1, :cond_5

    .line 57
    .line 58
    if-eqz p2, :cond_3

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    if-nez v0, :cond_4

    .line 62
    .line 63
    const/4 p1, 0x1

    .line 64
    goto :goto_3

    .line 65
    :cond_4
    move p1, v3

    .line 66
    goto :goto_3

    .line 67
    :cond_5
    :goto_2
    move p1, v4

    .line 68
    :goto_3
    invoke-static {}, LP9/u;->t()LP9/u$a;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    :goto_4
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-ge v3, v2, :cond_9

    .line 77
    .line 78
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, LE3/b;

    .line 83
    .line 84
    const/4 v5, 0x3

    .line 85
    if-ne v3, v0, :cond_7

    .line 86
    .line 87
    const/4 v6, 0x2

    .line 88
    if-ne p1, v4, :cond_6

    .line 89
    .line 90
    invoke-static {v6, v1}, LS9/e;->i(II)LS9/e;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-virtual {v2, v5}, LE3/b;->c(LS9/e;)LE3/b;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {p2, v2}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 99
    .line 100
    .line 101
    goto :goto_5

    .line 102
    :cond_6
    invoke-static {v6, v5, v1}, LS9/e;->j(III)LS9/e;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-virtual {v2, v5}, LE3/b;->c(LS9/e;)LE3/b;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {p2, v2}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 111
    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_7
    if-ne v3, p1, :cond_8

    .line 115
    .line 116
    invoke-static {v5, v1}, LS9/e;->i(II)LS9/e;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-virtual {v2, v5}, LE3/b;->c(LS9/e;)LE3/b;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {p2, v2}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 125
    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_8
    invoke-static {v1}, LS9/e;->h(I)LS9/e;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-virtual {v2, v5}, LE3/b;->c(LS9/e;)LE3/b;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {p2, v2}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 137
    .line 138
    .line 139
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_9
    invoke-virtual {p2}, LP9/u$a;->k()LP9/u;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    return-object p0
.end method

.method static j(LE3/b;LE3/U6;Lq2/P$b;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LE3/b;->a:LE3/T6;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1, v0}, LE3/U6;->c(LE3/T6;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    :cond_0
    iget p0, p0, LE3/b;->b:I

    .line 12
    .line 13
    const/4 p1, -0x1

    .line 14
    if-eq p0, p1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p2, p0}, Lq2/P$b;->c(I)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    :cond_1
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_2
    const/4 p0, 0x0

    .line 25
    return p0
.end method


# virtual methods
.method b(Z)LE3/b;
    .locals 11

    .line 1
    iget-boolean v0, p0, LE3/b;->i:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v1, LE3/b;

    .line 7
    .line 8
    iget-object v2, p0, LE3/b;->a:LE3/T6;

    .line 9
    .line 10
    iget v3, p0, LE3/b;->b:I

    .line 11
    .line 12
    iget v4, p0, LE3/b;->c:I

    .line 13
    .line 14
    iget v5, p0, LE3/b;->d:I

    .line 15
    .line 16
    iget-object v6, p0, LE3/b;->e:Landroid/net/Uri;

    .line 17
    .line 18
    iget-object v7, p0, LE3/b;->f:Ljava/lang/CharSequence;

    .line 19
    .line 20
    new-instance v8, Landroid/os/Bundle;

    .line 21
    .line 22
    iget-object v0, p0, LE3/b;->g:Landroid/os/Bundle;

    .line 23
    .line 24
    invoke-direct {v8, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    iget-object v10, p0, LE3/b;->h:LS9/e;

    .line 28
    .line 29
    move v9, p1

    .line 30
    invoke-direct/range {v1 .. v10}, LE3/b;-><init>(LE3/T6;IIILandroid/net/Uri;Ljava/lang/CharSequence;Landroid/os/Bundle;ZLS9/e;)V

    .line 31
    .line 32
    .line 33
    return-object v1
.end method

.method c(LS9/e;)LE3/b;
    .locals 11

    .line 1
    iget-object v0, p0, LE3/b;->h:LS9/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LS9/e;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v1, LE3/b;

    .line 11
    .line 12
    iget-object v2, p0, LE3/b;->a:LE3/T6;

    .line 13
    .line 14
    iget v3, p0, LE3/b;->b:I

    .line 15
    .line 16
    iget v4, p0, LE3/b;->c:I

    .line 17
    .line 18
    iget v5, p0, LE3/b;->d:I

    .line 19
    .line 20
    iget-object v6, p0, LE3/b;->e:Landroid/net/Uri;

    .line 21
    .line 22
    iget-object v7, p0, LE3/b;->f:Ljava/lang/CharSequence;

    .line 23
    .line 24
    new-instance v8, Landroid/os/Bundle;

    .line 25
    .line 26
    iget-object v0, p0, LE3/b;->g:Landroid/os/Bundle;

    .line 27
    .line 28
    invoke-direct {v8, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 29
    .line 30
    .line 31
    iget-boolean v9, p0, LE3/b;->i:Z

    .line 32
    .line 33
    move-object v10, p1

    .line 34
    invoke-direct/range {v1 .. v10}, LE3/b;-><init>(LE3/T6;IIILandroid/net/Uri;Ljava/lang/CharSequence;Landroid/os/Bundle;ZLS9/e;)V

    .line 35
    .line 36
    .line 37
    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, LE3/b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, LE3/b;

    .line 12
    .line 13
    iget-object v1, p0, LE3/b;->a:LE3/T6;

    .line 14
    .line 15
    iget-object v3, p1, LE3/b;->a:LE3/T6;

    .line 16
    .line 17
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget v1, p0, LE3/b;->b:I

    .line 24
    .line 25
    iget v3, p1, LE3/b;->b:I

    .line 26
    .line 27
    if-ne v1, v3, :cond_2

    .line 28
    .line 29
    iget v1, p0, LE3/b;->c:I

    .line 30
    .line 31
    iget v3, p1, LE3/b;->c:I

    .line 32
    .line 33
    if-ne v1, v3, :cond_2

    .line 34
    .line 35
    iget v1, p0, LE3/b;->d:I

    .line 36
    .line 37
    iget v3, p1, LE3/b;->d:I

    .line 38
    .line 39
    if-ne v1, v3, :cond_2

    .line 40
    .line 41
    iget-object v1, p0, LE3/b;->e:Landroid/net/Uri;

    .line 42
    .line 43
    iget-object v3, p1, LE3/b;->e:Landroid/net/Uri;

    .line 44
    .line 45
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    iget-object v1, p0, LE3/b;->f:Ljava/lang/CharSequence;

    .line 52
    .line 53
    iget-object v3, p1, LE3/b;->f:Ljava/lang/CharSequence;

    .line 54
    .line 55
    invoke-static {v1, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    iget-boolean v1, p0, LE3/b;->i:Z

    .line 62
    .line 63
    iget-boolean v3, p1, LE3/b;->i:Z

    .line 64
    .line 65
    if-ne v1, v3, :cond_2

    .line 66
    .line 67
    iget-object v1, p0, LE3/b;->h:LS9/e;

    .line 68
    .line 69
    iget-object p1, p1, LE3/b;->h:LS9/e;

    .line 70
    .line 71
    invoke-virtual {v1, p1}, LS9/e;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_2

    .line 76
    .line 77
    return v0

    .line 78
    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 8

    .line 1
    iget-object v0, p0, LE3/b;->a:LE3/T6;

    .line 2
    .line 3
    iget v1, p0, LE3/b;->b:I

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, LE3/b;->c:I

    .line 10
    .line 11
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget v3, p0, LE3/b;->d:I

    .line 16
    .line 17
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v4, p0, LE3/b;->f:Ljava/lang/CharSequence;

    .line 22
    .line 23
    iget-boolean v5, p0, LE3/b;->i:Z

    .line 24
    .line 25
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    iget-object v6, p0, LE3/b;->e:Landroid/net/Uri;

    .line 30
    .line 31
    iget-object v7, p0, LE3/b;->h:LS9/e;

    .line 32
    .line 33
    filled-new-array/range {v0 .. v7}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    return v0
.end method

.method public k()Landroid/os/Bundle;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LE3/b;->a:LE3/T6;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    sget-object v2, LE3/b;->j:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1}, LE3/T6;->b()Landroid/os/Bundle;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget v1, p0, LE3/b;->b:I

    .line 20
    .line 21
    const/4 v2, -0x1

    .line 22
    if-eq v1, v2, :cond_1

    .line 23
    .line 24
    sget-object v2, LE3/b;->k:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget v1, p0, LE3/b;->c:I

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    sget-object v2, LE3/b;->q:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iget v1, p0, LE3/b;->d:I

    .line 39
    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    sget-object v2, LE3/b;->l:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    :cond_3
    iget-object v1, p0, LE3/b;->f:Ljava/lang/CharSequence;

    .line 48
    .line 49
    const-string v2, ""

    .line 50
    .line 51
    if-eq v1, v2, :cond_4

    .line 52
    .line 53
    sget-object v2, LE3/b;->m:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    :cond_4
    iget-object v1, p0, LE3/b;->g:Landroid/os/Bundle;

    .line 59
    .line 60
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_5

    .line 65
    .line 66
    sget-object v1, LE3/b;->n:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v2, p0, LE3/b;->g:Landroid/os/Bundle;

    .line 69
    .line 70
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 71
    .line 72
    .line 73
    :cond_5
    iget-object v1, p0, LE3/b;->e:Landroid/net/Uri;

    .line 74
    .line 75
    if-eqz v1, :cond_6

    .line 76
    .line 77
    sget-object v2, LE3/b;->p:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 80
    .line 81
    .line 82
    :cond_6
    iget-boolean v1, p0, LE3/b;->i:Z

    .line 83
    .line 84
    if-nez v1, :cond_7

    .line 85
    .line 86
    sget-object v2, LE3/b;->o:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 89
    .line 90
    .line 91
    :cond_7
    iget-object v1, p0, LE3/b;->h:LS9/e;

    .line 92
    .line 93
    invoke-virtual {v1}, LS9/e;->f()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    const/4 v2, 0x1

    .line 98
    if-ne v1, v2, :cond_9

    .line 99
    .line 100
    iget-object v1, p0, LE3/b;->h:LS9/e;

    .line 101
    .line 102
    const/4 v2, 0x0

    .line 103
    invoke-virtual {v1, v2}, LS9/e;->c(I)I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    const/4 v2, 0x6

    .line 108
    if-eq v1, v2, :cond_8

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_8
    return-object v0

    .line 112
    :cond_9
    :goto_0
    sget-object v1, LE3/b;->r:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v2, p0, LE3/b;->h:LS9/e;

    .line 115
    .line 116
    invoke-virtual {v2}, LS9/e;->k()[I

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 121
    .line 122
    .line 123
    return-object v0
.end method
