.class public final Lq2/C;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq2/C$e;,
        Lq2/C$h;,
        Lq2/C$g;,
        Lq2/C$i;,
        Lq2/C$c;,
        Lq2/C$d;,
        Lq2/C$j;,
        Lq2/C$k;,
        Lq2/C$b;,
        Lq2/C$f;
    }
.end annotation


# static fields
.field public static final i:Lq2/C;

.field private static final j:Ljava/lang/String;

.field private static final k:Ljava/lang/String;

.field private static final l:Ljava/lang/String;

.field private static final m:Ljava/lang/String;

.field private static final n:Ljava/lang/String;

.field private static final o:Ljava/lang/String;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lq2/C$h;

.field public final c:Lq2/C$h;

.field public final d:Lq2/C$g;

.field public final e:Lq2/I;

.field public final f:Lq2/C$d;

.field public final g:Lq2/C$e;

.field public final h:Lq2/C$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lq2/C$c;

    .line 2
    .line 3
    invoke-direct {v0}, Lq2/C$c;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lq2/C$c;->a()Lq2/C;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lq2/C;->i:Lq2/C;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lq2/C;->j:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lq2/C;->k:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lq2/C;->l:Ljava/lang/String;

    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lq2/C;->m:Ljava/lang/String;

    .line 39
    .line 40
    const/4 v0, 0x4

    .line 41
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lq2/C;->n:Ljava/lang/String;

    .line 46
    .line 47
    const/4 v0, 0x5

    .line 48
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, Lq2/C;->o:Ljava/lang/String;

    .line 53
    .line 54
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lq2/C$e;Lq2/C$h;Lq2/C$g;Lq2/I;Lq2/C$i;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lq2/C;->a:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lq2/C;->b:Lq2/C$h;

    .line 5
    iput-object p3, p0, Lq2/C;->c:Lq2/C$h;

    .line 6
    iput-object p4, p0, Lq2/C;->d:Lq2/C$g;

    .line 7
    iput-object p5, p0, Lq2/C;->e:Lq2/I;

    .line 8
    iput-object p2, p0, Lq2/C;->f:Lq2/C$d;

    .line 9
    iput-object p2, p0, Lq2/C;->g:Lq2/C$e;

    .line 10
    iput-object p6, p0, Lq2/C;->h:Lq2/C$i;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lq2/C$e;Lq2/C$h;Lq2/C$g;Lq2/I;Lq2/C$i;Lq2/C$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lq2/C;-><init>(Ljava/lang/String;Lq2/C$e;Lq2/C$h;Lq2/C$g;Lq2/I;Lq2/C$i;)V

    return-void
.end method

.method public static b(Landroid/os/Bundle;)Lq2/C;
    .locals 8

    .line 1
    sget-object v0, Lq2/C;->j:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    move-object v2, v0

    .line 14
    check-cast v2, Ljava/lang/String;

    .line 15
    .line 16
    sget-object v0, Lq2/C;->k:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    sget-object v0, Lq2/C$g;->f:Lq2/C$g;

    .line 25
    .line 26
    :goto_0
    move-object v5, v0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-static {v0}, Lq2/C$g;->b(Landroid/os/Bundle;)Lq2/C$g;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    goto :goto_0

    .line 33
    :goto_1
    sget-object v0, Lq2/C;->l:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    sget-object v0, Lq2/I;->K:Lq2/I;

    .line 42
    .line 43
    :goto_2
    move-object v6, v0

    .line 44
    goto :goto_3

    .line 45
    :cond_1
    invoke-static {v0}, Lq2/I;->b(Landroid/os/Bundle;)Lq2/I;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    goto :goto_2

    .line 50
    :goto_3
    sget-object v0, Lq2/C;->m:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    sget-object v0, Lq2/C$e;->r:Lq2/C$e;

    .line 59
    .line 60
    :goto_4
    move-object v3, v0

    .line 61
    goto :goto_5

    .line 62
    :cond_2
    invoke-static {v0}, Lq2/C$d;->b(Landroid/os/Bundle;)Lq2/C$e;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    goto :goto_4

    .line 67
    :goto_5
    sget-object v0, Lq2/C;->n:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-nez v0, :cond_3

    .line 74
    .line 75
    sget-object v0, Lq2/C$i;->d:Lq2/C$i;

    .line 76
    .line 77
    :goto_6
    move-object v7, v0

    .line 78
    goto :goto_7

    .line 79
    :cond_3
    invoke-static {v0}, Lq2/C$i;->a(Landroid/os/Bundle;)Lq2/C$i;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    goto :goto_6

    .line 84
    :goto_7
    sget-object v0, Lq2/C;->o:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    if-nez p0, :cond_4

    .line 91
    .line 92
    const/4 p0, 0x0

    .line 93
    :goto_8
    move-object v4, p0

    .line 94
    goto :goto_9

    .line 95
    :cond_4
    invoke-static {p0}, Lq2/C$h;->a(Landroid/os/Bundle;)Lq2/C$h;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    goto :goto_8

    .line 100
    :goto_9
    new-instance v1, Lq2/C;

    .line 101
    .line 102
    invoke-direct/range {v1 .. v7}, Lq2/C;-><init>(Ljava/lang/String;Lq2/C$e;Lq2/C$h;Lq2/C$g;Lq2/I;Lq2/C$i;)V

    .line 103
    .line 104
    .line 105
    return-object v1
.end method

.method public static c(Landroid/net/Uri;)Lq2/C;
    .locals 1

    .line 1
    new-instance v0, Lq2/C$c;

    .line 2
    .line 3
    invoke-direct {v0}, Lq2/C$c;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lq2/C$c;->j(Landroid/net/Uri;)Lq2/C$c;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lq2/C$c;->a()Lq2/C;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static d(Ljava/lang/String;)Lq2/C;
    .locals 1

    .line 1
    new-instance v0, Lq2/C$c;

    .line 2
    .line 3
    invoke-direct {v0}, Lq2/C$c;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lq2/C$c;->k(Ljava/lang/String;)Lq2/C$c;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lq2/C$c;->a()Lq2/C;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method private f(Z)Landroid/os/Bundle;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lq2/C;->a:Ljava/lang/String;

    .line 7
    .line 8
    const-string v2, ""

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    sget-object v1, Lq2/C;->j:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v2, p0, Lq2/C;->a:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v1, p0, Lq2/C;->d:Lq2/C$g;

    .line 24
    .line 25
    sget-object v2, Lq2/C$g;->f:Lq2/C$g;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Lq2/C$g;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    sget-object v1, Lq2/C;->k:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v2, p0, Lq2/C;->d:Lq2/C$g;

    .line 36
    .line 37
    invoke-virtual {v2}, Lq2/C$g;->c()Landroid/os/Bundle;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    iget-object v1, p0, Lq2/C;->e:Lq2/I;

    .line 45
    .line 46
    sget-object v2, Lq2/I;->K:Lq2/I;

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Lq2/I;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    sget-object v1, Lq2/C;->l:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v2, p0, Lq2/C;->e:Lq2/I;

    .line 57
    .line 58
    invoke-virtual {v2}, Lq2/I;->e()Landroid/os/Bundle;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    iget-object v1, p0, Lq2/C;->f:Lq2/C$d;

    .line 66
    .line 67
    sget-object v2, Lq2/C$d;->i:Lq2/C$d;

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Lq2/C$d;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_3

    .line 74
    .line 75
    sget-object v1, Lq2/C;->m:Ljava/lang/String;

    .line 76
    .line 77
    iget-object v2, p0, Lq2/C;->f:Lq2/C$d;

    .line 78
    .line 79
    invoke-virtual {v2}, Lq2/C$d;->c()Landroid/os/Bundle;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 84
    .line 85
    .line 86
    :cond_3
    iget-object v1, p0, Lq2/C;->h:Lq2/C$i;

    .line 87
    .line 88
    sget-object v2, Lq2/C$i;->d:Lq2/C$i;

    .line 89
    .line 90
    invoke-virtual {v1, v2}, Lq2/C$i;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    sget-object v1, Lq2/C;->n:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v2, p0, Lq2/C;->h:Lq2/C$i;

    .line 99
    .line 100
    invoke-virtual {v2}, Lq2/C$i;->b()Landroid/os/Bundle;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 105
    .line 106
    .line 107
    :cond_4
    if-eqz p1, :cond_5

    .line 108
    .line 109
    iget-object p1, p0, Lq2/C;->b:Lq2/C$h;

    .line 110
    .line 111
    if-eqz p1, :cond_5

    .line 112
    .line 113
    sget-object v1, Lq2/C;->o:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {p1}, Lq2/C$h;->b()Landroid/os/Bundle;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 120
    .line 121
    .line 122
    :cond_5
    return-object v0
.end method


# virtual methods
.method public a()Lq2/C$c;
    .locals 2

    .line 1
    new-instance v0, Lq2/C$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lq2/C$c;-><init>(Lq2/C;Lq2/C$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public e()Landroid/os/Bundle;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lq2/C;->f(Z)Landroid/os/Bundle;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
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
    instance-of v1, p1, Lq2/C;

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
    check-cast p1, Lq2/C;

    .line 12
    .line 13
    iget-object v1, p0, Lq2/C;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lq2/C;->a:Ljava/lang/String;

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
    iget-object v1, p0, Lq2/C;->f:Lq2/C$d;

    .line 24
    .line 25
    iget-object v3, p1, Lq2/C;->f:Lq2/C$d;

    .line 26
    .line 27
    invoke-virtual {v1, v3}, Lq2/C$d;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-object v1, p0, Lq2/C;->b:Lq2/C$h;

    .line 34
    .line 35
    iget-object v3, p1, Lq2/C;->b:Lq2/C$h;

    .line 36
    .line 37
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    iget-object v1, p0, Lq2/C;->d:Lq2/C$g;

    .line 44
    .line 45
    iget-object v3, p1, Lq2/C;->d:Lq2/C$g;

    .line 46
    .line 47
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    iget-object v1, p0, Lq2/C;->e:Lq2/I;

    .line 54
    .line 55
    iget-object v3, p1, Lq2/C;->e:Lq2/I;

    .line 56
    .line 57
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    iget-object v1, p0, Lq2/C;->h:Lq2/C$i;

    .line 64
    .line 65
    iget-object p1, p1, Lq2/C;->h:Lq2/C$i;

    .line 66
    .line 67
    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    return v0

    .line 74
    :cond_2
    return v2
.end method

.method public g()Landroid/os/Bundle;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lq2/C;->f(Z)Landroid/os/Bundle;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lq2/C;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lq2/C;->b:Lq2/C$h;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Lq2/C$h;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    add-int/2addr v0, v1

    .line 20
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    iget-object v1, p0, Lq2/C;->d:Lq2/C$g;

    .line 23
    .line 24
    invoke-virtual {v1}, Lq2/C$g;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v0, v1

    .line 29
    mul-int/lit8 v0, v0, 0x1f

    .line 30
    .line 31
    iget-object v1, p0, Lq2/C;->f:Lq2/C$d;

    .line 32
    .line 33
    invoke-virtual {v1}, Lq2/C$d;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/2addr v0, v1

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-object v1, p0, Lq2/C;->e:Lq2/I;

    .line 41
    .line 42
    invoke-virtual {v1}, Lq2/I;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr v0, v1

    .line 47
    mul-int/lit8 v0, v0, 0x1f

    .line 48
    .line 49
    iget-object v1, p0, Lq2/C;->h:Lq2/C$i;

    .line 50
    .line 51
    invoke-virtual {v1}, Lq2/C$i;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    add-int/2addr v0, v1

    .line 56
    return v0
.end method
