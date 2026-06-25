.class public final Lqd/b;
.super Lqd/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqd/b$j;
    }
.end annotation


# static fields
.field public static final l:Lqd/b$j;


# instance fields
.field private final a:LM3/q;

.field private final b:LM3/i;

.field private final c:Lpd/b;

.field private final d:LM3/i;

.field private final e:LM3/h;

.field private final f:LM3/w;

.field private final g:LM3/w;

.field private final h:LM3/w;

.field private final i:LM3/w;

.field private final j:LM3/w;

.field private final k:LM3/w;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lqd/b$j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lqd/b$j;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lqd/b;->l:Lqd/b$j;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LM3/q;)V
    .locals 1

    .line 1
    const-string v0, "__db"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lqd/a;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lpd/b;

    .line 10
    .line 11
    invoke-direct {v0}, Lpd/b;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lqd/b;->c:Lpd/b;

    .line 15
    .line 16
    iput-object p1, p0, Lqd/b;->a:LM3/q;

    .line 17
    .line 18
    new-instance v0, Lqd/b$a;

    .line 19
    .line 20
    invoke-direct {v0, p1, p0}, Lqd/b$a;-><init>(LM3/q;Lqd/b;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lqd/b;->b:LM3/i;

    .line 24
    .line 25
    new-instance v0, Lqd/b$b;

    .line 26
    .line 27
    invoke-direct {v0, p1, p0}, Lqd/b$b;-><init>(LM3/q;Lqd/b;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lqd/b;->d:LM3/i;

    .line 31
    .line 32
    new-instance v0, Lqd/b$c;

    .line 33
    .line 34
    invoke-direct {v0, p1, p0}, Lqd/b$c;-><init>(LM3/q;Lqd/b;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lqd/b;->e:LM3/h;

    .line 38
    .line 39
    new-instance v0, Lqd/b$d;

    .line 40
    .line 41
    invoke-direct {v0, p1}, Lqd/b$d;-><init>(LM3/q;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lqd/b;->f:LM3/w;

    .line 45
    .line 46
    new-instance v0, Lqd/b$e;

    .line 47
    .line 48
    invoke-direct {v0, p1}, Lqd/b$e;-><init>(LM3/q;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lqd/b;->g:LM3/w;

    .line 52
    .line 53
    new-instance v0, Lqd/b$f;

    .line 54
    .line 55
    invoke-direct {v0, p1}, Lqd/b$f;-><init>(LM3/q;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lqd/b;->h:LM3/w;

    .line 59
    .line 60
    new-instance v0, Lqd/b$g;

    .line 61
    .line 62
    invoke-direct {v0, p1}, Lqd/b$g;-><init>(LM3/q;)V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lqd/b;->i:LM3/w;

    .line 66
    .line 67
    new-instance v0, Lqd/b$h;

    .line 68
    .line 69
    invoke-direct {v0, p1}, Lqd/b$h;-><init>(LM3/q;)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, Lqd/b;->j:LM3/w;

    .line 73
    .line 74
    new-instance v0, Lqd/b$i;

    .line 75
    .line 76
    invoke-direct {v0, p1}, Lqd/b$i;-><init>(LM3/q;)V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Lqd/b;->k:LM3/w;

    .line 80
    .line 81
    return-void
.end method

.method public static final synthetic r(Lqd/b;)Lpd/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lqd/b;->c:Lpd/b;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Lrd/d;Lrd/a;Z)Z
    .locals 1

    .line 1
    const-string v0, "update"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "asset"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqd/b;->a:LM3/q;

    .line 12
    .line 13
    invoke-virtual {v0}, LM3/q;->e()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lqd/a;->a(Lrd/d;Lrd/a;Z)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iget-object p2, p0, Lqd/b;->a:LM3/q;

    .line 21
    .line 22
    invoke-virtual {p2}, LM3/q;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    iget-object p2, p0, Lqd/b;->a:LM3/q;

    .line 26
    .line 27
    invoke-virtual {p2}, LM3/q;->i()V

    .line 28
    .line 29
    .line 30
    return p1

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    iget-object p2, p0, Lqd/b;->a:LM3/q;

    .line 33
    .line 34
    invoke-virtual {p2}, LM3/q;->i()V

    .line 35
    .line 36
    .line 37
    throw p1
.end method

.method protected b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lqd/b;->a:LM3/q;

    .line 2
    .line 3
    invoke-virtual {v0}, LM3/q;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqd/b;->k:LM3/w;

    .line 7
    .line 8
    invoke-virtual {v0}, LM3/w;->b()LS3/k;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :try_start_0
    iget-object v1, p0, Lqd/b;->a:LM3/q;

    .line 13
    .line 14
    invoke-virtual {v1}, LM3/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    :try_start_1
    invoke-interface {v0}, LS3/k;->Z()I

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lqd/b;->a:LM3/q;

    .line 21
    .line 22
    invoke-virtual {v1}, LM3/q;->B()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 23
    .line 24
    .line 25
    :try_start_2
    iget-object v1, p0, Lqd/b;->a:LM3/q;

    .line 26
    .line 27
    invoke-virtual {v1}, LM3/q;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lqd/b;->k:LM3/w;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, LM3/w;->h(LS3/k;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    goto :goto_0

    .line 38
    :catchall_1
    move-exception v1

    .line 39
    :try_start_3
    iget-object v2, p0, Lqd/b;->a:LM3/q;

    .line 40
    .line 41
    invoke-virtual {v2}, LM3/q;->i()V

    .line 42
    .line 43
    .line 44
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 45
    :goto_0
    iget-object v2, p0, Lqd/b;->k:LM3/w;

    .line 46
    .line 47
    invoke-virtual {v2, v0}, LM3/w;->h(LS3/k;)V

    .line 48
    .line 49
    .line 50
    throw v1
.end method

.method public c()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lqd/b;->a:LM3/q;

    .line 2
    .line 3
    invoke-virtual {v0}, LM3/q;->e()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-super {p0}, Lqd/a;->c()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lqd/b;->a:LM3/q;

    .line 11
    .line 12
    invoke-virtual {v1}, LM3/q;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lqd/b;->a:LM3/q;

    .line 16
    .line 17
    invoke-virtual {v1}, LM3/q;->i()V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    iget-object v1, p0, Lqd/b;->a:LM3/q;

    .line 23
    .line 24
    invoke-virtual {v1}, LM3/q;->i()V

    .line 25
    .line 26
    .line 27
    throw v0
.end method

.method protected d(Lrd/a;)J
    .locals 2

    .line 1
    const-string v0, "asset"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqd/b;->a:LM3/q;

    .line 7
    .line 8
    invoke-virtual {v0}, LM3/q;->d()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqd/b;->a:LM3/q;

    .line 12
    .line 13
    invoke-virtual {v0}, LM3/q;->e()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v0, p0, Lqd/b;->b:LM3/i;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, LM3/i;->k(Ljava/lang/Object;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    iget-object p1, p0, Lqd/b;->a:LM3/q;

    .line 23
    .line 24
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lqd/b;->a:LM3/q;

    .line 28
    .line 29
    invoke-virtual {p1}, LM3/q;->i()V

    .line 30
    .line 31
    .line 32
    return-wide v0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    iget-object v0, p0, Lqd/b;->a:LM3/q;

    .line 35
    .line 36
    invoke-virtual {v0}, LM3/q;->i()V

    .line 37
    .line 38
    .line 39
    throw p1
.end method

.method public e(Ljava/util/List;Lrd/d;)V
    .locals 1

    .line 1
    const-string v0, "assets"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "update"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqd/b;->a:LM3/q;

    .line 12
    .line 13
    invoke-virtual {v0}, LM3/q;->e()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-super {p0, p1, p2}, Lqd/a;->e(Ljava/util/List;Lrd/d;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lqd/b;->a:LM3/q;

    .line 20
    .line 21
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lqd/b;->a:LM3/q;

    .line 25
    .line 26
    invoke-virtual {p1}, LM3/q;->i()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    iget-object p2, p0, Lqd/b;->a:LM3/q;

    .line 32
    .line 33
    invoke-virtual {p2}, LM3/q;->i()V

    .line 34
    .line 35
    .line 36
    throw p1
.end method

.method protected f(Lrd/c;)V
    .locals 1

    .line 1
    const-string v0, "updateAsset"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqd/b;->a:LM3/q;

    .line 7
    .line 8
    invoke-virtual {v0}, LM3/q;->d()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqd/b;->a:LM3/q;

    .line 12
    .line 13
    invoke-virtual {v0}, LM3/q;->e()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v0, p0, Lqd/b;->d:LM3/i;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, LM3/i;->j(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lqd/b;->a:LM3/q;

    .line 22
    .line 23
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lqd/b;->a:LM3/q;

    .line 27
    .line 28
    invoke-virtual {p1}, LM3/q;->i()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    iget-object v0, p0, Lqd/b;->a:LM3/q;

    .line 34
    .line 35
    invoke-virtual {v0}, LM3/q;->i()V

    .line 36
    .line 37
    .line 38
    throw p1
.end method

.method protected h(Ljava/lang/String;)Ljava/util/List;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    sget-object v2, LM3/t;->i:LM3/t$a;

    .line 6
    .line 7
    const-string v3, "SELECT * FROM assets WHERE `key` = ? LIMIT 1;"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    invoke-virtual {v2, v3, v4}, LM3/t$a;->a(Ljava/lang/String;I)LM3/t;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v2, v4}, LM3/t;->I1(I)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v2, v4, v0}, LM3/t;->Z0(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    iget-object v0, v1, Lqd/b;->a:LM3/q;

    .line 24
    .line 25
    invoke-virtual {v0}, LM3/q;->d()V

    .line 26
    .line 27
    .line 28
    iget-object v0, v1, Lqd/b;->a:LM3/q;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    invoke-static {v0, v2, v3, v5}, LO3/b;->b(LM3/q;LS3/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    :try_start_0
    const-string v0, "key"

    .line 37
    .line 38
    invoke-static {v6, v0}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const-string v7, "type"

    .line 43
    .line 44
    invoke-static {v6, v7}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    const-string v8, "id"

    .line 49
    .line 50
    invoke-static {v6, v8}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    const-string v9, "url"

    .line 55
    .line 56
    invoke-static {v6, v9}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    const-string v10, "headers"

    .line 61
    .line 62
    invoke-static {v6, v10}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v10

    .line 66
    const-string v11, "extra_request_headers"

    .line 67
    .line 68
    invoke-static {v6, v11}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    const-string v12, "metadata"

    .line 73
    .line 74
    invoke-static {v6, v12}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    move-result v12

    .line 78
    const-string v13, "download_time"

    .line 79
    .line 80
    invoke-static {v6, v13}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v13

    .line 84
    const-string v14, "relative_path"

    .line 85
    .line 86
    invoke-static {v6, v14}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    move-result v14

    .line 90
    const-string v15, "hash"

    .line 91
    .line 92
    invoke-static {v6, v15}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    move-result v15

    .line 96
    const-string v3, "hash_type"

    .line 97
    .line 98
    invoke-static {v6, v3}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    const-string v4, "expected_hash"

    .line 103
    .line 104
    invoke-static {v6, v4}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    const-string v5, "marked_for_deletion"

    .line 109
    .line 110
    invoke-static {v6, v5}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 114
    move-object/from16 v17, v2

    .line 115
    .line 116
    :try_start_1
    new-instance v2, Ljava/util/ArrayList;

    .line 117
    .line 118
    move/from16 v18, v5

    .line 119
    .line 120
    invoke-interface {v6}, Landroid/database/Cursor;->getCount()I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 125
    .line 126
    .line 127
    :goto_1
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    if-eqz v5, :cond_c

    .line 132
    .line 133
    invoke-interface {v6, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-eqz v5, :cond_1

    .line 138
    .line 139
    const/4 v5, 0x0

    .line 140
    goto :goto_2

    .line 141
    :cond_1
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    :goto_2
    invoke-interface {v6, v7}, Landroid/database/Cursor;->isNull(I)Z

    .line 146
    .line 147
    .line 148
    move-result v19

    .line 149
    if-eqz v19, :cond_2

    .line 150
    .line 151
    move/from16 v20, v0

    .line 152
    .line 153
    const/4 v0, 0x0

    .line 154
    :goto_3
    move/from16 v19, v7

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_2
    invoke-interface {v6, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v19

    .line 161
    move/from16 v20, v0

    .line 162
    .line 163
    move-object/from16 v0, v19

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :goto_4
    new-instance v7, Lrd/a;

    .line 167
    .line 168
    invoke-direct {v7, v5, v0}, Lrd/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    move v0, v4

    .line 172
    invoke-interface {v6, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 173
    .line 174
    .line 175
    move-result-wide v4

    .line 176
    invoke-virtual {v7, v4, v5}, Lrd/a;->B(J)V

    .line 177
    .line 178
    .line 179
    invoke-interface {v6, v9}, Landroid/database/Cursor;->isNull(I)Z

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-eqz v4, :cond_3

    .line 184
    .line 185
    const/4 v4, 0x0

    .line 186
    goto :goto_5

    .line 187
    :cond_3
    invoke-interface {v6, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    :goto_5
    iget-object v5, v1, Lqd/b;->c:Lpd/b;

    .line 192
    .line 193
    invoke-virtual {v5, v4}, Lpd/b;->l(Ljava/lang/String;)Landroid/net/Uri;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    invoke-virtual {v7, v4}, Lrd/a;->K(Landroid/net/Uri;)V

    .line 198
    .line 199
    .line 200
    invoke-interface {v6, v10}, Landroid/database/Cursor;->isNull(I)Z

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    if-eqz v4, :cond_4

    .line 205
    .line 206
    const/4 v4, 0x0

    .line 207
    goto :goto_6

    .line 208
    :cond_4
    invoke-interface {v6, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    :goto_6
    iget-object v5, v1, Lqd/b;->c:Lpd/b;

    .line 213
    .line 214
    invoke-virtual {v5, v4}, Lpd/b;->j(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    invoke-virtual {v7, v4}, Lrd/a;->A(Lorg/json/JSONObject;)V

    .line 219
    .line 220
    .line 221
    invoke-interface {v6, v11}, Landroid/database/Cursor;->isNull(I)Z

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    if-eqz v4, :cond_5

    .line 226
    .line 227
    const/4 v4, 0x0

    .line 228
    goto :goto_7

    .line 229
    :cond_5
    invoke-interface {v6, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    :goto_7
    iget-object v5, v1, Lqd/b;->c:Lpd/b;

    .line 234
    .line 235
    invoke-virtual {v5, v4}, Lpd/b;->j(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    invoke-virtual {v7, v4}, Lrd/a;->x(Lorg/json/JSONObject;)V

    .line 240
    .line 241
    .line 242
    invoke-interface {v6, v12}, Landroid/database/Cursor;->isNull(I)Z

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    if-eqz v4, :cond_6

    .line 247
    .line 248
    const/4 v4, 0x0

    .line 249
    goto :goto_8

    .line 250
    :cond_6
    invoke-interface {v6, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    :goto_8
    iget-object v5, v1, Lqd/b;->c:Lpd/b;

    .line 255
    .line 256
    invoke-virtual {v5, v4}, Lpd/b;->j(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    invoke-virtual {v7, v4}, Lrd/a;->E(Lorg/json/JSONObject;)V

    .line 261
    .line 262
    .line 263
    invoke-interface {v6, v13}, Landroid/database/Cursor;->isNull(I)Z

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    if-eqz v4, :cond_7

    .line 268
    .line 269
    const/4 v4, 0x0

    .line 270
    goto :goto_9

    .line 271
    :cond_7
    invoke-interface {v6, v13}, Landroid/database/Cursor;->getLong(I)J

    .line 272
    .line 273
    .line 274
    move-result-wide v4

    .line 275
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    :goto_9
    iget-object v5, v1, Lqd/b;->c:Lpd/b;

    .line 280
    .line 281
    invoke-virtual {v5, v4}, Lpd/b;->g(Ljava/lang/Long;)Ljava/util/Date;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    invoke-virtual {v7, v4}, Lrd/a;->u(Ljava/util/Date;)V

    .line 286
    .line 287
    .line 288
    invoke-interface {v6, v14}, Landroid/database/Cursor;->isNull(I)Z

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    if-eqz v4, :cond_8

    .line 293
    .line 294
    const/4 v4, 0x0

    .line 295
    invoke-virtual {v7, v4}, Lrd/a;->F(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    goto :goto_a

    .line 299
    :catchall_0
    move-exception v0

    .line 300
    goto :goto_f

    .line 301
    :cond_8
    invoke-interface {v6, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    invoke-virtual {v7, v4}, Lrd/a;->F(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    :goto_a
    invoke-interface {v6, v15}, Landroid/database/Cursor;->isNull(I)Z

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    if-eqz v4, :cond_9

    .line 313
    .line 314
    const/4 v4, 0x0

    .line 315
    invoke-virtual {v7, v4}, Lrd/a;->y([B)V

    .line 316
    .line 317
    .line 318
    goto :goto_b

    .line 319
    :cond_9
    invoke-interface {v6, v15}, Landroid/database/Cursor;->getBlob(I)[B

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    invoke-virtual {v7, v4}, Lrd/a;->y([B)V

    .line 324
    .line 325
    .line 326
    :goto_b
    invoke-interface {v6, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    iget-object v5, v1, Lqd/b;->c:Lpd/b;

    .line 331
    .line 332
    invoke-virtual {v5, v4}, Lpd/b;->d(I)Lsd/a;

    .line 333
    .line 334
    .line 335
    move-result-object v4

    .line 336
    invoke-virtual {v7, v4}, Lrd/a;->z(Lsd/a;)V

    .line 337
    .line 338
    .line 339
    invoke-interface {v6, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 340
    .line 341
    .line 342
    move-result v4

    .line 343
    if-eqz v4, :cond_a

    .line 344
    .line 345
    const/4 v4, 0x0

    .line 346
    invoke-virtual {v7, v4}, Lrd/a;->w(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    :goto_c
    move/from16 v5, v18

    .line 350
    .line 351
    goto :goto_d

    .line 352
    :cond_a
    const/4 v4, 0x0

    .line 353
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v5

    .line 357
    invoke-virtual {v7, v5}, Lrd/a;->w(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    goto :goto_c

    .line 361
    :goto_d
    invoke-interface {v6, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 362
    .line 363
    .line 364
    move-result v16

    .line 365
    if-eqz v16, :cond_b

    .line 366
    .line 367
    const/4 v4, 0x1

    .line 368
    goto :goto_e

    .line 369
    :cond_b
    const/4 v4, 0x0

    .line 370
    :goto_e
    invoke-virtual {v7, v4}, Lrd/a;->D(Z)V

    .line 371
    .line 372
    .line 373
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 374
    .line 375
    .line 376
    move v4, v0

    .line 377
    move/from16 v18, v5

    .line 378
    .line 379
    move/from16 v7, v19

    .line 380
    .line 381
    move/from16 v0, v20

    .line 382
    .line 383
    goto/16 :goto_1

    .line 384
    .line 385
    :cond_c
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v17 .. v17}, LM3/t;->k()V

    .line 389
    .line 390
    .line 391
    return-object v2

    .line 392
    :catchall_1
    move-exception v0

    .line 393
    move-object/from16 v17, v2

    .line 394
    .line 395
    :goto_f
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v17 .. v17}, LM3/t;->k()V

    .line 399
    .line 400
    .line 401
    throw v0
.end method

.method public i(Ljava/util/UUID;)Ljava/util/List;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "id"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget-object v3, LM3/t;->i:LM3/t$a;

    .line 11
    .line 12
    const-string v4, "SELECT assets.* FROM assets INNER JOIN updates_assets ON updates_assets.asset_id = assets.id INNER JOIN updates ON updates_assets.update_id = updates.id WHERE updates.id = ?;"

    .line 13
    .line 14
    const/4 v5, 0x1

    .line 15
    invoke-virtual {v3, v4, v5}, LM3/t$a;->a(Ljava/lang/String;I)LM3/t;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v4, v1, Lqd/b;->c:Lpd/b;

    .line 20
    .line 21
    invoke-virtual {v4, v0}, Lpd/b;->n(Ljava/util/UUID;)[B

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v3, v5, v0}, LM3/t;->p1(I[B)V

    .line 26
    .line 27
    .line 28
    iget-object v0, v1, Lqd/b;->a:LM3/q;

    .line 29
    .line 30
    invoke-virtual {v0}, LM3/q;->d()V

    .line 31
    .line 32
    .line 33
    iget-object v0, v1, Lqd/b;->a:LM3/q;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    invoke-static {v0, v3, v4, v6}, LO3/b;->b(LM3/q;LS3/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    :try_start_0
    const-string v0, "key"

    .line 42
    .line 43
    invoke-static {v7, v0}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const-string v8, "type"

    .line 48
    .line 49
    invoke-static {v7, v8}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    invoke-static {v7, v2}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    const-string v9, "url"

    .line 58
    .line 59
    invoke-static {v7, v9}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    const-string v10, "headers"

    .line 64
    .line 65
    invoke-static {v7, v10}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    const-string v11, "extra_request_headers"

    .line 70
    .line 71
    invoke-static {v7, v11}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    const-string v12, "metadata"

    .line 76
    .line 77
    invoke-static {v7, v12}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    const-string v13, "download_time"

    .line 82
    .line 83
    invoke-static {v7, v13}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    const-string v14, "relative_path"

    .line 88
    .line 89
    invoke-static {v7, v14}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v14

    .line 93
    const-string v15, "hash"

    .line 94
    .line 95
    invoke-static {v7, v15}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v15

    .line 99
    const-string v4, "hash_type"

    .line 100
    .line 101
    invoke-static {v7, v4}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    const-string v5, "expected_hash"

    .line 106
    .line 107
    invoke-static {v7, v5}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    const-string v6, "marked_for_deletion"

    .line 112
    .line 113
    invoke-static {v7, v6}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 117
    move-object/from16 v17, v3

    .line 118
    .line 119
    :try_start_1
    new-instance v3, Ljava/util/ArrayList;

    .line 120
    .line 121
    move/from16 v18, v6

    .line 122
    .line 123
    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 128
    .line 129
    .line 130
    :goto_0
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    if-eqz v6, :cond_b

    .line 135
    .line 136
    invoke-interface {v7, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    if-eqz v6, :cond_0

    .line 141
    .line 142
    const/4 v6, 0x0

    .line 143
    goto :goto_1

    .line 144
    :cond_0
    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    :goto_1
    invoke-interface {v7, v8}, Landroid/database/Cursor;->isNull(I)Z

    .line 149
    .line 150
    .line 151
    move-result v19

    .line 152
    if-eqz v19, :cond_1

    .line 153
    .line 154
    move/from16 v20, v0

    .line 155
    .line 156
    const/4 v0, 0x0

    .line 157
    :goto_2
    move/from16 v19, v8

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_1
    invoke-interface {v7, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v19

    .line 164
    move/from16 v20, v0

    .line 165
    .line 166
    move-object/from16 v0, v19

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :goto_3
    new-instance v8, Lrd/a;

    .line 170
    .line 171
    invoke-direct {v8, v6, v0}, Lrd/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    move v0, v5

    .line 175
    invoke-interface {v7, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 176
    .line 177
    .line 178
    move-result-wide v5

    .line 179
    invoke-virtual {v8, v5, v6}, Lrd/a;->B(J)V

    .line 180
    .line 181
    .line 182
    invoke-interface {v7, v9}, Landroid/database/Cursor;->isNull(I)Z

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    if-eqz v5, :cond_2

    .line 187
    .line 188
    const/4 v5, 0x0

    .line 189
    goto :goto_4

    .line 190
    :cond_2
    invoke-interface {v7, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    :goto_4
    iget-object v6, v1, Lqd/b;->c:Lpd/b;

    .line 195
    .line 196
    invoke-virtual {v6, v5}, Lpd/b;->l(Ljava/lang/String;)Landroid/net/Uri;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    invoke-virtual {v8, v5}, Lrd/a;->K(Landroid/net/Uri;)V

    .line 201
    .line 202
    .line 203
    invoke-interface {v7, v10}, Landroid/database/Cursor;->isNull(I)Z

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    if-eqz v5, :cond_3

    .line 208
    .line 209
    const/4 v5, 0x0

    .line 210
    goto :goto_5

    .line 211
    :cond_3
    invoke-interface {v7, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    :goto_5
    iget-object v6, v1, Lqd/b;->c:Lpd/b;

    .line 216
    .line 217
    invoke-virtual {v6, v5}, Lpd/b;->j(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    invoke-virtual {v8, v5}, Lrd/a;->A(Lorg/json/JSONObject;)V

    .line 222
    .line 223
    .line 224
    invoke-interface {v7, v11}, Landroid/database/Cursor;->isNull(I)Z

    .line 225
    .line 226
    .line 227
    move-result v5

    .line 228
    if-eqz v5, :cond_4

    .line 229
    .line 230
    const/4 v5, 0x0

    .line 231
    goto :goto_6

    .line 232
    :cond_4
    invoke-interface {v7, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    :goto_6
    iget-object v6, v1, Lqd/b;->c:Lpd/b;

    .line 237
    .line 238
    invoke-virtual {v6, v5}, Lpd/b;->j(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    invoke-virtual {v8, v5}, Lrd/a;->x(Lorg/json/JSONObject;)V

    .line 243
    .line 244
    .line 245
    invoke-interface {v7, v12}, Landroid/database/Cursor;->isNull(I)Z

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    if-eqz v5, :cond_5

    .line 250
    .line 251
    const/4 v5, 0x0

    .line 252
    goto :goto_7

    .line 253
    :cond_5
    invoke-interface {v7, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    :goto_7
    iget-object v6, v1, Lqd/b;->c:Lpd/b;

    .line 258
    .line 259
    invoke-virtual {v6, v5}, Lpd/b;->j(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    invoke-virtual {v8, v5}, Lrd/a;->E(Lorg/json/JSONObject;)V

    .line 264
    .line 265
    .line 266
    invoke-interface {v7, v13}, Landroid/database/Cursor;->isNull(I)Z

    .line 267
    .line 268
    .line 269
    move-result v5

    .line 270
    if-eqz v5, :cond_6

    .line 271
    .line 272
    const/4 v5, 0x0

    .line 273
    goto :goto_8

    .line 274
    :cond_6
    invoke-interface {v7, v13}, Landroid/database/Cursor;->getLong(I)J

    .line 275
    .line 276
    .line 277
    move-result-wide v5

    .line 278
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    :goto_8
    iget-object v6, v1, Lqd/b;->c:Lpd/b;

    .line 283
    .line 284
    invoke-virtual {v6, v5}, Lpd/b;->g(Ljava/lang/Long;)Ljava/util/Date;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    invoke-virtual {v8, v5}, Lrd/a;->u(Ljava/util/Date;)V

    .line 289
    .line 290
    .line 291
    invoke-interface {v7, v14}, Landroid/database/Cursor;->isNull(I)Z

    .line 292
    .line 293
    .line 294
    move-result v5

    .line 295
    if-eqz v5, :cond_7

    .line 296
    .line 297
    const/4 v5, 0x0

    .line 298
    invoke-virtual {v8, v5}, Lrd/a;->F(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    goto :goto_9

    .line 302
    :catchall_0
    move-exception v0

    .line 303
    goto :goto_e

    .line 304
    :cond_7
    invoke-interface {v7, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    invoke-virtual {v8, v5}, Lrd/a;->F(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    :goto_9
    invoke-interface {v7, v15}, Landroid/database/Cursor;->isNull(I)Z

    .line 312
    .line 313
    .line 314
    move-result v5

    .line 315
    if-eqz v5, :cond_8

    .line 316
    .line 317
    const/4 v5, 0x0

    .line 318
    invoke-virtual {v8, v5}, Lrd/a;->y([B)V

    .line 319
    .line 320
    .line 321
    goto :goto_a

    .line 322
    :cond_8
    invoke-interface {v7, v15}, Landroid/database/Cursor;->getBlob(I)[B

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    invoke-virtual {v8, v5}, Lrd/a;->y([B)V

    .line 327
    .line 328
    .line 329
    :goto_a
    invoke-interface {v7, v4}, Landroid/database/Cursor;->getInt(I)I

    .line 330
    .line 331
    .line 332
    move-result v5

    .line 333
    iget-object v6, v1, Lqd/b;->c:Lpd/b;

    .line 334
    .line 335
    invoke-virtual {v6, v5}, Lpd/b;->d(I)Lsd/a;

    .line 336
    .line 337
    .line 338
    move-result-object v5

    .line 339
    invoke-virtual {v8, v5}, Lrd/a;->z(Lsd/a;)V

    .line 340
    .line 341
    .line 342
    invoke-interface {v7, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 343
    .line 344
    .line 345
    move-result v5

    .line 346
    if-eqz v5, :cond_9

    .line 347
    .line 348
    const/4 v5, 0x0

    .line 349
    invoke-virtual {v8, v5}, Lrd/a;->w(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    :goto_b
    move/from16 v6, v18

    .line 353
    .line 354
    goto :goto_c

    .line 355
    :cond_9
    const/4 v5, 0x0

    .line 356
    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v6

    .line 360
    invoke-virtual {v8, v6}, Lrd/a;->w(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    goto :goto_b

    .line 364
    :goto_c
    invoke-interface {v7, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 365
    .line 366
    .line 367
    move-result v16

    .line 368
    if-eqz v16, :cond_a

    .line 369
    .line 370
    const/4 v5, 0x1

    .line 371
    goto :goto_d

    .line 372
    :cond_a
    const/4 v5, 0x0

    .line 373
    :goto_d
    invoke-virtual {v8, v5}, Lrd/a;->D(Z)V

    .line 374
    .line 375
    .line 376
    invoke-interface {v3, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 377
    .line 378
    .line 379
    move v5, v0

    .line 380
    move/from16 v18, v6

    .line 381
    .line 382
    move/from16 v8, v19

    .line 383
    .line 384
    move/from16 v0, v20

    .line 385
    .line 386
    goto/16 :goto_0

    .line 387
    .line 388
    :cond_b
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v17 .. v17}, LM3/t;->k()V

    .line 392
    .line 393
    .line 394
    return-object v3

    .line 395
    :catchall_1
    move-exception v0

    .line 396
    move-object/from16 v17, v3

    .line 397
    .line 398
    :goto_e
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v17 .. v17}, LM3/t;->k()V

    .line 402
    .line 403
    .line 404
    throw v0
.end method

.method protected j()Ljava/util/List;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, LM3/t;->i:LM3/t$a;

    .line 4
    .line 5
    const-string v2, "SELECT * FROM assets WHERE marked_for_deletion = 1;"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-virtual {v0, v2, v3}, LM3/t$a;->a(Ljava/lang/String;I)LM3/t;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iget-object v0, v1, Lqd/b;->a:LM3/q;

    .line 13
    .line 14
    invoke-virtual {v0}, LM3/q;->d()V

    .line 15
    .line 16
    .line 17
    iget-object v0, v1, Lqd/b;->a:LM3/q;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-static {v0, v2, v3, v4}, LO3/b;->b(LM3/q;LS3/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    :try_start_0
    const-string v0, "key"

    .line 25
    .line 26
    invoke-static {v5, v0}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const-string v6, "type"

    .line 31
    .line 32
    invoke-static {v5, v6}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    const-string v7, "id"

    .line 37
    .line 38
    invoke-static {v5, v7}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    const-string v8, "url"

    .line 43
    .line 44
    invoke-static {v5, v8}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    const-string v9, "headers"

    .line 49
    .line 50
    invoke-static {v5, v9}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    const-string v10, "extra_request_headers"

    .line 55
    .line 56
    invoke-static {v5, v10}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v10

    .line 60
    const-string v11, "metadata"

    .line 61
    .line 62
    invoke-static {v5, v11}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v11

    .line 66
    const-string v12, "download_time"

    .line 67
    .line 68
    invoke-static {v5, v12}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v12

    .line 72
    const-string v13, "relative_path"

    .line 73
    .line 74
    invoke-static {v5, v13}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    move-result v13

    .line 78
    const-string v14, "hash"

    .line 79
    .line 80
    invoke-static {v5, v14}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v14

    .line 84
    const-string v15, "hash_type"

    .line 85
    .line 86
    invoke-static {v5, v15}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    move-result v15

    .line 90
    const-string v3, "expected_hash"

    .line 91
    .line 92
    invoke-static {v5, v3}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    const-string v4, "marked_for_deletion"

    .line 97
    .line 98
    invoke-static {v5, v4}, LO3/a;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 102
    move-object/from16 v17, v2

    .line 103
    .line 104
    :try_start_1
    new-instance v2, Ljava/util/ArrayList;

    .line 105
    .line 106
    move/from16 v18, v4

    .line 107
    .line 108
    invoke-interface {v5}, Landroid/database/Cursor;->getCount()I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 113
    .line 114
    .line 115
    :goto_0
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-eqz v4, :cond_b

    .line 120
    .line 121
    invoke-interface {v5, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_0

    .line 126
    .line 127
    const/4 v4, 0x0

    .line 128
    goto :goto_1

    .line 129
    :cond_0
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    :goto_1
    invoke-interface {v5, v6}, Landroid/database/Cursor;->isNull(I)Z

    .line 134
    .line 135
    .line 136
    move-result v19

    .line 137
    if-eqz v19, :cond_1

    .line 138
    .line 139
    move/from16 v20, v0

    .line 140
    .line 141
    const/4 v0, 0x0

    .line 142
    :goto_2
    move/from16 v19, v6

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_1
    invoke-interface {v5, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v19

    .line 149
    move/from16 v20, v0

    .line 150
    .line 151
    move-object/from16 v0, v19

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :goto_3
    new-instance v6, Lrd/a;

    .line 155
    .line 156
    invoke-direct {v6, v4, v0}, Lrd/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    move-object v4, v2

    .line 160
    move v0, v3

    .line 161
    invoke-interface {v5, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 162
    .line 163
    .line 164
    move-result-wide v2

    .line 165
    invoke-virtual {v6, v2, v3}, Lrd/a;->B(J)V

    .line 166
    .line 167
    .line 168
    invoke-interface {v5, v8}, Landroid/database/Cursor;->isNull(I)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_2

    .line 173
    .line 174
    const/4 v2, 0x0

    .line 175
    goto :goto_4

    .line 176
    :cond_2
    invoke-interface {v5, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    :goto_4
    iget-object v3, v1, Lqd/b;->c:Lpd/b;

    .line 181
    .line 182
    invoke-virtual {v3, v2}, Lpd/b;->l(Ljava/lang/String;)Landroid/net/Uri;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-virtual {v6, v2}, Lrd/a;->K(Landroid/net/Uri;)V

    .line 187
    .line 188
    .line 189
    invoke-interface {v5, v9}, Landroid/database/Cursor;->isNull(I)Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    if-eqz v2, :cond_3

    .line 194
    .line 195
    const/4 v2, 0x0

    .line 196
    goto :goto_5

    .line 197
    :cond_3
    invoke-interface {v5, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    :goto_5
    iget-object v3, v1, Lqd/b;->c:Lpd/b;

    .line 202
    .line 203
    invoke-virtual {v3, v2}, Lpd/b;->j(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-virtual {v6, v2}, Lrd/a;->A(Lorg/json/JSONObject;)V

    .line 208
    .line 209
    .line 210
    invoke-interface {v5, v10}, Landroid/database/Cursor;->isNull(I)Z

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    if-eqz v2, :cond_4

    .line 215
    .line 216
    const/4 v2, 0x0

    .line 217
    goto :goto_6

    .line 218
    :cond_4
    invoke-interface {v5, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    :goto_6
    iget-object v3, v1, Lqd/b;->c:Lpd/b;

    .line 223
    .line 224
    invoke-virtual {v3, v2}, Lpd/b;->j(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-virtual {v6, v2}, Lrd/a;->x(Lorg/json/JSONObject;)V

    .line 229
    .line 230
    .line 231
    invoke-interface {v5, v11}, Landroid/database/Cursor;->isNull(I)Z

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    if-eqz v2, :cond_5

    .line 236
    .line 237
    const/4 v2, 0x0

    .line 238
    goto :goto_7

    .line 239
    :cond_5
    invoke-interface {v5, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    :goto_7
    iget-object v3, v1, Lqd/b;->c:Lpd/b;

    .line 244
    .line 245
    invoke-virtual {v3, v2}, Lpd/b;->j(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-virtual {v6, v2}, Lrd/a;->E(Lorg/json/JSONObject;)V

    .line 250
    .line 251
    .line 252
    invoke-interface {v5, v12}, Landroid/database/Cursor;->isNull(I)Z

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    if-eqz v2, :cond_6

    .line 257
    .line 258
    const/4 v2, 0x0

    .line 259
    goto :goto_8

    .line 260
    :cond_6
    invoke-interface {v5, v12}, Landroid/database/Cursor;->getLong(I)J

    .line 261
    .line 262
    .line 263
    move-result-wide v2

    .line 264
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    :goto_8
    iget-object v3, v1, Lqd/b;->c:Lpd/b;

    .line 269
    .line 270
    invoke-virtual {v3, v2}, Lpd/b;->g(Ljava/lang/Long;)Ljava/util/Date;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    invoke-virtual {v6, v2}, Lrd/a;->u(Ljava/util/Date;)V

    .line 275
    .line 276
    .line 277
    invoke-interface {v5, v13}, Landroid/database/Cursor;->isNull(I)Z

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    if-eqz v2, :cond_7

    .line 282
    .line 283
    const/4 v2, 0x0

    .line 284
    invoke-virtual {v6, v2}, Lrd/a;->F(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    goto :goto_9

    .line 288
    :catchall_0
    move-exception v0

    .line 289
    goto :goto_e

    .line 290
    :cond_7
    invoke-interface {v5, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    invoke-virtual {v6, v2}, Lrd/a;->F(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    :goto_9
    invoke-interface {v5, v14}, Landroid/database/Cursor;->isNull(I)Z

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    if-eqz v2, :cond_8

    .line 302
    .line 303
    const/4 v2, 0x0

    .line 304
    invoke-virtual {v6, v2}, Lrd/a;->y([B)V

    .line 305
    .line 306
    .line 307
    goto :goto_a

    .line 308
    :cond_8
    invoke-interface {v5, v14}, Landroid/database/Cursor;->getBlob(I)[B

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    invoke-virtual {v6, v2}, Lrd/a;->y([B)V

    .line 313
    .line 314
    .line 315
    :goto_a
    invoke-interface {v5, v15}, Landroid/database/Cursor;->getInt(I)I

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    iget-object v3, v1, Lqd/b;->c:Lpd/b;

    .line 320
    .line 321
    invoke-virtual {v3, v2}, Lpd/b;->d(I)Lsd/a;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    invoke-virtual {v6, v2}, Lrd/a;->z(Lsd/a;)V

    .line 326
    .line 327
    .line 328
    invoke-interface {v5, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    if-eqz v2, :cond_9

    .line 333
    .line 334
    const/4 v2, 0x0

    .line 335
    invoke-virtual {v6, v2}, Lrd/a;->w(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    :goto_b
    move/from16 v3, v18

    .line 339
    .line 340
    goto :goto_c

    .line 341
    :cond_9
    const/4 v2, 0x0

    .line 342
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    invoke-virtual {v6, v3}, Lrd/a;->w(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    goto :goto_b

    .line 350
    :goto_c
    invoke-interface {v5, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 351
    .line 352
    .line 353
    move-result v16

    .line 354
    if-eqz v16, :cond_a

    .line 355
    .line 356
    const/16 v16, 0x1

    .line 357
    .line 358
    move/from16 v2, v16

    .line 359
    .line 360
    goto :goto_d

    .line 361
    :cond_a
    const/4 v2, 0x0

    .line 362
    :goto_d
    invoke-virtual {v6, v2}, Lrd/a;->D(Z)V

    .line 363
    .line 364
    .line 365
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 366
    .line 367
    .line 368
    move/from16 v18, v3

    .line 369
    .line 370
    move-object v2, v4

    .line 371
    move/from16 v6, v19

    .line 372
    .line 373
    move v3, v0

    .line 374
    move/from16 v0, v20

    .line 375
    .line 376
    goto/16 :goto_0

    .line 377
    .line 378
    :cond_b
    move-object v4, v2

    .line 379
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v17 .. v17}, LM3/t;->k()V

    .line 383
    .line 384
    .line 385
    return-object v4

    .line 386
    :catchall_1
    move-exception v0

    .line 387
    move-object/from16 v17, v2

    .line 388
    .line 389
    :goto_e
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v17 .. v17}, LM3/t;->k()V

    .line 393
    .line 394
    .line 395
    throw v0
.end method

.method protected k()V
    .locals 3

    .line 1
    iget-object v0, p0, Lqd/b;->a:LM3/q;

    .line 2
    .line 3
    invoke-virtual {v0}, LM3/q;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqd/b;->g:LM3/w;

    .line 7
    .line 8
    invoke-virtual {v0}, LM3/w;->b()LS3/k;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :try_start_0
    iget-object v1, p0, Lqd/b;->a:LM3/q;

    .line 13
    .line 14
    invoke-virtual {v1}, LM3/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    :try_start_1
    invoke-interface {v0}, LS3/k;->Z()I

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lqd/b;->a:LM3/q;

    .line 21
    .line 22
    invoke-virtual {v1}, LM3/q;->B()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 23
    .line 24
    .line 25
    :try_start_2
    iget-object v1, p0, Lqd/b;->a:LM3/q;

    .line 26
    .line 27
    invoke-virtual {v1}, LM3/q;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lqd/b;->g:LM3/w;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, LM3/w;->h(LS3/k;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    goto :goto_0

    .line 38
    :catchall_1
    move-exception v1

    .line 39
    :try_start_3
    iget-object v2, p0, Lqd/b;->a:LM3/q;

    .line 40
    .line 41
    invoke-virtual {v2}, LM3/q;->i()V

    .line 42
    .line 43
    .line 44
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 45
    :goto_0
    iget-object v2, p0, Lqd/b;->g:LM3/w;

    .line 46
    .line 47
    invoke-virtual {v2, v0}, LM3/w;->h(LS3/k;)V

    .line 48
    .line 49
    .line 50
    throw v1
.end method

.method protected m(JLjava/util/UUID;)V
    .locals 2

    .line 1
    const-string v0, "updateId"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqd/b;->a:LM3/q;

    .line 7
    .line 8
    invoke-virtual {v0}, LM3/q;->d()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqd/b;->f:LM3/w;

    .line 12
    .line 13
    invoke-virtual {v0}, LM3/w;->b()LS3/k;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-interface {v0, v1, p1, p2}, LS3/i;->m1(IJ)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lqd/b;->c:Lpd/b;

    .line 22
    .line 23
    invoke-virtual {p1, p3}, Lpd/b;->n(Ljava/util/UUID;)[B

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 p2, 0x2

    .line 28
    invoke-interface {v0, p2, p1}, LS3/i;->p1(I[B)V

    .line 29
    .line 30
    .line 31
    :try_start_0
    iget-object p1, p0, Lqd/b;->a:LM3/q;

    .line 32
    .line 33
    invoke-virtual {p1}, LM3/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    :try_start_1
    invoke-interface {v0}, LS3/k;->Z()I

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lqd/b;->a:LM3/q;

    .line 40
    .line 41
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    .line 43
    .line 44
    :try_start_2
    iget-object p1, p0, Lqd/b;->a:LM3/q;

    .line 45
    .line 46
    invoke-virtual {p1}, LM3/q;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lqd/b;->f:LM3/w;

    .line 50
    .line 51
    invoke-virtual {p1, v0}, LM3/w;->h(LS3/k;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto :goto_0

    .line 57
    :catchall_1
    move-exception p1

    .line 58
    :try_start_3
    iget-object p2, p0, Lqd/b;->a:LM3/q;

    .line 59
    .line 60
    invoke-virtual {p2}, LM3/q;->i()V

    .line 61
    .line 62
    .line 63
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 64
    :goto_0
    iget-object p2, p0, Lqd/b;->f:LM3/w;

    .line 65
    .line 66
    invoke-virtual {p2, v0}, LM3/w;->h(LS3/k;)V

    .line 67
    .line 68
    .line 69
    throw p1
.end method

.method protected n()V
    .locals 3

    .line 1
    iget-object v0, p0, Lqd/b;->a:LM3/q;

    .line 2
    .line 3
    invoke-virtual {v0}, LM3/q;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqd/b;->j:LM3/w;

    .line 7
    .line 8
    invoke-virtual {v0}, LM3/w;->b()LS3/k;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :try_start_0
    iget-object v1, p0, Lqd/b;->a:LM3/q;

    .line 13
    .line 14
    invoke-virtual {v1}, LM3/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    :try_start_1
    invoke-interface {v0}, LS3/k;->Z()I

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lqd/b;->a:LM3/q;

    .line 21
    .line 22
    invoke-virtual {v1}, LM3/q;->B()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 23
    .line 24
    .line 25
    :try_start_2
    iget-object v1, p0, Lqd/b;->a:LM3/q;

    .line 26
    .line 27
    invoke-virtual {v1}, LM3/q;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lqd/b;->j:LM3/w;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, LM3/w;->h(LS3/k;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    goto :goto_0

    .line 38
    :catchall_1
    move-exception v1

    .line 39
    :try_start_3
    iget-object v2, p0, Lqd/b;->a:LM3/q;

    .line 40
    .line 41
    invoke-virtual {v2}, LM3/q;->i()V

    .line 42
    .line 43
    .line 44
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 45
    :goto_0
    iget-object v2, p0, Lqd/b;->j:LM3/w;

    .line 46
    .line 47
    invoke-virtual {v2, v0}, LM3/w;->h(LS3/k;)V

    .line 48
    .line 49
    .line 50
    throw v1
.end method

.method protected o()V
    .locals 3

    .line 1
    iget-object v0, p0, Lqd/b;->a:LM3/q;

    .line 2
    .line 3
    invoke-virtual {v0}, LM3/q;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqd/b;->h:LM3/w;

    .line 7
    .line 8
    invoke-virtual {v0}, LM3/w;->b()LS3/k;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :try_start_0
    iget-object v1, p0, Lqd/b;->a:LM3/q;

    .line 13
    .line 14
    invoke-virtual {v1}, LM3/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    :try_start_1
    invoke-interface {v0}, LS3/k;->Z()I

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lqd/b;->a:LM3/q;

    .line 21
    .line 22
    invoke-virtual {v1}, LM3/q;->B()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 23
    .line 24
    .line 25
    :try_start_2
    iget-object v1, p0, Lqd/b;->a:LM3/q;

    .line 26
    .line 27
    invoke-virtual {v1}, LM3/q;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lqd/b;->h:LM3/w;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, LM3/w;->h(LS3/k;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    goto :goto_0

    .line 38
    :catchall_1
    move-exception v1

    .line 39
    :try_start_3
    iget-object v2, p0, Lqd/b;->a:LM3/q;

    .line 40
    .line 41
    invoke-virtual {v2}, LM3/q;->i()V

    .line 42
    .line 43
    .line 44
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 45
    :goto_0
    iget-object v2, p0, Lqd/b;->h:LM3/w;

    .line 46
    .line 47
    invoke-virtual {v2, v0}, LM3/w;->h(LS3/k;)V

    .line 48
    .line 49
    .line 50
    throw v1
.end method

.method protected p()V
    .locals 3

    .line 1
    iget-object v0, p0, Lqd/b;->a:LM3/q;

    .line 2
    .line 3
    invoke-virtual {v0}, LM3/q;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqd/b;->i:LM3/w;

    .line 7
    .line 8
    invoke-virtual {v0}, LM3/w;->b()LS3/k;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :try_start_0
    iget-object v1, p0, Lqd/b;->a:LM3/q;

    .line 13
    .line 14
    invoke-virtual {v1}, LM3/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    :try_start_1
    invoke-interface {v0}, LS3/k;->Z()I

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lqd/b;->a:LM3/q;

    .line 21
    .line 22
    invoke-virtual {v1}, LM3/q;->B()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 23
    .line 24
    .line 25
    :try_start_2
    iget-object v1, p0, Lqd/b;->a:LM3/q;

    .line 26
    .line 27
    invoke-virtual {v1}, LM3/q;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lqd/b;->i:LM3/w;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, LM3/w;->h(LS3/k;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    goto :goto_0

    .line 38
    :catchall_1
    move-exception v1

    .line 39
    :try_start_3
    iget-object v2, p0, Lqd/b;->a:LM3/q;

    .line 40
    .line 41
    invoke-virtual {v2}, LM3/q;->i()V

    .line 42
    .line 43
    .line 44
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 45
    :goto_0
    iget-object v2, p0, Lqd/b;->i:LM3/w;

    .line 46
    .line 47
    invoke-virtual {v2, v0}, LM3/w;->h(LS3/k;)V

    .line 48
    .line 49
    .line 50
    throw v1
.end method

.method public q(Lrd/a;)V
    .locals 1

    .line 1
    const-string v0, "assetEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqd/b;->a:LM3/q;

    .line 7
    .line 8
    invoke-virtual {v0}, LM3/q;->d()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lqd/b;->a:LM3/q;

    .line 12
    .line 13
    invoke-virtual {v0}, LM3/q;->e()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v0, p0, Lqd/b;->e:LM3/h;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, LM3/h;->j(Ljava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lqd/b;->a:LM3/q;

    .line 22
    .line 23
    invoke-virtual {p1}, LM3/q;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lqd/b;->a:LM3/q;

    .line 27
    .line 28
    invoke-virtual {p1}, LM3/q;->i()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    iget-object v0, p0, Lqd/b;->a:LM3/q;

    .line 34
    .line 35
    invoke-virtual {v0}, LM3/q;->i()V

    .line 36
    .line 37
    .line 38
    throw p1
.end method
