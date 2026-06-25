.class public final Lq2/P$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/P;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field static final k:Ljava/lang/String;

.field private static final l:Ljava/lang/String;

.field static final m:Ljava/lang/String;

.field static final n:Ljava/lang/String;

.field static final o:Ljava/lang/String;

.field private static final p:Ljava/lang/String;

.field private static final q:Ljava/lang/String;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:I

.field public final c:I

.field public final d:Lq2/C;

.field public final e:Ljava/lang/Object;

.field public final f:I

.field public final g:J

.field public final h:J

.field public final i:I

.field public final j:I


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
    sput-object v0, Lq2/P$e;->k:Ljava/lang/String;

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
    sput-object v0, Lq2/P$e;->l:Ljava/lang/String;

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
    sput-object v0, Lq2/P$e;->m:Ljava/lang/String;

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
    sput-object v0, Lq2/P$e;->n:Ljava/lang/String;

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
    sput-object v0, Lq2/P$e;->o:Ljava/lang/String;

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
    sput-object v0, Lq2/P$e;->p:Ljava/lang/String;

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
    sput-object v0, Lq2/P$e;->q:Ljava/lang/String;

    .line 49
    .line 50
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;ILq2/C;Ljava/lang/Object;IJJII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq2/P$e;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, Lq2/P$e;->b:I

    .line 7
    .line 8
    iput p2, p0, Lq2/P$e;->c:I

    .line 9
    .line 10
    iput-object p3, p0, Lq2/P$e;->d:Lq2/C;

    .line 11
    .line 12
    iput-object p4, p0, Lq2/P$e;->e:Ljava/lang/Object;

    .line 13
    .line 14
    iput p5, p0, Lq2/P$e;->f:I

    .line 15
    .line 16
    iput-wide p6, p0, Lq2/P$e;->g:J

    .line 17
    .line 18
    iput-wide p8, p0, Lq2/P$e;->h:J

    .line 19
    .line 20
    iput p10, p0, Lq2/P$e;->i:I

    .line 21
    .line 22
    iput p11, p0, Lq2/P$e;->j:I

    .line 23
    .line 24
    return-void
.end method

.method public static c(Landroid/os/Bundle;)Lq2/P$e;
    .locals 14

    .line 1
    sget-object v0, Lq2/P$e;->k:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v4

    .line 8
    sget-object v0, Lq2/P$e;->l:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    :goto_0
    move-object v5, v0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-static {v0}, Lq2/C;->b(Landroid/os/Bundle;)Lq2/C;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :goto_1
    sget-object v0, Lq2/P$e;->m:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    sget-object v0, Lq2/P$e;->n:Ljava/lang/String;

    .line 31
    .line 32
    const-wide/16 v1, 0x0

    .line 33
    .line 34
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide v8

    .line 38
    sget-object v0, Lq2/P$e;->o:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v10

    .line 44
    sget-object v0, Lq2/P$e;->p:Ljava/lang/String;

    .line 45
    .line 46
    const/4 v1, -0x1

    .line 47
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 48
    .line 49
    .line 50
    move-result v12

    .line 51
    sget-object v0, Lq2/P$e;->q:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 54
    .line 55
    .line 56
    move-result v13

    .line 57
    new-instance v2, Lq2/P$e;

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    const/4 v6, 0x0

    .line 61
    invoke-direct/range {v2 .. v13}, Lq2/P$e;-><init>(Ljava/lang/Object;ILq2/C;Ljava/lang/Object;IJJII)V

    .line 62
    .line 63
    .line 64
    return-object v2
.end method


# virtual methods
.method public a(Lq2/P$e;)Z
    .locals 4

    .line 1
    iget v0, p0, Lq2/P$e;->c:I

    .line 2
    .line 3
    iget v1, p1, Lq2/P$e;->c:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lq2/P$e;->f:I

    .line 8
    .line 9
    iget v1, p1, Lq2/P$e;->f:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-wide v0, p0, Lq2/P$e;->g:J

    .line 14
    .line 15
    iget-wide v2, p1, Lq2/P$e;->g:J

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-wide v0, p0, Lq2/P$e;->h:J

    .line 22
    .line 23
    iget-wide v2, p1, Lq2/P$e;->h:J

    .line 24
    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    iget v0, p0, Lq2/P$e;->i:I

    .line 30
    .line 31
    iget v1, p1, Lq2/P$e;->i:I

    .line 32
    .line 33
    if-ne v0, v1, :cond_0

    .line 34
    .line 35
    iget v0, p0, Lq2/P$e;->j:I

    .line 36
    .line 37
    iget v1, p1, Lq2/P$e;->j:I

    .line 38
    .line 39
    if-ne v0, v1, :cond_0

    .line 40
    .line 41
    iget-object v0, p0, Lq2/P$e;->d:Lq2/C;

    .line 42
    .line 43
    iget-object p1, p1, Lq2/P$e;->d:Lq2/C;

    .line 44
    .line 45
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    return p1

    .line 53
    :cond_0
    const/4 p1, 0x0

    .line 54
    return p1
.end method

.method public b(ZZ)Lq2/P$e;
    .locals 14

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lq2/P$e;

    .line 7
    .line 8
    iget-object v1, p0, Lq2/P$e;->a:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    iget v3, p0, Lq2/P$e;->c:I

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move v3, v2

    .line 17
    :goto_0
    if-eqz p1, :cond_2

    .line 18
    .line 19
    iget-object v4, p0, Lq2/P$e;->d:Lq2/C;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    const/4 v4, 0x0

    .line 23
    :goto_1
    iget-object v5, p0, Lq2/P$e;->e:Ljava/lang/Object;

    .line 24
    .line 25
    if-eqz p2, :cond_3

    .line 26
    .line 27
    iget v2, p0, Lq2/P$e;->f:I

    .line 28
    .line 29
    :cond_3
    const-wide/16 v6, 0x0

    .line 30
    .line 31
    if-eqz p1, :cond_4

    .line 32
    .line 33
    iget-wide v8, p0, Lq2/P$e;->g:J

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_4
    move-wide v8, v6

    .line 37
    :goto_2
    if-eqz p1, :cond_5

    .line 38
    .line 39
    iget-wide v6, p0, Lq2/P$e;->h:J

    .line 40
    .line 41
    :cond_5
    const/4 v10, -0x1

    .line 42
    if-eqz p1, :cond_6

    .line 43
    .line 44
    iget v11, p0, Lq2/P$e;->i:I

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_6
    move v11, v10

    .line 48
    :goto_3
    if-eqz p1, :cond_7

    .line 49
    .line 50
    iget v10, p0, Lq2/P$e;->j:I

    .line 51
    .line 52
    :cond_7
    move-object v12, v5

    .line 53
    move v5, v2

    .line 54
    move v2, v3

    .line 55
    move-object v3, v4

    .line 56
    move-object v4, v12

    .line 57
    move-wide v12, v8

    .line 58
    move-wide v8, v6

    .line 59
    move-wide v6, v12

    .line 60
    move v12, v11

    .line 61
    move v11, v10

    .line 62
    move v10, v12

    .line 63
    invoke-direct/range {v0 .. v11}, Lq2/P$e;-><init>(Ljava/lang/Object;ILq2/C;Ljava/lang/Object;IJJII)V

    .line 64
    .line 65
    .line 66
    return-object v0
.end method

.method public d(I)Landroid/os/Bundle;
    .locals 7

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    if-lt p1, v1, :cond_0

    .line 8
    .line 9
    iget v2, p0, Lq2/P$e;->c:I

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    :cond_0
    sget-object v2, Lq2/P$e;->k:Ljava/lang/String;

    .line 14
    .line 15
    iget v3, p0, Lq2/P$e;->c:I

    .line 16
    .line 17
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    :cond_1
    iget-object v2, p0, Lq2/P$e;->d:Lq2/C;

    .line 21
    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    sget-object v3, Lq2/P$e;->l:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v2}, Lq2/C;->e()Landroid/os/Bundle;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    if-lt p1, v1, :cond_3

    .line 34
    .line 35
    iget v2, p0, Lq2/P$e;->f:I

    .line 36
    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    :cond_3
    sget-object v2, Lq2/P$e;->m:Ljava/lang/String;

    .line 40
    .line 41
    iget v3, p0, Lq2/P$e;->f:I

    .line 42
    .line 43
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 44
    .line 45
    .line 46
    :cond_4
    const-wide/16 v2, 0x0

    .line 47
    .line 48
    if-lt p1, v1, :cond_5

    .line 49
    .line 50
    iget-wide v4, p0, Lq2/P$e;->g:J

    .line 51
    .line 52
    cmp-long v4, v4, v2

    .line 53
    .line 54
    if-eqz v4, :cond_6

    .line 55
    .line 56
    :cond_5
    sget-object v4, Lq2/P$e;->n:Ljava/lang/String;

    .line 57
    .line 58
    iget-wide v5, p0, Lq2/P$e;->g:J

    .line 59
    .line 60
    invoke-virtual {v0, v4, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 61
    .line 62
    .line 63
    :cond_6
    if-lt p1, v1, :cond_7

    .line 64
    .line 65
    iget-wide v4, p0, Lq2/P$e;->h:J

    .line 66
    .line 67
    cmp-long p1, v4, v2

    .line 68
    .line 69
    if-eqz p1, :cond_8

    .line 70
    .line 71
    :cond_7
    sget-object p1, Lq2/P$e;->o:Ljava/lang/String;

    .line 72
    .line 73
    iget-wide v1, p0, Lq2/P$e;->h:J

    .line 74
    .line 75
    invoke-virtual {v0, p1, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 76
    .line 77
    .line 78
    :cond_8
    iget p1, p0, Lq2/P$e;->i:I

    .line 79
    .line 80
    const/4 v1, -0x1

    .line 81
    if-eq p1, v1, :cond_9

    .line 82
    .line 83
    sget-object v2, Lq2/P$e;->p:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v0, v2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 86
    .line 87
    .line 88
    :cond_9
    iget p1, p0, Lq2/P$e;->j:I

    .line 89
    .line 90
    if-eq p1, v1, :cond_a

    .line 91
    .line 92
    sget-object v1, Lq2/P$e;->q:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 95
    .line 96
    .line 97
    :cond_a
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
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const-class v2, Lq2/P$e;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lq2/P$e;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lq2/P$e;->a(Lq2/P$e;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    iget-object v2, p0, Lq2/P$e;->a:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v3, p1, Lq2/P$e;->a:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    iget-object v2, p0, Lq2/P$e;->e:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object p1, p1, Lq2/P$e;->e:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    return v0

    .line 46
    :cond_2
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 9

    .line 1
    iget-object v0, p0, Lq2/P$e;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, Lq2/P$e;->c:I

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lq2/P$e;->d:Lq2/C;

    .line 10
    .line 11
    iget-object v3, p0, Lq2/P$e;->e:Ljava/lang/Object;

    .line 12
    .line 13
    iget v4, p0, Lq2/P$e;->f:I

    .line 14
    .line 15
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    iget-wide v5, p0, Lq2/P$e;->g:J

    .line 20
    .line 21
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    iget-wide v6, p0, Lq2/P$e;->h:J

    .line 26
    .line 27
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    iget v7, p0, Lq2/P$e;->i:I

    .line 32
    .line 33
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    iget v8, p0, Lq2/P$e;->j:I

    .line 38
    .line 39
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    filled-new-array/range {v0 .. v8}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "mediaItem="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lq2/P$e;->c:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", period="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget v1, p0, Lq2/P$e;->f:I

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", pos="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-wide v1, p0, Lq2/P$e;->g:J

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget v1, p0, Lq2/P$e;->i:I

    .line 41
    .line 42
    const/4 v2, -0x1

    .line 43
    if-ne v1, v2, :cond_0

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v0, ", contentPos="

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-wide v2, p0, Lq2/P$e;->h:J

    .line 60
    .line 61
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v0, ", adGroup="

    .line 65
    .line 66
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget v0, p0, Lq2/P$e;->i:I

    .line 70
    .line 71
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v0, ", ad="

    .line 75
    .line 76
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget v0, p0, Lq2/P$e;->j:I

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    return-object v0
.end method
