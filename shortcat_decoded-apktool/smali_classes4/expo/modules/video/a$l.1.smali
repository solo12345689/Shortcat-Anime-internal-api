.class final Lexpo/modules/video/a$l;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/video/a;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Ljava/util/List;

.field final synthetic d:Lexpo/modules/video/a;

.field final synthetic e:Lexpo/modules/video/records/VideoThumbnailOptions;


# direct methods
.method constructor <init>(Ljava/util/List;Lexpo/modules/video/a;Lexpo/modules/video/records/VideoThumbnailOptions;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/a$l;->c:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/video/a$l;->d:Lexpo/modules/video/a;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/video/a$l;->e:Lexpo/modules/video/records/VideoThumbnailOptions;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Landroid/media/MediaMetadataRetriever;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/video/a$l;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lexpo/modules/video/a$l;

    .line 6
    .line 7
    sget-object p2, LTd/L;->a:LTd/L;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lexpo/modules/video/a$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 4

    .line 1
    new-instance v0, Lexpo/modules/video/a$l;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/video/a$l;->c:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/video/a$l;->d:Lexpo/modules/video/a;

    .line 6
    .line 7
    iget-object v3, p0, Lexpo/modules/video/a$l;->e:Lexpo/modules/video/records/VideoThumbnailOptions;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Lexpo/modules/video/a$l;-><init>(Ljava/util/List;Lexpo/modules/video/a;Lexpo/modules/video/records/VideoThumbnailOptions;LZd/e;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lexpo/modules/video/a$l;->b:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/media/MediaMetadataRetriever;

    .line 2
    .line 3
    check-cast p2, LZd/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lexpo/modules/video/a$l;->a(Landroid/media/MediaMetadataRetriever;LZd/e;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Lexpo/modules/video/a$l;->a:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v3, :cond_0

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v1

    .line 26
    :cond_1
    invoke-static/range {p1 .. p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, v0, Lexpo/modules/video/a$l;->b:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v5, v2

    .line 32
    check-cast v5, Landroid/media/MediaMetadataRetriever;

    .line 33
    .line 34
    iget-object v2, v0, Lexpo/modules/video/a$l;->c:Ljava/util/List;

    .line 35
    .line 36
    iget-object v10, v0, Lexpo/modules/video/a$l;->d:Lexpo/modules/video/a;

    .line 37
    .line 38
    iget-object v8, v0, Lexpo/modules/video/a$l;->e:Lexpo/modules/video/records/VideoThumbnailOptions;

    .line 39
    .line 40
    new-instance v11, Ljava/util/ArrayList;

    .line 41
    .line 42
    const/16 v4, 0xa

    .line 43
    .line 44
    invoke-static {v2, v4}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    invoke-direct {v11, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, LEf/a;

    .line 66
    .line 67
    invoke-virtual {v4}, LEf/a;->S()J

    .line 68
    .line 69
    .line 70
    move-result-wide v6

    .line 71
    invoke-virtual {v10}, Lgc/c;->i()LUb/d;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v4}, LUb/d;->o()LGf/O;

    .line 76
    .line 77
    .line 78
    move-result-object v12

    .line 79
    new-instance v15, Lexpo/modules/video/a$l$a;

    .line 80
    .line 81
    const/4 v9, 0x0

    .line 82
    move-object v4, v15

    .line 83
    invoke-direct/range {v4 .. v9}, Lexpo/modules/video/a$l$a;-><init>(Landroid/media/MediaMetadataRetriever;JLexpo/modules/video/records/VideoThumbnailOptions;LZd/e;)V

    .line 84
    .line 85
    .line 86
    const/16 v16, 0x3

    .line 87
    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    const/4 v13, 0x0

    .line 91
    const/4 v14, 0x0

    .line 92
    invoke-static/range {v12 .. v17}, LGf/i;->b(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/W;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-interface {v11, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    iput v3, v0, Lexpo/modules/video/a$l;->a:I

    .line 101
    .line 102
    invoke-static {v11, v0}, LGf/f;->a(Ljava/util/Collection;LZd/e;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    if-ne v2, v1, :cond_3

    .line 107
    .line 108
    return-object v1

    .line 109
    :cond_3
    return-object v2
.end method
