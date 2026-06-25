.class public final Lq2/Y$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/Y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field private static final A:Ljava/lang/String;

.field private static final B:Ljava/lang/String;

.field private static final C:Ljava/lang/String;

.field private static final D:Ljava/lang/String;

.field private static final E:Ljava/lang/String;

.field private static final F:Ljava/lang/String;

.field public static final q:Ljava/lang/Object;

.field private static final r:Ljava/lang/Object;

.field private static final s:Lq2/C;

.field private static final t:Ljava/lang/String;

.field private static final u:Ljava/lang/String;

.field private static final v:Ljava/lang/String;

.field private static final w:Ljava/lang/String;

.field private static final x:Ljava/lang/String;

.field private static final y:Ljava/lang/String;

.field private static final z:Ljava/lang/String;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Lq2/C;

.field public d:Ljava/lang/Object;

.field public e:J

.field public f:J

.field public g:J

.field public h:Z

.field public i:Z

.field public j:Lq2/C$g;

.field public k:Z

.field public l:J

.field public m:J

.field public n:I

.field public o:I

.field public p:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lq2/Y$d;->q:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lq2/Y$d;->r:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v0, Lq2/C$c;

    .line 16
    .line 17
    invoke-direct {v0}, Lq2/C$c;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v1, "androidx.media3.common.Timeline"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lq2/C$c;->d(Ljava/lang/String;)Lq2/C$c;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lq2/C$c;->j(Landroid/net/Uri;)Lq2/C$c;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lq2/C$c;->a()Lq2/C;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Lq2/Y$d;->s:Lq2/C;

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Lq2/Y$d;->t:Ljava/lang/String;

    .line 44
    .line 45
    const/4 v0, 0x2

    .line 46
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, Lq2/Y$d;->u:Ljava/lang/String;

    .line 51
    .line 52
    const/4 v0, 0x3

    .line 53
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, Lq2/Y$d;->v:Ljava/lang/String;

    .line 58
    .line 59
    const/4 v0, 0x4

    .line 60
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sput-object v0, Lq2/Y$d;->w:Ljava/lang/String;

    .line 65
    .line 66
    const/4 v0, 0x5

    .line 67
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lq2/Y$d;->x:Ljava/lang/String;

    .line 72
    .line 73
    const/4 v0, 0x6

    .line 74
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sput-object v0, Lq2/Y$d;->y:Ljava/lang/String;

    .line 79
    .line 80
    const/4 v0, 0x7

    .line 81
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sput-object v0, Lq2/Y$d;->z:Ljava/lang/String;

    .line 86
    .line 87
    const/16 v0, 0x8

    .line 88
    .line 89
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sput-object v0, Lq2/Y$d;->A:Ljava/lang/String;

    .line 94
    .line 95
    const/16 v0, 0x9

    .line 96
    .line 97
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    sput-object v0, Lq2/Y$d;->B:Ljava/lang/String;

    .line 102
    .line 103
    const/16 v0, 0xa

    .line 104
    .line 105
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    sput-object v0, Lq2/Y$d;->C:Ljava/lang/String;

    .line 110
    .line 111
    const/16 v0, 0xb

    .line 112
    .line 113
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    sput-object v0, Lq2/Y$d;->D:Ljava/lang/String;

    .line 118
    .line 119
    const/16 v0, 0xc

    .line 120
    .line 121
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    sput-object v0, Lq2/Y$d;->E:Ljava/lang/String;

    .line 126
    .line 127
    const/16 v0, 0xd

    .line 128
    .line 129
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    sput-object v0, Lq2/Y$d;->F:Ljava/lang/String;

    .line 134
    .line 135
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lq2/Y$d;->q:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object v0, p0, Lq2/Y$d;->a:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object v0, Lq2/Y$d;->s:Lq2/C;

    .line 9
    .line 10
    iput-object v0, p0, Lq2/Y$d;->c:Lq2/C;

    .line 11
    .line 12
    return-void
.end method

.method public static a(Landroid/os/Bundle;)Lq2/Y$d;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lq2/Y$d;->t:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {v1}, Lq2/C;->b(Landroid/os/Bundle;)Lq2/C;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :goto_0
    move-object v4, v1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    sget-object v1, Lq2/C;->i:Lq2/C;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :goto_1
    sget-object v1, Lq2/Y$d;->u:Ljava/lang/String;

    .line 21
    .line 22
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v6

    .line 31
    sget-object v1, Lq2/Y$d;->v:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v8

    .line 37
    sget-object v1, Lq2/Y$d;->w:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 40
    .line 41
    .line 42
    move-result-wide v10

    .line 43
    sget-object v1, Lq2/Y$d;->x:Ljava/lang/String;

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    invoke-virtual {v0, v1, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 47
    .line 48
    .line 49
    move-result v12

    .line 50
    sget-object v1, Lq2/Y$d;->y:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v1, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v13

    .line 56
    sget-object v1, Lq2/Y$d;->z:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    if-eqz v1, :cond_1

    .line 63
    .line 64
    invoke-static {v1}, Lq2/C$g;->b(Landroid/os/Bundle;)Lq2/C$g;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    :goto_2
    move-object v14, v1

    .line 69
    goto :goto_3

    .line 70
    :cond_1
    const/4 v1, 0x0

    .line 71
    goto :goto_2

    .line 72
    :goto_3
    sget-object v1, Lq2/Y$d;->A:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v0, v1, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    sget-object v15, Lq2/Y$d;->B:Ljava/lang/String;

    .line 79
    .line 80
    move-wide/from16 v16, v6

    .line 81
    .line 82
    const-wide/16 v5, 0x0

    .line 83
    .line 84
    invoke-virtual {v0, v15, v5, v6}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 85
    .line 86
    .line 87
    move-result-wide v18

    .line 88
    sget-object v15, Lq2/Y$d;->C:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v0, v15, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 91
    .line 92
    .line 93
    move-result-wide v2

    .line 94
    sget-object v15, Lq2/Y$d;->D:Ljava/lang/String;

    .line 95
    .line 96
    const/4 v7, 0x0

    .line 97
    invoke-virtual {v0, v15, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 98
    .line 99
    .line 100
    move-result v15

    .line 101
    sget-object v5, Lq2/Y$d;->E:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v0, v5, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    sget-object v6, Lq2/Y$d;->F:Ljava/lang/String;

    .line 108
    .line 109
    move-wide/from16 v22, v2

    .line 110
    .line 111
    const-wide/16 v2, 0x0

    .line 112
    .line 113
    invoke-virtual {v0, v6, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 114
    .line 115
    .line 116
    move-result-wide v2

    .line 117
    move-wide/from16 v6, v16

    .line 118
    .line 119
    move-wide/from16 v24, v18

    .line 120
    .line 121
    move/from16 v19, v15

    .line 122
    .line 123
    move-wide/from16 v15, v24

    .line 124
    .line 125
    move-wide/from16 v17, v22

    .line 126
    .line 127
    move-wide/from16 v21, v2

    .line 128
    .line 129
    new-instance v2, Lq2/Y$d;

    .line 130
    .line 131
    invoke-direct {v2}, Lq2/Y$d;-><init>()V

    .line 132
    .line 133
    .line 134
    sget-object v3, Lq2/Y$d;->r:Ljava/lang/Object;

    .line 135
    .line 136
    move/from16 v20, v5

    .line 137
    .line 138
    const/4 v5, 0x0

    .line 139
    invoke-virtual/range {v2 .. v22}, Lq2/Y$d;->h(Ljava/lang/Object;Lq2/C;Ljava/lang/Object;JJJZZLq2/C$g;JJIIJ)Lq2/Y$d;

    .line 140
    .line 141
    .line 142
    iput-boolean v1, v2, Lq2/Y$d;->k:Z

    .line 143
    .line 144
    return-object v2
.end method


# virtual methods
.method public b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lq2/Y$d;->g:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Lt2/a0;->k0(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lq2/Y$d;->l:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Lt2/a0;->F1(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public d()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lq2/Y$d;->l:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public e()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lq2/Y$d;->m:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Lt2/a0;->F1(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

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
    const-class v2, Lq2/Y$d;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    goto/16 :goto_0

    .line 21
    .line 22
    :cond_1
    check-cast p1, Lq2/Y$d;

    .line 23
    .line 24
    iget-object v2, p0, Lq2/Y$d;->a:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v3, p1, Lq2/Y$d;->a:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    iget-object v2, p0, Lq2/Y$d;->c:Lq2/C;

    .line 35
    .line 36
    iget-object v3, p1, Lq2/Y$d;->c:Lq2/C;

    .line 37
    .line 38
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    iget-object v2, p0, Lq2/Y$d;->d:Ljava/lang/Object;

    .line 45
    .line 46
    iget-object v3, p1, Lq2/Y$d;->d:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    iget-object v2, p0, Lq2/Y$d;->j:Lq2/C$g;

    .line 55
    .line 56
    iget-object v3, p1, Lq2/Y$d;->j:Lq2/C$g;

    .line 57
    .line 58
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    iget-wide v2, p0, Lq2/Y$d;->e:J

    .line 65
    .line 66
    iget-wide v4, p1, Lq2/Y$d;->e:J

    .line 67
    .line 68
    cmp-long v2, v2, v4

    .line 69
    .line 70
    if-nez v2, :cond_2

    .line 71
    .line 72
    iget-wide v2, p0, Lq2/Y$d;->f:J

    .line 73
    .line 74
    iget-wide v4, p1, Lq2/Y$d;->f:J

    .line 75
    .line 76
    cmp-long v2, v2, v4

    .line 77
    .line 78
    if-nez v2, :cond_2

    .line 79
    .line 80
    iget-wide v2, p0, Lq2/Y$d;->g:J

    .line 81
    .line 82
    iget-wide v4, p1, Lq2/Y$d;->g:J

    .line 83
    .line 84
    cmp-long v2, v2, v4

    .line 85
    .line 86
    if-nez v2, :cond_2

    .line 87
    .line 88
    iget-boolean v2, p0, Lq2/Y$d;->h:Z

    .line 89
    .line 90
    iget-boolean v3, p1, Lq2/Y$d;->h:Z

    .line 91
    .line 92
    if-ne v2, v3, :cond_2

    .line 93
    .line 94
    iget-boolean v2, p0, Lq2/Y$d;->i:Z

    .line 95
    .line 96
    iget-boolean v3, p1, Lq2/Y$d;->i:Z

    .line 97
    .line 98
    if-ne v2, v3, :cond_2

    .line 99
    .line 100
    iget-boolean v2, p0, Lq2/Y$d;->k:Z

    .line 101
    .line 102
    iget-boolean v3, p1, Lq2/Y$d;->k:Z

    .line 103
    .line 104
    if-ne v2, v3, :cond_2

    .line 105
    .line 106
    iget-wide v2, p0, Lq2/Y$d;->l:J

    .line 107
    .line 108
    iget-wide v4, p1, Lq2/Y$d;->l:J

    .line 109
    .line 110
    cmp-long v2, v2, v4

    .line 111
    .line 112
    if-nez v2, :cond_2

    .line 113
    .line 114
    iget-wide v2, p0, Lq2/Y$d;->m:J

    .line 115
    .line 116
    iget-wide v4, p1, Lq2/Y$d;->m:J

    .line 117
    .line 118
    cmp-long v2, v2, v4

    .line 119
    .line 120
    if-nez v2, :cond_2

    .line 121
    .line 122
    iget v2, p0, Lq2/Y$d;->n:I

    .line 123
    .line 124
    iget v3, p1, Lq2/Y$d;->n:I

    .line 125
    .line 126
    if-ne v2, v3, :cond_2

    .line 127
    .line 128
    iget v2, p0, Lq2/Y$d;->o:I

    .line 129
    .line 130
    iget v3, p1, Lq2/Y$d;->o:I

    .line 131
    .line 132
    if-ne v2, v3, :cond_2

    .line 133
    .line 134
    iget-wide v2, p0, Lq2/Y$d;->p:J

    .line 135
    .line 136
    iget-wide v4, p1, Lq2/Y$d;->p:J

    .line 137
    .line 138
    cmp-long p1, v2, v4

    .line 139
    .line 140
    if-nez p1, :cond_2

    .line 141
    .line 142
    return v0

    .line 143
    :cond_2
    :goto_0
    return v1
.end method

.method public f()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lq2/Y$d;->p:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq2/Y$d;->j:Lq2/C$g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public h(Ljava/lang/Object;Lq2/C;Ljava/lang/Object;JJJZZLq2/C$g;JJIIJ)Lq2/Y$d;
    .locals 0

    .line 1
    iput-object p1, p0, Lq2/Y$d;->a:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    move-object p1, p2

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    sget-object p1, Lq2/Y$d;->s:Lq2/C;

    .line 8
    .line 9
    :goto_0
    iput-object p1, p0, Lq2/Y$d;->c:Lq2/C;

    .line 10
    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    iget-object p1, p2, Lq2/C;->b:Lq2/C$h;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p1, Lq2/C$h;->i:Ljava/lang/Object;

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    :goto_1
    iput-object p1, p0, Lq2/Y$d;->b:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object p3, p0, Lq2/Y$d;->d:Ljava/lang/Object;

    .line 24
    .line 25
    iput-wide p4, p0, Lq2/Y$d;->e:J

    .line 26
    .line 27
    iput-wide p6, p0, Lq2/Y$d;->f:J

    .line 28
    .line 29
    iput-wide p8, p0, Lq2/Y$d;->g:J

    .line 30
    .line 31
    iput-boolean p10, p0, Lq2/Y$d;->h:Z

    .line 32
    .line 33
    iput-boolean p11, p0, Lq2/Y$d;->i:Z

    .line 34
    .line 35
    iput-object p12, p0, Lq2/Y$d;->j:Lq2/C$g;

    .line 36
    .line 37
    iput-wide p13, p0, Lq2/Y$d;->l:J

    .line 38
    .line 39
    move-wide p1, p15

    .line 40
    iput-wide p1, p0, Lq2/Y$d;->m:J

    .line 41
    .line 42
    move/from16 p1, p17

    .line 43
    .line 44
    iput p1, p0, Lq2/Y$d;->n:I

    .line 45
    .line 46
    move/from16 p1, p18

    .line 47
    .line 48
    iput p1, p0, Lq2/Y$d;->o:I

    .line 49
    .line 50
    move-wide/from16 p1, p19

    .line 51
    .line 52
    iput-wide p1, p0, Lq2/Y$d;->p:J

    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    iput-boolean p1, p0, Lq2/Y$d;->k:Z

    .line 56
    .line 57
    return-object p0
.end method

.method public hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, Lq2/Y$d;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0xd9

    .line 8
    .line 9
    add-int/2addr v1, v0

    .line 10
    mul-int/lit8 v1, v1, 0x1f

    .line 11
    .line 12
    iget-object v0, p0, Lq2/Y$d;->c:Lq2/C;

    .line 13
    .line 14
    invoke-virtual {v0}, Lq2/C;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    add-int/2addr v1, v0

    .line 19
    mul-int/lit8 v1, v1, 0x1f

    .line 20
    .line 21
    iget-object v0, p0, Lq2/Y$d;->d:Ljava/lang/Object;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    move v0, v2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    :goto_0
    add-int/2addr v1, v0

    .line 33
    mul-int/lit8 v1, v1, 0x1f

    .line 34
    .line 35
    iget-object v0, p0, Lq2/Y$d;->j:Lq2/C$g;

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-virtual {v0}, Lq2/C$g;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    :goto_1
    add-int/2addr v1, v2

    .line 45
    mul-int/lit8 v1, v1, 0x1f

    .line 46
    .line 47
    iget-wide v2, p0, Lq2/Y$d;->e:J

    .line 48
    .line 49
    const/16 v0, 0x20

    .line 50
    .line 51
    ushr-long v4, v2, v0

    .line 52
    .line 53
    xor-long/2addr v2, v4

    .line 54
    long-to-int v2, v2

    .line 55
    add-int/2addr v1, v2

    .line 56
    mul-int/lit8 v1, v1, 0x1f

    .line 57
    .line 58
    iget-wide v2, p0, Lq2/Y$d;->f:J

    .line 59
    .line 60
    ushr-long v4, v2, v0

    .line 61
    .line 62
    xor-long/2addr v2, v4

    .line 63
    long-to-int v2, v2

    .line 64
    add-int/2addr v1, v2

    .line 65
    mul-int/lit8 v1, v1, 0x1f

    .line 66
    .line 67
    iget-wide v2, p0, Lq2/Y$d;->g:J

    .line 68
    .line 69
    ushr-long v4, v2, v0

    .line 70
    .line 71
    xor-long/2addr v2, v4

    .line 72
    long-to-int v2, v2

    .line 73
    add-int/2addr v1, v2

    .line 74
    mul-int/lit8 v1, v1, 0x1f

    .line 75
    .line 76
    iget-boolean v2, p0, Lq2/Y$d;->h:Z

    .line 77
    .line 78
    add-int/2addr v1, v2

    .line 79
    mul-int/lit8 v1, v1, 0x1f

    .line 80
    .line 81
    iget-boolean v2, p0, Lq2/Y$d;->i:Z

    .line 82
    .line 83
    add-int/2addr v1, v2

    .line 84
    mul-int/lit8 v1, v1, 0x1f

    .line 85
    .line 86
    iget-boolean v2, p0, Lq2/Y$d;->k:Z

    .line 87
    .line 88
    add-int/2addr v1, v2

    .line 89
    mul-int/lit8 v1, v1, 0x1f

    .line 90
    .line 91
    iget-wide v2, p0, Lq2/Y$d;->l:J

    .line 92
    .line 93
    ushr-long v4, v2, v0

    .line 94
    .line 95
    xor-long/2addr v2, v4

    .line 96
    long-to-int v2, v2

    .line 97
    add-int/2addr v1, v2

    .line 98
    mul-int/lit8 v1, v1, 0x1f

    .line 99
    .line 100
    iget-wide v2, p0, Lq2/Y$d;->m:J

    .line 101
    .line 102
    ushr-long v4, v2, v0

    .line 103
    .line 104
    xor-long/2addr v2, v4

    .line 105
    long-to-int v2, v2

    .line 106
    add-int/2addr v1, v2

    .line 107
    mul-int/lit8 v1, v1, 0x1f

    .line 108
    .line 109
    iget v2, p0, Lq2/Y$d;->n:I

    .line 110
    .line 111
    add-int/2addr v1, v2

    .line 112
    mul-int/lit8 v1, v1, 0x1f

    .line 113
    .line 114
    iget v2, p0, Lq2/Y$d;->o:I

    .line 115
    .line 116
    add-int/2addr v1, v2

    .line 117
    mul-int/lit8 v1, v1, 0x1f

    .line 118
    .line 119
    iget-wide v2, p0, Lq2/Y$d;->p:J

    .line 120
    .line 121
    ushr-long v4, v2, v0

    .line 122
    .line 123
    xor-long/2addr v2, v4

    .line 124
    long-to-int v0, v2

    .line 125
    add-int/2addr v1, v0

    .line 126
    return v1
.end method

.method public i()Landroid/os/Bundle;
    .locals 8

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lq2/C;->i:Lq2/C;

    .line 7
    .line 8
    iget-object v2, p0, Lq2/Y$d;->c:Lq2/C;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Lq2/C;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    sget-object v1, Lq2/Y$d;->t:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v2, p0, Lq2/Y$d;->c:Lq2/C;

    .line 19
    .line 20
    invoke-virtual {v2}, Lq2/C;->e()Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-wide v1, p0, Lq2/Y$d;->e:J

    .line 28
    .line 29
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    cmp-long v5, v1, v3

    .line 35
    .line 36
    if-eqz v5, :cond_1

    .line 37
    .line 38
    sget-object v5, Lq2/Y$d;->u:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v0, v5, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-wide v1, p0, Lq2/Y$d;->f:J

    .line 44
    .line 45
    cmp-long v5, v1, v3

    .line 46
    .line 47
    if-eqz v5, :cond_2

    .line 48
    .line 49
    sget-object v5, Lq2/Y$d;->v:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v0, v5, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 52
    .line 53
    .line 54
    :cond_2
    iget-wide v1, p0, Lq2/Y$d;->g:J

    .line 55
    .line 56
    cmp-long v5, v1, v3

    .line 57
    .line 58
    if-eqz v5, :cond_3

    .line 59
    .line 60
    sget-object v5, Lq2/Y$d;->w:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v0, v5, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 63
    .line 64
    .line 65
    :cond_3
    iget-boolean v1, p0, Lq2/Y$d;->h:Z

    .line 66
    .line 67
    if-eqz v1, :cond_4

    .line 68
    .line 69
    sget-object v2, Lq2/Y$d;->x:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    :cond_4
    iget-boolean v1, p0, Lq2/Y$d;->i:Z

    .line 75
    .line 76
    if-eqz v1, :cond_5

    .line 77
    .line 78
    sget-object v2, Lq2/Y$d;->y:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    :cond_5
    iget-object v1, p0, Lq2/Y$d;->j:Lq2/C$g;

    .line 84
    .line 85
    if-eqz v1, :cond_6

    .line 86
    .line 87
    sget-object v2, Lq2/Y$d;->z:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v1}, Lq2/C$g;->c()Landroid/os/Bundle;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 94
    .line 95
    .line 96
    :cond_6
    iget-boolean v1, p0, Lq2/Y$d;->k:Z

    .line 97
    .line 98
    if-eqz v1, :cond_7

    .line 99
    .line 100
    sget-object v2, Lq2/Y$d;->A:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 103
    .line 104
    .line 105
    :cond_7
    iget-wide v1, p0, Lq2/Y$d;->l:J

    .line 106
    .line 107
    const-wide/16 v5, 0x0

    .line 108
    .line 109
    cmp-long v7, v1, v5

    .line 110
    .line 111
    if-eqz v7, :cond_8

    .line 112
    .line 113
    sget-object v7, Lq2/Y$d;->B:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v0, v7, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 116
    .line 117
    .line 118
    :cond_8
    iget-wide v1, p0, Lq2/Y$d;->m:J

    .line 119
    .line 120
    cmp-long v3, v1, v3

    .line 121
    .line 122
    if-eqz v3, :cond_9

    .line 123
    .line 124
    sget-object v3, Lq2/Y$d;->C:Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {v0, v3, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 127
    .line 128
    .line 129
    :cond_9
    iget v1, p0, Lq2/Y$d;->n:I

    .line 130
    .line 131
    if-eqz v1, :cond_a

    .line 132
    .line 133
    sget-object v2, Lq2/Y$d;->D:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 136
    .line 137
    .line 138
    :cond_a
    iget v1, p0, Lq2/Y$d;->o:I

    .line 139
    .line 140
    if-eqz v1, :cond_b

    .line 141
    .line 142
    sget-object v2, Lq2/Y$d;->E:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 145
    .line 146
    .line 147
    :cond_b
    iget-wide v1, p0, Lq2/Y$d;->p:J

    .line 148
    .line 149
    cmp-long v3, v1, v5

    .line 150
    .line 151
    if-eqz v3, :cond_c

    .line 152
    .line 153
    sget-object v3, Lq2/Y$d;->F:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v0, v3, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 156
    .line 157
    .line 158
    :cond_c
    return-object v0
.end method
