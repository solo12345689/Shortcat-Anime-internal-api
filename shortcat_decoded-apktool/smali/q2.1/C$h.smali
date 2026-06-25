.class public final Lq2/C$h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# static fields
.field private static final k:Ljava/lang/String;

.field private static final l:Ljava/lang/String;

.field private static final m:Ljava/lang/String;

.field private static final n:Ljava/lang/String;

.field private static final o:Ljava/lang/String;

.field private static final p:Ljava/lang/String;

.field private static final q:Ljava/lang/String;

.field private static final r:Ljava/lang/String;


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Ljava/lang/String;

.field public final c:Lq2/C$f;

.field public final d:Lq2/C$b;

.field public final e:Ljava/util/List;

.field public final f:Ljava/lang/String;

.field public final g:LP9/u;

.field public final h:Ljava/util/List;

.field public final i:Ljava/lang/Object;

.field public final j:J


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
    sput-object v0, Lq2/C$h;->k:Ljava/lang/String;

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
    sput-object v0, Lq2/C$h;->l:Ljava/lang/String;

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
    sput-object v0, Lq2/C$h;->m:Ljava/lang/String;

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
    sput-object v0, Lq2/C$h;->n:Ljava/lang/String;

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
    sput-object v0, Lq2/C$h;->o:Ljava/lang/String;

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
    sput-object v0, Lq2/C$h;->p:Ljava/lang/String;

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
    sput-object v0, Lq2/C$h;->q:Ljava/lang/String;

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
    sput-object v0, Lq2/C$h;->r:Ljava/lang/String;

    .line 56
    .line 57
    return-void
.end method

.method private constructor <init>(Landroid/net/Uri;Ljava/lang/String;Lq2/C$f;Lq2/C$b;Ljava/util/List;Ljava/lang/String;LP9/u;Ljava/lang/Object;J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lq2/C$h;->a:Landroid/net/Uri;

    .line 4
    invoke-static {p2}, Lq2/K;->u(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lq2/C$h;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lq2/C$h;->c:Lq2/C$f;

    .line 6
    iput-object p4, p0, Lq2/C$h;->d:Lq2/C$b;

    .line 7
    iput-object p5, p0, Lq2/C$h;->e:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lq2/C$h;->f:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lq2/C$h;->g:LP9/u;

    .line 10
    invoke-static {}, LP9/u;->t()LP9/u$a;

    move-result-object p1

    const/4 p2, 0x0

    .line 11
    :goto_0
    invoke-virtual {p7}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    if-ge p2, p3, :cond_0

    .line 12
    invoke-interface {p7, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lq2/C$k;

    invoke-virtual {p3}, Lq2/C$k;->a()Lq2/C$k$a;

    move-result-object p3

    invoke-static {p3}, Lq2/C$k$a;->a(Lq2/C$k$a;)Lq2/C$j;

    move-result-object p3

    invoke-virtual {p1, p3}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, LP9/u$a;->k()LP9/u;

    move-result-object p1

    iput-object p1, p0, Lq2/C$h;->h:Ljava/util/List;

    .line 14
    iput-object p8, p0, Lq2/C$h;->i:Ljava/lang/Object;

    .line 15
    iput-wide p9, p0, Lq2/C$h;->j:J

    return-void
.end method

.method synthetic constructor <init>(Landroid/net/Uri;Ljava/lang/String;Lq2/C$f;Lq2/C$b;Ljava/util/List;Ljava/lang/String;LP9/u;Ljava/lang/Object;JLq2/C$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p10}, Lq2/C$h;-><init>(Landroid/net/Uri;Ljava/lang/String;Lq2/C$f;Lq2/C$b;Ljava/util/List;Ljava/lang/String;LP9/u;Ljava/lang/Object;J)V

    return-void
.end method

.method public static a(Landroid/os/Bundle;)Lq2/C$h;
    .locals 13

    .line 1
    sget-object v0, Lq2/C$h;->m:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    move-object v5, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {v0}, Lq2/C$f;->c(Landroid/os/Bundle;)Lq2/C$f;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v5, v0

    .line 17
    :goto_0
    sget-object v0, Lq2/C$h;->n:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    :goto_1
    move-object v6, v1

    .line 26
    goto :goto_2

    .line 27
    :cond_1
    invoke-static {v0}, Lq2/C$b;->a(Landroid/os/Bundle;)Lq2/C$b;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    goto :goto_1

    .line 32
    :goto_2
    sget-object v0, Lq2/C$h;->o:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_3
    move-object v7, v0

    .line 45
    goto :goto_4

    .line 46
    :cond_2
    new-instance v1, Lq2/F;

    .line 47
    .line 48
    invoke-direct {v1}, Lq2/F;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v0}, Lt2/i;->d(LO9/f;Ljava/util/List;)LP9/u;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    goto :goto_3

    .line 56
    :goto_4
    sget-object v0, Lq2/C$h;->q:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-nez v0, :cond_3

    .line 63
    .line 64
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :goto_5
    move-object v9, v0

    .line 69
    goto :goto_6

    .line 70
    :cond_3
    new-instance v1, Lq2/G;

    .line 71
    .line 72
    invoke-direct {v1}, Lq2/G;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-static {v1, v0}, Lt2/i;->d(LO9/f;Ljava/util/List;)LP9/u;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    goto :goto_5

    .line 80
    :goto_6
    sget-object v0, Lq2/C$h;->r:Ljava/lang/String;

    .line 81
    .line 82
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 88
    .line 89
    .line 90
    move-result-wide v11

    .line 91
    new-instance v2, Lq2/C$h;

    .line 92
    .line 93
    sget-object v0, Lq2/C$h;->k:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Landroid/net/Uri;

    .line 100
    .line 101
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    move-object v3, v0

    .line 106
    check-cast v3, Landroid/net/Uri;

    .line 107
    .line 108
    sget-object v0, Lq2/C$h;->l:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    sget-object v0, Lq2/C$h;->p:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    const/4 v10, 0x0

    .line 121
    invoke-direct/range {v2 .. v12}, Lq2/C$h;-><init>(Landroid/net/Uri;Ljava/lang/String;Lq2/C$f;Lq2/C$b;Ljava/util/List;Ljava/lang/String;LP9/u;Ljava/lang/Object;J)V

    .line 122
    .line 123
    .line 124
    return-object v2
.end method


# virtual methods
.method public b()Landroid/os/Bundle;
    .locals 5

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lq2/C$h;->k:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v2, p0, Lq2/C$h;->a:Landroid/net/Uri;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lq2/C$h;->b:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    sget-object v2, Lq2/C$h;->l:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v1, p0, Lq2/C$h;->c:Lq2/C$f;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    sget-object v2, Lq2/C$h;->m:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1}, Lq2/C$f;->e()Landroid/os/Bundle;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    iget-object v1, p0, Lq2/C$h;->d:Lq2/C$b;

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    sget-object v2, Lq2/C$h;->n:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v1}, Lq2/C$b;->b()Landroid/os/Bundle;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    iget-object v1, p0, Lq2/C$h;->e:Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    sget-object v1, Lq2/C$h;->o:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v2, p0, Lq2/C$h;->e:Ljava/util/List;

    .line 59
    .line 60
    new-instance v3, Lq2/D;

    .line 61
    .line 62
    invoke-direct {v3}, Lq2/D;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-static {v2, v3}, Lt2/i;->h(Ljava/util/Collection;LO9/f;)Ljava/util/ArrayList;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    iget-object v1, p0, Lq2/C$h;->f:Ljava/lang/String;

    .line 73
    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    sget-object v2, Lq2/C$h;->p:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    iget-object v1, p0, Lq2/C$h;->g:LP9/u;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_5

    .line 88
    .line 89
    sget-object v1, Lq2/C$h;->q:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v2, p0, Lq2/C$h;->g:LP9/u;

    .line 92
    .line 93
    new-instance v3, Lq2/E;

    .line 94
    .line 95
    invoke-direct {v3}, Lq2/E;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-static {v2, v3}, Lt2/i;->h(Ljava/util/Collection;LO9/f;)Ljava/util/ArrayList;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 103
    .line 104
    .line 105
    :cond_5
    iget-wide v1, p0, Lq2/C$h;->j:J

    .line 106
    .line 107
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    cmp-long v3, v1, v3

    .line 113
    .line 114
    if-eqz v3, :cond_6

    .line 115
    .line 116
    sget-object v3, Lq2/C$h;->r:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v0, v3, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 119
    .line 120
    .line 121
    :cond_6
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lq2/C$h;

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
    check-cast p1, Lq2/C$h;

    .line 12
    .line 13
    iget-object v1, p0, Lq2/C$h;->a:Landroid/net/Uri;

    .line 14
    .line 15
    iget-object v3, p1, Lq2/C$h;->a:Landroid/net/Uri;

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lq2/C$h;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v3, p1, Lq2/C$h;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-object v1, p0, Lq2/C$h;->c:Lq2/C$f;

    .line 34
    .line 35
    iget-object v3, p1, Lq2/C$h;->c:Lq2/C$f;

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
    iget-object v1, p0, Lq2/C$h;->d:Lq2/C$b;

    .line 44
    .line 45
    iget-object v3, p1, Lq2/C$h;->d:Lq2/C$b;

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
    iget-object v1, p0, Lq2/C$h;->e:Ljava/util/List;

    .line 54
    .line 55
    iget-object v3, p1, Lq2/C$h;->e:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    iget-object v1, p0, Lq2/C$h;->f:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v3, p1, Lq2/C$h;->f:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    iget-object v1, p0, Lq2/C$h;->g:LP9/u;

    .line 74
    .line 75
    iget-object v3, p1, Lq2/C$h;->g:LP9/u;

    .line 76
    .line 77
    invoke-virtual {v1, v3}, LP9/u;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    iget-object v1, p0, Lq2/C$h;->i:Ljava/lang/Object;

    .line 84
    .line 85
    iget-object v3, p1, Lq2/C$h;->i:Ljava/lang/Object;

    .line 86
    .line 87
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_2

    .line 92
    .line 93
    iget-wide v3, p0, Lq2/C$h;->j:J

    .line 94
    .line 95
    iget-wide v5, p1, Lq2/C$h;->j:J

    .line 96
    .line 97
    cmp-long p1, v3, v5

    .line 98
    .line 99
    if-nez p1, :cond_2

    .line 100
    .line 101
    return v0

    .line 102
    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lq2/C$h;->a:Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/net/Uri;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lq2/C$h;->b:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    move v1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    :goto_0
    add-int/2addr v0, v1

    .line 21
    mul-int/lit8 v0, v0, 0x1f

    .line 22
    .line 23
    iget-object v1, p0, Lq2/C$h;->c:Lq2/C$f;

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    move v1, v2

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v1}, Lq2/C$f;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    :goto_1
    add-int/2addr v0, v1

    .line 34
    mul-int/lit8 v0, v0, 0x1f

    .line 35
    .line 36
    iget-object v1, p0, Lq2/C$h;->d:Lq2/C$b;

    .line 37
    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    move v1, v2

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    invoke-virtual {v1}, Lq2/C$b;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    :goto_2
    add-int/2addr v0, v1

    .line 47
    mul-int/lit8 v0, v0, 0x1f

    .line 48
    .line 49
    iget-object v1, p0, Lq2/C$h;->e:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    add-int/2addr v0, v1

    .line 56
    mul-int/lit8 v0, v0, 0x1f

    .line 57
    .line 58
    iget-object v1, p0, Lq2/C$h;->f:Ljava/lang/String;

    .line 59
    .line 60
    if-nez v1, :cond_3

    .line 61
    .line 62
    move v1, v2

    .line 63
    goto :goto_3

    .line 64
    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    :goto_3
    add-int/2addr v0, v1

    .line 69
    mul-int/lit8 v0, v0, 0x1f

    .line 70
    .line 71
    iget-object v1, p0, Lq2/C$h;->g:LP9/u;

    .line 72
    .line 73
    invoke-virtual {v1}, LP9/u;->hashCode()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    add-int/2addr v0, v1

    .line 78
    mul-int/lit8 v0, v0, 0x1f

    .line 79
    .line 80
    iget-object v1, p0, Lq2/C$h;->i:Ljava/lang/Object;

    .line 81
    .line 82
    if-nez v1, :cond_4

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    :goto_4
    add-int/2addr v0, v2

    .line 90
    const-wide/16 v1, 0x1f

    .line 91
    .line 92
    int-to-long v3, v0

    .line 93
    mul-long/2addr v3, v1

    .line 94
    iget-wide v0, p0, Lq2/C$h;->j:J

    .line 95
    .line 96
    add-long/2addr v3, v0

    .line 97
    long-to-int v0, v3

    .line 98
    return v0
.end method
